package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import e2.a;
import java.util.ArrayList;
import java.util.List;
import r1.h;
import w1.c;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String C = h.e("ConstraintTrkngWrkr");
    public final c2.c<ListenableWorker.a> A;
    public ListenableWorker B;

    /* renamed from: x, reason: collision with root package name */
    public final WorkerParameters f2694x;
    public final Object y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f2695z;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2694x = workerParameters;
        this.y = new Object();
        this.f2695z = false;
        this.A = new c2.c<>();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean a() {
        ListenableWorker listenableWorker = this.B;
        if (listenableWorker != null && listenableWorker.a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void b() {
        ListenableWorker listenableWorker = this.B;
        if (listenableWorker != null && !listenableWorker.f2592u) {
            this.B.f();
        }
    }

    @Override // w1.c
    public final void c(ArrayList arrayList) {
        h.c().a(C, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.y) {
            this.f2695z = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final c2.c d() {
        this.f2591t.f2601c.execute(new a(this));
        return this.A;
    }

    @Override // w1.c
    public final void e(List<String> list) {
    }
}
