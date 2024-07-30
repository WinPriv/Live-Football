package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1171Qq extends AbstractC1136Ph {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ IT A00;
    public final /* synthetic */ L6 A01;
    public final /* synthetic */ OM A02;
    public final /* synthetic */ C1169Qo A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1171Qq(C1169Qo c1169Qo, String str, OM om, IT it, Map map, L6 l62) {
        this.A03 = c1169Qo;
        this.A04 = str;
        this.A02 = om;
        this.A00 = it;
        this.A05 = map;
        this.A01 = l62;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A02() {
        C1137Pi c1137Pi;
        SparseBooleanArray sparseBooleanArray;
        C1137Pi c1137Pi2;
        SparseBooleanArray sparseBooleanArray2;
        c1137Pi = this.A03.A01;
        if (c1137Pi.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A04;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                IT it = this.A00;
                String str2 = this.A04;
                N2 n22 = new N2(this.A05);
                c1137Pi2 = this.A03.A02;
                it.A8z(str2, n22.A03(c1137Pi2).A02(this.A01).A05());
                sparseBooleanArray2 = this.A03.A04;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
