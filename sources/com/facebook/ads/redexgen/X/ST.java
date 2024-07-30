package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ST extends AbstractRunnableC0997Ju {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ LR A01;

    public ST(LR lr, DialogInterface dialogInterface) {
        this.A01 = lr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        InterfaceC1143Po interfaceC1143Po;
        InterfaceC1143Po interfaceC1143Po2;
        C1315Wi c1315Wi;
        Map<? extends String, ? extends String> A04;
        interfaceC1143Po = this.A01.A01.A02;
        if (interfaceC1143Po != null) {
            interfaceC1143Po2 = this.A01.A01.A02;
            c1315Wi = this.A01.A01.A00;
            String A03 = C0979Ja.A03(c1315Wi);
            Q2 q22 = new Q2();
            A04 = this.A01.A01.A04(this.A01.A00.getText().toString());
            interfaceC1143Po2.AD4(A03, q22.A05(A04).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
