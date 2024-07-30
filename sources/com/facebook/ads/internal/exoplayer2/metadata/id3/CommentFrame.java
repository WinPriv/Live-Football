package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.X.C0940Hl;
import com.facebook.ads.redexgen.X.DC;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CommentFrame extends Id3Frame {
    public static byte[] A03;
    public static final Parcelable.Creator<CommentFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.RS, Ascii.DC2, 86, 87, 65, 81, 64, 91, 66, 70, 91, 93, 92, Ascii.SI, Ascii.SI, Ascii.NAK, 89, 84, 91, 82, 64, 84, 82, 80, 8, 118, 122, 120, 120};
    }

    static {
        A01();
        CREATOR = new DC();
    }

    public CommentFrame(Parcel parcel) {
        super(A00(25, 4, 39));
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super(A00(25, 4, 39));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (C0940Hl.A0g(this.A00, commentFrame.A00) && C0940Hl.A0g(this.A01, commentFrame.A01) && C0940Hl.A0g(this.A02, commentFrame.A02)) {
            return true;
        }
        return false;
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
        return super.A00 + A00(14, 11, 39) + this.A01 + A00(0, 14, 32) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
