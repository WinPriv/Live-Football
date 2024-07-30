package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.9e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07429e {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC07409c A0A;
    public final InterfaceC07419d A0B;
    public final AbstractC07509n A0C;
    public long A02 = b.f7291b;
    public boolean A05 = true;

    public C07429e(InterfaceC07409c interfaceC07409c, InterfaceC07419d interfaceC07419d, AbstractC07509n abstractC07509n, int i10, Handler handler) {
        this.A0A = interfaceC07409c;
        this.A0B = interfaceC07419d;
        this.A0C = abstractC07509n;
        this.A03 = handler;
        this.A01 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC07419d A04() {
        return this.A0B;
    }

    public final C07429e A05() {
        H6.A04(!this.A09);
        if (this.A02 == b.f7291b) {
            H6.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AEL(this);
        return this;
    }

    public final C07429e A06(int i10) {
        H6.A04(!this.A09);
        this.A00 = i10;
        return this;
    }

    public final C07429e A07(@Nullable Object obj) {
        H6.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC07509n A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        H6.A04(this.A09);
        H6.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
