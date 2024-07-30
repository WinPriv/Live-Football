package d6;

import java.util.Arrays;

/* compiled from: TimedValueQueue.java */
/* loaded from: classes2.dex */
public final class c0<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f27284a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    public V[] f27285b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    public int f27286c;

    /* renamed from: d, reason: collision with root package name */
    public int f27287d;

    public final synchronized void a(long j10, V v3) {
        if (this.f27287d > 0) {
            if (j10 <= this.f27284a[((this.f27286c + r0) - 1) % this.f27285b.length]) {
                b();
            }
        }
        c();
        int i10 = this.f27286c;
        int i11 = this.f27287d;
        V[] vArr = this.f27285b;
        int length = (i10 + i11) % vArr.length;
        this.f27284a[length] = j10;
        vArr[length] = v3;
        this.f27287d = i11 + 1;
    }

    public final synchronized void b() {
        this.f27286c = 0;
        this.f27287d = 0;
        Arrays.fill(this.f27285b, (Object) null);
    }

    public final void c() {
        int length = this.f27285b.length;
        if (this.f27287d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) new Object[i10];
        int i11 = this.f27286c;
        int i12 = length - i11;
        System.arraycopy(this.f27284a, i11, jArr, 0, i12);
        System.arraycopy(this.f27285b, this.f27286c, vArr, 0, i12);
        int i13 = this.f27286c;
        if (i13 > 0) {
            System.arraycopy(this.f27284a, 0, jArr, i12, i13);
            System.arraycopy(this.f27285b, 0, vArr, i12, this.f27286c);
        }
        this.f27284a = jArr;
        this.f27285b = vArr;
        this.f27286c = 0;
    }

    public final V d(long j10, boolean z10) {
        V v3 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f27287d > 0) {
            long j12 = j10 - this.f27284a[this.f27286c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v3 = e();
            j11 = j12;
        }
        return v3;
    }

    public final V e() {
        boolean z10;
        if (this.f27287d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.d(z10);
        V[] vArr = this.f27285b;
        int i10 = this.f27286c;
        V v3 = vArr[i10];
        vArr[i10] = null;
        this.f27286c = (i10 + 1) % vArr.length;
        this.f27287d--;
        return v3;
    }
}
