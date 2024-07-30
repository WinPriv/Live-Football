package a7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import com.anythink.expressad.exoplayer.k.p;

/* compiled from: RippleUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f352a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f353b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f354c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f355d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f356e = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f353b;
        return new ColorStateList(new int[][]{f355d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f354c), b(colorStateList, iArr), b(colorStateList, f352a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int i10;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i10 = 0;
        }
        return f0.a.c(i10, Math.min(Color.alpha(i10) * 2, p.f9095b));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f356e, 0)) != 0) {
                Log.w(f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
