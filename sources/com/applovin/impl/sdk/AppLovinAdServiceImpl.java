package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {

    /* renamed from: a, reason: collision with root package name */
    private final p f18397a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18398b;

    /* renamed from: d, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, b> f18400d;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f18399c = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private final Object f18401e = new Object();
    private final Map<String, String> f = CollectionUtils.map();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<JSONObject> f18402g = new AtomicReference<>();

    /* loaded from: classes.dex */
    public class a implements com.applovin.impl.sdk.ad.i {

        /* renamed from: b, reason: collision with root package name */
        private final b f18423b;

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            com.applovin.impl.sdk.ad.d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
                AppLovinAdServiceImpl.this.f18397a.U().a(appLovinAdImpl);
                appLovinAd = new com.applovin.impl.sdk.ad.f(adZone, AppLovinAdServiceImpl.this.f18397a);
            }
            synchronized (this.f18423b.f18424a) {
                hashSet = new HashSet(this.f18423b.f18426c);
                this.f18423b.f18426c.clear();
                this.f18423b.f18425b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            HashSet hashSet;
            synchronized (this.f18423b.f18424a) {
                hashSet = new HashSet(this.f18423b.f18426c);
                this.f18423b.f18426c.clear();
                this.f18423b.f18425b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(i10, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.impl.sdk.ad.i
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            HashSet hashSet;
            synchronized (this.f18423b.f18424a) {
                hashSet = new HashSet(this.f18423b.f18426c);
                this.f18423b.f18426c.clear();
                this.f18423b.f18425b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdLoadListener appLovinAdLoadListener = (AppLovinAdLoadListener) it.next();
                if (!(appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i)) {
                    AppLovinAdServiceImpl.this.a(appLovinError.getCode(), appLovinAdLoadListener);
                } else {
                    AppLovinAdServiceImpl.this.b(appLovinError, appLovinAdLoadListener);
                }
            }
        }

        private a(b bVar) {
            this.f18423b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f18424a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18425b;

        /* renamed from: c, reason: collision with root package name */
        final Collection<AppLovinAdLoadListener> f18426c;

        private b() {
            this.f18424a = new Object();
            this.f18426c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f18425b + ", pendingAdListeners=" + this.f18426c + '}';
        }
    }

    public AppLovinAdServiceImpl(p pVar) {
        this.f18397a = pVar;
        this.f18398b = pVar.L();
        Map<com.applovin.impl.sdk.ad.d, b> map = CollectionUtils.map(6);
        this.f18400d = map;
        map.put(com.applovin.impl.sdk.ad.d.g(), new b());
        map.put(com.applovin.impl.sdk.ad.d.h(), new b());
        map.put(com.applovin.impl.sdk.ad.d.i(), new b());
        map.put(com.applovin.impl.sdk.ad.d.j(), new b());
        map.put(com.applovin.impl.sdk.ad.d.k(), new b());
        map.put(com.applovin.impl.sdk.ad.d.l(), new b());
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f) {
            this.f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl b10 = this.f18397a.U().b(dVar);
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Dequeued ad: " + b10 + " for zone: " + dVar + "...");
        }
        return b10;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f18402g.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f) {
            map = CollectionUtils.map(this.f);
            this.f.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        String a10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (this.f18397a.S() != null) {
            a10 = this.f18397a.S().a();
        } else {
            a10 = this.f18397a.R().a();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return a10;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String str2;
        if (str != null) {
            str2 = str.trim();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            y.i("AppLovinAdService", "Empty ad token");
            a(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(str2, this.f18397a);
        if (cVar.b() == c.a.REGULAR) {
            if (y.a()) {
                this.f18398b.b("AppLovinAdService", "Loading next ad for token: " + cVar);
            }
            a(new com.applovin.impl.sdk.e.l(cVar, appLovinAdLoadListener, this.f18397a));
            return;
        }
        if (cVar.b() == c.a.AD_RESPONSE_JSON) {
            JSONObject d10 = cVar.d();
            if (d10 != null) {
                com.applovin.impl.sdk.utils.i.f(d10, this.f18397a);
                com.applovin.impl.sdk.utils.i.d(d10, this.f18397a);
                com.applovin.impl.sdk.utils.i.c(d10, this.f18397a);
                com.applovin.impl.sdk.utils.i.e(d10, this.f18397a);
                h.a(this.f18397a);
                if (JsonUtils.getJSONArray(d10, com.anythink.expressad.foundation.d.d.f9543h, new JSONArray()).length() > 0) {
                    if (y.a()) {
                        this.f18398b.b("AppLovinAdService", "Rendering ad for token: " + cVar);
                    }
                    a(new com.applovin.impl.sdk.e.p(d10, Utils.getZone(d10, this.f18397a), com.applovin.impl.sdk.ad.b.DECODED_AD_TOKEN_JSON, appLovinAdLoadListener, this.f18397a));
                    return;
                }
                if (y.a()) {
                    this.f18398b.e("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                }
                a(AppLovinError.NO_FILL, appLovinAdLoadListener);
                return;
            }
            String str3 = "Unable to retrieve ad response JSON from token: " + cVar.a();
            AppLovinError appLovinError = new AppLovinError(-8, str3);
            y.i("AppLovinAdService", str3);
            a(appLovinError, appLovinAdLoadListener);
            return;
        }
        AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
        y.i("AppLovinAdService", "Invalid token type");
        a(appLovinError2, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (y.a()) {
                this.f18398b.b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
            }
            a(com.applovin.impl.sdk.ad.d.a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings != null && !removeTrimmedEmptyStrings.isEmpty()) {
            if (y.a()) {
                this.f18398b.b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
            }
            a(new com.applovin.impl.sdk.e.j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.f18397a));
            return;
        }
        y.i("AppLovinAdService", "No zones were provided");
        a(-7, appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.sdk.d.a> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<com.applovin.impl.sdk.d.a> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f18402g.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f18400d + '}';
    }

    public void trackAndLaunchClick(final com.applovin.impl.sdk.ad.e eVar, final AppLovinAdView appLovinAdView, final com.applovin.impl.adview.b bVar, final Uri uri, PointF pointF, boolean z10) {
        if (eVar == null) {
            if (y.a()) {
                this.f18398b.e("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z10));
        if (appLovinAdView != null && uri != null) {
            if (eVar.isDirectDownloadEnabled()) {
                this.f18397a.ai().startDirectInstallOrDownloadProcess(eVar, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.5
                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onAppDetailsDismissed() {
                        if (bVar != null) {
                            AppLovinAdServiceImpl.this.f18397a.Y().resumeForClick();
                            com.applovin.impl.sdk.utils.k.b(bVar.g(), eVar, appLovinAdView);
                        }
                    }

                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onAppDetailsDisplayed() {
                        AppLovinAdServiceImpl.this.f18397a.Y().pauseForClick();
                        com.applovin.impl.adview.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.o();
                            com.applovin.impl.sdk.utils.k.a(bVar.g(), eVar, appLovinAdView);
                        }
                    }

                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onFailure() {
                        AppLovinAdServiceImpl.this.a(uri, eVar, appLovinAdView, bVar);
                    }
                });
                return;
            }
            if (a(uri.getScheme())) {
                a(uri, eVar, bVar, (com.applovin.impl.adview.activity.b.a) null);
                return;
            } else if (Utils.isDeepLinkPlusUrl(uri)) {
                a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f18397a);
                return;
            } else {
                a(uri, eVar, appLovinAdView, bVar);
                return;
            }
        }
        if (y.a()) {
            this.f18398b.e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.e eVar, final Uri uri, PointF pointF, com.applovin.impl.adview.activity.b.a aVar, final Context context) {
        if (eVar == null) {
            if (y.a()) {
                this.f18398b.e("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF));
        if (eVar.isDirectDownloadEnabled()) {
            this.f18397a.ai().startDirectInstallOrDownloadProcess(eVar, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.4
                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDismissed() {
                    AppLovinAdServiceImpl.this.f18397a.Y().resumeForClick();
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDisplayed() {
                    AppLovinAdServiceImpl.this.f18397a.Y().pauseForClick();
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onFailure() {
                    Utils.openUri(context, uri, AppLovinAdServiceImpl.this.f18397a);
                }
            });
            return;
        }
        if (a(uri.getScheme())) {
            a(uri, eVar, (com.applovin.impl.adview.b) null, aVar);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, (AppLovinAdView) null, (com.applovin.impl.adview.b) null, context, this.f18397a);
        } else {
            Utils.openUri(context, uri, this.f18397a);
        }
    }

    public void trackAppKilled(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (y.a()) {
                this.f18398b.e("AppLovinAdService", "Unable to track app killed. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Tracking app killed during ad...");
        }
        List<com.applovin.impl.sdk.d.a> as = eVar.as();
        if (as != null && !as.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : as) {
                a(new com.applovin.impl.sdk.d.a(aVar.a(), aVar.b()));
            }
            return;
        }
        if (y.a()) {
            this.f18398b.d("AppLovinAdService", "Unable to track app killed during AD #" + eVar.getAdIdNumber() + ". Missing app killed tracking URL.");
        }
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.e eVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (eVar == null) {
            if (y.a()) {
                this.f18398b.e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.sdk.d.a> ar = eVar.ar();
        if (ar != null && !ar.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : ar) {
                String a10 = a(aVar.a(), j10, j11, list, z10, i10);
                String a11 = a(aVar.b(), j10, j11, list, z10, i10);
                if (StringUtils.isValidString(a10)) {
                    a(new com.applovin.impl.sdk.d.a(a10, a11));
                } else if (y.a()) {
                    this.f18398b.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
                }
            }
            return;
        }
        if (y.a()) {
            this.f18398b.d("AppLovinAdService", "Unable to track ad closed for AD #" + eVar.getAdIdNumber() + ". Missing ad close tracking URL." + eVar.getAdIdNumber());
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (y.a()) {
                this.f18398b.e("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (y.a()) {
                this.f18398b.b("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.at());
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.e eVar, long j10, int i10, boolean z10) {
        if (eVar == null) {
            if (y.a()) {
                this.f18398b.e("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.sdk.d.a> aq = eVar.aq();
        if (aq != null && !aq.isEmpty()) {
            String l10 = Long.toString(System.currentTimeMillis());
            for (com.applovin.impl.sdk.d.a aVar : aq) {
                if (StringUtils.isValidString(aVar.a())) {
                    String a10 = a(aVar.a(), j10, i10, l10, z10);
                    String a11 = a(aVar.b(), j10, i10, l10, z10);
                    if (a10 != null) {
                        a(new com.applovin.impl.sdk.d.a(a10, a11));
                    } else if (y.a()) {
                        this.f18398b.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
                    }
                } else if (y.a()) {
                    this.f18398b.d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                }
            }
            return;
        }
        if (y.a()) {
            this.f18398b.d("AppLovinAdService", "Unable to submit persistent postback for AD #" + eVar.getAdIdNumber() + ". Missing video end tracking URL.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f18399c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdLoadListener appLovinAdLoadListener2 = appLovinAdLoadListener;
                    if (appLovinAdLoadListener2 instanceof com.applovin.impl.sdk.ad.i) {
                        ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener2).failedToReceiveAdV2(appLovinError);
                    } else {
                        appLovinAdLoadListener2.failedToReceiveAd(appLovinError.getCode());
                    }
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private List<Uri> b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable unused) {
                this.f18397a.L();
                if (y.a()) {
                    this.f18397a.L().d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f18397a.L();
            if (y.a()) {
                this.f18397a.L().b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
            }
            b a10 = a(dVar);
            synchronized (a10.f18424a) {
                a10.f18426c.add(appLovinAdLoadListener);
                if (!a10.f18425b) {
                    a10.f18425b = true;
                    a(dVar, new a(a10));
                } else if (y.a()) {
                    this.f18398b.b("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(com.applovin.impl.sdk.e.a aVar) {
        if (!this.f18397a.d()) {
            y.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f18397a.a();
        this.f18397a.M().a(aVar, o.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f18399c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                }
            }
        });
    }

    private void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f18399c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdLoadListener appLovinAdLoadListener2 = appLovinAdLoadListener;
                    if (appLovinAdLoadListener2 instanceof com.applovin.impl.sdk.ad.i) {
                        ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener2).failedToReceiveAdV2(new AppLovinError(i10, ""));
                    } else {
                        appLovinAdLoadListener2.failedToReceiveAd(i10);
                    }
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th) {
            if (y.a()) {
                this.f18398b.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f18397a)) {
            com.applovin.impl.sdk.utils.k.c(bVar.g(), eVar, appLovinAdView);
        }
        bVar.o();
    }

    private boolean a(String str) {
        String str2 = this.f18397a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.FORWARDING_CLICK_SCHEME);
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.adview.b bVar, final com.applovin.impl.adview.activity.b.a aVar) {
        if (y.a()) {
            this.f18398b.b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f18397a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.CLOSE_AD_ON_FORWARDING_CLICK_SCHEME);
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.f18399c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aVar != null) {
                            y unused = AppLovinAdServiceImpl.this.f18398b;
                            if (y.a()) {
                                AppLovinAdServiceImpl.this.f18398b.b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.h();
                        }
                    }
                });
            } else {
                if (bVar == null || Utils.isBML(eVar.getSize())) {
                    return;
                }
                if (y.a()) {
                    this.f18398b.b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.l();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, p pVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri a10 = a(uri, "primaryUrl");
            List<Uri> b10 = b(uri, "primaryTrackingUrl");
            Uri a11 = a(uri, "fallbackUrl");
            List<Uri> b11 = b(uri, "fallbackTrackingUrl");
            if (a10 == null && a11 == null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(a10, "primary", b10, eVar, appLovinAdView, bVar, context, pVar)) {
                a(a11, "backup", b11, eVar, appLovinAdView, bVar, context, pVar);
            }
            if (bVar != null) {
                bVar.o();
                return;
            }
            return;
        }
        pVar.L();
        if (y.a()) {
            pVar.L().e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List<Uri> list, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, p pVar) {
        pVar.L();
        if (y.a()) {
            pVar.L().b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean openUri = Utils.openUri(context, uri, pVar);
        if (openUri) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                pVar.ak().dispatchPostbackAsync(it.next().toString(), null);
            }
            if (bVar != null) {
                com.applovin.impl.sdk.utils.k.c(bVar.g(), eVar, appLovinAdView);
            }
        } else {
            pVar.L();
            if (y.a()) {
                pVar.L().e("AppLovinAdService", "URL failed to open");
            }
        }
        return openUri;
    }

    private Uri a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            this.f18397a.L();
            if (!y.a()) {
                return null;
            }
            this.f18397a.L().d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            return null;
        }
    }

    private String a(String str, long j10, long j11, List<Long> list, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i10 != k.f18988a) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(k.a(i10)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a(com.applovin.impl.sdk.d.a aVar) {
        if (StringUtils.isValidString(aVar.a())) {
            this.f18397a.al().a(com.applovin.impl.sdk.network.j.o().c(aVar.a()).d(StringUtils.isValidString(aVar.b()) ? aVar.b() : null).b(aVar.c()).a(false).d(aVar.d()).a());
        } else if (y.a()) {
            this.f18398b.d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, a aVar) {
        AppLovinAdImpl a10 = this.f18397a.U().a(dVar);
        if (a10 != null) {
            if (y.a()) {
                this.f18398b.b("AppLovinAdService", "Using pre-loaded ad: " + a10 + " for " + dVar);
            }
            aVar.adReceived(a10);
            return;
        }
        a(new com.applovin.impl.sdk.e.k(dVar, aVar, this.f18397a));
    }

    private b a(com.applovin.impl.sdk.ad.d dVar) {
        b bVar;
        synchronized (this.f18401e) {
            bVar = this.f18400d.get(dVar);
            if (bVar == null) {
                bVar = new b();
                this.f18400d.put(dVar, bVar);
            }
        }
        return bVar;
    }
}
