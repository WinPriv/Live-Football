package com.applovin.impl.sdk.c;

import a3.k;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a<T> extends b<T> {
    public static final b<Boolean> A;
    public static final b<Boolean> B;
    public static final b<Long> C;
    public static final b<Long> D;
    public static final b<Boolean> E;
    public static final b<Long> F;
    public static final b<Long> G;
    public static final b<Boolean> H;
    public static final b<Long> I;
    public static final b<Boolean> J;
    public static final b<Integer> K;
    public static final b<String> L;
    public static final b<String> M;
    public static final b<Integer> N;
    public static final b<String> O;
    public static final b<Boolean> P;
    public static final b<Boolean> Q;
    public static final b<Boolean> R;
    public static final b<Boolean> S;
    public static final b<Boolean> T;
    public static final b<Boolean> U;
    public static final b<Boolean> V;
    public static final b<Boolean> W;
    public static final b<Boolean> X;
    public static final b<Boolean> Y;
    public static final b<Long> Z;

    /* renamed from: a, reason: collision with root package name */
    public static final b<String> f18679a = b.a("afi", "");

    /* renamed from: aa, reason: collision with root package name */
    public static final b<Boolean> f18680aa;

    /* renamed from: ab, reason: collision with root package name */
    public static final b<Boolean> f18681ab;

    /* renamed from: b, reason: collision with root package name */
    public static final b<Long> f18682b;

    /* renamed from: c, reason: collision with root package name */
    public static final b<String> f18683c;

    /* renamed from: d, reason: collision with root package name */
    public static final b<String> f18684d;

    /* renamed from: e, reason: collision with root package name */
    public static final b<Long> f18685e;
    public static final b<Long> f;

    /* renamed from: g, reason: collision with root package name */
    public static final b<Long> f18686g;

    /* renamed from: h, reason: collision with root package name */
    public static final b<Boolean> f18687h;

    /* renamed from: i, reason: collision with root package name */
    public static final b<String> f18688i;

    /* renamed from: j, reason: collision with root package name */
    public static final b<Long> f18689j;

    /* renamed from: k, reason: collision with root package name */
    public static final b<Long> f18690k;

    /* renamed from: l, reason: collision with root package name */
    public static final b<Long> f18691l;

    /* renamed from: m, reason: collision with root package name */
    public static final b<Long> f18692m;

    /* renamed from: n, reason: collision with root package name */
    public static final b<String> f18693n;
    public static final b<Long> o;

    /* renamed from: p, reason: collision with root package name */
    public static final b<Boolean> f18694p;

    /* renamed from: q, reason: collision with root package name */
    public static final b<Boolean> f18695q;

    /* renamed from: r, reason: collision with root package name */
    public static final b<Boolean> f18696r;

    /* renamed from: s, reason: collision with root package name */
    public static final b<Boolean> f18697s;

    /* renamed from: t, reason: collision with root package name */
    public static final b<Boolean> f18698t;

    /* renamed from: u, reason: collision with root package name */
    public static final b<Long> f18699u;

    /* renamed from: v, reason: collision with root package name */
    public static final b<Boolean> f18700v;

    /* renamed from: w, reason: collision with root package name */
    public static final b<Long> f18701w;

    /* renamed from: x, reason: collision with root package name */
    public static final b<Long> f18702x;
    public static final b<Boolean> y;

    /* renamed from: z, reason: collision with root package name */
    public static final b<Boolean> f18703z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f18682b = k.g(timeUnit, 5L, "afi_ms");
        f18683c = b.a("mediation_endpoint", "https://ms.applovin.com/");
        f18684d = b.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f18685e = k.g(timeUnit, 2L, "fetch_next_ad_retry_delay_ms");
        f = k.g(timeUnit, 5L, "fetch_next_ad_timeout_ms");
        f18686g = k.g(timeUnit, 7L, "fetch_mediation_debugger_info_timeout_ms");
        Boolean bool = Boolean.TRUE;
        f18687h = b.a("auto_init_mediation_debugger", bool);
        f18688i = b.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f18689j = k.g(timeUnit, 30L, "max_signal_provider_latency_ms");
        f18690k = k.g(timeUnit, 10L, "default_adapter_timeout_ms");
        f18691l = k.g(timeUnit, 30L, "ad_refresh_ms");
        f18692m = k.g(timeUnit, 30L, "ad_load_failure_refresh_ms");
        f18693n = b.a("ad_load_failure_refresh_ignore_error_codes", "204");
        o = b.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f18694p = b.a("refresh_ad_view_timer_responds_to_background", bool);
        f18695q = b.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        Boolean bool2 = Boolean.FALSE;
        f18696r = b.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        f18697s = b.a("avrsponse", bool2);
        f18698t = b.a(AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE, bool2);
        f18699u = b.a("fullscreen_display_delay_ms", 600L);
        f18700v = b.a("susaode", bool2);
        f18701w = b.a("ahdm", 500L);
        f18702x = b.a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);
        y = b.a("ad_view_refresh_precache_request_enabled", bool);
        f18703z = b.a("fullscreen_ads_block_publisher_load_if_another_showing", bool);
        A = b.a("fabsina", bool2);
        B = b.a("fabsiaif", bool2);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        C = k.g(timeUnit2, 4L, "ad_expiration_ms");
        D = k.g(timeUnit2, 4L, "native_ad_expiration_ms");
        E = b.a("rena", bool);
        F = b.a("fullscreen_ad_displayed_timeout_ms", -1L);
        G = b.a("ad_hidden_timeout_ms", -1L);
        H = b.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        I = k.g(timeUnit, 1L, "ad_hidden_on_ad_dismiss_callback_delay_ms");
        J = b.a("proe", bool2);
        K = b.a("mute_state", 2);
        L = b.a("saf", "");
        M = b.a("saui", "");
        N = b.a("mra", -1);
        O = b.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        P = b.a("sai", bool2);
        Q = b.a("init_adapter_for_sc", bool);
        R = b.a("init_adapter_for_al", bool);
        S = b.a("fadiafase", bool);
        T = b.a("fadwvcv", bool);
        U = b.a("bfarud", bool2);
        V = b.a("inacc", Boolean.valueOf(Utils.isMemberOfPackageNameList(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        W = b.a("fasrrwaliip", bool2);
        X = b.a("suv2tpw", bool2);
        Y = b.a("slnbaibalf", bool);
        Z = k.g(timeUnit, 2L, "fsast");
        f18680aa = b.a("fetch_mediated_ad_gzip", bool2);
        f18681ab = b.a("max_postback_gzip", bool2);
    }
}
