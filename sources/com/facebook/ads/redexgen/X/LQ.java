package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* loaded from: assets/audience_network.dex */
public class LQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ SS A00;

    public LQ(SS ss) {
        this.A00 = ss;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}
