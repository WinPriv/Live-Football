package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    protected e f9875a;

    public f(String str) {
        e eVar = new e();
        eVar.a(str);
        eVar.a(a.AD_ROOT);
        List<e> a10 = a();
        if (a10.size() > 0) {
            eVar.a(a10);
        }
        this.f9875a = eVar;
    }

    public static e a(ArrayList<e> arrayList, a aVar, String str) {
        e eVar = new e();
        eVar.a(aVar);
        eVar.a(str);
        arrayList.add(eVar);
        return eVar;
    }

    public abstract List<e> a();

    public final e b() {
        return this.f9875a;
    }
}
