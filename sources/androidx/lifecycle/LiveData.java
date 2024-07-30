package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l;
import androidx.lifecycle.i;
import java.util.Map;
import k.b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f1919k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1920a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final k.b<r<? super T>, LiveData<T>.c> f1921b = new k.b<>();

    /* renamed from: c, reason: collision with root package name */
    public int f1922c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1923d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1924e;
    public volatile Object f;

    /* renamed from: g, reason: collision with root package name */
    public int f1925g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1926h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1927i;

    /* renamed from: j, reason: collision with root package name */
    public final a f1928j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements k {
        public LifecycleBoundObserver() {
            throw null;
        }

        @Override // androidx.lifecycle.k
        public final void c(m mVar, i.b bVar) {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void e() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f1920a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.f1919k;
            }
            LiveData.this.h(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, r<? super T> rVar) {
            super(rVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean g() {
            return true;
        }
    }

    public LiveData() {
        Object obj = f1919k;
        this.f = obj;
        this.f1928j = new a();
        this.f1924e = obj;
        this.f1925g = -1;
    }

    public static void a(String str) {
        boolean z10;
        j.a.i().f29554v.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalStateException(a3.k.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        boolean z10;
        if (!cVar.f1931t) {
            return;
        }
        if (!cVar.g()) {
            cVar.d(false);
            return;
        }
        int i10 = cVar.f1932u;
        int i11 = this.f1925g;
        if (i10 >= i11) {
            return;
        }
        cVar.f1932u = i11;
        r<? super T> rVar = cVar.f1930s;
        Object obj = this.f1924e;
        l.d dVar = (l.d) rVar;
        dVar.getClass();
        if (((m) obj) != null) {
            androidx.fragment.app.l lVar = androidx.fragment.app.l.this;
            z10 = lVar.mShowsDialog;
            if (z10) {
                View requireView = lVar.requireView();
                if (requireView.getParent() == null) {
                    if (lVar.mDialog != null) {
                        if (FragmentManager.H(3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + lVar.mDialog);
                        }
                        lVar.mDialog.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f1926h) {
            this.f1927i = true;
            return;
        }
        this.f1926h = true;
        do {
            this.f1927i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                k.b<r<? super T>, LiveData<T>.c> bVar = this.f1921b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f30232u.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1927i) {
                        break;
                    }
                }
            }
        } while (this.f1927i);
        this.f1926h = false;
    }

    public final void d(r<? super T> rVar) {
        a("observeForever");
        b bVar = new b(this, rVar);
        LiveData<T>.c b10 = this.f1921b.b(rVar, bVar);
        if (!(b10 instanceof LifecycleBoundObserver)) {
            if (b10 != null) {
                return;
            }
            bVar.d(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void g(r<? super T> rVar) {
        a("removeObserver");
        LiveData<T>.c c10 = this.f1921b.c(rVar);
        if (c10 == null) {
            return;
        }
        c10.e();
        c10.d(false);
    }

    public abstract void h(T t10);

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: s, reason: collision with root package name */
        public final r<? super T> f1930s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f1931t;

        /* renamed from: u, reason: collision with root package name */
        public int f1932u = -1;

        public c(r<? super T> rVar) {
            this.f1930s = rVar;
        }

        public final void d(boolean z10) {
            int i10;
            boolean z11;
            boolean z12;
            if (z10 == this.f1931t) {
                return;
            }
            this.f1931t = z10;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            LiveData liveData = LiveData.this;
            int i11 = liveData.f1922c;
            liveData.f1922c = i10 + i11;
            if (!liveData.f1923d) {
                liveData.f1923d = true;
                while (true) {
                    try {
                        int i12 = liveData.f1922c;
                        if (i11 == i12) {
                            break;
                        }
                        if (i11 == 0 && i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 > 0 && i12 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            liveData.e();
                        } else if (z12) {
                            liveData.f();
                        }
                        i11 = i12;
                    } finally {
                        liveData.f1923d = false;
                    }
                }
            }
            if (this.f1931t) {
                liveData.c(this);
            }
        }

        public abstract boolean g();

        public void e() {
        }
    }

    public void e() {
    }

    public void f() {
    }
}
