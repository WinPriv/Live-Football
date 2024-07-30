package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MU implements View.OnClickListener {
    public static String[] A02 = {"TIunxDtIhaUNWzp4pt", "P9jotymXcalp6QY0mceKgA2PKmpL9MmY", "D7hcdAR4gL6eiDwh3neEemk2oNa5HBXr", "yvexzu4B1k7dNWe8D7Or2RByN379E6p0", "Pqli68R1jGGut3mXcbdL9aII4ZRM", "ATTETBfRTuy9XX9zcQNEfkNPOGv1roB9", "U61xFgZvYwebvbfIgBzckGL9tuihnAsk", "Y5vLZmHyGlb7iKoGDQtiStGzi5AFA8c4"};
    public final /* synthetic */ MD A00;
    public final /* synthetic */ S1 A01;

    public MU(S1 s12, MD md2) {
        this.A01 = s12;
        this.A00 = md2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABQ(C2F.A05);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            String[] strArr = A02;
            if (strArr[3].charAt(16) != strArr[7].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "30YalsquWEYpd1gcKbt6iXjPGudeG4qT";
            strArr2[1] = "9GHMqcINuHB0R6Mj0oiZfCiPilEGiYS9";
        }
    }
}
