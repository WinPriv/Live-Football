package e2;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: ConstraintTrackingWorker.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m7.a f27661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f27662t;

    public b(ConstraintTrackingWorker constraintTrackingWorker, m7.a aVar) {
        this.f27662t = constraintTrackingWorker;
        this.f27661s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f27662t.y) {
            if (this.f27662t.f2695z) {
                ConstraintTrackingWorker constraintTrackingWorker = this.f27662t;
                constraintTrackingWorker.getClass();
                constraintTrackingWorker.A.i(new ListenableWorker.a.b());
            } else {
                this.f27662t.A.k(this.f27661s);
            }
        }
    }
}
