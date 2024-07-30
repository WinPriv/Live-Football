package h6;

import a3.k;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AnimationUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f28768a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final z0.b f28769b = new z0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final z0.a f28770c = new z0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final z0.c f28771d = new z0.c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f28772e = new DecelerateInterpolator();

    public static float a(float f, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f;
        }
        if (f13 >= f12) {
            return f10;
        }
        return k.d(f10, f, (f13 - f11) / (f12 - f11), f);
    }

    public static int b(float f, int i10, int i11) {
        return Math.round(f * (i11 - i10)) + i10;
    }
}
