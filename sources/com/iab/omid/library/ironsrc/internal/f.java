package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static f f24393b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f24394a;

    private f() {
    }

    public static f b() {
        return f24393b;
    }

    public Context a() {
        return this.f24394a;
    }

    public void a(Context context) {
        this.f24394a = context != null ? context.getApplicationContext() : null;
    }
}
