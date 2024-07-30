package f6;

import android.opengl.GLES20;
import android.util.Log;
import com.huawei.hms.ads.gl;
import d6.k;
import d6.l;
import f6.d;
import java.nio.FloatBuffer;

/* compiled from: ProjectionRenderer.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f28124i = {1.0f, gl.Code, gl.Code, gl.Code, -1.0f, gl.Code, gl.Code, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f28125j = {1.0f, gl.Code, gl.Code, gl.Code, -0.5f, gl.Code, gl.Code, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f28126k = {0.5f, gl.Code, gl.Code, gl.Code, -1.0f, gl.Code, gl.Code, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f28127a;

    /* renamed from: b, reason: collision with root package name */
    public a f28128b;

    /* renamed from: c, reason: collision with root package name */
    public k f28129c;

    /* renamed from: d, reason: collision with root package name */
    public int f28130d;

    /* renamed from: e, reason: collision with root package name */
    public int f28131e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f28132g;

    /* renamed from: h, reason: collision with root package name */
    public int f28133h;

    /* compiled from: ProjectionRenderer.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f28134a;

        /* renamed from: b, reason: collision with root package name */
        public final FloatBuffer f28135b;

        /* renamed from: c, reason: collision with root package name */
        public final FloatBuffer f28136c;

        /* renamed from: d, reason: collision with root package name */
        public final int f28137d;

        public a(d.b bVar) {
            float[] fArr = bVar.f28122c;
            this.f28134a = fArr.length / 3;
            this.f28135b = l.d(fArr);
            this.f28136c = l.d(bVar.f28123d);
            int i10 = bVar.f28121b;
            if (i10 != 1) {
                if (i10 != 2) {
                    this.f28137d = 4;
                    return;
                } else {
                    this.f28137d = 6;
                    return;
                }
            }
            this.f28137d = 5;
        }
    }

    public static boolean b(d dVar) {
        d.b[] bVarArr = dVar.f28115a.f28119a;
        if (bVarArr.length != 1 || bVarArr[0].f28120a != 0) {
            return false;
        }
        d.b[] bVarArr2 = dVar.f28116b.f28119a;
        if (bVarArr2.length != 1 || bVarArr2[0].f28120a != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        try {
            k kVar = new k("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f28129c = kVar;
            this.f28130d = GLES20.glGetUniformLocation(kVar.f27324a, "uMvpMatrix");
            this.f28131e = GLES20.glGetUniformLocation(this.f28129c.f27324a, "uTexMatrix");
            this.f = this.f28129c.b("aPosition");
            this.f28132g = this.f28129c.b("aTexCoords");
            this.f28133h = GLES20.glGetUniformLocation(this.f28129c.f27324a, "uTexture");
        } catch (l.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
