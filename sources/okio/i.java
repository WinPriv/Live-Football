package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.java */
/* loaded from: classes2.dex */
public final class i extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public a0 f33841a;

    public i(a0 a0Var) {
        if (a0Var != null) {
            this.f33841a = a0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.a0
    public final a0 clearDeadline() {
        return this.f33841a.clearDeadline();
    }

    @Override // okio.a0
    public final a0 clearTimeout() {
        return this.f33841a.clearTimeout();
    }

    @Override // okio.a0
    public final long deadlineNanoTime() {
        return this.f33841a.deadlineNanoTime();
    }

    @Override // okio.a0
    public final boolean hasDeadline() {
        return this.f33841a.hasDeadline();
    }

    @Override // okio.a0
    public final void throwIfReached() throws IOException {
        this.f33841a.throwIfReached();
    }

    @Override // okio.a0
    public final a0 timeout(long j10, TimeUnit timeUnit) {
        return this.f33841a.timeout(j10, timeUnit);
    }

    @Override // okio.a0
    public final long timeoutNanos() {
        return this.f33841a.timeoutNanos();
    }

    @Override // okio.a0
    public final a0 deadlineNanoTime(long j10) {
        return this.f33841a.deadlineNanoTime(j10);
    }
}
