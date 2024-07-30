package p;

import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f34227a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34228b = 0;

    public static float a(float f, float f10, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f34227a) * f10) + (f * 1.5f));
        }
        return f * 1.5f;
    }
}
