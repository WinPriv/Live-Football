package com.facebook.ads.internal.exoplayer2.source;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0869Er;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroupArray implements Parcelable {
    public static String[] A03 = {"VeLcksxMt3PiY9R1rHSQOw59E3uXu3y4", "kDaGCzW6AYC9Vd", "HdQqsudNtb3GwZVdOuSjCK1cvypXuBmO", "TDIIXEFeBXUqvvBrldprlo94jTphz", "vM9bR1K3Ny8GpvAoAGhEbHV75VrlC6x5", "HTKcEQU1qW9AJSOXQnXDctgwMIpv3yeo", "D5FGV12hFTFATb3k1jbs", "Elm4dEdTwW2NF2wr80DoeDRtultkwVxD"};
    public static final TrackGroupArray A04 = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C0869Er();
    public int A00;
    public final int A01;
    public final TrackGroup[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TrackGroupArray(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            r3.A01 = r0
            int r0 = r3.A01
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0]
            r3.A02 = r0
            r2 = 0
        L10:
            int r0 = r3.A01
            if (r2 >= r0) goto L27
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r1 = r3.A02
            java.lang.Class<com.facebook.ads.internal.exoplayer2.source.TrackGroup> r0 = com.facebook.ads.internal.exoplayer2.source.TrackGroup.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r0 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L10
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.source.TrackGroupArray.<init>(android.os.Parcel):void");
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(com.facebook.ads.internal.exoplayer2.source.TrackGroup r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r2.A01
            if (r1 >= r0) goto Lf
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = r2.A02
            r0 = r0[r1]
            if (r0 != r3) goto Lc
            return r1
        Lc:
            int r1 = r1 + 1
            goto L1
        Lf:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.source.TrackGroupArray.A00(com.facebook.ads.internal.exoplayer2.source.TrackGroup):int");
    }

    public final TrackGroup A01(int i10) {
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
        if (A03[6].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[0] = "ZPecGmpFZujqBRhyZTNZ1SVkZFgKhO38";
        strArr[5] = "me7cYpsF0CfkBGZ0HsMy9kxuKf6pUD2I";
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.A01 == trackGroupArray.A01 && Arrays.equals(this.A02, trackGroupArray.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = Arrays.hashCode(this.A02);
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
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = r3.A02
            r1 = r0[r2]
            r0 = 0
            r4.writeParcelable(r1, r0)
            int r2 = r2 + 1
            goto L6
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.source.TrackGroupArray.writeToParcel(android.os.Parcel, int):void");
    }
}
