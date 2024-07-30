package o5;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import c6.a0;
import c6.b0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import d6.p;
import d6.r;
import j5.e0;
import j5.g0;
import j5.m0;
import j5.n0;
import j5.x;
import j7.j0;
import j7.v1;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k4.i0;
import o5.g;
import o5.l;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p4.u;
import p4.w;

/* compiled from: HlsSampleStreamWrapper.java */
/* loaded from: classes2.dex */
public final class n implements b0.a<l5.e>, b0.e, g0, p4.j, e0.c {

    /* renamed from: s0, reason: collision with root package name */
    public static final Set<Integer> f33690s0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final a0 A;
    public final x.a C;
    public final int D;
    public final ArrayList<j> F;
    public final List<j> G;
    public final androidx.activity.k H;
    public final androidx.activity.g I;
    public final Handler J;
    public final ArrayList<m> K;
    public final Map<String, DrmInitData> L;
    public l5.e M;
    public c[] N;
    public final HashSet P;
    public final SparseIntArray Q;
    public b R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public i0 X;
    public i0 Y;
    public boolean Z;

    /* renamed from: c0, reason: collision with root package name */
    public n0 f33691c0;

    /* renamed from: d0, reason: collision with root package name */
    public Set<m0> f33692d0;

    /* renamed from: e0, reason: collision with root package name */
    public int[] f33693e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f33694f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f33695g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean[] f33696h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean[] f33697i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f33698j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f33699k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f33700l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f33701m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f33702n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f33703o0;

    /* renamed from: p0, reason: collision with root package name */
    public long f33704p0;

    /* renamed from: q0, reason: collision with root package name */
    public DrmInitData f33705q0;

    /* renamed from: r0, reason: collision with root package name */
    public j f33706r0;

    /* renamed from: s, reason: collision with root package name */
    public final String f33707s;

    /* renamed from: t, reason: collision with root package name */
    public final int f33708t;

    /* renamed from: u, reason: collision with root package name */
    public final a f33709u;

    /* renamed from: v, reason: collision with root package name */
    public final g f33710v;

    /* renamed from: w, reason: collision with root package name */
    public final c6.b f33711w;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f33712x;
    public final com.google.android.exoplayer2.drm.f y;

    /* renamed from: z, reason: collision with root package name */
    public final e.a f33713z;
    public final b0 B = new b0("Loader:HlsSampleStreamWrapper");
    public final g.b E = new g.b();
    public int[] O = new int[0];

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes2.dex */
    public interface a extends g0.a<n> {
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes2.dex */
    public static class b implements w {

        /* renamed from: g, reason: collision with root package name */
        public static final i0 f33714g;

        /* renamed from: h, reason: collision with root package name */
        public static final i0 f33715h;

        /* renamed from: a, reason: collision with root package name */
        public final e5.a f33716a = new e5.a();

        /* renamed from: b, reason: collision with root package name */
        public final w f33717b;

        /* renamed from: c, reason: collision with root package name */
        public final i0 f33718c;

        /* renamed from: d, reason: collision with root package name */
        public i0 f33719d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f33720e;
        public int f;

        static {
            i0.a aVar = new i0.a();
            aVar.f30534k = com.anythink.expressad.exoplayer.k.o.V;
            f33714g = aVar.a();
            i0.a aVar2 = new i0.a();
            aVar2.f30534k = com.anythink.expressad.exoplayer.k.o.ai;
            f33715h = aVar2.a();
        }

        public b(w wVar, int i10) {
            this.f33717b = wVar;
            if (i10 != 1) {
                if (i10 == 3) {
                    this.f33718c = f33715h;
                } else {
                    throw new IllegalArgumentException(a3.l.i("Unknown metadataType: ", i10));
                }
            } else {
                this.f33718c = f33714g;
            }
            this.f33720e = new byte[0];
            this.f = 0;
        }

        @Override // p4.w
        public final void b(i0 i0Var) {
            this.f33719d = i0Var;
            this.f33717b.b(this.f33718c);
        }

        @Override // p4.w
        public final void c(long j10, int i10, int i11, int i12, w.a aVar) {
            boolean z10;
            this.f33719d.getClass();
            int i13 = this.f - i12;
            d6.w wVar = new d6.w(Arrays.copyOfRange(this.f33720e, i13 - i11, i13));
            byte[] bArr = this.f33720e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f = i12;
            String str = this.f33719d.D;
            i0 i0Var = this.f33718c;
            if (!d6.g0.a(str, i0Var.D)) {
                if (com.anythink.expressad.exoplayer.k.o.ai.equals(this.f33719d.D)) {
                    this.f33716a.getClass();
                    EventMessage i14 = e5.a.i(wVar);
                    i0 g6 = i14.g();
                    String str2 = i0Var.D;
                    if (g6 != null && d6.g0.a(str2, g6.D)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        p.f("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", str2, i14.g()));
                        return;
                    } else {
                        byte[] S = i14.S();
                        S.getClass();
                        wVar = new d6.w(S);
                    }
                } else {
                    p.f("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f33719d.D);
                    return;
                }
            }
            int i15 = wVar.f27386c - wVar.f27385b;
            this.f33717b.f(i15, wVar);
            this.f33717b.c(j10, i10, i15, i12, aVar);
        }

        @Override // p4.w
        public final int d(c6.h hVar, int i10, boolean z10) throws IOException {
            int i11 = this.f + i10;
            byte[] bArr = this.f33720e;
            if (bArr.length < i11) {
                this.f33720e = Arrays.copyOf(bArr, (i11 / 2) + i11);
            }
            int read = hVar.read(this.f33720e, this.f, i10);
            if (read == -1) {
                if (z10) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f += read;
            return read;
        }

        @Override // p4.w
        public final void e(int i10, d6.w wVar) {
            int i11 = this.f + i10;
            byte[] bArr = this.f33720e;
            if (bArr.length < i11) {
                this.f33720e = Arrays.copyOf(bArr, (i11 / 2) + i11);
            }
            wVar.b(this.f33720e, this.f, i10);
            this.f += i10;
        }
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    /* loaded from: classes2.dex */
    public static final class c extends e0 {
        public final Map<String, DrmInitData> H;
        public DrmInitData I;

        public c() {
            throw null;
        }

        public c(c6.b bVar, com.google.android.exoplayer2.drm.f fVar, e.a aVar, Map map) {
            super(bVar, fVar, aVar);
            this.H = map;
        }

        @Override // j5.e0, p4.w
        public final void c(long j10, int i10, int i11, int i12, w.a aVar) {
            super.c(j10, i10, i11, i12, aVar);
        }

        @Override // j5.e0
        public final i0 m(i0 i0Var) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = i0Var.G;
            }
            if (drmInitData2 != null && (drmInitData = this.H.get(drmInitData2.f19907u)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadata = i0Var.B;
            Metadata metadata2 = null;
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f19997s;
                int length = entryArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Metadata.Entry entry = entryArr[i10];
                        if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f20057t)) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1) {
                    if (length != 1) {
                        Metadata.Entry[] entryArr2 = new Metadata.Entry[length - 1];
                        for (int i11 = 0; i11 < length; i11++) {
                            if (i11 != i10) {
                                entryArr2[i11 < i10 ? i11 : i11 - 1] = entryArr[i11];
                            }
                        }
                        metadata2 = new Metadata(entryArr2);
                    }
                }
                if (drmInitData2 == i0Var.G || metadata != i0Var.B) {
                    i0.a a10 = i0Var.a();
                    a10.f30537n = drmInitData2;
                    a10.f30532i = metadata;
                    i0Var = a10.a();
                }
                return super.m(i0Var);
            }
            metadata = metadata2;
            if (drmInitData2 == i0Var.G) {
            }
            i0.a a102 = i0Var.a();
            a102.f30537n = drmInitData2;
            a102.f30532i = metadata;
            i0Var = a102.a();
            return super.m(i0Var);
        }
    }

    public n(String str, int i10, l.a aVar, g gVar, Map map, c6.b bVar, long j10, i0 i0Var, com.google.android.exoplayer2.drm.f fVar, e.a aVar2, a0 a0Var, x.a aVar3, int i11) {
        this.f33707s = str;
        this.f33708t = i10;
        this.f33709u = aVar;
        this.f33710v = gVar;
        this.L = map;
        this.f33711w = bVar;
        this.f33712x = i0Var;
        this.y = fVar;
        this.f33713z = aVar2;
        this.A = a0Var;
        this.C = aVar3;
        this.D = i11;
        Set<Integer> set = f33690s0;
        this.P = new HashSet(set.size());
        this.Q = new SparseIntArray(set.size());
        this.N = new c[0];
        this.f33697i0 = new boolean[0];
        this.f33696h0 = new boolean[0];
        ArrayList<j> arrayList = new ArrayList<>();
        this.F = arrayList;
        this.G = Collections.unmodifiableList(arrayList);
        this.K = new ArrayList<>();
        this.H = new androidx.activity.k(this, 7);
        this.I = new androidx.activity.g(this, 5);
        this.J = d6.g0.k(null);
        this.f33698j0 = j10;
        this.f33699k0 = j10;
    }

    public static int A(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 1;
        }
        return 0;
    }

    public static p4.g v(int i10, int i11) {
        p.f("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new p4.g();
    }

    public static i0 x(i0 i0Var, i0 i0Var2, boolean z10) {
        String str;
        String str2;
        int i10;
        int i11;
        if (i0Var == null) {
            return i0Var2;
        }
        String str3 = i0Var2.D;
        int i12 = r.i(str3);
        String str4 = i0Var.A;
        if (d6.g0.o(i12, str4) == 1) {
            str2 = d6.g0.p(i12, str4);
            str = r.e(str2);
        } else {
            String c10 = r.c(str4, str3);
            str = str3;
            str2 = c10;
        }
        i0.a aVar = new i0.a(i0Var2);
        aVar.f30525a = i0Var.f30518s;
        aVar.f30526b = i0Var.f30519t;
        aVar.f30527c = i0Var.f30520u;
        aVar.f30528d = i0Var.f30521v;
        aVar.f30529e = i0Var.f30522w;
        if (z10) {
            i10 = i0Var.f30523x;
        } else {
            i10 = -1;
        }
        aVar.f = i10;
        if (z10) {
            i11 = i0Var.y;
        } else {
            i11 = -1;
        }
        aVar.f30530g = i11;
        aVar.f30531h = str2;
        if (i12 == 2) {
            aVar.f30538p = i0Var.I;
            aVar.f30539q = i0Var.J;
            aVar.f30540r = i0Var.K;
        }
        if (str != null) {
            aVar.f30534k = str;
        }
        int i13 = i0Var.Q;
        if (i13 != -1 && i12 == 1) {
            aVar.f30546x = i13;
        }
        Metadata metadata = i0Var.B;
        if (metadata != null) {
            Metadata metadata2 = i0Var2.B;
            if (metadata2 != null) {
                Metadata.Entry[] entryArr = metadata.f19997s;
                if (entryArr.length == 0) {
                    metadata = metadata2;
                } else {
                    Metadata.Entry[] entryArr2 = metadata2.f19997s;
                    Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata(metadata2.f19998t, (Metadata.Entry[]) copyOf);
                }
            }
            aVar.f30532i = metadata;
        }
        return new i0(aVar);
    }

    public final boolean B() {
        if (this.f33699k0 != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        int i10;
        i0 x10;
        boolean z10;
        if (!this.Z && this.f33693e0 == null && this.U) {
            int i11 = 0;
            for (c cVar : this.N) {
                if (cVar.q() == null) {
                    return;
                }
            }
            n0 n0Var = this.f33691c0;
            if (n0Var != null) {
                int i12 = n0Var.f29814s;
                int[] iArr = new int[i12];
                this.f33693e0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        c[] cVarArr = this.N;
                        if (i14 < cVarArr.length) {
                            i0 q10 = cVarArr[i14].q();
                            d6.a.e(q10);
                            i0 i0Var = this.f33691c0.a(i13).f29804v[0];
                            String str = i0Var.D;
                            String str2 = q10.D;
                            int i15 = r.i(str2);
                            if (i15 == 3 ? d6.g0.a(str2, str) && ((!com.anythink.expressad.exoplayer.k.o.W.equals(str2) && !com.anythink.expressad.exoplayer.k.o.X.equals(str2)) || q10.V == i0Var.V) : i15 == r.i(str)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                this.f33693e0[i13] = i14;
                                break;
                            }
                            i14++;
                        }
                    }
                }
                Iterator<m> it = this.K.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                return;
            }
            int length = this.N.length;
            int i16 = -1;
            int i17 = 0;
            int i18 = -2;
            while (true) {
                int i19 = 2;
                if (i17 >= length) {
                    break;
                }
                i0 q11 = this.N[i17].q();
                d6.a.e(q11);
                String str3 = q11.D;
                if (!r.m(str3)) {
                    if (r.k(str3)) {
                        i19 = 1;
                    } else if (r.l(str3)) {
                        i19 = 3;
                    } else {
                        i19 = -2;
                    }
                }
                if (A(i19) > A(i18)) {
                    i16 = i17;
                    i18 = i19;
                } else if (i19 == i18 && i16 != -1) {
                    i16 = -1;
                }
                i17++;
            }
            m0 m0Var = this.f33710v.f33643h;
            int i20 = m0Var.f29801s;
            this.f33694f0 = -1;
            this.f33693e0 = new int[length];
            for (int i21 = 0; i21 < length; i21++) {
                this.f33693e0[i21] = i21;
            }
            m0[] m0VarArr = new m0[length];
            int i22 = 0;
            while (i11 < length) {
                i0 q12 = this.N[i11].q();
                d6.a.e(q12);
                i0 i0Var2 = this.f33712x;
                String str4 = this.f33707s;
                if (i11 == i16) {
                    i0[] i0VarArr = new i0[i20];
                    for (int i23 = i22; i23 < i20; i23++) {
                        i0 i0Var3 = m0Var.f29804v[i23];
                        if (i18 == 1 && i0Var2 != null) {
                            i0Var3 = i0Var3.e(i0Var2);
                        }
                        if (i20 == 1) {
                            x10 = q12.e(i0Var3);
                        } else {
                            x10 = x(i0Var3, q12, true);
                        }
                        i0VarArr[i23] = x10;
                    }
                    m0VarArr[i11] = new m0(str4, i0VarArr);
                    this.f33694f0 = i11;
                    i10 = 0;
                } else {
                    if (i18 != 2 || !r.k(q12.D)) {
                        i0Var2 = null;
                    }
                    StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str4, ":muxed:");
                    l10.append(i11 < i16 ? i11 : i11 - 1);
                    m0VarArr[i11] = new m0(l10.toString(), x(i0Var2, q12, false));
                    i10 = 0;
                }
                i11++;
                i22 = i10;
            }
            this.f33691c0 = w(m0VarArr);
            boolean z11 = i22;
            if (this.f33692d0 == null) {
                z11 = 1;
            }
            d6.a.d(z11);
            this.f33692d0 = Collections.emptySet();
            this.V = true;
            ((l.a) this.f33709u).b();
        }
    }

    public final void D() throws IOException {
        this.B.a();
        g gVar = this.f33710v;
        j5.b bVar = gVar.f33649n;
        if (bVar == null) {
            Uri uri = gVar.o;
            if (uri != null && gVar.f33653s) {
                gVar.f33642g.b(uri);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void E(m0[] m0VarArr, int... iArr) {
        this.f33691c0 = w(m0VarArr);
        this.f33692d0 = new HashSet();
        for (int i10 : iArr) {
            this.f33692d0.add(this.f33691c0.a(i10));
        }
        this.f33694f0 = 0;
        Handler handler = this.J;
        a aVar = this.f33709u;
        Objects.requireNonNull(aVar);
        handler.post(new androidx.appcompat.widget.n0(aVar, 7));
        this.V = true;
    }

    public final void F() {
        for (c cVar : this.N) {
            cVar.w(this.f33700l0);
        }
        this.f33700l0 = false;
    }

    public final boolean G(long j10, boolean z10) {
        boolean z11;
        this.f33698j0 = j10;
        if (B()) {
            this.f33699k0 = j10;
            return true;
        }
        if (this.U && !z10) {
            int length = this.N.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.N[i10].x(j10, false) && (this.f33697i0[i10] || !this.f33695g0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f33699k0 = j10;
        this.f33702n0 = false;
        this.F.clear();
        b0 b0Var = this.B;
        if (b0Var.d()) {
            if (this.U) {
                for (c cVar : this.N) {
                    cVar.i();
                }
            }
            b0Var.b();
        } else {
            b0Var.f3300c = null;
            F();
        }
        return true;
    }

    @Override // j5.e0.c
    public final void a() {
        this.J.post(this.H);
    }

    @Override // j5.g0
    public final long b() {
        if (B()) {
            return this.f33699k0;
        }
        if (this.f33702n0) {
            return Long.MIN_VALUE;
        }
        return z().f32511h;
    }

    @Override // j5.g0
    public final boolean c(long j10) {
        long max;
        long j11;
        List<j> list;
        boolean z10;
        if (!this.f33702n0) {
            b0 b0Var = this.B;
            if (!b0Var.d() && !b0Var.c()) {
                if (B()) {
                    list = Collections.emptyList();
                    j11 = this.f33699k0;
                    for (c cVar : this.N) {
                        cVar.f29730t = this.f33699k0;
                    }
                } else {
                    j z11 = z();
                    if (z11.H) {
                        max = z11.f32511h;
                    } else {
                        max = Math.max(this.f33698j0, z11.f32510g);
                    }
                    j11 = max;
                    list = this.G;
                }
                List<j> list2 = list;
                long j12 = j11;
                g.b bVar = this.E;
                bVar.f33655a = null;
                bVar.f33656b = false;
                bVar.f33657c = null;
                g gVar = this.f33710v;
                if (!this.V && list2.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                gVar.c(j10, j12, list2, z10, this.E);
                boolean z12 = bVar.f33656b;
                l5.e eVar = bVar.f33655a;
                Uri uri = bVar.f33657c;
                if (z12) {
                    this.f33699k0 = com.anythink.expressad.exoplayer.b.f7291b;
                    this.f33702n0 = true;
                    return true;
                }
                if (eVar == null) {
                    if (uri != null) {
                        l.this.f33680t.l(uri);
                    }
                    return false;
                }
                if (eVar instanceof j) {
                    j jVar = (j) eVar;
                    this.f33706r0 = jVar;
                    this.X = jVar.f32508d;
                    this.f33699k0 = com.anythink.expressad.exoplayer.b.f7291b;
                    this.F.add(jVar);
                    j0.b bVar2 = j0.f30006t;
                    j0.a aVar = new j0.a();
                    for (c cVar2 : this.N) {
                        aVar.b(Integer.valueOf(cVar2.f29727q + cVar2.f29726p));
                    }
                    v1 e10 = aVar.e();
                    jVar.D = this;
                    jVar.I = e10;
                    for (c cVar3 : this.N) {
                        cVar3.getClass();
                        cVar3.C = jVar.f33665k;
                        if (jVar.f33668n) {
                            cVar3.G = true;
                        }
                    }
                }
                this.M = eVar;
                this.C.n(new j5.o(eVar.f32505a, eVar.f32506b, b0Var.f(eVar, this, this.A.c(eVar.f32507c))), eVar.f32507c, this.f33708t, eVar.f32508d, eVar.f32509e, eVar.f, eVar.f32510g, eVar.f32511h);
                return true;
            }
        }
        return false;
    }

    @Override // j5.g0
    public final long e() {
        long j10;
        if (this.f33702n0) {
            return Long.MIN_VALUE;
        }
        if (B()) {
            return this.f33699k0;
        }
        long j11 = this.f33698j0;
        j z10 = z();
        if (!z10.H) {
            ArrayList<j> arrayList = this.F;
            if (arrayList.size() > 1) {
                z10 = arrayList.get(arrayList.size() - 2);
            } else {
                z10 = null;
            }
        }
        if (z10 != null) {
            j11 = Math.max(j11, z10.f32511h);
        }
        if (this.U) {
            for (c cVar : this.N) {
                synchronized (cVar) {
                    j10 = cVar.f29732v;
                }
                j11 = Math.max(j11, j10);
            }
        }
        return j11;
    }

    @Override // j5.g0
    public final void f(long j10) {
        int size;
        boolean h10;
        b0 b0Var = this.B;
        if (!b0Var.c() && !B()) {
            boolean d10 = b0Var.d();
            g gVar = this.f33710v;
            List<j> list = this.G;
            if (d10) {
                this.M.getClass();
                l5.e eVar = this.M;
                if (gVar.f33649n != null) {
                    h10 = false;
                } else {
                    h10 = gVar.f33651q.h(j10, eVar, list);
                }
                if (h10) {
                    b0Var.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0) {
                int i10 = size2 - 1;
                if (gVar.b(list.get(i10)) != 2) {
                    break;
                } else {
                    size2 = i10;
                }
            }
            if (size2 < list.size()) {
                y(size2);
            }
            if (gVar.f33649n == null && gVar.f33651q.length() >= 2) {
                size = gVar.f33651q.m(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.F.size()) {
                y(size);
            }
        }
    }

    @Override // c6.b0.a
    public final void g(l5.e eVar, long j10, long j11) {
        l5.e eVar2 = eVar;
        this.M = null;
        g gVar = this.f33710v;
        gVar.getClass();
        if (eVar2 instanceof g.a) {
            g.a aVar = (g.a) eVar2;
            gVar.f33648m = aVar.f32530j;
            Uri uri = aVar.f32506b.f3377a;
            byte[] bArr = aVar.f33654l;
            bArr.getClass();
            f fVar = gVar.f33645j;
            fVar.getClass();
            uri.getClass();
            fVar.f33636a.put(uri, bArr);
        }
        long j12 = eVar2.f32505a;
        c6.g0 g0Var = eVar2.f32512i;
        Uri uri2 = g0Var.f3356c;
        j5.o oVar = new j5.o(g0Var.f3357d);
        this.A.getClass();
        this.C.h(oVar, eVar2.f32507c, this.f33708t, eVar2.f32508d, eVar2.f32509e, eVar2.f, eVar2.f32510g, eVar2.f32511h);
        if (!this.V) {
            c(this.f33698j0);
        } else {
            ((l.a) this.f33709u).g(this);
        }
    }

    @Override // c6.b0.e
    public final void h() {
        for (c cVar : this.N) {
            cVar.w(true);
            com.google.android.exoplayer2.drm.d dVar = cVar.f29719h;
            if (dVar != null) {
                dVar.b(cVar.f29717e);
                cVar.f29719h = null;
                cVar.f29718g = null;
            }
        }
    }

    @Override // j5.g0
    public final boolean isLoading() {
        return this.B.d();
    }

    @Override // p4.j
    public final void m() {
        this.f33703o0 = true;
        this.J.post(this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    @Override // c6.b0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c6.b0.b n(l5.e r18, long r19, long r21, java.io.IOException r23, int r24) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.n.n(c6.b0$d, long, long, java.io.IOException, int):c6.b0$b");
    }

    @Override // c6.b0.a
    public final void q(l5.e eVar, long j10, long j11, boolean z10) {
        l5.e eVar2 = eVar;
        this.M = null;
        long j12 = eVar2.f32505a;
        c6.g0 g0Var = eVar2.f32512i;
        Uri uri = g0Var.f3356c;
        j5.o oVar = new j5.o(g0Var.f3357d);
        this.A.getClass();
        this.C.e(oVar, eVar2.f32507c, this.f33708t, eVar2.f32508d, eVar2.f32509e, eVar2.f, eVar2.f32510g, eVar2.f32511h);
        if (!z10) {
            if (B() || this.W == 0) {
                F();
            }
            if (this.W > 0) {
                ((l.a) this.f33709u).g(this);
            }
        }
    }

    @Override // p4.j
    public final w s(int i10, int i11) {
        w wVar;
        Integer valueOf = Integer.valueOf(i11);
        Set<Integer> set = f33690s0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.P;
        SparseIntArray sparseIntArray = this.Q;
        boolean z10 = false;
        if (contains) {
            d6.a.a(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.O[i12] = i10;
                }
                if (this.O[i12] == i10) {
                    wVar = this.N[i12];
                } else {
                    wVar = v(i10, i11);
                }
            }
            wVar = null;
        } else {
            int i13 = 0;
            while (true) {
                w[] wVarArr = this.N;
                if (i13 >= wVarArr.length) {
                    break;
                }
                if (this.O[i13] == i10) {
                    wVar = wVarArr[i13];
                    break;
                }
                i13++;
            }
        }
        if (wVar == null) {
            if (this.f33703o0) {
                return v(i10, i11);
            }
            int length = this.N.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            c cVar = new c(this.f33711w, this.y, this.f33713z, this.L);
            cVar.f29730t = this.f33698j0;
            if (z10) {
                cVar.I = this.f33705q0;
                cVar.f29735z = true;
            }
            long j10 = this.f33704p0;
            if (cVar.F != j10) {
                cVar.F = j10;
                cVar.f29735z = true;
            }
            j jVar = this.f33706r0;
            if (jVar != null) {
                cVar.C = jVar.f33665k;
            }
            cVar.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.O, i14);
            this.O = copyOf;
            copyOf[length] = i10;
            c[] cVarArr = this.N;
            int i15 = d6.g0.f27302a;
            Object[] copyOf2 = Arrays.copyOf(cVarArr, cVarArr.length + 1);
            copyOf2[cVarArr.length] = cVar;
            this.N = (c[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f33697i0, i14);
            this.f33697i0 = copyOf3;
            copyOf3[length] = z10;
            this.f33695g0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (A(i11) > A(this.S)) {
                this.T = length;
                this.S = i11;
            }
            this.f33696h0 = Arrays.copyOf(this.f33696h0, i14);
            wVar = cVar;
        }
        if (i11 == 5) {
            if (this.R == null) {
                this.R = new b(wVar, this.D);
            }
            return this.R;
        }
        return wVar;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    public final void u() {
        d6.a.d(this.V);
        this.f33691c0.getClass();
        this.f33692d0.getClass();
    }

    public final n0 w(m0[] m0VarArr) {
        for (int i10 = 0; i10 < m0VarArr.length; i10++) {
            m0 m0Var = m0VarArr[i10];
            i0[] i0VarArr = new i0[m0Var.f29801s];
            for (int i11 = 0; i11 < m0Var.f29801s; i11++) {
                i0 i0Var = m0Var.f29804v[i11];
                i0VarArr[i11] = i0Var.b(this.y.f(i0Var));
            }
            m0VarArr[i10] = new m0(m0Var.f29802t, i0VarArr);
        }
        return new n0(m0VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r19) {
        /*
            r18 = this;
            r0 = r18
            c6.b0 r1 = r0.B
            boolean r1 = r1.d()
            r2 = 1
            r1 = r1 ^ r2
            d6.a.d(r1)
            r1 = r19
        Lf:
            java.util.ArrayList<o5.j> r3 = r0.F
            int r4 = r3.size()
            r5 = -1
            r6 = 0
            if (r1 >= r4) goto L55
            r4 = r1
        L1a:
            int r7 = r3.size()
            if (r4 >= r7) goto L2e
            java.lang.Object r7 = r3.get(r4)
            o5.j r7 = (o5.j) r7
            boolean r7 = r7.f33668n
            if (r7 == 0) goto L2b
            goto L49
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            java.lang.Object r4 = r3.get(r1)
            o5.j r4 = (o5.j) r4
            r7 = r6
        L35:
            o5.n$c[] r8 = r0.N
            int r8 = r8.length
            if (r7 >= r8) goto L4e
            int r8 = r4.f(r7)
            o5.n$c[] r9 = r0.N
            r9 = r9[r7]
            int r10 = r9.f29727q
            int r9 = r9.f29729s
            int r10 = r10 + r9
            if (r10 <= r8) goto L4b
        L49:
            r4 = r6
            goto L4f
        L4b:
            int r7 = r7 + 1
            goto L35
        L4e:
            r4 = r2
        L4f:
            if (r4 == 0) goto L52
            goto L56
        L52:
            int r1 = r1 + 1
            goto Lf
        L55:
            r1 = r5
        L56:
            if (r1 != r5) goto L59
            return
        L59:
            o5.j r4 = r18.z()
            long r4 = r4.f32511h
            java.lang.Object r7 = r3.get(r1)
            o5.j r7 = (o5.j) r7
            int r8 = r3.size()
            d6.g0.O(r1, r8, r3)
            r1 = r6
        L6d:
            o5.n$c[] r8 = r0.N
            int r8 = r8.length
            if (r1 >= r8) goto L80
            int r8 = r7.f(r1)
            o5.n$c[] r9 = r0.N
            r9 = r9[r1]
            r9.k(r8)
            int r1 = r1 + 1
            goto L6d
        L80:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L8b
            long r1 = r0.f33698j0
            r0.f33699k0 = r1
            goto L93
        L8b:
            java.lang.Object r1 = j7.r.B(r3)
            o5.j r1 = (o5.j) r1
            r1.J = r2
        L93:
            r0.f33702n0 = r6
            int r10 = r0.S
            long r1 = r7.f32510g
            j5.r r3 = new j5.r
            r9 = 1
            r11 = 0
            r12 = 3
            r13 = 0
            j5.x$a r6 = r0.C
            long r14 = r6.a(r1)
            long r16 = r6.a(r4)
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r16)
            r6.p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.n.y(int):void");
    }

    public final j z() {
        return this.F.get(r0.size() - 1);
    }

    @Override // p4.j
    public final void i(u uVar) {
    }
}
