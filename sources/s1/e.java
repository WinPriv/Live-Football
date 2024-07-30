package s1;

import a2.o;
import a2.p;
import a2.q;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35061a = r1.h.e("Schedulers");

    public static void a(androidx.work.a aVar, WorkDatabase workDatabase, List<d> list) {
        if (list != null && list.size() != 0) {
            p n10 = workDatabase.n();
            workDatabase.c();
            try {
                q qVar = (q) n10;
                ArrayList c10 = qVar.c(aVar.f2612h);
                ArrayList b10 = qVar.b();
                if (c10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c10.iterator();
                    while (it.hasNext()) {
                        qVar.k(currentTimeMillis, ((o) it.next()).f56a);
                    }
                }
                workDatabase.h();
                workDatabase.f();
                if (c10.size() > 0) {
                    o[] oVarArr = (o[]) c10.toArray(new o[c10.size()]);
                    for (d dVar : list) {
                        if (dVar.a()) {
                            dVar.d(oVarArr);
                        }
                    }
                }
                if (b10.size() > 0) {
                    o[] oVarArr2 = (o[]) b10.toArray(new o[b10.size()]);
                    for (d dVar2 : list) {
                        if (!dVar2.a()) {
                            dVar2.d(oVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
