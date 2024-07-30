package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d extends a {
    public d(e eVar, Activity activity, p pVar) {
        super(eVar, activity, pVar);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }

    public void a(ImageView imageView, m mVar, m mVar2, com.applovin.impl.adview.a aVar, u uVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f16966d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f16965c.X(), (this.f16965c.ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            a(this.f16965c.X(), (this.f16965c.ab() ? 3 : 5) | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f16964b, ((Integer) this.f16963a.a(com.applovin.impl.sdk.c.b.cJ)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f16963a.a(com.applovin.impl.sdk.c.b.cL)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f16964b, ((Integer) this.f16963a.a(com.applovin.impl.sdk.c.b.cK)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f16966d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f16966d.addView(aVar, this.f16967e);
        }
        if (uVar != null) {
            this.f16966d.addView(uVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f16966d);
        } else {
            this.f16964b.setContentView(this.f16966d);
        }
    }
}
