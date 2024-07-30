package com.anythink.expressad.foundation.g.f.f;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9987a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9988b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f9989c;

    /* renamed from: d, reason: collision with root package name */
    public final List<com.anythink.expressad.foundation.g.f.c.c> f9990d;

    public c(int i10, byte[] bArr, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.anythink.expressad.foundation.g.f.c.c cVar : list) {
            treeMap.put(cVar.a(), cVar.b());
        }
        return treeMap;
    }

    private c(int i10, byte[] bArr, Map<String, String> map, List<com.anythink.expressad.foundation.g.f.c.c> list) {
        this.f9987a = i10;
        this.f9988b = bArr;
        this.f9989c = map;
        if (list == null) {
            this.f9990d = null;
        } else {
            this.f9990d = Collections.unmodifiableList(list);
        }
    }
}
