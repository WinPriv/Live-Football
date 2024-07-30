package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Gx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0926Gx {
    public static byte[] A05;
    public static String[] A06 = {"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public TY A00 = TY.A04;
    public final TreeSet<TW> A04 = new TreeSet<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, Ascii.SI, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, 63, 59, 60, 53, 114, 61, 52, 114};
    }

    static {
        A02();
    }

    public C0926Gx(int i10, String str) {
        this.A02 = i10;
        this.A03 = str;
    }

    public static C0926Gx A00(int i10, DataInputStream dataInputStream) throws IOException {
        C0926Gx c0926Gx = new C0926Gx(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
            long readLong = dataInputStream.readLong();
            H2 h22 = new H2();
            H1.A05(h22, readLong);
            c0926Gx.A0F(h22);
        } else {
            TY A00 = TY.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            c0926Gx.A00 = A00;
        }
        return c0926Gx;
    }

    public final int A03(int i10) {
        int result = this.A02;
        int i11 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long A00 = H1.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j10, long j11) {
        TW A062 = A06(j10);
        if (A062.A01()) {
            long j12 = -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j11);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j12;
        }
        long j13 = j10 + j11;
        long queryEndPosition = A062.A02 + A062.A01;
        if (queryEndPosition < j13) {
            for (TW tw : this.A04.tailSet(A062, false)) {
                long currentEndPosition = tw.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = tw.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + tw.A01);
                if (queryEndPosition >= j13) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j10, j11);
    }

    public final H0 A05() {
        return this.A00;
    }

    public final TW A06(long j10) {
        TW A01 = TW.A01(this.A03, j10);
        TW floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j10) {
            return floor;
        }
        TW lookupSpan = this.A04.ceiling(A01);
        if (lookupSpan == null) {
            return TW.A02(this.A03, j10);
        }
        return TW.A03(this.A03, j10, lookupSpan.A02 - j10);
    }

    public final TW A07(TW tw) throws C0917Go {
        H6.A04(this.A04.remove(tw));
        TW A08 = tw.A08(this.A02);
        if (tw.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C0917Go(A01(12, 12, 78) + tw.A03 + A01(8, 4, 6) + A08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<TW> A08() {
        return this.A04;
    }

    public final void A09(TW tw) {
        this.A04.add(tw);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(C0923Gu c0923Gu) {
        if (this.A04.remove(c0923Gu)) {
            c0923Gu.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(H2 h22) {
        TY ty = this.A00;
        TY oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(h22);
        TY oldMetadata2 = this.A00;
        return !oldMetadata2.equals(ty);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0926Gx c0926Gx = (C0926Gx) obj;
        if (this.A02 == c0926Gx.A02 && this.A03.equals(c0926Gx.A03)) {
            TreeSet<TW> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[4] = "qw9AeUbTiw";
            if (treeSet.equals(c0926Gx.A04) && this.A00.equals(c0926Gx.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i10 = result * 31;
        int result2 = this.A04.hashCode();
        return i10 + result2;
    }
}
