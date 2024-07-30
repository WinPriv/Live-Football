package com.anythink.core.common.a;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.c.k;
import com.anythink.core.common.k.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4897a;

    /* renamed from: b, reason: collision with root package name */
    private k f4898b;

    private a() {
        if (n.a().g() != null) {
            this.f4898b = k.a(com.anythink.core.common.c.c.a(n.a().g()));
        }
    }

    public static void c(Context context, String str) {
        p.a(context, com.anythink.core.common.b.g.y, str + g.o.f5146n, 1);
    }

    public static boolean d(Context context, String str) {
        if (p.b(context, com.anythink.core.common.b.g.y, str + g.o.f5146n, 0) != 1) {
            return false;
        }
        return true;
    }

    public final void b(final Context context, final String str) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f4898b == null) {
                    a.this.f4898b = k.a(com.anythink.core.common.c.c.a(context.getApplicationContext()));
                }
                a.this.f4898b.a(str);
            }
        });
        p.a(context, com.anythink.core.common.b.g.y, str + g.o.f5146n);
    }

    public static a a() {
        if (f4897a == null) {
            synchronized (a.class) {
                if (f4897a == null) {
                    f4897a = new a();
                }
            }
        }
        return f4897a;
    }

    public final void a(Context context, int i10, String str, String str2, String str3) {
        if (this.f4898b == null) {
            this.f4898b = k.a(com.anythink.core.common.c.c.a(context.getApplicationContext()));
        }
        h hVar = new h();
        hVar.a(str2);
        hVar.b(str);
        hVar.a(i10);
        hVar.c(str3);
        this.f4898b.a(hVar);
    }

    public final String a(Context context, String str) {
        if (this.f4898b == null) {
            this.f4898b = k.a(com.anythink.core.common.c.c.a(context.getApplicationContext()));
        }
        return this.f4898b.b(str);
    }
}
