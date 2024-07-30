package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1257Tz implements GC {
    public static String[] A06 = {"pUEZtwC879kNTB0j2TOCFjJulbgJhqUC", "LPVOHHlL8UGYMHe0OEH9XWTZwVKfE88", "jCWSEziDhw1FUDawrAH0", "ULlgao2XS9ulxIggOdCWnHLutHCveOYX", "OfpsRfCrHKp957e6", "lRTa0LPDu3nTDFLS", "m8d4mf9eDgFJFgmjbUCxubxaGITUd7Ju", "HrUOWAYLXAxBFn4TYCBDJo12hDa"};
    public int A00;
    public final long[] A01;
    public final Format[] A02;
    public final int A03;
    public final TrackGroup A04;
    public final int[] A05;

    public AbstractC1257Tz(TrackGroup trackGroup, int... iArr) {
        H6.A04(iArr.length > 0);
        this.A04 = (TrackGroup) H6.A01(trackGroup);
        this.A03 = iArr.length;
        this.A02 = new Format[this.A03];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.A02[i10] = trackGroup.A01(iArr[i10]);
        }
        Arrays.sort(this.A02, new G0());
        this.A05 = new int[this.A03];
        int i11 = 0;
        while (true) {
            int i12 = this.A03;
            if (i11 < i12) {
                this.A05[i11] = trackGroup.A00(this.A02[i11]);
                i11++;
            } else {
                this.A01 = new long[i12];
                return;
            }
        }
    }

    public final boolean A00(int i10, long j10) {
        return this.A01[i10] > j10;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public void A58() {
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final Format A6f(int i10) {
        return this.A02[i10];
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int A6l(int i10) {
        return this.A05[i10];
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final Format A7N() {
        return this.A02[A7O()];
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final TrackGroup A7e() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public void ABj(float f) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (A06[5].length() != 16) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[4] = "LRd3kE9IkICWfxuz";
        strArr[7] = "u7g1WhIErEGO9Vcw68pTGYuY7C3";
        AbstractC1257Tz abstractC1257Tz = (AbstractC1257Tz) obj;
        return this.A04 == abstractC1257Tz.A04 && Arrays.equals(this.A05, abstractC1257Tz.A05);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int identityHashCode = System.identityHashCode(this.A04);
            if (A06[6].charAt(23) != 'a') {
                throw new RuntimeException();
            }
            A06[6] = "LdgR80foYK7ntQpYvL7rAZHaf8ikiVBs";
            this.A00 = (identityHashCode * 31) + Arrays.hashCode(this.A05);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int length() {
        return this.A05.length;
    }
}
