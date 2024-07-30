package f6;

import android.opengl.Matrix;
import d6.c0;

/* compiled from: FrameRotationQueue.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f28111a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f28112b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final c0<float[]> f28113c = new c0<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f28114d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f10 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f * f));
        float f11 = fArr2[10];
        fArr[0] = f11 / sqrt;
        float f12 = fArr2[8];
        fArr[2] = f12 / sqrt;
        fArr[8] = (-f12) / sqrt;
        fArr[10] = f11 / sqrt;
    }
}
