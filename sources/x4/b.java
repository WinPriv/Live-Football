package x4;

import android.util.Pair;
import com.anythink.expressad.exoplayer.k.o;
import d6.g0;
import d6.p;
import d6.r;
import d6.w;
import k4.i0;
import k4.z0;
import x4.a;

/* compiled from: AtomParsers.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f36334a = g0.C("OpusHead");

    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f36335a;

        /* renamed from: b, reason: collision with root package name */
        public int f36336b;

        /* renamed from: c, reason: collision with root package name */
        public int f36337c;

        /* renamed from: d, reason: collision with root package name */
        public long f36338d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f36339e;
        public final w f;

        /* renamed from: g, reason: collision with root package name */
        public final w f36340g;

        /* renamed from: h, reason: collision with root package name */
        public int f36341h;

        /* renamed from: i, reason: collision with root package name */
        public int f36342i;

        public a(w wVar, w wVar2, boolean z10) throws z0 {
            this.f36340g = wVar;
            this.f = wVar2;
            this.f36339e = z10;
            wVar2.E(12);
            this.f36335a = wVar2.w();
            wVar.E(12);
            this.f36342i = wVar.w();
            p4.k.a("first_chunk must be 1", wVar.d() == 1);
            this.f36336b = -1;
        }

        public final boolean a() {
            long u2;
            int i10;
            int i11 = this.f36336b + 1;
            this.f36336b = i11;
            if (i11 == this.f36335a) {
                return false;
            }
            boolean z10 = this.f36339e;
            w wVar = this.f;
            if (z10) {
                u2 = wVar.x();
            } else {
                u2 = wVar.u();
            }
            this.f36338d = u2;
            if (this.f36336b == this.f36341h) {
                w wVar2 = this.f36340g;
                this.f36337c = wVar2.w();
                wVar2.F(4);
                int i12 = this.f36342i - 1;
                this.f36342i = i12;
                if (i12 > 0) {
                    i10 = wVar2.w() - 1;
                } else {
                    i10 = -1;
                }
                this.f36341h = i10;
            }
            return true;
        }
    }

    /* compiled from: AtomParsers.java */
    /* renamed from: x4.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0508b {

        /* renamed from: a, reason: collision with root package name */
        public final String f36343a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f36344b;

        /* renamed from: c, reason: collision with root package name */
        public final long f36345c;

        /* renamed from: d, reason: collision with root package name */
        public final long f36346d;

        public C0508b(String str, byte[] bArr, long j10, long j11) {
            this.f36343a = str;
            this.f36344b = bArr;
            this.f36345c = j10;
            this.f36346d = j11;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final l[] f36347a;

        /* renamed from: b, reason: collision with root package name */
        public i0 f36348b;

        /* renamed from: c, reason: collision with root package name */
        public int f36349c;

        /* renamed from: d, reason: collision with root package name */
        public int f36350d = 0;

        public d(int i10) {
            this.f36347a = new l[i10];
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f36351a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36352b;

        /* renamed from: c, reason: collision with root package name */
        public final w f36353c;

        public e(a.b bVar, i0 i0Var) {
            w wVar = bVar.f36333b;
            this.f36353c = wVar;
            wVar.E(12);
            int w10 = wVar.w();
            if (o.f9088w.equals(i0Var.D)) {
                int w11 = g0.w(i0Var.S, i0Var.Q);
                if (w10 == 0 || w10 % w11 != 0) {
                    p.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + w11 + ", stsz sample size: " + w10);
                    w10 = w11;
                }
            }
            this.f36351a = w10 == 0 ? -1 : w10;
            this.f36352b = wVar.w();
        }

        @Override // x4.b.c
        public final int a() {
            return this.f36351a;
        }

        @Override // x4.b.c
        public final int b() {
            return this.f36352b;
        }

        @Override // x4.b.c
        public final int c() {
            int i10 = this.f36351a;
            if (i10 == -1) {
                return this.f36353c.w();
            }
            return i10;
        }
    }

    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final w f36354a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36355b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36356c;

        /* renamed from: d, reason: collision with root package name */
        public int f36357d;

        /* renamed from: e, reason: collision with root package name */
        public int f36358e;

        public f(a.b bVar) {
            w wVar = bVar.f36333b;
            this.f36354a = wVar;
            wVar.E(12);
            this.f36356c = wVar.w() & com.anythink.expressad.exoplayer.k.p.f9095b;
            this.f36355b = wVar.w();
        }

        @Override // x4.b.c
        public final int a() {
            return -1;
        }

        @Override // x4.b.c
        public final int b() {
            return this.f36355b;
        }

        @Override // x4.b.c
        public final int c() {
            w wVar = this.f36354a;
            int i10 = this.f36356c;
            if (i10 == 8) {
                return wVar.t();
            }
            if (i10 == 16) {
                return wVar.y();
            }
            int i11 = this.f36357d;
            this.f36357d = i11 + 1;
            if (i11 % 2 == 0) {
                int t10 = wVar.t();
                this.f36358e = t10;
                return (t10 & 240) >> 4;
            }
            return this.f36358e & 15;
        }
    }

    public static C0508b a(int i10, w wVar) {
        long j10;
        long j11;
        wVar.E(i10 + 8 + 4);
        wVar.F(1);
        b(wVar);
        wVar.F(2);
        int t10 = wVar.t();
        if ((t10 & 128) != 0) {
            wVar.F(2);
        }
        if ((t10 & 64) != 0) {
            wVar.F(wVar.t());
        }
        if ((t10 & 32) != 0) {
            wVar.F(2);
        }
        wVar.F(1);
        b(wVar);
        String f10 = r.f(wVar.t());
        if (!o.f9085t.equals(f10) && !o.D.equals(f10) && !o.E.equals(f10)) {
            wVar.F(4);
            long u2 = wVar.u();
            long u10 = wVar.u();
            wVar.F(1);
            int b10 = b(wVar);
            byte[] bArr = new byte[b10];
            wVar.b(bArr, 0, b10);
            if (u10 > 0) {
                j10 = u10;
            } else {
                j10 = -1;
            }
            if (u2 > 0) {
                j11 = u2;
            } else {
                j11 = -1;
            }
            return new C0508b(f10, bArr, j10, j11);
        }
        return new C0508b(f10, null, -1L, -1L);
    }

    public static int b(w wVar) {
        int t10 = wVar.t();
        int i10 = t10 & com.anythink.expressad.video.module.a.a.R;
        while ((t10 & 128) == 128) {
            t10 = wVar.t();
            i10 = (i10 << 7) | (t10 & com.anythink.expressad.video.module.a.a.R);
        }
        return i10;
    }

    public static Pair c(int i10, int i11, w wVar) throws z0 {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        l lVar;
        Pair create;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int i14 = wVar.f27385b;
        while (i14 - i10 < i11) {
            wVar.E(i14);
            int d10 = wVar.d();
            boolean z14 = true;
            if (d10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p4.k.a("childAtomSize must be positive", z10);
            if (wVar.d() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < d10) {
                    wVar.E(i15);
                    int d11 = wVar.d();
                    int d12 = wVar.d();
                    if (d12 == 1718775137) {
                        num2 = Integer.valueOf(wVar.d());
                    } else if (d12 == 1935894637) {
                        wVar.F(4);
                        str = wVar.q(4);
                    } else if (d12 == 1935894633) {
                        i17 = i15;
                        i16 = d11;
                    }
                    i15 += d11;
                }
                if (!com.anythink.expressad.exoplayer.b.f7295bd.equals(str) && !com.anythink.expressad.exoplayer.b.be.equals(str) && !com.anythink.expressad.exoplayer.b.bf.equals(str) && !com.anythink.expressad.exoplayer.b.bg.equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p4.k.a("frma atom is mandatory", z11);
                    if (i17 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    p4.k.a("schi atom is mandatory", z12);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 < i16) {
                            wVar.E(i18);
                            int d13 = wVar.d();
                            if (wVar.d() == 1952804451) {
                                int d14 = (wVar.d() >> 24) & com.anythink.expressad.exoplayer.k.p.f9095b;
                                wVar.F(1);
                                if (d14 == 0) {
                                    wVar.F(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int t10 = wVar.t();
                                    int i19 = (t10 & 240) >> 4;
                                    i12 = t10 & 15;
                                    i13 = i19;
                                }
                                if (wVar.t() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int t11 = wVar.t();
                                byte[] bArr2 = new byte[16];
                                wVar.b(bArr2, 0, 16);
                                if (z13 && t11 == 0) {
                                    int t12 = wVar.t();
                                    byte[] bArr3 = new byte[t12];
                                    wVar.b(bArr3, 0, t12);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                lVar = new l(z13, str, t11, bArr2, i13, i12, bArr);
                            } else {
                                i18 += d13;
                            }
                        } else {
                            num = num2;
                            lVar = null;
                            break;
                        }
                    }
                    if (lVar == null) {
                        z14 = false;
                    }
                    p4.k.a("tenc atom is mandatory", z14);
                    int i20 = g0.f27302a;
                    create = Pair.create(num, lVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += d10;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:370:0x0b02, code lost:
    
        if (r19 == null) goto L546;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x4.b.d d(d6.w r44, int r45, int r46, java.lang.String r47, com.google.android.exoplayer2.drm.DrmInitData r48, boolean r49) throws k4.z0 {
        /*
            Method dump skipped, instructions count: 2887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.b.d(d6.w, int, int, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData, boolean):x4.b$d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0874 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(x4.a.C0507a r42, p4.q r43, long r44, com.google.android.exoplayer2.drm.DrmInitData r46, boolean r47, boolean r48, i7.d r49) throws k4.z0 {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.b.e(x4.a$a, p4.q, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, i7.d):java.util.ArrayList");
    }
}
