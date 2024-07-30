package com.onesignal;

import android.app.Activity;

/* compiled from: WebViewManager.java */
/* loaded from: classes2.dex */
public final class f5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e5 f26830s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f26831t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f26832u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r0 f26833v;

    public f5(e5 e5Var, Activity activity, String str, r0 r0Var) {
        this.f26830s = e5Var;
        this.f26831t = activity;
        this.f26832u = str;
        this.f26833v = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e5.c(this.f26830s, this.f26831t, this.f26832u, this.f26833v.f27001d);
        } catch (Exception e10) {
            if (e10.getMessage() != null && e10.getMessage().contains("No WebView installed")) {
                e3.b(3, "Error setting up WebView: ", e10);
                return;
            }
            throw e10;
        }
    }
}
