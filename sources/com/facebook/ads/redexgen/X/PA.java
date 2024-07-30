package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PA implements View.OnClickListener {
    public final /* synthetic */ C6A A00;

    public PA(C6A c6a) {
        this.A00 = c6a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        P1 videoView;
        C0954Ib c0954Ib;
        C1316Wj c1316Wj;
        P1 videoView2;
        P1 videoView3;
        P1 videoView4;
        C0954Ib c0954Ib2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                c0954Ib = this.A00.A02;
                if (c0954Ib != null) {
                    c0954Ib2 = this.A00.A02;
                    c0954Ib2.A02(EnumC0953Ia.A0p, null);
                }
                c1316Wj = this.A00.A01;
                c1316Wj.A0D().A2t();
                int[] iArr = PB.A00;
                videoView2 = this.A00.getVideoView();
                int i10 = iArr[videoView2.getState().ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    videoView3 = this.A00.getVideoView();
                    videoView3.A0b(EnumC1121Os.A04, 12);
                } else if (i10 == 5) {
                    videoView4 = this.A00.getVideoView();
                    videoView4.A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
