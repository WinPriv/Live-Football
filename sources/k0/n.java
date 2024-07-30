package k0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class n implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f30279a = "fonts-androidx";

    /* renamed from: b, reason: collision with root package name */
    public final int f30280b = 10;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: s, reason: collision with root package name */
        public final int f30281s;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f30281s = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f30281s);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f30279a, this.f30280b);
    }
}
