package com.applovin.impl.b;

import android.content.Context;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final C0193a f17229a = new C0193a("Age Restricted User", d.o);

    /* renamed from: b, reason: collision with root package name */
    private static final C0193a f17230b = new C0193a("Has User Consent", d.f18746n);

    /* renamed from: c, reason: collision with root package name */
    private static final C0193a f17231c = new C0193a("\"Do Not Sell\"", d.f18747p);

    /* renamed from: com.applovin.impl.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0193a {

        /* renamed from: a, reason: collision with root package name */
        private final String f17232a;

        /* renamed from: b, reason: collision with root package name */
        private final d<Boolean> f17233b;

        public C0193a(String str, d<Boolean> dVar) {
            this.f17232a = str;
            this.f17233b = dVar;
        }

        public String b(Context context) {
            Boolean a10 = a(context);
            if (a10 != null) {
                return a10.toString();
            }
            return "No value set";
        }

        public String a() {
            return this.f17232a;
        }

        public Boolean a(Context context) {
            if (context == null) {
                y.i("AppLovinSdk", "Failed to get value for key: " + this.f17233b);
                return null;
            }
            return (Boolean) e.b(this.f17233b, (Object) null, context);
        }
    }

    public static C0193a a() {
        return f17229a;
    }

    public static C0193a b() {
        return f17230b;
    }

    public static C0193a c() {
        return f17231c;
    }

    public static boolean a(boolean z10, Context context) {
        return a(d.o, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(d.f18746n, Boolean.valueOf(z10), context);
    }

    public static boolean c(boolean z10, Context context) {
        return a(d.f18747p, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f17229a, context) + a(f17230b, context) + a(f17231c, context);
    }

    private static boolean a(d<Boolean> dVar, Boolean bool, Context context) {
        if (context == null) {
            y.i("AppLovinSdk", "Failed to update compliance value for key: " + dVar);
            return false;
        }
        Boolean bool2 = (Boolean) e.b(dVar, (Object) null, context);
        e.a(dVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    private static String a(C0193a c0193a, Context context) {
        return "\n" + c0193a.f17232a + " - " + c0193a.b(context);
    }
}
