package com.ironsource.mediationsdk;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f25352s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FrameLayout.LayoutParams f25353t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IronSourceBannerLayout f25354u;

    public b0(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
        this.f25354u = ironSourceBannerLayout;
        this.f25352s = view;
        this.f25353t = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f25354u;
        ironSourceBannerLayout.removeAllViews();
        View view = this.f25352s;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        ironSourceBannerLayout.f24816s = view;
        ironSourceBannerLayout.addView(view, 0, this.f25353t);
    }
}
