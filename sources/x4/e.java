package x4;

import android.util.SparseArray;
import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.d0;
import d6.g0;
import d6.s;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.i0;
import k4.z0;
import p4.w;
import x4.a;
import x4.h;

/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes2.dex */
public final class e implements p4.h {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final i0 J;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public p4.j E;
    public w[] F;
    public w[] G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final int f36364a;

    /* renamed from: b, reason: collision with root package name */
    public final k f36365b;

    /* renamed from: c, reason: collision with root package name */
    public final List<i0> f36366c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f36367d;

    /* renamed from: e, reason: collision with root package name */
    public final d6.w f36368e;
    public final d6.w f;

    /* renamed from: g, reason: collision with root package name */
    public final d6.w f36369g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f36370h;

    /* renamed from: i, reason: collision with root package name */
    public final d6.w f36371i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f36372j;

    /* renamed from: k, reason: collision with root package name */
    public final e5.b f36373k;

    /* renamed from: l, reason: collision with root package name */
    public final d6.w f36374l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque<a.C0507a> f36375m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque<a> f36376n;
    public final w o;

    /* renamed from: p, reason: collision with root package name */
    public int f36377p;

    /* renamed from: q, reason: collision with root package name */
    public int f36378q;

    /* renamed from: r, reason: collision with root package name */
    public long f36379r;

    /* renamed from: s, reason: collision with root package name */
    public int f36380s;

    /* renamed from: t, reason: collision with root package name */
    public d6.w f36381t;

    /* renamed from: u, reason: collision with root package name */
    public long f36382u;

    /* renamed from: v, reason: collision with root package name */
    public int f36383v;

    /* renamed from: w, reason: collision with root package name */
    public long f36384w;

    /* renamed from: x, reason: collision with root package name */
    public long f36385x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public b f36386z;

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f36387a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f36388b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36389c;

        public a(long j10, int i10, boolean z10) {
            this.f36387a = j10;
            this.f36388b = z10;
            this.f36389c = i10;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final w f36390a;

        /* renamed from: d, reason: collision with root package name */
        public n f36393d;

        /* renamed from: e, reason: collision with root package name */
        public c f36394e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f36395g;

        /* renamed from: h, reason: collision with root package name */
        public int f36396h;

        /* renamed from: i, reason: collision with root package name */
        public int f36397i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f36400l;

        /* renamed from: b, reason: collision with root package name */
        public final m f36391b = new m();

        /* renamed from: c, reason: collision with root package name */
        public final d6.w f36392c = new d6.w();

        /* renamed from: j, reason: collision with root package name */
        public final d6.w f36398j = new d6.w(1);

        /* renamed from: k, reason: collision with root package name */
        public final d6.w f36399k = new d6.w();

        public b(w wVar, n nVar, c cVar) {
            this.f36390a = wVar;
            this.f36393d = nVar;
            this.f36394e = cVar;
            this.f36393d = nVar;
            this.f36394e = cVar;
            wVar.b(nVar.f36470a.f);
            d();
        }

        public final l a() {
            if (!this.f36400l) {
                return null;
            }
            m mVar = this.f36391b;
            c cVar = mVar.f36455a;
            int i10 = g0.f27302a;
            int i11 = cVar.f36359a;
            l lVar = mVar.f36466m;
            if (lVar == null) {
                l[] lVarArr = this.f36393d.f36470a.f36449k;
                if (lVarArr == null) {
                    lVar = null;
                } else {
                    lVar = lVarArr[i11];
                }
            }
            if (lVar == null || !lVar.f36450a) {
                return null;
            }
            return lVar;
        }

        public final boolean b() {
            this.f++;
            if (!this.f36400l) {
                return false;
            }
            int i10 = this.f36395g + 1;
            this.f36395g = i10;
            int[] iArr = this.f36391b.f36460g;
            int i11 = this.f36396h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f36396h = i11 + 1;
            this.f36395g = 0;
            return false;
        }

        public final int c(int i10, int i11) {
            d6.w wVar;
            boolean z10;
            boolean z11;
            int i12;
            l a10 = a();
            if (a10 == null) {
                return 0;
            }
            m mVar = this.f36391b;
            int i13 = a10.f36453d;
            if (i13 != 0) {
                wVar = mVar.f36467n;
            } else {
                int i14 = g0.f27302a;
                byte[] bArr = a10.f36454e;
                int length = bArr.length;
                d6.w wVar2 = this.f36399k;
                wVar2.C(length, bArr);
                i13 = bArr.length;
                wVar = wVar2;
            }
            int i15 = this.f;
            if (mVar.f36464k && mVar.f36465l[i15]) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && i11 == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            d6.w wVar3 = this.f36398j;
            byte[] bArr2 = wVar3.f27384a;
            if (z11) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            bArr2[0] = (byte) (i12 | i13);
            wVar3.E(0);
            w wVar4 = this.f36390a;
            wVar4.e(1, wVar3);
            wVar4.e(i13, wVar);
            if (!z11) {
                return i13 + 1;
            }
            d6.w wVar5 = this.f36392c;
            if (!z10) {
                wVar5.B(8);
                byte[] bArr3 = wVar5.f27384a;
                bArr3[0] = 0;
                bArr3[1] = 1;
                bArr3[2] = (byte) ((i11 >> 8) & p.f9095b);
                bArr3[3] = (byte) (i11 & p.f9095b);
                bArr3[4] = (byte) ((i10 >> 24) & p.f9095b);
                bArr3[5] = (byte) ((i10 >> 16) & p.f9095b);
                bArr3[6] = (byte) ((i10 >> 8) & p.f9095b);
                bArr3[7] = (byte) (i10 & p.f9095b);
                wVar4.e(8, wVar5);
                return i13 + 1 + 8;
            }
            d6.w wVar6 = mVar.f36467n;
            int y = wVar6.y();
            wVar6.F(-2);
            int i16 = (y * 6) + 2;
            if (i11 != 0) {
                wVar5.B(i16);
                byte[] bArr4 = wVar5.f27384a;
                wVar6.b(bArr4, 0, i16);
                int i17 = (((bArr4[2] & DefaultClassResolver.NAME) << 8) | (bArr4[3] & DefaultClassResolver.NAME)) + i11;
                bArr4[2] = (byte) ((i17 >> 8) & p.f9095b);
                bArr4[3] = (byte) (i17 & p.f9095b);
            } else {
                wVar5 = wVar6;
            }
            wVar4.e(i16, wVar5);
            return i13 + 1 + i16;
        }

        public final void d() {
            m mVar = this.f36391b;
            mVar.f36458d = 0;
            mVar.f36468p = 0L;
            mVar.f36469q = false;
            mVar.f36464k = false;
            mVar.o = false;
            mVar.f36466m = null;
            this.f = 0;
            this.f36396h = 0;
            this.f36395g = 0;
            this.f36397i = 0;
            this.f36400l = false;
        }
    }

    static {
        i0.a aVar = new i0.a();
        aVar.f30534k = o.ai;
        J = aVar.a();
    }

    public e() {
        this(0, null, null, Collections.emptyList());
    }

    public static DrmInitData a(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = (a.b) arrayList.get(i10);
            if (bVar.f36329a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f36333b.f27384a;
                h.a b10 = h.b(bArr);
                if (b10 == null) {
                    uuid = null;
                } else {
                    uuid = b10.f36429a;
                }
                if (uuid == null) {
                    d6.p.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void b(d6.w wVar, int i10, m mVar) throws z0 {
        boolean z10;
        wVar.E(i10 + 8);
        int d10 = wVar.d() & 16777215;
        if ((d10 & 1) == 0) {
            if ((d10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int w10 = wVar.w();
            if (w10 == 0) {
                Arrays.fill(mVar.f36465l, 0, mVar.f36459e, false);
                return;
            }
            if (w10 == mVar.f36459e) {
                Arrays.fill(mVar.f36465l, 0, w10, z10);
                int i11 = wVar.f27386c - wVar.f27385b;
                d6.w wVar2 = mVar.f36467n;
                wVar2.B(i11);
                mVar.f36464k = true;
                mVar.o = true;
                wVar.b(wVar2.f27384a, 0, wVar2.f27386c);
                wVar2.E(0);
                mVar.o = false;
                return;
            }
            StringBuilder n10 = a3.k.n("Senc sample count ", w10, " is different from fragment sample count");
            n10.append(mVar.f36459e);
            throw z0.a(n10.toString(), null);
        }
        throw z0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x01e7, code lost:
    
        if ((r12 & com.applovin.exoplayer2.common.base.Ascii.US) != 6) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07b5 A[SYNTHETIC] */
    @Override // p4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(p4.i r33, p4.t r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.e.c(p4.i, p4.t):int");
    }

    @Override // p4.h
    public final boolean d(p4.i iVar) throws IOException {
        return j.a(iVar, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a5, code lost:
    
        if (r14 >= r13.f36444e) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x07d0, code lost:
    
        r1.f36377p = 0;
        r1.f36380s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x07d7, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r47) throws k4.z0 {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.e.e(long):void");
    }

    @Override // p4.h
    public final void f(p4.j jVar) {
        int i10;
        this.E = jVar;
        this.f36377p = 0;
        this.f36380s = 0;
        w[] wVarArr = new w[2];
        this.F = wVarArr;
        w wVar = this.o;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = 100;
        if ((this.f36364a & 4) != 0) {
            wVarArr[i10] = jVar.s(100, 5);
            i11 = 101;
            i10++;
        }
        w[] wVarArr2 = (w[]) g0.L(i10, this.F);
        this.F = wVarArr2;
        for (w wVar2 : wVarArr2) {
            wVar2.b(J);
        }
        List<i0> list = this.f36366c;
        this.G = new w[list.size()];
        int i12 = 0;
        while (i12 < this.G.length) {
            w s10 = this.E.s(i11, 3);
            s10.b(list.get(i12));
            this.G[i12] = s10;
            i12++;
            i11++;
        }
        k kVar = this.f36365b;
        if (kVar != null) {
            this.f36367d.put(0, new b(jVar.s(0, kVar.f36441b), new n(this.f36365b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.m();
        }
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        SparseArray<b> sparseArray = this.f36367d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.valueAt(i10).d();
        }
        this.f36376n.clear();
        this.f36383v = 0;
        this.f36384w = j11;
        this.f36375m.clear();
        this.f36377p = 0;
        this.f36380s = 0;
    }

    public e(int i10, d0 d0Var, k kVar, List<i0> list) {
        this(i10, d0Var, kVar, list, null);
    }

    public e(int i10, d0 d0Var, k kVar, List<i0> list, w wVar) {
        this.f36364a = i10;
        this.f36372j = d0Var;
        this.f36365b = kVar;
        this.f36366c = Collections.unmodifiableList(list);
        this.o = wVar;
        this.f36373k = new e5.b();
        this.f36374l = new d6.w(16);
        this.f36368e = new d6.w(s.f27347a);
        this.f = new d6.w(5);
        this.f36369g = new d6.w();
        byte[] bArr = new byte[16];
        this.f36370h = bArr;
        this.f36371i = new d6.w(bArr);
        this.f36375m = new ArrayDeque<>();
        this.f36376n = new ArrayDeque<>();
        this.f36367d = new SparseArray<>();
        this.f36385x = com.anythink.expressad.exoplayer.b.f7291b;
        this.f36384w = com.anythink.expressad.exoplayer.b.f7291b;
        this.y = com.anythink.expressad.exoplayer.b.f7291b;
        this.E = p4.j.f34324b0;
        this.F = new w[0];
        this.G = new w[0];
    }

    @Override // p4.h
    public final void release() {
    }
}
