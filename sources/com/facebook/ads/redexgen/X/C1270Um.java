package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.foundation.d.c;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1270Um implements BO {
    public static String[] A08 = {"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", c.bj};
    public static final BR A09 = new C1271Un();
    public long A00;
    public BQ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0804Cb> A05;
    public final HV A06;
    public final C0936Hh A07;

    public C1270Um() {
        this(new C0936Hh(0L));
    }

    public C1270Um(C0936Hh c0936Hh) {
        this.A07 = c0936Hh;
        this.A06 = new HV(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A8G(BQ bq) {
        this.A01 = bq;
        bq.AEE(new C1282Vb(b.f7291b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        if (r4 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        r10.AEk(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
    
        r9.A06.A0W(r5);
        r10.readFully(r9.A06.A00, 0, r5);
        r9.A06.A0Y(6);
        r4.A03(r9.A06);
        r1 = r9.A06;
        r0 = r1.A05();
        r1.A0X(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        if (r4 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    @Override // com.facebook.ads.redexgen.X.BO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ADQ(com.facebook.ads.redexgen.X.BP r10, com.facebook.ads.redexgen.X.BV r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1270Um.ADQ(com.facebook.ads.redexgen.X.BP, com.facebook.ads.redexgen.X.BV):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    @Override // com.facebook.ads.redexgen.X.BO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AED(long r3, long r5) {
        /*
            r2 = this;
            com.facebook.ads.redexgen.X.Hh r0 = r2.A07
            r0.A08()
            r1 = 0
        L6:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Cb> r0 = r2.A05
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            android.util.SparseArray<com.facebook.ads.redexgen.X.Cb> r0 = r2.A05
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Cb r0 = (com.facebook.ads.redexgen.X.C0804Cb) r0
            r0.A02()
            int r1 = r1 + 1
            goto L6
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1270Um.AED(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean AEm(BP bp) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        bp.AD0(bArr, 0, 14);
        if (442 != (((bArr[0] & DefaultClassResolver.NAME) << 24) | ((bArr[1] & DefaultClassResolver.NAME) << 16) | ((bArr[2] & DefaultClassResolver.NAME) << 8) | (bArr[3] & DefaultClassResolver.NAME)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        if (A08[7].length() == 3) {
            throw new RuntimeException();
        }
        A08[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
        int packStuffingLength = bArr[13] & 7;
        bp.A3K(packStuffingLength);
        bp.AD0(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i10 = (packStuffingLength2 & p.f9095b) << 16;
        int packStuffingLength3 = bArr[1];
        int i11 = i10 | ((packStuffingLength3 & p.f9095b) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & p.f9095b) | i11);
    }
}
