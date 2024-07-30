package r1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f34798a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34799b;

    public a(boolean z10) {
        this.f34799b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f34799b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(this.f34798a.incrementAndGet());
        return new Thread(runnable, j10.toString());
    }
}
