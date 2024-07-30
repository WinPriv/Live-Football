package com.onesignal;

import android.app.AlertDialog;

/* compiled from: OneSignal.java */
/* loaded from: classes2.dex */
public final class h3 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26848s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f26849t;

    public h3(int i10, String str) {
        this.f26848s = i10;
        this.f26849t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (e3.i() != null) {
            new AlertDialog.Builder(e3.i()).setTitle(a3.k.z(this.f26848s)).setMessage(this.f26849t).show();
        }
    }
}
