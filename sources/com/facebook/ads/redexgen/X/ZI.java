package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class ZI extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C05370u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {Ascii.GS, 41, Ascii.FS, 40, 44, Ascii.FS, 37, Ascii.SUB, 48, Ascii.SYN, Ascii.SUB, Ascii.CAN, 39, 39, 32, 37, Ascii.RS};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public ZI(C05370u c05370u, String str) {
        this.A00 = c05370u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C7G c7g;
        C7G c7g2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C05360t c05360t;
        C05360t c05360t2;
        C05360t c05360t3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c05360t = this.A00.A02;
                ((C1O) c05360t.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c05360t2 = this.A00.A02;
                c05360t2.A07(this.A01);
                c05360t3 = this.A00.A02;
                c05360t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c7g2 = this.A00.A03;
            c7g2.A06().A8u(A00, C06977l.A1B, new C06987m(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c7g = this.A00.A03;
            c7g.A06().A8u(A00, C06977l.A1A, new C06987m(e11));
        }
    }
}
