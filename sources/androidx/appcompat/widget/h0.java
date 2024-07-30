package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1183a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1184b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1185c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1186d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1187e = {R.attr.state_checked};
    public static final int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1188g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a0.a.L);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i10, Context context) {
        ColorStateList d10 = d(i10, context);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f1184b, d10.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1183a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return f0.a.c(c(i10, context), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(int i10, Context context) {
        int[] iArr = f1188g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(int i10, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1188g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = d0.a.b(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
