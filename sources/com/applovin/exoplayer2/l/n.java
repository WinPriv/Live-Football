package com.applovin.exoplayer2.l;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f16314a = false;

    /* loaded from: classes.dex */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static boolean a(Context context) {
        String eglQueryString;
        int i10 = ai.f16274a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(ai.f16276c) || "XT1650".equals(ai.f16277d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static void b() {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            q.d("GlUtil", "glError " + GLU.gluErrorString(glGetError));
            i10 = glGetError;
        }
        if (i10 != 0) {
            a("glError " + GLU.gluErrorString(i10));
        }
    }

    public static boolean a() {
        String eglQueryString;
        return ai.f16274a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static int a(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        b();
        return glCreateProgram;
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) a(fArr.length).put(fArr).flip();
    }

    public static FloatBuffer a(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    private static void a(int i10, String str, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            a(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        b();
    }

    private static void a(String str) {
        q.d("GlUtil", str);
        if (f16314a) {
            throw new a(str);
        }
    }
}
