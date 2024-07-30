package com.anythink.expressad.d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.d;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.w;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private int A;
    private String B;
    private long C;
    private int D;
    private long E;
    private long F;
    private int G;
    private int H;
    private int I;
    private String J;
    private String K;
    private int L;
    private List<com.anythink.expressad.foundation.d.c> M;
    private List<com.anythink.expressad.foundation.d.b> N;
    private int R;
    private LinkedList<String> S;
    private int Y;
    private List<String> Z;
    private int aE;
    private long aG;
    private long aH;
    private int aI;
    private int aJ;
    private long aK;
    private int aM;

    /* renamed from: aa, reason: collision with root package name */
    private int f7102aa;

    /* renamed from: ab, reason: collision with root package name */
    private int f7103ab;

    /* renamed from: ac, reason: collision with root package name */
    private int f7104ac;

    /* renamed from: ad, reason: collision with root package name */
    private int f7105ad;
    private String ae;
    private String af;
    private String ao;

    /* renamed from: b, reason: collision with root package name */
    private String f7106b;
    private Map<String, C0093a> be;
    private b bg;
    private String bl;
    private String bm;

    /* renamed from: c, reason: collision with root package name */
    private long f7111c;

    /* renamed from: d, reason: collision with root package name */
    private int f7112d;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7114g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f7115h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7116i;

    /* renamed from: j, reason: collision with root package name */
    private long f7117j;

    /* renamed from: l, reason: collision with root package name */
    private List<c> f7119l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7120m;

    /* renamed from: n, reason: collision with root package name */
    private long f7121n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private long f7122p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7123q;

    /* renamed from: r, reason: collision with root package name */
    private int f7124r;

    /* renamed from: s, reason: collision with root package name */
    private int f7125s;

    /* renamed from: t, reason: collision with root package name */
    private int f7126t;

    /* renamed from: u, reason: collision with root package name */
    private long f7127u;

    /* renamed from: v, reason: collision with root package name */
    private List<String> f7128v;

    /* renamed from: w, reason: collision with root package name */
    private int f7129w;

    /* renamed from: x, reason: collision with root package name */
    private int f7130x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f7131z;

    /* renamed from: a, reason: collision with root package name */
    private int f7101a = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f7113e = com.anythink.expressad.d.a.b.aT;

    /* renamed from: k, reason: collision with root package name */
    private String f7118k = "";
    private boolean O = false;
    private int P = 3;
    private boolean Q = true;
    private int T = 0;
    private int U = com.anythink.expressad.d.a.b.ck;
    private int V = 10;
    private int W = 120;
    private String X = "";
    private int ag = 1;
    private int ah = 1;
    private int ai = 1;
    private int aj = 0;
    private int ak = 1;
    private String al = "";
    private int am = 0;
    private int an = 2;
    private int ap = 86400;
    private String aq = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKAJ7eXHM==";
    private String ar = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKsYFh=";
    private int as = 1;
    private int at = 30;
    private int au = 5;
    private int av = 0;
    private int aw = 0;
    private int ax = 9377;
    private int ay = 0;
    private int az = 0;
    private int aA = 0;
    private int aB = 2;
    private int aC = 10;
    private List<Integer> aD = new ArrayList();
    private int aF = 1;
    private int aL = 3;
    private String aN = "";
    private String aO = "";
    private String aP = "";
    private String aQ = "";
    private String aR = "";
    private int aS = 0;
    private int aT = 21600;
    private int aU = 2;
    private int aV = 0;
    private int aW = 0;
    private int aX = 604800;
    private int aY = 0;
    private String aZ = "";

    /* renamed from: ba, reason: collision with root package name */
    private String f7107ba = "";

    /* renamed from: bb, reason: collision with root package name */
    private String f7108bb = "";

    /* renamed from: bc, reason: collision with root package name */
    private String f7109bc = "";

    /* renamed from: bd, reason: collision with root package name */
    private String f7110bd = "";
    private int bf = 0;
    private int bh = 0;
    private String bi = "";
    private int bj = 2;
    private int bk = 7200;
    private int bn = 0;
    private boolean bo = false;
    private int bp = 1;
    private int bq = 0;
    private int br = 0;
    private int bs = 0;
    private int bt = 3;
    private int bu = 600;
    private int bv = 10;

    /* renamed from: com.anythink.expressad.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0093a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f7132a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f7133b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f7134c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f7135d;

        private List<String> a() {
            return this.f7132a;
        }

        private List<String> b() {
            return this.f7133b;
        }

        private List<String> c() {
            return this.f7134c;
        }

        private List<String> d() {
            return this.f7135d;
        }

        private void a(List<String> list) {
            this.f7132a = list;
        }

        private void b(List<String> list) {
            this.f7133b = list;
        }

        private void c(List<String> list) {
            this.f7134c = list;
        }

        private void d(List<String> list) {
            this.f7135d = list;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f7132a = h.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f7133b = h.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray(ContentRecord.WIDTH);
                if (optJSONArray3 != null) {
                    this.f7134c = h.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray(ContentRecord.HEIGHT);
                if (optJSONArray4 != null) {
                    this.f7135d = h.a(optJSONArray4);
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f7136a;

        /* renamed from: b, reason: collision with root package name */
        private String f7137b;

        /* renamed from: c, reason: collision with root package name */
        private String f7138c;

        /* renamed from: d, reason: collision with root package name */
        private JSONArray f7139d;

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context g6 = n.a().g();
            bVar.f7136a = jSONObject.optString("title", g6.getString(i.a(g6, "anythink_cm_feedback_dialog_title", i.f10128g)));
            bVar.f7137b = jSONObject.optString(com.anythink.expressad.d.a.b.dO, g6.getString(i.a(g6, "anythink_cm_feedback_dialog_close_close", i.f10128g)));
            bVar.f7138c = jSONObject.optString(com.anythink.expressad.d.a.b.dP, g6.getString(i.a(g6, "anythink_cm_feedback_dialog_close_submit", i.f10128g)));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            bVar.f7139d = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.f7139d = jSONArray;
                jSONArray.put(g6.getString(i.a(g6, "anythink_cm_feedback_dialog_content_stuck", i.f10128g)));
                bVar.f7139d.put(g6.getString(i.a(g6, "anythink_cm_feedback_dialog_content_cnr", i.f10128g)));
                bVar.f7139d.put(g6.getString(i.a(g6, "anythink_cm_feedback_dialog_content_balck_screen", i.f10128g)));
                bVar.f7139d.put(g6.getString(i.a(g6, "anythink_cm_feedback_dialog_content_other", i.f10128g)));
            }
            return bVar;
        }

        public final String b() {
            return this.f7137b;
        }

        public final String c() {
            return this.f7138c;
        }

        public final JSONArray d() {
            return this.f7139d;
        }

        private void b(String str) {
            this.f7137b = str;
        }

        private void c(String str) {
            this.f7138c = str;
        }

        public final String a() {
            return this.f7136a;
        }

        private void a(String str) {
            this.f7136a = str;
        }

        private void a(JSONArray jSONArray) {
            this.f7139d = jSONArray;
        }
    }

    private void A(int i10) {
        this.f7126t = i10;
    }

    private void B(int i10) {
        this.A = i10;
    }

    private void C(int i10) {
        this.f7130x = i10;
    }

    private void D(int i10) {
        this.y = i10;
    }

    private void E(int i10) {
        this.f7131z = i10;
    }

    private void F(int i10) {
        this.aL = i10;
    }

    private void G(int i10) {
        this.aI = i10;
    }

    private void H(int i10) {
        this.aJ = i10;
    }

    private void I(int i10) {
        this.f = i10;
    }

    private void J(int i10) {
        this.f7124r = i10;
    }

    private void K(int i10) {
        this.f7125s = i10;
    }

    private void L(int i10) {
        this.aY = i10;
    }

    private void M(int i10) {
        this.aS = i10;
    }

    private void N(int i10) {
        this.aT = i10;
    }

    private void O(int i10) {
        this.aU = i10;
    }

    private void P(int i10) {
        this.aV = i10;
    }

    private void Q(int i10) {
        this.aW = i10;
    }

    private void R(int i10) {
        this.aX = i10;
    }

    private void S(int i10) {
        this.at = i10;
    }

    private void T(int i10) {
        this.au = i10;
    }

    private void U(int i10) {
        this.av = i10;
    }

    private void V(int i10) {
        this.aw = i10;
    }

    private void W(int i10) {
        this.ax = i10;
    }

    private int X() {
        return this.R;
    }

    private List<com.anythink.expressad.foundation.d.b> Y() {
        return this.N;
    }

    private String Z() {
        return this.X;
    }

    private int aA() {
        return this.aE;
    }

    private int aB() {
        return this.Y;
    }

    private List<String> aC() {
        return this.Z;
    }

    private int aD() {
        return this.f7102aa;
    }

    private int aE() {
        return this.f7103ab;
    }

    private int aF() {
        return this.f7104ac;
    }

    private int aG() {
        return this.f7105ad;
    }

    private String aH() {
        return this.ae;
    }

    private int aI() {
        return this.G;
    }

    private int aJ() {
        return this.H;
    }

    private List<com.anythink.expressad.foundation.d.c> aK() {
        return this.M;
    }

    private int aL() {
        return this.I;
    }

    private String aM() {
        return this.J;
    }

    private int aN() {
        return this.D;
    }

    private long aO() {
        return this.E;
    }

    private long aP() {
        return this.F;
    }

    private long aQ() {
        return this.C * 1000;
    }

    private int aR() {
        return this.f7126t;
    }

    private String aS() {
        return this.B;
    }

    private int aT() {
        return this.f7130x;
    }

    private int aU() {
        return this.y;
    }

    private int aV() {
        return this.f7131z;
    }

    private int aW() {
        return this.aL;
    }

    private long aX() {
        return this.aK;
    }

    private int aY() {
        return this.aI;
    }

    private int aZ() {
        return this.aJ;
    }

    private int aa() {
        return this.V;
    }

    private LinkedList<String> ab() {
        return this.S;
    }

    private int ac() {
        return this.f7101a;
    }

    private int ad() {
        return this.T;
    }

    private int ae() {
        return this.U * 1000;
    }

    private int af() {
        return this.aC;
    }

    private int ag() {
        return this.ay;
    }

    private int ah() {
        return this.az;
    }

    private int ai() {
        return this.aA;
    }

    private int aj() {
        return this.aB;
    }

    private int ak() {
        return this.as;
    }

    private String al() {
        return this.aq;
    }

    private String am() {
        return this.ar;
    }

    private int an() {
        return this.ap;
    }

    private int ao() {
        return this.an;
    }

    private String ap() {
        return this.ao;
    }

    private int aq() {
        return this.ag;
    }

    private int ar() {
        return this.ah;
    }

    private int as() {
        return this.ai;
    }

    private int at() {
        return this.aj;
    }

    private int au() {
        return this.ak;
    }

    private String av() {
        return this.al;
    }

    private int aw() {
        return this.am;
    }

    private int ax() {
        return this.L;
    }

    private String ay() {
        return this.K;
    }

    private int az() {
        return this.aF;
    }

    private int bA() {
        return this.aX;
    }

    private String bB() {
        return this.f7109bc;
    }

    private String bC() {
        return this.f7110bd;
    }

    private Map<String, C0093a> bD() {
        return this.be;
    }

    private boolean bE() {
        if (!TextUtils.isEmpty(this.aZ) && !TextUtils.isEmpty(this.f7108bb) && !TextUtils.isEmpty(this.f7107ba)) {
            return true;
        }
        return false;
    }

    private int bF() {
        return this.at;
    }

    private int bG() {
        return this.au;
    }

    private int bH() {
        return this.av;
    }

    private int bI() {
        return this.aw;
    }

    private int bJ() {
        return this.ax;
    }

    private boolean bK() {
        return this.O;
    }

    private int bL() {
        return this.P;
    }

    private boolean bM() {
        return this.Q;
    }

    private int bN() {
        return this.bh;
    }

    private String bO() {
        return this.bi;
    }

    private int bP() {
        return this.bj;
    }

    private int bQ() {
        return this.bk;
    }

    private String bR() {
        return this.bm;
    }

    private int bS() {
        return this.bn;
    }

    private boolean bT() {
        return this.bo;
    }

    private int bU() {
        return this.bq;
    }

    private long ba() {
        return this.f7122p;
    }

    private long bb() {
        return this.o;
    }

    private String bc() {
        return this.f7106b;
    }

    private long bd() {
        return this.f7111c;
    }

    private int be() {
        return this.f7112d;
    }

    private long bf() {
        return this.f7113e;
    }

    private int bg() {
        return this.f;
    }

    private List<c> bh() {
        return this.f7119l;
    }

    private String bi() {
        return this.af;
    }

    private String bj() {
        return this.f7118k;
    }

    private long bk() {
        return this.f7117j;
    }

    private Map<String, String> bl() {
        return this.f7115h;
    }

    private boolean bm() {
        return this.f7114g;
    }

    private boolean bn() {
        return this.f7116i;
    }

    private int bo() {
        return this.f7124r;
    }

    private int bp() {
        return this.f7125s;
    }

    private static boolean bq() {
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            a b10 = com.anythink.expressad.d.b.b();
            if (b10 == null) {
                return true;
            }
            return b10.f7114g;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    private String br() {
        return this.aQ;
    }

    private boolean bs() {
        if (!TextUtils.isEmpty(this.aN) && !TextUtils.isEmpty(this.aO) && !TextUtils.isEmpty(this.aP) && !TextUtils.isEmpty(this.aQ)) {
            return true;
        }
        return false;
    }

    private boolean bt() {
        if (!TextUtils.isEmpty(this.aN) && !TextUtils.isEmpty(this.aO) && !TextUtils.isEmpty(this.aP) && !TextUtils.isEmpty(this.aR)) {
            return true;
        }
        return false;
    }

    private int bu() {
        return this.aY;
    }

    private int bv() {
        return this.aS;
    }

    private int bw() {
        return this.aT;
    }

    private int bx() {
        return this.aU;
    }

    private int by() {
        return this.aV;
    }

    private int bz() {
        return this.aW;
    }

    private void d(String str) {
        this.X = str;
    }

    private void g(int i10) {
        this.V = i10;
    }

    private void h(int i10) {
        this.T = i10;
    }

    private void i(int i10) {
        this.U = i10;
    }

    private void j(int i10) {
        this.aD.add(Integer.valueOf(i10));
    }

    private boolean k(int i10) {
        return this.aD.contains(Integer.valueOf(i10));
    }

    private void l(int i10) {
        this.as = i10;
    }

    private void m(int i10) {
        this.ap = i10;
    }

    private void n(int i10) {
        this.an = i10;
    }

    private void o(int i10) {
        this.aF = i10;
    }

    private void p(int i10) {
        this.aE = i10;
    }

    private void q(int i10) {
        this.Y = i10;
    }

    private void r(int i10) {
        this.f7102aa = i10;
    }

    private void s(int i10) {
        this.f7103ab = i10;
    }

    private void t(int i10) {
        this.f7104ac = i10;
    }

    private void u(int i10) {
        this.f7105ad = i10;
    }

    private void v(int i10) {
        this.G = i10;
    }

    private void w(int i10) {
        this.H = i10;
    }

    private void x(int i10) {
        this.I = i10;
    }

    private void y(int i10) {
        this.D = i10;
    }

    private void z(int i10) {
        this.F = i10;
    }

    public final void a() {
        this.R = 10;
    }

    public final int b() {
        return this.W;
    }

    public final void c() {
        this.f7101a = 0;
    }

    public final void e(int i10) {
        this.aA = i10;
    }

    public final void f(int i10) {
        this.aB = i10;
    }

    public final String toString() {
        return "cc=" + this.f7106b + " upal=" + this.f7111c + " cfc=" + this.f7112d + " getpf=" + this.f7113e + " uplc=" + this.f + " rurl=" + this.f7120m;
    }

    private void X(int i10) {
        this.P = i10;
    }

    private void Y(int i10) {
        this.bf = i10;
    }

    private void Z(int i10) {
        this.bh = i10;
    }

    private void aa(int i10) {
        this.bj = i10;
    }

    private void ab(int i10) {
        this.bk = i10;
    }

    private void ac(int i10) {
        this.bp = i10;
    }

    private void ad(int i10) {
        this.br = i10;
    }

    private void ae(int i10) {
        this.bs = i10;
    }

    private void af(int i10) {
        this.bt = i10;
    }

    private void ag(int i10) {
        this.bu = i10;
    }

    private void ah(int i10) {
        this.bv = i10;
    }

    private void e(String str) {
        this.aq = str;
    }

    private void f(String str) {
        this.ar = str;
    }

    private void g(String str) {
        this.ao = str;
    }

    private void k(String str) {
        this.B = str;
    }

    public final void A() {
        this.f7112d = 1;
    }

    public final void B() {
        this.f7116i = true;
    }

    public final String C() {
        return this.aN;
    }

    public final String D() {
        return this.aO;
    }

    public final String E() {
        return this.aP;
    }

    public final String F() {
        return this.aR;
    }

    public final void G() {
        String language = Locale.getDefault().getLanguage();
        if (!((TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) ? false : true)) {
            if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.V)) {
                this.aN = "确认关闭？";
                this.aO = "关闭后您将不会获得任何奖励噢~ ";
                this.aP = "确认关闭";
                this.aQ = "继续观看";
            } else {
                this.aN = "Confirm to close? ";
                this.aO = "You will not be rewarded after closing the window";
                this.aP = "Close it";
                this.aQ = "Continue";
            }
        }
        if ((TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) ? false : true) {
            return;
        }
        if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.V)) {
            this.aN = "确认关闭？";
            this.aO = "关闭后您将不会获得任何奖励噢~ ";
            this.aP = "确认关闭";
            this.aR = "继续试玩";
            return;
        }
        this.aN = "Confirm to close? ";
        this.aO = "You will not be rewarded after closing the window";
        this.aP = "Close it";
        this.aR = "Continue";
    }

    public final String H() {
        return this.aZ;
    }

    public final String I() {
        return this.f7107ba;
    }

    public final String J() {
        return this.f7108bb;
    }

    public final int K() {
        return this.bf;
    }

    public final b L() {
        return this.bg;
    }

    public final String M() {
        return this.bl;
    }

    public final void N() {
        this.bn = 0;
    }

    public final void O() {
        this.bo = false;
    }

    public final int P() {
        return this.bp;
    }

    public final void Q() {
        this.bq = 1;
    }

    public final String R() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.d.a.b.f7168h, this.f7106b);
            jSONObject.put(com.anythink.expressad.d.a.b.f7172l, this.f7111c);
            jSONObject.put(com.anythink.expressad.d.a.b.f7173m, this.f7112d);
            jSONObject.put(com.anythink.expressad.d.a.b.f7175p, this.f);
            jSONObject.put(com.anythink.expressad.d.a.b.f7182w, this.f7114g);
            jSONObject.put(com.anythink.expressad.d.a.b.o, this.f7116i);
            jSONObject.put("plct", this.f7121n);
            jSONObject.put(com.anythink.expressad.d.a.b.B, this.o);
            jSONObject.put(com.anythink.expressad.d.a.b.C, this.f7120m);
            jSONObject.put(com.anythink.expressad.d.a.b.G, this.f7123q);
            jSONObject.put("plctb", this.f7127u);
            jSONObject.put(com.anythink.expressad.d.a.b.f7142ab, this.aG);
            jSONObject.put(com.anythink.expressad.d.a.b.f7143ac, this.aH);
            jSONObject.put(com.anythink.expressad.d.a.b.af, this.y);
            jSONObject.put(com.anythink.expressad.d.a.b.ag, this.f7131z);
            jSONObject.put(com.anythink.expressad.d.a.b.f7169i, this.J);
            jSONObject.put(com.anythink.expressad.d.a.b.f7170j, this.K);
            jSONObject.put(com.anythink.expressad.d.a.b.f7171k, this.L);
            jSONObject.put(com.anythink.expressad.d.a.b.ai, this.aK);
            jSONObject.put(com.anythink.expressad.d.a.b.f7141aa, this.f7130x);
            jSONObject.put(com.anythink.expressad.d.a.b.aG, this.F);
            jSONObject.put(com.anythink.expressad.d.a.b.aE, this.D);
            jSONObject.put(com.anythink.expressad.d.a.b.aF, this.E);
            jSONObject.put(com.anythink.expressad.d.a.b.ae, this.aJ);
            jSONObject.put(com.anythink.expressad.d.a.b.bn, this.aL);
            jSONObject.put(com.anythink.expressad.d.a.b.bv, this.aF);
            jSONObject.put("iex", this.I);
            jSONObject.put(com.anythink.expressad.d.a.b.ao, this.G);
            jSONObject.put(com.anythink.expressad.d.a.b.ap, this.H);
            jSONObject.put(com.anythink.expressad.d.a.b.at, this.aM);
            jSONObject.put(com.anythink.expressad.d.a.b.al, this.aE);
            jSONObject.put("pf", this.Y);
            jSONObject.put(com.anythink.expressad.d.a.b.aA, this.f7102aa);
            jSONObject.put(com.anythink.expressad.d.a.b.aB, this.ae);
            jSONObject.put(com.anythink.expressad.d.a.b.ax, this.f7103ab);
            jSONObject.put(com.anythink.expressad.d.a.b.ay, this.f7104ac);
            jSONObject.put(com.anythink.expressad.d.a.b.az, this.f7105ad);
            jSONObject.put(com.anythink.expressad.d.a.b.f7144ad, this.aI);
            jSONObject.put(com.anythink.expressad.d.a.b.bE, this.ah);
            jSONObject.put(com.anythink.expressad.d.a.b.bF, this.ag);
            jSONObject.put(com.anythink.expressad.d.a.b.bG, this.ai);
            jSONObject.put(com.anythink.expressad.d.a.b.bH, this.aj);
            jSONObject.put(com.anythink.expressad.d.a.b.bI, this.ak);
            jSONObject.put(com.anythink.expressad.d.a.b.bK, this.am);
            jSONObject.put(com.anythink.expressad.d.a.b.bJ, this.al);
            jSONObject.put(com.anythink.expressad.d.a.b.bV, this.an);
            jSONObject.put(com.anythink.expressad.d.a.b.bY, this.ap);
            jSONObject.put(com.anythink.expressad.d.a.b.cO, this.f7101a);
            jSONObject.put(com.anythink.expressad.d.a.b.cT, this.bi);
            jSONObject.put(com.anythink.expressad.d.a.b.di, this.W);
            jSONObject.put(com.anythink.expressad.d.a.b.dg, this.V);
            jSONObject.put(com.anythink.expressad.d.a.b.dw, this.bo);
            jSONObject.put(com.anythink.expressad.d.a.b.dt, this.bn);
            jSONObject.put("isDefault", this.bq);
            return jSONObject.toString();
        } catch (Throwable th) {
            o.d("Setting", th.getMessage());
            return null;
        }
    }

    public final int S() {
        return this.br;
    }

    public final int T() {
        return this.bs;
    }

    public final int U() {
        return this.bt;
    }

    public final int V() {
        return this.bu;
    }

    public final int W() {
        return this.bv;
    }

    public final void a(int i10) {
        this.W = i10;
    }

    public final void b(int i10) {
        if (i10 > 0) {
            this.aC = i10;
        }
    }

    public final void c(int i10) {
        this.ay = i10;
    }

    public final void d(int i10) {
        this.az = i10;
    }

    public final void h() {
        this.ak = 1;
    }

    public final void i() {
        this.am = -1;
    }

    public final void j() {
        this.L = 1;
    }

    public final long l() {
        if (this.f7127u <= 0) {
            this.f7127u = com.anythink.expressad.d.a.b.Q;
        }
        return this.f7127u;
    }

    public final void m() {
        this.f7127u = com.anythink.expressad.d.a.b.Q;
    }

    public final int n() {
        return this.aM;
    }

    public final void o() {
        this.aM = com.anythink.expressad.d.a.b.bx;
    }

    public final void p() {
        this.aK = com.anythink.expressad.d.a.b.aC;
    }

    public final long q() {
        return this.aG * 1000;
    }

    public final long r() {
        return this.aH * 1000;
    }

    public final void s() {
        this.aH = 10L;
    }

    public final boolean t() {
        return this.f7123q;
    }

    public final void u() {
        this.f7123q = false;
    }

    public final boolean v() {
        return this.f7120m;
    }

    public final void w() {
        this.f7120m = false;
    }

    public final long x() {
        return this.f7121n;
    }

    public final void y() {
        this.f7121n = com.anythink.expressad.d.a.b.P;
    }

    public final void z() {
        this.o = 0L;
    }

    private void A(String str) {
        this.bm = str;
    }

    private void a(LinkedList<String> linkedList) {
        this.S = linkedList;
    }

    private void b(List<String> list) {
        this.Z = list;
    }

    private void c(List<com.anythink.expressad.foundation.d.c> list) {
        this.M = list;
    }

    private void h(String str) {
        this.al = str;
    }

    private void i(String str) {
        this.ae = str;
    }

    private void j(String str) {
        this.J = str;
    }

    private void m(String str) {
        this.af = str;
    }

    private void n(String str) {
        this.f7118k = str;
    }

    private void o(String str) {
        this.aN = str;
    }

    private void p(String str) {
        this.aO = str;
    }

    private void q(String str) {
        this.aP = str;
    }

    private void r(String str) {
        this.aQ = str;
    }

    private void s(String str) {
        this.aR = str;
    }

    private void t(String str) {
        this.aZ = str;
    }

    private void u(String str) {
        this.f7107ba = str;
    }

    private void v(String str) {
        this.f7108bb = str;
    }

    private void w(String str) {
        this.f7109bc = str;
    }

    private void x(String str) {
        this.f7110bd = str;
    }

    private static Map<String, C0093a> y(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C0093a c0093a = new C0093a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    c0093a.a(optJSONObject);
                }
                hashMap.put(next, c0093a);
            }
            return hashMap;
        } catch (JSONException e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    private void z(String str) {
        this.bl = str;
    }

    public final void d() {
        this.ag = 1;
    }

    public final void e() {
        this.ah = 1;
    }

    public final void f() {
        this.ai = 1;
    }

    public final void g() {
        this.aj = 0;
    }

    public final int k() {
        return this.A;
    }

    private void a(List<com.anythink.expressad.foundation.d.b> list) {
        this.N = list;
    }

    private void b(long j10) {
        this.C = j10;
    }

    private void c(long j10) {
        this.aG = j10;
    }

    private void d(long j10) {
        this.f7122p = j10;
    }

    private void e(long j10) {
        this.f7111c = j10;
    }

    private void f(long j10) {
        this.f7113e = j10;
    }

    private void g(long j10) {
        this.f7117j = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a();
                try {
                    aVar.f7106b = jSONObject.optString(com.anythink.expressad.d.a.b.f7168h);
                    aVar.K = jSONObject.optString(com.anythink.expressad.d.a.b.f7170j, "anythink");
                    aVar.f7111c = jSONObject.optLong(com.anythink.expressad.d.a.b.f7172l);
                    aVar.f7112d = jSONObject.optInt(com.anythink.expressad.d.a.b.f7173m);
                    aVar.f7113e = jSONObject.optLong("getpf");
                    aVar.f = jSONObject.optInt(com.anythink.expressad.d.a.b.f7175p);
                    aVar.f7114g = jSONObject.optBoolean(com.anythink.expressad.d.a.b.f7182w);
                    aVar.f7117j = jSONObject.optLong("current_time");
                    aVar.f7116i = jSONObject.optBoolean(com.anythink.expressad.d.a.b.o);
                    aVar.o = jSONObject.optLong(com.anythink.expressad.d.a.b.B);
                    aVar.f7121n = jSONObject.optLong("plct") == 0 ? com.anythink.expressad.d.a.b.P : jSONObject.optLong("plct");
                    aVar.f7120m = jSONObject.optBoolean(com.anythink.expressad.d.a.b.C);
                    aVar.f7122p = jSONObject.optLong(com.anythink.expressad.d.a.b.F);
                    aVar.f7123q = jSONObject.optBoolean(com.anythink.expressad.d.a.b.G);
                    aVar.f7124r = jSONObject.optInt(com.anythink.expressad.d.a.b.X);
                    aVar.f7125s = jSONObject.optInt(com.anythink.expressad.d.a.b.Y);
                    aVar.L = jSONObject.optInt(com.anythink.expressad.d.a.b.f7171k);
                    aVar.f7126t = jSONObject.optInt(com.anythink.expressad.d.a.b.Z, 1800);
                    aVar.f7130x = jSONObject.optInt(com.anythink.expressad.d.a.b.f7141aa);
                    aVar.f7127u = jSONObject.optLong("plctb") == 0 ? com.anythink.expressad.d.a.b.Q : jSONObject.optLong("plctb");
                    aVar.aI = jSONObject.optInt(com.anythink.expressad.d.a.b.f7144ad);
                    aVar.aJ = jSONObject.optInt(com.anythink.expressad.d.a.b.ae);
                    aVar.f7130x = jSONObject.optInt(com.anythink.expressad.d.a.b.f7141aa, 100);
                    aVar.y = jSONObject.optInt(com.anythink.expressad.d.a.b.af, 2);
                    aVar.f7131z = jSONObject.optInt(com.anythink.expressad.d.a.b.ag, 2);
                    boolean z10 = true;
                    aVar.A = jSONObject.optInt(com.anythink.expressad.d.a.b.ah, 1);
                    aVar.aK = jSONObject.optLong(com.anythink.expressad.d.a.b.ai, com.anythink.expressad.d.a.b.aC);
                    aVar.B = jSONObject.optString(com.anythink.expressad.d.a.b.aj);
                    aVar.C = jSONObject.optLong(com.anythink.expressad.d.a.b.ak, com.anythink.expressad.d.a.b.aD);
                    aVar.D = jSONObject.optInt(com.anythink.expressad.d.a.b.aE, 1);
                    aVar.E = jSONObject.optInt(com.anythink.expressad.d.a.b.aF, 604800);
                    aVar.F = jSONObject.optInt(com.anythink.expressad.d.a.b.aG, com.anythink.expressad.d.a.b.aK);
                    aVar.aL = jSONObject.optInt(com.anythink.expressad.d.a.b.bn, 3);
                    aVar.aF = jSONObject.optInt(com.anythink.expressad.d.a.b.bv, 1);
                    aVar.af = jSONObject.optString(com.anythink.expressad.d.a.b.aH, "");
                    aVar.aE = jSONObject.optInt(com.anythink.expressad.d.a.b.al, 1);
                    aVar.ah = jSONObject.optInt(com.anythink.expressad.d.a.b.bE, 1);
                    aVar.ag = jSONObject.optInt(com.anythink.expressad.d.a.b.bF, 1);
                    aVar.ai = jSONObject.optInt(com.anythink.expressad.d.a.b.bG, 1);
                    int i10 = 0;
                    aVar.aj = jSONObject.optInt(com.anythink.expressad.d.a.b.bH, 0);
                    aVar.ak = jSONObject.optInt(com.anythink.expressad.d.a.b.bI, 1);
                    aVar.am = jSONObject.optInt(com.anythink.expressad.d.a.b.bK, -1);
                    aVar.an = jSONObject.optInt(com.anythink.expressad.d.a.b.bV, 2);
                    aVar.ap = jSONObject.optInt(com.anythink.expressad.d.a.b.bY, 86400);
                    aVar.ao = jSONObject.optString(com.anythink.expressad.d.a.b.bW);
                    aVar.ar = jSONObject.optString(com.anythink.expressad.d.a.b.cG);
                    aVar.aq = jSONObject.optString(com.anythink.expressad.d.a.b.cF);
                    aVar.as = jSONObject.optInt(com.anythink.expressad.d.a.b.cN);
                    aVar.U = jSONObject.optInt(com.anythink.expressad.d.a.b.ci, com.anythink.expressad.d.a.b.ck);
                    aVar.T = jSONObject.optInt(com.anythink.expressad.d.a.b.ch, 0);
                    try {
                        JSONArray optJSONArray = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.cg);
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            LinkedList<String> linkedList = new LinkedList<>();
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                linkedList.add(optJSONArray.optString(i11));
                            }
                            aVar.S = linkedList;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    long optLong = jSONObject.optLong(com.anythink.expressad.d.a.b.f7142ab);
                    if (optLong == 0) {
                        aVar.aG = 20L;
                    } else {
                        aVar.aG = optLong;
                    }
                    long optLong2 = jSONObject.optLong(com.anythink.expressad.d.a.b.f7143ac);
                    if (optLong2 == 0) {
                        aVar.aH = 10L;
                    } else {
                        aVar.aH = optLong2;
                        JSONArray optJSONArray2 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.f7181v);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            HashMap hashMap = new HashMap();
                            for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                                JSONObject optJSONObject = optJSONArray2.optJSONObject(i12);
                                hashMap.put(optJSONObject.optString("domain"), optJSONObject.optString("format"));
                            }
                            aVar.f7115h = hashMap;
                        }
                    }
                    aVar.G = jSONObject.optInt(com.anythink.expressad.d.a.b.ao, 3);
                    aVar.H = jSONObject.optInt(com.anythink.expressad.d.a.b.ap, 86400);
                    aVar.I = jSONObject.optInt("iex", 1);
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.ar);
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < optJSONArray3.length(); i13++) {
                            String optString = optJSONArray3.optString(i13);
                            if (w.b(optString)) {
                                arrayList.add(com.anythink.expressad.foundation.d.c.a(new JSONObject(optString)));
                            }
                        }
                    }
                    if (arrayList != null) {
                        aVar.M = arrayList;
                    }
                    try {
                        JSONArray optJSONArray4 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.as);
                        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                            arrayList2 = new ArrayList();
                            for (int i14 = 0; i14 < optJSONArray4.length(); i14++) {
                                String optString2 = optJSONArray4.optString(i14);
                                if (w.b(optString2)) {
                                    JSONObject jSONObject2 = new JSONObject(optString2);
                                    arrayList2.add(new com.anythink.expressad.foundation.d.b(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            aVar.N = arrayList2;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    aVar.aM = jSONObject.optInt(com.anythink.expressad.d.a.b.at, com.anythink.expressad.d.a.b.bx);
                    aVar.Y = jSONObject.optInt("pf", 900);
                    aVar.f7102aa = jSONObject.optInt(com.anythink.expressad.d.a.b.aA, 20);
                    aVar.ae = jSONObject.optString(com.anythink.expressad.d.a.b.aB);
                    JSONArray optJSONArray5 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.av);
                    if (optJSONArray5 != null && optJSONArray5.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i15 = 0; i15 < optJSONArray5.length(); i15++) {
                            arrayList3.add(optJSONArray5.optString(i15));
                        }
                        aVar.Z = arrayList3;
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(com.anythink.expressad.d.a.b.aw);
                    if (optJSONObject2 != null) {
                        aVar.f7103ab = optJSONObject2.optInt(com.anythink.expressad.d.a.b.ax, 1);
                        aVar.f7104ac = optJSONObject2.optInt(com.anythink.expressad.d.a.b.ay, 1);
                        aVar.f7105ad = optJSONObject2.optInt(com.anythink.expressad.d.a.b.az, 1);
                    }
                    aVar.aN = jSONObject.optString(com.anythink.expressad.d.a.b.ct, "");
                    aVar.aO = jSONObject.optString(com.anythink.expressad.d.a.b.cu, "");
                    aVar.aP = jSONObject.optString(com.anythink.expressad.d.a.b.cv, "");
                    aVar.aQ = jSONObject.optString(com.anythink.expressad.d.a.b.cw, "");
                    aVar.aR = jSONObject.optString(com.anythink.expressad.d.a.b.cx, "");
                    aVar.aS = jSONObject.optInt(com.anythink.expressad.d.a.b.cy, 0);
                    aVar.aT = jSONObject.optInt(com.anythink.expressad.d.a.b.cz, 21600);
                    aVar.aU = jSONObject.optInt(com.anythink.expressad.d.a.b.cA, 2);
                    aVar.aV = jSONObject.optInt(com.anythink.expressad.d.a.b.cB, 0);
                    aVar.aW = jSONObject.optInt(com.anythink.expressad.d.a.b.cC, 0);
                    aVar.aX = jSONObject.optInt(com.anythink.expressad.d.a.b.cD, 604800);
                    aVar.aY = jSONObject.optInt(com.anythink.expressad.d.a.b.cE, 0);
                    aVar.aZ = jSONObject.optString("adchoice_icon", "");
                    aVar.f7108bb = jSONObject.optString("adchoice_link", "");
                    aVar.f7107ba = jSONObject.optString("adchoice_size", "");
                    aVar.f7110bd = jSONObject.optString("platform_logo", "");
                    aVar.f7109bc = jSONObject.optString("platform_name", "");
                    aVar.be = y(jSONObject.optString(com.anythink.expressad.d.a.b.cM, ""));
                    aVar.f7101a = jSONObject.optInt(com.anythink.expressad.d.a.b.cO, 0);
                    aVar.bh = jSONObject.optInt(com.anythink.expressad.d.a.b.cQ, 0);
                    aVar.W = jSONObject.optInt(com.anythink.expressad.d.a.b.di, 120);
                    aVar.V = jSONObject.optInt(com.anythink.expressad.d.a.b.dg, 10);
                    aVar.X = jSONObject.optString(com.anythink.expressad.d.a.b.dI, "");
                    aVar.bi = jSONObject.optString(com.anythink.expressad.d.a.b.cT, "");
                    aVar.bj = jSONObject.optInt(com.anythink.expressad.d.a.b.cU, 2);
                    aVar.bk = jSONObject.optInt(com.anythink.expressad.d.a.b.cV, 7200);
                    aVar.bm = jSONObject.optString(com.anythink.expressad.d.a.b.ds);
                    aVar.bl = jSONObject.optString(com.anythink.expressad.d.a.b.dA);
                    int optInt = jSONObject.optInt(com.anythink.expressad.d.a.b.dt, 0);
                    if (optInt > 2 || optInt < 0) {
                        optInt = 0;
                    }
                    aVar.bn = optInt;
                    aVar.bo = jSONObject.optBoolean(com.anythink.expressad.d.a.b.dw, false);
                    JSONArray optJSONArray6 = jSONObject.optJSONArray(com.anythink.expressad.d.a.b.dr);
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i16 = 0; i16 < optJSONArray6.length(); i16++) {
                            JSONObject jSONObject3 = optJSONArray6.getJSONObject(i16);
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next) && jSONObject3.getBoolean(next)) {
                                    aVar.aD.add(Integer.valueOf(Integer.parseInt(next)));
                                }
                            }
                        }
                    }
                    try {
                        int optInt2 = jSONObject.optInt("lqcnt", 30);
                        int optInt3 = jSONObject.optInt("lqto", 5);
                        int optInt4 = jSONObject.optInt("lqswt", 0);
                        int optInt5 = jSONObject.optInt("lqtype", 0);
                        aVar.au = optInt3;
                        aVar.at = optInt2;
                        aVar.av = optInt4;
                        aVar.aw = optInt5;
                        int parseInt = Integer.parseInt(j.b(jSONObject.optString("lqpt")));
                        if (parseInt > 0 && parseInt < 65535) {
                            aVar.ax = parseInt;
                        }
                    } catch (Exception unused) {
                    }
                    aVar.bp = jSONObject.optInt(com.anythink.expressad.d.a.b.dB, 0);
                    try {
                        int optInt6 = jSONObject.optInt("l", 3);
                        boolean z11 = jSONObject.optInt("k", 0) == 1;
                        if (jSONObject.optInt(com.anythink.expressad.d.a.b.dH, 1) != 1) {
                            z10 = false;
                        }
                        aVar.P = optInt6;
                        aVar.O = z11;
                        aVar.Q = z10;
                    } catch (Exception e11) {
                        o.d("Setting", e11.getMessage());
                    }
                    aVar.bf = jSONObject.optInt(com.anythink.expressad.d.a.b.dK, 0);
                    aVar.bg = b.a(jSONObject.optJSONObject(com.anythink.expressad.d.a.b.dL));
                    try {
                        int optInt7 = jSONObject.optInt(com.anythink.expressad.d.a.b.dQ, com.anythink.expressad.foundation.g.a.cH);
                        int optInt8 = jSONObject.optInt(com.anythink.expressad.d.a.b.dR, com.anythink.expressad.foundation.g.a.cI);
                        int optInt9 = jSONObject.optInt(com.anythink.expressad.d.a.b.dS, com.anythink.expressad.foundation.g.a.cJ);
                        int optInt10 = jSONObject.optInt(com.anythink.expressad.d.a.b.dU, com.anythink.expressad.foundation.g.a.cO);
                        if (optInt7 <= 0) {
                            optInt7 = com.anythink.expressad.foundation.g.a.cH;
                        }
                        if (optInt8 <= 0) {
                            optInt8 = com.anythink.expressad.foundation.g.a.cI;
                        }
                        if (optInt9 <= 0) {
                            optInt9 = com.anythink.expressad.foundation.g.a.cJ;
                        }
                        if (optInt10 < 0) {
                            optInt10 = com.anythink.expressad.foundation.g.a.cO;
                        }
                        aVar.aA = optInt7;
                        aVar.ay = optInt8;
                        aVar.az = optInt9;
                        aVar.aB = optInt10;
                        int optInt11 = jSONObject.optInt(com.anythink.expressad.d.a.b.dT, 0);
                        if (optInt11 >= 0) {
                            i10 = optInt11;
                        }
                        aVar.R = i10;
                        aVar.b(jSONObject.optInt(com.anythink.expressad.d.a.b.dV, 10));
                        return aVar;
                    } catch (Exception unused2) {
                        arrayList2 = aVar;
                    }
                } catch (Exception e12) {
                    e = e12;
                    arrayList2 = aVar;
                    e.printStackTrace();
                    return arrayList2;
                }
            }
        } catch (Exception e13) {
            e = e13;
        }
        return arrayList2;
    }

    private void c(boolean z10) {
        this.Q = z10;
    }

    private void d(List<c> list) {
        this.f7119l = list;
    }

    private void l(String str) {
        this.f7106b = str;
    }

    public final void a(String str) {
        this.K = str;
    }

    private void a(long j10) {
        this.E = j10;
    }

    public final void c(String str) {
        this.bi = str;
    }

    private void a(Map<String, String> map) {
        this.f7115h = map;
    }

    private void a(boolean z10) {
        this.f7114g = z10;
    }

    public static String a(Context context, String str) {
        a b10;
        String str2 = "";
        try {
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.foundation.b.a.b().e();
            b10 = com.anythink.expressad.d.b.b();
        } catch (Throwable unused) {
        }
        if (b10 != null && b10.f7115h != null) {
            String host = Uri.parse(str).getHost();
            Iterator<Map.Entry<String, String>> it = b10.f7115h.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!TextUtils.isEmpty(host) && host.contains(key)) {
                    String str3 = b10.f7115h.get(key);
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    String replace = str3.replace("{gaid}", d.f());
                    if (replace.contains(com.anythink.expressad.d.a.b.I)) {
                        if (d.d(context) != null) {
                            str2 = replace.replace(com.anythink.expressad.d.a.b.I, d.d(context));
                        }
                        str2 = replace;
                    } else {
                        if (replace.contains(com.anythink.expressad.d.a.b.H) && d.e(context) != null) {
                            str2 = replace.replace(com.anythink.expressad.d.a.b.H, d.e(context));
                        }
                        str2 = replace;
                    }
                    return str2;
                }
            }
        }
        return str2;
    }

    private void a(b bVar) {
        this.bg = bVar;
    }

    private void b(Map<String, C0093a> map) {
        this.be = map;
    }

    private void b(boolean z10) {
        this.O = z10;
    }
}
