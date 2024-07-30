package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f459a;

    /* renamed from: c, reason: collision with root package name */
    public final j f461c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f462d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f463e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<i> f460b = new ArrayDeque<>();
    public boolean f = false;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements androidx.lifecycle.k, androidx.activity.a {

        /* renamed from: s, reason: collision with root package name */
        public final androidx.lifecycle.i f464s;

        /* renamed from: t, reason: collision with root package name */
        public final i f465t;

        /* renamed from: u, reason: collision with root package name */
        public b f466u;

        public LifecycleOnBackPressedCancellable(androidx.lifecycle.i iVar, FragmentManager.c cVar) {
            this.f464s = iVar;
            this.f465t = cVar;
            iVar.a(this);
        }

        @Override // androidx.lifecycle.k
        public final void c(androidx.lifecycle.m mVar, i.b bVar) {
            if (bVar == i.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ArrayDeque<i> arrayDeque = onBackPressedDispatcher.f460b;
                i iVar = this.f465t;
                arrayDeque.add(iVar);
                b bVar2 = new b(iVar);
                iVar.f485b.add(bVar2);
                if (j0.a.c()) {
                    onBackPressedDispatcher.c();
                    iVar.f486c = onBackPressedDispatcher.f461c;
                }
                this.f466u = bVar2;
                return;
            }
            if (bVar == i.b.ON_STOP) {
                b bVar3 = this.f466u;
                if (bVar3 != null) {
                    bVar3.cancel();
                    return;
                }
                return;
            }
            if (bVar == i.b.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f464s.c(this);
            this.f465t.f485b.remove(this);
            b bVar = this.f466u;
            if (bVar != null) {
                bVar.cancel();
                this.f466u = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new l(runnable);
        }

        public static void b(Object obj, int i10, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.a {

        /* renamed from: s, reason: collision with root package name */
        public final i f468s;

        public b(i iVar) {
            this.f468s = iVar;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            ArrayDeque<i> arrayDeque = onBackPressedDispatcher.f460b;
            i iVar = this.f468s;
            arrayDeque.remove(iVar);
            iVar.f485b.remove(this);
            if (j0.a.c()) {
                iVar.f486c = null;
                onBackPressedDispatcher.c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.activity.j] */
    public OnBackPressedDispatcher(Runnable runnable) {
        this.f459a = runnable;
        if (j0.a.c()) {
            this.f461c = new m0.a() { // from class: androidx.activity.j
                @Override // m0.a
                public final void accept(Object obj) {
                    OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                    onBackPressedDispatcher.getClass();
                    if (j0.a.c()) {
                        onBackPressedDispatcher.c();
                    }
                }
            };
            this.f462d = a.a(new k(this, 0));
        }
    }

    @SuppressLint({"LambdaLast"})
    public final void a(androidx.lifecycle.m mVar, FragmentManager.c cVar) {
        androidx.lifecycle.i lifecycle = mVar.getLifecycle();
        if (lifecycle.b() == i.c.DESTROYED) {
            return;
        }
        cVar.f485b.add(new LifecycleOnBackPressedCancellable(lifecycle, cVar));
        if (j0.a.c()) {
            c();
            cVar.f486c = this.f461c;
        }
    }

    public final void b() {
        Iterator<i> descendingIterator = this.f460b.descendingIterator();
        while (descendingIterator.hasNext()) {
            i next = descendingIterator.next();
            if (next.f484a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f459a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z10;
        Iterator<i> descendingIterator = this.f460b.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (descendingIterator.next().f484a) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f463e;
        if (onBackInvokedDispatcher != null) {
            OnBackInvokedCallback onBackInvokedCallback = this.f462d;
            if (z10 && !this.f) {
                a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z10 && this.f) {
                a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }
}
