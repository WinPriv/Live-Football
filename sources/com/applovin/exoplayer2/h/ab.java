package com.applovin.exoplayer2.h;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class ab<V> {

    /* renamed from: a, reason: collision with root package name */
    private int f15277a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f15278b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.h<V> f15279c;

    public ab() {
        this(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.h.a0
            @Override // com.applovin.exoplayer2.l.h, d6.f
            public final void accept(Object obj) {
                ab.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj) {
    }

    public void c(int i10) {
        for (int size = this.f15278b.size() - 1; size >= 0 && i10 < this.f15278b.keyAt(size); size--) {
            this.f15279c.accept(this.f15278b.valueAt(size));
            this.f15278b.removeAt(size);
        }
        this.f15277a = this.f15278b.size() > 0 ? Math.min(this.f15277a, this.f15278b.size() - 1) : -1;
    }

    public ab(com.applovin.exoplayer2.l.h<V> hVar) {
        this.f15278b = new SparseArray<>();
        this.f15279c = hVar;
        this.f15277a = -1;
    }

    public V a(int i10) {
        if (this.f15277a == -1) {
            this.f15277a = 0;
        }
        while (true) {
            int i11 = this.f15277a;
            if (i11 <= 0 || i10 >= this.f15278b.keyAt(i11)) {
                break;
            }
            this.f15277a--;
        }
        while (this.f15277a < this.f15278b.size() - 1 && i10 >= this.f15278b.keyAt(this.f15277a + 1)) {
            this.f15277a++;
        }
        return this.f15278b.valueAt(this.f15277a);
    }

    public void b(int i10) {
        int i11 = 0;
        while (i11 < this.f15278b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f15278b.keyAt(i12)) {
                return;
            }
            this.f15279c.accept(this.f15278b.valueAt(i11));
            this.f15278b.removeAt(i11);
            int i13 = this.f15277a;
            if (i13 > 0) {
                this.f15277a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public boolean c() {
        return this.f15278b.size() == 0;
    }

    public void b() {
        for (int i10 = 0; i10 < this.f15278b.size(); i10++) {
            this.f15279c.accept(this.f15278b.valueAt(i10));
        }
        this.f15277a = -1;
        this.f15278b.clear();
    }

    public void a(int i10, V v3) {
        if (this.f15277a == -1) {
            com.applovin.exoplayer2.l.a.b(this.f15278b.size() == 0);
            this.f15277a = 0;
        }
        if (this.f15278b.size() > 0) {
            SparseArray<V> sparseArray = this.f15278b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.applovin.exoplayer2.l.a.a(i10 >= keyAt);
            if (keyAt == i10) {
                com.applovin.exoplayer2.l.h<V> hVar = this.f15279c;
                SparseArray<V> sparseArray2 = this.f15278b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f15278b.append(i10, v3);
    }

    public V a() {
        return this.f15278b.valueAt(r0.size() - 1);
    }
}
