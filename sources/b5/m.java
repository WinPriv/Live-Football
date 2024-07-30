package b5;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d6.g0;
import k4.i0;

/* compiled from: MediaCodecInfo.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f2945a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2947c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f2948d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2949e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2950g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2951h;

    /* compiled from: MediaCodecInfo.java */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(android.media.MediaCodecInfo.VideoCapabilities r4, int r5, int r6, double r7) {
            /*
                java.util.List r4 = r4.getSupportedPerformancePoints()
                r0 = 0
                if (r4 == 0) goto L5f
                boolean r1 = r4.isEmpty()
                if (r1 != 0) goto L5f
                java.lang.String r1 = d6.g0.f27303b
                java.lang.String r2 = "sabrina"
                boolean r2 = r1.equals(r2)
                r3 = 1
                if (r2 != 0) goto L3d
                java.lang.String r2 = "boreal"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3d
                java.lang.String r1 = d6.g0.f27305d
                java.lang.String r2 = "Lenovo TB-X605"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L3d
                java.lang.String r2 = "Lenovo TB-X606"
                boolean r2 = r1.startsWith(r2)
                if (r2 != 0) goto L3d
                java.lang.String r2 = "Lenovo TB-X616"
                boolean r1 = r1.startsWith(r2)
                if (r1 == 0) goto L3b
                goto L3d
            L3b:
                r1 = r0
                goto L3e
            L3d:
                r1 = r3
            L3e:
                if (r1 == 0) goto L41
                goto L5f
            L41:
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
                int r7 = (int) r7
                r1.<init>(r5, r6, r7)
            L47:
                int r5 = r4.size()
                if (r0 >= r5) goto L5e
                java.lang.Object r5 = r4.get(r0)
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = (android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) r5
                boolean r5 = r5.covers(r1)
                if (r5 == 0) goto L5b
                r4 = 2
                return r4
            L5b:
                int r0 = r0 + 1
                goto L47
            L5e:
                return r3
            L5f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.m.a.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
        }
    }

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f2945a = str;
        this.f2946b = str2;
        this.f2947c = str3;
        this.f2948d = codecCapabilities;
        this.f2950g = z10;
        this.f2949e = z11;
        this.f = z12;
        this.f2951h = d6.r.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = g0.f27302a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (d6.g0.f27302a < 21) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r11.isFeatureSupported("secure-playback") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r15 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b5.m h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            b5.m r13 = new b5.m
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L46
            int r1 = d6.g0.f27302a
            r2 = 19
            if (r1 < r2) goto L16
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L16
            r2 = r14
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 == 0) goto L46
            r2 = 22
            if (r1 > r2) goto L41
            java.lang.String r1 = d6.g0.f27305d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L41
        L2f:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L41
        L3f:
            r1 = r14
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L46
            r6 = r14
            goto L47
        L46:
            r6 = r0
        L47:
            r1 = 21
            if (r11 == 0) goto L5a
            int r2 = d6.g0.f27302a
            if (r2 < r1) goto L59
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L59
            r2 = r14
            goto L5a
        L59:
            r2 = r0
        L5a:
            if (r15 != 0) goto L72
            if (r11 == 0) goto L70
            int r15 = d6.g0.f27302a
            if (r15 < r1) goto L6c
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L6c
            r15 = r14
            goto L6d
        L6c:
            r15 = r0
        L6d:
            if (r15 == 0) goto L70
            goto L72
        L70:
            r7 = r0
            goto L73
        L72:
            r7 = r14
        L73:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):b5.m");
    }

    public final n4.i b(i0 i0Var, i0 i0Var2) {
        int i10;
        int i11;
        boolean z10 = false;
        if (!g0.a(i0Var.D, i0Var2.D)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.f2951h) {
            if (i0Var.L != i0Var2.L) {
                i10 |= 1024;
            }
            if (!this.f2949e && (i0Var.I != i0Var2.I || i0Var.J != i0Var2.J)) {
                i10 |= 512;
            }
            if (!g0.a(i0Var.P, i0Var2.P)) {
                i10 |= 2048;
            }
            if (g0.f27305d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f2945a)) {
                z10 = true;
            }
            if (z10 && !i0Var.c(i0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str = this.f2945a;
                if (i0Var.c(i0Var2)) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
                return new n4.i(str, i0Var, i0Var2, i11, 0);
            }
        } else {
            if (i0Var.Q != i0Var2.Q) {
                i10 |= 4096;
            }
            if (i0Var.R != i0Var2.R) {
                i10 |= 8192;
            }
            if (i0Var.S != i0Var2.S) {
                i10 |= 16384;
            }
            String str2 = this.f2946b;
            if (i10 == 0 && com.anythink.expressad.exoplayer.k.o.f9083r.equals(str2)) {
                Pair<Integer, Integer> d10 = q.d(i0Var);
                Pair<Integer, Integer> d11 = q.d(i0Var2);
                if (d10 != null && d11 != null) {
                    int intValue = ((Integer) d10.first).intValue();
                    int intValue2 = ((Integer) d11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new n4.i(this.f2945a, i0Var, i0Var2, 3, 0);
                    }
                }
            }
            if (!i0Var.c(i0Var2)) {
                i10 |= 32;
            }
            if (com.anythink.expressad.exoplayer.k.o.H.equals(str2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new n4.i(this.f2945a, i0Var, i0Var2, 1, 0);
            }
        }
        return new n4.i(this.f2945a, i0Var, i0Var2, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(k4.i0 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m.c(k4.i0, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(k4.i0 r10) throws b5.q.b {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m.d(k4.i0):boolean");
    }

    public final boolean e(i0 i0Var) {
        if (this.f2951h) {
            return this.f2949e;
        }
        Pair<Integer, Integer> d10 = q.d(i0Var);
        if (d10 != null && ((Integer) d10.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i10, int i11, double d10) {
        boolean z10;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2948d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (g0.f27302a >= 29) {
            int a10 = a.a(videoCapabilities, i10, i11, d10);
            if (a10 == 2) {
                return true;
            }
            if (a10 == 1) {
                StringBuilder r10 = a3.l.r("sizeAndRate.cover, ", i10, "x", i11, "@");
                r10.append(d10);
                g(r10.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f2945a;
                if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(g0.f27303b)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder r11 = a3.l.r("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    r11.append(d10);
                    StringBuilder o = a3.k.o("AssumedSupport [", r11.toString(), "] [", str, ", ");
                    o.append(this.f2946b);
                    o.append("] [");
                    o.append(g0.f27306e);
                    o.append("]");
                    d6.p.b(com.anythink.expressad.exoplayer.f.a.f7971a, o.toString());
                }
            }
            StringBuilder r12 = a3.l.r("sizeAndRate.support, ", i10, "x", i11, "@");
            r12.append(d10);
            g(r12.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder s10 = a3.l.s("NoSupport [", str, "] [");
        s10.append(this.f2945a);
        s10.append(", ");
        s10.append(this.f2946b);
        s10.append("] [");
        s10.append(g0.f27306e);
        s10.append("]");
        d6.p.b(com.anythink.expressad.exoplayer.f.a.f7971a, s10.toString());
    }

    public final String toString() {
        return this.f2945a;
    }
}
