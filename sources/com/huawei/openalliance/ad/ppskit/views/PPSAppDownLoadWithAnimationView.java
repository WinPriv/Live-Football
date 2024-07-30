package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.util.AttributeSet;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public class PPSAppDownLoadWithAnimationView extends PPSAppDetailView {
    public PPSAppDownLoadWithAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView
    public final int a(Context context) {
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            return R.layout.hiad_app_download_elderly_font_with_animation_template;
        }
        return R.layout.hiad_app_download_with_animation_template;
    }
}
