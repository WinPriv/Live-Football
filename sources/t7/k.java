package t7;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes2.dex */
public final class k implements Executor {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f35543x = Logger.getLogger(k.class.getName());

    /* renamed from: s, reason: collision with root package name */
    public final Executor f35544s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque f35545t = new ArrayDeque();

    /* renamed from: u, reason: collision with root package name */
    public int f35546u = 1;

    /* renamed from: v, reason: collision with root package name */
    public long f35547v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final b f35548w = new b();

    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Runnable f35549s;

        public a(Runnable runnable) {
            this.f35549s = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35549s.run();
        }

        public final String toString() {
            return this.f35549s.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes2.dex */
    public final class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        @CheckForNull
        public Runnable f35550s;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r10.f35550s.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        
            r10.f35550s = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            t7.k.f35543x.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f35550s, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                r1 = r0
            L2:
                t7.k r2 = t7.k.this     // Catch: java.lang.Throwable -> L76
                java.util.ArrayDeque r2 = r2.f35545t     // Catch: java.lang.Throwable -> L76
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L76
                r3 = 1
                if (r0 != 0) goto L26
                t7.k r0 = t7.k.this     // Catch: java.lang.Throwable -> L73
                int r4 = r0.f35546u     // Catch: java.lang.Throwable -> L73
                r5 = 4
                if (r4 != r5) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r6 = r0.f35547v     // Catch: java.lang.Throwable -> L73
                r8 = 1
                long r6 = r6 + r8
                r0.f35547v = r6     // Catch: java.lang.Throwable -> L73
                r0.f35546u = r5     // Catch: java.lang.Throwable -> L73
                r0 = r3
            L26:
                t7.k r4 = t7.k.this     // Catch: java.lang.Throwable -> L73
                java.util.ArrayDeque r4 = r4.f35545t     // Catch: java.lang.Throwable -> L73
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L73
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L73
                r10.f35550s = r4     // Catch: java.lang.Throwable -> L73
                if (r4 != 0) goto L43
                t7.k r0 = t7.k.this     // Catch: java.lang.Throwable -> L73
                r0.f35546u = r3     // Catch: java.lang.Throwable -> L73
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                if (r1 == 0) goto L42
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L42:
                return
            L43:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L76
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r10.f35550s     // Catch: java.lang.Throwable -> L50 java.lang.RuntimeException -> L52
                r3.run()     // Catch: java.lang.Throwable -> L50 java.lang.RuntimeException -> L52
                goto L6d
            L50:
                r0 = move-exception
                goto L70
            L52:
                r3 = move-exception
                java.util.logging.Logger r4 = t7.k.f35543x     // Catch: java.lang.Throwable -> L50
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L50
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
                r6.<init>()     // Catch: java.lang.Throwable -> L50
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L50
                java.lang.Runnable r7 = r10.f35550s     // Catch: java.lang.Throwable -> L50
                r6.append(r7)     // Catch: java.lang.Throwable -> L50
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L50
            L6d:
                r10.f35550s = r2     // Catch: java.lang.Throwable -> L76
                goto L2
            L70:
                r10.f35550s = r2     // Catch: java.lang.Throwable -> L76
                throw r0     // Catch: java.lang.Throwable -> L76
            L73:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
                throw r0     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                if (r1 == 0) goto L80
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L80:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t7.k.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f35545t) {
                    k.this.f35546u = 1;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f35550s;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + e0.i.t(k.this.f35546u) + "}";
        }
    }

    public k(Executor executor) {
        this.f35544s = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f35545t) {
            int i10 = this.f35546u;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f35547v;
                a aVar = new a(runnable);
                this.f35545t.add(aVar);
                this.f35546u = 2;
                boolean z10 = true;
                try {
                    this.f35544s.execute(this.f35548w);
                    if (this.f35546u == 2) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                    synchronized (this.f35545t) {
                        if (this.f35547v == j10 && this.f35546u == 2) {
                            this.f35546u = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f35545t) {
                        int i11 = this.f35546u;
                        if ((i11 != 1 && i11 != 2) || !this.f35545t.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f35545t.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f35544s + "}";
    }
}
