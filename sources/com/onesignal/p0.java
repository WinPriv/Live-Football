package com.onesignal;

import com.onesignal.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: OSFocusTimeProcessorFactory.java */
/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, m.c> f26966a;

    public p0() {
        HashMap<String, m.c> hashMap = new HashMap<>();
        this.f26966a = hashMap;
        hashMap.put(m.d.class.getName(), new m.d());
        hashMap.put(m.b.class.getName(), new m.b());
    }

    public final m.c a() {
        HashMap<String, m.c> hashMap = this.f26966a;
        m.c cVar = hashMap.get(m.b.class.getName());
        Iterator it = cVar.c().iterator();
        while (it.hasNext()) {
            if (((bc.a) it.next()).f3185a.k()) {
                return cVar;
            }
        }
        return hashMap.get(m.d.class.getName());
    }

    public final m.c b(List<bc.a> list) {
        boolean z10;
        Iterator<bc.a> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f3185a.k()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        HashMap<String, m.c> hashMap = this.f26966a;
        if (z10) {
            return hashMap.get(m.b.class.getName());
        }
        return hashMap.get(m.d.class.getName());
    }
}
