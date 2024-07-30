package w4;

import android.util.Pair;
import d6.g0;
import p4.u;
import p4.v;

/* compiled from: MlltSeeker.java */
/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f36080a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f36081b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36082c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f36080a = jArr;
        this.f36081b = jArr2;
        this.f36082c = j10 == com.anythink.expressad.exoplayer.b.f7291b ? g0.J(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int f = g0.f(jArr, j10, true);
        long j11 = jArr[f];
        long j12 = jArr2[f];
        int i10 = f + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (j10 - j11) / (j13 - j11);
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * (j14 - j12))) + j12));
    }

    @Override // w4.e
    public final long a(long j10) {
        return g0.J(((Long) c(j10, this.f36080a, this.f36081b).second).longValue());
    }

    @Override // w4.e
    public final long b() {
        return -1L;
    }

    @Override // p4.u
    public final boolean e() {
        return true;
    }

    @Override // p4.u
    public final u.a h(long j10) {
        Pair<Long, Long> c10 = c(g0.S(g0.i(j10, 0L, this.f36082c)), this.f36081b, this.f36080a);
        v vVar = new v(g0.J(((Long) c10.first).longValue()), ((Long) c10.second).longValue());
        return new u.a(vVar, vVar);
    }

    @Override // p4.u
    public final long i() {
        return this.f36082c;
    }
}
