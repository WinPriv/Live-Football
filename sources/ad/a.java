package ad;

import java.util.Iterator;

/* compiled from: Progressions.kt */
/* loaded from: classes2.dex */
public class a implements Iterable<Integer> {

    /* renamed from: s, reason: collision with root package name */
    public final int f407s;

    /* renamed from: t, reason: collision with root package name */
    public final int f408t;

    /* renamed from: u, reason: collision with root package name */
    public final int f409u;

    public a(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f407s = i10;
                if (i12 > 0) {
                    if (i10 < i11) {
                        int i13 = i11 % i12;
                        int i14 = i10 % i12;
                        int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                        i11 -= i15 < 0 ? i15 + i12 : i15;
                    }
                } else if (i12 < 0) {
                    if (i10 > i11) {
                        int i16 = -i12;
                        int i17 = i10 % i16;
                        int i18 = i11 % i16;
                        int i19 = ((i17 < 0 ? i17 + i16 : i17) - (i18 < 0 ? i18 + i16 : i18)) % i16;
                        i11 += i19 < 0 ? i19 + i16 : i19;
                    }
                } else {
                    throw new IllegalArgumentException("Step is zero.");
                }
                this.f408t = i11;
                this.f409u = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new b(this.f407s, this.f408t, this.f409u);
    }
}
