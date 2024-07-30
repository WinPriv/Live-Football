package l2;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f32317a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f32318b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f32319c;

    public a() {
        this.f32317a = new PointF();
        this.f32318b = new PointF();
        this.f32319c = new PointF();
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        PointF pointF = this.f32319c;
        PointF pointF2 = this.f32317a;
        PointF pointF3 = this.f32318b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(pointF.x), Float.valueOf(pointF.y), Float.valueOf(pointF2.x), Float.valueOf(pointF2.y), Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f32317a = pointF;
        this.f32318b = pointF2;
        this.f32319c = pointF3;
    }
}
