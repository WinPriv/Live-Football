package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;

/* loaded from: classes.dex */
public class b extends a {
    public b(e eVar, Activity activity, p pVar) {
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

    public void a(m mVar, u uVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f16966d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f16965c.X(), (this.f16965c.ab() ? 3 : 5) | 48, mVar);
        }
        if (uVar != null) {
            this.f16966d.addView(uVar, this.f16967e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f16966d);
        } else {
            this.f16964b.setContentView(this.f16966d);
        }
    }
}
