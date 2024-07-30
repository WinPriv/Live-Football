package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.o;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: s, reason: collision with root package name */
    public final Context f19786s;

    /* renamed from: t, reason: collision with root package name */
    public final b.a f19787t;

    public d(Context context, o.b bVar) {
        this.f19786s = context.getApplicationContext();
        this.f19787t = bVar;
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        q a10 = q.a(this.f19786s);
        b.a aVar = this.f19787t;
        synchronized (a10) {
            a10.f19811b.add(aVar);
            a10.b();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
        q a10 = q.a(this.f19786s);
        b.a aVar = this.f19787t;
        synchronized (a10) {
            a10.f19811b.remove(aVar);
            if (a10.f19812c && a10.f19811b.isEmpty()) {
                q.c cVar = a10.f19810a;
                cVar.f19817c.get().unregisterNetworkCallback(cVar.f19818d);
                a10.f19812c = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onDestroy() {
    }
}
