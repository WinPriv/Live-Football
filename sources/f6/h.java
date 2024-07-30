package f6;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import d6.c0;
import d6.g0;
import d6.l;
import d6.p;
import d6.w;
import e6.i;
import f6.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.i0;

/* compiled from: SceneRenderer.java */
/* loaded from: classes2.dex */
public final class h implements i, a {
    public int A;
    public SurfaceTexture B;
    public byte[] E;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f28139s = new AtomicBoolean();

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f28140t = new AtomicBoolean(true);

    /* renamed from: u, reason: collision with root package name */
    public final f f28141u = new f();

    /* renamed from: v, reason: collision with root package name */
    public final c f28142v = new c();

    /* renamed from: w, reason: collision with root package name */
    public final c0<Long> f28143w = new c0<>();

    /* renamed from: x, reason: collision with root package name */
    public final c0<d> f28144x = new c0<>();
    public final float[] y = new float[16];

    /* renamed from: z, reason: collision with root package name */
    public final float[] f28145z = new float[16];
    public volatile int C = 0;
    public int D = -1;

    @Override // f6.a
    public final void a(long j10, float[] fArr) {
        this.f28142v.f28113c.a(j10, fArr);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            l.b();
            this.f28141u.a();
            l.b();
            l.c("No current context", !g0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            l.b();
            int i10 = iArr[0];
            l.a(36197, i10);
            this.A = i10;
        } catch (l.a e10) {
            p.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.A);
        this.B = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: f6.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                h.this.f28139s.set(true);
            }
        });
        return this.B;
    }

    @Override // f6.a
    public final void c() {
        this.f28143w.b();
        c cVar = this.f28142v;
        cVar.f28113c.b();
        cVar.f28114d = false;
        this.f28140t.set(true);
    }

    @Override // e6.i
    public final void d(long j10, long j11, i0 i0Var, MediaFormat mediaFormat) {
        float f;
        float f10;
        int i10;
        int i11;
        int i12;
        ArrayList<d.a> arrayList;
        boolean z10;
        this.f28143w.a(j11, Long.valueOf(j10));
        byte[] bArr = i0Var.N;
        int i13 = i0Var.O;
        byte[] bArr2 = this.E;
        int i14 = this.D;
        this.E = bArr;
        if (i13 == -1) {
            i13 = this.C;
        }
        this.D = i13;
        if (i14 != i13 || !Arrays.equals(bArr2, this.E)) {
            byte[] bArr3 = this.E;
            d dVar = null;
            if (bArr3 != null) {
                int i15 = this.D;
                w wVar = new w(bArr3);
                try {
                    wVar.F(4);
                    int d10 = wVar.d();
                    wVar.E(0);
                    if (d10 == 1886547818) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (z10) {
                    wVar.F(8);
                    int i16 = wVar.f27385b;
                    int i17 = wVar.f27386c;
                    while (i16 < i17) {
                        int d11 = wVar.d() + i16;
                        if (d11 <= i16 || d11 > i17) {
                            break;
                        }
                        int d12 = wVar.d();
                        if (d12 != 2037673328 && d12 != 1836279920) {
                            wVar.E(d11);
                            i16 = d11;
                        }
                        wVar.D(d11);
                        arrayList = e.a(wVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = e.a(wVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            dVar = new d(arrayList.get(0), arrayList.get(1), i15);
                        }
                    } else {
                        d.a aVar = arrayList.get(0);
                        dVar = new d(aVar, aVar, i15);
                    }
                }
            }
            if (dVar == null || !f.b(dVar)) {
                int i18 = this.D;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f11 = radians / 36;
                float f12 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                for (int i22 = 36; i19 < i22; i22 = 36) {
                    float f13 = radians / 2.0f;
                    float f14 = (i19 * f11) - f13;
                    int i23 = i19 + 1;
                    float f15 = (i23 * f11) - f13;
                    int i24 = 0;
                    while (i24 < 73) {
                        int i25 = i23;
                        int i26 = 0;
                        int i27 = 2;
                        while (i26 < i27) {
                            if (i26 == 0) {
                                f10 = f15;
                                f = f14;
                            } else {
                                f = f15;
                                f10 = f;
                            }
                            float f16 = i24 * f12;
                            float f17 = f14;
                            int i28 = i20 + 1;
                            float f18 = f12;
                            double d13 = 50.0f;
                            int i29 = i24;
                            double d14 = (f16 + 3.1415927f) - (radians2 / 2.0f);
                            float f19 = f11;
                            double d15 = f;
                            int i30 = i18;
                            int i31 = i26;
                            fArr[i20] = -((float) (Math.cos(d15) * Math.sin(d14) * d13));
                            int i32 = i28 + 1;
                            fArr[i28] = (float) (Math.sin(d15) * d13);
                            int i33 = i32 + 1;
                            fArr[i32] = (float) (Math.cos(d15) * Math.cos(d14) * d13);
                            int i34 = i21 + 1;
                            fArr2[i21] = f16 / radians2;
                            int i35 = i34 + 1;
                            fArr2[i34] = ((i19 + i31) * f19) / radians;
                            if (i29 == 0 && i31 == 0) {
                                i10 = i29;
                                i11 = i31;
                            } else {
                                i10 = i29;
                                i11 = i31;
                                if (i10 != 72 || i11 != 1) {
                                    i12 = 2;
                                    i21 = i35;
                                    i20 = i33;
                                    i26 = i11 + 1;
                                    i24 = i10;
                                    i27 = i12;
                                    f15 = f10;
                                    f12 = f18;
                                    f14 = f17;
                                    f11 = f19;
                                    i18 = i30;
                                }
                            }
                            System.arraycopy(fArr, i33 - 3, fArr, i33, 3);
                            i33 += 3;
                            i12 = 2;
                            System.arraycopy(fArr2, i35 - 2, fArr2, i35, 2);
                            i35 += 2;
                            i21 = i35;
                            i20 = i33;
                            i26 = i11 + 1;
                            i24 = i10;
                            i27 = i12;
                            f15 = f10;
                            f12 = f18;
                            f14 = f17;
                            f11 = f19;
                            i18 = i30;
                        }
                        i24++;
                        i23 = i25;
                        f14 = f14;
                        i18 = i18;
                    }
                    i19 = i23;
                }
                d.a aVar2 = new d.a(new d.b(0, fArr, fArr2, 1));
                dVar = new d(aVar2, aVar2, i18);
            }
            this.f28144x.a(j11, dVar);
        }
    }
}
