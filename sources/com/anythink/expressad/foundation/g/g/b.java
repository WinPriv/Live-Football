package com.anythink.expressad.foundation.g.g;

import android.content.Context;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10075a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<Context, c> f10076b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private c f10077c;

    /* renamed from: d, reason: collision with root package name */
    private Context f10078d;

    private b(Context context) {
        this.f10078d = context;
        if (f10076b.get(context) != null) {
            this.f10077c = f10076b.get(this.f10078d);
            return;
        }
        c cVar = new c(this.f10078d, 5);
        this.f10077c = cVar;
        f10076b.put(this.f10078d, cVar);
    }

    private void a(a aVar) {
        this.f10077c.a(aVar);
    }
}
