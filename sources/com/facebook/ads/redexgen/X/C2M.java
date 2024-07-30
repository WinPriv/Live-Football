package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C2M extends C0849Dw {
    public C2M(C1316Wj c1316Wj) {
        super(c1316Wj);
        setCarouselLayoutManager(c1316Wj);
    }

    @Nullable
    public C1175Qu getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof C1175Qu) {
            return (C1175Qu) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C0849Dw
    public C1343Xk getLayoutManager() {
        return (C1343Xk) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C1316Wj c1316Wj) {
        C1343Xk c1343Xk = new C1343Xk(c1316Wj, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1343Xk.A1V(true);
        }
        super.setLayoutManager(c1343Xk);
    }

    @Override // com.facebook.ads.redexgen.X.C0849Dw
    public void setLayoutManager(C4T c4t) {
    }
}
