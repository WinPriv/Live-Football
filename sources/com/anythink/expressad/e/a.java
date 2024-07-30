package com.anythink.expressad.e;

import android.content.Context;
import com.anythink.expressad.foundation.g.f.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements com.anythink.expressad.b {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f7230a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7231b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7232c = false;

    private void a() {
        this.f7232c = false;
        try {
            m.a(this.f7231b);
            com.anythink.expressad.foundation.b.b.a().a(f7230a, this.f7231b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7231b = applicationContext;
        f7230a = map;
        this.f7232c = false;
        try {
            m.a(applicationContext);
            com.anythink.expressad.foundation.b.b.a().a(f7230a, this.f7231b);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
