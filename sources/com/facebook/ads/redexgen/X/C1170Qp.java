package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1170Qp implements InterfaceC1082Ne {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ OM A00;
    public final /* synthetic */ C1169Qo A01;

    public C1170Qp(C1169Qo c1169Qo, OM om) {
        this.A01 = c1169Qo;
        this.A00 = om;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1082Ne
    public final void A9x() {
        C1137Pi c1137Pi;
        C1137Pi c1137Pi2;
        C1137Pi c1137Pi3;
        if (this.A00.A02() == 0) {
            c1137Pi3 = this.A01.A01;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            c1137Pi3.A0U();
        }
        c1137Pi = this.A01.A02;
        if (c1137Pi != null) {
            c1137Pi2 = this.A01.A02;
            c1137Pi2.A0U();
        }
    }
}
