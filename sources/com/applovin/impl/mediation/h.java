package com.applovin.impl.mediation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f18376a = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.mediation.a.a aVar);
    }

    public void a(a aVar) {
        this.f18376a.add(aVar);
    }

    public void b(a aVar) {
        this.f18376a.remove(aVar);
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Iterator it = new ArrayList(this.f18376a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(aVar);
        }
    }
}
