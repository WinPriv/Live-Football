package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class f {

    /* renamed from: v, reason: collision with root package name */
    private final String f18827v;

    /* renamed from: u, reason: collision with root package name */
    private static final Set<String> f18825u = new HashSet(32);

    /* renamed from: w, reason: collision with root package name */
    private static final Set<f> f18826w = new HashSet(16);

    /* renamed from: a, reason: collision with root package name */
    public static final f f18807a = a("ad_req");

    /* renamed from: b, reason: collision with root package name */
    public static final f f18808b = a("ad_imp");

    /* renamed from: c, reason: collision with root package name */
    public static final f f18809c = a("max_ad_imp");

    /* renamed from: d, reason: collision with root package name */
    public static final f f18810d = a("ad_session_start");

    /* renamed from: e, reason: collision with root package name */
    public static final f f18811e = a("ad_imp_session");
    public static final f f = a("max_ad_imp_session");

    /* renamed from: g, reason: collision with root package name */
    public static final f f18812g = a("cached_files_expired");

    /* renamed from: h, reason: collision with root package name */
    public static final f f18813h = a("cache_drop_count");

    /* renamed from: i, reason: collision with root package name */
    public static final f f18814i = a("sdk_reset_state_count", true);

    /* renamed from: j, reason: collision with root package name */
    public static final f f18815j = a("ad_response_process_failures", true);

    /* renamed from: k, reason: collision with root package name */
    public static final f f18816k = a("response_process_failures", true);

    /* renamed from: l, reason: collision with root package name */
    public static final f f18817l = a("incent_failed_to_display_count", true);

    /* renamed from: m, reason: collision with root package name */
    public static final f f18818m = a("app_paused_and_resumed");

    /* renamed from: n, reason: collision with root package name */
    public static final f f18819n = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final f o = a("ad_shown_outside_app_count");

    /* renamed from: p, reason: collision with root package name */
    public static final f f18820p = a("med_ad_req");

    /* renamed from: q, reason: collision with root package name */
    public static final f f18821q = a("med_ad_response_process_failures", true);

    /* renamed from: r, reason: collision with root package name */
    public static final f f18822r = a("med_waterfall_ad_no_fill", true);

    /* renamed from: s, reason: collision with root package name */
    public static final f f18823s = a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: t, reason: collision with root package name */
    public static final f f18824t = a("med_waterfall_ad_invalid_response", true);

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private f(String str) {
        this.f18827v = str;
    }

    public static Set<f> b() {
        return f18826w;
    }

    public String a() {
        return this.f18827v;
    }

    private static f a(String str) {
        return a(str, false);
    }

    private static f a(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            Set<String> set = f18825u;
            if (!set.contains(str)) {
                set.add(str);
                f fVar = new f(str);
                if (z10) {
                    f18826w.add(fVar);
                }
                return fVar;
            }
            throw new IllegalArgumentException(s.f.b("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }
}
