package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class N7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ N9 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public N7(N9 n92, String str, Map map) {
        this.A00 = n92;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        IT it;
        it = this.A00.A04;
        it.A9H(this.A01, this.A02);
    }
}
