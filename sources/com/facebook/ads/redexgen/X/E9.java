package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.anythink.expressad.exoplayer.f;

/* loaded from: assets/audience_network.dex */
public final class E9 extends SV<YV> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public E9(YV yv) {
        super(yv);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1316Wj c1316Wj;
        Handler handler;
        Runnable runnable;
        YV A07 = A07();
        if (A07 == null) {
            return;
        }
        c1316Wj = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (LV.A02(c1316Wj)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, f.f7962a);
    }
}
