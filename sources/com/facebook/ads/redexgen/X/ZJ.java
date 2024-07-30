package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class ZJ extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C05370u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public ZJ(C05370u c05370u, String str) {
        this.A00 = c05370u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C7G c7g;
        C7G c7g2;
        CountDownLatch countDownLatch;
        C05360t c05360t;
        C05360t c05360t2;
        C05360t c05360t3;
        boolean A0J;
        C05360t c05360t4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c05360t = this.A00.A02;
            synchronized (c05360t) {
                c05360t2 = this.A00.A02;
                Iterator<String> keys = c05360t2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C05370u c05370u = this.A00;
                        c05360t4 = this.A00.A02;
                        c05370u.A0E((C1O) c05360t4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c05360t3 = this.A00.A02;
                c05360t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e10) {
            c7g2 = this.A00.A03;
            c7g2.A06().A8u(A00(0, 17, 8), C06977l.A1B, new C06987m(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            c7g = this.A00.A03;
            c7g.A06().A8u(A00(0, 17, 8), C06977l.A1A, new C06987m(e11));
        }
    }
}
