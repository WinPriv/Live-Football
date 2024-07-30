package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.u;

/* loaded from: classes2.dex */
public class d extends com.huawei.hms.ads.template.downloadbuttonstyle.a {

    /* loaded from: classes2.dex */
    public static class a extends u {
        public a(Context context) {
            super(context);
            Resources resources = context.getResources();
            this.V.f24156a = resources.getDrawable(R.drawable.hiad_app_down_btn_normal);
            this.V.f24157b = resources.getColor(R.color.hiad_down_normal_text_icon);
            this.I.f24156a = Code(context, R.drawable.hiad_app_down_btn_processing);
            this.I.f24157b = resources.getColor(R.color.hiad_app_down_processing_text_icon);
            this.Z.f24156a = resources.getDrawable(R.drawable.hiad_app_down_btn_installing);
            this.Z.f24157b = resources.getColor(R.color.hiad_app_down_installing_text_icon);
        }
    }

    public d(Context context, AppDownloadButton appDownloadButton) {
        super(context, appDownloadButton);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void Code() {
        this.V.setAppDownloadButtonStyle(new a(this.Code));
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void V(Context context) {
        AppDownloadButton appDownloadButton = this.V;
        Resources resources = context.getResources();
        int i10 = R.dimen.hiad_56_dp;
        appDownloadButton.setMinWidth((int) resources.getDimension(i10));
        this.V.setMaxWidth((int) context.getResources().getDimension(i10));
        this.V.setFixedWidth(false);
        int dimension = (int) context.getResources().getDimension(R.dimen.hiad_8_dp);
        this.V.setPadding(dimension, dimension, dimension, dimension);
        this.V.setFontFamily(w.cU);
        this.V.setTextSize((int) context.getResources().getDimension(R.dimen.hiad_12_dp));
        this.V.setVisibility(0);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void Code(String str) {
        AppDownloadButton appDownloadButton = this.V;
        Resources resources = this.Code.getResources();
        int i10 = R.dimen.hiad_56_dp;
        appDownloadButton.setMinWidth((int) resources.getDimension(i10));
        this.V.setMaxWidth((int) this.Code.getResources().getDimension(i10));
        int dimension = (int) this.Code.getResources().getDimension(R.dimen.hiad_8_dp);
        this.V.setPadding(dimension, dimension, dimension, dimension);
        this.V.setFontFamily(w.cU);
        this.V.setTextSize(this.Code.getResources().getDimension(R.dimen.hiad_12_dp));
        this.V.setTextColor(this.Code.getResources().getColor(R.color.hiad_down_btn_normal));
        this.V.setBackground(this.Code.getResources().getDrawable(R.drawable.hiad_app_down_btn_normal));
        if (TextUtils.isEmpty(str)) {
            this.V.setText(this.Code.getString(R.string.hiad_detail));
        } else {
            this.V.setText(str);
        }
    }
}
