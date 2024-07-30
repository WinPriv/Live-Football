package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class PPSSplashTwistView extends PPSBaseTwistView {
    public PPSSplashTwistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        ex.V("PPSSplashTwistView", "init");
        try {
            View inflate = View.inflate(context, R.layout.hiad_layout_splash_twist, this);
            this.f23805s = inflate;
            this.f23812w = (ImageView) inflate.findViewById(R.id.hiad_phone_jpg);
            this.f23806t = (TextView) this.f23805s.findViewById(R.id.hiad_twist_string);
            this.f23807u = (TextView) this.f23805s.findViewById(R.id.hiad_twist_desc);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            ex.I("PPSSplashTwistView", str);
        } catch (Exception unused2) {
            str = "init error";
            ex.I("PPSSplashTwistView", str);
        }
    }
}
