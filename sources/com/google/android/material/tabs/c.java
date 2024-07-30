package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.n;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes2.dex */
public class c {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.W && (view instanceof TabLayout.TabView)) {
            TabLayout.TabView tabView = (TabLayout.TabView) view;
            int contentWidth = tabView.getContentWidth();
            int contentHeight = tabView.getContentHeight();
            int b10 = (int) n.b(24, tabView.getContext());
            if (contentWidth < b10) {
                contentWidth = b10;
            }
            int right = (tabView.getRight() + tabView.getLeft()) / 2;
            int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
            int i10 = contentWidth / 2;
            return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(h6.a.b(f, (int) a10.left, (int) a11.left), drawable.getBounds().top, h6.a.b(f, (int) a10.right, (int) a11.right), drawable.getBounds().bottom);
    }
}
