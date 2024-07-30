package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.java */
/* loaded from: classes2.dex */
public class a0 {
    public static final a0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static long minTimeout(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        if (j10 < j11) {
            return j10;
        }
        return j11;
    }

    public a0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public a0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final a0 deadline(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            if (timeUnit != null) {
                return deadlineNanoTime(timeUnit.toNanos(j10) + System.nanoTime());
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(a3.k.k("duration <= 0: ", j10));
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public void throwIfReached() throws IOException {
        if (!Thread.interrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public a0 timeout(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit != null) {
                this.timeoutNanos = timeUnit.toNanos(j10);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(a3.k.k("timeout < 0: ", j10));
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j10 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j11 = timeoutNanos / 1000000;
                obj.wait(j11, (int) (timeoutNanos - (1000000 * j11)));
                j10 = System.nanoTime() - nanoTime;
            }
            if (j10 < timeoutNanos) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public a0 deadlineNanoTime(long j10) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j10;
        return this;
    }

    /* compiled from: Timeout.java */
    /* loaded from: classes2.dex */
    public class a extends a0 {
        @Override // okio.a0
        public final void throwIfReached() throws IOException {
        }

        @Override // okio.a0
        public final a0 deadlineNanoTime(long j10) {
            return this;
        }

        @Override // okio.a0
        public final a0 timeout(long j10, TimeUnit timeUnit) {
            return this;
        }
    }
}
