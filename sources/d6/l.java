package d6;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: GlUtil.java */
/* loaded from: classes2.dex */
public final class l {

    /* compiled from: GlUtil.java */
    /* loaded from: classes2.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a(int i10, int i11) throws a {
        GLES20.glBindTexture(i10, i11);
        b();
        GLES20.glTexParameteri(i10, 10240, 9729);
        b();
        GLES20.glTexParameteri(i10, 10241, 9729);
        b();
        GLES20.glTexParameteri(i10, 10242, 33071);
        b();
        GLES20.glTexParameteri(i10, 10243, 33071);
        b();
    }

    public static void b() throws a {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (!z10) {
        } else {
            throw new a(sb2.toString());
        }
    }

    public static void c(String str, boolean z10) throws a {
        if (z10) {
        } else {
            throw new a(str);
        }
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
