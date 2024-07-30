package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1112Oj {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final C1316Wj A00;
    public final IT A01;
    public final P1 A02;
    public final R1 A06;
    public final String A07;

    @Nullable
    public final Map<String, String> A08;
    public final LC A04 = new LC() { // from class: com.facebook.ads.redexgen.X.75
        public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C6u c6u) {
            String str;
            R1 r12;
            str = C1112Oj.this.A07;
            R2 r22 = new R2(str, c6u.A03(), c6u.A01(), c6u.A02());
            if (c6u.A00() >= 0.05d) {
                r22.A05(c6u.A01());
            }
            r12 = C1112Oj.this.A06;
            r12.A0B(r22);
            String[] strArr = A01;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
            strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
        }
    };
    public final AbstractC1011Kk A05 = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.74
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C06836s c06836s) {
            C1112Oj.this.A09();
        }
    };
    public final AbstractC1044Lr A03 = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.72
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8O
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C6v c6v) {
            C1112Oj.this.A09();
        }
    };

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public C1112Oj(C1316Wj c1316Wj, IT it, P1 p12, String str, @Nullable Map<String, String> extraParams) {
        this.A00 = c1316Wj;
        this.A01 = it;
        this.A07 = str;
        this.A08 = extraParams;
        this.A02 = p12;
        this.A06 = new R1(this.A07);
        this.A02.getEventBus().A03(this.A04, this.A05, this.A03);
    }

    private Map<String, String> A07(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A08;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A05(0, 6, 56), str);
        return hashMap;
    }

    public final void A09() {
        String A04 = R1.A04(this.A06.A0A());
        if (A04 != null) {
            IT it = this.A01;
            if (A0A[4].length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            String encodedFrameData = this.A07;
            it.A9C(encodedFrameData, A07(A04));
        }
    }

    public final void A0A() {
        QX qx = new QX(this);
        if (this.A02.A0l()) {
            L8.A00(qx);
        } else {
            this.A02.getStateHandler().post(qx);
        }
    }
}
