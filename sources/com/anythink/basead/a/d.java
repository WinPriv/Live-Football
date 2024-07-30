package com.anythink.basead.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3650a = "d";

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f3651c;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, com.anythink.basead.c.d> f3652b = new ConcurrentHashMap<>();

    private d() {
    }

    public static d a() {
        if (f3651c == null) {
            synchronized (d.class) {
                if (f3651c == null) {
                    f3651c = new d();
                }
            }
        }
        return f3651c;
    }

    public final void a(int i10, String str, com.anythink.basead.c.d dVar) {
        this.f3652b.put(i10 + str, dVar);
    }

    public final com.anythink.basead.c.d a(int i10, String str) {
        return this.f3652b.get(i10 + str);
    }
}
