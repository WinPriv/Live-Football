package com.applovin.exoplayer2.m;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.huawei.hms.ads.gl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class i extends GLSurfaceView implements k {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f16493s = 0;

    /* renamed from: a, reason: collision with root package name */
    private final a f16494a;

    public void setOutputBuffer(j jVar) {
        this.f16494a.a(jVar);
    }

    /* loaded from: classes.dex */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: a, reason: collision with root package name */
        private static final float[] f16495a = {1.164f, 1.164f, 1.164f, gl.Code, -0.392f, 2.017f, 1.596f, -0.813f, gl.Code};

        /* renamed from: b, reason: collision with root package name */
        private static final float[] f16496b = {1.164f, 1.164f, 1.164f, gl.Code, -0.213f, 2.112f, 1.793f, -0.533f, gl.Code};

        /* renamed from: c, reason: collision with root package name */
        private static final float[] f16497c = {1.168f, 1.168f, 1.168f, gl.Code, -0.188f, 2.148f, 1.683f, -0.652f, gl.Code};

        /* renamed from: d, reason: collision with root package name */
        private static final String[] f16498d = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: e, reason: collision with root package name */
        private static final FloatBuffer f16499e = com.applovin.exoplayer2.l.n.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final GLSurfaceView f;

        /* renamed from: g, reason: collision with root package name */
        private final int[] f16500g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f16501h;

        /* renamed from: i, reason: collision with root package name */
        private final int[] f16502i;

        /* renamed from: j, reason: collision with root package name */
        private final int[] f16503j;

        /* renamed from: k, reason: collision with root package name */
        private final AtomicReference<j> f16504k;

        /* renamed from: l, reason: collision with root package name */
        private final FloatBuffer[] f16505l;

        /* renamed from: m, reason: collision with root package name */
        private int f16506m;

        /* renamed from: n, reason: collision with root package name */
        private int f16507n;
        private j o;

        public void a(j jVar) {
            j andSet = this.f16504k.getAndSet(jVar);
            if (andSet != null) {
                andSet.f();
            }
            this.f.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            boolean z10;
            int i10;
            j andSet = this.f16504k.getAndSet(null);
            if (andSet == null && this.o == null) {
                return;
            }
            if (andSet != null) {
                j jVar = this.o;
                if (jVar != null) {
                    jVar.f();
                }
                this.o = andSet;
            }
            j jVar2 = (j) com.applovin.exoplayer2.l.a.b(this.o);
            float[] fArr = f16496b;
            int i11 = jVar2.f16511g;
            if (i11 != 1) {
                if (i11 == 3) {
                    fArr = f16497c;
                }
            } else {
                fArr = f16495a;
            }
            GLES20.glUniformMatrix3fv(this.f16507n, 1, false, fArr, 0);
            int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(jVar2.f);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) com.applovin.exoplayer2.l.a.b(jVar2.f16510e);
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 == 0) {
                    i10 = jVar2.f16509d;
                } else {
                    i10 = (jVar2.f16509d + 1) / 2;
                }
                GLES20.glActiveTexture(33984 + i12);
                GLES20.glBindTexture(3553, this.f16500g[i12]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i12], i10, 0, 6409, 5121, byteBufferArr[i12]);
            }
            int i13 = jVar2.f16508c;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f16502i[i15] != iArr2[i15] || this.f16503j[i15] != iArr[i15]) {
                    if (iArr[i15] != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z10);
                    float f = iArr2[i15] / iArr[i15];
                    this.f16505l[i15] = com.applovin.exoplayer2.l.n.a(new float[]{gl.Code, gl.Code, gl.Code, 1.0f, f, gl.Code, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.f16501h[i15], 2, 5126, false, 0, (Buffer) this.f16505l[i15]);
                    this.f16502i[i15] = iArr2[i15];
                    this.f16503j[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            com.applovin.exoplayer2.l.n.b();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int a10 = com.applovin.exoplayer2.l.n.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f16506m = a10;
            GLES20.glUseProgram(a10);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f16506m, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f16499e);
            this.f16501h[0] = GLES20.glGetAttribLocation(this.f16506m, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f16501h[0]);
            this.f16501h[1] = GLES20.glGetAttribLocation(this.f16506m, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f16501h[1]);
            this.f16501h[2] = GLES20.glGetAttribLocation(this.f16506m, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f16501h[2]);
            com.applovin.exoplayer2.l.n.b();
            this.f16507n = GLES20.glGetUniformLocation(this.f16506m, "mColorConversion");
            com.applovin.exoplayer2.l.n.b();
            a();
            com.applovin.exoplayer2.l.n.b();
        }

        private void a() {
            GLES20.glGenTextures(3, this.f16500g, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f16506m, f16498d[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f16500g[i10]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            com.applovin.exoplayer2.l.n.b();
        }
    }

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
