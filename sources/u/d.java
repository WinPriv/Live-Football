package u;

import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.jsb.constant.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.c;
import v.n;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class d {
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c Q;
    public final c R;
    public final c[] S;
    public final ArrayList<c> T;
    public final boolean[] U;
    public final int[] V;
    public d W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f35630a0;

    /* renamed from: b, reason: collision with root package name */
    public v.c f35631b;

    /* renamed from: b0, reason: collision with root package name */
    public int f35632b0;

    /* renamed from: c, reason: collision with root package name */
    public v.c f35633c;

    /* renamed from: c0, reason: collision with root package name */
    public int f35634c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f35636d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f35638e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f35639f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f35641g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f35643h0;

    /* renamed from: i0, reason: collision with root package name */
    public Object f35645i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f35647j0;

    /* renamed from: k, reason: collision with root package name */
    public String f35648k;

    /* renamed from: k0, reason: collision with root package name */
    public String f35649k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35650l;

    /* renamed from: l0, reason: collision with root package name */
    public int f35651l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35652m;

    /* renamed from: m0, reason: collision with root package name */
    public int f35653m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35654n;

    /* renamed from: n0, reason: collision with root package name */
    public final float[] f35655n0;
    public boolean o;

    /* renamed from: o0, reason: collision with root package name */
    public final d[] f35656o0;

    /* renamed from: p, reason: collision with root package name */
    public int f35657p;

    /* renamed from: p0, reason: collision with root package name */
    public final d[] f35658p0;

    /* renamed from: q, reason: collision with root package name */
    public int f35659q;

    /* renamed from: q0, reason: collision with root package name */
    public int f35660q0;

    /* renamed from: r, reason: collision with root package name */
    public int f35661r;

    /* renamed from: r0, reason: collision with root package name */
    public int f35662r0;

    /* renamed from: s, reason: collision with root package name */
    public int f35663s;

    /* renamed from: t, reason: collision with root package name */
    public int f35664t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f35665u;

    /* renamed from: v, reason: collision with root package name */
    public int f35666v;

    /* renamed from: w, reason: collision with root package name */
    public int f35667w;

    /* renamed from: x, reason: collision with root package name */
    public float f35668x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f35669z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f35629a = false;

    /* renamed from: d, reason: collision with root package name */
    public v.l f35635d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f35637e = null;
    public final boolean[] f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f35640g = true;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f35642h = true;

    /* renamed from: i, reason: collision with root package name */
    public int f35644i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f35646j = -1;

    public d() {
        new HashMap();
        this.f35650l = false;
        this.f35652m = false;
        this.f35654n = false;
        this.o = false;
        this.f35657p = -1;
        this.f35659q = -1;
        this.f35661r = 0;
        this.f35663s = 0;
        this.f35664t = 0;
        this.f35665u = new int[2];
        this.f35666v = 0;
        this.f35667w = 0;
        this.f35668x = 1.0f;
        this.y = 0;
        this.f35669z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = gl.Code;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, c.a.LEFT);
        this.K = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.L = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.M = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.N = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.O = cVar5;
        c cVar6 = new c(this, c.a.CENTER_X);
        this.P = cVar6;
        c cVar7 = new c(this, c.a.CENTER_Y);
        this.Q = cVar7;
        c cVar8 = new c(this, c.a.CENTER);
        this.R = cVar8;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList<c> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        this.V = new int[]{1, 1};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = gl.Code;
        this.f35630a0 = -1;
        this.f35632b0 = 0;
        this.f35634c0 = 0;
        this.f35636d0 = 0;
        this.f35641g0 = 0.5f;
        this.f35643h0 = 0.5f;
        this.f35647j0 = 0;
        this.f35649k0 = null;
        this.f35651l0 = 0;
        this.f35653m0 = 0;
        this.f35655n0 = new float[]{-1.0f, -1.0f};
        this.f35656o0 = new d[]{null, null};
        this.f35658p0 = new d[]{null, null};
        this.f35660q0 = -1;
        this.f35662r0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void H(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void I(StringBuilder sb2, String str, float f, float f10) {
        if (f == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f);
        sb2.append(",\n");
    }

    public static void p(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f) {
        sb2.append(str);
        sb2.append(" :  {\n");
        H(i10, 0, "      size", sb2);
        H(i11, 0, "      min", sb2);
        H(i12, Integer.MAX_VALUE, "      max", sb2);
        H(i13, 0, "      matchMin", sb2);
        H(i14, 0, "      matchDef", sb2);
        I(sb2, "      matchPercent", f, 1.0f);
        sb2.append("    },\n");
    }

    public static void q(StringBuilder sb2, String str, c cVar) {
        if (cVar.f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(cVar.f);
        sb2.append("'");
        if (cVar.f35620h != Integer.MIN_VALUE || cVar.f35619g != 0) {
            sb2.append(",");
            sb2.append(cVar.f35619g);
            if (cVar.f35620h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(cVar.f35620h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A() {
        if (this.f35640g && this.f35647j0 != 8) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if (!this.f35650l && (!this.K.f35616c || !this.M.f35616c)) {
            return false;
        }
        return true;
    }

    public boolean C() {
        if (!this.f35652m && (!this.L.f35616c || !this.N.f35616c)) {
            return false;
        }
        return true;
    }

    public void D() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = gl.Code;
        this.X = 0;
        this.Y = 0;
        this.Z = gl.Code;
        this.f35630a0 = -1;
        this.f35632b0 = 0;
        this.f35634c0 = 0;
        this.f35636d0 = 0;
        this.f35638e0 = 0;
        this.f35639f0 = 0;
        this.f35641g0 = 0.5f;
        this.f35643h0 = 0.5f;
        int[] iArr = this.V;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f35645i0 = null;
        this.f35647j0 = 0;
        this.f35651l0 = 0;
        this.f35653m0 = 0;
        float[] fArr = this.f35655n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f35657p = -1;
        this.f35659q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f35663s = 0;
        this.f35664t = 0;
        this.f35668x = 1.0f;
        this.A = 1.0f;
        this.f35667w = Integer.MAX_VALUE;
        this.f35669z = Integer.MAX_VALUE;
        this.f35666v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f35640g = true;
        int[] iArr3 = this.f35665u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f35644i = -1;
        this.f35646j = -1;
    }

    public final void E() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList<c> arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).j();
        }
    }

    public final void F() {
        this.f35650l = false;
        this.f35652m = false;
        this.f35654n = false;
        this.o = false;
        ArrayList<c> arrayList = this.T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = arrayList.get(i10);
            cVar.f35616c = false;
            cVar.f35615b = 0;
        }
    }

    public void G(m2.g gVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void J(int i10, int i11) {
        if (this.f35650l) {
            return;
        }
        this.K.l(i10);
        this.M.l(i11);
        this.f35632b0 = i10;
        this.X = i11 - i10;
        this.f35650l = true;
    }

    public final void K(int i10, int i11) {
        if (this.f35652m) {
            return;
        }
        this.L.l(i10);
        this.N.l(i11);
        this.f35634c0 = i10;
        this.Y = i11 - i10;
        if (this.F) {
            this.O.l(i10 + this.f35636d0);
        }
        this.f35652m = true;
    }

    public final void L(int i10) {
        this.Y = i10;
        int i11 = this.f35639f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public final void M(int i10) {
        this.V[0] = i10;
    }

    public final void N(int i10) {
        this.V[1] = i10;
    }

    public final void O(int i10) {
        this.X = i10;
        int i11 = this.f35638e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i10;
        int i11;
        v.l lVar = this.f35635d;
        boolean z12 = z10 & lVar.f35900g;
        n nVar = this.f35637e;
        boolean z13 = z11 & nVar.f35900g;
        int i12 = lVar.f35901h.f35877g;
        int i13 = nVar.f35901h.f35877g;
        int i14 = lVar.f35902i.f35877g;
        int i15 = nVar.f35902i.f35877g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f35632b0 = i12;
        }
        if (z13) {
            this.f35634c0 = i13;
        }
        if (this.f35647j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        if (z12) {
            if (iArr[0] == 1 && i17 < (i11 = this.X)) {
                i17 = i11;
            }
            this.X = i17;
            int i19 = this.f35638e0;
            if (i17 < i19) {
                this.X = i19;
            }
        }
        if (z13) {
            if (iArr[1] == 1 && i18 < (i10 = this.Y)) {
                i18 = i10;
            }
            this.Y = i18;
            int i20 = this.f35639f0;
            if (i18 < i20) {
                this.Y = i20;
            }
        }
    }

    public void Q(s.c cVar, boolean z10) {
        int i10;
        int i11;
        n nVar;
        v.l lVar;
        cVar.getClass();
        int n10 = s.c.n(this.K);
        int n11 = s.c.n(this.L);
        int n12 = s.c.n(this.M);
        int n13 = s.c.n(this.N);
        if (z10 && (lVar = this.f35635d) != null) {
            v.f fVar = lVar.f35901h;
            if (fVar.f35880j) {
                v.f fVar2 = lVar.f35902i;
                if (fVar2.f35880j) {
                    n10 = fVar.f35877g;
                    n12 = fVar2.f35877g;
                }
            }
        }
        if (z10 && (nVar = this.f35637e) != null) {
            v.f fVar3 = nVar.f35901h;
            if (fVar3.f35880j) {
                v.f fVar4 = nVar.f35902i;
                if (fVar4.f35880j) {
                    n11 = fVar3.f35877g;
                    n13 = fVar4.f35877g;
                }
            }
        }
        int i12 = n13 - n11;
        if (n12 - n10 < 0 || i12 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        int i13 = n12 - n10;
        int i14 = n13 - n11;
        this.f35632b0 = n10;
        this.f35634c0 = n11;
        if (this.f35647j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.X)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.Y)) {
            i14 = i10;
        }
        this.X = i13;
        this.Y = i14;
        int i16 = this.f35639f0;
        if (i14 < i16) {
            this.Y = i16;
        }
        int i17 = this.f35638e0;
        if (i13 < i17) {
            this.X = i17;
        }
        int i18 = this.f35667w;
        if (i18 > 0 && i15 == 3) {
            this.X = Math.min(this.X, i18);
        }
        int i19 = this.f35669z;
        if (i19 > 0 && iArr[1] == 3) {
            this.Y = Math.min(this.Y, i19);
        }
        int i20 = this.X;
        if (i13 != i20) {
            this.f35644i = i20;
        }
        int i21 = this.Y;
        if (i14 != i21) {
            this.f35646j = i21;
        }
    }

    public final void b(e eVar, s.c cVar, HashSet<d> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            q.e.f(eVar, cVar, this);
            hashSet.remove(this);
            c(cVar, eVar.W(64));
        }
        if (i10 == 0) {
            HashSet<c> hashSet2 = this.K.f35614a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f35617d.b(eVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<c> hashSet3 = this.M.f35614a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f35617d.b(eVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.L.f35614a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f35617d.b(eVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet5 = this.N.f35614a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f35617d.b(eVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet6 = this.O.f35614a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f35617d.b(eVar, cVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:362:0x00d9, code lost:
    
        if (r0.d() > r3.J0.get().d()) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(s.c r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 2047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.c(s.c, boolean):void");
    }

    public boolean d() {
        if (this.f35647j0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(s.c r29, boolean r30, boolean r31, boolean r32, boolean r33, s.g r34, s.g r35, int r36, boolean r37, u.c r38, u.c r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.e(s.c, boolean, boolean, boolean, boolean, s.g, s.g, int, boolean, u.c, u.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void f(c.a aVar, d dVar, c.a aVar2, int i10) {
        boolean z10;
        c.a aVar3 = c.a.CENTER;
        c.a aVar4 = c.a.CENTER_Y;
        c.a aVar5 = c.a.CENTER_X;
        c.a aVar6 = c.a.LEFT;
        c.a aVar7 = c.a.TOP;
        c.a aVar8 = c.a.RIGHT;
        c.a aVar9 = c.a.BOTTOM;
        if (aVar == aVar3) {
            if (aVar2 == aVar3) {
                c j10 = j(aVar6);
                c j11 = j(aVar8);
                c j12 = j(aVar7);
                c j13 = j(aVar9);
                boolean z11 = true;
                if ((j10 != null && j10.h()) || (j11 != null && j11.h())) {
                    z10 = false;
                } else {
                    f(aVar6, dVar, aVar6, 0);
                    f(aVar8, dVar, aVar8, 0);
                    z10 = true;
                }
                if ((j12 != null && j12.h()) || (j13 != null && j13.h())) {
                    z11 = false;
                } else {
                    f(aVar7, dVar, aVar7, 0);
                    f(aVar9, dVar, aVar9, 0);
                }
                if (z10 && z11) {
                    j(aVar3).a(dVar.j(aVar3), 0);
                    return;
                } else if (z10) {
                    j(aVar5).a(dVar.j(aVar5), 0);
                    return;
                } else {
                    if (z11) {
                        j(aVar4).a(dVar.j(aVar4), 0);
                        return;
                    }
                    return;
                }
            }
            if (aVar2 != aVar6 && aVar2 != aVar8) {
                if (aVar2 == aVar7 || aVar2 == aVar9) {
                    f(aVar7, dVar, aVar2, 0);
                    f(aVar9, dVar, aVar2, 0);
                    j(aVar3).a(dVar.j(aVar2), 0);
                    return;
                }
                return;
            }
            f(aVar6, dVar, aVar2, 0);
            f(aVar8, dVar, aVar2, 0);
            j(aVar3).a(dVar.j(aVar2), 0);
            return;
        }
        if (aVar == aVar5 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            c j14 = j(aVar6);
            c j15 = dVar.j(aVar2);
            c j16 = j(aVar8);
            j14.a(j15, 0);
            j16.a(j15, 0);
            j(aVar5).a(j15, 0);
            return;
        }
        if (aVar == aVar4 && (aVar2 == aVar7 || aVar2 == aVar9)) {
            c j17 = dVar.j(aVar2);
            j(aVar7).a(j17, 0);
            j(aVar9).a(j17, 0);
            j(aVar4).a(j17, 0);
            return;
        }
        if (aVar == aVar5 && aVar2 == aVar5) {
            j(aVar6).a(dVar.j(aVar6), 0);
            j(aVar8).a(dVar.j(aVar8), 0);
            j(aVar5).a(dVar.j(aVar2), 0);
            return;
        }
        if (aVar == aVar4 && aVar2 == aVar4) {
            j(aVar7).a(dVar.j(aVar7), 0);
            j(aVar9).a(dVar.j(aVar9), 0);
            j(aVar4).a(dVar.j(aVar2), 0);
            return;
        }
        c j18 = j(aVar);
        c j19 = dVar.j(aVar2);
        if (j18.i(j19)) {
            c.a aVar10 = c.a.BASELINE;
            if (aVar == aVar10) {
                c j20 = j(aVar7);
                c j21 = j(aVar9);
                if (j20 != null) {
                    j20.j();
                }
                if (j21 != null) {
                    j21.j();
                }
            } else if (aVar != aVar7 && aVar != aVar9) {
                if (aVar == aVar6 || aVar == aVar8) {
                    c j22 = j(aVar3);
                    if (j22.f != j19) {
                        j22.j();
                    }
                    c f = j(aVar).f();
                    c j23 = j(aVar5);
                    if (j23.h()) {
                        f.j();
                        j23.j();
                    }
                }
            } else {
                c j24 = j(aVar10);
                if (j24 != null) {
                    j24.j();
                }
                c j25 = j(aVar3);
                if (j25.f != j19) {
                    j25.j();
                }
                c f10 = j(aVar).f();
                c j26 = j(aVar4);
                if (j26.h()) {
                    f10.j();
                    j26.j();
                }
            }
            j18.a(j19, i10);
        }
    }

    public final void g(c cVar, c cVar2, int i10) {
        if (cVar.f35617d == this) {
            f(cVar.f35618e, cVar2.f35617d, cVar2.f35618e, i10);
        }
    }

    public final void h(s.c cVar) {
        cVar.k(this.K);
        cVar.k(this.L);
        cVar.k(this.M);
        cVar.k(this.N);
        if (this.f35636d0 > 0) {
            cVar.k(this.O);
        }
    }

    public final void i() {
        if (this.f35635d == null) {
            this.f35635d = new v.l(this);
        }
        if (this.f35637e == null) {
            this.f35637e = new n(this);
        }
    }

    public c j(c.a aVar) {
        switch (aVar) {
            case NONE:
                return null;
            case LEFT:
                return this.K;
            case TOP:
                return this.L;
            case RIGHT:
                return this.M;
            case BOTTOM:
                return this.N;
            case BASELINE:
                return this.O;
            case CENTER:
                return this.R;
            case CENTER_X:
                return this.P;
            case CENTER_Y:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int k(int i10) {
        int[] iArr = this.V;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int l() {
        if (this.f35647j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final d m(int i10) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f;
            if (cVar4 != null && cVar4.f == cVar3) {
                return cVar4.f35617d;
            }
            return null;
        }
        if (i10 == 1 && (cVar2 = (cVar = this.N).f) != null && cVar2.f == cVar) {
            return cVar2.f35617d;
        }
        return null;
    }

    public final d n(int i10) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.K;
            c cVar4 = cVar3.f;
            if (cVar4 != null && cVar4.f == cVar3) {
                return cVar4.f35617d;
            }
            return null;
        }
        if (i10 == 1 && (cVar2 = (cVar = this.L).f) != null && cVar2.f == cVar) {
            return cVar2.f35617d;
        }
        return null;
    }

    public void o(StringBuilder sb2) {
        sb2.append("  " + this.f35648k + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f35632b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f35634c0);
        sb2.append("\n");
        q(sb2, "left", this.K);
        q(sb2, Constant.MAP_KEY_TOP, this.L);
        q(sb2, "right", this.M);
        q(sb2, "bottom", this.N);
        q(sb2, "baseline", this.O);
        q(sb2, "centerX", this.P);
        q(sb2, "centerY", this.Q);
        int i10 = this.X;
        int i11 = this.f35638e0;
        int[] iArr = this.D;
        int i12 = iArr[0];
        int i13 = this.f35666v;
        int i14 = this.f35663s;
        float f = this.f35668x;
        float[] fArr = this.f35655n0;
        float f10 = fArr[0];
        p(sb2, "    width", i10, i11, i12, i13, i14, f);
        int i15 = this.Y;
        int i16 = this.f35639f0;
        int i17 = iArr[1];
        int i18 = this.y;
        int i19 = this.f35664t;
        float f11 = this.A;
        float f12 = fArr[1];
        p(sb2, "    height", i15, i16, i17, i18, i19, f11);
        float f13 = this.Z;
        int i20 = this.f35630a0;
        if (f13 != gl.Code) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f35641g0, 0.5f);
        I(sb2, "    verticalBias", this.f35643h0, 0.5f);
        H(this.f35651l0, 0, "    horizontalChainStyle", sb2);
        H(this.f35653m0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int r() {
        if (this.f35647j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int s() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f35675z0 + this.f35632b0;
        }
        return this.f35632b0;
    }

    public final int t() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).A0 + this.f35634c0;
        }
        return this.f35634c0;
    }

    public String toString() {
        String str = "";
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j("");
        if (this.f35649k0 != null) {
            str = a3.l.p(new StringBuilder("id: "), this.f35649k0, " ");
        }
        j10.append(str);
        j10.append("(");
        j10.append(this.f35632b0);
        j10.append(", ");
        j10.append(this.f35634c0);
        j10.append(") - (");
        j10.append(this.X);
        j10.append(" x ");
        return com.ironsource.adapters.facebook.a.i(j10, this.Y, ")");
    }

    public final boolean u(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 == 0) {
            if (this.K.f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (this.M.f != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i14 + i15 < 2) {
                return true;
            }
            return false;
        }
        if (this.L.f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.N.f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i16 = i11 + i12;
        if (this.O.f != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i16 + i13 < 2) {
            return true;
        }
        return false;
    }

    public final boolean v(int i10, int i11) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i10 == 0) {
            c cVar5 = this.K;
            c cVar6 = cVar5.f;
            if (cVar6 != null && cVar6.f35616c && (cVar4 = (cVar3 = this.M).f) != null && cVar4.f35616c) {
                if ((cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            c cVar7 = this.L;
            c cVar8 = cVar7.f;
            if (cVar8 != null && cVar8.f35616c && (cVar2 = (cVar = this.N).f) != null && cVar2.f35616c) {
                if ((cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void w(c.a aVar, d dVar, c.a aVar2, int i10, int i11) {
        j(aVar).b(dVar.j(aVar2), i10, i11, true);
    }

    public final boolean x(int i10) {
        c cVar;
        c cVar2;
        int i11 = i10 * 2;
        c[] cVarArr = this.S;
        c cVar3 = cVarArr[i11];
        c cVar4 = cVar3.f;
        if (cVar4 != null && cVar4.f != cVar3 && (cVar2 = (cVar = cVarArr[i11 + 1]).f) != null && cVar2.f == cVar) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        c cVar = this.K;
        c cVar2 = cVar.f;
        if (cVar2 == null || cVar2.f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f;
            if (cVar4 != null && cVar4.f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        c cVar = this.L;
        c cVar2 = cVar.f;
        if (cVar2 == null || cVar2.f != cVar) {
            c cVar3 = this.N;
            c cVar4 = cVar3.f;
            if (cVar4 != null && cVar4.f == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
