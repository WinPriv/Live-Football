package com.anythink.expressad.foundation.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.g.f.m;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.r;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    private static final String f9407g = "SDKController";

    /* renamed from: h, reason: collision with root package name */
    private static volatile b f9408h;

    /* renamed from: i, reason: collision with root package name */
    private Context f9414i;

    /* renamed from: m, reason: collision with root package name */
    private String f9418m;

    /* renamed from: n, reason: collision with root package name */
    private int f9419n;

    /* renamed from: j, reason: collision with root package name */
    private String f9415j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f9416k = "";

    /* renamed from: l, reason: collision with root package name */
    private boolean f9417l = false;

    /* renamed from: a, reason: collision with root package name */
    public final int f9409a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f9410b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f9411c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final int f9412d = 4;

    /* renamed from: e, reason: collision with root package name */
    public final int f9413e = 5;
    public final int f = 6;

    private b() {
    }

    public static b a() {
        if (f9408h == null) {
            synchronized (b.class) {
                if (f9408h == null) {
                    f9408h = new b();
                }
            }
        }
        return f9408h;
    }

    private static String b() {
        return com.anythink.expressad.out.b.f10461a;
    }

    private void c() {
        a.b().a(this.f9415j);
        a.b().b(this.f9416k);
        a.b().c();
        a(this.f9414i.getApplicationContext());
        r.a(this.f9414i);
        this.f9417l = true;
    }

    private void e() {
        a.b().a(this.f9415j);
        a.b().b(this.f9416k);
        a.b().c();
    }

    public final void a(Map map, final Context context) {
        if (context != null) {
            this.f9414i = context.getApplicationContext();
            a.b().a(this.f9414i);
            try {
                m.a(this.f9414i);
            } catch (Exception unused) {
            }
            n.a().a(new Runnable() { // from class: com.anythink.expressad.foundation.b.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    k.i(context);
                }
            }, 300L);
            if (map != null) {
                if (map.containsKey(com.anythink.expressad.a.f6559d)) {
                    this.f9415j = (String) map.get(com.anythink.expressad.a.f6559d);
                }
                if (map.containsKey(com.anythink.expressad.a.f6560e)) {
                    this.f9416k = (String) map.get(com.anythink.expressad.a.f6560e);
                }
                a.b().a(this.f9415j);
                a.b().b(this.f9416k);
                a.b().c();
                a(this.f9414i.getApplicationContext());
                r.a(this.f9414i);
                this.f9417l = true;
            }
        }
    }

    private static void a(Context context) {
        String str;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(g.f5015w, 0);
            String str2 = "";
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(g.o.f5144l, "");
                str = sharedPreferences.getString(g.o.f5145m, "");
                str2 = string;
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.co) && TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.cp)) {
                com.anythink.expressad.foundation.g.a.co = str2;
                com.anythink.expressad.foundation.g.a.cp = str;
            }
        } catch (Throwable th) {
            o.b(f9407g, th.getMessage(), th);
        }
    }

    private static void d() {
    }
}
