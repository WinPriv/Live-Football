package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.c.g;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends ah implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5577a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5578b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5579c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5580d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5581e = 5;
    public static final int f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5582g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5583h = 8;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5584i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5585j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5586k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5587l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5588m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5589n = 2;
    int A;
    int B;
    public String C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected double H;
    boolean I;
    int J;
    String K;
    long L;
    long M;
    String N;
    private int aA;
    private String aB;
    private int aC;
    private int aE;
    private int aF;
    private boolean aG;
    private long aH;
    private long aI;
    private String aJ;
    private String aK;
    private String aL;
    private int aM;
    private String aO;
    private String aP;
    private double aQ;
    private String aR;
    private double aS;
    private double aT;
    private ATRewardInfo aU;
    private Map<String, ATRewardInfo> aV;
    private Map<String, Object> aW;
    private String aX;
    private long aY;
    private String aZ;
    private int aw;
    private String ax;
    private String ay;
    private int az;

    /* renamed from: ba, reason: collision with root package name */
    private String f5590ba;

    /* renamed from: bb, reason: collision with root package name */
    private int f5591bb;

    /* renamed from: bc, reason: collision with root package name */
    private int f5592bc;

    /* renamed from: bd, reason: collision with root package name */
    private String f5593bd;
    private long be;
    private int bf;
    private int bg;
    private int bh;
    private int bi;
    private long bj;
    private int bl;
    private int bm;
    private int bo;
    private String bp;
    private Map<String, Object> bq;
    protected int o;

    /* renamed from: t, reason: collision with root package name */
    public int f5598t;

    /* renamed from: u, reason: collision with root package name */
    public String f5599u;

    /* renamed from: v, reason: collision with root package name */
    public String f5600v;

    /* renamed from: w, reason: collision with root package name */
    int f5601w;

    /* renamed from: x, reason: collision with root package name */
    protected double f5602x;
    String y;

    /* renamed from: z, reason: collision with root package name */
    public int f5603z;
    private int aD = -1;

    /* renamed from: p, reason: collision with root package name */
    public String f5594p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f5595q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f5596r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f5597s = 0;
    private String aN = "unknow";
    private int bk = -1;
    private int bn = 1;

    private void A(String str) {
        this.C = str;
    }

    private void B(String str) {
        this.f5599u = str;
    }

    private double aa() {
        return this.H;
    }

    private int ab() {
        return this.bh;
    }

    private int ac() {
        return this.bg;
    }

    private String ad() {
        return this.C;
    }

    private int ae() {
        return this.f5603z;
    }

    private void af() {
        this.f5603z = 1;
    }

    private String ag() {
        return this.f5599u;
    }

    private boolean ah() {
        if (this.bi == 9) {
            return true;
        }
        return false;
    }

    private String ai() {
        return this.ax;
    }

    private String aj() {
        return this.f5594p;
    }

    private int ak() {
        return this.f5595q;
    }

    private int al() {
        return this.f5596r;
    }

    private int am() {
        return this.f5598t;
    }

    private boolean an() {
        return this.I;
    }

    private int ao() {
        return this.J;
    }

    private String ap() {
        return this.K;
    }

    private long aq() {
        return this.L;
    }

    private long ar() {
        return this.M;
    }

    private String as() {
        return this.N;
    }

    public final int C() {
        return this.aA;
    }

    public final String D() {
        return this.aB;
    }

    public final int E() {
        return this.aC;
    }

    public final int F() {
        return this.aD;
    }

    public final String G() {
        return this.ay;
    }

    public final int H() {
        return this.o;
    }

    public final int I() {
        return this.aw;
    }

    public final long J() {
        return this.aH;
    }

    public final long K() {
        return this.aI;
    }

    public final int L() {
        return this.bk;
    }

    public final int M() {
        return this.bo;
    }

    public final e N() {
        try {
            e eVar = (e) super.clone();
            eVar.aU = this.aU;
            eVar.bq = this.bq;
            eVar.aV = this.aV;
            eVar.aW = this.aW;
            return eVar;
        } catch (Throwable unused) {
            return this;
        }
    }

    public final void a(Map<String, Object> map) {
        this.bq = map;
    }

    public final void b(int i10) {
        this.bm = i10;
    }

    public final void c(int i10) {
        this.bi = i10;
    }

    public final void d(int i10) {
        this.bh = i10;
    }

    public final void e(int i10) {
        this.bg = i10;
    }

    public final void f(int i10) {
        this.bf = i10;
    }

    public final double g() {
        return this.aQ;
    }

    public final String h() {
        return this.aR;
    }

    public final String i() {
        return this.aX;
    }

    public final String j() {
        return this.y;
    }

    public final String k() {
        return this.aK;
    }

    public final String l() {
        return this.aL;
    }

    public final int m() {
        return this.aM;
    }

    public final String n() {
        return this.aN;
    }

    public final String o() {
        return this.aO;
    }

    public final String p() {
        return this.aP;
    }

    public final Map<String, ATRewardInfo> q() {
        return this.aV;
    }

    public final ATRewardInfo r() {
        return this.aU;
    }

    public final Map<String, Object> s() {
        return this.aW;
    }

    public final int t() {
        return this.A;
    }

    public final int u() {
        return this.B;
    }

    public final int v() {
        return this.f5601w;
    }

    public final double w() {
        return this.f5602x;
    }

    public final String x() {
        return this.aJ;
    }

    public final int y() {
        int i10 = this.bi;
        if (i10 != 8) {
            return i10 != 9 ? 0 : 1;
        }
        return 2;
    }

    public final int z() {
        return this.aE;
    }

    private void C(String str) {
        this.f5600v = str;
    }

    private void F(int i10) {
        this.f5595q = i10;
    }

    private void G(int i10) {
        this.f5596r = i10;
    }

    private void H(int i10) {
        this.f5597s = i10;
    }

    private void I(int i10) {
        this.f5598t = i10;
    }

    private JSONObject J(int i10) {
        return super.A(i10);
    }

    public final int A() {
        return this.aF;
    }

    public final int B() {
        return this.az;
    }

    public final Map<String, Object> a() {
        return this.bq;
    }

    public final int b() {
        return this.bf;
    }

    public final void c() {
        this.f5592bc = 1;
    }

    public final void d() {
        if (this.f5592bc != 1) {
            this.f5591bb = 1;
        }
    }

    public final String e() {
        return this.f5590ba;
    }

    public final double f() {
        return this.aT;
    }

    public final void g(int i10) {
        this.D = i10;
    }

    public final void h(int i10) {
        this.E = i10;
    }

    public final void i(int i10) {
        this.F = i10;
    }

    public final void j(int i10) {
        this.G = i10;
    }

    public final void k(int i10) {
        this.aM = i10;
    }

    public final void l(int i10) {
        this.A = i10;
    }

    public final void m(int i10) {
        this.B = i10;
    }

    public final void n(int i10) {
        this.f5601w = i10;
    }

    public final void o(int i10) {
        this.aE = i10;
    }

    public final void p(int i10) {
        this.aF = i10;
    }

    public final void q(int i10) {
        this.az = i10;
    }

    public final void r(int i10) {
        this.aA = i10;
    }

    public final void s(int i10) {
        this.aC = i10;
    }

    public final void t(int i10) {
        this.aD = i10;
    }

    public final void u(int i10) {
        this.o = i10;
    }

    public final void v(int i10) {
        this.aw = i10;
    }

    public final void w(int i10) {
        this.bk = i10;
    }

    public final void x(int i10) {
        this.bn = i10;
    }

    public final void y(int i10) {
        this.bo = i10;
    }

    public final void z(int i10) {
        this.J = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144 A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:24:0x0084, B:25:0x008b, B:26:0x009e, B:27:0x00a6, B:30:0x00bd, B:31:0x00b6, B:32:0x00c2, B:35:0x00fc, B:38:0x0111, B:40:0x0115, B:41:0x0119, B:43:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x0135, B:50:0x0144, B:51:0x0149, B:52:0x012c, B:53:0x0131, B:54:0x00f5, B:55:0x015f, B:60:0x017a, B:61:0x0175, B:62:0x018a, B:65:0x01b4, B:66:0x01ad, B:67:0x01b9, B:70:0x01c8, B:71:0x01e1, B:73:0x0214, B:74:0x021b, B:76:0x0282, B:78:0x02c3, B:79:0x02c8, B:81:0x02e3, B:82:0x0254, B:84:0x027b, B:85:0x02ec, B:86:0x033d, B:89:0x004a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5 A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:24:0x0084, B:25:0x008b, B:26:0x009e, B:27:0x00a6, B:30:0x00bd, B:31:0x00b6, B:32:0x00c2, B:35:0x00fc, B:38:0x0111, B:40:0x0115, B:41:0x0119, B:43:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x0135, B:50:0x0144, B:51:0x0149, B:52:0x012c, B:53:0x0131, B:54:0x00f5, B:55:0x015f, B:60:0x017a, B:61:0x0175, B:62:0x018a, B:65:0x01b4, B:66:0x01ad, B:67:0x01b9, B:70:0x01c8, B:71:0x01e1, B:73:0x0214, B:74:0x021b, B:76:0x0282, B:78:0x02c3, B:79:0x02c8, B:81:0x02e3, B:82:0x0254, B:84:0x027b, B:85:0x02ec, B:86:0x033d, B:89:0x004a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c3 A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:24:0x0084, B:25:0x008b, B:26:0x009e, B:27:0x00a6, B:30:0x00bd, B:31:0x00b6, B:32:0x00c2, B:35:0x00fc, B:38:0x0111, B:40:0x0115, B:41:0x0119, B:43:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x0135, B:50:0x0144, B:51:0x0149, B:52:0x012c, B:53:0x0131, B:54:0x00f5, B:55:0x015f, B:60:0x017a, B:61:0x0175, B:62:0x018a, B:65:0x01b4, B:66:0x01ad, B:67:0x01b9, B:70:0x01c8, B:71:0x01e1, B:73:0x0214, B:74:0x021b, B:76:0x0282, B:78:0x02c3, B:79:0x02c8, B:81:0x02e3, B:82:0x0254, B:84:0x027b, B:85:0x02ec, B:86:0x033d, B:89:0x004a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e3 A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:3:0x0008, B:5:0x0014, B:6:0x0019, B:8:0x0021, B:9:0x0028, B:11:0x0032, B:24:0x0084, B:25:0x008b, B:26:0x009e, B:27:0x00a6, B:30:0x00bd, B:31:0x00b6, B:32:0x00c2, B:35:0x00fc, B:38:0x0111, B:40:0x0115, B:41:0x0119, B:43:0x011d, B:45:0x0121, B:47:0x0127, B:48:0x0135, B:50:0x0144, B:51:0x0149, B:52:0x012c, B:53:0x0131, B:54:0x00f5, B:55:0x015f, B:60:0x017a, B:61:0x0175, B:62:0x018a, B:65:0x01b4, B:66:0x01ad, B:67:0x01b9, B:70:0x01c8, B:71:0x01e1, B:73:0x0214, B:74:0x021b, B:76:0x0282, B:78:0x02c3, B:79:0x02c8, B:81:0x02e3, B:82:0x0254, B:84:0x027b, B:85:0x02ec, B:86:0x033d, B:89:0x004a), top: B:2:0x0008 }] */
    @Override // com.anythink.core.common.e.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject A(int r23) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.e.A(int):org.json.JSONObject");
    }

    public final void a(double d10) {
        this.H = d10;
    }

    public final void b(String str) {
        this.f5593bd = str;
    }

    public final void c(String str) {
        this.f5590ba = str;
    }

    public final void e(String str) {
        this.aX = str;
    }

    public final void f(String str) {
        this.y = str;
    }

    public final void g(String str) {
        this.aK = str;
    }

    public final void h(String str) {
        this.aL = str;
    }

    public final void i(String str) {
        this.aN = str;
    }

    public final void j(String str) {
        this.aO = str;
    }

    public final void k(String str) {
        this.aP = str;
    }

    public final void l(String str) {
        this.aJ = str;
    }

    public final void m(String str) {
        this.aB = str;
    }

    public final void n(String str) {
        this.ay = str;
    }

    public final void o(String str) {
        this.ax = str;
    }

    public final void p(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5594p = str;
    }

    public final void q(String str) {
        this.aZ = str;
    }

    public final void r(String str) {
        this.K = str;
    }

    public final void s(String str) {
        this.N = str;
    }

    public final void a(String str) {
        this.bp = str;
    }

    public final void b(long j10) {
        this.be = j10;
    }

    public final void c(double d10) {
        this.aQ = d10;
    }

    public final void d(String str) {
        this.aR = str;
    }

    public final void e(long j10) {
        this.L = j10;
    }

    public final void f(long j10) {
        this.M = j10;
    }

    public final void a(int i10) {
        this.bl = i10;
    }

    public final void b(double d10) {
        this.aT = d10;
    }

    public final void c(Map<String, Object> map) {
        this.aW = map;
    }

    public final void d(double d10) {
        this.f5602x = d10;
    }

    public final void a(long j10) {
        this.bj = j10;
    }

    public final void b(Map<String, ATRewardInfo> map) {
        this.aV = map;
    }

    public final void c(long j10) {
        this.aH = j10;
    }

    public final void d(long j10) {
        this.aI = j10;
    }

    private void b(boolean z10) {
        this.aG = z10;
    }

    public final void a(ATRewardInfo aTRewardInfo) {
        this.aU = aTRewardInfo;
    }

    public final void a(boolean z10) {
        this.I = z10;
    }

    private void a(int i10, JSONObject jSONObject) {
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6 || i10 == 13) {
            jSONObject.put(g.a.f5311h, this.aZ);
        }
    }
}
