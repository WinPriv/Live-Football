package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.views.c1;
import ka.n7;

/* loaded from: classes2.dex */
public final class f1 extends c1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.graphics.drawable.Drawable] */
    public f1(Context context) {
        super(context);
        int i10;
        int i11;
        c1.b bVar;
        LayerDrawable layerDrawable;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean v3 = com.huawei.openalliance.ad.ppskit.utils.d0.v(context);
        if (v3) {
            i10 = R.drawable.hiad_extand_landing_app_down_btn_normal_hm_elderly;
        } else {
            i10 = R.drawable.hiad_extand_landing_app_down_btn_normal_hm;
        }
        this.f23403a.f23409a = context.getResources().getDrawable(i10);
        this.f23403a.f23410b = context.getResources().getColor(R.color.hiad_emui_white);
        if (v3) {
            i11 = R.drawable.hiad_extand_app_down_btn_processing_hm_elderly;
        } else {
            i11 = R.drawable.hiad_extand_app_down_btn_processing_hm;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) c1.a(i11, context);
        Drawable findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
        if (!(findDrawableByLayerId instanceof ClipDrawable)) {
            n7.g("ExtandAppDownloadButtonStyleHm", "not clipDrawable");
            if (v3) {
                i16 = R.drawable.hiad_extand_app_down_btn_processing_elderly;
            } else {
                i16 = R.drawable.hiad_extand_app_down_btn_processing;
            }
            bVar = this.f23404b;
            layerDrawable = c1.a(i16, context);
        } else {
            i1 i1Var = new i1(findDrawableByLayerId);
            layerDrawable2.mutate();
            layerDrawable2.setDrawableByLayerId(android.R.id.progress, i1Var);
            bVar = this.f23404b;
            layerDrawable = layerDrawable2;
        }
        bVar.f23409a = layerDrawable;
        this.f23404b.f23410b = context.getResources().getColor(R.color.hiad_emui_black);
        if (v3) {
            i12 = R.drawable.hiad_extand_app_down_btn_installing_hm_elderly;
        } else {
            i12 = R.drawable.hiad_extand_app_down_btn_installing_hm;
        }
        LayerDrawable layerDrawable3 = (LayerDrawable) c1.a(i12, context);
        if (!(layerDrawable3.findDrawableByLayerId(android.R.id.progress) instanceof ClipDrawable)) {
            n7.g("ExtandAppDownloadButtonStyleHm", "not clipDrawable");
            if (v3) {
                i15 = R.drawable.hiad_extand_app_down_btn_installing_elderly;
            } else {
                i15 = R.drawable.hiad_extand_app_down_btn_installing;
            }
            this.f.f23409a = c1.a(i15, context);
        } else {
            if (v3) {
                i13 = 20;
            } else {
                i13 = 18;
            }
            g1 g1Var = new g1(com.huawei.openalliance.ad.ppskit.utils.d0.b(context, i13));
            layerDrawable3.mutate();
            layerDrawable3.setDrawableByLayerId(android.R.id.progress, g1Var);
            this.f.f23409a = layerDrawable3;
            g1Var.a();
        }
        this.f.f23410b = context.getResources().getColor(R.color.hiad_emui_white);
        if (v3) {
            i14 = R.drawable.hiad_linked_app_down_btn_installing_elderly;
        } else {
            i14 = R.drawable.hiad_linked_app_down_btn_installing;
        }
        this.f23405c.f23409a = context.getResources().getDrawable(i14);
        this.f23405c.f23410b = context.getResources().getColor(R.color.hiad_emui_white);
    }
}
