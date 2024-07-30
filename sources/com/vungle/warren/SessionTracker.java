package com.vungle.warren;

import android.util.Log;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionConstants;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.ListUtility;
import com.vungle.warren.utility.UtilityResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import m8.l;
import m8.n;
import m8.q;
import m8.r;

/* loaded from: classes2.dex */
public class SessionTracker {
    private static final int MAX_EVENTS_PER_REPORT = 40;
    private static final String TAG = "SessionTracker";
    private static SessionTracker _instance;
    private static long initTimestamp;
    private long appSessionTimeout;
    private int initCounter;
    private Repository repository;
    private SessionCallback sessionCallback;
    private ExecutorService sessionDataExecutor;
    private UtilityResource utilityResource;
    private VungleApiClient vungleApiClient;
    private boolean enabled = false;
    private final List<SessionData> pendingEvents = Collections.synchronizedList(new ArrayList());
    private final List<String> placementLoadTracker = new ArrayList();
    private final Map<String, SessionData> customVideoCacheMap = new HashMap();
    private int sendLimit = 40;
    private AtomicInteger eventCount = new AtomicInteger();
    public ActivityManager.LifeCycleCallback appLifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.warren.SessionTracker.3
        private long lastStoppedTimestamp;

        @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
        public void onStart() {
            if (this.lastStoppedTimestamp <= 0) {
                return;
            }
            long systemTimeMillis = SessionTracker.this.utilityResource.getSystemTimeMillis() - this.lastStoppedTimestamp;
            if (SessionTracker.this.getAppSessionTimeout() > -1 && systemTimeMillis > 0 && systemTimeMillis >= SessionTracker.this.getAppSessionTimeout() * 1000 && SessionTracker.this.sessionCallback != null) {
                SessionTracker.this.sessionCallback.onSessionTimeout();
            }
            SessionTracker.this.trackEvent(new SessionData.Builder().setEvent(SessionEvent.APP_FOREGROUND).build());
        }

        @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
        public void onStop() {
            SessionTracker.this.trackEvent(new SessionData.Builder().setEvent(SessionEvent.APP_BACKGROUND).build());
            this.lastStoppedTimestamp = SessionTracker.this.utilityResource.getSystemTimeMillis();
        }
    };

    /* loaded from: classes2.dex */
    public interface SessionCallback {
        void onSessionTimeout();
    }

    private SessionTracker() {
    }

    public static SessionTracker getInstance() {
        if (_instance == null) {
            _instance = new SessionTracker();
        }
        return _instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void sendData(List<SessionData> list) throws DatabaseHelper.DBException {
        if (this.enabled && !list.isEmpty()) {
            l lVar = new l();
            Iterator<SessionData> it = list.iterator();
            while (it.hasNext()) {
                n b10 = r.b(it.next().getAsJsonString());
                if (b10 instanceof q) {
                    lVar.o(b10.j());
                }
            }
            try {
                Response<q> execute = this.vungleApiClient.sendSessionDataAnalytics(lVar).execute();
                for (SessionData sessionData : list) {
                    if (!execute.isSuccessful() && sessionData.getSendAttempts() < this.sendLimit) {
                        sessionData.incrementSendAttempt();
                        this.repository.save(sessionData);
                    }
                    this.repository.delete(sessionData);
                }
            } catch (IOException e10) {
                Log.e(TAG, "Sending session analytics failed " + e10.getLocalizedMessage());
            }
            this.eventCount.set(0);
        }
    }

    private synchronized void storeEvent(final SessionData sessionData) {
        ExecutorService executorService = this.sessionDataExecutor;
        if (executorService == null) {
            return;
        }
        executorService.submit(new Runnable() { // from class: com.vungle.warren.SessionTracker.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (SessionTracker.this.repository != null && sessionData != null) {
                        SessionTracker.this.repository.save(sessionData);
                        SessionTracker.this.eventCount.incrementAndGet();
                        Log.d(SessionTracker.TAG, "Session Count: " + SessionTracker.this.eventCount + " " + sessionData.sessionEvent);
                        if (SessionTracker.this.eventCount.get() >= SessionTracker.this.sendLimit) {
                            SessionTracker sessionTracker = SessionTracker.this;
                            sessionTracker.sendData((List) sessionTracker.repository.loadAll(SessionData.class).get());
                            Log.d(SessionTracker.TAG, "SendData " + SessionTracker.this.eventCount);
                        }
                    }
                } catch (DatabaseHelper.DBException unused) {
                    VungleLogger.error(SessionTracker.TAG, "Could not save event to DB");
                }
            }
        });
    }

    public void clearTracking() {
        this.pendingEvents.clear();
    }

    public long getAppSessionTimeout() {
        return this.appSessionTimeout;
    }

    public long getInitTimestamp() {
        return initTimestamp;
    }

    public String getOrientation(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return "none";
                    }
                    return "match_video";
                }
                return "auto_rotate";
            }
            return "landscape";
        }
        return "portrait";
    }

    public int getSendLimit() {
        return this.sendLimit;
    }

    public synchronized boolean handleCustomRules(SessionData sessionData) {
        SessionEvent sessionEvent = SessionEvent.INIT;
        SessionEvent sessionEvent2 = sessionData.sessionEvent;
        if (sessionEvent == sessionEvent2) {
            this.initCounter++;
            return false;
        }
        if (SessionEvent.INIT_END == sessionEvent2) {
            int i10 = this.initCounter;
            if (i10 <= 0) {
                return true;
            }
            this.initCounter = i10 - 1;
            return false;
        }
        if (SessionEvent.LOAD_AD == sessionEvent2) {
            this.placementLoadTracker.add(sessionData.getStringAttribute(SessionAttribute.PLACEMENT_ID));
            return false;
        }
        if (SessionEvent.LOAD_AD_END == sessionEvent2) {
            List<String> list = this.placementLoadTracker;
            SessionAttribute sessionAttribute = SessionAttribute.PLACEMENT_ID;
            if (!list.contains(sessionData.getStringAttribute(sessionAttribute))) {
                return true;
            }
            this.placementLoadTracker.remove(sessionData.getStringAttribute(sessionAttribute));
            return false;
        }
        if (SessionEvent.ADS_CACHED != sessionEvent2) {
            return false;
        }
        if (sessionData.getStringAttribute(SessionAttribute.VIDEO_CACHED) == null) {
            this.customVideoCacheMap.put(sessionData.getStringAttribute(SessionAttribute.URL), sessionData);
            return true;
        }
        Map<String, SessionData> map = this.customVideoCacheMap;
        SessionAttribute sessionAttribute2 = SessionAttribute.URL;
        SessionData sessionData2 = map.get(sessionData.getStringAttribute(sessionAttribute2));
        if (sessionData2 != null) {
            this.customVideoCacheMap.remove(sessionData.getStringAttribute(sessionAttribute2));
            sessionData.removeEvent(sessionAttribute2);
            SessionAttribute sessionAttribute3 = SessionAttribute.EVENT_ID;
            sessionData.addAttribute(sessionAttribute3, sessionData2.getStringAttribute(sessionAttribute3));
            return false;
        }
        return !sessionData.getStringAttribute(r0).equals(SessionConstants.NONE);
    }

    public void init(SessionCallback sessionCallback, UtilityResource utilityResource, final Repository repository, ExecutorService executorService, VungleApiClient vungleApiClient, final boolean z10, int i10) {
        this.sessionCallback = sessionCallback;
        this.utilityResource = utilityResource;
        this.sessionDataExecutor = executorService;
        this.repository = repository;
        this.enabled = z10;
        this.vungleApiClient = vungleApiClient;
        if (i10 <= 0) {
            i10 = 40;
        }
        this.sendLimit = i10;
        if (!z10) {
            clearTracking();
        } else {
            executorService.submit(new Runnable() { // from class: com.vungle.warren.SessionTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!SessionTracker.this.pendingEvents.isEmpty() && z10) {
                        Iterator it = SessionTracker.this.pendingEvents.iterator();
                        while (it.hasNext()) {
                            SessionTracker.this.trackEvent((SessionData) it.next());
                        }
                    }
                    SessionTracker.this.pendingEvents.clear();
                    for (List list : ListUtility.partition((List) repository.loadAll(SessionData.class).get(), SessionTracker.this.sendLimit)) {
                        if (list.size() >= SessionTracker.this.sendLimit) {
                            try {
                                SessionTracker.this.sendData(list);
                            } catch (DatabaseHelper.DBException e10) {
                                Log.e(SessionTracker.TAG, "Unable to retrieve data to send " + e10.getLocalizedMessage());
                            }
                        } else {
                            SessionTracker.this.eventCount.set(list.size());
                        }
                    }
                }
            });
        }
    }

    public void observe() {
        ActivityManager.getInstance().addListener(this.appLifeCycleCallback);
    }

    public void setAppSessionTimeout(long j10) {
        this.appSessionTimeout = j10;
    }

    public void setInitTimestamp(long j10) {
        initTimestamp = j10;
    }

    public void trackAdConfig(BannerAdConfig bannerAdConfig) {
        if (bannerAdConfig == null || !bannerAdConfig.muteChangedByApi) {
            return;
        }
        trackEvent(new SessionData.Builder().setEvent(SessionEvent.MUTE).addData(SessionAttribute.MUTED, (bannerAdConfig.getSettings() & 1) == 1).build());
    }

    public synchronized void trackEvent(SessionData sessionData) {
        if (sessionData == null) {
            return;
        }
        if (!this.enabled) {
            this.pendingEvents.add(sessionData);
        } else {
            if (!handleCustomRules(sessionData)) {
                storeEvent(sessionData);
            }
        }
    }

    public void trackAdConfig(AdConfig adConfig) {
        if (adConfig != null && adConfig.muteChangedByApi) {
            trackEvent(new SessionData.Builder().setEvent(SessionEvent.MUTE).addData(SessionAttribute.MUTED, (adConfig.getSettings() & 1) == 1).build());
        }
        if (adConfig == null || !adConfig.orientationChangedByApi) {
            return;
        }
        trackEvent(new SessionData.Builder().setEvent(SessionEvent.ORIENTATION).addData(SessionAttribute.ORIENTATION, getOrientation(adConfig.getAdOrientation())).build());
    }
}
