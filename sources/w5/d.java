package w5;

import d6.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r5.g;

/* compiled from: SsaSubtitle.java */
/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: s, reason: collision with root package name */
    public final List<List<r5.a>> f36144s;

    /* renamed from: t, reason: collision with root package name */
    public final List<Long> f36145t;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.f36144s = arrayList;
        this.f36145t = arrayList2;
    }

    @Override // r5.g
    public final int a(long j10) {
        int i10;
        Long valueOf = Long.valueOf(j10);
        int i11 = g0.f27302a;
        List<Long> list = this.f36145t;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i10 = binarySearch;
        }
        if (i10 >= list.size()) {
            return -1;
        }
        return i10;
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
        List<Long> list = this.f36145t;
        if (i10 >= list.size()) {
            z11 = false;
        }
        d6.a.a(z11);
        return list.get(i10).longValue();
    }

    @Override // r5.g
    public final List<r5.a> c(long j10) {
        int c10 = g0.c(this.f36145t, Long.valueOf(j10), false);
        if (c10 == -1) {
            return Collections.emptyList();
        }
        return this.f36144s.get(c10);
    }

    @Override // r5.g
    public final int d() {
        return this.f36145t.size();
    }
}
