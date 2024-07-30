package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class FF implements InterfaceC1144Pp {
    public final /* synthetic */ C06023j A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public FF(C06023j c06023j, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c06023j;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1144Pp
    public final void AAG(InterfaceC1142Pn interfaceC1142Pn) {
        C06023j.A06(interfaceC1142Pn.A5n(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1144Pp
    public final void AAd(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
