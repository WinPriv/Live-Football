package com.anythink.core.common.e;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ac implements Serializable {
    String[] A;
    String[] B;
    String[] C;
    String[] D;
    String[] E;
    Map<Integer, String[]> F;
    String[] G;
    String[] H;
    String I;
    String J;
    String K;
    String L;
    String M;
    String N;
    String O;
    String P;
    String Q;
    String R;
    String S;
    String T;
    String U;
    String V;
    String W;
    String X;
    String Y;
    String Z;

    /* renamed from: a, reason: collision with root package name */
    String f5423a;

    /* renamed from: aa, reason: collision with root package name */
    String f5424aa;

    /* renamed from: ab, reason: collision with root package name */
    String f5425ab;

    /* renamed from: ac, reason: collision with root package name */
    String f5426ac;

    /* renamed from: ad, reason: collision with root package name */
    String f5427ad;
    String ae;
    String af;
    String ag;
    String ah;
    String ai;
    String aj;
    String ak;
    String al;
    String am;
    String an;
    String[] ao;
    String ap;

    /* renamed from: b, reason: collision with root package name */
    String[] f5428b;

    /* renamed from: c, reason: collision with root package name */
    String[] f5429c;

    /* renamed from: d, reason: collision with root package name */
    String[] f5430d;

    /* renamed from: e, reason: collision with root package name */
    String[] f5431e;
    String[] f;

    /* renamed from: g, reason: collision with root package name */
    String[] f5432g;

    /* renamed from: h, reason: collision with root package name */
    String[] f5433h;

    /* renamed from: i, reason: collision with root package name */
    String[] f5434i;

    /* renamed from: j, reason: collision with root package name */
    String[] f5435j;

    /* renamed from: k, reason: collision with root package name */
    String[] f5436k;

    /* renamed from: l, reason: collision with root package name */
    String[] f5437l;

    /* renamed from: m, reason: collision with root package name */
    String[] f5438m;

    /* renamed from: n, reason: collision with root package name */
    String[] f5439n;
    String[] o;

    /* renamed from: p, reason: collision with root package name */
    String[] f5440p;

    /* renamed from: q, reason: collision with root package name */
    String[] f5441q;

    /* renamed from: r, reason: collision with root package name */
    String[] f5442r;

    /* renamed from: s, reason: collision with root package name */
    String[] f5443s;

    /* renamed from: t, reason: collision with root package name */
    String[] f5444t;

    /* renamed from: u, reason: collision with root package name */
    String[] f5445u;

    /* renamed from: v, reason: collision with root package name */
    String[] f5446v;

    /* renamed from: w, reason: collision with root package name */
    String[] f5447w;

    /* renamed from: x, reason: collision with root package name */
    String[] f5448x;
    String[] y;

    /* renamed from: z, reason: collision with root package name */
    String[] f5449z;

    public static final ac a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            ac acVar = new ac();
            acVar.f5423a = jSONObject.optString("ks");
            acVar.f5428b = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("nurl"));
            acVar.f5429c = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("imp"));
            acVar.f5430d = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("click"));
            acVar.f5431e = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vstart"));
            acVar.f = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("v25"));
            acVar.f5432g = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("v50"));
            acVar.f5433h = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("v75"));
            acVar.f5434i = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("v100"));
            acVar.f5435j = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vpaused"));
            acVar.f5436k = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vclick"));
            acVar.f5437l = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vmute"));
            acVar.f5438m = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vunmute"));
            acVar.f5439n = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("ec_show"));
            acVar.o = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("ec_close"));
            acVar.f5440p = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("apk_dl_star"));
            acVar.f5441q = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("apk_dl_end"));
            acVar.f5442r = com.anythink.core.common.k.h.a(jSONObject.optJSONArray(com.anythink.expressad.foundation.d.h.cM));
            acVar.f5443s = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vresumed"));
            acVar.f5444t = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vskip"));
            acVar.f5445u = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vfail"));
            acVar.f5446v = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("apk_start_install"));
            acVar.f5447w = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("dp_start"));
            acVar.f5448x = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("dp_succ"));
            acVar.y = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("app_install"));
            acVar.f5449z = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("app_uninstall"));
            acVar.A = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("app_unknow"));
            acVar.C = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("dp_inst_fail"));
            acVar.B = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("dp_uninst_fail"));
            acVar.D = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vd_succ"));
            acVar.E = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vrewarded"));
            JSONArray optJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (optJSONArray != null) {
                acVar.F = new HashMap();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    int optInt = optJSONObject.optInt("play_sec");
                    acVar.F.put(Integer.valueOf(optInt), com.anythink.core.common.k.h.a(optJSONObject.optJSONArray("list")));
                }
            }
            acVar.G = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("load_success"));
            acVar.H = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("load_fail"));
            acVar.I = jSONObject.optString("tp_nurl");
            acVar.J = jSONObject.optString("tp_imp");
            acVar.K = jSONObject.optString("tp_click");
            acVar.L = jSONObject.optString("tp_vstart");
            acVar.M = jSONObject.optString("tp_v25");
            acVar.N = jSONObject.optString("tp_v50");
            acVar.O = jSONObject.optString("tp_v75");
            acVar.P = jSONObject.optString("tp_v100");
            acVar.Q = jSONObject.optString("tp_vpaused");
            acVar.R = jSONObject.optString("tp_vclick");
            acVar.S = jSONObject.optString("tp_vmute");
            acVar.T = jSONObject.optString("tp_vunmute");
            acVar.U = jSONObject.optString("tp_ec_show");
            acVar.V = jSONObject.optString("tp_ec_close");
            acVar.W = jSONObject.optString("tp_apk_dl_star");
            acVar.X = jSONObject.optString("tp_apk_dl_end");
            acVar.Y = jSONObject.optString("tp_apk_install");
            acVar.Z = jSONObject.optString("tp_vresumed");
            acVar.f5424aa = jSONObject.optString("tp_vskip");
            acVar.f5425ab = jSONObject.optString("tp_vfail");
            acVar.f5426ac = jSONObject.optString("tp_apk_start_install");
            acVar.f5427ad = jSONObject.optString("tp_dp_start");
            acVar.ae = jSONObject.optString("tp_dp_succ");
            acVar.af = jSONObject.optString("tp_app_install");
            acVar.ag = jSONObject.optString("tp_app_uninstall");
            acVar.ah = jSONObject.optString("tp_app_unknow");
            acVar.aj = jSONObject.optString("tp_dp_inst_fail");
            acVar.ai = jSONObject.optString("tp_dp_uninst_fail");
            acVar.ak = jSONObject.optString("tp_vd_succ");
            acVar.al = jSONObject.optString("tp_vrewarded");
            acVar.am = jSONObject.optString("tp_load_success");
            acVar.an = jSONObject.optString("tp_load_fail");
            acVar.ao = com.anythink.core.common.k.h.a(jSONObject.optJSONArray("vready"));
            acVar.ap = jSONObject.optString("tp_ready");
            return acVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String A() {
        return this.J;
    }

    public final String B() {
        return this.K;
    }

    public final String C() {
        return this.L;
    }

    public final String D() {
        return this.M;
    }

    public final String E() {
        return this.N;
    }

    public final String F() {
        return this.O;
    }

    public final String G() {
        return this.P;
    }

    public final String H() {
        return this.Q;
    }

    public final String I() {
        return this.R;
    }

    public final String J() {
        return this.S;
    }

    public final String K() {
        return this.T;
    }

    public final String L() {
        return this.U;
    }

    public final String M() {
        return this.V;
    }

    public final String N() {
        return this.W;
    }

    public final String O() {
        return this.X;
    }

    public final String P() {
        return this.Y;
    }

    public final String[] Q() {
        return this.f5443s;
    }

    public final String[] R() {
        return this.f5444t;
    }

    public final String[] S() {
        return this.f5445u;
    }

    public final String[] T() {
        return this.f5446v;
    }

    public final String[] U() {
        return this.f5447w;
    }

    public final String[] V() {
        return this.f5448x;
    }

    public final String[] W() {
        return this.y;
    }

    public final String[] X() {
        return this.f5449z;
    }

    public final String[] Y() {
        return this.A;
    }

    public final String Z() {
        return this.Z;
    }

    public final String aa() {
        return this.f5424aa;
    }

    public final String ab() {
        return this.f5425ab;
    }

    public final String ac() {
        return this.f5426ac;
    }

    public final String ad() {
        return this.f5427ad;
    }

    public final String ae() {
        return this.ae;
    }

    public final String af() {
        return this.af;
    }

    public final String ag() {
        return this.ag;
    }

    public final String ah() {
        return this.ah;
    }

    public final String ai() {
        return this.ai;
    }

    public final String aj() {
        return this.aj;
    }

    public final String ak() {
        return this.ak;
    }

    public final String al() {
        return this.al;
    }

    public final String am() {
        return this.am;
    }

    public final String an() {
        return this.an;
    }

    public final String[] ao() {
        return this.ao;
    }

    public final String ap() {
        return this.ap;
    }

    public final void b(String[] strArr) {
        this.f5440p = strArr;
    }

    public final void c(String[] strArr) {
        this.f5441q = strArr;
    }

    public final void d(String[] strArr) {
        this.f5442r = strArr;
    }

    public final String[] e() {
        return this.f5429c;
    }

    public final String[] f() {
        return this.f5430d;
    }

    public final String[] g() {
        return this.f5431e;
    }

    public final String[] h() {
        return this.f;
    }

    public final String[] i() {
        return this.f5432g;
    }

    public final String[] j() {
        return this.f5433h;
    }

    public final String[] k() {
        return this.f5434i;
    }

    public final String[] l() {
        return this.f5435j;
    }

    public final String[] m() {
        return this.f5436k;
    }

    public final String[] n() {
        return this.f5437l;
    }

    public final String[] o() {
        return this.f5438m;
    }

    public final String[] p() {
        return this.f5439n;
    }

    public final String[] q() {
        return this.o;
    }

    public final String[] r() {
        return this.f5440p;
    }

    public final String[] s() {
        return this.f5441q;
    }

    public final String[] t() {
        return this.f5442r;
    }

    public final String[] u() {
        return this.B;
    }

    public final String[] v() {
        return this.C;
    }

    public final String[] w() {
        return this.D;
    }

    public final String[] x() {
        return this.E;
    }

    public final Map<Integer, String[]> y() {
        return this.F;
    }

    public final String z() {
        return this.I;
    }

    public final String[] b() {
        return this.H;
    }

    public final String c() {
        return this.f5423a;
    }

    public final String[] d() {
        return this.f5428b;
    }

    public final void a(String[] strArr) {
        this.f5430d = strArr;
    }

    public final String[] a() {
        return this.G;
    }
}
