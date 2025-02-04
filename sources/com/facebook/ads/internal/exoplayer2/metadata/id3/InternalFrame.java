package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.X.DG;
import com.facebook.ads.redexgen.X.H6;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class InternalFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"lilP4D7d9BEQwLM9jHUfqGkSnEdU58pn", "afpTaQV4nZSZ2pXKiaVB57IApZ4xj5qk", "YRNhV7avC", "1hSLaROLE5s9UJkRnEYVy3hKzt6jPrhV", "10wPMgxL8A4TQ9Hf5dRzrJ387LzBipD1", "PqYfNOJ9aEgtaoP64w7W5IvflQAuK", "TGXFUdlvkhflYTg3tHRPVMdbYrS98xM0", "clX4aM2L2vONCyf4cEJJ0L4DMPtHH1Oh"};
    public static final Parcelable.Creator<InternalFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{17, Ascii.GS, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 0, 108, 108, 108, 108, 88, 66, 6, Ascii.CR, Ascii.SI, 3, Ascii.VT, Ascii.FF, 95};
    }

    static {
        A01();
        CREATOR = new DG();
    }

    public InternalFrame(Parcel parcel) {
        super(A00(14, 4, 110));
        this.A01 = (String) H6.A01(parcel.readString());
        this.A00 = (String) H6.A01(parcel.readString());
        this.A02 = (String) H6.A01(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(A00(14, 4, 110));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (com.facebook.ads.redexgen.X.C0940Hl.A0g(r6.A01, r7.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (com.facebook.ads.redexgen.X.C0940Hl.A0g(r6.A02, r7.A02) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r3 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 != r7) goto L4
            return r5
        L4:
            r4 = 0
            if (r7 == 0) goto L31
            java.lang.Class r3 = r6.getClass()
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame.A04
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L83
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame.A04
            java.lang.String r1 = "Mhqd5WFFO6xiPHzIeOEf7QV6aYGfc4Kn"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "xf6wfRaYxe4Afm1t5dth2gMnwuEgfe9t"
            r0 = 0
            r2[r0] = r1
            java.lang.Class r0 = r7.getClass()
            if (r3 == r0) goto L32
        L31:
            return r4
        L32:
            com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame r7 = (com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame) r7
            java.lang.String r1 = r6.A00
            java.lang.String r0 = r7.A00
            boolean r3 = com.facebook.ads.redexgen.X.C0940Hl.A0g(r1, r0)
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L72
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame.A04
            java.lang.String r1 = "Gmb2a1mvjn118PMUNtRrWMI0JTYZbWWI"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "BRSYa66X5aU9tnHulh6jJE43QYKNdFpy"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L81
        L5d:
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r7.A01
            boolean r0 = com.facebook.ads.redexgen.X.C0940Hl.A0g(r1, r0)
            if (r0 == 0) goto L81
            java.lang.String r1 = r6.A02
            java.lang.String r0 = r7.A02
            boolean r0 = com.facebook.ads.redexgen.X.C0940Hl.A0g(r1, r0)
            if (r0 == 0) goto L81
        L71:
            return r5
        L72:
            java.lang.String[] r2 = com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame.A04
            java.lang.String r1 = "cswqaHsYDWadkoDisf9vwGuJ2Xq3cIyW"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "hAvMaAOGLAswzMgAwZEXQ4Q5TQk5ggAk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L81
            goto L5d
        L81:
            r5 = 0
            goto L71
        L83:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10 = 17 * 31;
        String str = this.A01;
        int result = str != null ? str.hashCode() : 0;
        int result2 = (i10 + result) * 31;
        String str2 = this.A00;
        int result3 = (result2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A02;
        return result3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(18, 9, 77) + this.A01 + A00(0, 14, 18) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
