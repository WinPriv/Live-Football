package com.iab.omid.library.vungle.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static d f24499a = new d();

    /* renamed from: b, reason: collision with root package name */
    private Context f24500b;

    private d() {
    }

    public static d a() {
        return f24499a;
    }

    public Context b() {
        return this.f24500b;
    }

    public void a(Context context) {
        this.f24500b = context != null ? context.getApplicationContext() : null;
    }
}
