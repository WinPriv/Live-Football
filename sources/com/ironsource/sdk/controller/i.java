package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.sdk.controller.x;

/* loaded from: classes2.dex */
public final class i extends FrameLayout implements com.ironsource.sdk.j.g {

    /* renamed from: s, reason: collision with root package name */
    public Context f26192s;

    /* renamed from: t, reason: collision with root package name */
    public x f26193t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup;
            i iVar = i.this;
            Activity activity = (Activity) iVar.f26192s;
            if (activity != null) {
                viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.addView(iVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup;
            i iVar = i.this;
            Activity activity = (Activity) iVar.f26192s;
            if (activity != null) {
                viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(iVar);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.f26192s = context;
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26193t.k();
        this.f26193t.a(true, "main");
    }

    @Override // com.ironsource.sdk.j.g
    public final boolean onBackButtonPressed() {
        new com.ironsource.sdk.i.a();
        return com.ironsource.sdk.i.a.a((Activity) this.f26192s);
    }

    @Override // com.ironsource.sdk.j.g
    public final void onCloseRequested() {
        ((Activity) this.f26192s).runOnUiThread(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26193t.j();
        this.f26193t.a(false, "main");
        x xVar = this.f26193t;
        if (xVar != null) {
            xVar.M = x.g.Gone;
            xVar.V = null;
            xVar.f26264q0 = null;
        }
        removeAllViews();
    }

    @Override // com.ironsource.sdk.j.g
    public final void onOrientationChanged(String str, int i10) {
    }
}
