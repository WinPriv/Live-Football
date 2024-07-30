package j5;

import android.util.SparseArray;

/* compiled from: SpannedData.java */
/* loaded from: classes2.dex */
public final class l0<V> {

    /* renamed from: c, reason: collision with root package name */
    public final d6.f<V> f29797c;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f29796b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    public int f29795a = -1;

    public l0(com.applovin.exoplayer2.d.w wVar) {
        this.f29797c = wVar;
    }

    public final V a(int i10) {
        SparseArray<V> sparseArray;
        if (this.f29795a == -1) {
            this.f29795a = 0;
        }
        while (true) {
            int i11 = this.f29795a;
            sparseArray = this.f29796b;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f29795a--;
        }
        while (this.f29795a < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f29795a + 1)) {
            this.f29795a++;
        }
        return sparseArray.valueAt(this.f29795a);
    }
}
