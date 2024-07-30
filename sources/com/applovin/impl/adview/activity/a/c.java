package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;

/* loaded from: classes.dex */
public class c extends a {
    public c(e eVar, Activity activity, p pVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.ImageView r20, com.applovin.impl.adview.m r21, final com.applovin.impl.adview.v r22, com.applovin.impl.adview.a r23, android.widget.ProgressBar r24, android.view.View r25, com.applovin.adview.AppLovinAdView r26, com.applovin.impl.adview.u r27, android.widget.ImageView r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.a.c.a(android.widget.ImageView, com.applovin.impl.adview.m, com.applovin.impl.adview.v, com.applovin.impl.adview.a, android.widget.ProgressBar, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.u, android.widget.ImageView, android.view.ViewGroup):void");
    }

    public void a(m mVar, u uVar, View view) {
        if (view != null) {
            view.setVisibility(0);
        }
        com.applovin.impl.sdk.utils.c.a(this.f16966d, view);
        if (mVar != null) {
            a(this.f16965c.X(), (this.f16965c.ab() ? 3 : 5) | 48, mVar);
        }
        if (uVar != null) {
            this.f16966d.addView(uVar, this.f16967e);
        }
    }
}
