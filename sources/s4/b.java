package s4;

import com.applovin.exoplayer2.b0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d6.g0;
import d6.v;
import j7.j0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import k4.z0;
import p4.e;
import p4.h;
import p4.i;
import p4.j;
import p4.m;
import p4.n;
import p4.o;
import p4.p;
import p4.t;
import p4.u;
import p4.w;
import p4.z;

/* compiled from: FlacExtractor.java */
/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: e, reason: collision with root package name */
    public j f35128e;
    public w f;

    /* renamed from: h, reason: collision with root package name */
    public Metadata f35130h;

    /* renamed from: i, reason: collision with root package name */
    public p f35131i;

    /* renamed from: j, reason: collision with root package name */
    public int f35132j;

    /* renamed from: k, reason: collision with root package name */
    public int f35133k;

    /* renamed from: l, reason: collision with root package name */
    public a f35134l;

    /* renamed from: m, reason: collision with root package name */
    public int f35135m;

    /* renamed from: n, reason: collision with root package name */
    public long f35136n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f35124a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final d6.w f35125b = new d6.w(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35126c = false;

    /* renamed from: d, reason: collision with root package name */
    public final m.a f35127d = new m.a();

    /* renamed from: g, reason: collision with root package name */
    public int f35129g = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    @Override // p4.h
    public final int c(i iVar, t tVar) throws IOException {
        b0 b0Var;
        ?? r15;
        boolean z10;
        Metadata metadata;
        p pVar;
        Metadata metadata2;
        u bVar;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f35129g;
        Metadata metadata3 = null;
        boolean z14 = true;
        ?? r52 = 0;
        if (i10 != 0) {
            byte[] bArr = this.f35124a;
            if (i10 != 1) {
                int i11 = 4;
                if (i10 != 2) {
                    int i12 = 7;
                    if (i10 != 3) {
                        long j11 = 0;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f.getClass();
                                this.f35131i.getClass();
                                a aVar = this.f35134l;
                                if (aVar != null) {
                                    if (aVar.f34281c != null) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        return aVar.a((e) iVar, tVar);
                                    }
                                }
                                if (this.f35136n == -1) {
                                    p pVar2 = this.f35131i;
                                    e eVar = (e) iVar;
                                    eVar.f = 0;
                                    eVar.k(1, false);
                                    byte[] bArr2 = new byte[1];
                                    eVar.c(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    eVar.k(2, false);
                                    if (!z12) {
                                        i12 = 6;
                                    }
                                    d6.w wVar = new d6.w(i12);
                                    byte[] bArr3 = wVar.f27384a;
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        int m10 = eVar.m(bArr3, 0 + i13, i12 - i13);
                                        if (m10 == -1) {
                                            break;
                                        }
                                        i13 += m10;
                                    }
                                    wVar.D(i13);
                                    eVar.f = 0;
                                    try {
                                        j11 = wVar.z();
                                        if (!z12) {
                                            j11 *= pVar2.f34329b;
                                        }
                                    } catch (NumberFormatException unused) {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        this.f35136n = j11;
                                        return 0;
                                    }
                                    throw z0.a(null, null);
                                }
                                d6.w wVar2 = this.f35125b;
                                int i14 = wVar2.f27386c;
                                if (i14 < 32768) {
                                    int read = ((e) iVar).read(wVar2.f27384a, i14, 32768 - i14);
                                    if (read != -1) {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        wVar2.D(i14 + read);
                                    } else if (wVar2.f27386c - wVar2.f27385b == 0) {
                                        long j12 = this.f35136n * 1000000;
                                        p pVar3 = this.f35131i;
                                        int i15 = g0.f27302a;
                                        this.f.c(j12 / pVar3.f34332e, 1, this.f35135m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z14 = false;
                                }
                                int i16 = wVar2.f27385b;
                                int i17 = this.f35135m;
                                int i18 = this.f35132j;
                                if (i17 < i18) {
                                    wVar2.F(Math.min(i18 - i17, wVar2.f27386c - i16));
                                }
                                this.f35131i.getClass();
                                int i19 = wVar2.f27385b;
                                while (true) {
                                    int i20 = wVar2.f27386c - 16;
                                    m.a aVar2 = this.f35127d;
                                    if (i19 <= i20) {
                                        wVar2.E(i19);
                                        if (m.a(wVar2, this.f35131i, this.f35133k, aVar2)) {
                                            wVar2.E(i19);
                                            j10 = aVar2.f34325a;
                                            break;
                                        }
                                        i19++;
                                    } else {
                                        if (z14) {
                                            while (true) {
                                                int i21 = wVar2.f27386c;
                                                if (i19 <= i21 - this.f35132j) {
                                                    wVar2.E(i19);
                                                    try {
                                                        z11 = m.a(wVar2, this.f35131i, this.f35133k, aVar2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z11 = false;
                                                    }
                                                    if (wVar2.f27385b > wVar2.f27386c) {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        wVar2.E(i19);
                                                        j10 = aVar2.f34325a;
                                                        break;
                                                    }
                                                    i19++;
                                                } else {
                                                    wVar2.E(i21);
                                                    break;
                                                }
                                            }
                                        } else {
                                            wVar2.E(i19);
                                        }
                                        j10 = -1;
                                    }
                                }
                                int i22 = wVar2.f27385b - i16;
                                wVar2.E(i16);
                                this.f.f(i22, wVar2);
                                int i23 = this.f35135m + i22;
                                this.f35135m = i23;
                                if (j10 != -1) {
                                    long j13 = this.f35136n * 1000000;
                                    p pVar4 = this.f35131i;
                                    int i24 = g0.f27302a;
                                    this.f.c(j13 / pVar4.f34332e, 1, i23, 0, null);
                                    this.f35135m = 0;
                                    this.f35136n = j10;
                                }
                                int i25 = wVar2.f27386c;
                                int i26 = wVar2.f27385b;
                                int i27 = i25 - i26;
                                if (i27 >= 16) {
                                    return 0;
                                }
                                byte[] bArr4 = wVar2.f27384a;
                                System.arraycopy(bArr4, i26, bArr4, 0, i27);
                                wVar2.E(0);
                                wVar2.D(i27);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        e eVar2 = (e) iVar;
                        eVar2.f = 0;
                        d6.w wVar3 = new d6.w(2);
                        eVar2.c(wVar3.f27384a, 0, 2, false);
                        int y = wVar3.y();
                        if ((y >> 2) == 16382) {
                            eVar2.f = 0;
                            this.f35133k = y;
                            j jVar = this.f35128e;
                            int i28 = g0.f27302a;
                            long j14 = eVar2.f34314d;
                            long j15 = eVar2.f34313c;
                            this.f35131i.getClass();
                            p pVar5 = this.f35131i;
                            if (pVar5.f34337k != null) {
                                bVar = new o(pVar5, j14);
                            } else if (j15 != -1 && pVar5.f34336j > 0) {
                                a aVar3 = new a(pVar5, this.f35133k, j14, j15);
                                this.f35134l = aVar3;
                                bVar = aVar3.f34279a;
                            } else {
                                bVar = new u.b(pVar5.b());
                            }
                            jVar.i(bVar);
                            this.f35129g = 5;
                            return 0;
                        }
                        eVar2.f = 0;
                        throw z0.a("First frame does not start with sync code.", null);
                    }
                    p pVar6 = this.f35131i;
                    boolean z15 = false;
                    while (!z15) {
                        e eVar3 = (e) iVar;
                        eVar3.f = r52;
                        v vVar = new v(new byte[i11], i11);
                        eVar3.c(vVar.f27378a, r52, i11, r52);
                        boolean f = vVar.f();
                        int g6 = vVar.g(i12);
                        int g10 = vVar.g(24) + i11;
                        if (g6 == 0) {
                            byte[] bArr5 = new byte[38];
                            eVar3.a(bArr5, r52, 38, r52);
                            pVar6 = new p(bArr5, i11);
                            z10 = f;
                        } else if (pVar6 != null) {
                            if (g6 == 3) {
                                d6.w wVar4 = new d6.w(g10);
                                eVar3.a(wVar4.f27384a, r52, g10, r52);
                                z10 = f;
                                pVar = new p(pVar6.f34328a, pVar6.f34329b, pVar6.f34330c, pVar6.f34331d, pVar6.f34332e, pVar6.f34333g, pVar6.f34334h, pVar6.f34336j, n.a(wVar4), pVar6.f34338l);
                            } else {
                                z10 = f;
                                Metadata metadata4 = pVar6.f34338l;
                                if (g6 == i11) {
                                    d6.w wVar5 = new d6.w(g10);
                                    eVar3.a(wVar5.f27384a, 0, g10, false);
                                    wVar5.F(i11);
                                    Metadata a10 = z.a(Arrays.asList(z.b(wVar5, false, false).f34372a));
                                    if (metadata4 == null) {
                                        metadata2 = a10;
                                    } else {
                                        if (a10 != null) {
                                            Metadata.Entry[] entryArr = a10.f19997s;
                                            if (entryArr.length != 0) {
                                                int i29 = g0.f27302a;
                                                Metadata.Entry[] entryArr2 = metadata4.f19997s;
                                                Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                                                System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
                                                metadata4 = new Metadata(metadata4.f19998t, (Metadata.Entry[]) copyOf);
                                            }
                                        }
                                        metadata2 = metadata4;
                                    }
                                    pVar = new p(pVar6.f34328a, pVar6.f34329b, pVar6.f34330c, pVar6.f34331d, pVar6.f34332e, pVar6.f34333g, pVar6.f34334h, pVar6.f34336j, pVar6.f34337k, metadata2);
                                } else if (g6 == 6) {
                                    d6.w wVar6 = new d6.w(g10);
                                    eVar3.a(wVar6.f27384a, 0, g10, false);
                                    wVar6.F(4);
                                    Metadata metadata5 = new Metadata(j0.G(PictureFrame.a(wVar6)));
                                    if (metadata4 == null) {
                                        metadata = metadata5;
                                    } else {
                                        Metadata.Entry[] entryArr3 = metadata5.f19997s;
                                        if (entryArr3.length != 0) {
                                            int i30 = g0.f27302a;
                                            Metadata.Entry[] entryArr4 = metadata4.f19997s;
                                            Object[] copyOf2 = Arrays.copyOf(entryArr4, entryArr4.length + entryArr3.length);
                                            System.arraycopy(entryArr3, 0, copyOf2, entryArr4.length, entryArr3.length);
                                            metadata4 = new Metadata(metadata4.f19998t, (Metadata.Entry[]) copyOf2);
                                        }
                                        metadata = metadata4;
                                    }
                                    pVar = new p(pVar6.f34328a, pVar6.f34329b, pVar6.f34330c, pVar6.f34331d, pVar6.f34332e, pVar6.f34333g, pVar6.f34334h, pVar6.f34336j, pVar6.f34337k, metadata);
                                } else {
                                    eVar3.i(g10);
                                }
                            }
                            pVar6 = pVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i31 = g0.f27302a;
                        this.f35131i = pVar6;
                        z15 = z10;
                        r52 = 0;
                        i11 = 4;
                        i12 = 7;
                    }
                    this.f35131i.getClass();
                    this.f35132j = Math.max(this.f35131i.f34330c, 6);
                    w wVar7 = this.f;
                    int i32 = g0.f27302a;
                    wVar7.b(this.f35131i.c(bArr, this.f35130h));
                    this.f35129g = 4;
                    return 0;
                }
                d6.w wVar8 = new d6.w(4);
                ((e) iVar).a(wVar8.f27384a, 0, 4, false);
                if (wVar8.u() == 1716281667) {
                    this.f35129g = 3;
                    return 0;
                }
                throw z0.a("Failed to read FLAC stream marker.", null);
            }
            e eVar4 = (e) iVar;
            eVar4.c(bArr, 0, bArr.length, false);
            eVar4.f = 0;
            this.f35129g = 2;
            return 0;
        }
        boolean z16 = !this.f35126c;
        e eVar5 = (e) iVar;
        eVar5.f = 0;
        long d10 = eVar5.d();
        if (z16) {
            b0Var = null;
        } else {
            b0Var = g5.a.f28516w;
        }
        d6.w wVar9 = new d6.w(10);
        Metadata metadata6 = null;
        int i33 = 0;
        while (true) {
            try {
                try {
                    eVar5.c(wVar9.f27384a, 0, 10, false);
                    wVar9.E(0);
                    if (wVar9.v() != 4801587) {
                        break;
                    }
                    wVar9.F(3);
                    int s10 = wVar9.s();
                    int i34 = s10 + 10;
                    if (metadata6 == null) {
                        byte[] bArr6 = new byte[i34];
                        System.arraycopy(wVar9.f27384a, 0, bArr6, 0, 10);
                        eVar5.c(bArr6, 10, s10, false);
                        metadata6 = new g5.a(b0Var).i(i34, bArr6);
                    } else {
                        eVar5.k(s10, false);
                    }
                    i33 += i34;
                } catch (EOFException unused3) {
                    r15 = 0;
                }
            } catch (EOFException unused4) {
            }
        }
        r15 = 0;
        eVar5.f = r15;
        eVar5.k(i33, r15);
        if (metadata6 != null && metadata6.f19997s.length != 0) {
            metadata3 = metadata6;
        }
        eVar5.i((int) (eVar5.d() - d10));
        this.f35130h = metadata3;
        this.f35129g = 1;
        return 0;
    }

    @Override // p4.h
    public final boolean d(i iVar) throws IOException {
        e eVar = (e) iVar;
        b0 b0Var = g5.a.f28516w;
        d6.w wVar = new d6.w(10);
        Metadata metadata = null;
        int i10 = 0;
        while (true) {
            try {
                eVar.c(wVar.f27384a, 0, 10, false);
                wVar.E(0);
                if (wVar.v() != 4801587) {
                    break;
                }
                wVar.F(3);
                int s10 = wVar.s();
                int i11 = s10 + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(wVar.f27384a, 0, bArr, 0, 10);
                    eVar.c(bArr, 10, s10, false);
                    metadata = new g5.a(b0Var).i(i11, bArr);
                } else {
                    eVar.k(s10, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        eVar.f = 0;
        eVar.k(i10, false);
        if (metadata != null) {
            int length = metadata.f19997s.length;
        }
        d6.w wVar2 = new d6.w(4);
        eVar.c(wVar2.f27384a, 0, 4, false);
        if (wVar2.u() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // p4.h
    public final void f(j jVar) {
        this.f35128e = jVar;
        this.f = jVar.s(0, 1);
        jVar.m();
    }

    @Override // p4.h
    public final void g(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f35129g = 0;
        } else {
            a aVar = this.f35134l;
            if (aVar != null) {
                aVar.c(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f35136n = j12;
        this.f35135m = 0;
        this.f35125b.B(0);
    }

    @Override // p4.h
    public final void release() {
    }
}
