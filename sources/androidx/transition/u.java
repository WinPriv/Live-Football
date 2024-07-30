package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final y f2496a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f2497b;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(u.f2496a.Z0(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float floatValue = f.floatValue();
            u.f2496a.a1(view, floatValue);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            return c0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
            c0.f.c(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2496a = new z();
        } else {
            f2496a = new y();
        }
        f2497b = new a();
        new b();
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f2496a.d1(view, i10, i11, i12, i13);
    }

    public static void b(int i10, View view) {
        f2496a.W0(i10, view);
    }
}
