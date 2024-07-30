package okio;

import java.io.IOException;

/* compiled from: PeekSource.java */
/* loaded from: classes2.dex */
public final class s implements z {

    /* renamed from: s, reason: collision with root package name */
    public final d f33864s;

    /* renamed from: t, reason: collision with root package name */
    public final b f33865t;

    /* renamed from: u, reason: collision with root package name */
    public v f33866u;

    /* renamed from: v, reason: collision with root package name */
    public int f33867v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33868w;

    /* renamed from: x, reason: collision with root package name */
    public long f33869x;

    public s(d dVar) {
        int i10;
        this.f33864s = dVar;
        b n10 = dVar.n();
        this.f33865t = n10;
        v vVar = n10.f33823s;
        this.f33866u = vVar;
        if (vVar != null) {
            i10 = vVar.f33878b;
        } else {
            i10 = -1;
        }
        this.f33867v = i10;
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33868w = true;
    }

    @Override // okio.z
    public final long read(b bVar, long j10) throws IOException {
        v vVar;
        v vVar2;
        if (j10 >= 0) {
            if (!this.f33868w) {
                v vVar3 = this.f33866u;
                b bVar2 = this.f33865t;
                if (vVar3 != null && (vVar3 != (vVar2 = bVar2.f33823s) || this.f33867v != vVar2.f33878b)) {
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
                if (j10 == 0) {
                    return 0L;
                }
                if (!this.f33864s.L(this.f33869x + 1)) {
                    return -1L;
                }
                if (this.f33866u == null && (vVar = bVar2.f33823s) != null) {
                    this.f33866u = vVar;
                    this.f33867v = vVar.f33878b;
                }
                long min = Math.min(j10, bVar2.f33824t - this.f33869x);
                this.f33865t.e(this.f33869x, bVar, min);
                this.f33869x += min;
                return min;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }

    @Override // okio.z
    public final a0 timeout() {
        return this.f33864s.timeout();
    }
}
