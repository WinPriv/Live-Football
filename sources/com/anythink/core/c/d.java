package com.anythink.core.c;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomAdapterConfig;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.b.p;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.ag;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.m;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.u;
import com.anythink.core.common.g.j;
import com.anythink.core.common.k.g;
import com.anythink.core.common.k.h;
import com.anythink.core.common.l;
import com.anythink.core.common.t;
import com.anythink.core.common.v;
import com.applovin.sdk.AppLovinEventParameters;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private String A;
    private ag B;
    private int C;
    private String D;
    private int E;
    private int F;
    private String G;
    private Map<String, Object> H;
    private Map<String, ATRewardInfo> I;
    private ATRewardInfo J;
    private String K;
    private String L;
    private long M;
    private String N;
    private long O;
    private int P;
    private long Q;
    private int R;
    private List<s> S;
    private u T;
    private long U;
    private double V;
    private String W;
    private List<String> X;
    private String Y;
    private String Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f4815a = "Placement";
    private int aA;
    private int aB;
    private int aC;
    private String aD;
    private String aE;
    private String aF;
    private long aG;
    private String aH;
    private String aI;
    private double aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;

    /* renamed from: aa, reason: collision with root package name */
    private String f4816aa;

    /* renamed from: ab, reason: collision with root package name */
    private String f4817ab;

    /* renamed from: ac, reason: collision with root package name */
    private long f4818ac;

    /* renamed from: ad, reason: collision with root package name */
    private String f4819ad;
    private String ae;
    private String af;
    private double ag;
    private String ah;
    private long ai;
    private List<ai> aj;
    private long ak;
    private long al;
    private long am;
    private int an;
    private int ao;
    private int ap;
    private long aq;
    private JSONObject ar;
    private String as;
    private JSONObject at;
    private int au;
    private String av;
    private String aw;
    private int ax;
    private int ay;
    private List<Integer> az;

    /* renamed from: b, reason: collision with root package name */
    private long f4820b;

    /* renamed from: c, reason: collision with root package name */
    private long f4821c;

    /* renamed from: d, reason: collision with root package name */
    private int f4822d;

    /* renamed from: e, reason: collision with root package name */
    private int f4823e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private long f4824g;

    /* renamed from: h, reason: collision with root package name */
    private long f4825h;

    /* renamed from: i, reason: collision with root package name */
    private long f4826i;

    /* renamed from: j, reason: collision with root package name */
    private int f4827j;

    /* renamed from: k, reason: collision with root package name */
    private int f4828k;

    /* renamed from: l, reason: collision with root package name */
    private int f4829l;

    /* renamed from: m, reason: collision with root package name */
    private int f4830m;

    /* renamed from: n, reason: collision with root package name */
    private String f4831n;
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private String f4832p;

    /* renamed from: q, reason: collision with root package name */
    private String f4833q;

    /* renamed from: r, reason: collision with root package name */
    private String f4834r;

    /* renamed from: s, reason: collision with root package name */
    private List<ai> f4835s;

    /* renamed from: t, reason: collision with root package name */
    private List<ai> f4836t;

    /* renamed from: u, reason: collision with root package name */
    private int f4837u;

    /* renamed from: v, reason: collision with root package name */
    private int f4838v;

    /* renamed from: w, reason: collision with root package name */
    private long f4839w;

    /* renamed from: x, reason: collision with root package name */
    private long f4840x;
    private long y;

    /* renamed from: z, reason: collision with root package name */
    private int f4841z;

    /* loaded from: classes.dex */
    public static class a {
        public static final String A = "req_w_time";
        public static final String B = "wf_loadts";
        public static final String C = "req_ug_type";
        public static final String D = "req_ug_numsp";
        public static final String E = "bf_ldf_rf_sw";
        public static final String F = "hb_start_time";
        public static final String G = "dsp_list";
        public static final String H = "bid_floor";
        public static final String I = "max_unit_ids";
        public static final String J = "xdb_list";
        public static final String K = "s2s_bd_max";
        public static final String L = "req_merge";
        public static final String M = "exclude_id_max";
        public static final String N = "install_id_max";
        public static final String O = "install_ids";
        public static final String P = "exclude_ids";
        public static final String Q = "is_test";
        public static final String R = "gsp_rates";
        public static final String S = "mdna_r";
        public static final String T = "adx_ext";
        public static final String U = "wf_id";
        public static final String V = "sysh_mtg_sw";
        public static final String W = "mid_gdt_sw";
        public static final String X = "lm_lrqf_interval_sws";
        public static final String Y = "wf_lscb_type";
        public static final String Z = "reqid_pg_sw";

        /* renamed from: a, reason: collision with root package name */
        public static final String f4842a = "hb_bid_timeout";
        private static final String aA = "s_id";
        private static final String aB = "u_n_f_sw";
        private static final String aC = "m_o";
        private static final String aD = "m_o_s";
        private static final String aE = "m_o_ks";
        private static final String aF = "p_m_o";
        private static final String aG = "callback";
        private static final String aH = "sc_list";
        private static final String aI = "rw_n";
        private static final String aJ = "rw_num";
        private static final String aK = "reward";
        private static final String aL = "currency";
        private static final String aM = "cc";
        private static final String aN = "exch_r";
        private static final String aO = "acct_cy";

        /* renamed from: aa, reason: collision with root package name */
        private static final String f4843aa = "ps_id_timeout";

        /* renamed from: ab, reason: collision with root package name */
        private static final String f4844ab = "ps_ct";

        /* renamed from: ac, reason: collision with root package name */
        private static final String f4845ac = "ps_ct_out";

        /* renamed from: ad, reason: collision with root package name */
        private static final String f4846ad = "pucs";
        private static final String ae = "ad_delivery_sw";
        private static final String af = "req_ug_num";
        private static final String ag = "unit_caps_d";
        private static final String ah = "unit_caps_h";
        private static final String ai = "unit_pacing";
        private static final String aj = "wifi_auto_sw";
        private static final String ak = "show_type";
        private static final String al = "refresh";
        private static final String am = "ug_list";
        private static final String an = "ol_list";
        private static final String ao = "gro_id";
        private static final String ap = "hb_list";
        private static final String aq = "s2shb_list";
        private static final String ar = "format";
        private static final String as = "auto_refresh";
        private static final String at = "auto_refresh_time";
        private static final String au = "s_t";
        private static final String av = "l_s_t";
        private static final String aw = "ra";
        private static final String ax = "asid";
        private static final String ay = "tp_ps";
        private static final String az = "t_g_id";

        /* renamed from: b, reason: collision with root package name */
        public static final String f4847b = "addr_bid";

        /* renamed from: c, reason: collision with root package name */
        public static final String f4848c = "load_fail_wtime";

        /* renamed from: d, reason: collision with root package name */
        public static final String f4849d = "load_cap";

        /* renamed from: e, reason: collision with root package name */
        public static final String f4850e = "load_cap_time";
        public static final String f = "cached_offers_num";

        /* renamed from: g, reason: collision with root package name */
        public static final String f4851g = "adx_list";

        /* renamed from: h, reason: collision with root package name */
        public static final String f4852h = "adx_st";

        /* renamed from: i, reason: collision with root package name */
        public static final String f4853i = "ilrd";

        /* renamed from: j, reason: collision with root package name */
        public static final String f4854j = "hb_list";

        /* renamed from: k, reason: collision with root package name */
        public static final String f4855k = "inh_list";

        /* renamed from: l, reason: collision with root package name */
        public static final String f4856l = "fbhb_bid_wtime";

        /* renamed from: m, reason: collision with root package name */
        public static final String f4857m = "burl_nt_firm";

        /* renamed from: n, reason: collision with root package name */
        public static final String f4858n = "wf_bid_addr";
        public static final String o = "ss_data";

        /* renamed from: p, reason: collision with root package name */
        public static final String f4859p = "cn_addr_bid";

        /* renamed from: q, reason: collision with root package name */
        public static final String f4860q = "cn_wf_bid_addr";

        /* renamed from: r, reason: collision with root package name */
        public static final String f4861r = "byuid_wt";

        /* renamed from: s, reason: collision with root package name */
        public static final String f4862s = "addr_bks";

        /* renamed from: t, reason: collision with root package name */
        public static final String f4863t = "addr_subbks";

        /* renamed from: u, reason: collision with root package name */
        public static final String f4864u = "s2sbks_list";

        /* renamed from: v, reason: collision with root package name */
        public static final String f4865v = "exch_rate_c2u";

        /* renamed from: w, reason: collision with root package name */
        public static final String f4866w = "doffer_list";

        /* renamed from: x, reason: collision with root package name */
        public static final String f4867x = "bottom_list";
        public static final String y = "bottom_reqts";

        /* renamed from: z, reason: collision with root package name */
        public static final String f4868z = "cb_w_time";
    }

    private List<ai> aA() {
        return this.aj;
    }

    private String aB() {
        return this.aF;
    }

    private String aC() {
        return this.N;
    }

    private int aD() {
        return this.f4823e;
    }

    private int aE() {
        return this.f4827j;
    }

    private int aF() {
        return this.f4828k;
    }

    private int aG() {
        return this.f4829l;
    }

    private ag aH() {
        return this.B;
    }

    private long aI() {
        return this.aG;
    }

    private String aJ() {
        return this.f4816aa;
    }

    private long aK() {
        return this.ak;
    }

    private long aL() {
        return this.al;
    }

    private int aM() {
        return this.ay;
    }

    private int aN() {
        return this.aB;
    }

    private JSONObject ay() {
        return this.ar;
    }

    private int az() {
        return this.ao;
    }

    private void f(String str) {
        this.aw = str;
    }

    private void g(String str) {
        this.av = str;
    }

    private void h(String str) {
        this.as = str;
    }

    public final String A() {
        return this.f4834r;
    }

    public final String B() {
        return this.aD;
    }

    public final String C() {
        return this.aE;
    }

    public final u D() {
        return this.T;
    }

    public final List<s> E() {
        return this.S;
    }

    public final List<ai> F() {
        return this.f4835s;
    }

    public final List<ai> G() {
        return this.f4836t;
    }

    public final long H() {
        return this.M;
    }

    public final Map<String, ATRewardInfo> I() {
        return this.I;
    }

    public final String J() {
        return this.K;
    }

    public final String K() {
        return this.L;
    }

    public final ATRewardInfo L() {
        return this.J;
    }

    public final Map<String, Object> M() {
        return this.H;
    }

    public final int N() {
        return this.F;
    }

    public final int O() {
        return this.C;
    }

    public final String P() {
        return this.D;
    }

    public final int Q() {
        return this.E;
    }

    public final long R() {
        return this.f4840x;
    }

    public final long S() {
        return this.y;
    }

    public final int T() {
        return this.f4841z;
    }

    public final String U() {
        return this.A;
    }

    public final int V() {
        return this.f4838v;
    }

    public final long W() {
        return this.f4839w;
    }

    public final int X() {
        return this.f4837u;
    }

    public final long Y() {
        return this.f4821c;
    }

    public final int Z() {
        return this.f4822d;
    }

    public final int a() {
        return this.aA;
    }

    public final int aa() {
        return this.f;
    }

    public final long ab() {
        return this.f4824g;
    }

    public final long ac() {
        return this.f4825h;
    }

    public final long ad() {
        return this.f4826i;
    }

    public final int ae() {
        return this.f4830m;
    }

    public final String af() {
        return this.f4831n;
    }

    public final String ag() {
        return this.o;
    }

    public final String ah() {
        return this.f4832p;
    }

    public final String ai() {
        return this.f4833q;
    }

    public final long aj() {
        return this.O;
    }

    public final int ak() {
        return this.P;
    }

    public final long al() {
        return this.Q;
    }

    public final int am() {
        return this.R;
    }

    public final String an() {
        return this.f4817ab;
    }

    public final String ao() {
        return this.aH;
    }

    public final String ap() {
        return this.aI;
    }

    public final int aq() {
        return this.aL;
    }

    public final int ar() {
        return this.aK;
    }

    public final double as() {
        return this.aJ;
    }

    public final int at() {
        return this.aM;
    }

    public final int au() {
        return this.aN;
    }

    public final int av() {
        return this.ax;
    }

    public final boolean aw() {
        if (this.f4823e == 1) {
            return true;
        }
        return false;
    }

    public final boolean ax() {
        System.currentTimeMillis();
        if (System.currentTimeMillis() - this.aG > this.f4820b) {
            return true;
        }
        return false;
    }

    public final List<Integer> b() {
        return this.az;
    }

    public final String c() {
        return this.aw;
    }

    public final int d() {
        return this.au;
    }

    public final String e() {
        return this.av;
    }

    public final long i() {
        return this.aq;
    }

    public final int j() {
        return this.ap;
    }

    public final int k() {
        return this.an;
    }

    public final int l() {
        int i10 = this.an;
        if (i10 == 1) {
            return this.f;
        }
        if (i10 != 2) {
            return 1;
        }
        return this.ao;
    }

    public final long m() {
        return this.am;
    }

    public final String n() {
        return this.ah;
    }

    public final long o() {
        return this.ai;
    }

    public final double p() {
        return this.ag;
    }

    public final String q() {
        return this.f4819ad;
    }

    public final String r() {
        return this.ae;
    }

    public final String s() {
        return this.af;
    }

    public final long t() {
        return this.f4818ac;
    }

    public final String u() {
        return this.Z;
    }

    public final String v() {
        return this.Y;
    }

    public final List<String> w() {
        return this.X;
    }

    public final double x() {
        return this.V;
    }

    public final String y() {
        return this.W;
    }

    public final long z() {
        return this.U;
    }

    private void A(String str) {
        this.f4832p = str;
    }

    private void B(String str) {
        this.f4833q = str;
    }

    private void C(String str) {
        this.f4816aa = str;
    }

    private void D(String str) {
        this.f4817ab = str;
    }

    private void E(String str) {
        this.aH = str;
    }

    private void F(String str) {
        this.aI = str;
    }

    private void a(int i10) {
        this.aA = i10;
    }

    private void b(int i10) {
        this.au = i10;
    }

    private void c(int i10) {
        this.aC = i10;
    }

    private void d(int i10) {
        this.ap = i10;
    }

    private void e(int i10) {
        this.an = i10;
    }

    private void i(String str) {
        this.ah = str;
    }

    private void j(String str) {
        this.f4819ad = str;
    }

    private void k(String str) {
        this.ae = str;
    }

    private void m(String str) {
        this.Z = str;
    }

    private void n(String str) {
        this.Y = str;
    }

    private void o(String str) {
        this.W = str;
    }

    private void p(String str) {
        this.f4834r = str;
    }

    private void q(String str) {
        this.aD = str;
    }

    private void r(String str) {
        this.aF = str;
    }

    private void s(String str) {
        this.aE = str;
    }

    private void t(String str) {
        this.N = str;
    }

    private void u(String str) {
        this.K = str;
    }

    private void v(String str) {
        this.L = str;
    }

    private void w(String str) {
        this.D = str;
    }

    private void x(String str) {
        this.A = str;
    }

    private void y(String str) {
        this.f4831n = str;
    }

    private void z(String str) {
        this.o = str;
    }

    public final JSONObject f() {
        return this.at;
    }

    public final String g() {
        return this.as;
    }

    public final int h() {
        return this.aC;
    }

    private void A(int i10) {
        this.ay = i10;
    }

    private void B(int i10) {
        this.aB = i10;
    }

    private void a(List<Integer> list) {
        this.az = list;
    }

    private void b(JSONObject jSONObject) {
        this.ar = jSONObject;
    }

    private void c(long j10) {
        this.ai = j10;
    }

    private void d(long j10) {
        this.f4818ac = j10;
    }

    private void e(long j10) {
        this.U = j10;
    }

    private void f(int i10) {
        this.ao = i10;
    }

    private void g(int i10) {
        this.F = i10;
    }

    private void h(int i10) {
        this.C = i10;
    }

    private void i(int i10) {
        this.E = i10;
    }

    private void j(int i10) {
        this.f4841z = i10;
    }

    private void k(int i10) {
        this.f4838v = i10;
    }

    private void m(int i10) {
        this.f4822d = i10;
    }

    private void n(int i10) {
        this.f4823e = i10;
    }

    private void o(int i10) {
        this.f = i10;
    }

    private void p(int i10) {
        this.f4827j = i10;
    }

    private void q(int i10) {
        this.f4828k = i10;
    }

    private void r(int i10) {
        this.f4829l = i10;
    }

    private void s(int i10) {
        this.f4830m = i10;
    }

    private void t(int i10) {
        this.P = i10;
    }

    private void u(int i10) {
        this.R = i10;
    }

    private void v(int i10) {
        this.aL = i10;
    }

    private void w(int i10) {
        this.aK = i10;
    }

    private void x(int i10) {
        this.aM = i10;
    }

    private void y(int i10) {
        this.aN = i10;
    }

    private void z(int i10) {
        this.ax = i10;
    }

    private void a(JSONObject jSONObject) {
        this.at = jSONObject;
    }

    private void b(List<ai> list) {
        this.aj = list;
    }

    private void c(List<String> list) {
        this.X = list;
    }

    private void d(List<s> list) {
        this.S = list;
    }

    private void e(List<ai> list) {
        this.f4835s = list;
    }

    private void f(List<ai> list) {
        this.f4836t = list;
    }

    private void g(long j10) {
        this.f4840x = j10;
    }

    private void h(long j10) {
        this.y = j10;
    }

    private void i(long j10) {
        this.f4839w = j10;
    }

    private void j(long j10) {
        this.f4820b = j10;
    }

    private void k(long j10) {
        this.f4821c = j10;
    }

    private void l(String str) {
        this.af = str;
    }

    private void m(long j10) {
        this.f4825h = j10;
    }

    private void n(long j10) {
        this.f4826i = j10;
    }

    private void o(long j10) {
        this.aG = j10;
    }

    private void p(long j10) {
        this.O = j10;
    }

    private void q(long j10) {
        this.Q = j10;
    }

    private void r(long j10) {
        this.ak = j10;
    }

    private void s(long j10) {
        this.al = j10;
    }

    private void a(long j10) {
        this.aq = j10;
    }

    private void b(long j10) {
        this.am = j10;
    }

    private void c(double d10) {
        this.aJ = d10;
    }

    public static List<ai> d(String str) {
        List<ai> a10 = a(str, 2);
        Iterator<ai> it = a10.iterator();
        while (it.hasNext()) {
            it.next().aj();
        }
        return a10;
    }

    private void f(long j10) {
        this.M = j10;
    }

    private void l(int i10) {
        this.f4837u = i10;
    }

    public final s e(String str) {
        List<s> list = this.S;
        if (list == null) {
            return null;
        }
        for (s sVar : list) {
            if (sVar.k() == null) {
                sVar.a((k) this.T);
            }
            if (TextUtils.equals(str, sVar.p()) && !sVar.a(this.T)) {
                return sVar;
            }
        }
        return null;
    }

    private void a(double d10) {
        this.ag = d10;
    }

    private void b(double d10) {
        this.V = d10;
    }

    public static List<ai> c(String str) {
        return a(str, 8);
    }

    private void l(long j10) {
        this.f4824g = j10;
    }

    private void a(u uVar) {
        this.T = uVar;
    }

    private void b(Map<String, Object> map) {
        this.H = map;
    }

    public static d b(String str) {
        long optLong;
        int i10;
        int i11;
        if (str == null) {
            return null;
        }
        try {
            d dVar = new d();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("ps_ct")) {
                dVar.f4820b = 0L;
            } else {
                dVar.f4820b = jSONObject.optLong("ps_ct");
            }
            if (jSONObject.isNull("ps_ct_out")) {
                dVar.f4821c = 0L;
            } else {
                dVar.f4821c = jSONObject.optLong("ps_ct_out");
            }
            if (jSONObject.isNull("pucs")) {
                dVar.f4822d = 1;
            } else {
                dVar.f4822d = jSONObject.optInt("pucs");
            }
            if (jSONObject.isNull("ad_delivery_sw")) {
                dVar.f4823e = 1;
            } else {
                dVar.f4823e = jSONObject.optInt("ad_delivery_sw");
            }
            if (jSONObject.isNull("req_ug_num")) {
                dVar.f = -1;
            } else {
                dVar.f = jSONObject.optInt("req_ug_num");
            }
            if (jSONObject.isNull("unit_caps_d")) {
                dVar.f4824g = -1L;
            } else {
                dVar.f4824g = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                dVar.f4825h = -1L;
            } else {
                dVar.f4825h = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                dVar.f4826i = -1L;
            } else {
                dVar.f4826i = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                dVar.f4827j = 0;
            } else {
                dVar.f4827j = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull("show_type")) {
                dVar.f4828k = 0;
            } else {
                dVar.f4828k = jSONObject.optInt("show_type");
            }
            if (jSONObject.isNull("refresh")) {
                dVar.f4829l = 0;
            } else {
                dVar.f4829l = jSONObject.optInt("refresh");
            }
            if (jSONObject.isNull("gro_id")) {
                dVar.f4830m = 0;
            } else {
                dVar.f4830m = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull("format")) {
                dVar.f4837u = 0;
            } else {
                dVar.f4837u = jSONObject.optInt("format");
            }
            if (jSONObject.isNull("auto_refresh")) {
                dVar.f4838v = 0;
            } else {
                dVar.f4838v = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                dVar.f4839w = 0L;
            } else {
                dVar.f4839w = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull("s_t")) {
                dVar.f4840x = 900000L;
            } else {
                dVar.f4840x = jSONObject.optLong("s_t");
            }
            if (jSONObject.isNull(l.J)) {
                dVar.y = 1800000L;
            } else {
                dVar.y = jSONObject.optLong(l.J);
            }
            if (jSONObject.isNull("ra")) {
                dVar.f4841z = -1;
            } else {
                dVar.f4841z = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                dVar.A = "";
            } else {
                dVar.A = jSONObject.optString("asid");
            }
            if (jSONObject.isNull("tp_ps")) {
                dVar.B = null;
            } else {
                try {
                    ag agVar = new ag();
                    JSONObject optJSONObject = jSONObject.optJSONObject("tp_ps");
                    agVar.f5472a = optJSONObject.optInt("pucs") == 1;
                    agVar.f5473b = optJSONObject.optLong("apdt");
                    agVar.f5474c = optJSONObject.optInt("aprn");
                    agVar.f5475d = optJSONObject.optInt("puas") == 1;
                    agVar.f5476e = optJSONObject.optLong("cdt");
                    agVar.f = optJSONObject.optInt("ski_swt") == 1;
                    agVar.f5477g = optJSONObject.optInt("aut_swt") == 1;
                    dVar.B = agVar;
                } catch (Exception unused) {
                }
            }
            if (jSONObject.isNull("ug_list")) {
                dVar.f4831n = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.f4831n = jSONObject.optString("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                dVar.o = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.o = jSONObject.optString("ol_list");
            }
            dVar.f4835s = a(dVar.f4831n, dVar.o);
            if (jSONObject.isNull("s2shb_list")) {
                dVar.f4832p = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.f4832p = jSONObject.optString("s2shb_list");
            }
            if (jSONObject.isNull(a.f4851g)) {
                dVar.aE = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.aE = jSONObject.optString(a.f4851g);
            }
            if (jSONObject.isNull(a.f4854j)) {
                dVar.f4833q = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.f4833q = jSONObject.optString(a.f4854j);
            }
            if (jSONObject.isNull(a.f4855k)) {
                dVar.f4834r = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.f4834r = jSONObject.optString(a.f4855k);
            }
            if (jSONObject.isNull(a.f4864u)) {
                dVar.af = "";
            } else {
                dVar.af = jSONObject.optString(a.f4864u);
            }
            if (jSONObject.isNull(a.f4866w)) {
                dVar.aH = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.aH = jSONObject.optString(a.f4866w);
            }
            if (jSONObject.isNull("updateTime")) {
                dVar.aG = 0L;
                optLong = 0;
            } else {
                optLong = jSONObject.optLong("updateTime");
                dVar.aG = optLong;
            }
            if (jSONObject.isNull("t_g_id")) {
                dVar.C = -1;
            } else {
                dVar.C = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull("s_id")) {
                dVar.D = "";
            } else {
                dVar.D = jSONObject.optString("s_id");
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                dVar.E = 0;
            } else {
                dVar.E = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                dVar.T = u.c(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                dVar.S = null;
            } else {
                dVar.S = a(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), optLong, dVar.T);
            }
            if (jSONObject.isNull("p_m_o")) {
                dVar.F = 0;
            } else {
                dVar.F = jSONObject.optInt("p_m_o");
            }
            if (jSONObject.isNull(j.f5916a)) {
                dVar.H = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(j.f5916a));
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.opt(next));
                }
                dVar.H = hashMap;
            }
            if (!jSONObject.isNull(bj.f.L)) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString(bj.f.L));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap hashMap2 = new HashMap();
                    Iterator<String> keys2 = jSONObject4.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        ATRewardInfo aTRewardInfo = new ATRewardInfo();
                        aTRewardInfo.rewardName = jSONObject5.optString("rw_n");
                        aTRewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                        hashMap2.put(next2, aTRewardInfo);
                    }
                    dVar.I = hashMap2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    ATRewardInfo aTRewardInfo2 = new ATRewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        aTRewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        aTRewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    dVar.J = aTRewardInfo2;
                }
                if (!jSONObject3.isNull(AppLovinEventParameters.REVENUE_CURRENCY)) {
                    dVar.K = jSONObject3.optString(AppLovinEventParameters.REVENUE_CURRENCY);
                }
                if (!jSONObject3.isNull(com.anythink.expressad.d.a.b.f7168h)) {
                    dVar.L = jSONObject3.optString(com.anythink.expressad.d.a.b.f7168h);
                }
                if (!jSONObject3.isNull("exch_r")) {
                    dVar.V = jSONObject3.optDouble("exch_r", 0.0d);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    dVar.W = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull(a.f4842a)) {
                dVar.M = 10000L;
            } else {
                dVar.M = jSONObject.optLong(a.f4842a);
            }
            if (jSONObject.isNull(a.f4847b)) {
                dVar.N = "";
            } else {
                dVar.N = jSONObject.optString(a.f4847b);
            }
            if (jSONObject.isNull(a.f4848c)) {
                dVar.O = 10000L;
            } else {
                dVar.O = jSONObject.optLong(a.f4848c);
            }
            if (jSONObject.isNull(a.f4849d)) {
                dVar.P = -1;
            } else {
                dVar.P = jSONObject.optInt(a.f4849d);
            }
            if (jSONObject.isNull(a.f4850e)) {
                dVar.Q = 900000L;
            } else {
                dVar.Q = jSONObject.optLong(a.f4850e);
            }
            if (jSONObject.isNull(a.f)) {
                dVar.R = 2;
            } else {
                dVar.R = jSONObject.optInt(a.f);
            }
            if (jSONObject.isNull(a.f4853i)) {
                dVar.aD = null;
            } else {
                dVar.aD = jSONObject.optString(a.f4853i);
            }
            if (jSONObject.isNull(a.f4852h)) {
                dVar.aF = "";
            } else {
                dVar.aF = jSONObject.optString(a.f4852h);
            }
            if (jSONObject.isNull(a.f4856l)) {
                dVar.U = 4000L;
            } else {
                dVar.U = jSONObject.optLong(a.f4856l);
            }
            if (jSONObject.isNull(a.f4857m)) {
                dVar.X = null;
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray(a.f4857m);
                ArrayList arrayList = new ArrayList(3);
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    arrayList.add(optJSONArray.optString(i12));
                }
                dVar.X = arrayList;
            }
            if (jSONObject.isNull(a.f4858n)) {
                dVar.Y = "";
            } else {
                dVar.Y = jSONObject.optString(a.f4858n);
            }
            if (jSONObject.isNull(a.o)) {
                dVar.Z = "";
            } else {
                dVar.Z = jSONObject.optString(a.o);
            }
            if (jSONObject.isNull(a.f4859p)) {
                dVar.f4816aa = "";
            } else {
                dVar.f4816aa = jSONObject.optString(a.f4859p);
            }
            if (jSONObject.isNull(a.f4860q)) {
                dVar.f4817ab = "";
            } else {
                dVar.f4817ab = jSONObject.optString(a.f4860q);
            }
            if (jSONObject.isNull(a.f4861r)) {
                dVar.f4818ac = 500L;
            } else {
                dVar.f4818ac = jSONObject.optLong(a.f4861r);
            }
            if (jSONObject.isNull(a.f4862s)) {
                dVar.f4819ad = "";
            } else {
                dVar.f4819ad = jSONObject.optString(a.f4862s);
            }
            if (jSONObject.isNull(a.f4863t)) {
                dVar.ae = "";
            } else {
                dVar.ae = jSONObject.optString(a.f4863t);
            }
            if (jSONObject.isNull(a.f4865v)) {
                dVar.ag = 0.1614d;
            } else {
                dVar.ag = jSONObject.optDouble(a.f4865v);
            }
            if (jSONObject.isNull(a.f4867x)) {
                dVar.ah = ContentRecord.XRINFOLIST_NULL;
            } else {
                String optString = jSONObject.optString(a.f4867x);
                dVar.ah = optString;
                dVar.aj = a(optString, 8);
            }
            if (jSONObject.isNull(a.y)) {
                dVar.ai = 1000L;
            } else {
                dVar.ai = jSONObject.optLong(a.y);
            }
            if (jSONObject.isNull(a.f4868z)) {
                dVar.ak = 0L;
            } else {
                dVar.ak = jSONObject.optLong(a.f4868z);
            }
            if (jSONObject.isNull(a.A)) {
                dVar.al = 2000L;
            } else {
                dVar.al = jSONObject.optLong(a.A);
            }
            if (jSONObject.isNull(a.B)) {
                dVar.am = -1L;
            } else {
                dVar.am = jSONObject.optLong(a.B);
            }
            if (jSONObject.isNull(a.C)) {
                dVar.an = 1;
            } else {
                dVar.an = jSONObject.optInt(a.C);
            }
            if (jSONObject.isNull(a.D)) {
                dVar.ao = 1;
            } else {
                dVar.ao = jSONObject.optInt(a.D);
            }
            if (jSONObject.isNull(a.E)) {
                dVar.ap = 2;
            } else {
                dVar.ap = jSONObject.optInt(a.E);
            }
            if (jSONObject.isNull(a.F)) {
                dVar.aq = 2000L;
            } else {
                dVar.aq = jSONObject.optLong(a.F);
            }
            if (jSONObject.isNull(a.G)) {
                dVar.aI = ContentRecord.XRINFOLIST_NULL;
            } else {
                dVar.aI = jSONObject.optString(a.G);
            }
            if (jSONObject.isNull("bid_floor")) {
                dVar.aJ = 0.0d;
            } else {
                dVar.aJ = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(a.I)) {
                dVar.ar = null;
            } else {
                dVar.ar = jSONObject.optJSONObject(a.I);
            }
            if (jSONObject.isNull(a.J)) {
                dVar.as = "";
            } else {
                dVar.as = jSONObject.optString(a.J);
            }
            if (jSONObject.isNull(a.K)) {
                dVar.aK = 0;
            } else {
                dVar.aK = jSONObject.optInt(a.K);
            }
            if (jSONObject.isNull(a.L)) {
                dVar.aL = 2;
            } else {
                dVar.aL = jSONObject.optInt(a.L);
            }
            try {
                dVar.f4836t = a(dVar.f4832p, dVar.aE, dVar.f4833q, dVar.f4834r, dVar.af, dVar.aH, dVar.aI);
            } catch (Exception unused2) {
            }
            if (jSONObject.isNull(a.M)) {
                dVar.aN = 0;
            } else {
                dVar.aN = jSONObject.optInt(a.M);
            }
            if (jSONObject.isNull(a.N)) {
                i10 = 0;
                dVar.aM = 0;
            } else {
                i10 = 0;
                dVar.aM = jSONObject.optInt(a.N);
            }
            if (jSONObject.isNull("is_test")) {
                dVar.aC = 2;
            } else {
                dVar.aC = jSONObject.optInt("is_test");
            }
            dVar.at = jSONObject.optJSONObject(a.R);
            if (jSONObject.isNull("mdna_r")) {
                dVar.au = 1;
            } else {
                dVar.au = jSONObject.optInt("mdna_r");
            }
            if (jSONObject.isNull(a.T)) {
                dVar.av = "";
            } else {
                dVar.av = jSONObject.optString(a.T);
            }
            if (jSONObject.isNull(a.U)) {
                dVar.aw = "";
            } else {
                dVar.aw = jSONObject.optString(a.U);
            }
            if (!jSONObject.isNull(a.V)) {
                dVar.ax = jSONObject.optInt(a.V);
            } else {
                dVar.ax = 2;
            }
            if (!jSONObject.isNull(a.W)) {
                dVar.ay = jSONObject.optInt(a.W);
                i11 = 1;
            } else {
                i11 = 1;
                dVar.ay = 1;
            }
            if (jSONObject.isNull(a.X)) {
                dVar.az = new ArrayList(i11);
            } else {
                ArrayList arrayList2 = new ArrayList(3);
                JSONArray optJSONArray2 = jSONObject.optJSONArray(a.X);
                if (optJSONArray2 != null) {
                    int length = optJSONArray2.length();
                    while (i10 < length) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i10)));
                        i10++;
                    }
                }
                dVar.az = arrayList2;
            }
            if (jSONObject.isNull(a.Y)) {
                dVar.aA = 2;
            } else {
                dVar.aA = jSONObject.optInt(a.Y);
            }
            if (!jSONObject.isNull(a.Z)) {
                dVar.aB = jSONObject.optInt(a.Z);
            } else {
                dVar.aB = 1;
            }
            return dVar;
        } catch (Exception unused3) {
            return null;
        }
    }

    public final boolean a(String str) {
        List<ai> list = this.f4836t;
        if (list == null) {
            return false;
        }
        Iterator<ai> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().t())) {
                return true;
            }
        }
        return false;
    }

    private void a(Map<String, ATRewardInfo> map) {
        this.I = map;
    }

    private void a(ATRewardInfo aTRewardInfo) {
        this.J = aTRewardInfo;
    }

    private void a(ag agVar) {
        this.B = agVar;
    }

    public static List<ai> a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        List<ai> a10 = a(str, 1);
        List<ai> a11 = a(str2, 3);
        List<ai> a12 = a(str3, 2);
        List<ai> a13 = a(str4, 5);
        List<ai> a14 = a(str5, 6);
        List<ai> a15 = a(str6, 7);
        List<ai> a16 = a(str7, 3);
        a10.addAll(a11);
        a10.addAll(a12);
        a10.addAll(a13);
        a10.addAll(a14);
        a10.addAll(a15);
        a10.addAll(a16);
        return a10;
    }

    public static List<ai> a(String str, String str2) {
        List<ai> a10 = a(str, 0);
        a10.addAll(a(str2, 4));
        Collections.sort(a10);
        return a10;
    }

    private static List<ai> a(String str, int i10) {
        String str2;
        boolean z10;
        JSONArray jSONArray;
        int i11;
        String str3;
        String str4;
        boolean z11;
        ArrayList arrayList;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ATCustomAdapterConfig b10;
        int i12 = i10;
        String str10 = "pacing";
        String str11 = l.f6257s;
        String str12 = l.f6256r;
        String str13 = l.f6258t;
        String str14 = l.f6263z;
        if (i12 == 0 || i12 == 4 || i12 == 8) {
            str2 = l.E;
            z10 = false;
        } else {
            str2 = l.E;
            z10 = true;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            String str15 = l.D;
            JSONArray jSONArray2 = new JSONArray(str);
            String str16 = "unit_id";
            int i13 = 0;
            while (i13 < jSONArray2.length()) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i13);
                if (jSONObject != null) {
                    jSONArray = jSONArray2;
                    ai aiVar = new ai();
                    aiVar.e(i12);
                    i11 = i13;
                    aiVar.d(z10 ? 1 : 0);
                    if (jSONObject.isNull(str14)) {
                        aiVar.c("");
                    } else {
                        aiVar.c(jSONObject.optString(str14));
                    }
                    str4 = str14;
                    if (jSONObject.isNull(l.f6261w)) {
                        aiVar.b(-1);
                    } else {
                        aiVar.b(jSONObject.optInt(l.f6261w));
                    }
                    if (jSONObject.isNull(l.f6262x)) {
                        aiVar.c(-1);
                    } else {
                        aiVar.c(jSONObject.optInt(l.f6262x));
                    }
                    if (jSONObject.isNull("content")) {
                        aiVar.b("");
                    } else {
                        aiVar.b(jSONObject.optString("content"));
                    }
                    if (jSONObject.isNull("nw_firm_id")) {
                        aiVar.a(-1);
                    } else {
                        aiVar.a(jSONObject.optInt("nw_firm_id"));
                    }
                    if (jSONObject.isNull(l.f6260v)) {
                        aiVar.a("");
                    } else {
                        aiVar.a(jSONObject.optString(l.f6260v));
                    }
                    if (jSONObject.isNull(l.A)) {
                        aiVar.d("unknown");
                    } else {
                        aiVar.d(jSONObject.optString(l.A));
                    }
                    z11 = z10;
                    if (jSONObject.isNull(str13)) {
                        aiVar.c(0L);
                    } else {
                        aiVar.c(jSONObject.optInt(str13));
                    }
                    if (jSONObject.isNull(str12)) {
                        aiVar.d(0L);
                    } else {
                        aiVar.d(jSONObject.optInt(str12));
                    }
                    if (jSONObject.isNull(str11)) {
                        aiVar.h(1);
                    } else {
                        aiVar.h(jSONObject.optInt(str11));
                    }
                    if (jSONObject.isNull(str10)) {
                        aiVar.e(-1L);
                    } else {
                        aiVar.e(jSONObject.optLong(str10));
                    }
                    str6 = str16;
                    if (jSONObject.isNull(str6)) {
                        aiVar.e("");
                    } else {
                        aiVar.e(jSONObject.optString(str6));
                    }
                    str5 = str15;
                    str7 = str10;
                    str8 = str11;
                    if (jSONObject.isNull(str5)) {
                        aiVar.a(0.0d);
                        str9 = str12;
                        str3 = str13;
                    } else {
                        str9 = str12;
                        str3 = str13;
                        aiVar.a(jSONObject.optDouble(str5, 0.0d));
                    }
                    String str17 = str2;
                    if (jSONObject.isNull(str17)) {
                        aiVar.f(2000L);
                    } else {
                        aiVar.f(jSONObject.optInt(str17));
                    }
                    if (jSONObject.isNull(l.G)) {
                        aiVar.f("");
                    } else {
                        aiVar.f(jSONObject.optString(l.G));
                    }
                    if (jSONObject.isNull(l.H)) {
                        aiVar.i(0);
                    } else {
                        aiVar.i(jSONObject.optInt(l.H));
                    }
                    if (jSONObject.isNull(l.I)) {
                        aiVar.j(w.Z);
                    } else {
                        aiVar.j(jSONObject.optInt(l.I));
                    }
                    if (jSONObject.isNull("payload")) {
                        aiVar.g("");
                    } else {
                        aiVar.g(jSONObject.optString("payload"));
                    }
                    if (jSONObject.isNull("error")) {
                        aiVar.h("");
                    } else {
                        aiVar.h(jSONObject.optString("error"));
                    }
                    if (jSONObject.isNull(l.J)) {
                        aiVar.g(1800000L);
                    } else {
                        aiVar.g(jSONObject.optLong(l.J));
                    }
                    if (jSONObject.isNull(l.K)) {
                        aiVar.h(-1L);
                    } else {
                        aiVar.h(jSONObject.optLong(l.K));
                    }
                    if (jSONObject.isNull(l.L)) {
                        aiVar.b(1800000L);
                    } else {
                        aiVar.b(jSONObject.optLong(l.L));
                    }
                    if (jSONObject.isNull(l.ai)) {
                        aiVar.g(z11 ? 0 : 1);
                    } else {
                        aiVar.g(jSONObject.optInt(l.ai));
                    }
                    if (jSONObject.isNull(l.M)) {
                        aiVar.k(1);
                    } else {
                        aiVar.k(jSONObject.optInt(l.M));
                    }
                    if (jSONObject.isNull(l.N)) {
                        aiVar.l(1);
                    } else {
                        aiVar.l(jSONObject.optInt(l.N));
                    }
                    if (jSONObject.isNull(l.O)) {
                        aiVar.n(-1);
                    } else {
                        aiVar.n(jSONObject.optInt(l.O));
                    }
                    if (jSONObject.isNull("precision")) {
                        aiVar.i("publisher_defined");
                    } else {
                        aiVar.i(jSONObject.optString("precision"));
                    }
                    if (jSONObject.isNull(l.Q)) {
                        aiVar.i(0L);
                    } else {
                        aiVar.i(jSONObject.optLong(l.Q));
                    }
                    if (jSONObject.isNull(l.R)) {
                        aiVar.j(0L);
                    } else {
                        aiVar.j(jSONObject.optLong(l.R));
                    }
                    if (jSONObject.isNull(l.S)) {
                        aiVar.b(0.0d);
                        str2 = str17;
                    } else {
                        str2 = str17;
                        aiVar.b(jSONObject.optDouble(l.S, 0.0d));
                    }
                    if (jSONObject.isNull(l.T)) {
                        aiVar.o(1);
                    } else {
                        aiVar.o(jSONObject.optInt(l.T));
                    }
                    if (jSONObject.isNull(l.U)) {
                        aiVar.p(1);
                    } else {
                        aiVar.p(jSONObject.optInt(l.U));
                    }
                    if (jSONObject.isNull(l.V)) {
                        aiVar.q(2);
                    } else {
                        aiVar.q(jSONObject.optInt(l.V));
                    }
                    if (jSONObject.isNull(l.W)) {
                        aiVar.f(1);
                    } else {
                        aiVar.f(jSONObject.optInt(l.W));
                    }
                    if (jSONObject.isNull(l.Z)) {
                        aiVar.r(2);
                    } else {
                        aiVar.r(jSONObject.optInt(l.Z));
                    }
                    if (jSONObject.isNull(l.X)) {
                        aiVar.t(2);
                    } else {
                        aiVar.t(jSONObject.optInt(l.X));
                    }
                    if (jSONObject.isNull(l.Y)) {
                        aiVar.s(0);
                    } else {
                        aiVar.s(jSONObject.optInt(l.Y));
                    }
                    if (jSONObject.isNull(l.f6238aa)) {
                        aiVar.u(1);
                    } else {
                        aiVar.u(jSONObject.optInt(l.f6238aa));
                    }
                    if (jSONObject.isNull(l.f6241ad)) {
                        aiVar.j("");
                    } else {
                        aiVar.j(jSONObject.optString(l.f6241ad));
                    }
                    if (i10 == 7) {
                        com.anythink.core.common.d.c.a(n.a().g()).a(aiVar.t(), aiVar.W());
                    }
                    if (jSONObject.isNull(l.f6239ab)) {
                        aiVar.v(2);
                    } else {
                        aiVar.v(jSONObject.optInt(l.f6239ab));
                    }
                    if (jSONObject.isNull("ad_type")) {
                        aiVar.w(-1);
                    } else {
                        aiVar.w(jSONObject.optInt("ad_type", -1));
                    }
                    if (jSONObject.isNull(l.ae)) {
                        aiVar.x(-1);
                    } else {
                        aiVar.x(jSONObject.optInt(l.ae, -1));
                    }
                    if (aiVar.l() == 2) {
                        if (aiVar.c() == 22) {
                            aiVar.a(ATAdConst.CURRENCY.RMB_CENT);
                        } else {
                            aiVar.a(ATAdConst.CURRENCY.USD);
                        }
                    } else {
                        aiVar.a(ATAdConst.CURRENCY.USD);
                    }
                    if (jSONObject.isNull(l.af)) {
                        aiVar.z(0);
                    } else {
                        aiVar.z(jSONObject.optInt(l.af, 0));
                    }
                    if (jSONObject.isNull("bid_floor")) {
                        aiVar.c(0.0d);
                    } else {
                        aiVar.c(jSONObject.optDouble("bid_floor", 0.0d));
                    }
                    if (aiVar.c() >= 100000 && (b10 = n.a().b(aiVar.h())) != null) {
                        aiVar.f(b10.isRealTimeBidSwitch() ? 2 : 1);
                        aiVar.c(b10.getAdCacheTime());
                    }
                    if (jSONObject.isNull(l.al)) {
                        aiVar.A(-1);
                    } else {
                        aiVar.A(jSONObject.optInt(l.al, -1));
                    }
                    if (jSONObject.isNull(l.am)) {
                        aiVar.d(aiVar.x());
                    } else {
                        aiVar.d(jSONObject.optDouble(l.am, aiVar.x()));
                    }
                    if (jSONObject.isNull(l.an)) {
                        aiVar.k("CNY");
                    } else {
                        aiVar.k(jSONObject.optString(l.an, "CNY"));
                    }
                    arrayList = arrayList2;
                    try {
                        arrayList.add(aiVar);
                    } catch (Exception unused) {
                        return arrayList;
                    }
                } else {
                    jSONArray = jSONArray2;
                    i11 = i13;
                    str3 = str13;
                    str4 = str14;
                    z11 = z10;
                    arrayList = arrayList2;
                    str5 = str15;
                    str6 = str16;
                    str7 = str10;
                    str8 = str11;
                    str9 = str12;
                }
                i12 = i10;
                arrayList2 = arrayList;
                str12 = str9;
                str10 = str7;
                str11 = str8;
                z10 = z11;
                str13 = str3;
                str16 = str6;
                str15 = str5;
                str14 = str4;
                i13 = i11 + 1;
                jSONArray2 = jSONArray;
            }
        } catch (Exception unused2) {
        }
        return arrayList2;
    }

    private static List<s> a(String str, String str2, long j10, u uVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                s sVar = new s();
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                sVar.j(optJSONObject.optString("o_id"));
                sVar.k(optJSONObject.optString("c_id"));
                sVar.l(optJSONObject.optString(t.f6511a));
                sVar.w(optJSONObject.optString("p_g"));
                sVar.m(optJSONObject.optString("d"));
                sVar.n(optJSONObject.optString("ic_u"));
                sVar.o(optJSONObject.optString("im_u"));
                sVar.p(optJSONObject.optString("f_i_u"));
                sVar.q(optJSONObject.optString("a_c_u"));
                sVar.r(optJSONObject.optString("c_t"));
                sVar.s(optJSONObject.optString("v_u"));
                sVar.e(optJSONObject.optInt("l_t"));
                sVar.t(optJSONObject.optString("p_u"));
                sVar.u(optJSONObject.optString("dl"));
                sVar.v(optJSONObject.optString("c_u"));
                sVar.H(optJSONObject.optString("ip_u"));
                sVar.I(optJSONObject.optString("t_u"));
                sVar.J(optJSONObject.optString("t_u_25"));
                sVar.K(optJSONObject.optString("t_u_50"));
                sVar.L(optJSONObject.optString("t_u_75"));
                sVar.M(optJSONObject.optString("t_u_100"));
                sVar.N(optJSONObject.optString("s_e_c_t_u"));
                sVar.O(optJSONObject.optString("c_t_u"));
                sVar.P(optJSONObject.optString("ip_n_u"));
                sVar.Q(optJSONObject.optString("c_n_u"));
                sVar.R = optJSONObject.optInt("o_a_d_c");
                sVar.S = optJSONObject.optLong("o_a_p");
                sVar.a(j10);
                sVar.d(optJSONObject.optInt("unit_type"));
                sVar.a(optJSONObject.optInt("c_m"));
                sVar.b(optJSONObject.optString("ext_h_pic"));
                sVar.E(optJSONObject.optString("ext_big_h_pic"));
                sVar.F(optJSONObject.optString("ext_rect_h_pic"));
                sVar.G(optJSONObject.optString("ext_home_h_pic"));
                sVar.a(str2);
                sVar.y(optJSONObject.optString("pub"));
                sVar.z(optJSONObject.optString("app_vc"));
                sVar.A(optJSONObject.optString("pvc"));
                sVar.B(optJSONObject.optString("pms"));
                sVar.a((k) uVar);
                arrayList.add(sVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public final Map<String, Object> a(String str, String str2, ai aiVar) {
        m N;
        Map<String, Object> c10 = h.c(aiVar.g());
        boolean b10 = g.b();
        com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
        if (!TextUtils.isEmpty(aiVar.y())) {
            c10.put("payload", aiVar.y());
        }
        if (!TextUtils.isEmpty(aiVar.R())) {
            c10.put("custom_inhouse_bid_result", aiVar.R());
        }
        boolean z10 = false;
        c10.put(g.k.f5112c, Boolean.valueOf(h10.p() == 3));
        if (h10.q() == 2 && b10) {
            z10 = true;
        }
        c10.put(g.k.f5113d, Boolean.valueOf(z10));
        c10.put(g.k.f5114e, Boolean.valueOf(p.a(n.a().g()).c()));
        c10.put("ad_type", Integer.valueOf(aiVar.Y()));
        if (this.ay == 1) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "_");
            l10.append(this.C);
            l10.append("_");
            l10.append(this.f4830m);
            c10.put(g.k.f5121m, l10.toString());
        }
        c10.put(g.k.f5122n, v.a().g(str));
        if (aiVar.c() == 28 && (N = aiVar.N()) != null) {
            c10.put(g.k.o, Double.valueOf(com.anythink.core.common.k.g.a(aiVar) * N.f5700l));
        }
        String l11 = com.anythink.core.common.k.d.l();
        if (!TextUtils.isEmpty(l11)) {
            c10.put(ATAdConst.KEY.WECHAT_APPID, l11);
        }
        if (aiVar.c() == 35 || aiVar.l() == 3 || aiVar.l() == 4 || aiVar.l() == 7) {
            com.anythink.core.common.e.j jVar = new com.anythink.core.common.e.j();
            jVar.f5653a = aiVar.y();
            jVar.f = aiVar.c();
            jVar.f5655c = aiVar.t();
            jVar.f5656d = str2;
            jVar.f5654b = str;
            jVar.f5659h = this.C;
            jVar.f5660i = this.f4830m;
            jVar.f5661j = this.f4837u;
            jVar.f5658g = aiVar.d();
            m N2 = aiVar.N();
            jVar.f5662k = N2 != null ? N2.f5695g : "";
            jVar.f5663l = N2 != null ? N2.f5696h : "";
            if (aiVar.c() == 35) {
                jVar.f5664m = this.T;
            } else {
                jVar.f5664m = ab.c(this.aF);
            }
            k kVar = jVar.f5664m;
            if (kVar != null) {
                kVar.q(this.f4837u);
            }
            jVar.f5665n = N2 != null ? N2.f : 0L;
            c10.put(g.k.f5110a, jVar);
        }
        if (aiVar.ai()) {
            c10.put(g.k.f5117i, this.ar);
        }
        if (aiVar.c() == 50 && this.aB == 1) {
            c10.put(g.k.f5124q, str2);
        }
        if (aiVar.c() == 46) {
            ATAdConst.CURRENCY currency = ATAdConst.CURRENCY.RMB;
            if (TextUtils.equals(aiVar.ah(), "USD")) {
                currency = ATAdConst.CURRENCY.USD;
            }
            c10.put(g.k.f5125r, currency);
        }
        return c10;
    }
}
