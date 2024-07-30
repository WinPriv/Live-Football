package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: s, reason: collision with root package name */
    public final Set<i> f19783s = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: t, reason: collision with root package name */
    public boolean f19784t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19785u;

    public final void a() {
        this.f19785u = true;
        Iterator it = t3.l.d(this.f19783s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
    }

    public final void b() {
        this.f19784t = true;
        Iterator it = t3.l.d(this.f19783s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    public final void c() {
        this.f19784t = false;
        Iterator it = t3.l.d(this.f19783s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void d(i iVar) {
        this.f19783s.add(iVar);
        if (this.f19785u) {
            iVar.onDestroy();
        } else if (this.f19784t) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void e(i iVar) {
        this.f19783s.remove(iVar);
    }
}
