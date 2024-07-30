package com.facebook.ads.internal.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.AnonymousClass92;
import com.facebook.ads.redexgen.X.B1;
import com.facebook.ads.redexgen.X.B2;
import com.facebook.ads.redexgen.X.C0940Hl;
import com.facebook.ads.redexgen.X.H6;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static String[] A04 = {"8bdUvaky5WHdDfVtqwXLakhjtGg6hs0c", "CSUdOCO5ftZIoIqJhT3Nbwo3RnwWTbkq", "vzkDrAJxp6TV0asAVFNpHo5ff03W8L4C", "3CPPKLCdNdSlf2uW7xM1UEZDCok6HZIU", "mnhq363EVnPm6bnzgoRKNwVQQZg6aqu6", "KD2Si0NJCJWXzNPR5NKnBolICvozfmpB", "Z", "WysYYCxVTVW1uXFpDxeWkwgjJbtDWfH7"};
    public static final Parcelable.Creator<DrmInitData> CREATOR = new B1();
    public int A00;
    public final int A01;

    @Nullable
    public final String A02;
    public final SchemeData[] A03;

    /* loaded from: assets/audience_network.dex */
    public static final class SchemeData implements Parcelable {
        public static String[] A06 = {"FfOodbYcKtbLKDRgim9u7cuo", "NIbXOynBiooMG0S9J28EQxAtJZpLZjNW", "C", "V6JUT1Nk4hAUvorEbipITNdn0olHm5RE", "eq3iucunEPOJjPN", "pnR6rnWbcJIrtQWCkJwENO", "PAZI29otaA64eWNvlBcxsuWWkBf029P2", "o6I7wssHkhPR10FgybVRhye00pbKkIDj"};
        public static final Parcelable.Creator<SchemeData> CREATOR = new B2();
        public int A00;

        @Nullable
        public final String A01;
        public final String A02;
        public final boolean A03;
        public final byte[] A04;
        public final UUID A05;

        public SchemeData(Parcel parcel) {
            this.A05 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
            this.A03 = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, byte[] bArr, boolean z10) {
            this.A05 = (UUID) H6.A01(uuid);
            this.A01 = str;
            this.A02 = (String) H6.A01(str2);
            this.A04 = bArr;
            this.A03 = z10;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z10) {
            this(uuid, null, str, bArr, z10);
        }

        public final boolean A01() {
            return this.A04 != null;
        }

        public final boolean A02(UUID uuid) {
            return AnonymousClass92.A04.equals(this.A05) || uuid.equals(this.A05);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (C0940Hl.A0g(this.A01, schemeData.A01) && C0940Hl.A0g(this.A02, schemeData.A02) && C0940Hl.A0g(this.A05, schemeData.A05) && Arrays.equals(this.A04, schemeData.A04)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                int result = this.A05.hashCode();
                int i10 = result * 31;
                String str = this.A01;
                if (A06[5].length() == 21) {
                    throw new RuntimeException();
                }
                A06[2] = "3";
                int result2 = str == null ? 0 : str.hashCode();
                int result3 = (((i10 + result2) * 31) + this.A02.hashCode()) * 31;
                int result4 = Arrays.hashCode(this.A04);
                this.A00 = result3 + result4;
            }
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.A05.getMostSignificantBits());
            parcel.writeLong(this.A05.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
            parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A01 = this.A03.length;
    }

    public DrmInitData(@Nullable String str, boolean z10, SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> schemeDatas) {
        this(null, false, (SchemeData[]) schemeDatas.toArray(new SchemeData[schemeDatas.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (!AnonymousClass92.A04.equals(schemeData.A05)) {
            return schemeData.A05.compareTo(schemeData2.A05);
        }
        UUID uuid = AnonymousClass92.A04;
        String[] strArr = A04;
        if (strArr[2].charAt(27) != strArr[1].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "UJNVxnyD05Ff97smdNbQ52dPpWZWnGWu";
        strArr2[1] = "8h5dygAHbIm1cQj3dlT8FNkqjk3WwzL5";
        return uuid.equals(schemeData2.A05) ? 0 : 1;
    }

    public final SchemeData A01(int i10) {
        return this.A03[i10];
    }

    public final DrmInitData A02(@Nullable String str) {
        if (C0940Hl.A0g(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (C0940Hl.A0g(this.A02, drmInitData.A02) && Arrays.equals(this.A03, drmInitData.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            String str = this.A02;
            int result = str == null ? 0 : str.hashCode();
            int i10 = result * 31;
            int result2 = Arrays.hashCode(this.A03);
            this.A00 = i10 + result2;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
