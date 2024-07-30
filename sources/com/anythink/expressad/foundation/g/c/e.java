package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private a f9871a;

    /* renamed from: b, reason: collision with root package name */
    private String f9872b;

    /* renamed from: c, reason: collision with root package name */
    private e f9873c;

    /* renamed from: d, reason: collision with root package name */
    private List<e> f9874d;

    public final a a() {
        return this.f9871a;
    }

    public final String b() {
        return this.f9872b;
    }

    public final e c() {
        return this.f9873c;
    }

    public final List<e> d() {
        return this.f9874d;
    }

    private void b(e eVar) {
        if (this.f9874d == null) {
            this.f9874d = new ArrayList();
        }
        eVar.f9873c = this;
        this.f9874d.add(eVar);
    }

    public final void a(a aVar) {
        this.f9871a = aVar;
    }

    public final void a(String str) {
        this.f9872b = str;
    }

    private void a(e eVar) {
        this.f9873c = eVar;
    }

    public final void a(a aVar, String str) {
        e eVar = new e();
        eVar.f9871a = aVar;
        eVar.f9872b = str;
        b(eVar);
    }

    public final void a(List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
