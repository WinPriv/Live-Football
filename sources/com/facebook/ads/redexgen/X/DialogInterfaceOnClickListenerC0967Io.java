package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0967Io implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1230Sy A00;

    public DialogInterfaceOnClickListenerC0967Io(ViewOnClickListenerC1230Sy viewOnClickListenerC1230Sy) {
        this.A00 = viewOnClickListenerC1230Sy;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            Z9 z92 = this.A00.A01.A0a;
            A01 = this.A00.A01();
            z92.A0P(A01);
        }
    }
}
