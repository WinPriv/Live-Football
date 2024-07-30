package com.facebook.ads.internal.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.redexgen.X.C0940Hl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Format implements Parcelable {
    public static byte[] A0R;
    public static String[] A0S = {"vGX1GGEkwYRY6RU49bxQYa9cKSE0JnL1", "jouimqjzRvJJn6CQLj0bvIgvYOaQJ8n7", "okaeuhFd1McrDnHL3LojszCI5VhJZfc6", "B0", "VmcpJpCYh4AjNq0ywjVO25ycqwipB041", "iCSfxmGD7XOmopp", "9Pj1GuzMtk7lxtvUuCnLA1hQ1ukhmjuF", "ElSuOUcfqRTRm52JPbd0IEktycUaIpsD"};
    public static final Parcelable.Creator<Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;

    @Nullable
    public final DrmInitData A0H;

    @Nullable
    public final Metadata A0I;

    @Nullable
    public final ColorInfo A0J;

    @Nullable
    public final String A0K;

    @Nullable
    public final String A0L;

    @Nullable
    public final String A0M;

    @Nullable
    public final String A0N;

    @Nullable
    public final String A0O;
    public final List<byte[]> A0P;

    @Nullable
    public final byte[] A0Q;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i10, int i11, int i12, int i13, float f, int i14, float f10, @Nullable byte[] bArr, int i15, @Nullable ColorInfo colorInfo, int i16, int i17, int i18, int i19, int i20, int i21, @Nullable String str5, int i22, long j10, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        int i23 = i14;
        float f11 = f10;
        List<byte[]> list2 = list;
        int i24 = i20;
        int i25 = i19;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i10;
        this.A09 = i11;
        this.A0F = i12;
        this.A08 = i13;
        this.A01 = f;
        this.A0B = i23 == -1 ? 0 : i23;
        this.A02 = f11 == -1.0f ? 1.0f : f11;
        this.A0Q = bArr;
        this.A0E = i15;
        this.A0J = colorInfo;
        this.A05 = i16;
        this.A0C = i17;
        this.A0A = i18;
        this.A06 = i25 == -1 ? 0 : i25;
        this.A07 = i24 == -1 ? 0 : i24;
        this.A0D = i21;
        this.A0N = str5;
        this.A03 = i22;
        this.A0G = j10;
        this.A0P = list2 == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A07(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, List<byte[]> list, @Nullable DrmInitData drmInitData, int i14, @Nullable String str4) {
        return A06(str, str2, str3, i10, i11, i12, i13, -1, list, drmInitData, i14, str4);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 39 out of bounds for length 39
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A09(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable String str4, int i12, @Nullable DrmInitData drmInitData, long j10, List<byte[]> list) {
        return new Format(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, i12, j10, list, drmInitData, null);
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0R, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0R = new byte[]{60, 48, 35, 47, 84, 4, 45, 48, 47, 35, 54, 106, 8, 124, 64, 49, 61, 70};
    }

    static {
        A0D();
        CREATOR = new Parcelable.Creator<Format>() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Format createFromParcel(Parcel parcel) {
                return new Format(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final Format[] newArray(int i10) {
                return new Format[i10];
            }
        };
    }

    public Format(Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        boolean hasProjectionData = C0940Hl.A0f(parcel);
        this.A0Q = hasProjectionData ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int readInt = parcel.readInt();
        this.A0P = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public static Format A00(@Nullable String str, String str2, int i10, @Nullable String str3) {
        return A01(str, str2, i10, str3, null);
    }

    public static Format A01(@Nullable String str, String str2, int i10, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i10, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A02(@Nullable String str, @Nullable String str2, long j10) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j10, null, null, null);
    }

    public static Format A03(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, float f, List<byte[]> list, int i14, float f10, @Nullable DrmInitData drmInitData) {
        return A04(str, str2, str3, i10, i11, i12, i13, f, list, i14, f10, null, -1, null, drmInitData);
    }

    public static Format A04(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, float f, List<byte[]> list, int i14, float f10, byte[] bArr, int i15, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i10, i11, i12, i13, f, i14, f10, bArr, i15, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A05(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<byte[]> list, @Nullable DrmInitData drmInitData, int i17, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, str2, str3, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format A06(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, int i14, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i15, @Nullable String str4) {
        return A05(str, str2, str3, i10, i11, i12, i13, i14, -1, -1, initializationData, drmInitData, i15, str4, null);
    }

    public static Format A08(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable String str4, int i12, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, str3, i10, i11, str4, i12, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A0A(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A0B(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i10, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public final int A0E() {
        int i10;
        int i11 = this.A0F;
        if (i11 == -1 || (i10 = this.A08) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final Format A0F(int i10) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i10, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0G(int i10, int i11) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i10, i11, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0H(long j10) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j10, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0I(@Nullable DrmInitData drmInitData) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final Format A0J(@Nullable Metadata metadata) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0K(com.facebook.ads.internal.exoplayer2.Format r5) {
        /*
            r4 = this;
            java.util.List<byte[]> r0 = r4.A0P
            int r1 = r0.size()
            java.util.List<byte[]> r0 = r5.A0P
            int r0 = r0.size()
            r3 = 0
            if (r1 == r0) goto L10
            return r3
        L10:
            r2 = 0
        L11:
            java.util.List<byte[]> r0 = r4.A0P
            int r0 = r0.size()
            if (r2 >= r0) goto L33
            java.util.List<byte[]> r0 = r4.A0P
            java.lang.Object r1 = r0.get(r2)
            byte[] r1 = (byte[]) r1
            java.util.List<byte[]> r0 = r5.A0P
            java.lang.Object r0 = r0.get(r2)
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L30
            return r3
        L30:
            int r2 = r2 + 1
            goto L11
        L33:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.Format.A0K(com.facebook.ads.internal.exoplayer2.Format):boolean");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
    
        if (r3 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        if (com.facebook.ads.redexgen.X.C0940Hl.A0g(r6.A0I, r7.A0I) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
    
        if (com.facebook.ads.redexgen.X.C0940Hl.A0g(r6.A0J, r7.A0J) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (java.util.Arrays.equals(r6.A0Q, r7.A0Q) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
    
        if (A0K(r7) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        if (r3 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.Format.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 17 * 31;
            String str = this.A0M;
            int result = str == null ? 0 : str.hashCode();
            int result2 = (i10 + result) * 31;
            String str2 = this.A0L;
            int result3 = str2 == null ? 0 : str2.hashCode();
            int result4 = (result2 + result3) * 31;
            String str3 = this.A0O;
            int result5 = str3 == null ? 0 : str3.hashCode();
            int result6 = (result4 + result5) * 31;
            String str4 = this.A0K;
            int result7 = str4 == null ? 0 : str4.hashCode();
            int result8 = (result6 + result7) * 31;
            int result9 = this.A04;
            int result10 = (((result8 + result9) * 31) + this.A0F) * 31;
            int result11 = this.A08;
            int result12 = (((result10 + result11) * 31) + this.A05) * 31;
            int result13 = this.A0C;
            int result14 = (result12 + result13) * 31;
            String str5 = this.A0N;
            int result15 = str5 == null ? 0 : str5.hashCode();
            int i11 = (result14 + result15) * 31;
            if (A0S[6].charAt(6) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0S;
            strArr[0] = "Pa31ThsuQdloj8lWLbuVRj0Nef3PQXlW";
            strArr[7] = "gnG3aj7z3XBCxLsDLbWk4AuKXzueFLox";
            int result16 = this.A03;
            int result17 = (i11 + result16) * 31;
            DrmInitData drmInitData = this.A0H;
            int result18 = (result17 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.A0I;
            this.A00 = result18 + (metadata != null ? metadata.hashCode() : 0);
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0C(5, 7, 4));
        sb2.append(this.A0M);
        String A0C = A0C(0, 2, 86);
        sb2.append(A0C);
        sb2.append(this.A0L);
        sb2.append(A0C);
        sb2.append(this.A0O);
        sb2.append(A0C);
        sb2.append(this.A04);
        sb2.append(A0C);
        sb2.append(this.A0N);
        sb2.append(A0C(2, 3, 73));
        sb2.append(this.A0F);
        sb2.append(A0C);
        sb2.append(this.A08);
        sb2.append(A0C);
        sb2.append(this.A01);
        sb2.append(A0C(14, 4, 91));
        sb2.append(this.A05);
        sb2.append(A0C);
        sb2.append(this.A0C);
        sb2.append(A0C(12, 2, 19));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        C0940Hl.A0V(parcel, this.A0Q != null);
        byte[] bArr = this.A0Q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i10);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        int size = this.A0P.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.A0P.get(i11));
            if (A0S[2].charAt(16) != '3') {
                throw new RuntimeException();
            }
            A0S[4] = "uEseBvDXMUnwGsdyFGyQsGvPhE4Avh4c";
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
