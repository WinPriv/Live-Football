package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public final class n1 extends c1 {
    public n1(Context context) {
        super(context);
        int i10;
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            i10 = R.drawable.hiad_extand_landing_app_down_btn_pre_scan_elderly;
        } else {
            i10 = R.drawable.hiad_extand_landing_app_down_btn_pre_scan;
        }
        this.f23403a.f23409a = context.getResources().getDrawable(i10);
        this.f23403a.f23410b = context.getResources().getColor(R.color.hiad_emui_accent);
    }
}
