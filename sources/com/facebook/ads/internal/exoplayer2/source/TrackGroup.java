package com.facebook.ads.internal.exoplayer2.source;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.redexgen.X.C0868Ep;
import com.facebook.ads.redexgen.X.H6;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroup implements Parcelable {
    public static String[] A03 = {"uF1MaBjHqfaou024Qot33eYqIFU5JpvL", "e11WN2XHHVFyFb3tGbHyOnuTBXVrxID3", "sRFhiACxeNyk2ofGCUEzfsyXhtnOr6n1", "WOmDa", "B4eB5pbJ0Ea0X4wV3enRun3SeiDmty6A", "wkOrnjHBm7RpnZhD1xCNjmxcOEtiASyA", "Mmr4xD9J4DRMn7KtjO4WF7k", "AppkpJNXRVMekBVT0dKI7wy"};
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C0868Ep();
    public int A00;
    public final int A01;
    public final Format[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TrackGroup(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            r3.A01 = r0
            int r0 = r3.A01
            com.facebook.ads.internal.exoplayer2.Format[] r0 = new com.facebook.ads.internal.exoplayer2.Format[r0]
            r3.A02 = r0
            r2 = 0
        L10:
            int r0 = r3.A01
            if (r2 >= r0) goto L27
            com.facebook.ads.internal.exoplayer2.Format[] r1 = r3.A02
            java.lang.Class<com.facebook.ads.internal.exoplayer2.Format> r0 = com.facebook.ads.internal.exoplayer2.Format.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.facebook.ads.internal.exoplayer2.Format r0 = (com.facebook.ads.internal.exoplayer2.Format) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L10
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.source.TrackGroup.<init>(android.os.Parcel):void");
    }

    public TrackGroup(Format... formatArr) {
        H6.A04(formatArr.length > 0);
        this.A02 = formatArr;
        this.A01 = formatArr.length;
    }

    public final int A00(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.A02;
            int i11 = formatArr.length;
            if (i10 < i11) {
                Format format2 = formatArr[i10];
                String[] strArr = A03;
                String str = strArr[7];
                String str2 = strArr[6];
                int length = str.length();
                int i12 = str2.length();
                if (length != i12) {
                    throw new RuntimeException();
                }
                A03[3] = "gOIjn";
                if (format == format2) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final Format A01(int i10) {
        return this.A02[i10];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.A01 == trackGroup.A01 && Arrays.equals(this.A02, trackGroup.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.A01
            r4.writeInt(r0)
            r2 = 0
        L6:
            int r0 = r3.A01
            if (r2 >= r0) goto L15
            com.facebook.ads.internal.exoplayer2.Format[] r0 = r3.A02
            r1 = r0[r2]
            r0 = 0
            r4.writeParcelable(r1, r0)
            int r2 = r2 + 1
            goto L6
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.source.TrackGroup.writeToParcel(android.os.Parcel, int):void");
    }
}
