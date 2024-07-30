package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EU extends AbstractC1379Yw {
    public final C1316Wj A00;
    public final C0972It A01;

    public EU(C1316Wj c1316Wj, C1A c1a, List<C1228Sw> list, @Nullable C0972It c0972It) {
        super(c1a, list, c1316Wj);
        this.A00 = c1316Wj;
        this.A01 = c0972It == null ? new C0972It() : c0972It;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SN A06(ViewGroup viewGroup, int i10) {
        return new SN(new C1031Le(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1379Yw, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(SN sn, int i10) {
        super.A0E(sn, i10);
        C1031Le c1031Le = (C1031Le) sn.A0l();
        A0F(c1031Le.getImageCardView(), i10);
        if (((AbstractC1379Yw) this).A01.get(i10) != null) {
            c1031Le.setTitle(((AbstractC1379Yw) this).A01.get(i10).getAdHeadline());
            c1031Le.setSubtitle(((AbstractC1379Yw) this).A01.get(i10).getAdLinkDescription());
            c1031Le.setButtonText(((AbstractC1379Yw) this).A01.get(i10).getAdCallToAction());
        }
        C1228Sw c1228Sw = ((AbstractC1379Yw) this).A01.get(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1031Le);
        c1228Sw.A1O(c1031Le, c1031Le, arrayList);
    }
}
