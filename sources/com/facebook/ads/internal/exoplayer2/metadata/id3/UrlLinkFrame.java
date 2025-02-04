package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0940Hl;
import com.facebook.ads.redexgen.X.DJ;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"K7RxnzjPeOdkr4E7awDWllYcHNZuI9c0", "lXepHslf415JArxV8sfEK4fqkdDxnDOZ", "zMpWBBAelSFSuaQHvpCFzFuKeG8cwMdZ", "r302VQJ2ie6981RfLfu9NzFVyQSaDacI", "33DyIHcKE7zPO0W2W54S0gt5PvHaUO5u", "58MEWeTNhg8nMGusT37cDOvrm2zs5Mnh", "xx8E8fg6Qtq0yUEy7uiNZyUO49Wldq56", "TSvuC"};
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR;

    @Nullable
    public final String A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "Ytg7Kx5ciTxcBbuwxTwHBhNcXLsKFS2u";
            strArr2[5] = "TL4yJ8wM2eMbRk1FBnProTEIlflGc1M5";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 45);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-69, -95, -10, -13, -19, -66};
    }

    static {
        A01();
        CREATOR = new DJ();
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (super.A00.equals(((Id3Frame) urlLinkFrame).A00) && C0940Hl.A0g(this.A00, urlLinkFrame.A00) && C0940Hl.A0g(this.A01, urlLinkFrame.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int result2 = ((17 * 31) + result) * 31;
        String str = this.A00;
        int result3 = (result2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A01;
        return result3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 6, 84) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
