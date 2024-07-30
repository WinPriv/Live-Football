package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UQ extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"zIk8lFjKPo5VqXBeAWetc3TePOqewtK4", "Krv9CUV84BxP4tXlBDsVq5ZfguHkkPOw", "qZweMgdQpTvQjM16IN332AToX", "5wIly2IGyFbenCO8uByiE", "WVTy90LHtMArJ1Mx15Navn95RKOGxxfC", "YMittl3f14YbQo67yPLY6h3Kxcx5v1", "fVvKsKq8KPyH9", "YcDFZjjwvX0vuueDfq7B81mncQMZao1W"};
    public static final DownloadAction.Deserializer A03;

    @Nullable
    public final String A00;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{3, 1, Ascii.FS, Ascii.DC4, 1, Ascii.SYN, 0, 0, Ascii.SUB, 5, Ascii.SYN};
    }

    static {
        A06();
        A03 = new UR(A05(0, 11, 68), 0);
    }

    public UQ(Uri uri, boolean z10, @Nullable byte[] bArr, @Nullable String str) {
        super(A05(0, 11, 68), 0, uri, z10, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final UP A07(C0846Dr c0846Dr) {
        return new UP(this.A01, this.A00, c0846Dr);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : C0925Gw.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean customCacheKeySet = this.A00 != null;
        dataOutputStream.writeBoolean(customCacheKeySet);
        if (customCacheKeySet) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof UQ) && A04().equals(((UQ) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean equals = super.equals(obj);
        String[] strArr = A02;
        if (strArr[0].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[3] = "S1dYnav0YyHlHBWJfncCN";
        if (!equals) {
            return false;
        }
        return C0940Hl.A0g(this.A00, ((UQ) obj).A00);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i10 = result * 31;
        String str = this.A00;
        int result2 = str != null ? str.hashCode() : 0;
        int i11 = i10 + result2;
        String[] strArr = A02;
        String str2 = strArr[6];
        String str3 = strArr[2];
        int length = str2.length();
        int result3 = str3.length();
        if (length == result3) {
            throw new RuntimeException();
        }
        A02[4] = "5idVnwwxM2TXqOP7ezpSPuxFrlenP4PE";
        return i11;
    }
}
