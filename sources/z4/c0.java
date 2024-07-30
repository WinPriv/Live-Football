package z4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.z0;
import p4.u;
import z4.d0;

/* compiled from: TsExtractor.java */
/* loaded from: classes2.dex */
public final class c0 implements p4.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f37007a;

    /* renamed from: b, reason: collision with root package name */
    public final List<d6.d0> f37008b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.w f37009c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f37010d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.c f37011e;
    public final SparseArray<d0> f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f37012g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f37013h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f37014i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f37015j;

    /* renamed from: k, reason: collision with root package name */
    public p4.j f37016k;

    /* renamed from: l, reason: collision with root package name */
    public int f37017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f37018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37019n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public d0 f37020p;

    /* renamed from: q, reason: collision with root package name */
    public int f37021q;

    /* renamed from: r, reason: collision with root package name */
    public int f37022r;

    public c0(int i10, d6.d0 d0Var, g gVar) {
        this.f37011e = gVar;
        this.f37007a = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f37008b = arrayList;
            arrayList.add(d0Var);
        } else {
            this.f37008b = Collections.singletonList(d0Var);
        }
        this.f37009c = new d6.w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f37012g = sparseBooleanArray;
        this.f37013h = new SparseBooleanArray();
        SparseArray<d0> sparseArray = new SparseArray<>();
        this.f = sparseArray;
        this.f37010d = new SparseIntArray();
        this.f37014i = new b0();
        this.f37016k = p4.j.f34324b0;
        this.f37022r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (d0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new y(new a()));
        this.f37020p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    @Override // p4.h
    public final int c(p4.i iVar, p4.t tVar) throws IOException {
        p4.e eVar;
        ?? r32;
        int i10;
        ?? r15;
        ?? r22;
        int i11;
        int i12;
        ?? r13;
        ?? r14;
        ?? r72;
        int i13;
        ?? r33;
        p4.e eVar2;
        long j10;
        p4.t tVar2;
        ?? r92;
        long j11;
        long j12;
        ?? r62;
        p4.e eVar3 = (p4.e) iVar;
        long j13 = eVar3.f34313c;
        boolean z10 = this.f37018m;
        int i14 = this.f37007a;
        if (z10) {
            if (j13 != -1 && i14 != 2) {
                r33 = true;
            } else {
                r33 = false;
            }
            b0 b0Var = this.f37014i;
            if (r33 != false && !b0Var.f36999d) {
                int i15 = this.f37022r;
                if (i15 <= 0) {
                    b0Var.a(eVar3);
                    return 0;
                }
                boolean z11 = b0Var.f;
                d6.w wVar = b0Var.f36998c;
                int i16 = b0Var.f36996a;
                if (!z11) {
                    int min = (int) Math.min(i16, j13);
                    long j14 = j13 - min;
                    if (eVar3.f34314d != j14) {
                        tVar.f34349a = j14;
                    } else {
                        wVar.B(min);
                        eVar3.f = 0;
                        eVar3.c(wVar.f27384a, 0, min, false);
                        int i17 = wVar.f27385b;
                        int i18 = wVar.f27386c;
                        int i19 = i18 - 188;
                        while (true) {
                            if (i19 >= i17) {
                                byte[] bArr = wVar.f27384a;
                                int i20 = -4;
                                int i21 = 0;
                                while (true) {
                                    if (i20 <= 4) {
                                        int i22 = (i20 * 188) + i19;
                                        if (i22 >= i17 && i22 < i18 && bArr[i22] == 71) {
                                            i21++;
                                            if (i21 == 5) {
                                                r62 = true;
                                                break;
                                            }
                                        } else {
                                            i21 = 0;
                                        }
                                        i20++;
                                    } else {
                                        r62 = false;
                                        break;
                                    }
                                }
                                if (r62 != false) {
                                    long H0 = androidx.activity.n.H0(i19, i15, wVar);
                                    if (H0 != com.anythink.expressad.exoplayer.b.f7291b) {
                                        j12 = H0;
                                        break;
                                    }
                                }
                                i19--;
                            } else {
                                j12 = com.anythink.expressad.exoplayer.b.f7291b;
                                break;
                            }
                        }
                        b0Var.f37002h = j12;
                        b0Var.f = true;
                        return 0;
                    }
                } else {
                    if (b0Var.f37002h == com.anythink.expressad.exoplayer.b.f7291b) {
                        b0Var.a(eVar3);
                        return 0;
                    }
                    if (!b0Var.f37000e) {
                        int min2 = (int) Math.min(i16, j13);
                        long j15 = 0;
                        if (eVar3.f34314d != j15) {
                            tVar.f34349a = j15;
                        } else {
                            wVar.B(min2);
                            eVar3.f = 0;
                            eVar3.c(wVar.f27384a, 0, min2, false);
                            int i23 = wVar.f27385b;
                            int i24 = wVar.f27386c;
                            while (true) {
                                if (i23 < i24) {
                                    if (wVar.f27384a[i23] == 71) {
                                        long H02 = androidx.activity.n.H0(i23, i15, wVar);
                                        if (H02 != com.anythink.expressad.exoplayer.b.f7291b) {
                                            j11 = H02;
                                            break;
                                        }
                                    }
                                    i23++;
                                } else {
                                    j11 = com.anythink.expressad.exoplayer.b.f7291b;
                                    break;
                                }
                            }
                            b0Var.f37001g = j11;
                            b0Var.f37000e = true;
                            return 0;
                        }
                    } else {
                        long j16 = b0Var.f37001g;
                        if (j16 == com.anythink.expressad.exoplayer.b.f7291b) {
                            b0Var.a(eVar3);
                            return 0;
                        }
                        d6.d0 d0Var = b0Var.f36997b;
                        long b10 = d0Var.b(b0Var.f37002h) - d0Var.b(j16);
                        b0Var.f37003i = b10;
                        if (b10 < 0) {
                            d6.p.f("TsDurationReader", "Invalid duration: " + b0Var.f37003i + ". Using TIME_UNSET instead.");
                            b0Var.f37003i = com.anythink.expressad.exoplayer.b.f7291b;
                        }
                        b0Var.a(eVar3);
                        return 0;
                    }
                }
                return 1;
            }
            if (!this.f37019n) {
                this.f37019n = true;
                long j17 = b0Var.f37003i;
                if (j17 != com.anythink.expressad.exoplayer.b.f7291b) {
                    eVar2 = eVar3;
                    j10 = 0;
                    r15 = 0;
                    a0 a0Var = new a0(b0Var.f36997b, j17, j13, this.f37022r, 112800);
                    this.f37015j = a0Var;
                    this.f37016k.i(a0Var.f34279a);
                    r32 = 1;
                    i10 = i14;
                } else {
                    eVar2 = eVar3;
                    j10 = 0;
                    r32 = 1;
                    i10 = i14;
                    r15 = 0;
                    this.f37016k.i(new u.b(j17));
                }
            } else {
                eVar2 = eVar3;
                j10 = 0;
                r32 = 1;
                i10 = i14;
                r15 = 0;
            }
            if (this.o) {
                this.o = r15;
                g(j10, j10);
                eVar = eVar2;
                if (eVar.f34314d != j10) {
                    tVar.f34349a = j10;
                    return r32 == true ? 1 : 0;
                }
                tVar2 = tVar;
            } else {
                tVar2 = tVar;
                eVar = eVar2;
            }
            a0 a0Var2 = this.f37015j;
            if (a0Var2 != null) {
                if (a0Var2.f34281c != null) {
                    r92 = r32 == true ? 1 : 0;
                } else {
                    r92 = r15 == true ? 1 : 0;
                }
                if (r92 != false) {
                    return a0Var2.a(eVar, tVar2);
                }
            }
        } else {
            eVar = eVar3;
            r32 = 1;
            i10 = i14;
            r15 = 0;
        }
        d6.w wVar2 = this.f37009c;
        byte[] bArr2 = wVar2.f27384a;
        int i25 = wVar2.f27385b;
        if (9400 - i25 < 188) {
            int i26 = wVar2.f27386c - i25;
            if (i26 > 0) {
                System.arraycopy(bArr2, i25, bArr2, r15, i26);
            }
            wVar2.C(i26, bArr2);
        }
        while (true) {
            int i27 = wVar2.f27386c;
            if (i27 - wVar2.f27385b < 188) {
                int read = eVar.read(bArr2, i27, 9400 - i27);
                if (read == -1) {
                    r22 = r15;
                    break;
                }
                wVar2.D(i27 + read);
            } else {
                r22 = r32;
                break;
            }
        }
        if (r22 == false) {
            return -1;
        }
        int i28 = wVar2.f27385b;
        int i29 = wVar2.f27386c;
        byte[] bArr3 = wVar2.f27384a;
        int i30 = i28;
        while (i30 < i29 && bArr3[i30] != 71) {
            i30++;
        }
        wVar2.E(i30);
        int i31 = i30 + 188;
        d0 d0Var2 = null;
        if (i31 > i29) {
            int i32 = (i30 - i28) + this.f37021q;
            this.f37021q = i32;
            i11 = 2;
            if (i10 == 2 && i32 > 376) {
                throw z0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = 2;
            this.f37021q = r15;
        }
        int i33 = wVar2.f27386c;
        if (i31 > i33) {
            return r15;
        }
        int d10 = wVar2.d();
        if ((8388608 & d10) != 0) {
            wVar2.E(i31);
            return r15;
        }
        if ((4194304 & d10) != 0) {
            i12 = r32;
        } else {
            i12 = r15;
        }
        int i34 = i12 | r15;
        int i35 = (2096896 & d10) >> 8;
        if ((d10 & 32) != 0) {
            r13 = r32;
        } else {
            r13 = r15;
        }
        if ((d10 & 16) != 0) {
            r14 = r32;
        } else {
            r14 = r15;
        }
        if (r14 != false) {
            d0Var2 = this.f.get(i35);
        }
        if (d0Var2 == null) {
            wVar2.E(i31);
            return r15;
        }
        if (i10 != i11) {
            int i36 = d10 & 15;
            SparseIntArray sparseIntArray = this.f37010d;
            int i37 = sparseIntArray.get(i35, i36 - 1);
            sparseIntArray.put(i35, i36);
            if (i37 == i36) {
                wVar2.E(i31);
                return r15;
            }
            if (i36 != ((i37 + r32) & 15)) {
                d0Var2.a();
            }
        }
        if (r13 != false) {
            int t10 = wVar2.t();
            if ((wVar2.t() & 64) != 0) {
                i13 = 2;
            } else {
                i13 = r15;
            }
            i34 |= i13;
            wVar2.F(t10 - r32);
        }
        boolean z12 = this.f37018m;
        if (i10 != 2 && !z12 && this.f37013h.get(i35, r15)) {
            r72 = r15;
        } else {
            r72 = r32;
        }
        if (r72 != false) {
            wVar2.D(i31);
            d0Var2.c(i34, wVar2);
            wVar2.D(i33);
        }
        if (i10 != 2 && !z12 && this.f37018m && j13 != -1) {
            this.o = r32;
        }
        wVar2.E(i31);
        return r15;
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        boolean z10;
        byte[] bArr = this.f37009c.f27384a;
        p4.e eVar = (p4.e) iVar;
        eVar.c(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < 5) {
                    if (bArr[(i11 * 188) + i10] != 71) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                eVar.i(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        this.f37016k = jVar;
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        boolean z10;
        a0 a0Var;
        long j12;
        boolean z11;
        if (this.f37007a != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        List<d6.d0> list = this.f37008b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d6.d0 d0Var = list.get(i10);
            synchronized (d0Var) {
                j12 = d0Var.f27293b;
            }
            if (j12 == com.anythink.expressad.exoplayer.b.f7291b) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long c10 = d0Var.c();
                if (c10 != com.anythink.expressad.exoplayer.b.f7291b && c10 != 0 && c10 != j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                d0Var.d(j11);
            }
        }
        if (j11 != 0 && (a0Var = this.f37015j) != null) {
            a0Var.c(j11);
        }
        this.f37009c.B(0);
        this.f37010d.clear();
        int i11 = 0;
        while (true) {
            SparseArray<d0> sparseArray = this.f;
            if (i11 < sparseArray.size()) {
                sparseArray.valueAt(i11).a();
                i11++;
            } else {
                this.f37021q = 0;
                return;
            }
        }
    }

    @Override // p4.h
    public final void release() {
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes2.dex */
    public class a implements x {

        /* renamed from: a, reason: collision with root package name */
        public final d6.v f37023a = new d6.v(new byte[4], 4);

        public a() {
        }

        @Override // z4.x
        public final void c(d6.w wVar) {
            c0 c0Var;
            if (wVar.t() != 0 || (wVar.t() & 128) == 0) {
                return;
            }
            wVar.F(6);
            int i10 = (wVar.f27386c - wVar.f27385b) / 4;
            int i11 = 0;
            while (true) {
                c0Var = c0.this;
                if (i11 >= i10) {
                    break;
                }
                d6.v vVar = this.f37023a;
                wVar.b(vVar.f27378a, 0, 4);
                vVar.k(0);
                int g6 = vVar.g(16);
                vVar.m(3);
                if (g6 == 0) {
                    vVar.m(13);
                } else {
                    int g10 = vVar.g(13);
                    if (c0Var.f.get(g10) == null) {
                        c0Var.f.put(g10, new y(new b(g10)));
                        c0Var.f37017l++;
                    }
                }
                i11++;
            }
            if (c0Var.f37007a != 2) {
                c0Var.f.remove(0);
            }
        }

        @Override // z4.x
        public final void b(d6.d0 d0Var, p4.j jVar, d0.d dVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes2.dex */
    public class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public final d6.v f37025a = new d6.v(new byte[5], 5);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<d0> f37026b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f37027c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f37028d;

        public b(int i10) {
            this.f37028d = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
        
            if (r27.t() == 21) goto L57;
         */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01f7  */
        @Override // z4.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(d6.w r27) {
            /*
                Method dump skipped, instructions count: 667
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.c0.b.c(d6.w):void");
        }

        @Override // z4.x
        public final void b(d6.d0 d0Var, p4.j jVar, d0.d dVar) {
        }
    }
}
