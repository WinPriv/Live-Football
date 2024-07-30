package com.anythink.expressad.out;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static com.anythink.expressad.e.a f10466a;

    private g() {
    }

    public static com.anythink.expressad.e.a a() {
        if (f10466a == null) {
            synchronized (g.class) {
                if (f10466a == null) {
                    f10466a = new com.anythink.expressad.e.a();
                }
            }
        }
        return f10466a;
    }
}
