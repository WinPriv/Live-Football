package b2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import r1.k;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final s1.b f2810s = new s1.b();

    public static void a(s1.j jVar, String str) {
        boolean z10;
        WorkDatabase workDatabase = jVar.f35074c;
        a2.p n10 = workDatabase.n();
        a2.b i10 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z10 = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            a2.q qVar = (a2.q) n10;
            r1.l f = qVar.f(str2);
            if (f != r1.l.SUCCEEDED && f != r1.l.FAILED) {
                qVar.n(r1.l.CANCELLED, str2);
            }
            linkedList.addAll(((a2.c) i10).a(str2));
        }
        s1.c cVar = jVar.f;
        synchronized (cVar.C) {
            r1.h.c().a(s1.c.D, String.format("Processor cancelling %s", str), new Throwable[0]);
            cVar.A.add(str);
            s1.m mVar = (s1.m) cVar.f35056x.remove(str);
            if (mVar != null) {
                z10 = true;
            }
            if (mVar == null) {
                mVar = (s1.m) cVar.y.remove(str);
            }
            s1.c.c(str, mVar);
            if (z10) {
                cVar.g();
            }
        }
        Iterator<s1.d> it = jVar.f35076e.iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        s1.b bVar = this.f2810s;
        try {
            b();
            bVar.a(r1.k.f34825a);
        } catch (Throwable th) {
            bVar.a(new k.a.C0468a(th));
        }
    }
}
