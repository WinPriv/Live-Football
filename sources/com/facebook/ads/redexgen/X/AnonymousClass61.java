package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.61, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass61 {

    @Nullable
    public static AnonymousClass62 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (AnonymousClass61.class) {
            if (A00 == null) {
                return;
            }
            C06987m c06987m = new C06987m(A00.ADv());
            c06987m.A03(1);
            C1315Wi A002 = C7F.A00();
            if (A002 != null) {
                A002.A06().A8u(A00(0, 9, 109), 3401, c06987m);
            }
            A00.reset();
        }
    }

    public static void A03(final long j10) {
        if (j10 > 0) {
            A00 = new C1324Wr();
            new Thread(j10) { // from class: com.facebook.ads.redexgen.X.63
                public final long A00;

                {
                    this.A00 = j10;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (C0990Jm.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                C0990Jm.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        AnonymousClass61.A01();
                    }
                }
            };
        }
    }
}
