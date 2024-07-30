package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class PPSSplashSwipeView extends PPSBaseSwipeView {
    public PPSSplashSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        ex.V("PPSSplashSwipeView", "init");
        try {
            View inflate = View.inflate(context, R.layout.hiad_layout_splash_swipe, this);
            this.f23805s = inflate;
            this.f23806t = (TextView) inflate.findViewById(R.id.hiad_swipe_string);
            this.f23807u = (TextView) this.f23805s.findViewById(R.id.hiad_swipe_desc);
            this.f23809w = (ImageView) this.f23805s.findViewById(R.id.hiad_arrow);
            this.f23810x = (ScanningView) this.f23805s.findViewById(R.id.scanning_view);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            ex.I("PPSSplashSwipeView", str);
        } catch (Exception unused2) {
            str = "init error";
            ex.I("PPSSplashSwipeView", str);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseSwipeView
    public String getViewTag() {
        return "PPSSplashSwipeView";
    }
}
