package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class i implements com.applovin.exoplayer2.i.f {

    /* renamed from: a, reason: collision with root package name */
    private final List<e> f15862a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15863b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f15864c;

    public i(List<e> list) {
        this.f15862a = Collections.unmodifiableList(new ArrayList(list));
        this.f15863b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f15863b;
            jArr[i11] = eVar.f15834b;
            jArr[i11 + 1] = eVar.f15835c;
        }
        long[] jArr2 = this.f15863b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f15864c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int b10 = ai.b(this.f15864c, j10, false, false);
        if (b10 < this.f15864c.length) {
            return b10;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f15864c.length;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f15862a.size(); i10++) {
            long[] jArr = this.f15863b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f15862a.get(i10);
                com.applovin.exoplayer2.i.a aVar = eVar.f15833a;
                if (aVar.f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.applovin.exoplayer2.i.i.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a10;
                a10 = i.a((e) obj, (e) obj2);
                return a10;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f15833a.a().a((-1) - i12, 1).e());
        }
        return arrayList;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0);
        com.applovin.exoplayer2.l.a.a(i10 < this.f15864c.length);
        return this.f15864c[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(e eVar, e eVar2) {
        return Long.compare(eVar.f15834b, eVar2.f15834b);
    }
}
