package com.ironsource.environment.c;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.e.c;
import com.ironsource.environment.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, Object> f24645a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f24646b;

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f24647c;

    /* renamed from: com.ironsource.environment.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0321a {

        /* renamed from: a, reason: collision with root package name */
        public static volatile a f24648a = new a(0);
    }

    private a() {
        this.f24646b = new AtomicBoolean(false);
        this.f24647c = new AtomicBoolean(false);
        this.f24645a = new ConcurrentHashMap<>();
    }

    public final JSONObject a(Context context) {
        b(context);
        return new JSONObject(b.a(this.f24645a));
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f24646b;
        boolean z10 = false;
        if (!atomicBoolean.get()) {
            try {
                atomicBoolean.set(true);
                c.f24668a.c(new ob.a(this, context));
            } catch (Exception unused) {
                atomicBoolean.set(false);
            }
        }
        String B = h.B(context);
        if (!TextUtils.isEmpty(B)) {
            a("asid", B);
        } else {
            try {
                z10 = this.f24645a.containsKey("asid");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (z10) {
                try {
                    this.f24645a.remove("asid");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            a("lang", language.toUpperCase());
        }
        String c10 = h.c();
        if (!TextUtils.isEmpty(c10)) {
            a(com.anythink.expressad.foundation.g.a.V, c10);
        }
        String a10 = com.ironsource.d.a.a(context);
        if (!TextUtils.isEmpty(a10) && !a10.equals("none")) {
            a("connt", a10);
        }
        a("vpn", Boolean.valueOf(com.ironsource.d.a.c(context)));
        String j10 = h.j(context);
        if (!TextUtils.isEmpty(j10)) {
            a("icc", j10);
        }
        a("vol", Float.valueOf(h.l(context)));
        a("dfs", String.valueOf(h.p()));
        a("scrnw", Integer.valueOf(h.k()));
        a("scrnh", Integer.valueOf(h.l()));
        a("ltime", String.valueOf(h.a()));
        a("tzoff", String.valueOf(h.b()));
        a("mcc", Integer.valueOf(a.AnonymousClass1.c(context)));
        a("mnc", Integer.valueOf(a.AnonymousClass1.d(context)));
        a("sdcrd", Boolean.valueOf(h.d()));
        a("chrg", Boolean.valueOf(h.e(context)));
        a("chrgt", Integer.valueOf(h.f(context)));
        a("apm", Boolean.valueOf(h.g(context)));
        a("owp", Boolean.valueOf(h.h(context)));
        a("rt", Boolean.valueOf(h.j()));
        a("sscl", String.valueOf(h.o()));
        a("bat", Integer.valueOf(h.v(context)));
        a("lpm", Boolean.valueOf(h.w(context)));
        a("apor", h.n(context));
        a("ua", h.q());
        int E = h.E(context);
        if (E >= 0) {
            a("tca", Integer.valueOf(E));
        }
        Object F = h.F(context);
        if (F != null) {
            a("tcs", F);
        }
    }

    public /* synthetic */ a(int i10) {
        this();
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f24645a.put(str, obj);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
