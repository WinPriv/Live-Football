package com.vungle.warren.tasks;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdLoader;
import com.vungle.warren.AdRequest;
import com.vungle.warren.CacheBustManager;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import m8.i;
import m8.n;
import m8.q;

/* loaded from: classes2.dex */
public class CacheBustJob implements Job {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final String TAG = "com.vungle.warren.tasks.CacheBustJob";
    private final AdLoader adLoader;
    private final VungleApiClient client;
    private final Repository repository;

    public CacheBustJob(VungleApiClient vungleApiClient, Repository repository, AdLoader adLoader) {
        this.client = vungleApiClient;
        this.repository = repository;
        this.adLoader = adLoader;
    }

    private void bustAd(Advertisement advertisement, CacheBust cacheBust) {
        try {
            Log.d(TAG, "bustAd: deleting " + advertisement.getId());
            this.adLoader.dropCache(advertisement.getId());
            this.repository.deleteAdvertisement(advertisement.getId());
            Repository repository = this.repository;
            Placement placement = (Placement) repository.load(repository.getPlacementIdByAd(advertisement), Placement.class).get();
            if (placement != null) {
                new AdConfig().setAdSize(placement.getAdSize());
                if (placement.isMultipleHBPEnabled()) {
                    this.adLoader.loadEndlessIfNeeded(placement, placement.getAdSize(), 0L, false);
                } else if (placement.isAutoCached()) {
                    this.adLoader.load(new AdLoader.Operation(new AdRequest(placement.getId(), false), placement.getAdSize(), 0L, 2000L, 5, 1, 0, false, placement.getAutoCachePriority(), new LoadAdCallback[0]));
                }
            }
            cacheBust.setTimestampProcessed(System.currentTimeMillis());
            this.repository.save(cacheBust);
        } catch (DatabaseHelper.DBException e10) {
            Log.e(TAG, "bustAd: cannot drop cache or delete advertisement for " + advertisement, e10);
        }
    }

    public static JobInfo makeJobInfo() {
        return new JobInfo(TAG).setPriority(0).setUpdateCurrent(true);
    }

    private void parseAndSaveCacheBust(q qVar, String str, int i10, String str2, List<CacheBust> list, i iVar) {
        if (qVar.v(str)) {
            Iterator<n> it = qVar.t(str).iterator();
            while (it.hasNext()) {
                CacheBust cacheBust = (CacheBust) iVar.e(it.next(), CacheBust.class);
                cacheBust.setTimeWindowEnd(cacheBust.getTimeWindowEnd() * 1000);
                cacheBust.setIdType(i10);
                list.add(cacheBust);
                try {
                    this.repository.save(cacheBust);
                } catch (DatabaseHelper.DBException unused) {
                    VungleLogger.error("CacheBustJob#onRunJob", str2 + cacheBust);
                }
            }
        }
    }

    private void processBust(Iterable<CacheBust> iterable) {
        List<Advertisement> adsByCreative;
        for (CacheBust cacheBust : iterable) {
            if (cacheBust.getIdType() == 1) {
                adsByCreative = this.repository.getAdsByCampaign(cacheBust.getId());
            } else {
                adsByCreative = this.repository.getAdsByCreative(cacheBust.getId());
            }
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (Advertisement advertisement : adsByCreative) {
                if (advertisement.getServerRequestTimestamp() < cacheBust.getTimeWindowEnd() && shouldAdBeBusted(advertisement)) {
                    linkedList.add(advertisement.getId());
                    linkedList2.add(advertisement);
                }
            }
            if (linkedList.isEmpty()) {
                Log.d(TAG, "processBust: bust has no relevant ads, deleting " + cacheBust);
                try {
                    this.repository.delete(cacheBust);
                } catch (DatabaseHelper.DBException e10) {
                    VungleLogger.error("CacheBustJob#processBust", "Cannot delete obsolete bust " + cacheBust + " because of " + e10);
                }
            } else {
                cacheBust.setEventIds((String[]) linkedList.toArray(EMPTY_STRING_ARRAY));
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    bustAd((Advertisement) it.next(), cacheBust);
                }
            }
        }
    }

    private void sendAnalytics() {
        List<CacheBust> list = (List) this.repository.loadAll(CacheBust.class).get();
        if (list != null && list.size() != 0) {
            LinkedList linkedList = new LinkedList();
            for (CacheBust cacheBust : list) {
                if (cacheBust.getTimestampProcessed() != 0) {
                    linkedList.add(cacheBust);
                }
            }
            if (linkedList.isEmpty()) {
                Log.d(TAG, "sendAnalytics: no cachebusts to send analytics");
                return;
            }
            try {
                Response<q> execute = this.client.sendAnalytics(linkedList).execute();
                if (execute.isSuccessful()) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        try {
                            this.repository.delete((CacheBust) it.next());
                        } catch (DatabaseHelper.DBException unused) {
                            VungleLogger.error("CacheBustManager#sendAnalytics", "can't delete bust \" + cacheBust");
                        }
                    }
                    return;
                }
                Log.e(TAG, "sendAnalytics: not successful, aborting, response is " + execute);
                return;
            } catch (IOException e10) {
                Log.e(TAG, "sendAnalytics: can't execute API call", e10);
                return;
            }
        }
        Log.d(TAG, "sendAnalytics: no cachebusts in repository");
    }

    private boolean shouldAdBeBusted(Advertisement advertisement) {
        if (advertisement.getState() != 2 && advertisement.getState() != 3) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.warren.tasks.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        Repository repository;
        String str = TAG;
        Log.i(str, "CacheBustJob started");
        if (this.client != null && (repository = this.repository) != null) {
            try {
                Cookie cookie = (Cookie) repository.load(Cookie.CACHE_BUST_COOKIE, Cookie.class).get();
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CACHE_BUST_COOKIE);
                }
                Cookie cookie2 = cookie;
                Response<q> execute = this.client.cacheBust(cookie2.getLong(Cookie.LAST_CACHE_BUST).longValue()).execute();
                ArrayList arrayList = new ArrayList();
                List<CacheBust> unProcessedBusts = this.repository.getUnProcessedBusts();
                if (unProcessedBusts != null && !unProcessedBusts.isEmpty()) {
                    arrayList.addAll(unProcessedBusts);
                }
                i iVar = new i();
                if (execute.isSuccessful()) {
                    q body = execute.body();
                    if (body != null && body.v(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME)) {
                        q u2 = body.u(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME);
                        if (u2.v("last_updated") && u2.s("last_updated").l() > 0) {
                            cookie2.putValue(Cookie.LAST_CACHE_BUST, Long.valueOf(u2.s("last_updated").l()));
                            this.repository.save(cookie2);
                        }
                        parseAndSaveCacheBust(u2, "campaign_ids", 1, "cannot save campaignBust=", arrayList, iVar);
                        parseAndSaveCacheBust(u2, "creative_ids", 2, "cannot save creativeBust=", arrayList, iVar);
                    }
                    Log.e(str, "CacheBustJob finished - no jsonObject or cache_bust in it");
                    return 1;
                }
                processBust(arrayList);
                updateTimerData(bundle, cookie2);
                sendAnalytics();
                Log.d(str, "CacheBustJob finished");
                return 2;
            } catch (DatabaseHelper.DBException e10) {
                Log.e(TAG, "CacheBustJob failed - DBException", e10);
                return 2;
            } catch (IOException e11) {
                Log.e(TAG, "CacheBustJob failed - IOException", e11);
                return 2;
            }
        }
        Log.e(str, "CacheBustJob finished - no client or repository");
        return 1;
    }

    public void updateTimerData(Bundle bundle, Cookie cookie) throws DatabaseHelper.DBException {
        long j10 = bundle.getLong(CacheBustManager.CACHE_BUST_INTERVAL);
        if (j10 != 0) {
            cookie.putValue(CacheBustManager.NEXT_CACHE_BUST, Long.valueOf(SystemClock.elapsedRealtime() + j10));
        }
        this.repository.save(cookie);
    }
}
