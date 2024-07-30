package l5;

import k4.i0;

/* compiled from: MediaChunk.java */
/* loaded from: classes2.dex */
public abstract class l extends e {

    /* renamed from: j, reason: collision with root package name */
    public final long f32536j;

    public l(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(jVar, mVar, 1, i0Var, i10, obj, j10, j11);
        i0Var.getClass();
        this.f32536j = j12;
    }

    public long b() {
        long j10 = this.f32536j;
        if (j10 == -1) {
            return -1L;
        }
        return 1 + j10;
    }

    public abstract boolean c();
}
