package t1;

import a2.o;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import b2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r1.h;
import r1.l;
import s1.d;
import s1.j;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public final class c implements d, w1.c, s1.a {
    public static final String A = h.e("GreedyScheduler");

    /* renamed from: s, reason: collision with root package name */
    public final Context f35371s;

    /* renamed from: t, reason: collision with root package name */
    public final j f35372t;

    /* renamed from: u, reason: collision with root package name */
    public final w1.d f35373u;

    /* renamed from: w, reason: collision with root package name */
    public final b f35375w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35376x;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f35377z;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f35374v = new HashSet();
    public final Object y = new Object();

    public c(Context context, androidx.work.a aVar, d2.b bVar, j jVar) {
        this.f35371s = context;
        this.f35372t = jVar;
        this.f35373u = new w1.d(context, bVar, this);
        this.f35375w = new b(this, aVar.f2610e);
    }

    @Override // s1.d
    public final boolean a() {
        return false;
    }

    @Override // s1.a
    public final void b(String str, boolean z10) {
        synchronized (this.y) {
            Iterator it = this.f35374v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f56a.equals(str)) {
                    h.c().a(A, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f35374v.remove(oVar);
                    this.f35373u.b(this.f35374v);
                    break;
                }
            }
        }
    }

    @Override // w1.c
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h.c().a(A, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f35372t.g(str);
        }
    }

    @Override // s1.d
    public final void cancel(String str) {
        Runnable runnable;
        Boolean bool = this.f35377z;
        j jVar = this.f35372t;
        if (bool == null) {
            this.f35377z = Boolean.valueOf(k.a(this.f35371s, jVar.f35073b));
        }
        boolean booleanValue = this.f35377z.booleanValue();
        String str2 = A;
        if (!booleanValue) {
            h.c().d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f35376x) {
            jVar.f.a(this);
            this.f35376x = true;
        }
        h.c().a(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        b bVar = this.f35375w;
        if (bVar != null && (runnable = (Runnable) bVar.f35370c.remove(str)) != null) {
            ((Handler) bVar.f35369b.f27251t).removeCallbacks(runnable);
        }
        jVar.g(str);
    }

    @Override // s1.d
    public final void d(o... oVarArr) {
        boolean z10;
        if (this.f35377z == null) {
            this.f35377z = Boolean.valueOf(k.a(this.f35371s, this.f35372t.f35073b));
        }
        if (!this.f35377z.booleanValue()) {
            h.c().d(A, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f35376x) {
            this.f35372t.f.a(this);
            this.f35376x = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o oVar : oVarArr) {
            long a10 = oVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (oVar.f57b == l.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    b bVar = this.f35375w;
                    if (bVar != null) {
                        HashMap hashMap = bVar.f35370c;
                        Runnable runnable = (Runnable) hashMap.remove(oVar.f56a);
                        d0.b bVar2 = bVar.f35369b;
                        if (runnable != null) {
                            ((Handler) bVar2.f27251t).removeCallbacks(runnable);
                        }
                        a aVar = new a(bVar, oVar);
                        hashMap.put(oVar.f56a, aVar);
                        ((Handler) bVar2.f27251t).postDelayed(aVar, oVar.a() - System.currentTimeMillis());
                    }
                } else if (oVar.b()) {
                    r1.b bVar3 = oVar.f64j;
                    if (bVar3.f34803c) {
                        h.c().a(A, String.format("Ignoring WorkSpec %s, Requires device idle.", oVar), new Throwable[0]);
                    } else {
                        if (bVar3.f34807h.f34810a.size() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            h.c().a(A, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", oVar), new Throwable[0]);
                        } else {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.f56a);
                        }
                    }
                } else {
                    h.c().a(A, String.format("Starting work for %s", oVar.f56a), new Throwable[0]);
                    this.f35372t.f(oVar.f56a, null);
                }
            }
        }
        synchronized (this.y) {
            if (!hashSet.isEmpty()) {
                h.c().a(A, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f35374v.addAll(hashSet);
                this.f35373u.b(this.f35374v);
            }
        }
    }

    @Override // w1.c
    public final void e(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h.c().a(A, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f35372t.f(str, null);
        }
    }
}
