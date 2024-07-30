package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.s;
import com.huawei.openalliance.ad.views.u;

/* loaded from: classes2.dex */
public class b extends com.huawei.hms.ads.template.downloadbuttonstyle.a {
    protected int I;
    protected int Z;

    /* loaded from: classes2.dex */
    public static class a extends u {
        public a(Context context, int i10) {
            super(context);
            Resources resources = context.getResources();
            s.b bVar = this.V;
            int i11 = R.drawable.hiad_native_tpt_list_page_btn;
            bVar.f24156a = resources.getDrawable(i11);
            this.V.getClass();
            this.V.f24157b = resources.getColor(R.color.hiad_down_btn_normal);
            this.I.f24156a = resources.getDrawable(i11);
            this.I.getClass();
            this.I.f24157b = resources.getColor(R.color.hiad_down_btn_process);
            this.Z.f24156a = resources.getDrawable(i11);
            this.Z.getClass();
            this.Z.f24157b = resources.getColor(R.color.hiad_down_btn_installing);
        }
    }

    public b(Context context, AppDownloadButton appDownloadButton) {
        super(context, appDownloadButton);
        this.I = (int) context.getResources().getDimension(R.dimen.hiad_12_dp);
        this.Z = (int) context.getResources().getDimension(R.dimen.hiad_6_dp);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void Code() {
        this.V.setAppDownloadButtonStyle(new a(this.Code, this.I));
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void V(Context context) {
        this.V.setMinWidth((int) context.getResources().getDimension(R.dimen.hiad_64_dp));
        this.V.setPadding(0, 0, 0, this.Z);
        this.V.setMaxWidth((int) context.getResources().getDimension(R.dimen.hiad_144_dp));
        this.V.setFontFamily(w.cU);
        this.V.setTextSize(this.I);
        this.V.setVisibility(0);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void Code(String str) {
        this.V.setMinWidth((int) this.Code.getResources().getDimension(R.dimen.hiad_64_dp));
        this.V.setPadding(0, 0, 0, this.Z);
        this.V.setMaxWidth((int) this.Code.getResources().getDimension(R.dimen.hiad_144_dp));
        this.V.setFontFamily(w.cU);
        this.V.setTextSize(this.I);
        this.V.setTextColor(this.Code.getResources().getColor(R.color.hiad_down_btn_normal));
        this.V.setBackground(this.Code.getResources().getDrawable(R.drawable.hiad_native_tpt_list_page_btn));
        if (TextUtils.isEmpty(str)) {
            this.V.setText(this.Code.getString(R.string.hiad_detail));
        } else {
            this.V.setText(str);
        }
    }
}
