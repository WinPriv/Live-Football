package x5;

import d6.g0;
import java.util.Collections;
import java.util.List;
import r5.g;

/* compiled from: SubripSubtitle.java */
/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: s, reason: collision with root package name */
    public final r5.a[] f36480s;

    /* renamed from: t, reason: collision with root package name */
    public final long[] f36481t;

    public b(r5.a[] aVarArr, long[] jArr) {
        this.f36480s = aVarArr;
        this.f36481t = jArr;
    }

    @Override // r5.g
    public final int a(long j10) {
        long[] jArr = this.f36481t;
        int b10 = g0.b(jArr, j10, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // r5.g
    public final long b(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        long[] jArr = this.f36481t;
        if (i10 >= jArr.length) {
            z11 = false;
        }
        d6.a.a(z11);
        return jArr[i10];
    }

    @Override // r5.g
    public final List<r5.a> c(long j10) {
        r5.a aVar;
        int f = g0.f(this.f36481t, j10, false);
        if (f != -1 && (aVar = this.f36480s[f]) != r5.a.J) {
            return Collections.singletonList(aVar);
        }
        return Collections.emptyList();
    }

    @Override // r5.g
    public final int d() {
        return this.f36481t.length;
    }
}
