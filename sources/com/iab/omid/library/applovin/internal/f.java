package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f24275b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f24276a;

    private f() {
    }

    public static f b() {
        return f24275b;
    }

    public Context a() {
        return this.f24276a;
    }

    public void a(Context context) {
        this.f24276a = context != null ? context.getApplicationContext() : null;
    }
}
