package com.anythink.basead.a;

import com.anythink.basead.a.b.b;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.u;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3653a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f3654b;

    private f() {
    }

    public static f a() {
        if (f3654b == null) {
            synchronized (f.class) {
                if (f3654b == null) {
                    f3654b = new f();
                }
            }
        }
        return f3654b;
    }

    private static FileInputStream b(int i10, String str) {
        return com.anythink.core.common.res.d.a(n.a().g()).a(i10, com.anythink.core.common.k.f.a(str));
    }

    private static void a(String str, List<s> list, u uVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.anythink.core.common.e.j jVar = new com.anythink.core.common.e.j();
            jVar.f5664m = uVar;
            a(str, true, list.get(i10), jVar, null);
        }
    }

    public static void a(String str, com.anythink.core.common.e.i iVar, com.anythink.core.common.e.j jVar, b.InterfaceC0049b interfaceC0049b) {
        a(str, false, iVar, jVar, interfaceC0049b);
    }

    public static void a(String str, boolean z10, com.anythink.core.common.e.i iVar, com.anythink.core.common.e.j jVar, b.InterfaceC0049b interfaceC0049b) {
        new com.anythink.basead.a.b.b(str, z10, iVar, jVar).a(interfaceC0049b);
    }

    public static boolean a(s sVar, com.anythink.core.common.e.j jVar) {
        return com.anythink.basead.a.b.c.a(sVar, jVar);
    }

    public static boolean a(s sVar, int i10, k kVar) {
        return com.anythink.basead.a.b.c.a(sVar, i10, kVar);
    }

    public static boolean a(String str, InputStream inputStream) {
        if (str == null || inputStream == null) {
            return false;
        }
        return com.anythink.core.common.res.d.a(n.a().g()).a(1, com.anythink.core.common.k.f.a(str), inputStream);
    }

    public static String a(int i10, String str) {
        return com.anythink.core.common.res.d.a(n.a().g()).b(i10, com.anythink.core.common.k.f.a(str));
    }
}
