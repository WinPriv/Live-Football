package w1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import r1.h;
import x1.c;
import x1.e;
import x1.f;
import x1.g;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public final class d implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f36038d = h.e("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final c f36039a;

    /* renamed from: b, reason: collision with root package name */
    public final x1.c<?>[] f36040b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36041c;

    public d(Context context, d2.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f36039a = cVar;
        this.f36040b = new x1.c[]{new x1.a(applicationContext, aVar), new x1.b(applicationContext, aVar), new x1.h(applicationContext, aVar), new x1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f36041c = new Object();
    }

    public final boolean a(String str) {
        boolean z10;
        synchronized (this.f36041c) {
            for (x1.c<?> cVar : this.f36040b) {
                Object obj = cVar.f36266b;
                if (obj != null && cVar.c(obj) && cVar.f36265a.contains(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    h.c().a(f36038d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f36041c) {
            for (x1.c<?> cVar : this.f36040b) {
                if (cVar.f36268d != null) {
                    cVar.f36268d = null;
                    cVar.e(null, cVar.f36266b);
                }
            }
            for (x1.c<?> cVar2 : this.f36040b) {
                cVar2.d(collection);
            }
            for (x1.c<?> cVar3 : this.f36040b) {
                if (cVar3.f36268d != this) {
                    cVar3.f36268d = this;
                    cVar3.e(this, cVar3.f36266b);
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f36041c) {
            for (x1.c<?> cVar : this.f36040b) {
                ArrayList arrayList = cVar.f36265a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    y1.d<?> dVar = cVar.f36267c;
                    synchronized (dVar.f36532c) {
                        if (dVar.f36533d.remove(cVar) && dVar.f36533d.isEmpty()) {
                            dVar.d();
                        }
                    }
                }
            }
        }
    }
}
