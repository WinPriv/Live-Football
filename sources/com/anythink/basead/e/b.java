package com.anythink.basead.e;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3960a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Map<String, InterfaceC0061b> f3961b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f3962a = new b(0);

        private a() {
        }
    }

    /* renamed from: com.anythink.basead.e.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0061b extends Serializable {
        void a();

        void a(int i10);

        void a(com.anythink.basead.c.e eVar);

        void a(boolean z10);

        void b();

        void c();

        void d();

        void e();
    }

    public /* synthetic */ b(byte b10) {
        this();
    }

    public static b a() {
        return a.f3962a;
    }

    public final void b(String str) {
        this.f3961b.remove(str);
    }

    private b() {
        this.f3961b = new HashMap(2);
    }

    public final void a(String str, InterfaceC0061b interfaceC0061b) {
        this.f3961b.put(str, interfaceC0061b);
    }

    public final InterfaceC0061b a(String str) {
        return this.f3961b.get(str);
    }
}
