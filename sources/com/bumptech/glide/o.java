package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.t;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public final class o implements ComponentCallbacks2, com.bumptech.glide.manager.i {
    public static final p3.g C;
    public final CopyOnWriteArrayList<p3.f<Object>> A;
    public p3.g B;

    /* renamed from: s, reason: collision with root package name */
    public final com.bumptech.glide.b f19836s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f19837t;

    /* renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.manager.h f19838u;

    /* renamed from: v, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f19839v;

    /* renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f19840w;

    /* renamed from: x, reason: collision with root package name */
    public final t f19841x;
    public final a y;

    /* renamed from: z, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f19842z;

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            oVar.f19838u.d(oVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    public class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.manager.p f19844a;

        public b(com.bumptech.glide.manager.p pVar) {
            this.f19844a = pVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public final void a(boolean z10) {
            if (z10) {
                synchronized (o.this) {
                    this.f19844a.b();
                }
            }
        }
    }

    static {
        p3.g c10 = new p3.g().c(Bitmap.class);
        c10.L = true;
        C = c10;
        new p3.g().c(l3.c.class).L = true;
    }

    public o(com.bumptech.glide.b bVar, com.bumptech.glide.manager.h hVar, com.bumptech.glide.manager.o oVar, Context context) {
        boolean z10;
        com.bumptech.glide.manager.b lVar;
        p3.g gVar;
        String str;
        com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p();
        com.bumptech.glide.manager.c cVar = bVar.f19722x;
        this.f19841x = new t();
        a aVar = new a();
        this.y = aVar;
        this.f19836s = bVar;
        this.f19838u = hVar;
        this.f19840w = oVar;
        this.f19839v = pVar;
        this.f19837t = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(pVar);
        ((com.bumptech.glide.manager.e) cVar).getClass();
        if (d0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            lVar = new com.bumptech.glide.manager.d(applicationContext, bVar2);
        } else {
            lVar = new com.bumptech.glide.manager.l();
        }
        this.f19842z = lVar;
        char[] cArr = t3.l.f35429a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            t3.l.e().post(aVar);
        } else {
            hVar.d(this);
        }
        hVar.d(lVar);
        this.A = new CopyOnWriteArrayList<>(bVar.f19719u.f19728e);
        h hVar2 = bVar.f19719u;
        synchronized (hVar2) {
            if (hVar2.f19732j == null) {
                ((c) hVar2.f19727d).getClass();
                p3.g gVar2 = new p3.g();
                gVar2.L = true;
                hVar2.f19732j = gVar2;
            }
            gVar = hVar2.f19732j;
        }
        synchronized (this) {
            p3.g clone = gVar.clone();
            if (clone.L && !clone.N) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.N = true;
            clone.L = true;
            this.B = clone;
        }
        synchronized (bVar.y) {
            if (!bVar.y.contains(this)) {
                bVar.y.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final void i(q3.g<?> gVar) {
        boolean z10;
        if (gVar == null) {
            return;
        }
        boolean n10 = n(gVar);
        p3.d f = gVar.f();
        if (!n10) {
            com.bumptech.glide.b bVar = this.f19836s;
            synchronized (bVar.y) {
                Iterator it = bVar.y.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((o) it.next()).n(gVar)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10 && f != null) {
                gVar.d(null);
                f.clear();
            }
        }
    }

    public final n<Drawable> j(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        n nVar = new n(this.f19836s, this, Drawable.class, this.f19837t);
        n x10 = nVar.x(num);
        ConcurrentHashMap concurrentHashMap = s3.b.f35118a;
        Context context = nVar.S;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = s3.b.f35118a;
        y2.e eVar = (y2.e) concurrentHashMap2.get(packageName);
        if (eVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            s3.d dVar = new s3.d(uuid);
            eVar = (y2.e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (eVar == null) {
                eVar = dVar;
            }
        }
        return x10.r(new p3.g().l(new s3.a(context.getResources().getConfiguration().uiMode & 48, eVar)));
    }

    public final n<Drawable> k(String str) {
        return new n(this.f19836s, this, Drawable.class, this.f19837t).x(str);
    }

    public final synchronized void l() {
        com.bumptech.glide.manager.p pVar = this.f19839v;
        pVar.f19808c = true;
        Iterator it = t3.l.d(pVar.f19806a).iterator();
        while (it.hasNext()) {
            p3.d dVar = (p3.d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                pVar.f19807b.add(dVar);
            }
        }
    }

    public final synchronized void m() {
        com.bumptech.glide.manager.p pVar = this.f19839v;
        pVar.f19808c = false;
        Iterator it = t3.l.d(pVar.f19806a).iterator();
        while (it.hasNext()) {
            p3.d dVar = (p3.d) it.next();
            if (!dVar.i() && !dVar.isRunning()) {
                dVar.h();
            }
        }
        pVar.f19807b.clear();
    }

    public final synchronized boolean n(q3.g<?> gVar) {
        p3.d f = gVar.f();
        if (f == null) {
            return true;
        }
        if (this.f19839v.a(f)) {
            this.f19841x.f19829s.remove(gVar);
            gVar.d(null);
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onDestroy() {
        this.f19841x.onDestroy();
        Iterator it = t3.l.d(this.f19841x.f19829s).iterator();
        while (it.hasNext()) {
            i((q3.g) it.next());
        }
        this.f19841x.f19829s.clear();
        com.bumptech.glide.manager.p pVar = this.f19839v;
        Iterator it2 = t3.l.d(pVar.f19806a).iterator();
        while (it2.hasNext()) {
            pVar.a((p3.d) it2.next());
        }
        pVar.f19807b.clear();
        this.f19838u.e(this);
        this.f19838u.e(this.f19842z);
        t3.l.e().removeCallbacks(this.y);
        this.f19836s.d(this);
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onStart() {
        m();
        this.f19841x.onStart();
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onStop() {
        l();
        this.f19841x.onStop();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f19839v + ", treeNode=" + this.f19840w + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }
}
