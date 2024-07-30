package j7;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: CompactLinkedHashMap.java */
/* loaded from: classes2.dex */
public final class s<K, V> extends p<K, V> {

    @CheckForNull
    public transient long[] C;
    public transient int D;
    public transient int E;

    public s() {
        super(16);
    }

    @Override // j7.p
    public final void A(int i10, K k10, V v3, int i11, int i12) {
        super.A(i10, k10, v3, i11, i12);
        O(this.E, i10);
        O(i10, -2);
    }

    @Override // j7.p
    public final void C(int i10, int i11) {
        int size = size() - 1;
        super.C(i10, i11);
        Objects.requireNonNull(this.C);
        O(((int) (r6[i10] >>> 32)) - 1, v(i10));
        if (i10 < size) {
            Objects.requireNonNull(this.C);
            O(((int) (r1[size] >>> 32)) - 1, i10);
            O(i10, v(size));
        }
        long[] jArr = this.C;
        Objects.requireNonNull(jArr);
        jArr[size] = 0;
    }

    @Override // j7.p
    public final void L(int i10) {
        super.L(i10);
        long[] jArr = this.C;
        Objects.requireNonNull(jArr);
        this.C = Arrays.copyOf(jArr, i10);
    }

    public final void O(int i10, int i11) {
        if (i10 == -2) {
            this.D = i11;
        } else {
            long[] jArr = this.C;
            Objects.requireNonNull(jArr);
            long j10 = (jArr[i10] & (-4294967296L)) | ((i11 + 1) & 4294967295L);
            long[] jArr2 = this.C;
            Objects.requireNonNull(jArr2);
            jArr2[i10] = j10;
        }
        if (i11 == -2) {
            this.E = i10;
            return;
        }
        long[] jArr3 = this.C;
        Objects.requireNonNull(jArr3);
        long j11 = (4294967295L & jArr3[i11]) | ((i10 + 1) << 32);
        long[] jArr4 = this.C;
        Objects.requireNonNull(jArr4);
        jArr4[i11] = j11;
    }

    @Override // j7.p
    public final int c(int i10, int i11) {
        if (i10 >= size()) {
            return i11;
        }
        return i10;
    }

    @Override // j7.p, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (E()) {
            return;
        }
        this.D = -2;
        this.E = -2;
        long[] jArr = this.C;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // j7.p
    public final int k() {
        int k10 = super.k();
        this.C = new long[k10];
        return k10;
    }

    @Override // j7.p
    public final Map<K, V> p() {
        Map<K, V> p10 = super.p();
        this.C = null;
        return p10;
    }

    @Override // j7.p
    public final LinkedHashMap q(int i10) {
        return new LinkedHashMap(i10, 1.0f, false);
    }

    @Override // j7.p
    public final int u() {
        return this.D;
    }

    @Override // j7.p
    public final int v(int i10) {
        Objects.requireNonNull(this.C);
        return ((int) r0[i10]) - 1;
    }

    @Override // j7.p
    public final void z(int i10) {
        super.z(i10);
        this.D = -2;
        this.E = -2;
    }

    @Override // j7.p
    public final void b(int i10) {
    }
}
