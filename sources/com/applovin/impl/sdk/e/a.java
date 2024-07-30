package com.applovin.impl.sdk.e;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18836a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18837b;
    protected final com.applovin.impl.sdk.p f;

    /* renamed from: g, reason: collision with root package name */
    protected final String f18838g;

    /* renamed from: h, reason: collision with root package name */
    protected final com.applovin.impl.sdk.y f18839h;

    public a(String str, com.applovin.impl.sdk.p pVar) {
        this(str, pVar, false);
    }

    public void a(boolean z10) {
        this.f18837b = z10;
    }

    public com.applovin.impl.sdk.p d() {
        return this.f;
    }

    public String e() {
        return this.f18838g;
    }

    public Context f() {
        return this.f18836a;
    }

    public boolean g() {
        return this.f18837b;
    }

    public a(String str, com.applovin.impl.sdk.p pVar, boolean z10) {
        this.f18838g = str;
        this.f = pVar;
        this.f18839h = pVar.L();
        this.f18836a = com.applovin.impl.sdk.p.y();
        this.f18837b = z10;
    }
}
