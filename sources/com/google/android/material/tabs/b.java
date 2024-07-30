package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.hms.ads.gl;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
public final class b extends c {
    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float a10;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF a11 = c.a(tabLayout, view);
        if (f < 0.5f) {
            a10 = h6.a.a(1.0f, gl.Code, gl.Code, 0.5f, f);
        } else {
            a10 = h6.a.a(gl.Code, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a11.left, drawable.getBounds().top, (int) a11.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a10 * 255.0f));
    }
}
