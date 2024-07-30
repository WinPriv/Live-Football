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
public class PPSSplashTwistClickView extends PPSBaseTwistView {

    /* renamed from: x, reason: collision with root package name */
    public LinearLayout f23964x;

    public PPSSplashTwistClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        ex.V("PPSSplashTwistClickView", "init");
        try {
            View inflate = View.inflate(context, R.layout.hiad_layout_splash_twist_click, this);
            this.f23805s = inflate;
            this.f23812w = (ImageView) inflate.findViewById(R.id.hiad_click_phone_jpg);
            this.f23964x = (LinearLayout) this.f23805s.findViewById(R.id.twist_click_area);
            this.f23806t = (TextView) this.f23805s.findViewById(R.id.hiad_click_twist_string);
            this.f23807u = (TextView) this.f23805s.findViewById(R.id.hiad_click_twist_desc);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            ex.I("PPSSplashTwistClickView", str);
        } catch (Exception unused2) {
            str = "init error";
            ex.I("PPSSplashTwistClickView", str);
        }
    }

    public LinearLayout getClickAreaView() {
        return this.f23964x;
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseTwistView
    public String getViewTag() {
        return "PPSSplashTwistClickView";
    }
}
