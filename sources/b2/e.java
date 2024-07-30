package b2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import r1.k;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final String f2811u = r1.h.e("EnqueueRunnable");

    /* renamed from: s, reason: collision with root package name */
    public final s1.f f2812s;

    /* renamed from: t, reason: collision with root package name */
    public final s1.b f2813t = new s1.b();

    public e(s1.f fVar) {
        this.f2812s = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(s1.f r26) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.e.a(s1.f):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1.b bVar = this.f2813t;
        s1.f fVar = this.f2812s;
        try {
            fVar.getClass();
            s1.j jVar = fVar.f35062v;
            if (!s1.f.j(fVar, new HashSet())) {
                WorkDatabase workDatabase = jVar.f35074c;
                workDatabase.c();
                try {
                    boolean a10 = a(fVar);
                    workDatabase.h();
                    if (a10) {
                        i.a(jVar.f35072a, RescheduleReceiver.class, true);
                        s1.e.a(jVar.f35073b, jVar.f35074c, jVar.f35076e);
                    }
                    bVar.a(r1.k.f34825a);
                    return;
                } finally {
                    workDatabase.f();
                }
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", fVar));
        } catch (Throwable th) {
            bVar.a(new k.a.C0468a(th));
        }
    }
}
