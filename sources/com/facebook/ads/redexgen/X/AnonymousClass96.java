package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.96, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass96 extends C1176Qv {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public AnonymousClass96(C2M c2m, int i10, @Nullable List<OM> list, @Nullable C1137Pi c1137Pi, @Nullable Bundle bundle) {
        super(c2m, i10, list, c1137Pi, bundle);
        c2m.A1j(this);
        this.A03 = new C1205Ry(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A27 = this.A0C.A27();
        if (this.A05 == null || A27 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A27 < curPos - 1) {
            int curPos2 = A27 + 1;
            A0V(curPos2);
        }
    }

    private void A01(int i10) {
        int visibleItem = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        int firstVisibleItem = this.A0C.A27();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0W(visibleItem, lastVisibleItem, i10);
    }

    @Override // com.facebook.ads.redexgen.X.C1176Qv, com.facebook.ads.redexgen.X.C4Y
    public final void A0L(C0849Dw c0849Dw, int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.C1176Qv, com.facebook.ads.redexgen.X.C4Y
    public final void A0M(C0849Dw c0849Dw, int i10, int i11) {
        if (this.A0C.A27() != -1) {
            RW rw = (RW) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (rw != null && rw.A0i() && !rw.A0h()) {
                rw.A0f();
            }
            A01(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1176Qv
    public final void A0Y(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.C1176Qv
    public final void A0a(RW rw, boolean z10) {
        A0Y(rw, z10);
        if (!z10 && rw.A0h()) {
            rw.A0e();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1176Qv
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C1137Pi A0c() {
        return this.A04;
    }

    public final void A0d(C1137Pi c1137Pi) {
        this.A04 = c1137Pi;
    }

    public final void A0e(List<OM> list) {
        this.A05 = list;
    }
}
