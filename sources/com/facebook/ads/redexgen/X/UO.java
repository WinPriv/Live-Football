package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public abstract class UO implements EM {
    public W2 A00;
    public AbstractC07509n A01;
    public Object A02;
    public final ArrayList<EL> A04 = new ArrayList<>(1);
    public final EX A03 = new EX();

    public abstract void A02();

    public abstract void A03(W2 w22, boolean z10);

    public final EX A00(@Nullable EK ek) {
        return this.A03.A02(0, ek, 0L);
    }

    public final void A01(AbstractC07509n abstractC07509n, @Nullable Object obj) {
        this.A01 = abstractC07509n;
        this.A02 = obj;
        Iterator<EL> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACG(this, abstractC07509n, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void A3C(Handler handler, InterfaceC0853Ea interfaceC0853Ea) {
        this.A03.A07(handler, interfaceC0853Ea);
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADC(W2 w22, boolean z10, EL el) {
        W2 w23 = this.A00;
        H6.A03(w23 == null || w23 == w22);
        this.A04.add(el);
        if (this.A00 == null) {
            this.A00 = w22;
            A03(w22, z10);
        } else {
            AbstractC07509n abstractC07509n = this.A01;
            if (abstractC07509n == null) {
                return;
            }
            el.ACG(this, abstractC07509n, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADm(EL el) {
        this.A04.remove(el);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADo(InterfaceC0853Ea interfaceC0853Ea) {
        this.A03.A0D(interfaceC0853Ea);
    }
}
