package w6;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.huawei.hms.ads.gl;
import f0.d;
import z6.b;

/* compiled from: MotionUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static float a(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= gl.Code && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean b(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int c(Context context, int i10, int i11) {
        TypedValue a10 = b.a(i10, context);
        if (a10 != null && a10.type == 16) {
            return a10.data;
        }
        return i11;
    }

    public static TimeInterpolator d(Context context, int i10, Interpolator interpolator) {
        boolean z10;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!b(valueOf, "cubic-bezier") && !b(valueOf, "path")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (b(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return p0.a.b(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                }
                if (b(valueOf, "path")) {
                    return p0.a.c(d.d(valueOf.substring(5, valueOf.length() - 1)));
                }
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
