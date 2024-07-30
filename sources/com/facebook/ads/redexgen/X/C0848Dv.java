package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Dv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0848Dv extends C1342Xj {
    public final /* synthetic */ XU A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0848Dv(XU xu, Context context) {
        super(context);
        this.A00 = xu;
    }

    @Override // com.facebook.ads.redexgen.X.C1342Xj, com.facebook.ads.redexgen.X.AbstractC06244g
    public final void A0I(View view, C06264i c06264i, C06224e c06224e) {
        XU xu = this.A00;
        int[] A0H = xu.A0H(xu.A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c06224e.A04(time, dy, dx, ((C1342Xj) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1342Xj
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
