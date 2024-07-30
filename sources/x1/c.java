package x1;

import a2.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements w1.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f36265a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public T f36266b;

    /* renamed from: c, reason: collision with root package name */
    public final y1.d<T> f36267c;

    /* renamed from: d, reason: collision with root package name */
    public a f36268d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c(y1.d<T> dVar) {
        this.f36267c = dVar;
    }

    @Override // w1.a
    public final void a(T t10) {
        this.f36266b = t10;
        e(this.f36268d, t10);
    }

    public abstract boolean b(o oVar);

    public abstract boolean c(T t10);

    public final void d(Collection collection) {
        this.f36265a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (b(oVar)) {
                this.f36265a.add(oVar.f56a);
            }
        }
        if (this.f36265a.isEmpty()) {
            y1.d<T> dVar = this.f36267c;
            synchronized (dVar.f36532c) {
                if (dVar.f36533d.remove(this) && dVar.f36533d.isEmpty()) {
                    dVar.d();
                }
            }
        } else {
            y1.d<T> dVar2 = this.f36267c;
            synchronized (dVar2.f36532c) {
                if (dVar2.f36533d.add(this)) {
                    if (dVar2.f36533d.size() == 1) {
                        dVar2.f36534e = dVar2.a();
                        r1.h.c().a(y1.d.f, String.format("%s: initial state = %s", dVar2.getClass().getSimpleName(), dVar2.f36534e), new Throwable[0]);
                        dVar2.c();
                    }
                    a(dVar2.f36534e);
                }
            }
        }
        e(this.f36268d, this.f36266b);
    }

    public final void e(a aVar, T t10) {
        if (!this.f36265a.isEmpty() && aVar != null) {
            if (t10 != null && !c(t10)) {
                ArrayList arrayList = this.f36265a;
                w1.d dVar = (w1.d) aVar;
                synchronized (dVar.f36041c) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (dVar.a(str)) {
                            r1.h.c().a(w1.d.f36038d, String.format("Constraints met for %s", str), new Throwable[0]);
                            arrayList2.add(str);
                        }
                    }
                    w1.c cVar = dVar.f36039a;
                    if (cVar != null) {
                        cVar.e(arrayList2);
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.f36265a;
            w1.d dVar2 = (w1.d) aVar;
            synchronized (dVar2.f36041c) {
                w1.c cVar2 = dVar2.f36039a;
                if (cVar2 != null) {
                    cVar2.c(arrayList3);
                }
            }
        }
    }
}
