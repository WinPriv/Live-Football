package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class P9 extends AbstractRunnableC0997Ju {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ P1 A02;
    public final /* synthetic */ EnumC1134Pf A03;

    public P9(P1 p12, EnumC1134Pf enumC1134Pf, int i10, int i11) {
        this.A02 = p12;
        this.A03 = enumC1134Pf;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1316Wj c1316Wj;
        Handler handler;
        C8N c8n;
        C1316Wj c1316Wj2;
        C8N c8n2;
        C0984Jg c0984Jg;
        Handler handler2;
        C1316Wj c1316Wj3;
        C8N c8n3;
        Handler handler3;
        C1316Wj c1316Wj4;
        C1316Wj c1316Wj5;
        C8N c8n4;
        KV kv;
        Handler handler4;
        C1316Wj c1316Wj6;
        C1316Wj c1316Wj7;
        Handler handler5;
        C8N c8n5;
        C8N c8n6;
        C1043Lq c1043Lq;
        C1316Wj c1316Wj8;
        C8N c8n7;
        if (this.A03 == EnumC1134Pf.A07) {
            this.A02.A0L(EnumC0953Ia.A0q);
            c1316Wj8 = this.A02.A0A;
            c1316Wj8.A0D().A2w();
            c8n7 = this.A02.A0B;
            c8n7.A02(P1.A0C());
            return;
        }
        if (this.A03 == EnumC1134Pf.A03) {
            this.A02.A0L(EnumC0953Ia.A0l);
            this.A02.A03 = true;
            c8n6 = this.A02.A0B;
            c1043Lq = P1.A0G;
            c8n6.A02(c1043Lq);
            this.A02.A0K(this.A00);
            return;
        }
        EnumC1134Pf enumC1134Pf = this.A03;
        EnumC1134Pf enumC1134Pf2 = EnumC1134Pf.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (enumC1134Pf == enumC1134Pf2) {
            this.A02.A0L(EnumC0953Ia.A0k);
            c1316Wj7 = this.A02.A0A;
            c1316Wj7.A0D().A2o();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c8n5 = this.A02.A0B;
            int i10 = this.A01;
            c8n5.A02(new C6v(i10, i10));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == EnumC1134Pf.A0A) {
            c1316Wj4 = this.A02.A0A;
            if (ID.A1K(c1316Wj4)) {
                c1316Wj6 = this.A02.A0A;
                c1316Wj6.A09().ACl();
            }
            this.A02.A0L(EnumC0953Ia.A0o);
            c1316Wj5 = this.A02.A0A;
            c1316Wj5.A0D().A33();
            c8n4 = this.A02.A0B;
            kv = P1.A0H;
            c8n4.A02(kv);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == EnumC1134Pf.A05) {
            this.A02.A0L(EnumC0953Ia.A0n);
            c1316Wj3 = this.A02.A0A;
            c1316Wj3.A0D().A2s();
            c8n3 = this.A02.A0B;
            final int i11 = this.A00;
            c8n3.A02(new AbstractC1045Ls(i11) { // from class: com.facebook.ads.redexgen.X.6s
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == EnumC1134Pf.A04) {
            this.A02.A0L(EnumC0953Ia.A0m);
            c1316Wj2 = this.A02.A0A;
            c1316Wj2.A0D().A2p();
            c8n2 = this.A02.A0B;
            c0984Jg = P1.A0K;
            c8n2.A02(c0984Jg);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC1134Pf.A09) {
            this.A02.A0L(EnumC0953Ia.A0k);
            c1316Wj = this.A02.A0A;
            c1316Wj.A0D().A2y();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c8n = this.A02.A0B;
            c8n.A02(new C6v(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
