package z6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;

/* compiled from: MaterialResources.java */
/* loaded from: classes2.dex */
public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList b10;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (b10 = d0.a.b(resourceId, context)) != null) {
            return b10;
        }
        return typedArray.getColorStateList(i10);
    }

    public static ColorStateList b(Context context, m0 m0Var, int i10) {
        int i11;
        ColorStateList b10;
        if (m0Var.l(i10) && (i11 = m0Var.i(i10, 0)) != 0 && (b10 = d0.a.b(i11, context)) != null) {
            return b10;
        }
        return m0Var.b(i10);
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable a10;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a10 = g.a.a(context, resourceId)) != null) {
            return a10;
        }
        return typedArray.getDrawable(i10);
    }

    public static boolean e(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
