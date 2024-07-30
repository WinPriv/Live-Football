package e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f27633a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f27634b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f27635c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f27636a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f27637b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27638c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f27636a = colorStateList;
            this.f27637b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f27638c = hashCode;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f27639a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f27640b;

        public d(Resources resources, Resources.Theme theme) {
            this.f27639a = resources;
            this.f27640b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f27639a.equals(dVar.f27639a) && m0.b.a(this.f27640b, dVar.f27640b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return m0.b.b(this.f27639a, this.f27640b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public final void a(int i10) {
            new Handler(Looper.getMainLooper()).post(new h(i10, 0, this));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new g(0, this, typeface));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(int i10, Context context) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, e0.f.e r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.f.b(android.content.Context, int, android.util.TypedValue, int, e0.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
