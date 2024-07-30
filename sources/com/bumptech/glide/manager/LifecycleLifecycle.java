package com.bumptech.glide.manager;

import androidx.lifecycle.i;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements h, androidx.lifecycle.l {

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f19781s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.i f19782t;

    public LifecycleLifecycle(androidx.lifecycle.i iVar) {
        this.f19782t = iVar;
        iVar.a(this);
    }

    @Override // com.bumptech.glide.manager.h
    public final void d(i iVar) {
        this.f19781s.add(iVar);
        androidx.lifecycle.i iVar2 = this.f19782t;
        if (iVar2.b() == i.c.DESTROYED) {
            iVar.onDestroy();
        } else if (iVar2.b().a(i.c.STARTED)) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void e(i iVar) {
        this.f19781s.remove(iVar);
    }

    @androidx.lifecycle.s(i.b.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.m mVar) {
        Iterator it = t3.l.d(this.f19781s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
        mVar.getLifecycle().c(this);
    }

    @androidx.lifecycle.s(i.b.ON_START)
    public void onStart(androidx.lifecycle.m mVar) {
        Iterator it = t3.l.d(this.f19781s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    @androidx.lifecycle.s(i.b.ON_STOP)
    public void onStop(androidx.lifecycle.m mVar) {
        Iterator it = t3.l.d(this.f19781s).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }
}
