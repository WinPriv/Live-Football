package com.facebook.ads.internal.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.X.C0940Hl;
import com.facebook.ads.redexgen.X.H6;
import com.facebook.ads.redexgen.X.HandlerThreadC0945Hr;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC0945Hr A02;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-29, -27, -22, -3, -29, -10, -14, -3, Ascii.SO, Ascii.DLE, Ascii.CR, Ascii.DC2, 3, 1, Ascii.DC2, 3, 2, -3, 1, Ascii.CR, Ascii.FF, Ascii.DC2, 3, Ascii.FF, Ascii.DC2, -101, -99, -94, -75, -95, -98, -88, -75, -55, -53, -56, -68, -73, -71, -69, -62, -69, -55, -55, -75, -71, -59, -60, -54, -69, -50, -54, -81, -56, -51, -49, -54, -54, -55, -52, -50, -65, -66, 122, -54, -52, -61, -55, -52, 122, -50, -55, 122, -101, -86, -93, 122, -58, -65, -48, -65, -58, 122, -117, -111, Ascii.NAK, 17, -18, -13, -14, -19, -65, -52, -62, -48, -51, -57, -62, -116, -58, -65, -48, -62, -43, -65, -48, -61, -116, -44, -48, -116, -58, -57, -59, -58, -67, -50, -61, -48, -60, -51, -48, -53, -65, -52, -63, -61, -57, -75, -63, -57, -55, -62, -69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z10;
        synchronized (DummySurface.class) {
            z10 = true;
            if (!A04) {
                A03 = C0940Hl.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public DummySurface(HandlerThreadC0945Hr handlerThreadC0945Hr, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.A02 = handlerThreadC0945Hr;
        this.A01 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (A02(85, 6, 113).equals(com.facebook.ads.redexgen.X.C0940Hl.A06) != false) goto L8;
     */
    @android.annotation.TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r6) {
        /*
            int r0 = com.facebook.ads.redexgen.X.C0940Hl.A02
            r5 = 26
            r4 = 0
            if (r0 >= r5) goto L2a
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0940Hl.A05
            r2 = 127(0x7f, float:1.78E-43)
            r1 = 7
            r0 = 8
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L29
            java.lang.String r3 = com.facebook.ads.redexgen.X.C0940Hl.A06
            r2 = 85
            r1 = 6
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2a
        L29:
            return r4
        L2a:
            int r0 = com.facebook.ads.redexgen.X.C0940Hl.A02
            if (r0 >= r5) goto L43
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            r2 = 91
            r1 = 36
            r0 = 18
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.hasSystemFeature(r0)
            if (r0 != 0) goto L43
            return r4
        L43:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r4)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r3 = android.opengl.EGL14.eglQueryString(r1, r0)
            if (r3 != 0) goto L50
            return r4
        L50:
            r2 = 0
            r1 = 25
            r0 = 82
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L60
            return r4
        L60:
            r2 = 25
            r1 = 27
            r0 = 10
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L72
            r0 = 1
        L71:
            return r0
        L72:
            r0 = 2
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.video.DummySurface.A00(android.content.Context):int");
    }

    public static DummySurface A01(Context context, boolean z10) {
        A03();
        H6.A04(!z10 || A05(context));
        return new HandlerThreadC0945Hr().A04(z10 ? A03 : 0);
    }

    public static void A03() {
        if (C0940Hl.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 14));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
