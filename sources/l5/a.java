package l5;

import k4.i0;

/* compiled from: BaseMediaChunk.java */
/* loaded from: classes2.dex */
public abstract class a extends l {

    /* renamed from: k, reason: collision with root package name */
    public final long f32484k;

    /* renamed from: l, reason: collision with root package name */
    public final long f32485l;

    /* renamed from: m, reason: collision with root package name */
    public c f32486m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f32487n;

    public a(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(jVar, mVar, i0Var, i10, obj, j10, j11, j14);
        this.f32484k = j12;
        this.f32485l = j13;
    }

    public final int d(int i10) {
        int[] iArr = this.f32487n;
        d6.a.e(iArr);
        return iArr[i10];
    }
}
