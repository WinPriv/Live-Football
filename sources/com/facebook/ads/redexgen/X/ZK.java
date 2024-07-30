package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class ZK extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public final /* synthetic */ C05370u A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, Ascii.DLE, Ascii.DC4, 4, Ascii.SI, 2, Ascii.CAN, 62, 2, 0, 17, 17, 8, Ascii.SI, 6};
    }

    public ZK(C05370u c05370u, JSONObject jSONObject) {
        this.A00 = c05370u;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C7G c7g;
        C7G c7g2;
        CountDownLatch countDownLatch;
        C05360t c05360t;
        C05360t c05360t2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c05360t = this.A00.A02;
            synchronized (c05360t) {
                c05360t2 = this.A00.A02;
                c05360t2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e10) {
            c7g2 = this.A00.A03;
            c7g2.A06().A8u(A00(0, 17, 116), C06977l.A1B, new C06987m(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c7g = this.A00.A03;
            c7g.A06().A8u(A00(0, 17, 116), C06977l.A1A, new C06987m(e11));
        }
    }
}
