package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.i;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1957b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public a f1958c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final n f1959s;

        /* renamed from: t, reason: collision with root package name */
        public final i.b f1960t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f1961u = false;

        public a(n nVar, i.b bVar) {
            this.f1959s = nVar;
            this.f1960t = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f1961u) {
                this.f1959s.f(this.f1960t);
                this.f1961u = true;
            }
        }
    }

    public d0(m mVar) {
        this.f1956a = new n(mVar);
    }

    public final void a(i.b bVar) {
        a aVar = this.f1958c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f1956a, bVar);
        this.f1958c = aVar2;
        this.f1957b.postAtFrontOfQueue(aVar2);
    }
}
