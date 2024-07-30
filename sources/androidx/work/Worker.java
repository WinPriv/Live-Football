package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: x, reason: collision with root package name */
    public c2.c<ListenableWorker.a> f2598x;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final c2.c d() {
        this.f2598x = new c2.c<>();
        this.f2591t.f2601c.execute(new c(this));
        return this.f2598x;
    }

    public abstract ListenableWorker.a g();
}
