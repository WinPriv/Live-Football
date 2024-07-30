package com.applovin.impl.sdk.c;

import a3.k;
import android.net.Uri;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.video.module.a.a.m;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.c.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import s.f;

/* loaded from: classes.dex */
public class b<T> implements Comparable {
    public static final b<Boolean> aA;
    public static final b<Boolean> aB;
    public static final b<Boolean> aC;
    public static final b<Boolean> aD;
    public static final b<String> aE;
    public static final b<Boolean> aF;
    public static final b<String> aG;
    public static final b<Boolean> aH;
    public static final b<Long> aI;
    public static final b<Boolean> aJ;
    public static final b<Boolean> aK;
    public static final b<Boolean> aL;
    public static final b<Boolean> aM;
    public static final b<Long> aN;
    public static final b<Long> aO;
    public static final b<Long> aP;
    public static final b<Long> aQ;
    public static final b<Long> aR;
    public static final b<Long> aS;
    public static final b<String> aT;
    public static final b<String> aU;
    public static final b<String> aV;
    public static final b<String> aW;
    public static final b<Long> aX;
    public static final b<Integer> aY;
    public static final b<Integer> aZ;

    /* renamed from: ac, reason: collision with root package name */
    public static final b<Boolean> f18705ac;

    /* renamed from: ad, reason: collision with root package name */
    public static final b<String> f18706ad;
    public static final b<Boolean> ae;
    public static final b<String> af;
    public static final b<Long> ag;
    public static final b<Boolean> ah;
    public static final b<String> ai;
    public static final b<String> aj;
    public static final b<String> ak;
    public static final b<String> al;
    public static final b<Boolean> am;
    public static final b<Boolean> an;
    public static final b<Boolean> ao;
    public static final b<Boolean> ap;
    public static final b<Long> aq;
    public static final b<Integer> ar;
    public static final b<Integer> as;
    public static final b<Boolean> at;
    public static final b<Boolean> au;
    public static final b<Integer> av;
    public static final b<Boolean> aw;
    public static final b<Integer> ax;
    public static final b<Integer> ay;
    public static final b<Boolean> az;
    public static final b<Boolean> bA;
    public static final b<Boolean> bB;
    public static final b<String> bC;
    public static final b<String> bD;
    public static final b<Integer> bE;
    public static final b<Boolean> bF;
    public static final b<Boolean> bG;
    public static final b<Integer> bH;
    public static final b<Integer> bI;
    public static final b<Boolean> bJ;
    public static final b<String> bK;
    public static final b<String> bL;
    public static final b<String> bM;
    public static final b<String> bN;
    public static final b<Boolean> bO;
    public static final b<String> bP;
    public static final b<String> bQ;
    public static final b<String> bR;
    public static final b<String> bS;
    public static final b<Integer> bT;
    public static final b<Integer> bU;
    public static final b<Boolean> bV;
    public static final b<Long> bW;
    public static final b<Integer> bX;
    public static final b<Integer> bY;
    public static final b<Integer> bZ;

    /* renamed from: ba, reason: collision with root package name */
    public static final b<Integer> f18708ba;

    /* renamed from: bb, reason: collision with root package name */
    public static final b<String> f18709bb;

    /* renamed from: bc, reason: collision with root package name */
    public static final b<String> f18710bc;

    /* renamed from: bd, reason: collision with root package name */
    public static final b<String> f18711bd;
    public static final b<String> be;
    public static final b<String> bf;
    public static final b<String> bg;
    public static final b<String> bh;
    public static final b<String> bi;
    public static final b<String> bj;
    public static final b<String> bk;
    public static final b<String> bl;
    public static final b<String> bm;
    public static final b<String> bn;
    public static final b<String> bo;
    public static final b<String> bp;
    public static final b<String> bq;
    public static final b<Boolean> br;
    public static final b<Integer> bs;
    public static final b<Integer> bt;
    public static final b<Long> bu;
    public static final b<Boolean> bv;
    public static final b<Boolean> bw;
    public static final b<Long> bx;
    public static final b<Integer> by;
    public static final b<String> bz;
    public static final b<Long> cA;
    public static final b<Boolean> cB;
    public static final b<Boolean> cC;
    public static final b<Boolean> cD;
    public static final b<Boolean> cE;
    public static final b<Boolean> cF;
    public static final b<Boolean> cG;
    public static final b<Boolean> cH;
    public static final b<Boolean> cI;
    public static final b<Integer> cJ;
    public static final b<Integer> cK;
    public static final b<Integer> cL;
    public static final b<Long> cM;
    public static final b<Integer> cN;
    public static final b<Integer> cO;
    public static final b<Integer> cP;
    public static final b<Long> cQ;
    public static final b<Boolean> cR;
    public static final b<Boolean> cS;
    public static final b<Boolean> cT;
    public static final b<Boolean> cU;
    public static final b<Integer> cV;
    public static final b<Integer> cW;
    public static final b<Integer> cX;
    public static final b<Boolean> cY;
    public static final b<Integer> cZ;

    /* renamed from: ca, reason: collision with root package name */
    public static final b<Integer> f18712ca;

    /* renamed from: cb, reason: collision with root package name */
    public static final b<Integer> f18713cb;

    /* renamed from: cc, reason: collision with root package name */
    public static final b<Integer> f18714cc;

    /* renamed from: cd, reason: collision with root package name */
    public static final b<Integer> f18715cd;
    public static final b<Integer> ce;
    public static final b<Float> cf;
    public static final b<Long> cg;
    public static final b<Long> ch;
    public static final b<Integer> ci;
    public static final b<Integer> cj;
    public static final b<Integer> ck;
    public static final b<Boolean> cl;
    public static final b<Integer> cm;

    /* renamed from: cn, reason: collision with root package name */
    public static final b<Boolean> f18716cn;
    public static final b<String> co;
    public static final b<String> cp;
    public static final b<String> cq;
    public static final b<Integer> cr;
    public static final b<Integer> cs;
    public static final b<Long> ct;
    public static final b<Long> cu;
    public static final b<Boolean> cv;
    public static final b<Integer> cw;
    public static final b<Integer> cx;
    public static final b<Integer> cy;
    public static final b<Long> cz;
    public static final b<Integer> dA;
    public static final b<Boolean> dB;
    public static final b<Long> dC;
    public static final b<Long> dD;
    public static final b<Boolean> dE;
    public static final b<Boolean> dF;
    public static final b<Boolean> dG;
    public static final b<Boolean> dH;
    public static final b<Boolean> dI;
    public static final b<Boolean> dJ;
    public static final b<Boolean> dK;
    public static final b<Boolean> dL;
    public static final b<Boolean> dM;
    public static final b<Boolean> dN;
    public static final b<Boolean> dO;
    public static final b<Boolean> dP;
    public static final b<Boolean> dQ;
    public static final b<Boolean> dR;
    public static final b<Boolean> dS;
    public static final b<String> dT;
    public static final b<Boolean> dU;
    public static final b<Boolean> dV;
    public static final b<Boolean> dW;
    public static final b<Boolean> dX;
    public static final b<Boolean> dY;
    public static final b<Boolean> dZ;

    /* renamed from: da, reason: collision with root package name */
    public static final b<Integer> f18717da;

    /* renamed from: db, reason: collision with root package name */
    public static final b<Boolean> f18718db;

    /* renamed from: dc, reason: collision with root package name */
    public static final b<Boolean> f18719dc;

    /* renamed from: dd, reason: collision with root package name */
    public static final b<Integer> f18720dd;

    /* renamed from: de, reason: collision with root package name */
    public static final b<Integer> f18721de;
    public static final b<Integer> df;
    public static final b<Boolean> dg;
    public static final b<Integer> dh;
    public static final b<Integer> di;
    public static final b<Boolean> dj;
    public static final b<Boolean> dk;
    public static final b<Integer> dl;
    public static final b<Integer> dm;
    public static final b<Integer> dn;

    /* renamed from: do, reason: not valid java name */
    public static final b<Integer> f2do;
    public static final b<Boolean> dp;
    public static final b<Boolean> dq;
    public static final b<Integer> dr;
    public static final b<Integer> ds;
    public static final b<Boolean> dt;
    public static final b<Boolean> du;
    public static final b<Boolean> dv;
    public static final b<Long> dw;
    public static final b<Integer> dx;
    public static final b<Long> dy;
    public static final b<Long> dz;
    public static final b<Boolean> eA;
    public static final b<Boolean> eB;
    public static final b<Integer> eC;
    public static final b<Integer> eD;
    public static final b<Integer> eE;
    public static final b<Boolean> eF;
    public static final b<String> eG;
    public static final b<String> eH;
    public static final b<Integer> eI;
    public static final b<Integer> eJ;
    public static final b<String> eK;
    public static final b<String> eL;
    public static final b<Boolean> eM;
    public static final b<Integer> eN;
    public static final b<Integer> eO;
    public static final b<Integer> eP;
    public static final b<Integer> eQ;
    public static final b<Integer> eR;
    public static final b<Integer> eS;
    public static final b<Integer> eT;
    public static final b<Integer> eU;
    public static final b<Integer> eV;
    public static final b<Float> eW;
    public static final b<Boolean> eX;
    public static final b<Boolean> eY;
    public static final b<Integer> eZ;

    /* renamed from: ea, reason: collision with root package name */
    public static final b<Boolean> f18722ea;

    /* renamed from: eb, reason: collision with root package name */
    public static final b<Boolean> f18723eb;

    /* renamed from: ec, reason: collision with root package name */
    public static final b<Boolean> f18724ec;

    /* renamed from: ed, reason: collision with root package name */
    public static final b<Boolean> f18725ed;
    public static final b<Boolean> ee;
    public static final b<Boolean> ef;
    public static final b<Float> eg;
    public static final b<Boolean> eh;
    public static final b<Boolean> ei;
    public static final b<Boolean> ej;
    public static final b<Boolean> ek;
    public static final b<Float> el;
    public static final b<Integer> em;
    public static final b<Boolean> en;
    public static final b<Boolean> eo;
    public static final b<Long> ep;
    public static final b<Integer> eq;
    public static final b<Integer> er;
    public static final b<Integer> es;
    public static final b<Integer> et;
    public static final b<Integer> eu;
    public static final b<Integer> ev;
    public static final b<Integer> ew;
    public static final b<Boolean> ex;
    public static final b<Long> ey;
    public static final b<Integer> ez;
    public static final b<Boolean> fA;
    public static final b<Long> fB;
    public static final b<Long> fC;
    public static final b<Long> fD;
    public static final b<Boolean> fE;
    public static final b<Boolean> fF;
    public static final b<Boolean> fG;
    public static final b<Long> fH;
    public static final b<Long> fI;
    public static final b<Integer> fJ;
    public static final b<Boolean> fK;
    public static final b<Boolean> fL;
    public static final b<Boolean> fM;
    public static final b<Boolean> fN;
    public static final b<Boolean> fO;
    public static final b<Integer> fP;
    public static final b<Boolean> fQ;
    public static final b<Boolean> fR;
    public static final b<String> fS;
    public static final b<String> fT;
    public static final b<String> fU;
    public static final b<String> fV;
    public static final b<Integer> fW;
    public static final b<String> fX;
    public static final b<String> fY;
    public static final b<Boolean> fZ;

    /* renamed from: fa, reason: collision with root package name */
    public static final b<Boolean> f18726fa;

    /* renamed from: fb, reason: collision with root package name */
    public static final b<Boolean> f18727fb;

    /* renamed from: fc, reason: collision with root package name */
    public static final b<Long> f18728fc;

    /* renamed from: fd, reason: collision with root package name */
    public static final b<Long> f18729fd;
    public static final b<Integer> fe;
    public static final b<Boolean> ff;
    public static final b<Boolean> fg;
    public static final b<Boolean> fh;
    public static final b<Boolean> fi;
    public static final b<Boolean> fj;
    public static final b<Boolean> fk;
    public static final b<Boolean> fl;
    public static final b<Boolean> fm;
    public static final b<Boolean> fn;
    public static final b<Boolean> fo;
    public static final b<Boolean> fp;
    public static final b<Boolean> fq;
    public static final b<Boolean> fr;
    public static final b<Boolean> fs;
    public static final b<Boolean> ft;
    public static final b<Boolean> fu;
    public static final b<Boolean> fv;
    public static final b<Boolean> fw;
    public static final b<Boolean> fx;
    public static final b<Boolean> fy;
    public static final b<Boolean> fz;

    /* renamed from: c, reason: collision with root package name */
    private final String f18730c;

    /* renamed from: d, reason: collision with root package name */
    private final T f18731d;

    /* renamed from: a, reason: collision with root package name */
    private static final List<?> f18704a = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, b<?>> f18707b = CollectionUtils.map(512);

    static {
        Boolean bool = Boolean.FALSE;
        f18705ac = a("is_disabled", bool);
        f18706ad = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        ae = a("rss", bool2);
        af = a("device_token", "");
        ag = a("publisher_id", 0L);
        ah = a("is_verbose_logging", bool);
        ai = a(com.anythink.expressad.d.a.b.bH, "");
        aj = a("sc2", "");
        ak = a("sc3", "");
        al = a("server_installed_at", "");
        am = a("track_network_response_codes", bool);
        an = a("submit_network_response_codes", bool);
        ao = a("clear_network_response_codes_on_request", bool2);
        ap = a("clear_completion_callback_on_failure", bool);
        aq = a("sicd_ms", 0L);
        ar = a("logcat_max_line_size", 1000);
        as = a("stps", 16);
        at = a("ustp", bool);
        au = a("exception_handler_enabled", bool2);
        av = a("network_thread_count", 4);
        aw = a("uam", bool);
        ax = a("aei", -1);
        ay = a("mei", -1);
        az = a("gwe", bool);
        aA = a("ah_cvc", bool2);
        aB = a("ah_cdde", bool2);
        aC = a("ah_crut", bool2);
        aD = a("init_omsdk", bool2);
        aE = a("omsdk_partner_name", "applovin");
        aF = a("publisher_can_show_consent_dialog", bool2);
        aG = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
        aH = a("consent_dialog_immersive_mode_on", bool);
        aI = a("consent_dialog_show_from_alert_delay_ms", 450L);
        aJ = a("alert_consent_for_dialog_rejected", bool);
        aK = a("alert_consent_for_dialog_closed", bool);
        aL = a("alert_consent_for_dialog_closed_with_back_button", bool);
        aM = a("alert_consent_after_init", bool);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        aN = k.g(timeUnit, 5L, "alert_consent_after_init_interval_ms");
        aO = k.g(timeUnit, 30L, "alert_consent_after_dialog_rejection_interval_ms");
        aP = k.g(timeUnit, 5L, "alert_consent_after_dialog_close_interval_ms");
        aQ = k.g(timeUnit, 5L, "alert_consent_after_dialog_close_with_back_button_interval_ms");
        aR = k.g(timeUnit, 10L, "alert_consent_after_cancel_interval_ms");
        aS = k.g(timeUnit, 5L, "alert_consent_reschedule_interval_ms");
        aT = a("text_alert_consent_title", "Make this App Better and Stay Free!");
        aU = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
        aV = a("text_alert_consent_yes_option", "I Agree");
        aW = a("text_alert_consent_no_option", "Cancel");
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        aX = k.g(timeUnit2, 1L, "ttc_max_click_duration_ms");
        aY = a("ttc_max_click_distance_dp", 10);
        aZ = a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
        f18708ba = a("ttc_edge_buffer_dp", 0);
        f18709bb = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f18710bc = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f18711bd = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        be = a("adserver_endpoint", "https://a.applovin.com/");
        bf = a("adserver_backup_endpoint", "https://a.applvn.com/");
        bg = a("api_endpoint", "https://d.applovin.com/");
        bh = a("api_backup_endpoint", "https://d.applvn.com/");
        bi = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        bj = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        bk = a("fetch_variables_endpoint", "https://ms.applovin.com/");
        bl = a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
        bm = a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");
        bn = a("token_type_prefixes_r", "4!");
        bo = a("token_type_prefixes_arj", "json_v3!");
        bp = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        bq = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
        br = a("persist_super_properties", bool2);
        bs = a("super_property_string_max_length", 1024);
        bt = a("super_property_url_max_length", 1024);
        bu = k.g(timeUnit, 10L, "cached_advertising_info_ttl_ms");
        bv = a("use_per_format_cache_queues", bool2);
        bw = a("cache_cleanup_enabled", bool);
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        bx = a("cache_file_ttl_seconds", Long.valueOf(timeUnit3.toSeconds(1L)));
        by = a("cache_max_size_mb", -1);
        bz = a("precache_delimiters", ")]',");
        bA = a("ad_resource_caching_enabled", bool2);
        bB = a("fail_ad_load_on_failed_video_cache", bool2);
        bC = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        bD = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        bE = a("resource_max_filename_length", Integer.valueOf(p.f9095b));
        bF = a("saewib", bool);
        bG = a("unaem", bool);
        bH = a("vr_retry_count_v1", 1);
        bI = a("cr_retry_count_v1", 1);
        bJ = a("incent_warning_enabled", bool);
        bK = a("text_incent_warning_title", "Attention!");
        bL = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
        bM = a("text_incent_warning_close_option", "Close");
        bN = a("text_incent_warning_continue_option", "Keep Watching");
        bO = a("incent_nonvideo_warning_enabled", bool);
        bP = a("text_incent_nonvideo_warning_title", "Attention!");
        bQ = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
        bR = a("text_incent_nonvideo_warning_close_option", "Close");
        bS = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
        bT = a("close_button_touch_area", 0);
        bU = a("close_button_outside_touch_area", 0);
        bV = a("creative_debugger_enabled", bool2);
        bW = k.g(timeUnit2, 1L, "viewability_adview_imp_delay_ms");
        bX = a("viewability_adview_banner_min_width", 320);
        bY = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        bZ = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f18712ca = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f18713cb = a("viewability_adview_leader_min_width", 728);
        f18714cc = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f18715cd = a("viewability_adview_native_min_width", 0);
        ce = a("viewability_adview_native_min_height", 0);
        cf = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        cg = k.g(timeUnit2, 1L, "viewability_timer_min_visible_ms");
        ch = a("viewability_timer_interval_ms", 100L);
        ci = a("expandable_close_button_size", 27);
        cj = a("expandable_h_close_button_margin", 10);
        ck = a("expandable_t_close_button_margin", 10);
        cl = a("expandable_lhs_close_button", bool);
        cm = a("expandable_close_button_touch_area", 0);
        f18716cn = a("iaad", bool);
        co = a("js_tag_schemes", "applovin,mopub");
        cp = a("js_tag_load_success_hosts", "load,load_succeeded");
        cq = a("js_tag_load_failure_hosts", "failLoad,load_failed");
        cr = a("auxiliary_operations_threads", 3);
        cs = a("caching_operations_threads", 8);
        ct = k.g(timeUnit2, 10L, "fullscreen_ad_pending_display_state_timeout_ms");
        cu = k.g(timeUnit, 2L, "fullscreen_ad_showing_state_timeout_ms");
        cv = a("lhs_close_button_video", bool);
        cw = a("close_button_right_margin_video", 4);
        cx = a("close_button_size_video", 30);
        cy = a("close_button_top_margin_video", 8);
        cz = a("inter_display_delay", 200L);
        cA = a("maximum_close_button_delay_seconds", 999L);
        cB = a("respect_close_button", bool2);
        cC = a("lhs_skip_button", bool2);
        cD = a("track_app_killed", bool);
        cE = a("mute_controls_enabled", bool);
        cF = a("allow_user_muting", bool2);
        cG = a("mute_videos", bool);
        cH = a("show_mute_by_default", bool);
        cI = a("mute_with_user_settings", bool2);
        cJ = a("mute_button_size", 32);
        cK = a("mute_button_margin", 10);
        cL = a("mute_button_gravity", 85);
        cM = a("progress_bar_step", 25L);
        cN = a("progress_bar_scale", 10000);
        cO = a("progress_bar_vertical_padding", -8);
        cP = a("vs_buffer_indicator_size", 50);
        cQ = a("set_poststitial_muted_initial_delay_ms", 500L);
        cR = a("fasuic", bool2);
        cS = a("ssfwif", bool);
        cT = a("fsahrpg", bool2);
        cU = a("eaafrwsoa", bool2);
        cV = a("submit_postback_timeout", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        cW = a("submit_postback_retries", 4);
        cX = a("max_postback_attempts", 3);
        cY = a("fppopq", bool);
        cZ = a("max_persisted_postbacks", 100);
        f18717da = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit2.toMillis(7L)));
        f18718db = a("uppmv2", bool);
        f18719dc = a("retry_on_all_errors", bool);
        f18720dd = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        f18721de = a("http_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        df = a("http_socket_timeout", Integer.valueOf((int) timeUnit2.toMillis(20L)));
        dg = a("force_ssl", bool);
        dh = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        di = a("fetch_ad_retry_count_v1", 1);
        dj = a("faer", bool);
        dk = a("faroae", bool);
        dl = a("submit_data_retry_count_v1", 1);
        dm = a("response_buffer_size", 16000);
        dn = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        f2do = a("fetch_basic_settings_retry_count", 3);
        dp = a("fetch_basic_settings_on_reconnect", bool);
        dq = a("skip_fetch_basic_settings_if_not_connected", bool);
        dr = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit2.toMillis(2L)));
        ds = a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(5L)));
        dt = a("idflrwbe", bool);
        du = a("falawpr", bool);
        dv = a("sort_query_parameters", bool);
        dw = k.g(timeUnit2, 10L, "communicator_request_timeout_ms");
        dx = a("communicator_request_retry_count", 3);
        dy = k.g(timeUnit2, 2L, "communicator_request_retry_delay_ms");
        dz = k.g(timeUnit2, 1L, "ehkpd_ms");
        dA = a("ad_session_minutes", 60);
        dB = a("session_tracking_cooldown_on_event_fire", bool2);
        dC = a("session_tracking_resumed_cooldown_minutes", 90L);
        dD = a("session_tracking_paused_cooldown_minutes", 90L);
        dE = a("dc_v2", bool);
        dF = a("dce", bool2);
        dG = a("qq", bool);
        dH = a("qq1", bool2);
        dI = a("qq2", bool2);
        dJ = a("qq3", bool2);
        dK = a("qq4", bool2);
        dL = a("qq5", bool2);
        dM = a("qq6", bool2);
        dN = a("qq7", bool2);
        dO = a("qq8", bool2);
        dP = a("qq9", bool);
        dQ = a("qq10", bool2);
        dR = a("qq11", bool2);
        dS = a("pui", bool2);
        dT = a("plugin_version", "");
        dU = a("hgn", bool);
        dV = a("cso", bool);
        dW = a("cfs", bool);
        dX = a("cmi", bool);
        dY = a("crat", bool);
        dZ = a("cvs", bool);
        f18722ea = a("caf", bool);
        f18723eb = a("cf", bool);
        f18724ec = a("cmtl", bool2);
        f18725ed = a("cnr", bool);
        ee = a("ccr", bool);
        ef = a("adr", bool);
        eg = a("volume_normalization_factor", Float.valueOf(6.6666665f));
        eh = a("system_user_agent_collection_enabled", bool);
        ei = a(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED, bool);
        ej = a("collect_device_angle", bool);
        ek = a("collect_device_movement", bool);
        el = a("movement_degradation", Float.valueOf(0.75f));
        em = a("device_sensor_period_ms", Integer.valueOf(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
        en = a("dte", bool2);
        eo = a("idcw", bool);
        ep = a("anr_debug_thread_refresh_time_ms", -1L);
        eq = a("fetch_basic_settings_delay_ms", 1500);
        er = a("dcttl_1_seconds", 5);
        es = a("dcttl_2_seconds", 30);
        et = a("dcttl_3_seconds", Integer.valueOf((int) timeUnit.toSeconds(1L)));
        eu = a("dcttl_4_seconds", Integer.valueOf((int) timeUnit.toSeconds(30L)));
        ev = a("dcttl_5_seconds", Integer.valueOf((int) TimeUnit.HOURS.toSeconds(1L)));
        ew = a("dcttl_6_seconds", Integer.valueOf((int) timeUnit3.toSeconds(1L)));
        ex = a("cclia", bool2);
        ey = a("lccdm", 10L);
        ez = a("lmfd", 2);
        eA = a("is_track_ad_info", bool2);
        eB = a("submit_ad_stats_enabled", bool);
        eC = a("submit_ad_stats_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        eD = a("submit_ad_stats_retry_count", 1);
        eE = a("submit_ad_stats_max_count", 500);
        eF = a("asdm", bool);
        eG = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        eH = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        eI = a("vast_max_response_length", 640000);
        eJ = a("vast_max_wrapper_depth", 5);
        eK = a("vast_unsupported_video_extensions", "ogv,flv");
        eL = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        eM = a("vast_validate_with_extension_if_no_video_type", bool2);
        eN = a("vast_video_selection_policy", Integer.valueOf(n.a.MEDIUM.ordinal()));
        eO = a("vast_wrapper_resolution_retry_count_v1", 1);
        eP = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        eQ = a("vast_industry_icon_max_size", 20);
        eR = a("vast_industry_icon_margin", 12);
        eS = a("vast_industry_icon_gravity", 85);
        eT = a("vast_native_mute_button_size", 24);
        eU = a("vast_native_play_pause_button_size", 24);
        eV = a("vast_native_video_widget_padding", 6);
        eW = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        eX = a("vast_native_video_widgets_enabled", bool2);
        eY = a("vast_replay_video_upon_completion", bool2);
        eZ = a("vast_replay_icon_size", 64);
        f18726fa = a("ree", bool2);
        f18727fb = a("btee", bool2);
        f18728fc = a("server_timestamp_ms", 0L);
        f18729fd = a("device_timestamp_ms", 0L);
        fe = a("gzip_min_length", 0);
        ff = a("gzip_encoding_default", bool);
        fg = a("fetch_settings_gzip", bool);
        fh = a("device_init_gzip", bool);
        fi = a("fetch_ad_gzip", bool);
        fj = a("event_tracking_gzip", bool);
        fk = a("submit_ad_stats_gzip", bool);
        fl = a("reward_postback_gzip", bool);
        fm = a("force_rerender", bool);
        fn = a("daostr", bool);
        fo = a("tctlaa", bool);
        fp = a("rwvdv", bool);
        fq = a("handle_render_process_gone", bool2);
        fr = a("rworpg", bool2);
        fs = a("fdadaomr", bool2);
        ft = a("teorpc", bool);
        fu = a("rmpibt", bool);
        fv = a("spbcioa", bool);
        fw = a("set_webview_render_process_client", bool);
        fx = a("disable_webview_hardware_acceleration", bool);
        fy = a("dsaovcf", bool);
        fz = a("daoar", bool);
        fA = a("anr_detection_enabled", bool);
        fB = a("anr_trigger_millis", 4000L);
        fC = a("anr_touch_millis", Long.valueOf(m.ag));
        fD = a("anr_check_millis", Long.valueOf(m.ag));
        fE = a("use_in_memory_signal_providers", bool);
        fF = a("uobid", bool2);
        fG = a("bvde", bool);
        fH = a("bvdidm", 1000L);
        fI = a("bvdim", 4000L);
        fJ = a("bvdrs", 10);
        fK = a("bvad", bool);
        fL = a("bvebb", bool2);
        fM = a("bvscb", bool2);
        fN = a("apsobt", bool2);
        fO = a("aetobt", bool);
        fP = a("tmtp", 10);
        fQ = a("uwtm", bool);
        fR = a("dwvvb", bool);
        fS = a("config_consent_dialog_state", "unknown");
        fT = a(com.anythink.expressad.foundation.g.a.bD, "");
        fU = a("consent_flow_doc_url", "https://dash.applovin.com/documentation/mediation/android/getting-started/integration#enabling-max-built-in-consent-flow");
        fV = a("consent_flow_unity_doc_url", "https://dash.applovin.com/documentation/mediation/unity/getting-started/integration#max-built-in-consent-flow");
        fW = a("cfadtml", 20);
        fX = a("cfdpu_advertising", "http://www.corp.aarki.com/privacy,https://www.adcolony.com/consumer-privacy/,https://www.adikteev.com/privacy-policy-eng,http://www.adtheorent.com/privacy-policy,https://www.affle.com/privacy-policy,https://www.affle.com/privacy-policy,https://www.amazon.com/gp/help/customer/display.html?nodeId=468496,https://www.appier.com/privacy-policy/,https://www.appnexus.com/en/company/privacy-policy,https://www.appodeal.com/privacy-policy/,https://www.beeswax.com/privacy.html,https://www.bidease.com/privacy-policy,http://www.bidence.com/page/pp,https://www.bigabid.com/Legal/,https://www.adsbigo.com/privacy.html,http://www.blis.com/privacy/,https://www.pangleglobal.com/privacy,https://www.cartaholdings.co.jp/en/privacy-policy/,https://www.answers.chartboost.com/en-us/articles/200780269,https://www.clearpier.com/privacy-policy/,https://www.criteo.com/privacy/,https://www.criteo.com/privacy/,https://www.dataseat.com/privacy-policy,https://www.legal.epsilon.com/us/NA-products-privacy-policy,https://www.nend.net/privacy/sdkpolicy,https://www.fyber.com/services-privacy-statement/,https://www.privacy-policy.cyberagent.ai/,https://www.policies.google.com/privacy,http://www.igaworks.com/en/rule_user.html,https://www.inmobi.com/privacy-policy/,https://www.adpf-info.i-mobile.co.jp/privacy_en/,https://www.is.com/privacy-policy/,https://www.jampp.com/privacy-policy-terms-and-conditions,https://www.jungroup.com/pp/,http://www.lifestreet.com/privacy/,https://www.liftoff.io/privacy-policy/,https://www.terms2.line.me/creators_privacy_policy,https://www.linkedin.com/legal/privacy-policy/,https://www.loopme.com/end-user-privacy-policy/,http://www.mediasmart.io/privacy-policy/,https://www.facebook.com/privacy/explanation/,https://www.legal.my.com/us/mytarget/privacy/,https://www.mintegral.com/en/privacy/#privacy-Services,http://www.molocoads.com/private-policy.html,https://www.motiv-i.com/en/privacy/,https://www.ogury.com/privacy-policy/,https://www.persona.ly/privacy_dsp,https://www.opera.com/privacy,http://www.permodo.com/de/privacy.html,https://www.pubmatic.com/legal/privacy/,https://www.kayzen.io/data-privacy-policy,https://www.remerge.io/privacy-policy.html,https://www.revx.io/privacy-policy,https://www.rtbhouse.com/privacy-center/services-privacy-policy/,https://www.sharethrough.com/privacy-center/advertising-platform-privacy-notice,https://www.simpli.fi/simpli-fi-services-privacy-policy/,https://www.smaato.com/privacy/,https://www.smadex.com/end-user-privacy-policy,https://www.snap.com/en-US/privacy/privacy-policy,https://www.stackadapt.com/privacy,https://www.start.io/policy/privacy-policy-site/,https://www.tapjoy.com/legal/general/privacy-policy/,https://www.taurusx.com/privacy-policy.html,https://www.rubiconproject.com/privacy-policy/,https://www.thetradedesk.com/general/privacy-policy,http://www.tpmn.io/en/privacy.html,https://www.appreciate.mobi/page.html#!/end-user-privacy-policy,https://www.twitter.com/privacy,http://www.ubimo.com/privacy/,https://www.uni-corn.net/privacy.html,https://www.unity3d.com/legal/privacy-policy,https://www.valassis.com/legal/privacy-policy/,https://www.pubnative.net/privacy-notice/,https://www.vungle.com/privacy/,http://www.widerplanet.com/policy/privacy,https://www.wildlifestudios.com/policy-center/privacy-policy/wildlife-studios-privacy-policy/,https://www.groundtruth.com/privacy-policy/,https://www.legal.yahoo.com/us/en/yahoo/privacy/index.html,https://www.yandex.com/legal/confidential/,https://www.youappi.com/privacy-policy,https://www.zucks.co.jp/en/privacy/");
        fY = a("cfdpu_analytics", "https://www.adjust.com/terms/privacy-policy/,https://www.appsflyer.com/legal/privacy-policy/,https://www.branch.io/policies/privacy-policy/,https://www.doubleverify.com/privacy/,https://www.integralads.com/privacy-policy/,https://www.justtrack.io/privacy-policy/,https://www.kochava.com/kochava-collective/collective-data-privacy-policy/,https://www.singular.net/privacy-policy/,https://www.tenjin.com/privacy/");
        fZ = a("communicator_enabled", bool2);
    }

    public b(String str, T t10) {
        if (str != null) {
            if (t10 != null) {
                this.f18730c = str;
                this.f18731d = t10;
                return;
            }
            throw new IllegalArgumentException("No default value specified");
        }
        throw new IllegalArgumentException("No name specified");
    }

    public static Collection<b<?>> c() {
        return Collections.synchronizedCollection(f18707b.values());
    }

    public String a() {
        return this.f18730c;
    }

    public T b() {
        return this.f18731d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof b) {
            return this.f18730c.compareTo(((b) obj).a());
        }
        return 0;
    }

    public T a(Object obj) {
        return (T) this.f18731d.getClass().cast(obj);
    }

    public static <T> b<T> a(String str, T t10) {
        if (t10 != null) {
            if (f18704a.contains(t10.getClass())) {
                b<T> bVar = new b<>(str, t10);
                Map<String, b<?>> map = f18707b;
                if (!map.containsKey(str)) {
                    map.put(str, bVar);
                    return bVar;
                }
                throw new IllegalArgumentException(f.b("Setting has already been used: ", str));
            }
            throw new IllegalArgumentException("Unsupported value type: " + t10.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }
}
