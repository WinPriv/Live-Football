package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: AsyncTimeout.java */
/* loaded from: classes2.dex */
public class a extends a0 {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @Nullable
    static a head;
    private boolean inQueue;

    @Nullable
    private a next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.java */
    /* renamed from: okio.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0451a implements y {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ y f33818s;

        public C0451a(y yVar) {
            this.f33818s = yVar;
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            a aVar = a.this;
            aVar.enter();
            try {
                try {
                    this.f33818s.close();
                    aVar.exit(true);
                } catch (IOException e10) {
                    throw aVar.exit(e10);
                }
            } catch (Throwable th) {
                aVar.exit(false);
                throw th;
            }
        }

        @Override // okio.y, java.io.Flushable
        public final void flush() throws IOException {
            a aVar = a.this;
            aVar.enter();
            try {
                try {
                    this.f33818s.flush();
                    aVar.exit(true);
                } catch (IOException e10) {
                    throw aVar.exit(e10);
                }
            } catch (Throwable th) {
                aVar.exit(false);
                throw th;
            }
        }

        @Override // okio.y
        public final a0 timeout() {
            return a.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f33818s + ")";
        }

        @Override // okio.y
        public final void write(okio.b bVar, long j10) throws IOException {
            b0.a(bVar.f33824t, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    v vVar = bVar.f33823s;
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += vVar.f33879c - vVar.f33878b;
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        }
                        vVar = vVar.f;
                    }
                    a aVar = a.this;
                    aVar.enter();
                    try {
                        try {
                            this.f33818s.write(bVar, j11);
                            j10 -= j11;
                            aVar.exit(true);
                        } catch (IOException e10) {
                            throw aVar.exit(e10);
                        }
                    } catch (Throwable th) {
                        aVar.exit(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.java */
    /* loaded from: classes2.dex */
    public class b implements z {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ z f33820s;

        public b(z zVar) {
            this.f33820s = zVar;
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            a aVar = a.this;
            aVar.enter();
            try {
                try {
                    this.f33820s.close();
                    aVar.exit(true);
                } catch (IOException e10) {
                    throw aVar.exit(e10);
                }
            } catch (Throwable th) {
                aVar.exit(false);
                throw th;
            }
        }

        @Override // okio.z
        public final long read(okio.b bVar, long j10) throws IOException {
            a aVar = a.this;
            aVar.enter();
            try {
                try {
                    long read = this.f33820s.read(bVar, j10);
                    aVar.exit(true);
                    return read;
                } catch (IOException e10) {
                    throw aVar.exit(e10);
                }
            } catch (Throwable th) {
                aVar.exit(false);
                throw th;
            }
        }

        @Override // okio.z
        public final a0 timeout() {
            return a.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f33820s + ")";
        }
    }

    /* compiled from: AsyncTimeout.java */
    /* loaded from: classes2.dex */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<okio.a> r0 = okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.a r1 = okio.a.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                okio.a r2 = okio.a.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                okio.a.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static a awaitTimeout() throws InterruptedException {
        a aVar = head.next;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = aVar.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j10 = remainingNanos / 1000000;
            a.class.wait(j10, (int) (remainingNanos - (1000000 * j10)));
            return null;
        }
        head.next = aVar.next;
        aVar.next = null;
        return aVar;
    }

    private static synchronized boolean cancelScheduledTimeout(a aVar) {
        synchronized (a.class) {
            a aVar2 = head;
            while (aVar2 != null) {
                a aVar3 = aVar2.next;
                if (aVar3 == aVar) {
                    aVar2.next = aVar.next;
                    aVar.next = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    private long remainingNanos(long j10) {
        return this.timeoutAt - j10;
    }

    private static synchronized void scheduleTimeout(a aVar, long j10, boolean z10) {
        synchronized (a.class) {
            if (head == null) {
                head = new a();
                new c().start();
            }
            long nanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                aVar.timeoutAt = Math.min(j10, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j10 != 0) {
                aVar.timeoutAt = j10 + nanoTime;
            } else if (z10) {
                aVar.timeoutAt = aVar.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = aVar.remainingNanos(nanoTime);
            a aVar2 = head;
            while (true) {
                a aVar3 = aVar2.next;
                if (aVar3 == null || remainingNanos < aVar3.remainingNanos(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.next;
                }
            }
            aVar.next = aVar2.next;
            aVar2.next = aVar;
            if (aVar2 == head) {
                a.class.notify();
            }
        }
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos == 0 && !hasDeadline) {
                return;
            }
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y sink(y yVar) {
        return new C0451a(yVar);
    }

    public final z source(z zVar) {
        return new b(zVar);
    }

    public final void exit(boolean z10) throws IOException {
        if (exit() && z10) {
            throw newTimeoutException(null);
        }
    }

    public final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    public void timedOut() {
    }
}
