package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    protected final ac f15903a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f15904b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f15905c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15906d;

    /* renamed from: e, reason: collision with root package name */
    private final v[] f15907e;
    private final long[] f;

    /* renamed from: g, reason: collision with root package name */
    private int f15908g;

    public b(ac acVar, int[] iArr, int i10) {
        boolean z10;
        int i11 = 0;
        int i12 = 1;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f15906d = i10;
        this.f15903a = (ac) com.applovin.exoplayer2.l.a.b(acVar);
        int length = iArr.length;
        this.f15904b = length;
        this.f15907e = new v[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f15907e[i13] = acVar.a(iArr[i13]);
        }
        Arrays.sort(this.f15907e, new com.applovin.exoplayer2.g.f.e(i12));
        this.f15905c = new int[this.f15904b];
        while (true) {
            int i14 = this.f15904b;
            if (i11 < i14) {
                this.f15905c[i11] = acVar.a(this.f15907e[i11]);
                i11++;
            } else {
                this.f = new long[i14];
                return;
            }
        }
    }

    @Override // com.applovin.exoplayer2.j.d
    public void a() {
    }

    @Override // com.applovin.exoplayer2.j.g
    public final ac d() {
        return this.f15903a;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final int e() {
        return this.f15905c.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15903a == bVar.f15903a && Arrays.equals(this.f15905c, bVar.f15905c)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.j.d
    public final v f() {
        return this.f15907e[c()];
    }

    public int hashCode() {
        if (this.f15908g == 0) {
            this.f15908g = Arrays.hashCode(this.f15905c) + (System.identityHashCode(this.f15903a) * 31);
        }
        return this.f15908g;
    }

    @Override // com.applovin.exoplayer2.j.d
    public void a(float f) {
    }

    @Override // com.applovin.exoplayer2.j.d
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, v vVar2) {
        return vVar2.f16834h - vVar.f16834h;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final int b(int i10) {
        return this.f15905c[i10];
    }

    @Override // com.applovin.exoplayer2.j.g
    public final v a(int i10) {
        return this.f15907e[i10];
    }
}
