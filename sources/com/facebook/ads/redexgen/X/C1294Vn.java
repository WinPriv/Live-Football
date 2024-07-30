package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1294Vn extends AbstractC0766Ad {
    public static byte[] A04;
    public static String[] A05 = {"lad6HsSclbl4dZDgQUFPExkrVOZGbBbt", "SIXs2t4gpO1y8YpGDjIkTcYgpW4txOh9", "J4xv1tZlROXtlQfBvf", "Vit3QJU8KhVxHeAvFw7AC39hHkOGUjqR", "SdJnKD", "maUTKVCtTGu9SCIdpkB20zc8NImZ3", "MkM5N8IIfSuQKXHZSl", "IZ8I6ziCCzlMiM6m18QQFiHeFHTPFC3Q"};
    public long A00;
    public ByteBuffer A01;
    public final C0769Ag A02 = new C0769Ag();
    public final int A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 47);
            if (A05[4].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "YTCVgJhGT8sTtw3iZqMIkhaJ84PG0kbZ";
            strArr[0] = "KTsoztq2QL6ABezf53EfN52Eki9G1bvj";
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-61, -33, -61, 101, -39, Ascii.FF, -3, -3, -4, 9, -73, Ascii.VT, 6, 6, -73, 10, 4, -8, 3, 3, -73, -65};
        if (A05[5].length() == 17) {
            throw new RuntimeException();
        }
        A05[1] = "yHVImQtB2njQIa6Uhu5u0J3QDrhoWJXT";
        A04 = bArr;
    }

    static {
        A05();
    }

    public C1294Vn(int i10) {
        this.A03 = i10;
    }

    public static C1294Vn A02() {
        return new C1294Vn(0);
    }

    private ByteBuffer A04(int i10) {
        int i11 = this.A03;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.A01;
        throw new IllegalStateException(A03(4, 18, 104) + (byteBuffer == null ? 0 : byteBuffer.capacity()) + A03(0, 3, 116) + i10 + A03(3, 1, 13));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Ad
    public final void A07() {
        super.A07();
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int i10) throws IllegalStateException {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A04(i10);
            return;
        }
        int position = byteBuffer.capacity();
        int position2 = this.A01.position();
        int capacity = position2 + i10;
        if (position >= capacity) {
            return;
        }
        ByteBuffer A042 = A04(capacity);
        if (position2 > 0) {
            this.A01.position(0);
            this.A01.limit(position2);
            A042.put(this.A01);
        }
        this.A01 = A042;
        int position3 = A05[4].length();
        if (position3 != 6) {
            throw new RuntimeException();
        }
        A05[7] = "NYHeQMJyLqWO5Sg7jyx0ubrJlTId8uis";
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        return this.A01 == null && this.A03 == 0;
    }
}
