package com.anythink.expressad.video.dynview.i.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.anythink.expressad.foundation.h.t;

/* loaded from: classes.dex */
public final class a {
    private static void a(View view, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(t.b(view.getContext(), 12.0f));
            gradientDrawable.setStroke(t.b(view.getContext(), 1.0f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    public static void a(View view, float f, float f10, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null) {
            int[] iArr = new int[2];
            for (int i10 = 0; i10 < 2; i10++) {
                iArr[i10] = Color.parseColor(strArr[i10]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(t.b(view.getContext(), f10));
            gradientDrawable.setStroke(t.b(view.getContext(), f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }
}
