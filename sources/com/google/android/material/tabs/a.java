package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
public final class a extends c {
    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        boolean z10;
        float cos;
        float f10;
        RectF a10 = c.a(tabLayout, view);
        RectF a11 = c.a(tabLayout, view2);
        if (a10.left < a11.left) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            double d10 = (f * 3.141592653589793d) / 2.0d;
            f10 = (float) (1.0d - Math.cos(d10));
            cos = (float) Math.sin(d10);
        } else {
            double d11 = (f * 3.141592653589793d) / 2.0d;
            float sin = (float) Math.sin(d11);
            cos = (float) (1.0d - Math.cos(d11));
            f10 = sin;
        }
        drawable.setBounds(h6.a.b(f10, (int) a10.left, (int) a11.left), drawable.getBounds().top, h6.a.b(cos, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
