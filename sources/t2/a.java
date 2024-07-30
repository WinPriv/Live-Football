package t2;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import com.huawei.hms.ads.gl;
import g2.h;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h f35378a;

    /* renamed from: b, reason: collision with root package name */
    public final T f35379b;

    /* renamed from: c, reason: collision with root package name */
    public T f35380c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f35381d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f35382e;
    public final Interpolator f;

    /* renamed from: g, reason: collision with root package name */
    public final float f35383g;

    /* renamed from: h, reason: collision with root package name */
    public Float f35384h;

    /* renamed from: i, reason: collision with root package name */
    public float f35385i;

    /* renamed from: j, reason: collision with root package name */
    public float f35386j;

    /* renamed from: k, reason: collision with root package name */
    public int f35387k;

    /* renamed from: l, reason: collision with root package name */
    public int f35388l;

    /* renamed from: m, reason: collision with root package name */
    public float f35389m;

    /* renamed from: n, reason: collision with root package name */
    public float f35390n;
    public PointF o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f35391p;

    /* JADX WARN: Multi-variable type inference failed */
    public a(h hVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f10) {
        this.f35385i = -3987645.8f;
        this.f35386j = -3987645.8f;
        this.f35387k = 784923401;
        this.f35388l = 784923401;
        this.f35389m = Float.MIN_VALUE;
        this.f35390n = Float.MIN_VALUE;
        this.o = null;
        this.f35391p = null;
        this.f35378a = hVar;
        this.f35379b = obj;
        this.f35380c = obj2;
        this.f35381d = baseInterpolator;
        this.f35382e = null;
        this.f = null;
        this.f35383g = f;
        this.f35384h = f10;
    }

    public final float a() {
        h hVar = this.f35378a;
        if (hVar == null) {
            return 1.0f;
        }
        if (this.f35390n == Float.MIN_VALUE) {
            if (this.f35384h == null) {
                this.f35390n = 1.0f;
            } else {
                this.f35390n = ((this.f35384h.floatValue() - this.f35383g) / (hVar.f28416l - hVar.f28415k)) + b();
            }
        }
        return this.f35390n;
    }

    public final float b() {
        h hVar = this.f35378a;
        if (hVar == null) {
            return gl.Code;
        }
        if (this.f35389m == Float.MIN_VALUE) {
            float f = hVar.f28415k;
            this.f35389m = (this.f35383g - f) / (hVar.f28416l - f);
        }
        return this.f35389m;
    }

    public final boolean c() {
        if (this.f35381d == null && this.f35382e == null && this.f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f35379b + ", endValue=" + this.f35380c + ", startFrame=" + this.f35383g + ", endFrame=" + this.f35384h + ", interpolator=" + this.f35381d + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(h hVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.f35385i = -3987645.8f;
        this.f35386j = -3987645.8f;
        this.f35387k = 784923401;
        this.f35388l = 784923401;
        this.f35389m = Float.MIN_VALUE;
        this.f35390n = Float.MIN_VALUE;
        this.o = null;
        this.f35391p = null;
        this.f35378a = hVar;
        this.f35379b = obj;
        this.f35380c = obj2;
        this.f35381d = null;
        this.f35382e = baseInterpolator;
        this.f = baseInterpolator2;
        this.f35383g = f;
        this.f35384h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(h hVar, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f10) {
        this.f35385i = -3987645.8f;
        this.f35386j = -3987645.8f;
        this.f35387k = 784923401;
        this.f35388l = 784923401;
        this.f35389m = Float.MIN_VALUE;
        this.f35390n = Float.MIN_VALUE;
        this.o = null;
        this.f35391p = null;
        this.f35378a = hVar;
        this.f35379b = pointF;
        this.f35380c = pointF2;
        this.f35381d = interpolator;
        this.f35382e = interpolator2;
        this.f = interpolator3;
        this.f35383g = f;
        this.f35384h = f10;
    }

    public a(T t10) {
        this.f35385i = -3987645.8f;
        this.f35386j = -3987645.8f;
        this.f35387k = 784923401;
        this.f35388l = 784923401;
        this.f35389m = Float.MIN_VALUE;
        this.f35390n = Float.MIN_VALUE;
        this.o = null;
        this.f35391p = null;
        this.f35378a = null;
        this.f35379b = t10;
        this.f35380c = t10;
        this.f35381d = null;
        this.f35382e = null;
        this.f = null;
        this.f35383g = Float.MIN_VALUE;
        this.f35384h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(n2.c cVar, n2.c cVar2) {
        this.f35385i = -3987645.8f;
        this.f35386j = -3987645.8f;
        this.f35387k = 784923401;
        this.f35388l = 784923401;
        this.f35389m = Float.MIN_VALUE;
        this.f35390n = Float.MIN_VALUE;
        this.o = null;
        this.f35391p = null;
        this.f35378a = null;
        this.f35379b = cVar;
        this.f35380c = cVar2;
        this.f35381d = null;
        this.f35382e = null;
        this.f = null;
        this.f35383g = Float.MIN_VALUE;
        this.f35384h = Float.valueOf(Float.MAX_VALUE);
    }
}
