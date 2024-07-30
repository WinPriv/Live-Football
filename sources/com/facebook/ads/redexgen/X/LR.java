package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public class LR implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ SS A01;

    public LR(SS ss, EditText editText) {
        this.A01 = ss;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new ST(this, dialogInterface));
    }
}
