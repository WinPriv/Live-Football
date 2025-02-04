package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class J1 {
    public final InterfaceC0978Iz A0B;
    public final boolean A0F;
    public final String A0C = J1.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<J0> A0D = new LinkedList();

    public J1(C7G c7g, InterfaceC0978Iz interfaceC0978Iz) {
        int nativeViewabilityHistorySamplingRate = IF.A0D(c7g);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c7g.A07().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC0978Iz;
    }

    private int A00() {
        return this.A0B.A6C();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(J0 j02) {
        synchronized (this.A0D) {
            this.A0D.add(j02);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new J0(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 102, A00(), null));
    }

    public final void A0C(C7G c7g, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new J0(A01(), 103, A00(), null));
        LJ.A06.execute(new RunnableC0977Iy(this, str, c7g));
    }
}
