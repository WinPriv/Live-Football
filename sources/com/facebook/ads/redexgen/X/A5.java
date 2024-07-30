package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class A5 implements TZ, Comparator<C0923Gu> {
    public static String[] A03 = {"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    public long A00;
    public final long A01;
    public final TreeSet<C0923Gu> A02 = new TreeSet<>(this);

    public A5(long j10) {
        this.A01 = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0923Gu c0923Gu, C0923Gu c0923Gu2) {
        if (c0923Gu.A00 - c0923Gu2.A00 == 0) {
            return c0923Gu.compareTo(c0923Gu2);
        }
        return c0923Gu.A00 < c0923Gu2.A00 ? -1 : 1;
    }

    private void A01(InterfaceC0919Gq interfaceC0919Gq, long j10) {
        while (this.A00 + j10 > this.A01) {
            boolean isEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!isEmpty) {
                try {
                    interfaceC0919Gq.ADq(this.A02.first());
                } catch (C0917Go unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0918Gp
    public final void ACH(InterfaceC0919Gq interfaceC0919Gq, C0923Gu c0923Gu) {
        this.A02.add(c0923Gu);
        this.A00 += c0923Gu.A01;
        A01(interfaceC0919Gq, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0918Gp
    public final void ACI(InterfaceC0919Gq interfaceC0919Gq, C0923Gu c0923Gu) {
        this.A02.remove(c0923Gu);
        this.A00 -= c0923Gu.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0918Gp
    public final void ACJ(InterfaceC0919Gq interfaceC0919Gq, C0923Gu c0923Gu, C0923Gu c0923Gu2) {
        ACI(interfaceC0919Gq, c0923Gu);
        ACH(interfaceC0919Gq, c0923Gu2);
    }

    @Override // com.facebook.ads.redexgen.X.TZ
    public final void ACK(InterfaceC0919Gq interfaceC0919Gq, String str, long j10, long j11) {
        A01(interfaceC0919Gq, j11);
    }
}
