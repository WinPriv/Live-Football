package com.huawei.hms.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public class in extends fz<kj> implements ja<kj> {
    private ko B;
    private ec I;
    private io Z;

    public in(Context context, kj kjVar) {
        Code((in) kjVar);
        this.I = ec.Code(context);
    }

    @Override // com.huawei.hms.ads.ja
    public void Code(int i10, boolean z10) {
        ex.V("SloganPresenter", "show image");
        if (i10 <= 0) {
            Code(z10);
            return;
        }
        I().Code(i10);
        if (z10) {
            id idVar = new id(this.I, this.B);
            this.Z = idVar;
            idVar.V();
        }
    }

    @Override // com.huawei.hms.ads.ja
    public void Code(ko koVar) {
        this.B = koVar;
    }

    private void Code(boolean z10) {
        if (z10) {
            ic icVar = new ic(this.I, this.B);
            this.Z = icVar;
            icVar.Code();
        }
    }
}
