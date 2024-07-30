package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1028Lb extends LinearLayout {
    public static int A00 = (int) (Kd.A02 * 56.0f);

    public abstract void A04(C1K c1k, boolean z10);

    public abstract boolean A05();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setPageDetails(C1U c1u, String str, int i10, C05441b c05441b);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i10);

    public abstract void setToolbarListener(InterfaceC1027La interfaceC1027La);

    public AbstractC1028Lb(Context context) {
        super(context);
    }
}
