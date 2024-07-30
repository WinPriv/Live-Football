package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.fs;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class PPSSplashAdSourceView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public PPSSplashLabelView f23942s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f23943t;

    /* renamed from: u, reason: collision with root package name */
    public fs f23944u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f23945v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f23946w;

    public PPSSplashAdSourceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static boolean b(Context context, Integer num, Integer num2) {
        if (!cl.Code(context).V() || num == null || num2 == null) {
            return false;
        }
        if (((num.intValue() != 1 && num.intValue() != 4) || (num2.intValue() != 2 && num2.intValue() != 3)) && ((num.intValue() != 2 && num.intValue() != 3) || (num2.intValue() != 1 && num2.intValue() != 3))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0137, code lost:
    
        if (gb.h0.d() != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.huawei.openalliance.ad.inter.data.AdContentData r7, boolean r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.PPSSplashAdSourceView.a(com.huawei.openalliance.ad.inter.data.AdContentData, boolean, int, int, boolean):void");
    }

    public int getRootLayoutId() {
        if (b(getContext(), this.f23945v, this.f23946w)) {
            return R.layout.hiad_splash_ad_source_with_click;
        }
        return R.layout.hiad_splash_ad_source;
    }

    public void setAdMediator(fs fsVar) {
        this.f23944u = fsVar;
    }
}
