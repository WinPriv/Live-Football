package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.n;

/* loaded from: classes2.dex */
public class TabItem extends View {

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f21015s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f21016t;

    /* renamed from: u, reason: collision with root package name */
    public final int f21017u;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f510t0);
        this.f21015s = obtainStyledAttributes.getText(2);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = g.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        this.f21016t = drawable;
        this.f21017u = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
