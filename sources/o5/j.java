package o5;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import d6.d0;
import d6.g0;
import d6.r;
import d6.w;
import j7.j0;
import j7.v1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k4.i0;
import o5.n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import z4.c0;

/* compiled from: HlsMediaChunk.java */
/* loaded from: classes2.dex */
public final class j extends l5.l {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public k C;
    public n D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public j0<Integer> I;
    public boolean J;
    public boolean K;

    /* renamed from: k, reason: collision with root package name */
    public final int f33665k;

    /* renamed from: l, reason: collision with root package name */
    public final int f33666l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f33667m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f33668n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final c6.j f33669p;

    /* renamed from: q, reason: collision with root package name */
    public final c6.m f33670q;

    /* renamed from: r, reason: collision with root package name */
    public final k f33671r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f33672s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f33673t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f33674u;

    /* renamed from: v, reason: collision with root package name */
    public final i f33675v;

    /* renamed from: w, reason: collision with root package name */
    public final List<i0> f33676w;

    /* renamed from: x, reason: collision with root package name */
    public final DrmInitData f33677x;
    public final g5.a y;

    /* renamed from: z, reason: collision with root package name */
    public final w f33678z;

    public j(i iVar, c6.j jVar, c6.m mVar, i0 i0Var, boolean z10, c6.j jVar2, c6.m mVar2, boolean z11, Uri uri, List<i0> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, d0 d0Var, DrmInitData drmInitData, k kVar, g5.a aVar, w wVar, boolean z15, l4.w wVar2) {
        super(jVar, mVar, i0Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.o = i11;
        this.K = z12;
        this.f33666l = i12;
        this.f33670q = mVar2;
        this.f33669p = jVar2;
        this.F = mVar2 != null;
        this.B = z11;
        this.f33667m = uri;
        this.f33672s = z14;
        this.f33674u = d0Var;
        this.f33673t = z13;
        this.f33675v = iVar;
        this.f33676w = list;
        this.f33677x = drmInitData;
        this.f33671r = kVar;
        this.y = aVar;
        this.f33678z = wVar;
        this.f33668n = z15;
        j0.b bVar = j0.f30006t;
        this.I = v1.f30113w;
        this.f33665k = L.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (i7.g.c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    @Override // c6.b0.d
    public final void a() {
        this.G = true;
    }

    @Override // l5.l
    public final boolean c() {
        throw null;
    }

    @RequiresNonNull({"output"})
    public final void d(c6.j jVar, c6.m mVar, boolean z10, boolean z11) throws IOException {
        c6.m a10;
        boolean z12;
        long j10;
        long j11;
        boolean z13;
        boolean z14;
        if (z10) {
            if (this.E != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            z12 = z14;
            a10 = mVar;
        } else {
            a10 = mVar.a(this.E);
            z12 = false;
        }
        try {
            p4.e g6 = g(jVar, a10, z11);
            if (z12) {
                g6.i(this.E);
            }
            while (!this.G) {
                try {
                    try {
                        if (((b) this.C).f33630a.c(g6, b.f33629d) == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f32508d.f30522w & 16384) != 0) {
                            ((b) this.C).f33630a.g(0L, 0L);
                            j10 = g6.f34314d;
                            j11 = mVar.f;
                        } else {
                            throw e10;
                        }
                    }
                } catch (Throwable th) {
                    this.E = (int) (g6.f34314d - mVar.f);
                    throw th;
                }
            }
            j10 = g6.f34314d;
            j11 = mVar.f;
            this.E = (int) (j10 - j11);
        } finally {
            androidx.activity.n.o0(jVar);
        }
    }

    public final int f(int i10) {
        d6.a.d(!this.f33668n);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return this.I.get(i10).intValue();
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    public final p4.e g(c6.j jVar, c6.m mVar, boolean z10) throws IOException {
        boolean z11;
        int i10;
        long j10;
        long j11;
        b bVar;
        b bVar2;
        ArrayList arrayList;
        p4.h aVar;
        boolean z12;
        boolean z13;
        int i11;
        List<i0> emptyList;
        List<i0> singletonList;
        int i12;
        boolean z14;
        boolean z15;
        int i13;
        long j12;
        boolean z16;
        p4.h dVar;
        long f = jVar.f(mVar);
        int i14 = 1;
        if (z10) {
            try {
                d0 d0Var = this.f33674u;
                boolean z17 = this.f33672s;
                long j13 = this.f32510g;
                synchronized (d0Var) {
                    if (d0Var.f27292a == 9223372036854775806L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d6.a.d(z11);
                    if (d0Var.f27293b == com.anythink.expressad.exoplayer.b.f7291b) {
                        if (z17) {
                            d0Var.f27295d.set(Long.valueOf(j13));
                        } else {
                            while (d0Var.f27293b == com.anythink.expressad.exoplayer.b.f7291b) {
                                d0Var.wait();
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        p4.e eVar = new p4.e(jVar, mVar.f, f);
        if (this.C == null) {
            w wVar = this.f33678z;
            eVar.f = 0;
            try {
                wVar.B(10);
                eVar.c(wVar.f27384a, 0, 10, false);
                if (wVar.v() == 4801587) {
                    wVar.F(3);
                    int s10 = wVar.s();
                    int i15 = s10 + 10;
                    byte[] bArr = wVar.f27384a;
                    if (i15 > bArr.length) {
                        wVar.B(i15);
                        System.arraycopy(bArr, 0, wVar.f27384a, 0, 10);
                    }
                    eVar.c(wVar.f27384a, 10, s10, false);
                    Metadata i16 = this.y.i(s10, wVar.f27384a);
                    if (i16 != null) {
                        for (Metadata.Entry entry : i16.f19997s) {
                            if (entry instanceof PrivFrame) {
                                PrivFrame privFrame = (PrivFrame) entry;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f20057t)) {
                                    System.arraycopy(privFrame.f20058u, 0, wVar.f27384a, 0, 8);
                                    wVar.E(0);
                                    wVar.D(8);
                                    j10 = wVar.m() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j10 = -9223372036854775807L;
            eVar.f = 0;
            k kVar = this.f33671r;
            if (kVar != null) {
                b bVar3 = (b) kVar;
                p4.h hVar = bVar3.f33630a;
                if (!(hVar instanceof c0) && !(hVar instanceof x4.e)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                d6.a.d(!z16);
                p4.h hVar2 = bVar3.f33630a;
                boolean z18 = hVar2 instanceof o;
                d0 d0Var2 = bVar3.f33632c;
                i0 i0Var = bVar3.f33631b;
                if (z18) {
                    dVar = new o(i0Var.f30520u, d0Var2);
                } else if (hVar2 instanceof z4.e) {
                    dVar = new z4.e(0);
                } else if (hVar2 instanceof z4.a) {
                    dVar = new z4.a();
                } else if (hVar2 instanceof z4.c) {
                    dVar = new z4.c();
                } else if (hVar2 instanceof w4.d) {
                    dVar = new w4.d();
                } else {
                    throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(hVar2.getClass().getSimpleName()));
                }
                bVar2 = new b(dVar, i0Var, d0Var2);
                j11 = j10;
                i10 = 0;
            } else {
                i iVar = this.f33675v;
                Uri uri = mVar.f3377a;
                i0 i0Var2 = this.f32508d;
                List<i0> list = this.f33676w;
                d0 d0Var3 = this.f33674u;
                Map<String, List<String>> g6 = jVar.g();
                ((d) iVar).getClass();
                int h10 = d6.a.h(i0Var2.D);
                int i17 = d6.a.i(g6);
                int j14 = d6.a.j(uri);
                ArrayList arrayList2 = new ArrayList(7);
                d.a(h10, arrayList2);
                d.a(i17, arrayList2);
                d.a(j14, arrayList2);
                int[] iArr = d.f33634b;
                int i18 = 0;
                for (int i19 = 7; i18 < i19; i19 = 7) {
                    d.a(iArr[i18], arrayList2);
                    i18++;
                }
                eVar.f = 0;
                int i20 = 0;
                p4.h hVar3 = null;
                while (true) {
                    if (i20 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i20)).intValue();
                        if (intValue != 0) {
                            if (intValue != i14) {
                                if (intValue != 2) {
                                    if (intValue != 7) {
                                        if (intValue != 8) {
                                            if (intValue != 11) {
                                                if (intValue != 13) {
                                                    j11 = j10;
                                                    arrayList = arrayList2;
                                                    aVar = null;
                                                } else {
                                                    aVar = new o(i0Var2.f30520u, d0Var3);
                                                    j11 = j10;
                                                    arrayList = arrayList2;
                                                }
                                            } else {
                                                if (list != null) {
                                                    i12 = 48;
                                                    arrayList = arrayList2;
                                                    singletonList = list;
                                                } else {
                                                    i0.a aVar2 = new i0.a();
                                                    aVar2.f30534k = com.anythink.expressad.exoplayer.k.o.W;
                                                    arrayList = arrayList2;
                                                    singletonList = Collections.singletonList(new i0(aVar2));
                                                    i12 = 16;
                                                }
                                                String str = i0Var2.A;
                                                if (!TextUtils.isEmpty(str)) {
                                                    j11 = j10;
                                                    if (r.c(str, com.anythink.expressad.exoplayer.k.o.f9083r) != null) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (!z14) {
                                                        i12 |= 2;
                                                    }
                                                    if (r.c(str, com.anythink.expressad.exoplayer.k.o.f9074h) != null) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    if (!z15) {
                                                        i12 |= 4;
                                                    }
                                                } else {
                                                    j11 = j10;
                                                }
                                                aVar = new c0(2, d0Var3, new z4.g(i12, singletonList));
                                            }
                                        } else {
                                            j11 = j10;
                                            arrayList = arrayList2;
                                            Metadata metadata = i0Var2.B;
                                            if (metadata != null) {
                                                int i21 = 0;
                                                while (true) {
                                                    Metadata.Entry[] entryArr = metadata.f19997s;
                                                    if (i21 >= entryArr.length) {
                                                        break;
                                                    }
                                                    Metadata.Entry entry2 = entryArr[i21];
                                                    if (entry2 instanceof HlsTrackMetadataEntry) {
                                                        z13 = !((HlsTrackMetadataEntry) entry2).f20204u.isEmpty();
                                                        break;
                                                    }
                                                    i21++;
                                                }
                                            }
                                            z13 = false;
                                            if (z13) {
                                                i11 = 4;
                                            } else {
                                                i11 = 0;
                                            }
                                            if (list != null) {
                                                emptyList = list;
                                            } else {
                                                emptyList = Collections.emptyList();
                                            }
                                            aVar = new x4.e(i11, d0Var3, null, emptyList);
                                        }
                                    } else {
                                        j11 = j10;
                                        arrayList = arrayList2;
                                        aVar = new w4.d(0L);
                                    }
                                } else {
                                    j11 = j10;
                                    arrayList = arrayList2;
                                    aVar = new z4.e(0);
                                }
                            } else {
                                j11 = j10;
                                arrayList = arrayList2;
                                aVar = new z4.c();
                            }
                        } else {
                            j11 = j10;
                            arrayList = arrayList2;
                            aVar = new z4.a();
                        }
                        aVar.getClass();
                        try {
                            z12 = aVar.d(eVar);
                            i10 = 0;
                            eVar.f = 0;
                        } catch (EOFException unused3) {
                            i10 = 0;
                            eVar.f = 0;
                            z12 = false;
                        } catch (Throwable th) {
                            eVar.f = 0;
                            throw th;
                        }
                        if (z12) {
                            bVar = new b(aVar, i0Var2, d0Var3);
                            break;
                        }
                        if (hVar3 == null && (intValue == h10 || intValue == i17 || intValue == j14 || intValue == 11)) {
                            hVar3 = aVar;
                        }
                        i20++;
                        arrayList2 = arrayList;
                        j10 = j11;
                        i14 = 1;
                    } else {
                        j11 = j10;
                        i10 = 0;
                        hVar3.getClass();
                        bVar = new b(hVar3, i0Var2, d0Var3);
                        break;
                    }
                }
                bVar2 = bVar;
            }
            this.C = bVar2;
            p4.h hVar4 = bVar2.f33630a;
            if (!(hVar4 instanceof z4.e) && !(hVar4 instanceof z4.a) && !(hVar4 instanceof z4.c) && !(hVar4 instanceof w4.d)) {
                i13 = i10;
            } else {
                i13 = 1;
            }
            if (i13 != 0) {
                n nVar = this.D;
                if (j11 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j12 = this.f33674u.b(j11);
                } else {
                    j12 = this.f32510g;
                }
                if (nVar.f33704p0 != j12) {
                    nVar.f33704p0 = j12;
                    n.c[] cVarArr = nVar.N;
                    int length = cVarArr.length;
                    for (int i22 = i10; i22 < length; i22++) {
                        n.c cVar = cVarArr[i22];
                        if (cVar.F != j12) {
                            cVar.F = j12;
                            cVar.f29735z = true;
                        }
                    }
                }
            } else {
                n nVar2 = this.D;
                if (nVar2.f33704p0 != 0) {
                    nVar2.f33704p0 = 0L;
                    n.c[] cVarArr2 = nVar2.N;
                    int length2 = cVarArr2.length;
                    for (int i23 = i10; i23 < length2; i23++) {
                        n.c cVar2 = cVarArr2[i23];
                        if (cVar2.F != 0) {
                            cVar2.F = 0L;
                            cVar2.f29735z = true;
                        }
                    }
                }
            }
            this.D.P.clear();
            ((b) this.C).f33630a.f(this.D);
        } else {
            i10 = 0;
        }
        n nVar3 = this.D;
        DrmInitData drmInitData = this.f33677x;
        if (!g0.a(nVar3.f33705q0, drmInitData)) {
            nVar3.f33705q0 = drmInitData;
            int i24 = i10;
            while (true) {
                n.c[] cVarArr3 = nVar3.N;
                if (i24 >= cVarArr3.length) {
                    break;
                }
                if (nVar3.f33697i0[i24]) {
                    n.c cVar3 = cVarArr3[i24];
                    cVar3.I = drmInitData;
                    cVar3.f29735z = true;
                }
                i24++;
            }
        }
        return eVar;
    }

    @Override // c6.b0.d
    public final void load() throws IOException {
        k kVar;
        boolean z10;
        this.D.getClass();
        if (this.C == null && (kVar = this.f33671r) != null) {
            p4.h hVar = ((b) kVar).f33630a;
            if (!(hVar instanceof c0) && !(hVar instanceof x4.e)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.C = kVar;
                this.F = false;
            }
        }
        if (this.F) {
            c6.j jVar = this.f33669p;
            jVar.getClass();
            c6.m mVar = this.f33670q;
            mVar.getClass();
            d(jVar, mVar, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (!this.G) {
            if (!this.f33673t) {
                d(this.f32512i, this.f32506b, this.A, true);
            }
            this.H = !this.G;
        }
    }
}
