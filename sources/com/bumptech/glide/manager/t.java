package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: s, reason: collision with root package name */
    public final Set<q3.g<?>> f19829s = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
        Iterator it = t3.l.d(this.f19829s).iterator();
        while (it.hasNext()) {
            ((q3.g) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        Iterator it = t3.l.d(this.f19829s).iterator();
        while (it.hasNext()) {
            ((q3.g) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
        Iterator it = t3.l.d(this.f19829s).iterator();
        while (it.hasNext()) {
            ((q3.g) it.next()).onStop();
        }
    }
}
