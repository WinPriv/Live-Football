package d6;

import android.opengl.GLES20;
import d6.l;
import java.util.HashMap;

/* compiled from: GlProgram.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f27324a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f27325b;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f27326c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f27327d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f27328e;

    /* compiled from: GlProgram.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public a(String str) {
        }
    }

    /* compiled from: GlProgram.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public b(String str) {
        }
    }

    public k(String str, String str2) throws l.a {
        boolean z10;
        byte[] bArr;
        byte[] bArr2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f27324a = glCreateProgram;
        l.b();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int i10 = 1;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), z10);
        GLES20.glUseProgram(glCreateProgram);
        this.f27327d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f27325b = new a[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f27324a;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr3 = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr3, 0);
            int i14 = 0;
            while (true) {
                if (i14 < i13) {
                    bArr2 = bArr3;
                    if (bArr2[i14] == 0) {
                        break;
                    }
                    i14++;
                    bArr3 = bArr2;
                } else {
                    bArr2 = bArr3;
                    i14 = i13;
                    break;
                }
            }
            String str3 = new String(bArr2, 0, i14);
            GLES20.glGetAttribLocation(i12, str3);
            a aVar = new a(str3);
            this.f27325b[i11] = aVar;
            this.f27327d.put(str3, aVar);
            i11++;
            i10 = 1;
        }
        this.f27328e = new HashMap();
        int i15 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f27324a, 35718, iArr4, 0);
        this.f27326c = new b[iArr4[0]];
        int i16 = 0;
        while (i16 < iArr4[0]) {
            int i17 = this.f27324a;
            int[] iArr5 = new int[i15];
            GLES20.glGetProgramiv(i17, 35719, iArr5, 0);
            int i18 = iArr5[0];
            byte[] bArr4 = new byte[i18];
            GLES20.glGetActiveUniform(i17, i16, i18, new int[i15], 0, new int[i15], 0, new int[i15], 0, bArr4, 0);
            int i19 = 0;
            while (true) {
                if (i19 < i18) {
                    bArr = bArr4;
                    if (bArr[i19] == 0) {
                        break;
                    }
                    i19++;
                    bArr4 = bArr;
                } else {
                    bArr = bArr4;
                    i19 = i18;
                    break;
                }
            }
            String str4 = new String(bArr, 0, i19);
            GLES20.glGetUniformLocation(i17, str4);
            b bVar = new b(str4);
            this.f27326c[i16] = bVar;
            this.f27328e.put(str4, bVar);
            i16++;
            i15 = 1;
        }
        l.b();
    }

    public static void a(int i10, int i11, String str) throws l.a {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z10 = true;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            z10 = false;
        }
        l.c(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z10);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        l.b();
    }

    public final int b(String str) throws l.a {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f27324a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        l.b();
        return glGetAttribLocation;
    }
}
