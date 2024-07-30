package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.huawei.hms.ads.gl;
import d6.l;
import e6.h;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import n4.k;

/* loaded from: classes2.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements h {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f20387t = 0;

    /* renamed from: s, reason: collision with root package name */
    public final a f20388s;

    /* loaded from: classes2.dex */
    public static final class a implements GLSurfaceView.Renderer {
        public static final float[] B = {1.164f, 1.164f, 1.164f, gl.Code, -0.213f, 2.112f, 1.793f, -0.533f, gl.Code};
        public static final String[] C = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer D = l.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public k A;

        /* renamed from: s, reason: collision with root package name */
        public final GLSurfaceView f20389s;

        /* renamed from: t, reason: collision with root package name */
        public final int[] f20390t = new int[3];

        /* renamed from: u, reason: collision with root package name */
        public final int[] f20391u = new int[3];

        /* renamed from: v, reason: collision with root package name */
        public final int[] f20392v = new int[3];

        /* renamed from: w, reason: collision with root package name */
        public final int[] f20393w = new int[3];

        /* renamed from: x, reason: collision with root package name */
        public final AtomicReference<k> f20394x = new AtomicReference<>();
        public d6.k y;

        /* renamed from: z, reason: collision with root package name */
        public int f20395z;

        public a(GLSurfaceView gLSurfaceView) {
            this.f20389s = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f20392v;
                this.f20393w[i10] = -1;
                iArr[i10] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            k andSet = this.f20394x.getAndSet(null);
            if (andSet == null && this.A == null) {
                return;
            }
            if (andSet != null) {
                k kVar = this.A;
                if (kVar != null) {
                    kVar.getClass();
                    throw null;
                }
                this.A = andSet;
            }
            this.A.getClass();
            GLES20.glUniformMatrix3fv(this.f20395z, 1, false, B, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f20391u;
            try {
                d6.k kVar = new d6.k("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.y = kVar;
                GLES20.glVertexAttribPointer(kVar.b("in_pos"), 2, 5126, false, 0, (Buffer) D);
                iArr[0] = this.y.b("in_tc_y");
                iArr[1] = this.y.b("in_tc_u");
                iArr[2] = this.y.b("in_tc_v");
                this.f20395z = GLES20.glGetUniformLocation(this.y.f27324a, "mColorConversion");
                l.b();
                int[] iArr2 = this.f20390t;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i10 = 0; i10 < 3; i10++) {
                        d6.k kVar2 = this.y;
                        GLES20.glUniform1i(GLES20.glGetUniformLocation(kVar2.f27324a, C[i10]), i10);
                        GLES20.glActiveTexture(33984 + i10);
                        l.a(3553, iArr2[i10]);
                    }
                    l.b();
                } catch (l.a e10) {
                    Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
                }
                l.b();
            } catch (l.a e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.f20388s = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(k kVar) {
        a aVar = this.f20388s;
        if (aVar.f20394x.getAndSet(kVar) == null) {
            aVar.f20389s.requestRender();
            return;
        }
        throw null;
    }

    @Deprecated
    public h getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
