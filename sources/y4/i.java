package y4;

import com.anythink.expressad.exoplayer.k.o;
import com.anythink.expressad.exoplayer.k.p;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.w;
import j7.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import k4.i0;
import k4.z0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p4.y;
import p4.z;
import y4.h;

/* compiled from: VorbisReader.java */
/* loaded from: classes2.dex */
public final class i extends h {

    /* renamed from: n, reason: collision with root package name */
    public a f36695n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f36696p;

    /* renamed from: q, reason: collision with root package name */
    public z.c f36697q;

    /* renamed from: r, reason: collision with root package name */
    public z.a f36698r;

    /* compiled from: VorbisReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final z.c f36699a;

        /* renamed from: b, reason: collision with root package name */
        public final z.a f36700b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f36701c;

        /* renamed from: d, reason: collision with root package name */
        public final z.b[] f36702d;

        /* renamed from: e, reason: collision with root package name */
        public final int f36703e;

        public a(z.c cVar, z.a aVar, byte[] bArr, z.b[] bVarArr, int i10) {
            this.f36699a = cVar;
            this.f36700b = aVar;
            this.f36701c = bArr;
            this.f36702d = bVarArr;
            this.f36703e = i10;
        }
    }

    @Override // y4.h
    public final void a(long j10) {
        boolean z10;
        this.f36686g = j10;
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36696p = z10;
        z.c cVar = this.f36697q;
        if (cVar != null) {
            i10 = cVar.f34378e;
        }
        this.o = i10;
    }

    @Override // y4.h
    public final long b(w wVar) {
        int i10;
        int i11 = 0;
        byte b10 = wVar.f27384a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f36695n;
        d6.a.e(aVar);
        boolean z10 = aVar.f36702d[(b10 >> 1) & (p.f9095b >>> (8 - aVar.f36703e))].f34373a;
        z.c cVar = aVar.f36699a;
        if (!z10) {
            i10 = cVar.f34378e;
        } else {
            i10 = cVar.f;
        }
        if (this.f36696p) {
            i11 = (this.o + i10) / 4;
        }
        long j10 = i11;
        byte[] bArr = wVar.f27384a;
        int length = bArr.length;
        int i12 = wVar.f27386c + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            wVar.C(copyOf.length, copyOf);
        } else {
            wVar.D(i12);
        }
        byte[] bArr2 = wVar.f27384a;
        int i13 = wVar.f27386c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f36696p = true;
        this.o = i10;
        return j10;
    }

    @Override // y4.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(w wVar, long j10, h.a aVar) throws IOException {
        a aVar2;
        int i10;
        int i11;
        z.c cVar;
        int i12;
        z.c cVar2;
        byte[] bArr;
        z.c cVar3;
        int i13;
        int i14;
        if (this.f36695n != null) {
            aVar.f36693a.getClass();
            return false;
        }
        z.c cVar4 = this.f36697q;
        int i15 = 4;
        if (cVar4 == null) {
            z.c(1, wVar, false);
            wVar.k();
            int t10 = wVar.t();
            int k10 = wVar.k();
            int g6 = wVar.g();
            if (g6 <= 0) {
                i13 = -1;
            } else {
                i13 = g6;
            }
            int g10 = wVar.g();
            if (g10 <= 0) {
                i14 = -1;
            } else {
                i14 = g10;
            }
            wVar.g();
            int t11 = wVar.t();
            int pow = (int) Math.pow(2.0d, t11 & 15);
            int pow2 = (int) Math.pow(2.0d, (t11 & 240) >> 4);
            wVar.t();
            this.f36697q = new z.c(t10, k10, i13, i14, pow, pow2, Arrays.copyOf(wVar.f27384a, wVar.f27386c));
        } else {
            z.a aVar3 = this.f36698r;
            if (aVar3 == null) {
                this.f36698r = z.b(wVar, true, true);
            } else {
                int i16 = wVar.f27386c;
                byte[] bArr2 = new byte[i16];
                System.arraycopy(wVar.f27384a, 0, bArr2, 0, i16);
                int i17 = 5;
                z.c(5, wVar, false);
                int t12 = wVar.t() + 1;
                y yVar = new y(wVar.f27384a);
                yVar.j(wVar.f27385b * 8);
                int i18 = 0;
                while (i18 < t12) {
                    if (yVar.e(24) == 5653314) {
                        int e10 = yVar.e(16);
                        int e11 = yVar.e(24);
                        long[] jArr = new long[e11];
                        long j11 = 0;
                        if (!yVar.d()) {
                            boolean d10 = yVar.d();
                            int i19 = 0;
                            while (i19 < e11) {
                                if (d10) {
                                    if (yVar.d()) {
                                        cVar3 = cVar4;
                                        jArr[i19] = yVar.e(i17) + 1;
                                    } else {
                                        cVar3 = cVar4;
                                        jArr[i19] = 0;
                                    }
                                } else {
                                    cVar3 = cVar4;
                                    jArr[i19] = yVar.e(i17) + 1;
                                }
                                i19++;
                                cVar4 = cVar3;
                                i15 = 4;
                            }
                            cVar2 = cVar4;
                            bArr = bArr2;
                        } else {
                            cVar2 = cVar4;
                            int e12 = yVar.e(i17) + 1;
                            int i20 = 0;
                            while (i20 < e11) {
                                int i21 = 0;
                                for (int i22 = e11 - i20; i22 > 0; i22 >>>= 1) {
                                    i21++;
                                }
                                int e13 = yVar.e(i21);
                                int i23 = 0;
                                while (i23 < e13 && i20 < e11) {
                                    jArr[i20] = e12;
                                    i20++;
                                    i23++;
                                    bArr2 = bArr2;
                                }
                                e12++;
                                bArr2 = bArr2;
                            }
                            bArr = bArr2;
                            i15 = 4;
                        }
                        int e14 = yVar.e(i15);
                        if (e14 <= 2) {
                            if (e14 == 1 || e14 == 2) {
                                yVar.j(32);
                                yVar.j(32);
                                int e15 = yVar.e(i15) + 1;
                                yVar.j(1);
                                if (e14 == 1) {
                                    if (e10 != 0) {
                                        j11 = (long) Math.floor(Math.pow(e11, 1.0d / e10));
                                    }
                                } else {
                                    j11 = e11 * e10;
                                }
                                yVar.j((int) (e15 * j11));
                            }
                            i18++;
                            bArr2 = bArr;
                            cVar4 = cVar2;
                            i15 = 4;
                            i17 = 5;
                        } else {
                            throw z0.a("lookup type greater than 2 not decodable: " + e14, null);
                        }
                    } else {
                        throw z0.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((yVar.f34370d * 8) + yVar.f34371e), null);
                    }
                }
                z.c cVar5 = cVar4;
                byte[] bArr3 = bArr2;
                int i24 = 6;
                int e16 = yVar.e(6) + 1;
                for (int i25 = 0; i25 < e16; i25++) {
                    if (yVar.e(16) != 0) {
                        throw z0.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i26 = 1;
                int e17 = yVar.e(6) + 1;
                int i27 = 0;
                while (true) {
                    int i28 = 3;
                    if (i27 < e17) {
                        int e18 = yVar.e(16);
                        if (e18 != 0) {
                            if (e18 == i26) {
                                int e19 = yVar.e(5);
                                int[] iArr = new int[e19];
                                int i29 = -1;
                                for (int i30 = 0; i30 < e19; i30++) {
                                    int e20 = yVar.e(4);
                                    iArr[i30] = e20;
                                    if (e20 > i29) {
                                        i29 = e20;
                                    }
                                }
                                int i31 = i29 + 1;
                                int[] iArr2 = new int[i31];
                                int i32 = 0;
                                while (i32 < i31) {
                                    iArr2[i32] = yVar.e(i28) + 1;
                                    int e21 = yVar.e(2);
                                    int i33 = 8;
                                    if (e21 > 0) {
                                        yVar.j(8);
                                    }
                                    int i34 = 0;
                                    for (int i35 = 1; i34 < (i35 << e21); i35 = 1) {
                                        yVar.j(i33);
                                        i34++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i28 = 3;
                                }
                                yVar.j(2);
                                int e22 = yVar.e(4);
                                int i36 = 0;
                                int i37 = 0;
                                for (int i38 = 0; i38 < e19; i38++) {
                                    i36 += iArr2[iArr[i38]];
                                    while (i37 < i36) {
                                        yVar.j(e22);
                                        i37++;
                                    }
                                }
                            } else {
                                throw z0.a("floor type greater than 1 not decodable: " + e18, null);
                            }
                        } else {
                            int i39 = 8;
                            yVar.j(8);
                            yVar.j(16);
                            yVar.j(16);
                            yVar.j(6);
                            yVar.j(8);
                            int e23 = yVar.e(4) + 1;
                            int i40 = 0;
                            while (i40 < e23) {
                                yVar.j(i39);
                                i40++;
                                i39 = 8;
                            }
                        }
                        i27++;
                        i24 = 6;
                        i26 = 1;
                    } else {
                        int i41 = 1;
                        int e24 = yVar.e(i24) + 1;
                        int i42 = 0;
                        while (i42 < e24) {
                            if (yVar.e(16) <= 2) {
                                yVar.j(24);
                                yVar.j(24);
                                yVar.j(24);
                                int e25 = yVar.e(i24) + i41;
                                int i43 = 8;
                                yVar.j(8);
                                int[] iArr3 = new int[e25];
                                for (int i44 = 0; i44 < e25; i44++) {
                                    int e26 = yVar.e(3);
                                    if (yVar.d()) {
                                        i12 = yVar.e(5);
                                    } else {
                                        i12 = 0;
                                    }
                                    iArr3[i44] = (i12 * 8) + e26;
                                }
                                int i45 = 0;
                                while (i45 < e25) {
                                    int i46 = 0;
                                    while (i46 < i43) {
                                        if ((iArr3[i45] & (1 << i46)) != 0) {
                                            yVar.j(i43);
                                        }
                                        i46++;
                                        i43 = 8;
                                    }
                                    i45++;
                                    i43 = 8;
                                }
                                i42++;
                                i24 = 6;
                                i41 = 1;
                            } else {
                                throw z0.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int e27 = yVar.e(i24) + 1;
                        int i47 = 0;
                        while (i47 < e27) {
                            int e28 = yVar.e(16);
                            if (e28 != 0) {
                                d6.p.c("VorbisUtil", "mapping type other than 0 not supported: " + e28);
                                cVar = cVar5;
                            } else {
                                if (yVar.d()) {
                                    i10 = 1;
                                    i11 = yVar.e(4) + 1;
                                } else {
                                    i10 = 1;
                                    i11 = 1;
                                }
                                boolean d11 = yVar.d();
                                cVar = cVar5;
                                int i48 = cVar.f34374a;
                                if (d11) {
                                    int e29 = yVar.e(8) + i10;
                                    for (int i49 = 0; i49 < e29; i49++) {
                                        int i50 = i48 - 1;
                                        int i51 = 0;
                                        for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                            i51++;
                                        }
                                        yVar.j(i51);
                                        int i53 = 0;
                                        while (i50 > 0) {
                                            i53++;
                                            i50 >>>= 1;
                                        }
                                        yVar.j(i53);
                                    }
                                }
                                if (yVar.e(2) == 0) {
                                    if (i11 > 1) {
                                        for (int i54 = 0; i54 < i48; i54++) {
                                            yVar.j(4);
                                        }
                                    }
                                    for (int i55 = 0; i55 < i11; i55++) {
                                        yVar.j(8);
                                        yVar.j(8);
                                        yVar.j(8);
                                    }
                                } else {
                                    throw z0.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                            i47++;
                            cVar5 = cVar;
                        }
                        z.c cVar6 = cVar5;
                        int e30 = yVar.e(6) + 1;
                        z.b[] bVarArr = new z.b[e30];
                        for (int i56 = 0; i56 < e30; i56++) {
                            boolean d12 = yVar.d();
                            yVar.e(16);
                            yVar.e(16);
                            yVar.e(8);
                            bVarArr[i56] = new z.b(d12);
                        }
                        if (yVar.d()) {
                            int i57 = 0;
                            for (int i58 = e30 - 1; i58 > 0; i58 >>>= 1) {
                                i57++;
                            }
                            aVar2 = new a(cVar6, aVar3, bArr3, bVarArr, i57);
                        } else {
                            throw z0.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        aVar2 = null;
        this.f36695n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        z.c cVar7 = aVar2.f36699a;
        arrayList.add(cVar7.f34379g);
        arrayList.add(aVar2.f36701c);
        Metadata a10 = z.a(j0.D(aVar2.f36700b.f34372a));
        i0.a aVar4 = new i0.a();
        aVar4.f30534k = o.G;
        aVar4.f = cVar7.f34377d;
        aVar4.f30530g = cVar7.f34376c;
        aVar4.f30546x = cVar7.f34374a;
        aVar4.y = cVar7.f34375b;
        aVar4.f30536m = arrayList;
        aVar4.f30532i = a10;
        aVar.f36693a = new i0(aVar4);
        return true;
    }

    @Override // y4.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f36695n = null;
            this.f36697q = null;
            this.f36698r = null;
        }
        this.o = 0;
        this.f36696p = false;
    }
}
