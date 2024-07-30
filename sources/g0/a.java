package g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: DrawableCompat.java */
    /* renamed from: g0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0385a {
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* compiled from: DrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f, float f10) {
            drawable.setHotspot(f, f10);
        }

        public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        public static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable, int i10) {
        b.g(drawable, i10);
    }

    public static void b(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void c(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }
}
