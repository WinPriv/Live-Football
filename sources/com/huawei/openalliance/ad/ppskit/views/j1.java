package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.Resources;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public final class j1 extends c1 {
    public j1(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        boolean v3 = com.huawei.openalliance.ad.ppskit.utils.d0.v(context);
        Resources resources = context.getResources();
        if (v3) {
            i10 = R.drawable.hiad_extand_landing_app_down_btn_normal_elderly;
        } else {
            i10 = R.drawable.hiad_extand_landing_app_down_btn_normal;
        }
        this.f23403a.f23409a = resources.getDrawable(i10);
        this.f23403a.f23410b = resources.getColor(R.color.hiad_emui_white);
        if (v3) {
            i11 = R.drawable.hiad_ppswebview_app_down_btn_processing_elderly;
        } else {
            i11 = R.drawable.hiad_ppswebview_app_down_btn_processing;
        }
        this.f23404b.f23409a = c1.a(i11, context);
        this.f23404b.f23410b = resources.getColor(R.color.hiad_emui_black);
        if (v3) {
            i12 = R.drawable.hiad_ppswebview_app_down_btn_installing_elderly;
        } else {
            i12 = R.drawable.hiad_ppswebview_app_down_btn_installing;
        }
        this.f.f23409a = resources.getDrawable(i12);
        this.f.f23410b = resources.getColor(R.color.hiad_app_down_installing_text);
        if (v3) {
            i13 = R.drawable.hiad_linked_app_down_btn_installing_elderly;
        } else {
            i13 = R.drawable.hiad_linked_app_down_btn_installing;
        }
        this.f23405c.f23409a = resources.getDrawable(i13);
        this.f23405c.f23410b = resources.getColor(R.color.hiad_emui_white);
    }
}
