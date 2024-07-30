package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;

/* renamed from: com.facebook.ads.redexgen.X.Dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0831Dc implements Runnable {
    public final /* synthetic */ RunnableC0832Dd A00;
    public final /* synthetic */ DownloadAction[] A01;

    public RunnableC0831Dc(RunnableC0832Dd runnableC0832Dd, DownloadAction[] downloadActionArr) {
        this.A00 = runnableC0832Dd;
        this.A01 = downloadActionArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0091 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            boolean r0 = com.facebook.ads.redexgen.X.C0990Jm.A02(r8)
            if (r0 == 0) goto L7
            return
        L7:
            r2 = r8
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = com.facebook.ads.redexgen.X.C0841Dm.A0L(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L13
            return
        L13:
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0841Dm.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb2
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0841Dm.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            r0.clear()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.internal.exoplayer2.offline.DownloadAction[] r7 = r2.A01     // Catch: java.lang.Throwable -> Lb2
            int r6 = r7.length     // Catch: java.lang.Throwable -> Lb2
            r3 = 0
            r4 = 0
        L30:
            if (r4 >= r6) goto L3e
            r1 = r7[r4]     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0841Dm.A03(r0, r1)     // Catch: java.lang.Throwable -> Lb2
            int r4 = r4 + 1
            goto L30
        L3e:
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r1 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            r0 = 1
            com.facebook.ads.redexgen.X.C0841Dm.A0M(r1, r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.ads.redexgen.X.C0841Dm.A07(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Lb2
        L52:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L66
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Df r1 = (com.facebook.ads.redexgen.X.InterfaceC0834Df) r1     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            r1.AAu(r0)     // Catch: java.lang.Throwable -> Lb2
            goto L52
        L66:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L7e
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0841Dm.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            r0.addAll(r5)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0841Dm.A0F(r0)     // Catch: java.lang.Throwable -> Lb2
        L7e:
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0841Dm.A0G(r0)     // Catch: java.lang.Throwable -> Lb2
        L85:
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0841Dm.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb2
            if (r3 >= r0) goto Lb1
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.C0841Dm.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dj r1 = (com.facebook.ads.redexgen.X.RunnableC0838Dj) r1     // Catch: java.lang.Throwable -> Lb2
            int r0 = com.facebook.ads.redexgen.X.RunnableC0838Dj.A03(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto Lae
            com.facebook.ads.redexgen.X.Dd r0 = r2.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.Dm r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.C0841Dm.A0H(r0, r1)     // Catch: java.lang.Throwable -> Lb2
        Lae:
            int r3 = r3 + 1
            goto L85
        Lb1:
            return
        Lb2:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C0990Jm.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RunnableC0831Dc.run():void");
    }
}
