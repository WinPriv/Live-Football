package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dj */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0838Dj implements Runnable {
    public static byte[] A08;
    public static String[] A09 = {"KOAWbsFFbfk0jNgDY62WpIsFaQMswz1L", "pC7XDjTrGSoCHMQrO1sG15bqJEuDqJQJ", "uN2VaEj4rnuk1e19MnznGB1XwQ8yCVfE", "6JBJvnr9DSzDH8E8QP73ZcoxgSr1ahx0", "ultRdxrvkIUuntIMLaCfX8e7z", "lHTnNhXeBOI0IY3AJtGeZO2cjDNAOeyF", "OUHreehzciBJFgJNDowFbwPiXi5p615H", "Ps2SQ7luP6kIA6gbjSFjdYKTtXuPzT18"};
    public Thread A00;
    public Throwable A01;
    public final int A02;
    public final int A03;
    public final DownloadAction A04;
    public final C0841Dm A05;
    public volatile int A06;
    public volatile InterfaceC0845Dq A07;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[2].charAt(18) == 'Y') {
                throw new RuntimeException();
            }
            A09[4] = "noItpERo7CNNkHWI";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
            i13++;
        }
    }

    public static void A0B() {
        A08 = new byte[]{74, 97, 121, 96, 98, 97, 111, 106, 46, 107, 124, 124, 97, 124, 32, 46, 92, 107, 122, 124, 119, 46, Ascii.DC4, 35, 53, 35, 50, 102, 35, 52, 52, 41, 52, 102, 37, 41, 51, 40, 50, 104, 102, 34, 41, 49, 40, 42, 41, 39, 34, 35, 34, 4, 63, 50, 35, 53, 102, 123, 102, 120, 77, 95, 71, Ascii.FF, 69, 95, Ascii.FF, 95, 88, 77, 94, 88, 73, 72};
    }

    static {
        A0B();
    }

    public RunnableC0838Dj(int i10, C0841Dm c0841Dm, DownloadAction downloadAction, int i11) {
        this.A02 = i10;
        this.A05 = c0841Dm;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i11;
    }

    public /* synthetic */ RunnableC0838Dj(int i10, C0841Dm c0841Dm, DownloadAction downloadAction, int i11, RunnableC0830Db runnableC0830Db) {
        this(i10, c0841Dm, downloadAction, i11);
    }

    private final float A00() {
        if (this.A07 != null) {
            return this.A07.A6N();
        }
        return -1.0f;
    }

    private int A01() {
        int i10 = this.A06;
        if (i10 == 5) {
            if (A09[2].charAt(18) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "PDzOFNAaWMsAK9ucradbIEZZH9uUUiPx";
            strArr[1] = "5zRQ9og93WQ9CsswYkuffD8bWtu0S7Rl";
            return 0;
        }
        String[] strArr2 = A09;
        if (strArr2[7].charAt(26) != strArr2[1].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A09;
        strArr3[6] = "vqOmrLNCQqkZmFNmkdUDZ8pThcmdYove";
        strArr3[3] = "yFowKLjp7WUTebccThRrdi4MGh2wopLF";
        if (i10 != 6 && i10 != 7) {
            return this.A06;
        }
        return 1;
    }

    private int A02(int i10) {
        return Math.min((i10 - 1) * 1000, 5000);
    }

    private final long A05() {
        if (this.A07 != null) {
            return this.A07.A6O();
        }
        return 0L;
    }

    public void A08() {
        Handler handler;
        if (!A0F(0, 5)) {
            if (!A0F(1, 6)) {
                return;
            }
            A09();
        } else {
            handler = this.A05.A07;
            handler.post(new RunnableC0835Dg(this));
        }
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        this.A00.interrupt();
    }

    public void A0A() {
        if (A0F(0, 1)) {
            this.A00 = new Thread(this);
            this.A00.start();
        }
    }

    public boolean A0E() {
        return this.A06 == 0;
    }

    public boolean A0F(int i10, int i11) {
        return A0G(i10, i11, null);
    }

    public boolean A0G(int i10, int i11, Throwable th) {
        if (this.A06 != i10) {
            return false;
        }
        this.A06 = i11;
        this.A01 = th;
        if (!(this.A06 != A01())) {
            this.A05.A0E(this);
        }
        return true;
    }

    public final C0840Dl A0K() {
        return new C0840Dl(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0L() {
        return this.A06 == 5 || this.A06 == 1 || this.A06 == 7 || this.A06 == 6;
    }

    public final boolean A0M() {
        return this.A06 == 4 || this.A06 == 2 || this.A06 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        C0846Dr c0846Dr;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            C0841Dm.A0J(A07(59, 15, 54), this);
            Throwable finalError = null;
            try {
                DownloadAction downloadAction = this.A04;
                c0846Dr = this.A05.A0A;
                this.A07 = downloadAction.A07(c0846Dr);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i10 = 0;
                    long j10 = -1;
                    while (!Thread.interrupted()) {
                        try {
                            this.A07.A4s();
                            break;
                        } catch (IOException e10) {
                            long errorPosition = this.A07.A6O();
                            if (errorPosition != j10) {
                                C0841Dm.A0J(A07(22, 37, 92) + errorPosition, this);
                                j10 = errorPosition;
                                i10 = 0;
                            }
                            if (this.A06 == 1 && (i10 = i10 + 1) <= this.A03) {
                                C0841Dm.A0J(A07(0, 22, 20) + i10, this);
                                Thread.sleep((long) A02(i10));
                            } else {
                                throw e10;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                finalError = th;
            }
            handler = this.A05.A07;
            handler.post(new RunnableC0836Dh(this, finalError));
        } catch (Throwable th2) {
            C0990Jm.A00(th2, this);
        }
    }

    public final String toString() {
        return super.toString();
    }
}
