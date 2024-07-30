package a6;

import com.applovin.exoplayer2.j.m;
import d6.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes2.dex */
public final class i implements r5.g {

    /* renamed from: s, reason: collision with root package name */
    public final List<e> f349s;

    /* renamed from: t, reason: collision with root package name */
    public final long[] f350t;

    /* renamed from: u, reason: collision with root package name */
    public final long[] f351u;

    public i(ArrayList arrayList) {
        this.f349s = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f350t = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e eVar = (e) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f350t;
            jArr[i11] = eVar.f321b;
            jArr[i11 + 1] = eVar.f322c;
        }
        long[] jArr2 = this.f350t;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f351u = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // r5.g
    public final int a(long j10) {
        long[] jArr = this.f351u;
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
        long[] jArr = this.f351u;
        if (i10 >= jArr.length) {
            z11 = false;
        }
        d6.a.a(z11);
        return jArr[i10];
    }

    @Override // r5.g
    public final List<r5.a> c(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List<e> list = this.f349s;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f350t;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = list.get(i10);
                r5.a aVar = eVar.f320a;
                if (aVar.f34898w == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new m(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            r5.a aVar2 = ((e) arrayList2.get(i12)).f320a;
            aVar2.getClass();
            arrayList.add(new r5.a(aVar2.f34894s, aVar2.f34895t, aVar2.f34896u, aVar2.f34897v, (-1) - i12, 1, aVar2.y, aVar2.f34900z, aVar2.A, aVar2.F, aVar2.G, aVar2.B, aVar2.C, aVar2.D, aVar2.E, aVar2.H, aVar2.I));
        }
        return arrayList;
    }

    @Override // r5.g
    public final int d() {
        return this.f351u.length;
    }
}
