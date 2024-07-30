package com.applovin.impl.sdk.c;

import com.huawei.openalliance.ad.constant.w;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f18757a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f18758b;

    /* renamed from: d, reason: collision with root package name */
    public static final d<String> f18737d = new d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: e, reason: collision with root package name */
    public static final d<Boolean> f18738e = new d<>("com.applovin.sdk.launched_before", Boolean.class);
    public static final d<String> f = new d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: g, reason: collision with root package name */
    public static final d<Long> f18739g = new d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: h, reason: collision with root package name */
    public static final d<String> f18740h = new d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: i, reason: collision with root package name */
    public static final d<String> f18741i = new d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: j, reason: collision with root package name */
    public static final d<String> f18742j = new d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: k, reason: collision with root package name */
    public static final d<String> f18743k = new d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: l, reason: collision with root package name */
    public static final d<String> f18744l = new d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: m, reason: collision with root package name */
    public static final d<String> f18745m = new d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: n, reason: collision with root package name */
    public static final d<Boolean> f18746n = new d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final d<Boolean> o = new d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: p, reason: collision with root package name */
    public static final d<Boolean> f18747p = new d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: q, reason: collision with root package name */
    public static final d<String> f18748q = new d<>(w.f22150cd, String.class);

    /* renamed from: r, reason: collision with root package name */
    public static final d<?> f18749r = new d<>("IABTCF_gdprApplies", Object.class);

    /* renamed from: s, reason: collision with root package name */
    public static final d<Boolean> f18750s = new d<>("com.applovin.sdk.is_pending_unified_flow_generation", Boolean.class);

    /* renamed from: t, reason: collision with root package name */
    public static final d<Boolean> f18751t = new d<>("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: u, reason: collision with root package name */
    public static final d<Boolean> f18752u = new d<>("com.applovin.sdk.been_in_gdpr_region", Boolean.class);

    /* renamed from: v, reason: collision with root package name */
    public static final d<Boolean> f18753v = new d<>("com.applovin.sdk.gdpr_flow_advertising_partners_accepted", Boolean.class);

    /* renamed from: w, reason: collision with root package name */
    public static final d<Boolean> f18754w = new d<>("com.applovin.sdk.gdpr_flow_analytics_partners_accepted", Boolean.class);

    /* renamed from: x, reason: collision with root package name */
    public static final d<Boolean> f18755x = new d<>("com.applovin.sdk.gdpr_flow_privacy_policy_accepted", Boolean.class);
    public static final d<String> y = new d<>("com.applovin.sdk.stats", String.class);

    /* renamed from: z, reason: collision with root package name */
    public static final d<HashSet> f18756z = new d<>("com.applovin.sdk.task.stats", HashSet.class);
    public static final d<String> A = new d<>("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final d<String> B = new d<>("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final d<HashSet> C = new d<>("com.applovin.sdk.ad.stats", HashSet.class);
    public static final d<Integer> D = new d<>("com.applovin.sdk.last_video_position", Integer.class);
    public static final d<Boolean> E = new d<>("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final d<String> F = new d<>("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final d<String> G = new d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final d<String> H = new d<>("com.applovin.sdk.persisted_data", String.class);
    public static final d<String> I = new d<>("com.applovin.sdk.mediation_provider", String.class);
    public static final d<String> J = new d<>("com.applovin.sdk.mediation.test_mode_network", String.class);
    public static final d<Boolean> K = new d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final d<String> L = new d<>("com.applovin.sdk.user_agent", String.class);
    public static final d<String> M = new d<>("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final d<String> N = new d<>("com.taboola.api.user_id", String.class);
    public static final d<Long> O = new d<>("com.taboola.api.user_id_creation_date", Long.class);

    public d(String str, Class<T> cls) {
        this.f18757a = str;
        this.f18758b = cls;
    }

    public String a() {
        return this.f18757a;
    }

    public Class<T> b() {
        return this.f18758b;
    }

    public String toString() {
        return "Key{name='" + this.f18757a + "', type=" + this.f18758b + '}';
    }
}
