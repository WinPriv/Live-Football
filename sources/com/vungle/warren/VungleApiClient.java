package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.anythink.core.common.b.g;
import com.anythink.expressad.foundation.d.d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.warren.PrivacyManager;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.network.APIFactory;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.VungleApi;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import m0.a;
import m8.l;
import m8.n;
import m8.q;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.b;
import okio.c;
import okio.j;
import okio.t;
import s.f;

/* loaded from: classes2.dex */
public class VungleApiClient {
    private static final String AMAZON_ADVERTISING_ID = "amazon_advertising_id";
    public static final String ANDROID_ID = "android_id";
    private static String BASE_URL = null;
    public static final String GAID = "gaid";
    private static final String ID = "id";
    public static final String IFA = "ifa";
    private static final String TAG = "com.vungle.warren.VungleApiClient";
    protected static WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static Set<Interceptor> logInterceptors;
    private static Set<Interceptor> networkInterceptors;
    private VungleApi api;
    private q appBody;
    private q baseDeviceInfo;
    private String biLoggingEndpoint;
    private String cacheBustEndpoint;
    private CacheManager cacheManager;
    private OkHttpClient client;
    private Context context;
    private boolean enableOm;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private String logEndpoint;
    private String newEndpoint;
    private final OMInjector omInjector;
    private final Platform platform;
    private String reportAdEndpoint;
    private Repository repository;
    private String requestAdEndpoint;
    private String riEndpoint;
    private VungleApi timeoutApi;
    private TimeoutProvider timeoutProvider;
    private boolean willPlayAdEnabled;
    private String willPlayAdEndpoint;
    private int willPlayAdTimeout;
    private Map<String, Long> retryAfterDataMap = new ConcurrentHashMap();
    private String uaString = System.getProperty("http.agent");

    /* loaded from: classes2.dex */
    public static class ClearTextTrafficException extends IOException {
        public ClearTextTrafficException(String str) {
            super(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final String EDGE = "edge";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "LTE";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";
    }

    /* loaded from: classes2.dex */
    public static class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        private static final String GZIP = "gzip";

        private RequestBody gzip(final RequestBody requestBody) throws IOException {
            final b bVar = new b();
            j jVar = new j(bVar);
            Logger logger = okio.q.f33861a;
            t tVar = new t(jVar);
            requestBody.writeTo(tVar);
            tVar.close();
            return new RequestBody() { // from class: com.vungle.warren.VungleApiClient.GzipRequestInterceptor.1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return bVar.f33824t;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return requestBody.contentType();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(c cVar) throws IOException {
                    cVar.O(bVar.S());
                }
            };
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            if (request.body() != null && request.header("Content-Encoding") == null) {
                return chain.proceed(request.newBuilder().header("Content-Encoding", "gzip").method(request.method(), gzip(request.body())).build());
            }
            return chain.proceed(request);
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    static {
        String str;
        if (Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER)) {
            str = "VungleAmazon/";
        } else {
            str = "VungleDroid/";
        }
        headerUa = str.concat(BuildConfig.VERSION_NAME);
        BASE_URL = "https://config.ads.vungle.com/api/v5/";
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
    }

    public VungleApiClient(Context context, CacheManager cacheManager, Repository repository, OMInjector oMInjector, Platform platform) {
        this.cacheManager = cacheManager;
        this.context = context.getApplicationContext();
        this.repository = repository;
        this.omInjector = oMInjector;
        this.platform = platform;
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.vungle.warren.VungleApiClient.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                int code;
                Request request = chain.request();
                String encodedPath = request.url().encodedPath();
                Long l10 = (Long) VungleApiClient.this.retryAfterDataMap.get(encodedPath);
                if (l10 != null) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(l10.longValue() - System.currentTimeMillis());
                    if (seconds > 0) {
                        return new Response.Builder().request(request).addHeader("Retry-After", String.valueOf(seconds)).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"Error\":\"Retry-After\"}")).build();
                    }
                    VungleApiClient.this.retryAfterDataMap.remove(encodedPath);
                }
                Response proceed = chain.proceed(request);
                if (proceed != null && ((code = proceed.code()) == 429 || code == 500 || code == 502 || code == 503)) {
                    String str = proceed.headers().get("Retry-After");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            long parseLong = Long.parseLong(str);
                            if (parseLong > 0) {
                                VungleApiClient.this.retryAfterDataMap.put(encodedPath, Long.valueOf((parseLong * 1000) + System.currentTimeMillis()));
                            }
                        } catch (NumberFormatException unused) {
                            Log.d(VungleApiClient.TAG, "Retry-After value is not an valid value");
                        }
                    }
                }
                return proceed;
            }
        });
        this.client = addInterceptor.build();
        OkHttpClient build = addInterceptor.addInterceptor(new GzipRequestInterceptor()).build();
        APIFactory aPIFactory = new APIFactory(this.client, BASE_URL);
        Vungle vungle = Vungle._instance;
        this.api = aPIFactory.createAPI(vungle.appID);
        this.gzipApi = new APIFactory(build, BASE_URL).createAPI(vungle.appID);
        this.timeoutProvider = (TimeoutProvider) ServiceLocator.getInstance(context).getService(TimeoutProvider.class);
    }

    private String getConnectionTypeDetail(int i10) {
        switch (i10) {
            case 1:
                return ConnectionTypeDetail.GPRS;
            case 2:
                return ConnectionTypeDetail.EDGE;
            case 3:
            case 10:
            case 11:
            default:
                return "unknown";
            case 4:
                return ConnectionTypeDetail.WCDMA;
            case 5:
                return ConnectionTypeDetail.CDMA_EVDO_0;
            case 6:
                return ConnectionTypeDetail.CDMA_EVDO_A;
            case 7:
                return ConnectionTypeDetail.CDMA_1XRTT;
            case 8:
                return ConnectionTypeDetail.HSDPA;
            case 9:
                return ConnectionTypeDetail.HSUPA;
            case 12:
                return ConnectionTypeDetail.CDMA_EVDO_B;
            case 13:
                return ConnectionTypeDetail.LTE;
            case 14:
                return ConnectionTypeDetail.HRPD;
        }
    }

    @SuppressLint({"HardwareIds", "NewApi"})
    private q getDeviceBody() throws IllegalStateException {
        return getDeviceBody(false);
    }

    private q getExtBody() {
        String str;
        Cookie cookie = (Cookie) this.repository.load(Cookie.CONFIG_EXTENSION, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            str = cookie.getString(Cookie.CONFIG_EXTENSION);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        q qVar = new q();
        qVar.q(Cookie.CONFIG_EXTENSION, str);
        return qVar;
    }

    public static String getHeaderUa() {
        return headerUa;
    }

    private String getUserAgentFromCookie() {
        Cookie cookie = (Cookie) this.repository.load(Cookie.USER_AGENT_ID_COOKIE, Cookie.class).get();
        if (cookie == null) {
            return System.getProperty("http.agent");
        }
        String string = cookie.getString(Cookie.USER_AGENT_ID_COOKIE);
        if (TextUtils.isEmpty(string)) {
            return System.getProperty("http.agent");
        }
        return string;
    }

    private q getUserBody() {
        String str;
        String str2;
        long j10;
        String str3;
        String str4;
        q qVar = new q();
        Cookie cookie = (Cookie) this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        String str5 = "";
        if (cookie != null) {
            str = cookie.getString("consent_status");
            str2 = cookie.getString("consent_source");
            j10 = cookie.getLong("timestamp").longValue();
            str3 = cookie.getString("consent_message_version");
        } else {
            str = "unknown";
            str2 = "no_interaction";
            j10 = 0;
            str3 = "";
        }
        q qVar2 = new q();
        qVar2.q("consent_status", str);
        qVar2.q("consent_source", str2);
        qVar2.p("consent_timestamp", Long.valueOf(j10));
        if (!TextUtils.isEmpty(str3)) {
            str5 = str3;
        }
        qVar2.q("consent_message_version", str5);
        qVar.n(qVar2, "gdpr");
        Cookie cookie2 = (Cookie) this.repository.load(Cookie.CCPA_COOKIE, Cookie.class).get();
        if (cookie2 != null) {
            str4 = cookie2.getString(Cookie.CCPA_CONSENT_STATUS);
        } else {
            str4 = "opted_in";
        }
        q qVar3 = new q();
        qVar3.q("status", str4);
        qVar.n(qVar3, "ccpa");
        if (PrivacyManager.getInstance().getCoppaStatus() != PrivacyManager.COPPA.COPPA_NOTSET) {
            q qVar4 = new q();
            qVar4.o(Cookie.COPPA_STATUS_KEY, Boolean.valueOf(PrivacyManager.getInstance().getCoppaStatus().getValue()));
            qVar.n(qVar4, Cookie.COPPA_KEY);
        }
        return qVar;
    }

    private void initUserAgentLazy() {
        this.platform.getUserAgentLazy(new a<String>() { // from class: com.vungle.warren.VungleApiClient.2
            @Override // m0.a
            public void accept(String str) {
                if (str == null) {
                    Log.e(VungleApiClient.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                } else {
                    VungleApiClient.this.uaString = str;
                }
            }
        });
    }

    public static void setHeaderUa(String str) {
        headerUa = str;
    }

    public void addPlaySvcAvailabilityInCookie(boolean z10) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        cookie.putValue(Cookie.IS_PLAY_SERVICE_AVAILABLE, Boolean.valueOf(z10));
        this.repository.save(cookie);
    }

    public Call<q> cacheBust(long j10) {
        if (this.cacheBustEndpoint != null) {
            q qVar = new q();
            qVar.n(getDeviceBody(), "device");
            qVar.n(this.appBody, "app");
            qVar.n(getUserBody(), "user");
            q qVar2 = new q();
            qVar2.p(Cookie.LAST_CACHE_BUST, Long.valueOf(j10));
            qVar.n(qVar2, "request");
            return this.gzipApi.cacheBust(getHeaderUa(), this.cacheBustEndpoint, qVar);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public boolean canCallWillPlayAd() {
        if (this.willPlayAdEnabled && !TextUtils.isEmpty(this.willPlayAdEndpoint)) {
            return true;
        }
        return false;
    }

    public com.vungle.warren.network.Response config() throws VungleException, IOException {
        String str;
        q qVar = new q();
        qVar.n(getDeviceBody(true), "device");
        qVar.n(this.appBody, "app");
        qVar.n(getUserBody(), "user");
        q extBody = getExtBody();
        if (extBody != null) {
            qVar.n(extBody, "ext");
        }
        com.vungle.warren.network.Response<q> execute = this.api.config(getHeaderUa(), qVar).execute();
        if (!execute.isSuccessful()) {
            return execute;
        }
        q body = execute.body();
        String str2 = TAG;
        Log.d(str2, "Config Response: " + body);
        if (JsonUtil.hasNonNull(body, "sleep")) {
            if (JsonUtil.hasNonNull(body, "info")) {
                str = body.s("info").m();
            } else {
                str = "";
            }
            Log.e(str2, "Error Initializing Vungle. Please try again. " + str);
            throw new VungleException(3);
        }
        if (JsonUtil.hasNonNull(body, "endpoints")) {
            q u2 = body.u("endpoints");
            HttpUrl parse = HttpUrl.parse(u2.s("new").m());
            HttpUrl parse2 = HttpUrl.parse(u2.s(d.f9543h).m());
            HttpUrl parse3 = HttpUrl.parse(u2.s("will_play_ad").m());
            HttpUrl parse4 = HttpUrl.parse(u2.s("report_ad").m());
            HttpUrl parse5 = HttpUrl.parse(u2.s("ri").m());
            HttpUrl parse6 = HttpUrl.parse(u2.s("log").m());
            HttpUrl parse7 = HttpUrl.parse(u2.s(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME).m());
            HttpUrl parse8 = HttpUrl.parse(u2.s("sdk_bi").m());
            if (parse != null && parse2 != null && parse3 != null && parse4 != null && parse5 != null && parse6 != null && parse7 != null && parse8 != null) {
                this.newEndpoint = parse.toString();
                this.requestAdEndpoint = parse2.toString();
                this.willPlayAdEndpoint = parse3.toString();
                this.reportAdEndpoint = parse4.toString();
                this.riEndpoint = parse5.toString();
                this.logEndpoint = parse6.toString();
                this.cacheBustEndpoint = parse7.toString();
                this.biLoggingEndpoint = parse8.toString();
                q u10 = body.u("will_play_ad");
                this.willPlayAdTimeout = u10.s("request_timeout").h();
                this.willPlayAdEnabled = u10.s("enabled").e();
                this.enableOm = JsonUtil.getAsBoolean(body.u("viewability"), "om", false);
                if (this.willPlayAdEnabled) {
                    Log.v(str2, "willPlayAd is enabled, generating a timeout client.");
                    this.timeoutApi = new APIFactory(this.client.newBuilder().readTimeout(this.willPlayAdTimeout, TimeUnit.MILLISECONDS).build(), "https://api.vungle.com/").createAPI(Vungle._instance.appID);
                }
                if (getOmEnabled()) {
                    this.omInjector.init();
                } else {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.OM_SDK).addData(SessionAttribute.ENABLED, false).build());
                }
                return execute;
            }
            Log.e(str2, "Error Initializing Vungle. Please try again. ");
            throw new VungleException(3);
        }
        Log.e(str2, "Error Initializing Vungle. Please try again. ");
        throw new VungleException(3);
    }

    public boolean getOmEnabled() {
        return this.enableOm;
    }

    public Boolean getPlayServicesAvailabilityFromAPI() {
        boolean z10;
        Boolean bool = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            if (googleApiAvailabilityLight == null) {
                return null;
            }
            if (googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.context) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(bool.booleanValue());
            return bool;
        } catch (Exception unused) {
            Log.w(TAG, "Unexpected exception from Play services lib.");
            return bool;
        } catch (NoClassDefFoundError unused2) {
            Log.w(TAG, "Play services Not available");
            Boolean bool2 = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
                return bool2;
            } catch (DatabaseHelper.DBException unused3) {
                Log.w(TAG, "Failure to write GPS availability to DB");
                return bool2;
            }
        }
    }

    public Boolean getPlayServicesAvailabilityFromCookie() {
        Cookie cookie = (Cookie) this.repository.load(Cookie.IS_PLAY_SERVICE_AVAILABLE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            return cookie.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        }
        return null;
    }

    public long getRetryAfterHeaderValue(com.vungle.warren.network.Response response) {
        try {
            return Long.parseLong(response.headers().get("Retry-After")) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public void init() {
        init(this.context);
    }

    public Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public void overrideApi(VungleApi vungleApi) {
        this.api = vungleApi;
    }

    public boolean pingTPAT(String str) throws ClearTextTrafficException, MalformedURLException {
        if (!TextUtils.isEmpty(str) && HttpUrl.parse(str) != null) {
            try {
                if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(str).getHost()) && URLUtil.isHttpUrl(str)) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Clear Text Traffic is blocked").addData(SessionAttribute.URL, str).build());
                    throw new ClearTextTrafficException("Clear Text Traffic is blocked");
                }
                try {
                    com.vungle.warren.network.Response<Void> execute = this.api.pingTPAT(this.uaString, str).execute();
                    if (execute == null) {
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Error on pinging TPAT").addData(SessionAttribute.URL, str).build());
                        return true;
                    }
                    if (!execute.isSuccessful()) {
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, execute.code() + ": " + execute.message()).addData(SessionAttribute.URL, str).build());
                        return true;
                    }
                    return true;
                } catch (IOException e10) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, e10.getMessage()).addData(SessionAttribute.URL, str).build());
                    Log.d(TAG, "Error on pinging TPAT");
                    return false;
                }
            } catch (MalformedURLException unused) {
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Invalid URL").addData(SessionAttribute.URL, str).build());
                throw new MalformedURLException(f.b("Invalid URL : ", str));
            }
        }
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Invalid URL").addData(SessionAttribute.URL, str).build());
        throw new MalformedURLException(f.b("Invalid URL : ", str));
    }

    public Call<q> reportAd(q qVar) {
        if (this.reportAdEndpoint != null) {
            q qVar2 = new q();
            qVar2.n(getDeviceBody(), "device");
            qVar2.n(this.appBody, "app");
            qVar2.n(qVar, "request");
            qVar2.n(getUserBody(), "user");
            q extBody = getExtBody();
            if (extBody != null) {
                qVar2.n(extBody, "ext");
            }
            return this.gzipApi.reportAd(getHeaderUa(), this.reportAdEndpoint, qVar2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<q> reportNew() throws IllegalStateException {
        String str;
        if (this.newEndpoint != null) {
            HashMap hashMap = new HashMap(2);
            n s10 = this.appBody.s("id");
            String str2 = "";
            if (s10 == null) {
                str = "";
            } else {
                str = s10.m();
            }
            hashMap.put("app_id", str);
            q deviceBody = getDeviceBody();
            if (PrivacyManager.getInstance().shouldSendAdIds()) {
                n s11 = deviceBody.s(IFA);
                if (s11 != null) {
                    str2 = s11.m();
                }
                hashMap.put(IFA, str2);
            }
            return this.api.reportNew(getHeaderUa(), this.newEndpoint, hashMap);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<q> requestAd(String str, String str2, boolean z10, q qVar) throws IllegalStateException {
        if (this.requestAdEndpoint != null) {
            q qVar2 = new q();
            qVar2.n(getDeviceBody(), "device");
            qVar2.n(this.appBody, "app");
            q userBody = getUserBody();
            if (qVar != null) {
                userBody.n(qVar, "vision");
            }
            qVar2.n(userBody, "user");
            q extBody = getExtBody();
            if (extBody != null) {
                qVar2.n(extBody, "ext");
            }
            q qVar3 = new q();
            l lVar = new l();
            lVar.n(str);
            qVar3.n(lVar, "placements");
            qVar3.o("header_bidding", Boolean.valueOf(z10));
            if (!TextUtils.isEmpty(str2)) {
                qVar3.q("ad_size", str2);
            }
            qVar2.n(qVar3, "request");
            return this.gzipApi.ads(getHeaderUa(), this.requestAdEndpoint, qVar2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<q> ri(q qVar) {
        if (this.riEndpoint != null) {
            q qVar2 = new q();
            qVar2.n(getDeviceBody(), "device");
            qVar2.n(this.appBody, "app");
            qVar2.n(qVar, "request");
            qVar2.n(getUserBody(), "user");
            q extBody = getExtBody();
            if (extBody != null) {
                qVar2.n(extBody, "ext");
            }
            return this.api.ri(getHeaderUa(), this.riEndpoint, qVar2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<q> sendAnalytics(Collection<CacheBust> collection) {
        String str;
        if (this.biLoggingEndpoint != null) {
            if (collection != null && !collection.isEmpty()) {
                q qVar = new q();
                qVar.n(getDeviceBody(), "device");
                qVar.n(this.appBody, "app");
                q qVar2 = new q();
                l lVar = new l(collection.size());
                for (CacheBust cacheBust : collection) {
                    for (int i10 = 0; i10 < cacheBust.getEventIds().length; i10++) {
                        q qVar3 = new q();
                        if (cacheBust.getIdType() == 1) {
                            str = "campaign";
                        } else {
                            str = "creative";
                        }
                        qVar3.q("target", str);
                        qVar3.q("id", cacheBust.getId());
                        qVar3.q("event_id", cacheBust.getEventIds()[i10]);
                        lVar.o(qVar3);
                    }
                }
                if (lVar.size() > 0) {
                    qVar2.n(lVar, CacheBustDBAdapter.CacheBustColumns.TABLE_NAME);
                }
                qVar.n(qVar2, "request");
                return this.gzipApi.sendBiAnalytics(getHeaderUa(), this.biLoggingEndpoint, qVar);
            }
            throw new IllegalArgumentException("Cannot send analytics when bust and session data is empty");
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<q> sendLog(q qVar) {
        if (this.logEndpoint != null) {
            return this.gzipApi.sendLog(getHeaderUa(), this.logEndpoint, qVar);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public Call<q> sendSessionDataAnalytics(l lVar) {
        if (this.biLoggingEndpoint != null) {
            q qVar = new q();
            qVar.n(getDeviceBody(), "device");
            qVar.n(this.appBody, "app");
            q qVar2 = new q();
            qVar2.n(lVar, "session_events");
            qVar.n(qVar2, "request");
            return this.gzipApi.sendBiAnalytics(getHeaderUa(), this.biLoggingEndpoint, qVar);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    public void setAppId(String str) {
        setAppId(str, this.appBody);
    }

    public Call<q> willPlayAd(String str, boolean z10, String str2) {
        q qVar = new q();
        qVar.n(getDeviceBody(), "device");
        qVar.n(this.appBody, "app");
        qVar.n(getUserBody(), "user");
        q qVar2 = new q();
        q qVar3 = new q();
        qVar3.q("reference_id", str);
        qVar3.o("is_auto_cached", Boolean.valueOf(z10));
        qVar2.n(qVar3, "placement");
        qVar2.q(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_AD_TOKEN, str2);
        qVar.n(qVar2, "request");
        return this.timeoutApi.willPlayAd(getHeaderUa(), this.willPlayAdEndpoint, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d7, code lost:
    
        if (android.provider.Settings.Secure.getInt(r10.context.getContentResolver(), "install_non_market_apps") == 1) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x02e2 -> B:98:0x02e3). Please report as a decompilation issue!!! */
    @android.annotation.SuppressLint({"HardwareIds", "NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized m8.q getDeviceBody(boolean r11) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VungleApiClient.getDeviceBody(boolean):m8.q");
    }

    private void setAppId(String str, q qVar) {
        qVar.q("id", str);
    }

    public synchronized void init(Context context) {
        String str;
        q qVar = new q();
        qVar.q("bundle", context.getPackageName());
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str == null) {
            str = g.c.f5034a;
        }
        qVar.q("ver", str);
        q qVar2 = new q();
        String str2 = Build.MANUFACTURER;
        qVar2.q("make", str2);
        qVar2.q("model", Build.MODEL);
        qVar2.q("osv", Build.VERSION.RELEASE);
        qVar2.q("carrier", ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName());
        qVar2.q("os", Platform.MANUFACTURER_AMAZON.equals(str2) ? "amazon" : "android");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        qVar2.p("w", Integer.valueOf(displayMetrics.widthPixels));
        qVar2.p("h", Integer.valueOf(displayMetrics.heightPixels));
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            qVar2.q("ua", userAgent);
            initUserAgentLazy();
        } catch (Exception e10) {
            Log.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
        }
        this.baseDeviceInfo = qVar2;
        this.appBody = qVar;
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }
}
