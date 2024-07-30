package kc;

import android.content.Context;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public static c f32284b;

    public c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f32284b == null) {
            synchronized (c.class) {
                f32284b = new c(context.getApplicationContext());
            }
        }
        return f32284b;
    }
}
