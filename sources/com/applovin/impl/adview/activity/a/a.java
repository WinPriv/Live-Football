package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    final p f16963a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f16964b;

    /* renamed from: c, reason: collision with root package name */
    final e f16965c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f16966d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f16967e;

    public a(e eVar, Activity activity, p pVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f16967e = layoutParams;
        this.f16965c = eVar;
        this.f16963a = pVar;
        this.f16964b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f16966d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f16966d.removeView(view);
    }

    public void a(m mVar) {
        if (mVar == null || mVar.getParent() != null) {
            return;
        }
        a(this.f16965c.X(), (this.f16965c.ab() ? 3 : 5) | 48, mVar);
    }

    public void a(e.c cVar, int i10, m mVar) {
        mVar.a(cVar.f18602a, cVar.f18606e, cVar.f18605d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        int i11 = cVar.f18604c;
        layoutParams.setMargins(i11, cVar.f18603b, i11, 0);
        layoutParams.gravity = i10;
        this.f16966d.addView(mVar, layoutParams);
    }
}
