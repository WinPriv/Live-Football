package com.onesignal;

import android.app.Activity;

/* compiled from: WebViewManager.java */
/* loaded from: classes2.dex */
public final class i5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f26862s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f26863t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e5 f26864u;

    public i5(e5 e5Var, Activity activity, String str) {
        this.f26864u = e5Var;
        this.f26862s = activity;
        this.f26863t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.f26862s;
        e5 e5Var = this.f26864u;
        e5.d(e5Var, activity);
        e5Var.f26806b.loadData(this.f26863t, "text/html; charset=utf-8", "base64");
    }
}
