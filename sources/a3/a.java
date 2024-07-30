package a3;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* compiled from: ActiveResources.java */
    /* renamed from: a3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0004a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Runnable f86s;

        public RunnableC0004a(Runnable runnable) {
            this.f86s = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f86s.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0004a(runnable), "glide-active-resources");
    }
}
