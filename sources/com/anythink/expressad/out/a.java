package com.anythink.expressad.out;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Map<String, Object> f10459a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f10460b;

    public a() {
    }

    private a(Map<String, Object> map, Context context) {
        this.f10459a = map;
        this.f10460b = context;
    }

    public abstract boolean a();

    public abstract void b();
}
