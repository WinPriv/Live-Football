package com.facebook.ads.redexgen.X;

import android.view.View;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public class P7 implements View.OnClickListener {
    public final /* synthetic */ JF A00;

    public P7(JF jf) {
        this.A00 = jf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0954Ib c0954Ib;
        C1316Wj c1316Wj;
        P1 p12;
        boolean A07;
        P1 p13;
        P1 p14;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            c0954Ib = this.A00.A03;
            c0954Ib.A02(EnumC0953Ia.A0d, null);
            c1316Wj = this.A00.A02;
            c1316Wj.A0D().A2z();
            p12 = this.A00.A00;
            if (p12 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    p14 = this.A00.A00;
                    p14.setVolume(1.0f);
                } else {
                    p13 = this.A00.A00;
                    p13.setVolume(gl.Code);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
