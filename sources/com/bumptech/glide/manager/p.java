package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Set<p3.d> f19806a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f19807b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f19808c;

    public final boolean a(p3.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f19806a.remove(dVar);
        if (!this.f19807b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public final void b() {
        Iterator it = t3.l.d(this.f19806a).iterator();
        while (it.hasNext()) {
            p3.d dVar = (p3.d) it.next();
            if (!dVar.i() && !dVar.f()) {
                dVar.clear();
                if (!this.f19808c) {
                    dVar.h();
                } else {
                    this.f19807b.add(dVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f19806a.size() + ", isPaused=" + this.f19808c + "}";
    }
}
