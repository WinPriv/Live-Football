package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class HG implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"z9B36ia8K97HBzV57KLXDd85kTgEaner", "3aEbZTsiYTNeQPGx5CoRWw5p4SOqn8nC", "5PMa1SoMa", "guUavSodluS4w7iQ4cz7Prb1cjHmnXlo", "XQ3ANa4mFiDaGBXMlUj6SSOG1DIaUNGv", "ErhkRazw76yMn4ImtPATzT0IKQLdiPcq", "XnCbYJqvwyyMfYlC7feovYHfzjJDJtnj", "doPidwKYaz8uB3zDPTURUN8nIU2BS0bC"};
    public static final int[] A08;

    @Nullable
    public SurfaceTexture A00;

    @Nullable
    public EGLContext A01;

    @Nullable
    public EGLDisplay A02;

    @Nullable
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-72, -70, -65, -106, -69, -62, -62, -58, -72, -106, -62, -63, -71, -68, -70, 115, -71, -76, -68, -65, -72, -73, -115, 115, -58, -56, -74, -74, -72, -58, -58, -112, 120, -75, Ascii.DEL, 115, -63, -56, -64, -106, -62, -63, -71, -68, -70, -58, -82, -125, -80, -112, 120, -73, Ascii.DEL, 115, -74, -62, -63, -71, -68, -70, -58, -82, -125, -80, -112, 120, -58, -34, -32, -27, -68, -21, -34, -38, -19, -34, -68, -24, -25, -19, -34, -15, -19, -103, -33, -38, -30, -27, -34, -35, 41, 43, 48, 7, 54, 41, 37, 56, 41, Ascii.DC4, 38, 57, 42, 42, 41, 54, Ascii.ETB, 57, 54, 42, 37, 39, 41, -28, 42, 37, 45, 48, 41, 40, -60, -58, -53, -90, -60, -45, -93, -56, -46, -49, -53, -64, -40, Ascii.DEL, -59, -64, -56, -53, -60, -61, Ascii.SYN, Ascii.CAN, Ascii.GS, -6, Ascii.US, Ascii.SUB, 37, Ascii.SUB, Ascii.DC2, Ascii.GS, Ascii.SUB, 43, Ascii.SYN, -47, Ascii.ETB, Ascii.DC2, Ascii.SUB, Ascii.GS, Ascii.SYN, Ascii.NAK, 32, 34, 39, 8, Ascii.FS, 38, 32, -2, 48, 45, 45, 32, 41, 47, -37, 33, Ascii.FS, 36, 39, 32, Ascii.US, -34, -29, -66, -36, -27, -53, -36, -17, -21, -20, -23, -36, -22, -105, -35, -40, -32, -29, -36, -37, -91, -105, -68, -23, -23, -26, -23, -79, -105};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public HG(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new HE(C0940Hl.A0P(A04(0, 67, 11), Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr;
        if (i10 == 0) {
            iArr = new int[]{12440, 2, 12344};
            String[] strArr = A07;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "EHOXN3CdaNry4JqIO2ks6QCeQvbsrD6f";
            strArr2[4] = "WDbRDXwqXlaltRYbtKhuIsPK10OvfLD5";
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new HE(A04(67, 23, 49));
    }

    public static EGLDisplay A02() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new HE(A04(120, 20, 23));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new HE(A04(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 20, 105));
        }
        return eglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        int[] pbufferAttributes;
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eglCreatePbufferSurface == null) {
                throw new HE(A04(90, 30, 124));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            throw new HE(A04(160, 21, 115));
        }
        return eglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new HE(A04(181, 29, 47) + Integer.toHexString(glGetError));
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) H6.A01(this.A00);
    }

    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            EGLDisplay eGLDisplay = this.A02;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.A03;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext = this.A01;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.A02, eGLContext);
            }
            if (C0940Hl.A02 >= 19) {
                EGL14.eglReleaseThread();
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay2 = this.A02;
            if (eGLDisplay2 != null) {
                boolean equals = eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY);
                String[] strArr = A07;
                if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[0] = "cZVWzEhLkZEIrP1qq5upinuo09zsB0MT";
                strArr2[4] = "G9lsUv66nQNsakaGFa7QtvfOykR85q9q";
                if (!equals) {
                    EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
            }
            EGLSurface eGLSurface2 = this.A03;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext2 = this.A01;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.A02, eGLContext2);
            }
            if (C0940Hl.A02 >= 19) {
                EGL14.eglReleaseThread();
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
            throw th;
        }
    }

    public final void A09(int i10) {
        this.A02 = A02();
        EGLConfig A00 = A00(this.A02);
        this.A01 = A01(this.A02, A00, i10);
        this.A03 = A03(this.A02, A00, this.A01, i10);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
