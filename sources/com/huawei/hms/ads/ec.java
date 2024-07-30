package com.huawei.hms.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.ppskit.utils.SdkSpFunctionWrapper;
import gb.e0;
import gb.h0;
import gb.r0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ec {
    private static final String A = "swipeDesc";
    private static final String B = "location_collected_switch";
    private static final String C = "splash_show_time";
    private static final String Code = "SpHandler";
    private static final String D = "slogan_show_time";
    private static final String E = "swipeDp";
    private static final String F = "splash_skip_area";
    private static final String G = "twistDesc";
    private static final String H = "twistDegree";
    private static final String I = "location_expire_time";
    private static final String J = "twistAcc";
    private static final String K = "proHeight";
    private static final String L = "cache_slogan_show_time_def";
    private static final String M = "proBotMargin";
    private static final String N = "proTextSize";
    private static final String O = "proRadius";
    private static final String P = "preRequest";
    private static final String Q = "clctCtxIntvl";
    private static final String R = "clctCtxMap";
    private static final String S = "splash_show_mode";
    private static final int T = 60;
    private static final String U = "clctCtxSize";
    private static final String V = "HiAdSharedPreferences";
    private static final int W = 200;
    private static final String X = "clctCtx";
    private static final String Y = "ads_core_selection";
    private static final String Z = "location_refresh_interval_time";

    /* renamed from: a, reason: collision with root package name */
    private static final String f21636a = "smart_screen_slogan_time";
    private static final String aA = "oaid_report_on_npa";
    private static final String aB = "shield_other_splash_fashion";
    private static final String aC = "splashInteractCloseEffectiveTime";
    private static final int aD = 85;
    private static final int aE = 119;
    private static final String aF = "notification_app_list";
    private static final String aG = "singleInstanceLSModelList";
    private static final String aH = "sha256";

    /* renamed from: aa, reason: collision with root package name */
    private static final String f21637aa = "test_country_code";

    /* renamed from: ab, reason: collision with root package name */
    private static final String f21638ab = "exsplash_slogan_start_time";

    /* renamed from: ac, reason: collision with root package name */
    private static final String f21639ac = "exsplash_slogan_show_time";

    /* renamed from: ad, reason: collision with root package name */
    private static final String f21640ad = "linked_content_id";
    private static final String ae = "exsplash_redundancy_time";
    private static final String af = "third_country_code";
    private static final String ag = "default_splash_mode";
    private static final String ah = "full_screen_notify";
    private static final String ai = "activate_notify_style";
    private static final String aj = "allow_ad_skip_time";
    private static final int ak = 0;
    private static final String al = "auto_open_forbidden";
    private static final String am = "has_restore_config";
    private static final String an = "ipcFlag";
    private static final int ao = 30;
    private static final String ap = "config_map";
    private static final String aq = "remindAgain";
    private static ec at = null;
    private static final byte[] av = new byte[0];
    private static final String az = "trust_app_list";

    /* renamed from: b, reason: collision with root package name */
    private static final String f21641b = "clct_ctx_time";

    /* renamed from: c, reason: collision with root package name */
    private static final String f21642c = "slogan_real_min_show_time";

    /* renamed from: d, reason: collision with root package name */
    private static final String f21643d = "splash_app_day_impfc";

    /* renamed from: e, reason: collision with root package name */
    private static final String f21644e = "today_show_times";
    private static final String f = "today_date";

    /* renamed from: g, reason: collision with root package name */
    private static final String f21645g = "config_refresh_interval";

    /* renamed from: h, reason: collision with root package name */
    private static final String f21646h = "config_refresh_last_time";

    /* renamed from: i, reason: collision with root package name */
    private static final String f21647i = "enable_user_info";

    /* renamed from: j, reason: collision with root package name */
    private static final String f21648j = "enable_share_pd";

    /* renamed from: k, reason: collision with root package name */
    private static final String f21649k = "no_show_ad_time";

    /* renamed from: l, reason: collision with root package name */
    private static final String f21650l = "img_size_upper_limit";

    /* renamed from: m, reason: collision with root package name */
    private static final String f21651m = "global_switch";

    /* renamed from: n, reason: collision with root package name */
    private static final String f21652n = "def_broswer_pkg_list";
    private static final String o = "ad_preload_interval";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21653p = "preload_splash_req_time_interval";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21654q = "min_banner_interval";

    /* renamed from: r, reason: collision with root package name */
    private static final String f21655r = "max_banner_interval";

    /* renamed from: s, reason: collision with root package name */
    private static final String f21656s = "default_banner_interval";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21657t = "country_code";

    /* renamed from: u, reason: collision with root package name */
    private static final String f21658u = "gif_time_lower_limit_frame";

    /* renamed from: v, reason: collision with root package name */
    private static final String f21659v = "limit_of_container_aspect_ratio";

    /* renamed from: w, reason: collision with root package name */
    private static final String f21660w = "testDeviceConfigRefreshInterval";

    /* renamed from: x, reason: collision with root package name */
    private static final String f21661x = "splashInteractCfg";
    private static final String y = "clickDesc";

    /* renamed from: z, reason: collision with root package name */
    private static final String f21662z = "clickExtraArea";
    private final SharedPreferences ar;
    private SharedPreferences as;
    private Map<String, String> au;
    private final byte[] aw = new byte[0];
    private String ax;
    private Context ay;

    private ec(Context context) {
        this.au = new HashMap();
        Context createDeviceProtectedStorageContext = context.getApplicationContext().createDeviceProtectedStorageContext();
        this.ay = createDeviceProtectedStorageContext;
        this.ar = createDeviceProtectedStorageContext.getSharedPreferences(V, 0);
        try {
            this.as = context.getSharedPreferences(V, 0);
        } catch (Throwable unused) {
            this.as = null;
            ex.I(Code, "create sp error.");
        }
        am();
        e0 e0Var = new e0(this.ay);
        if (ex.Code()) {
            ex.Code("CountryCodeBean", "countryCode: %s", e0Var.f28579a);
        }
        this.ax = e0Var.f28579a;
        this.au = (Map) gb.b.o(Map.class, ao(), new Class[0]);
    }

    public static ec Code(Context context) {
        return I(context);
    }

    private void am() {
        if (an()) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = this.as;
            if (sharedPreferences == null) {
                if (ex.Code()) {
                    ex.Code(Code, "there is no old config file");
                    return;
                }
                return;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            if (all != null && !all.isEmpty()) {
                Set<Map.Entry<String, ?>> entrySet = all.entrySet();
                if (entrySet != null && !entrySet.isEmpty()) {
                    SharedPreferences.Editor edit = this.ar.edit();
                    Iterator<Map.Entry<String, ?>> it = entrySet.iterator();
                    while (it.hasNext()) {
                        Code(it.next(), edit);
                    }
                    edit.commit();
                }
                B(true);
                return;
            }
            if (ex.Code()) {
                ex.Code(Code, "there is no old config file");
            }
        } catch (Throwable th) {
            e0.i.q(th, "restore config error:", Code);
        }
    }

    private boolean an() {
        boolean z10;
        synchronized (this.aw) {
            z10 = this.ar.getBoolean(am, false);
        }
        return z10;
    }

    private String ao() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(ap, "");
        }
        return string;
    }

    private String ap() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(f21651m, "");
        }
        return string;
    }

    private int aq() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(ag, 2);
        }
        return i10;
    }

    public int A() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(E));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 100;
        }
        return i10;
    }

    public void B(int i10) {
        synchronized (this.aw) {
            if (i10 > 0) {
                this.ar.edit().putInt(ae, i10).commit();
            }
        }
    }

    public long C() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(I, 1800000L);
        }
        return j10;
    }

    public int D() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(L, 0);
        }
        return i10;
    }

    public String E() {
        String str;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                str = gb.p.j(map.get(G));
            } else {
                str = null;
            }
        }
        return str;
    }

    public int F() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt("splash_skip_area", 0);
        }
        return i10;
    }

    public int G() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(H));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 15;
        }
        return i10;
    }

    public int H() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(J));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 5;
        }
        return i10;
    }

    public int I() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(S, aq());
        }
        return i10;
    }

    public int J() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(K));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 56;
        }
        return i10;
    }

    public int K() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(N));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 16;
        }
        return i10;
    }

    public int L() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(f21636a, 2000);
        }
        return i10;
    }

    public int M() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(O));
            } else {
                num = null;
            }
            if (num != null && num.intValue() > 0) {
                i10 = num.intValue();
            }
            i10 = 36;
        }
        return i10;
    }

    public int N() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            synchronized (this.aw) {
                Map<String, String> map = this.au;
                if (map != null) {
                    num = gb.p.g(map.get(Q));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() >= 0) {
                    i10 = num.intValue();
                }
                i10 = 60;
            }
        }
        return i10;
    }

    public int O() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            synchronized (this.aw) {
                Map<String, String> map = this.au;
                if (map != null) {
                    num = gb.p.g(map.get(U));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() > 0) {
                    i10 = num.intValue();
                }
                i10 = 200;
            }
        }
        return i10;
    }

    public Map<String, String> P() {
        Map<String, String> map;
        synchronized (this.aw) {
            synchronized (this.aw) {
                Map<String, String> map2 = this.au;
                if (map2 != null) {
                    map = (Map) gb.b.o(Map.class, map2.get(R), new Class[0]);
                } else {
                    map = null;
                }
            }
        }
        return map;
    }

    public Long Q() {
        Long valueOf;
        synchronized (this.aw) {
            valueOf = Long.valueOf(this.ar.getLong(f21638ab, 0L));
        }
        return valueOf;
    }

    public int R() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(f21639ac, 0);
        }
        return i10;
    }

    public long S() {
        long max;
        synchronized (this.aw) {
            max = Math.max(this.ar.getLong(Z, 1800000L), com.huawei.openalliance.ad.constant.w.as);
        }
        return max;
    }

    public String T() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(f21640ad, null);
        }
        return string;
    }

    public int U() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(ae, 100);
        }
        return i10;
    }

    public int V() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(C, com.huawei.openalliance.ad.constant.w.Z);
        }
        return i10;
    }

    public String W() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(af, this.ax);
        }
        return string;
    }

    public boolean X() {
        boolean z10;
        synchronized (this.aw) {
            z10 = this.ar.getBoolean("full_screen_notify", true);
        }
        return z10;
    }

    public int Y() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(ai, 0);
        }
        return i10;
    }

    public int Z() {
        int i10;
        synchronized (this.aw) {
            int i11 = 0;
            i10 = this.ar.getInt(S, 0);
            if (i10 == 0) {
                int aq2 = aq();
                if (aq2 != 1) {
                    i11 = aq2;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public int a() {
        int i10;
        int i11;
        synchronized (this.aw) {
            if (1 == I()) {
                i10 = D();
            } else {
                i10 = 2000;
            }
            if (h0.e(this.ay)) {
                i10 = L();
            }
            i11 = this.ar.getInt(D, i10);
        }
        return i11;
    }

    public int aa() {
        synchronized (this.aw) {
            if (!cl.Code(this.ay).V()) {
                return 0;
            }
            return this.ar.getInt(aA, 0);
        }
    }

    public int ab() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(aj, 0) * 1000;
        }
        return i10;
    }

    public boolean ac() {
        boolean z10;
        synchronized (this.aw) {
            z10 = this.ar.getBoolean(al, false);
        }
        return z10;
    }

    public int ad() {
        Integer num;
        synchronized (this.aw) {
            if (!a0.a.r(this.au)) {
                num = gb.p.g(this.au.get("preRequest"));
            } else {
                num = null;
            }
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
    }

    public boolean ae() {
        Integer num;
        boolean z10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(X));
            } else {
                num = null;
            }
            if (num != null) {
                z10 = true;
                if (num.intValue() == 1) {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public long af() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(f21641b, 0L);
        }
        return j10;
    }

    public int ag() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(aC, 30);
        }
        return i10;
    }

    public String ah() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(aB, "");
        }
        return string;
    }

    public Set<String> ai() {
        Set<String> stringSet;
        synchronized (this.aw) {
            stringSet = this.ar.getStringSet(aF, new HashSet());
        }
        return stringSet;
    }

    public boolean aj() {
        synchronized (this.aw) {
            if (h0.e(this.ay)) {
                ex.Code(Code, "isSingleMediaPlayerInstance, is tv");
                Set<String> stringSet = this.ar.getStringSet(aG, new HashSet());
                String d10 = gb.u.d("ro.product.model");
                if (TextUtils.isEmpty(d10)) {
                    d10 = Build.MODEL;
                }
                boolean z10 = true;
                if (!androidx.transition.n.h(stringSet) && !TextUtils.isEmpty(d10)) {
                    String upperCase = d10.toUpperCase(Locale.ENGLISH);
                    if (!androidx.transition.n.h(stringSet) && !TextUtils.isEmpty(upperCase)) {
                        z10 = stringSet.contains(upperCase);
                        return z10;
                    }
                    ex.Code("StrUtil", "ModelList or ModelName is empty");
                    return z10;
                }
                return true;
            }
            return false;
        }
    }

    public int ak() {
        int i10;
        int i11;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            i10 = 0;
            if (map != null && !TextUtils.isEmpty(map.get(an))) {
                try {
                    i11 = Integer.parseInt(this.au.get(an));
                } catch (NumberFormatException e10) {
                    ex.I("StrUtil", "parseIntOrDefault exception: ".concat(e10.getClass().getSimpleName()));
                }
                if (i11 != 0 || i11 == 1) {
                    i10 = i11;
                }
            }
            i11 = 0;
            if (i11 != 0) {
            }
            i10 = i11;
        }
        return i10;
    }

    public String al() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString("sha256", "");
        }
        return string;
    }

    public long b() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(f21642c, 300L);
        }
        return j10;
    }

    public int c() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(f21643d, 0);
        }
        return i10;
    }

    public int d() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(f21644e, 0);
        }
        return i10;
    }

    public String e() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(f, "");
        }
        return string;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.aw) {
            z10 = this.ar.getBoolean(f21647i, false);
        }
        return z10;
    }

    public boolean g() {
        boolean z10;
        synchronized (this.aw) {
            z10 = this.ar.getBoolean(f21648j, true);
        }
        return z10;
    }

    public long h() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(f21649k, 0L);
        }
        return j10;
    }

    public int i() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(f21645g, 360);
        }
        return i10;
    }

    public long j() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(f21646h, 0L);
        }
        return j10;
    }

    public boolean k() {
        Integer b10 = androidx.transition.n.b(1, 0, ap());
        if (b10 != null && b10.intValue() == 1) {
            return true;
        }
        return false;
    }

    public Set<String> l() {
        Set<String> stringSet;
        synchronized (this.aw) {
            stringSet = this.ar.getStringSet(f21652n, com.huawei.openalliance.ad.constant.z.Code);
        }
        return stringSet;
    }

    public int m() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(o, 0);
        }
        return i10;
    }

    public long n() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(f21654q, 30L);
        }
        return j10;
    }

    public long o() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getInt(f21656s, 60);
        }
        return j10;
    }

    public long p() {
        long j10;
        synchronized (this.aw) {
            j10 = this.ar.getLong(f21655r, 120L);
        }
        return j10;
    }

    public int q() {
        int i10;
        synchronized (this.aw) {
            i10 = this.ar.getInt(f21650l, 52428800);
        }
        return i10;
    }

    public String r() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString("country_code", null);
        }
        return string;
    }

    public float s() {
        float f10;
        synchronized (this.aw) {
            f10 = this.ar.getFloat(f21659v, 0.05f);
        }
        return f10;
    }

    public int t() {
        int i10;
        int i11 = 0;
        try {
            return ((Integer) SdkSpFunctionWrapper.class.getMethod("getAdsCoreSelection", new Class[0]).invoke(null, new Object[0])).intValue();
        } catch (Throwable unused) {
            ex.V(Code, "function wrapper not found");
            if (!cl.V(this.ay) && cl.Code(this.ay).V()) {
                return 1;
            }
            synchronized (this.aw) {
                String i12 = gb.u.i(this.ay, com.huawei.openalliance.ad.constant.w.bG);
                if (!TextUtils.isEmpty(i12)) {
                    if (com.huawei.openalliance.ad.constant.f.Z.equalsIgnoreCase(i12)) {
                        i10 = 1;
                    } else if (com.huawei.openalliance.ad.constant.f.B.equalsIgnoreCase(i12)) {
                        i10 = 0;
                    } else if (com.huawei.openalliance.ad.constant.f.C.equalsIgnoreCase(i12)) {
                        i10 = 2;
                    } else {
                        i10 = -1;
                    }
                    if (i10 != -1) {
                        return i10;
                    }
                }
                if (!cl.V(this.ay) || cl.Code(this.ay).V()) {
                    i11 = 1;
                }
                return this.ar.getInt(Y, i11);
            }
        }
    }

    public String u() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(f21637aa, "");
        }
        return string;
    }

    public int v() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            synchronized (this.aw) {
                Map<String, String> map = this.au;
                if (map != null) {
                    num = gb.p.g(map.get(f21660w));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() > 0) {
                    i10 = num.intValue();
                }
                i10 = 10;
            }
        }
        return i10;
    }

    public int w() {
        Integer num;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(f21661x));
            } else {
                num = null;
            }
            if (num != null && num.intValue() >= 0) {
                if (num.intValue() > 4) {
                    return 0;
                }
                return num.intValue();
            }
            return 0;
        }
    }

    public String x() {
        String str;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                str = gb.p.j(map.get(y));
            } else {
                str = null;
            }
        }
        return str;
    }

    public int y() {
        Integer num;
        int i10;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                num = gb.p.g(map.get(f21662z));
            } else {
                num = null;
            }
            if (num != null && num.intValue() >= 0 && num.intValue() <= 24) {
                i10 = num.intValue();
            }
            i10 = 3;
        }
        return i10;
    }

    public String z() {
        String str;
        synchronized (this.aw) {
            Map<String, String> map = this.au;
            if (map != null) {
                str = gb.p.j(map.get(A));
            } else {
                str = null;
            }
        }
        return str;
    }

    private static ec I(Context context) {
        ec ecVar;
        synchronized (av) {
            if (at == null) {
                at = new ec(context);
            }
            ecVar = at;
        }
        return ecVar;
    }

    public void B(String str) {
        synchronized (this.aw) {
            this.ar.edit().putString(aB, str).commit();
        }
    }

    public void C(int i10) {
        synchronized (this.aw) {
            this.ar.edit().putInt("splash_skip_area", i10).commit();
        }
    }

    public String Code() {
        String string;
        synchronized (this.aw) {
            string = this.ar.getString(az, "");
        }
        return string;
    }

    public void F(int i10) {
        synchronized (this.aw) {
            this.ar.edit().putInt(ai, i10).commit();
        }
    }

    public void S(int i10) {
        synchronized (this.aw) {
            this.ar.edit().putInt(ag, i10).commit();
        }
    }

    public int V(Context context) {
        int e10;
        int i10;
        synchronized (this.aw) {
            if (context == null) {
                int i11 = gb.z.f28648a;
                e10 = 0;
            } else {
                e10 = r0.e(context, gb.z.k(context));
            }
            boolean z10 = e10 >= 600;
            i10 = z10 ? 98 : 64;
            int i12 = z10 ? 119 : 85;
            Map<String, String> map = this.au;
            Integer g6 = map != null ? gb.p.g(map.get(M)) : null;
            if (g6 != null && g6.intValue() > 0 && g6.intValue() <= i12) {
                i10 = g6.intValue();
            }
        }
        return i10;
    }

    public void Z(int i10) {
        synchronized (this.aw) {
            if (i10 > 0) {
                this.ar.edit().putInt(f21639ac, i10).commit();
            }
        }
    }

    private void B(boolean z10) {
        synchronized (this.aw) {
            this.ar.edit().putBoolean(am, z10).commit();
        }
    }

    public void C(String str) {
        synchronized (this.aw) {
            this.ar.edit().putString("sha256", str).commit();
        }
    }

    public void Code(int i10) {
        synchronized (this.aw) {
            this.ar.edit().putInt(L, i10).commit();
        }
    }

    public void I(int i10) {
        synchronized (this.aw) {
            SharedPreferences.Editor edit = this.ar.edit();
            edit.putInt(o, i10);
            edit.commit();
        }
    }

    public void Z(String str) {
        synchronized (this.aw) {
            if (!gb.p.f(str)) {
                this.ar.edit().putString(af, str).commit();
            }
        }
    }

    public boolean B() {
        synchronized (this.aw) {
            return Integer.valueOf(this.ar.getInt(B, 0)).intValue() == 1;
        }
    }

    public void Code(long j10) {
        synchronized (this.aw) {
            this.ar.edit().putLong(f21646h, j10).commit();
        }
    }

    public void I(long j10) {
        synchronized (this.aw) {
            this.ar.edit().putLong(f21641b, j10).commit();
        }
    }

    public void Z(boolean z10) {
        synchronized (this.aw) {
            this.ar.edit().putBoolean(al, z10).commit();
        }
    }

    private void Code(SharedPreferences.Editor editor, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("trustAppList", jSONObject);
            Code(editor, az, jSONObject2.toString());
        } catch (JSONException unused) {
            ex.Z(Code, "putTrustAppList JSONException");
        }
    }

    public void I(String str) {
        synchronized (this.aw) {
            if (!TextUtils.isEmpty(str)) {
                this.ar.edit().putString(f21651m, str).commit();
            }
        }
    }

    public void V(int i10) {
        synchronized (this.aw) {
            this.ar.edit().putInt(f21636a, i10).commit();
        }
    }

    private void Code(SharedPreferences.Editor editor, String str, Integer num) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        }
    }

    public void I(boolean z10) {
        synchronized (this.aw) {
            this.ar.edit().putBoolean("full_screen_notify", z10).commit();
        }
    }

    public void V(long j10) {
        synchronized (this.aw) {
            if (j10 > 0) {
                this.ar.edit().putLong(f21638ab, j10).commit();
            }
        }
    }

    private void Code(SharedPreferences.Editor editor, String str, Integer num, int i10) {
        if (num != null) {
            editor.putInt(str, num.intValue());
        } else {
            editor.putInt(str, i10);
        }
    }

    private void V(SharedPreferences.Editor editor, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            editor.putString(ap, jSONObject.toString());
            this.au = (Map) gb.b.o(Map.class, jSONObject.toString(), new Class[0]);
        } catch (JSONException unused) {
            ex.Z(Code, "putConfigMap JSONException");
        }
    }

    private void Code(SharedPreferences.Editor editor, String str, Long l10) {
        if (l10 != null) {
            editor.putLong(str, l10.longValue());
        }
    }

    public void V(String str) {
        synchronized (this.aw) {
            if (!TextUtils.isEmpty(str)) {
                this.ar.edit().putString(f21640ad, str).commit();
            }
        }
    }

    private void Code(SharedPreferences.Editor editor, String str, String str2) {
        if (str2 != null) {
            editor.putString(str, str2);
        }
    }

    public void V(boolean z10) {
        synchronized (this.aw) {
            this.ar.edit().putBoolean(f21648j, z10).commit();
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public void Code(AppConfigRsp appConfigRsp) {
        synchronized (this.aw) {
            SharedPreferences.Editor edit = this.ar.edit();
            edit.putLong(I, appConfigRsp.o().longValue());
            edit.putLong(Z, appConfigRsp.q().longValue());
            edit.putInt(B, appConfigRsp.p());
            edit.putInt(C, appConfigRsp.b());
            Code(edit, S, appConfigRsp.h());
            edit.putInt("splash_skip_area", appConfigRsp.e());
            if (h0.e(this.ay)) {
                Code(edit, D, appConfigRsp.a());
            } else {
                Code(edit, D, appConfigRsp.a(), 2000);
            }
            edit.putLong(f21642c, appConfigRsp.j());
            edit.putInt(f21643d, appConfigRsp.f());
            Code(edit, f21645g, appConfigRsp.d());
            edit.putLong(f21646h, System.currentTimeMillis());
            edit.putString(f21651m, appConfigRsp.g());
            edit.putLong(f21653p, appConfigRsp.l());
            edit.putFloat(f21659v, (float) appConfigRsp.r());
            Code(edit, f21654q, appConfigRsp.m());
            Code(edit, f21655r, appConfigRsp.n());
            Code(edit, Y, appConfigRsp.s());
            edit.putString(f21637aa, appConfigRsp.t());
            V(edit, appConfigRsp.u());
            Code(edit, f21656s, appConfigRsp.v());
            Code(edit, appConfigRsp.i());
            Code(edit, aA, appConfigRsp.w());
            Code(edit, aj, appConfigRsp.x());
            Code(edit, aC, appConfigRsp.y());
            Code(appConfigRsp.z());
            Code(edit, "sha256", appConfigRsp.A());
            List<String> k10 = appConfigRsp.k();
            if (!androidx.transition.n.h(k10)) {
                edit.putStringSet(f21652n, new HashSet(k10));
            }
            edit.commit();
        }
    }

    public void Code(String str) {
        synchronized (this.aw) {
            if (!TextUtils.isEmpty(str)) {
                this.ar.edit().putString("country_code", str).commit();
            }
        }
    }

    public void Code(List<String> list) {
        HashSet hashSet;
        synchronized (this.aw) {
            if (!androidx.transition.n.h(list)) {
                if (androidx.transition.n.h(list)) {
                    hashSet = null;
                } else {
                    HashSet hashSet2 = new HashSet();
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet2.add(it.next().toUpperCase(Locale.ENGLISH));
                    }
                    hashSet = hashSet2;
                }
                this.ar.edit().putStringSet(aG, hashSet).commit();
            }
        }
    }

    private void Code(Map.Entry<String, ?> entry, SharedPreferences.Editor editor) {
        if (entry == null || editor == null) {
            return;
        }
        Object value = entry.getValue();
        String key = entry.getKey();
        if (value instanceof Integer) {
            editor.putInt(key, ((Integer) value).intValue());
            return;
        }
        if (value instanceof Boolean) {
            editor.putBoolean(key, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Long) {
            editor.putLong(key, ((Long) value).longValue());
            return;
        }
        if (value instanceof Float) {
            editor.putFloat(key, ((Float) value).floatValue());
        } else if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Set) {
            editor.putStringSet(key, new HashSet((Set) value));
        }
    }

    public void Code(Set<String> set) {
        synchronized (this.aw) {
            SharedPreferences.Editor edit = this.ar.edit();
            if (androidx.transition.n.h(set)) {
                edit.putStringSet(aF, null);
            } else {
                edit.putStringSet(aF, set);
            }
            edit.commit();
        }
    }

    public void Code(boolean z10) {
        synchronized (this.aw) {
            this.ar.edit().putBoolean(f21647i, z10).commit();
        }
    }
}
