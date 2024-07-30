package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.activity.n;
import androidx.appcompat.widget.AppCompatTextView;
import g7.a;
import z6.b;
import z6.c;

/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (b.b(com.hamkho.livefoot.R.attr.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = n.f499k0;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i10 = -1;
            for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                i10 = c.c(context2, obtainStyledAttributes, iArr2[i11], -1);
            }
            obtainStyledAttributes.recycle();
            if (!(i10 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public final void l(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, n.f498j0);
        Context context = getContext();
        int[] iArr = {1, 2};
        int i11 = -1;
        for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
            i11 = c.c(context, obtainStyledAttributes, iArr[i12], -1);
        }
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (b.b(com.hamkho.livefoot.R.attr.textAppearanceLineHeightEnabled, context, true)) {
            l(i10, context.getTheme());
        }
    }
}
