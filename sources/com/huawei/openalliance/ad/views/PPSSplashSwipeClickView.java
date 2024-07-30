package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class PPSSplashSwipeClickView extends PPSBaseSwipeView {
    public LinearLayout y;

    public PPSSplashSwipeClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        ex.V("PPSSplashSwipeClickView", "init");
        try {
            View inflate = View.inflate(context, R.layout.hiad_layout_splash_swipe_click, this);
            this.f23805s = inflate;
            this.y = (LinearLayout) inflate.findViewById(R.id.swipe_click_area);
            this.f23809w = (ImageView) this.f23805s.findViewById(R.id.hiad_click_arrow);
            this.f23806t = (TextView) this.f23805s.findViewById(R.id.hiad_click_swipe_string);
            this.f23807u = (TextView) this.f23805s.findViewById(R.id.hiad_click_swipe_desc);
            this.f23810x = (ScanningView) this.f23805s.findViewById(R.id.hiad_scanning_view);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            ex.I("PPSSplashSwipeClickView", str);
        } catch (Exception unused2) {
            str = "init error";
            ex.I("PPSSplashSwipeClickView", str);
        }
    }

    public LinearLayout getClickAreaView() {
        return this.y;
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseSwipeView
    public String getViewTag() {
        return "PPSSplashSwipeClickView";
    }
}
