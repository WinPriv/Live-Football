package com.huawei.hms.ads;

import android.opengl.GLES20;
import java.nio.Buffer;

/* loaded from: classes2.dex */
public class ea {
    private int C;
    private int D;
    private int F;
    private int L;
    private int S;

    /* renamed from: a, reason: collision with root package name */
    private int f21630a;

    /* renamed from: b, reason: collision with root package name */
    private int f21631b;

    /* renamed from: c, reason: collision with root package name */
    private int f21632c;

    /* renamed from: d, reason: collision with root package name */
    private int f21633d = 36197;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f21634e = new float[9];
    private float[] f = {-0.00390625f, -0.00390625f, gl.Code, -0.00390625f, 0.00390625f, -0.00390625f, -0.00390625f, gl.Code, gl.Code, gl.Code, 0.00390625f, gl.Code, -0.00390625f, 0.00390625f, gl.Code, 0.00390625f, 0.00390625f, 0.00390625f};

    /* renamed from: g, reason: collision with root package name */
    private float f21635g;

    public ea() {
        int I = I();
        this.C = I;
        if (I != 0) {
            B();
            if (this.D < 0) {
                this.D = -1;
                this.L = -1;
                this.f21630a = -1;
                return;
            }
            Z();
            return;
        }
        throw new IllegalStateException("fail to create program");
    }

    private void B() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.C, "positionLocation");
        this.f21631b = glGetAttribLocation;
        Code(glGetAttribLocation, "positionLocation");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.C, "textureCoordLocation");
        this.f21632c = glGetAttribLocation2;
        Code(glGetAttribLocation2, "textureCoordLocation");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.C, "matrixLocation");
        this.S = glGetUniformLocation;
        Code(glGetUniformLocation, "matrixLocation");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.C, "texMatrixLocation");
        this.F = glGetUniformLocation2;
        Code(glGetUniformLocation2, "texMatrixLocation");
        this.D = GLES20.glGetUniformLocation(this.C, "coreLocation");
    }

    private void C() {
        int i10 = this.D;
        if (i10 >= 0) {
            GLES20.glUniform1fv(i10, 9, this.f21634e, 0);
            GLES20.glUniform2fv(this.L, 9, this.f, 0);
            GLES20.glUniform1f(this.f21630a, this.f21635g);
        }
    }

    private static int Code(int i10, int i11) {
        int glCreateProgram = GLES20.glCreateProgram();
        Code("create program");
        if (glCreateProgram == 0) {
            ex.I("TexProgram", "fail not create program");
        }
        GLES20.glAttachShader(glCreateProgram, i10);
        Code("attach shader");
        GLES20.glAttachShader(glCreateProgram, i11);
        Code("attach shader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        ex.I("TexProgram", "fail to link");
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    private static int I() {
        int V;
        int V2 = V(35633, "uniform mat4 matrixLocation; uniform mat4 texMatrixLocation; attribute vec4 positionLocation; attribute vec4 textureCoordLocation; varying vec2 textureCoordination; void main() { gl_Position = matrixLocation * positionLocation; textureCoordination = (texMatrixLocation * textureCoordLocation).xy;}");
        if (V2 == 0 || (V = V(35632, "#extension GL_OES_EGL_image_external : require\n precision mediump float; varying vec2 textureCoordination; uniform samplerExternalOES sTexture; void main() {gl_FragColor = texture2D(sTexture, textureCoordination);}")) == 0) {
            return 0;
        }
        return Code(V2, V);
    }

    private void Z() {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.C, "textureOffsetLocation");
        this.L = glGetUniformLocation;
        Code(glGetUniformLocation, "textureOffsetLocation");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.C, "colorAdjustLocation");
        this.f21630a = glGetUniformLocation2;
        Code(glGetUniformLocation2, "colorAdjustLocation");
        System.arraycopy(new float[]{gl.Code, gl.Code, gl.Code, gl.Code, 1.0f, gl.Code, gl.Code, gl.Code, gl.Code}, 0, this.f21634e, 0, 9);
        this.f21635g = gl.Code;
    }

    public int V() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        Code("fail to generate texture");
        int i10 = iArr[0];
        GLES20.glBindTexture(this.f21633d, i10);
        Code("fail to bind texture ");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        Code("fail to create texture");
        return i10;
    }

    private void I(eb ebVar) {
        GLES20.glEnableVertexAttribArray(this.f21631b);
        Code("rv - 1");
        GLES20.glVertexAttribPointer(this.f21631b, ebVar.B(), 5126, false, ebVar.C(), (Buffer) ebVar.V());
        Code("rv - 2");
        GLES20.glEnableVertexAttribArray(this.f21632c);
        Code("rv - 3");
        GLES20.glVertexAttribPointer(this.f21632c, 2, 5126, false, ebVar.L(), (Buffer) ebVar.F());
        Code("rv - 4");
    }

    private static int V(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        Code("create shader " + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder n10 = a3.k.n("fail to compile shader: ", i10, " ");
        n10.append(GLES20.glGetShaderInfoLog(glCreateShader));
        ex.I("TexProgram", n10.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    private void Z(eb ebVar) {
        GLES20.glDrawArrays(5, ebVar.I(), ebVar.Z());
        Code("pr4 - 1");
        GLES20.glDisableVertexAttribArray(this.f21631b);
        GLES20.glDisableVertexAttribArray(this.f21632c);
        GLES20.glBindTexture(this.f21633d, 0);
        GLES20.glUseProgram(0);
    }

    public void Code() {
        try {
            GLES20.glDeleteProgram(this.C);
            this.C = -1;
        } catch (Throwable th) {
            ex.Code(5, "TexProgram", "release", th);
        }
    }

    public static void Code(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException(s.f.b("program fail to find ", str));
        }
    }

    private void V(eb ebVar) {
        GLES20.glUseProgram(this.C);
        Code("rtm - 1");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f21633d, ebVar.D());
        GLES20.glUniformMatrix4fv(this.S, 1, false, ebVar.Code(), 0);
        Code("rtm - 2");
        GLES20.glUniformMatrix4fv(this.F, 1, false, ebVar.S(), 0);
        Code("rtm - 3");
    }

    public void Code(eb ebVar) {
        Code("render - 1");
        V(ebVar);
        I(ebVar);
        C();
        Z(ebVar);
    }

    public static void Code(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " error: ");
        l10.append(Integer.toHexString(glGetError));
        String sb2 = l10.toString();
        ex.I("TexProgram", sb2);
        throw new IllegalStateException(sb2);
    }
}
