package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public MutableContextWrapper f26100a;

    public final Activity a() {
        return (Activity) this.f26100a.getBaseContext();
    }

    public final synchronized void b() {
        this.f26100a = null;
    }

    public final synchronized void a(Activity activity) {
        if (this.f26100a == null) {
            this.f26100a = new MutableContextWrapper(activity);
        }
        this.f26100a.setBaseContext(activity);
    }
}
