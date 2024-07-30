package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class WT implements InterfaceC0988Jk {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0988Jk
    public final void ADt(Throwable th, Object obj) {
        if (obj instanceof C7E) {
            C1316Wj adContext = ((C7E) obj).A5Z();
            if (adContext != null) {
                adContext.A0H(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1316Wj)) {
            return;
        }
        ((C1316Wj) context).A0H(th);
    }
}
