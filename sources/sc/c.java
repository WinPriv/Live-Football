package sc;

import android.content.Context;
import android.text.TextUtils;
import pc.d;
import pc.g;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f35322c;

    /* renamed from: d, reason: collision with root package name */
    public static a f35323d;

    /* renamed from: a, reason: collision with root package name */
    public Context f35324a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35325b = false;

    public c(Context context) {
        this.f35324a = context;
    }

    public static c a(Context context) {
        if (f35322c == null) {
            synchronized (c.class) {
                if (f35322c == null) {
                    f35322c = new c(context);
                }
            }
        }
        return f35322c;
    }

    public static a c(Context context) {
        String b10 = g.b(context, "tramini", "P_SY");
        if (!TextUtils.isEmpty(b10)) {
            return a.b(d.a(b10));
        }
        return null;
    }

    public final synchronized a b() {
        if (f35323d == null) {
            try {
                if (this.f35324a == null) {
                    this.f35324a = jc.b.a().f30202a;
                }
                f35323d = c(this.f35324a);
            } catch (Exception unused) {
            }
            jc.b.a().c(f35323d);
        }
        return f35323d;
    }
}
