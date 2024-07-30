package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class b {
    public static final b A;
    public static final b B;
    public static final b C;
    private static final Set<String> F = new HashSet(32);

    /* renamed from: a, reason: collision with root package name */
    public static final b f18772a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f18773b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f18774c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f18775d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f18776e;
    public static final b f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f18777g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f18778h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f18779i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f18780j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f18781k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f18782l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f18783m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f18784n;
    public static final b o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f18785p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f18786q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f18787r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f18788s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f18789t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f18790u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f18791v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f18792w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f18793x;
    public static final b y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f18794z;
    private final String D;
    private final String E;

    static {
        a("sisw", "IS_STREAMING_WEBKIT");
        a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        a("skr", "STOREKIT_REDIRECTED");
        a("sklf", "STOREKIT_LOAD_FAILURE");
        a("skps", "STOREKIT_PRELOAD_SKIPPED");
        f18772a = a("sas", "AD_SOURCE");
        f18773b = a("srt", "AD_RENDER_TIME");
        f18774c = a("sft", "AD_FETCH_TIME");
        f18775d = a("sfs", "AD_FETCH_SIZE");
        f18776e = a("sadb", "AD_DOWNLOADED_BYTES");
        f = a("sacb", "AD_CACHED_BYTES");
        f18777g = a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");
        f18778h = a("stdi", "TIME_TO_DISPLAY_FROM_INIT");
        f18779i = a("snas", "AD_NUMBER_IN_SESSION");
        f18780j = a("snat", "AD_NUMBER_TOTAL");
        f18781k = a("stah", "TIME_AD_HIDDEN_FROM_SHOW");
        f18782l = a("stas", "TIME_TO_SKIP_FROM_SHOW");
        f18783m = a("stac", "TIME_TO_CLICK_FROM_SHOW");
        f18784n = a("stbe", "TIME_TO_EXPAND_FROM_SHOW");
        o = a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");
        f18785p = a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");
        f18786q = a("sugs", "AD_USED_GRAPHIC_STREAM");
        f18787r = a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");
        f18788s = a("stpd", "INTERSTITIAL_PAUSED_DURATION");
        f18789t = a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");
        f18790u = a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");
        f18791v = a("schc", "AD_CANCELLED_HTML_CACHING");
        f18792w = a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");
        f18793x = a("vssc", "VIDEO_STREAM_STALLED_COUNT");
        y = a("wvem", "WEB_VIEW_ERROR_MESSAGES");
        f18794z = a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");
        A = a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");
        B = a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");
        C = a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");
    }

    private b(String str, String str2) {
        this.D = str;
        this.E = str2;
    }

    private static b a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Set<String> set = F;
            if (!set.contains(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    set.add(str);
                    return new b(str, str2);
                }
                throw new IllegalArgumentException("No debug name specified");
            }
            throw new IllegalArgumentException(s.f.b("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }
}
