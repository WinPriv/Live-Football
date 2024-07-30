package com.anythink.expressad.advanced.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f6755a = new HashMap();

    public static void a(String str) {
        f6755a.put(str, Boolean.TRUE);
    }

    public static boolean b(String str) {
        if (f6755a.containsKey(str)) {
            return f6755a.get(str).booleanValue();
        }
        return false;
    }

    public static void c(String str) {
        f6755a.remove(str);
    }

    private static void a() {
        f6755a.clear();
    }
}
