package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.b;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<m> f1985c;

    /* renamed from: a, reason: collision with root package name */
    public k.a<l, a> f1983a = new k.a<>();

    /* renamed from: d, reason: collision with root package name */
    public int f1986d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1987e = false;
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<i.c> f1988g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public i.c f1984b = i.c.INITIALIZED;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1989h = true;

    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public i.c f1990a;

        /* renamed from: b, reason: collision with root package name */
        public final k f1991b;

        public a(l lVar, i.c cVar) {
            k reflectiveGenericLifecycleObserver;
            HashMap hashMap = p.f1992a;
            boolean z10 = lVar instanceof k;
            boolean z11 = lVar instanceof e;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((e) lVar, (k) lVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((e) lVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (k) lVar;
            } else {
                Class<?> cls = lVar.getClass();
                if (p.c(cls) == 2) {
                    List list = (List) p.f1993b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(p.a((Constructor) list.get(0), lVar));
                    } else {
                        f[] fVarArr = new f[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            fVarArr[i10] = p.a((Constructor) list.get(i10), lVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(fVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lVar);
                }
            }
            this.f1991b = reflectiveGenericLifecycleObserver;
            this.f1990a = cVar;
        }

        public final void a(m mVar, i.b bVar) {
            i.c k10 = bVar.k();
            i.c cVar = this.f1990a;
            if (k10.compareTo(cVar) < 0) {
                cVar = k10;
            }
            this.f1990a = cVar;
            this.f1991b.c(mVar, bVar);
            this.f1990a = k10;
        }
    }

    public n(m mVar) {
        this.f1985c = new WeakReference<>(mVar);
    }

    @Override // androidx.lifecycle.i
    public final void a(l lVar) {
        m mVar;
        boolean z10;
        i.b bVar;
        e("addObserver");
        i.c cVar = this.f1984b;
        i.c cVar2 = i.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = i.c.INITIALIZED;
        }
        a aVar = new a(lVar, cVar2);
        if (this.f1983a.b(lVar, aVar) != null || (mVar = this.f1985c.get()) == null) {
            return;
        }
        if (this.f1986d == 0 && !this.f1987e) {
            z10 = false;
        } else {
            z10 = true;
        }
        i.c d10 = d(lVar);
        this.f1986d++;
        while (aVar.f1990a.compareTo(d10) < 0 && this.f1983a.f30229w.containsKey(lVar)) {
            i.c cVar3 = aVar.f1990a;
            ArrayList<i.c> arrayList = this.f1988g;
            arrayList.add(cVar3);
            int ordinal = aVar.f1990a.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        bVar = null;
                    } else {
                        bVar = i.b.ON_RESUME;
                    }
                } else {
                    bVar = i.b.ON_START;
                }
            } else {
                bVar = i.b.ON_CREATE;
            }
            if (bVar != null) {
                aVar.a(mVar, bVar);
                arrayList.remove(arrayList.size() - 1);
                d10 = d(lVar);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f1990a);
            }
        }
        if (!z10) {
            h();
        }
        this.f1986d--;
    }

    @Override // androidx.lifecycle.i
    public final i.c b() {
        return this.f1984b;
    }

    @Override // androidx.lifecycle.i
    public final void c(l lVar) {
        e("removeObserver");
        this.f1983a.c(lVar);
    }

    public final i.c d(l lVar) {
        b.c<l, a> cVar;
        i.c cVar2;
        k.a<l, a> aVar = this.f1983a;
        i.c cVar3 = null;
        if (aVar.f30229w.containsKey(lVar)) {
            cVar = aVar.f30229w.get(lVar).f30237v;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2 = cVar.f30235t.f1990a;
        } else {
            cVar2 = null;
        }
        ArrayList<i.c> arrayList = this.f1988g;
        if (!arrayList.isEmpty()) {
            cVar3 = arrayList.get(arrayList.size() - 1);
        }
        i.c cVar4 = this.f1984b;
        if (cVar2 == null || cVar2.compareTo(cVar4) >= 0) {
            cVar2 = cVar4;
        }
        if (cVar3 == null || cVar3.compareTo(cVar2) >= 0) {
            return cVar2;
        }
        return cVar3;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        boolean z10;
        if (this.f1989h) {
            j.a.i().f29554v.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(a3.k.l("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void f(i.b bVar) {
        e("handleLifecycleEvent");
        g(bVar.k());
    }

    public final void g(i.c cVar) {
        i.c cVar2 = this.f1984b;
        if (cVar2 == cVar) {
            return;
        }
        i.c cVar3 = i.c.INITIALIZED;
        i.c cVar4 = i.c.DESTROYED;
        if (cVar2 == cVar3 && cVar == cVar4) {
            throw new IllegalStateException("no event down from " + this.f1984b);
        }
        this.f1984b = cVar;
        if (!this.f1987e && this.f1986d == 0) {
            this.f1987e = true;
            h();
            this.f1987e = false;
            if (this.f1984b == cVar4) {
                this.f1983a = new k.a<>();
                return;
            }
            return;
        }
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f7, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.n.h():void");
    }
}
