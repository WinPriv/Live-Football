package okio;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class m implements y {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0 f33856s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ OutputStream f33857t;

    public m(OutputStream outputStream, a0 a0Var) {
        this.f33856s = a0Var;
        this.f33857t = outputStream;
    }

    @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33857t.close();
    }

    @Override // okio.y, java.io.Flushable
    public final void flush() throws IOException {
        this.f33857t.flush();
    }

    @Override // okio.y
    public final a0 timeout() {
        return this.f33856s;
    }

    public final String toString() {
        return "sink(" + this.f33857t + ")";
    }

    @Override // okio.y
    public final void write(b bVar, long j10) throws IOException {
        b0.a(bVar.f33824t, 0L, j10);
        while (j10 > 0) {
            this.f33856s.throwIfReached();
            v vVar = bVar.f33823s;
            int min = (int) Math.min(j10, vVar.f33879c - vVar.f33878b);
            this.f33857t.write(vVar.f33877a, vVar.f33878b, min);
            int i10 = vVar.f33878b + min;
            vVar.f33878b = i10;
            long j11 = min;
            j10 -= j11;
            bVar.f33824t -= j11;
            if (i10 == vVar.f33879c) {
                bVar.f33823s = vVar.a();
                w.a(vVar);
            }
        }
    }
}
