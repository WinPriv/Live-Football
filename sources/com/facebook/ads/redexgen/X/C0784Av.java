package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0784Av {
    public final CopyOnWriteArrayList<C0783Au> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<C0783Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0783Au next = it.next();
            InterfaceC0785Aw listener = next.A01;
            next.A00.post(new RunnableC0779Aq(this, listener));
        }
    }

    public final void A01() {
        Iterator<C0783Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0783Au next = it.next();
            InterfaceC0785Aw listener = next.A01;
            next.A00.post(new RunnableC0782At(this, listener));
        }
    }

    public final void A02() {
        Iterator<C0783Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0783Au next = it.next();
            InterfaceC0785Aw listener = next.A01;
            next.A00.post(new RunnableC0781As(this, listener));
        }
    }

    public final void A03(Handler handler, InterfaceC0785Aw interfaceC0785Aw) {
        H6.A03((handler == null || interfaceC0785Aw == null) ? false : true);
        this.A00.add(new C0783Au(handler, interfaceC0785Aw));
    }

    public final void A04(Exception exc) {
        Iterator<C0783Au> it = this.A00.iterator();
        while (it.hasNext()) {
            C0783Au next = it.next();
            InterfaceC0785Aw listener = next.A01;
            next.A00.post(new RunnableC0780Ar(this, listener, exc));
        }
    }
}
