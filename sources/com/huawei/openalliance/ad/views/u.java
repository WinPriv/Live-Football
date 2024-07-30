package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.views.s;
import gb.r0;

/* loaded from: classes2.dex */
public class u extends s {
    public u(Context context) {
        super(context);
        this.V.f24156a = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_normal_hm);
        s.b bVar = this.V;
        Resources resources = context.getResources();
        int i10 = R.color.hiad_emui_white;
        bVar.f24157b = resources.getColor(i10);
        LayerDrawable layerDrawable = (LayerDrawable) Code(context, R.drawable.hiad_app_down_btn_processing_hm);
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
        if (!(findDrawableByLayerId instanceof ClipDrawable)) {
            ex.I("ExtandAppDownloadButtonStyleHm", "not clipDrawable");
            this.I.f24156a = Code(context, R.drawable.hiad_app_down_btn_processing);
        } else {
            y yVar = new y(findDrawableByLayerId);
            layerDrawable.mutate();
            layerDrawable.setDrawableByLayerId(android.R.id.progress, yVar);
            this.I.f24156a = layerDrawable;
        }
        this.I.f24157b = context.getResources().getColor(R.color.hiad_emui_black);
        LayerDrawable layerDrawable2 = (LayerDrawable) Code(context, R.drawable.hiad_app_down_btn_installing_hm);
        if (!(layerDrawable2.findDrawableByLayerId(android.R.id.progress) instanceof ClipDrawable)) {
            ex.I("ExtandAppDownloadButtonStyleHm", "not clipDrawable");
            this.Z.f24156a = Code(context, R.drawable.hiad_app_down_btn_installing);
        } else {
            w wVar = new w(r0.i(context, 18.0f));
            layerDrawable2.mutate();
            layerDrawable2.setDrawableByLayerId(android.R.id.progress, wVar);
            this.Z.f24156a = layerDrawable2;
            if (ex.Code()) {
                ex.Code("HwFlickerDrawable", "start()");
            }
            if (wVar.f24167h != 0) {
                wVar.f24168i = System.currentTimeMillis();
                wVar.invalidateSelf();
                wVar.f24167h = 0;
            }
        }
        this.Z.f24157b = context.getResources().getColor(i10);
    }
}
