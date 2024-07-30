package com.huawei.openalliance.ad.ppskit.handlers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ExSplashCacheBlockList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ExsplashUndismissList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FlowControl;
import com.huawei.openalliance.ad.ppskit.beans.metadata.LandpageAppWhiteList;
import com.huawei.openalliance.ad.ppskit.beans.metadata.LandpageWebBlackList;
import com.huawei.openalliance.ad.ppskit.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import ka.Cif;
import ka.n7;
import ka.p6;
import ka.x9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l implements p6 {

    /* renamed from: t, reason: collision with root package name */
    public static l f22583t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f22584u = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final Context f22587c;

    /* renamed from: d, reason: collision with root package name */
    public String f22588d;

    /* renamed from: e, reason: collision with root package name */
    public String f22589e;
    public LandpageAppWhiteList f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22590g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f22591h;

    /* renamed from: i, reason: collision with root package name */
    public ExsplashUndismissList f22592i;

    /* renamed from: j, reason: collision with root package name */
    public final String f22593j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f22594k;

    /* renamed from: l, reason: collision with root package name */
    public ExSplashCacheBlockList f22595l;

    /* renamed from: m, reason: collision with root package name */
    public final String f22596m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f22597n;
    public LandpageWebBlackList o;

    /* renamed from: p, reason: collision with root package name */
    public final String f22598p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f22599q;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f22601s;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22585a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22586b = new byte[0];

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f22600r = new HashMap();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Serializable C = a0.a.C(l.this.f22590g);
            if (C != null && (C instanceof LandpageAppWhiteList)) {
                synchronized (l.this.f22591h) {
                    l.this.f = (LandpageAppWhiteList) C;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Serializable C = a0.a.C(l.this.f22598p);
            if (C != null && (C instanceof LandpageWebBlackList)) {
                synchronized (l.this.f22599q) {
                    l.this.o = (LandpageWebBlackList) C;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Serializable C = a0.a.C(l.this.f22593j);
            if (C != null && (C instanceof ExsplashUndismissList)) {
                synchronized (l.this.f22594k) {
                    l.this.f22592i = (ExsplashUndismissList) C;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Serializable C = a0.a.C(l.this.f22596m);
            if (C != null && (C instanceof ExSplashCacheBlockList)) {
                synchronized (l.this.f22597n) {
                    l.this.f22595l = (ExSplashCacheBlockList) C;
                }
            }
        }
    }

    public l(Context context) {
        byte[] bArr = new byte[0];
        this.f22591h = bArr;
        byte[] bArr2 = new byte[0];
        this.f22594k = bArr2;
        byte[] bArr3 = new byte[0];
        this.f22597n = bArr3;
        byte[] bArr4 = new byte[0];
        this.f22599q = bArr4;
        this.f22601s = true;
        Context createDeviceProtectedStorageContext = context.getApplicationContext().createDeviceProtectedStorageContext();
        this.f22587c = createDeviceProtectedStorageContext;
        this.f22601s = Cif.a(createDeviceProtectedStorageContext).d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(createDeviceProtectedStorageContext.getFilesDir());
        String str = File.separator;
        this.f22590g = a3.l.q(sb2, str, com.huawei.openalliance.ad.constant.w.f22161i, str, "sp.config");
        this.f22598p = createDeviceProtectedStorageContext.getFilesDir() + str + com.huawei.openalliance.ad.constant.w.f22161i + str + "black.config";
        this.f22593j = createDeviceProtectedStorageContext.getFilesDir() + str + com.huawei.openalliance.ad.constant.w.f22161i + str + "exsplash.config";
        this.f22596m = createDeviceProtectedStorageContext.getFilesDir() + str + com.huawei.openalliance.ad.constant.w.f22161i + str + "exsplashCacheBlock.config";
        synchronized (bArr) {
            this.f = new LandpageAppWhiteList();
        }
        synchronized (bArr4) {
            this.o = new LandpageWebBlackList();
        }
        synchronized (bArr2) {
            this.f22592i = new ExsplashUndismissList();
        }
        synchronized (bArr3) {
            this.f22595l = new ExSplashCacheBlockList();
        }
        p2.a(new a(), 0);
        p2.a(new b(), 0);
        p2.a(new c(), 0);
        p2.a(new d(), 0);
    }

    public static l d(Context context) {
        l lVar;
        synchronized (f22584u) {
            if (f22583t == null) {
                f22583t = new l(context);
            }
            lVar = f22583t;
        }
        return lVar;
    }

    public static void f(SharedPreferences.Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    public final int A(String str) {
        Integer num;
        int i10;
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, false);
            if (!a0.a.e0(K)) {
                num = y1.q(K.get("preloadArInterval"));
            } else {
                num = null;
            }
            if (num != null && num.intValue() >= 0) {
                i10 = num.intValue();
            }
            i10 = 10;
        }
        return i10;
    }

    public final int B(String str) {
        int i10;
        synchronized (this.f22585a) {
            i10 = G(str).getInt("ite_ad_exp", 0);
        }
        return i10;
    }

    public final int C(String str) {
        Integer num;
        int i10;
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, true);
            if (K != null && !a0.a.e0(K)) {
                num = y1.q(K.get("useNetworkKit"));
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
        }
        return i10;
    }

    public final boolean D(String str) {
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, true);
            if (K != null && !TextUtils.isEmpty(K.get("allowRptCtxTag"))) {
                return "1".equals(K.get("allowRptCtxTag"));
            }
            return false;
        }
    }

    public final boolean E(String str) {
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, true);
            if (K != null && !TextUtils.isEmpty(K.get("allowRptAud"))) {
                return "1".equals(K.get("allowRptAud"));
            }
            return false;
        }
    }

    public final int F(String str) {
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, true);
            if (K == null || TextUtils.isEmpty(K.get("lrMaxAds"))) {
                return 3;
            }
            String str2 = K.get("lrMaxAds");
            if (y1.h(str2)) {
                return 3;
            }
            int l10 = y1.l(3, str2);
            if (l10 <= 0) {
                return 3;
            }
            return l10;
        }
    }

    public final SharedPreferences G(String str) {
        return this.f22587c.getSharedPreferences("HiAd_sp_" + str, 4);
    }

    public final int H(String str) {
        int i10;
        synchronized (this.f22585a) {
            i10 = G(str).getInt("validity_native_event", 2880) * com.huawei.openalliance.ad.constant.w.f22171t;
        }
        return i10;
    }

    public final boolean I(int i10, String str) {
        synchronized (this.f22585a) {
            boolean z10 = false;
            Map<String, String> K = K(str, false);
            if (K == null || y1.h(K.get("mediaClctSwitch"))) {
                return true;
            }
            Integer q10 = androidx.transition.n.q(i10, 0, K.get("mediaClctSwitch"));
            if (i10 == 0) {
                return oa.f.f33791a.equals(q10);
            }
            boolean m10 = com.huawei.openalliance.ad.ppskit.utils.d0.m(this.f22587c);
            if (oa.f.f33794d.equals(q10)) {
                return true;
            }
            if (m10 && oa.f.f33792b.equals(q10)) {
                return true;
            }
            if (!m10 && oa.f.f33793c.equals(q10)) {
                z10 = true;
            }
            return z10;
        }
    }

    public final String J(String str) {
        String string;
        synchronized (this.f22585a) {
            string = G(str).getString("global_switch", "");
        }
        return string;
    }

    public final Map<String, String> K(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        synchronized (this.f22585a) {
            if (!a0.a.e0(this.f22600r) && !a0.a.e0((Map) this.f22600r.get(str)) && !z10) {
                return (Map) this.f22600r.get(str);
            }
            Map<String, String> map = (Map) y0.o(null, G(str).getString("config_map", ""), Map.class, new Class[0]);
            if (!a0.a.e0(map)) {
                this.f22600r.put(str, map);
            }
            return map;
        }
    }

    public final int L(String str) {
        Integer q10 = androidx.transition.n.q(5, 0, J(str));
        if (q10 != null) {
            return q10.intValue();
        }
        return 1;
    }

    public final void M(String str) {
        synchronized (this.f22585a) {
            G(str).edit().putInt("supImageFormat", 0).apply();
        }
    }

    public final int N(String str) {
        int i10;
        synchronized (this.f22585a) {
            i10 = G(str).getInt("gif_size_upper_limit", 104857600);
        }
        return i10;
    }

    public final int O(String str) {
        int i10;
        synchronized (this.f22585a) {
            i10 = G(str).getInt("img_size_upper_limit", 52428800);
        }
        return i10;
    }

    public final void P(String str, String str2) {
        synchronized (this.f22585a) {
            String str3 = "0";
            if (!TextUtils.isEmpty(str2)) {
                Map map = (Map) y0.o(null, str2, Map.class, new Class[0]);
                if (!a0.a.e0(map)) {
                    str3 = (String) map.get("insreCacheAdEnable");
                }
            }
            G(str).edit().putBoolean("insreCacheAdEnable", TextUtils.equals(str3, "1")).commit();
        }
    }

    public final FlowControl Q(String str, String str2) {
        if (y1.h(str2)) {
            n7.e("SpHandler", "slot is empty");
            return null;
        }
        synchronized (this.f22585a) {
            String string = G(str).getString(str2, null);
            if (y1.h(string)) {
                return null;
            }
            return (FlowControl) y0.o(null, string, FlowControl.class, new Class[0]);
        }
    }

    public final boolean R(String str) {
        boolean z10;
        synchronized (this.f22585a) {
            if (Math.abs(System.currentTimeMillis() - G(str).getLong("ad_no_wifi_remind_time", 0L)) > G(str).getInt("ad_no_wifi_block_time", 7) * 86400000) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void S(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this.f22585a) {
            SharedPreferences.Editor edit = G(str).edit();
            String concat = "last_callMethod_".concat(str2);
            HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            edit.putLong(concat, System.currentTimeMillis()).commit();
        }
    }

    public final boolean a(String str) {
        synchronized (this.f22591h) {
            LandpageAppWhiteList landpageAppWhiteList = this.f;
            if (landpageAppWhiteList != null) {
                return landpageAppWhiteList.c(str);
            }
            return true;
        }
    }

    public final boolean b(String str) {
        synchronized (this.f22599q) {
            LandpageWebBlackList landpageWebBlackList = this.o;
            if (landpageWebBlackList != null) {
                return landpageWebBlackList.b(str);
            }
            return false;
        }
    }

    public final boolean c(String str) {
        boolean z10;
        synchronized (this.f22585a) {
            z10 = false;
            if (G(str).getInt("landpage_app_prompt", 0) == 1) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void e(SharedPreferences.Editor editor, String str) {
        Context context = this.f22587c;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trustAppList", jSONObject);
                if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
                    SharedPreferences.Editor edit = G(context.getPackageName()).edit();
                    String jSONObject3 = jSONObject2.toString();
                    if (jSONObject3 != null) {
                        edit.putString("trust_app_list", jSONObject3);
                    }
                    edit.commit();
                    return;
                }
                String jSONObject4 = jSONObject2.toString();
                if (jSONObject4 != null) {
                    editor.putString("trust_app_list", jSONObject4);
                }
            } catch (JSONException unused) {
                n7.i("SpHandler", "putTrustAppList JSONException");
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final void g(String str, AppConfigRsp appConfigRsp) {
        String string;
        synchronized (this.f22585a) {
            SharedPreferences.Editor edit = G(str).edit();
            Integer A = appConfigRsp.A();
            if (A != null && A.intValue() > 0) {
                f(edit, "splash_cache_num", A);
            }
            f(edit, "validity_splash_event", appConfigRsp.w0());
            f(edit, "validity_click_skip", appConfigRsp.x0());
            f(edit, "validity_native_event", appConfigRsp.y0());
            synchronized (this.f22585a) {
                string = G(str).getString("reduce_disturb_rule", null);
            }
            edit.putString("reduce_disturb_rule", appConfigRsp.i0(string));
            edit.putString("global_switch", appConfigRsp.z0());
            edit.putInt("gif_size_upper_limit", appConfigRsp.j0(N(str)));
            edit.putInt("img_size_upper_limit", appConfigRsp.l0(O(str)));
            edit.putLong("splash_show_time_interval", appConfigRsp.k0());
            edit.putLong("config_refresh_last_time", System.currentTimeMillis());
            f(edit, "config_refresh_interval", appConfigRsp.v0());
            f(edit, "show_landing_page_menu", appConfigRsp.t0());
            f(edit, "landpage_app_prompt", appConfigRsp.u0());
            edit.putLong("preload_splash_req_time_interval", appConfigRsp.B0());
            edit.putInt("splash_app_day_impfc", appConfigRsp.b());
            edit.putInt("splash_show_time", appConfigRsp.o0());
            f(edit, "splash_show_mode", appConfigRsp.p0());
            edit.putInt(ba.H, appConfigRsp.q0());
            if (com.huawei.openalliance.ad.ppskit.utils.m.Z(this.f22587c)) {
                f(edit, "slogan_show_time", appConfigRsp.n0());
            } else {
                Integer n02 = appConfigRsp.n0();
                if (n02 != null) {
                    edit.putInt("slogan_show_time", n02.intValue());
                } else {
                    edit.putInt("slogan_show_time", 2000);
                }
            }
            edit.putLong("slogan_real_min_show_time", appConfigRsp.m0());
            edit.putInt("splash_app_day_impfc", appConfigRsp.b());
            edit.putLong("location_expire_time", appConfigRsp.p().longValue());
            edit.putLong("location_refresh_interval_time", appConfigRsp.r().longValue());
            edit.putInt("location_collected_switch", appConfigRsp.q());
            f(edit, "need_notify_kit_when_request", appConfigRsp.u());
            f(edit, "ex_splash_delay", appConfigRsp.x());
            edit.putString("test_country_code", appConfigRsp.F());
            x(edit, str, appConfigRsp.E());
            ConfigSpHandler.b(this.f22587c).C(appConfigRsp.E());
            edit.putString("app_list", appConfigRsp.G());
            f(edit, "support_gzip", appConfigRsp.H());
            f(edit, "support_sdk_server_gzip", appConfigRsp.K());
            f(edit, "reward_gain_time_percent", appConfigRsp.O());
            f(edit, "ite_ad_close_tm", appConfigRsp.U());
            f(edit, "ite_ad_fs", appConfigRsp.W());
            f(edit, "ite_ad_exp", appConfigRsp.X());
            f(edit, "ite_ad_ca", appConfigRsp.Y());
            f(edit, "reward_close_btn_percent", appConfigRsp.a0());
            e(edit, appConfigRsp.a());
            f(edit, "oaid_report_on_npa", appConfigRsp.b0());
            String c02 = appConfigRsp.c0();
            if (c02 != null) {
                edit.putString(ba.au, c02);
            }
            String d02 = appConfigRsp.d0();
            if (d02 != null) {
                edit.putString("splashFeedbackBtnText", d02);
            }
            f(edit, "splashInteractCloseEffectiveTime", appConfigRsp.e0());
            f(edit, "fc_switch", appConfigRsp.g0());
            List<String> k10 = appConfigRsp.k();
            if (!androidx.transition.n.M(k10)) {
                edit.putStringSet("scheme_info", new HashSet(k10));
            } else {
                edit.putStringSet("scheme_info", null);
            }
            synchronized (this.f22591h) {
                Serializable C = a0.a.C(this.f22590g);
                if (C != null && (C instanceof LandpageAppWhiteList)) {
                    this.f = (LandpageAppWhiteList) C;
                }
                this.f.a(appConfigRsp.n());
            }
            synchronized (this.f22599q) {
                this.o.a(appConfigRsp.C0());
            }
            synchronized (this.f22594k) {
                this.f22592i.a(appConfigRsp.N());
            }
            synchronized (this.f22597n) {
                this.f22595l.a(appConfigRsp.P());
            }
            p2.a(new o(this), 0);
            p2.a(new h(this), 0);
            p2.a(new i(this), 0);
            p2.a(new j(this), 0);
            List<String> A0 = appConfigRsp.A0();
            if (!androidx.transition.n.M(A0)) {
                edit.putStringSet("def_broswer_pkg_list", new HashSet(A0));
            }
            edit.commit();
            x9.a(this.f22587c).c(str);
        }
    }

    public final void h(String str, Object obj) {
        String string;
        if (obj == null) {
            n7.b("SpHandler", "allowed video codec is null");
            return;
        }
        String obj2 = obj.toString();
        synchronized (this.f22585a) {
            string = G(str).getString("supportVideoCodec", "");
        }
        if (y1.h(string)) {
            n7.b("SpHandler", "put support video codec");
            int codecCount = MediaCodecList.getCodecCount();
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt.isEncoder()) {
                    hashSet.addAll(Arrays.asList(codecInfoAt.getSupportedTypes()));
                }
            }
            string = y1.e(new ArrayList(hashSet));
            synchronized (this.f22585a) {
                SharedPreferences.Editor edit = G(str).edit();
                edit.putString("supportVideoCodec", string);
                edit.commit();
            }
        }
        if (y1.h(string)) {
            n7.b("SpHandler", "support video codec is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(obj2)) {
            String[] split = obj2.split("\\|");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (string.contains(str2)) {
                        n7.c("SpHandler", "support video codec: %s", str2);
                        arrayList.add(str2);
                    }
                }
            }
        }
        q1.m(this.f22587c).r(arrayList);
    }

    public final void i(String str, String str2, FlowControl flowControl) {
        String str3;
        String str4;
        if (!y1.h(str2) && flowControl != null) {
            String q10 = y0.q(null, flowControl);
            if (y1.h(q10)) {
                str3 = "SpHandler";
                str4 = "fc to json failed";
            } else {
                n7.f("SpHandler", "fc para:%s", q10);
                synchronized (this.f22585a) {
                    G(str).edit().putString(str2, q10).commit();
                }
                return;
            }
        } else {
            str3 = "SpHandler";
            str4 = "fc para null";
        }
        n7.e(str3, str4);
    }

    public final boolean j(int i10, String str, String str2) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        synchronized (this.f22585a) {
            long j10 = G(str).getLong("last_callMethod_".concat(str2), 0L);
            if (j10 <= 0) {
                return false;
            }
            Map<String, String> K = K(str, true);
            if (K != null) {
                i10 = y1.l(i10, K.get("Intv_".concat(str2)));
            }
            HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            if (System.currentTimeMillis() < j10 + (i10 * com.huawei.openalliance.ad.constant.w.f22171t)) {
                z10 = true;
            }
            return z10;
        }
    }

    public final boolean k() {
        SharedPreferences sharedPreferences;
        synchronized (this.f22585a) {
            try {
                sharedPreferences = this.f22587c.getSharedPreferences("HiAdSharedPreferences", 4);
            } catch (Throwable th) {
                n7.g("SpHandler", "getPreferences er: ".concat(th.getClass().getSimpleName()));
                sharedPreferences = null;
            }
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean("enable_user_info", true);
            }
            return false;
        }
    }

    public final String l(String str) {
        String string;
        synchronized (this.f22585a) {
            string = G(str).getString("test_country_code", "");
        }
        return string;
    }

    public final boolean m(String str) {
        boolean z10;
        synchronized (this.f22585a) {
            z10 = false;
            if (G(str).getInt("support_gzip", 0) == 1) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean n(String str) {
        boolean z10;
        synchronized (this.f22585a) {
            z10 = G(str).getBoolean("insreCacheAdEnable", false);
        }
        return z10;
    }

    public final boolean o(String str) {
        boolean z10;
        synchronized (this.f22585a) {
            String str2 = "1";
            Map<String, String> K = K(str, false);
            if (!a0.a.e0(K)) {
                str2 = K.get("rptRepeatedEvt");
            }
            z10 = !TextUtils.equals(str2, "0");
        }
        return z10;
    }

    public final int p(String str) {
        Integer num;
        int i10;
        synchronized (this.f22585a) {
            synchronized (this.f22585a) {
                Map<String, String> K = K(str, false);
                if (!a0.a.e0(K)) {
                    num = y1.q(K.get("clctSdkApplistIntval"));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() > 0) {
                    i10 = num.intValue();
                }
                i10 = 1440;
            }
        }
        return i10;
    }

    public final boolean q(String str) {
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, false);
            if (!a0.a.e0(K)) {
                String str2 = K.get("clctSdkAppListSwitchNew");
                if (TextUtils.equals(str2, "1")) {
                    return true;
                }
                if (TextUtils.equals(str2, "0")) {
                    return false;
                }
                if (TextUtils.equals(str2, "2")) {
                    return Cif.c(this.f22587c);
                }
                if (TextUtils.equals(str2, "3")) {
                    return !Cif.c(this.f22587c);
                }
            }
            return Cif.a(this.f22587c).d();
        }
    }

    public final String r(String str) {
        String str2;
        synchronized (this.f22585a) {
            boolean d10 = Cif.a(this.f22587c).d();
            boolean m10 = com.huawei.openalliance.ad.ppskit.utils.d0.m(this.f22587c);
            boolean c10 = Cif.c(this.f22587c);
            if (d10 && !c10 && !m10) {
                if (G(str).getBoolean("app_ad_limit_key", false)) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                return str2;
            }
            return null;
        }
    }

    public final Integer s(String str) {
        Integer valueOf;
        synchronized (this.f22585a) {
            valueOf = Integer.valueOf(G(str).getInt("consent_result_status", -1));
        }
        return valueOf;
    }

    public final boolean t(String str) {
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, false);
            if (!a0.a.e0(K)) {
                String str2 = K.get("devCntListClctSwitch");
                if (TextUtils.equals(str2, "1")) {
                    return true;
                }
                if (TextUtils.equals(str2, "0")) {
                    return false;
                }
            }
            return false;
        }
    }

    public final int u(String str) {
        Integer num;
        int max;
        synchronized (this.f22585a) {
            Map<String, String> K = K(str, false);
            if (!a0.a.e0(K)) {
                num = y1.q(K.get("devCntListMaxSize"));
            } else {
                num = null;
            }
            if (num == null) {
                max = 20;
            } else {
                max = Math.max(0, Math.min(num.intValue(), 50));
            }
        }
        return max;
    }

    public final long v(String str) {
        long longValue;
        Long s10;
        synchronized (this.f22585a) {
            Long l10 = 600000L;
            Map<String, String> K = K(str, false);
            if (K != null && K.get("cacheRefreshIntvl") != null && (s10 = y1.s(K.get("cacheRefreshIntvl"))) != null && s10.longValue() > 0) {
                l10 = Long.valueOf(s10.longValue() * 1000);
            }
            longValue = l10.longValue();
        }
        return longValue;
    }

    public final long w(String str) {
        long longValue;
        Long s10;
        synchronized (this.f22585a) {
            Long l10 = 50400000L;
            Map<String, String> K = K(str, false);
            if (K != null && K.get("insreCacheValidPeriod") != null && (s10 = y1.s(K.get("insreCacheValidPeriod"))) != null && s10.longValue() > 0) {
                l10 = Long.valueOf(s10.longValue() * 60000);
            }
            longValue = l10.longValue();
        }
        return longValue;
    }

    public final void x(SharedPreferences.Editor editor, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        HashMap hashMap = this.f22600r;
        if (!isEmpty) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String jSONObject2 = jSONObject.toString();
                if (jSONObject2 != null) {
                    editor.putString("config_map", jSONObject2);
                }
                Map map = (Map) y0.o(null, jSONObject.toString(), Map.class, new Class[0]);
                if (!a0.a.e0(map)) {
                    hashMap.put(str, map);
                }
                h(str, jSONObject.get("allowedVideoCodec"));
                return;
            } catch (JSONException unused) {
                n7.i("SpHandler", "putConfigMap JSONException");
                return;
            }
        }
        editor.remove("config_map");
        hashMap.remove(str);
    }

    public final void y(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this.f22585a) {
            this.f22589e = str2;
            SharedPreferences.Editor edit = G(str).edit();
            edit.putString("pps_store", str2);
            edit.commit();
        }
    }

    public final boolean z(String str) {
        boolean z10;
        synchronized (this.f22585a) {
            z10 = G(str).getBoolean("consent_need_consent", true);
        }
        return z10;
    }
}
