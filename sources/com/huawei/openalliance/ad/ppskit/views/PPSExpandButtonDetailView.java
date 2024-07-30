package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public class PPSExpandButtonDetailView extends PPSAppDetailView {
    public PPSExpandButtonDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView
    public final int a(Context context) {
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            if (this.M == 1) {
                return R.layout.hiad_landing_elderly_friendly_detail_half;
            }
            return R.layout.hiad_landing_elderly_friendly_detail;
        }
        if (this.M == 1) {
            return R.layout.hiad_landing_expand_button_detail_half;
        }
        return R.layout.hiad_landing_expand_button_detail;
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView
    public int getDetailStyle() {
        return 2;
    }

    public void setExtraViewVisibility(int i10) {
        if (i10 == 0) {
            return;
        }
        SixElementsView sixElementsView = this.S;
        if (sixElementsView != null) {
            sixElementsView.setVisibility(i10);
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.app_download_btn_rl);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, R.id.app_description);
        if (i10 == 0 && !com.huawei.openalliance.ad.ppskit.utils.d0.v(getContext())) {
            layoutParams.addRule(8);
            layoutParams.addRule(14);
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.hiad_16_dp);
        } else {
            layoutParams.setMargins(0, getResources().getDimensionPixelSize(R.dimen.hiad_16_dp), 0, getResources().getDimensionPixelSize(R.dimen.hiad_16_dp));
        }
        relativeLayout.setLayoutParams(layoutParams);
    }
}
