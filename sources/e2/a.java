package e2;

import a2.o;
import a2.q;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c2.c;
import java.util.Collections;
import r1.h;
import s1.j;
import w1.d;

/* compiled from: ConstraintTrackingWorker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f27660s;

    public a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f27660s = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ConstraintTrackingWorker constraintTrackingWorker = this.f27660s;
        Object obj = constraintTrackingWorker.f2591t.f2600b.f2615a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            h.c().b(ConstraintTrackingWorker.C, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.A.i(new ListenableWorker.a.C0023a());
            return;
        }
        ListenableWorker a10 = constraintTrackingWorker.f2591t.f2602d.a(constraintTrackingWorker.f2590s, str, constraintTrackingWorker.f2694x);
        constraintTrackingWorker.B = a10;
        if (a10 == null) {
            h.c().a(ConstraintTrackingWorker.C, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.A.i(new ListenableWorker.a.C0023a());
            return;
        }
        o i10 = ((q) j.b(constraintTrackingWorker.f2590s).f35074c.n()).i(constraintTrackingWorker.f2591t.f2599a.toString());
        if (i10 == null) {
            constraintTrackingWorker.A.i(new ListenableWorker.a.C0023a());
            return;
        }
        Context context = constraintTrackingWorker.f2590s;
        d dVar = new d(context, j.b(context).f35075d, constraintTrackingWorker);
        dVar.b(Collections.singletonList(i10));
        if (dVar.a(constraintTrackingWorker.f2591t.f2599a.toString())) {
            h.c().a(ConstraintTrackingWorker.C, String.format("Constraints met for delegate %s", str), new Throwable[0]);
            try {
                c d10 = constraintTrackingWorker.B.d();
                d10.a(new b(constraintTrackingWorker, d10), constraintTrackingWorker.f2591t.f2601c);
                return;
            } catch (Throwable th) {
                h c10 = h.c();
                String str2 = ConstraintTrackingWorker.C;
                c10.a(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
                synchronized (constraintTrackingWorker.y) {
                    if (constraintTrackingWorker.f2695z) {
                        h.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.A.i(new ListenableWorker.a.b());
                    } else {
                        constraintTrackingWorker.A.i(new ListenableWorker.a.C0023a());
                    }
                    return;
                }
            }
        }
        h.c().a(ConstraintTrackingWorker.C, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
        constraintTrackingWorker.A.i(new ListenableWorker.a.b());
    }
}
