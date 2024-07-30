package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0841Dm {
    public static byte[] A0F;
    public static String[] A0G = {"8avf0Jibg", "29lNoiTUBE2uYEjX9VQOmTXDz5OY", "iVCyimFGxTrkRtFibV9levDJM5ZeLgZu", "gsRFpTOWHqJbEx7", "Kz1bOIham", "JnXM2eLoSoNer4vADvBB94foIijHhZU8", "txozpLaaBXvdIU5pC59NuAEDTSpBHfjF", "fwU5WNlYuxW7JC9kmXc8msxXEM9ymJ0s"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final DS A09;
    public final C0846Dr A0A;
    public final ArrayList<RunnableC0838Dj> A0B;
    public final ArrayList<RunnableC0838Dj> A0C;
    public final CopyOnWriteArraySet<InterfaceC0834Df> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0G[7].charAt(18) == 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "QeXCOK5E1pPej2TxlzyNK8QEELc16ejC";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
            i13++;
        }
    }

    public static void A0C() {
        A0F = new byte[]{40, 107, 100, 105, 123, 96, 109, 123, 40, Ascii.DEL, 97, 124, 96, 40, Ascii.CR, Ascii.ETB, 101, 80, 4, 72, 65, 69, 87, 80, 4, 75, 74, 65, 4, 96, 65, 87, 65, 86, 77, 69, 72, 77, 94, 65, 86, 4, 77, 87, 4, 86, 65, 85, 81, 77, 86, 65, 64, 10, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Ascii.DEL, 122, 115, 54, Ascii.DEL, 57, 121, 37, Ascii.DLE, 2, Ascii.SUB, 81, Ascii.CAN, 2, 81, Ascii.DLE, Ascii.NAK, Ascii.NAK, Ascii.DC4, Ascii.NAK, Ascii.NAK, 32, 50, 42, 97, 50, 53, 32, 53, 36, 97, 40, 50, 97, 34, 41, 32, 47, 38, 36, 37};
    }

    static {
        A0C();
    }

    public C0841Dm(C0846Dr c0846Dr, int i10, int i11, File file, DownloadAction.Deserializer... deserializerArr) {
        H6.A05(deserializerArr.length > 0, A05(16, 38, 67));
        this.A0A = c0846Dr;
        this.A04 = i10;
        this.A05 = i11;
        this.A09 = new DS(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A08 = new HandlerThread(A05(54, 24, 113));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0838Dj A02(DownloadAction downloadAction) {
        int i10 = this.A00;
        this.A00 = i10 + 1;
        RunnableC0838Dj runnableC0838Dj = new RunnableC0838Dj(i10, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0838Dj);
        A0J(A05(78, 13, 22), runnableC0838Dj);
        return runnableC0838Dj;
    }

    private void A08() {
        this.A06.post(new RunnableC0832Dd(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC0834Df> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().AAq(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction A06;
        boolean canStartTask;
        if (!this.A02 || this.A03) {
            return;
        }
        boolean skipDownloadActions = this.A01 || this.A0B.size() == this.A04;
        for (int i10 = 0; i10 < this.A0C.size(); i10++) {
            RunnableC0838Dj runnableC0838Dj = this.A0C.get(i10);
            if (RunnableC0838Dj.A0H(runnableC0838Dj) && ((canStartTask = (A06 = RunnableC0838Dj.A06(runnableC0838Dj)).A03) || !skipDownloadActions)) {
                boolean z10 = true;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    RunnableC0838Dj runnableC0838Dj2 = this.A0C.get(i11);
                    if (RunnableC0838Dj.A06(runnableC0838Dj2).A09(A06)) {
                        if (canStartTask) {
                            z10 = false;
                            String str = runnableC0838Dj + A05(0, 14, 111) + runnableC0838Dj2;
                            RunnableC0838Dj.A0C(runnableC0838Dj2);
                        } else if (RunnableC0838Dj.A06(runnableC0838Dj2).A03) {
                            z10 = false;
                            skipDownloadActions = true;
                            break;
                        }
                    }
                    i11++;
                }
                if (z10) {
                    RunnableC0838Dj.A0D(runnableC0838Dj);
                    if (!canStartTask) {
                        this.A0B.add(runnableC0838Dj);
                        skipDownloadActions = this.A0B.size() == this.A04;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i10 = 0; i10 < this.A0C.size(); i10++) {
            downloadActionArr[i10] = RunnableC0838Dj.A06(this.A0C.get(i10));
        }
        this.A06.post(new RunnableC0833De(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC0838Dj runnableC0838Dj) {
        A0J(A05(91, 21, 38), runnableC0838Dj);
        C0840Dl A0K = runnableC0838Dj.A0K();
        Iterator<InterfaceC0834Df> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ACP(this, A0K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0838Dj runnableC0838Dj) {
        if (this.A03) {
            return;
        }
        boolean A0L = runnableC0838Dj.A0L();
        String[] strArr = A0G;
        if (strArr[2].charAt(18) != strArr[6].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[5] = "MuXE9yewg4GnYpwcSobAkjsL3VeJsTJN";
        boolean z10 = !A0L;
        if (z10) {
            this.A0B.remove(runnableC0838Dj);
        }
        A0D(runnableC0838Dj);
        boolean stopped = runnableC0838Dj.A0M();
        if (stopped) {
            this.A0C.remove(runnableC0838Dj);
            A0B();
        }
        if (z10) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0838Dj runnableC0838Dj) {
        String str2 = str + A05(14, 2, 80) + runnableC0838Dj;
    }

    public final int A0O(DownloadAction downloadAction) {
        H6.A04(!this.A03);
        RunnableC0838Dj A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (RunnableC0838Dj.A03(A02) == 0) {
                A0D(A02);
            }
        }
        return RunnableC0838Dj.A04(A02);
    }

    public final void A0P() {
        H6.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0834Df interfaceC0834Df) {
        this.A0D.add(interfaceC0834Df);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0R() {
        /*
            r4 = this;
            boolean r0 = r4.A03
            r3 = 1
            r0 = r0 ^ r3
            com.facebook.ads.redexgen.X.H6.A04(r0)
            boolean r0 = r4.A02
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dj> r0 = r4.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L28
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dj> r0 = r4.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Dj r0 = (com.facebook.ads.redexgen.X.RunnableC0838Dj) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0841Dm.A0R():boolean");
    }

    public final C0840Dl[] A0S() {
        H6.A04(!this.A03);
        C0840Dl[] c0840DlArr = new C0840Dl[this.A0C.size()];
        for (int i10 = 0; i10 < c0840DlArr.length; i10++) {
            c0840DlArr[i10] = this.A0C.get(i10).A0K();
        }
        return c0840DlArr;
    }
}
