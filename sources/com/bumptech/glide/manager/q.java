package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.bumptech.glide.manager.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static volatile q f19809d;

    /* renamed from: a, reason: collision with root package name */
    public final c f19810a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f19811b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f19812c;

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public class a implements t3.g<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f19813a;

        public a(Context context) {
            this.f19813a = context;
        }

        @Override // t3.g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f19813a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public class b implements b.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public final void a(boolean z10) {
            ArrayList arrayList;
            t3.l.a();
            synchronized (q.this) {
                arrayList = new ArrayList(q.this.f19811b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19815a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f19816b;

        /* renamed from: c, reason: collision with root package name */
        public final t3.g<ConnectivityManager> f19817c;

        /* renamed from: d, reason: collision with root package name */
        public final a f19818d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        /* loaded from: classes.dex */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                t3.l.e().post(new r(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                t3.l.e().post(new r(this, false));
            }
        }

        public c(t3.f fVar, b bVar) {
            this.f19817c = fVar;
            this.f19816b = bVar;
        }
    }

    public q(Context context) {
        this.f19810a = new c(new t3.f(new a(context)), new b());
    }

    public static q a(Context context) {
        if (f19809d == null) {
            synchronized (q.class) {
                if (f19809d == null) {
                    f19809d = new q(context.getApplicationContext());
                }
            }
        }
        return f19809d;
    }

    public final void b() {
        boolean z10;
        if (!this.f19812c && !this.f19811b.isEmpty()) {
            c cVar = this.f19810a;
            t3.g<ConnectivityManager> gVar = cVar.f19817c;
            boolean z11 = true;
            if (gVar.get().getActiveNetwork() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            cVar.f19815a = z10;
            try {
                gVar.get().registerDefaultNetworkCallback(cVar.f19818d);
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                z11 = false;
            }
            this.f19812c = z11;
        }
    }
}
