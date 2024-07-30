package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.e2;
import ka.n7;

/* loaded from: classes2.dex */
public class PPSAppDetailTemplateView extends PPSAppDetailView {

    /* renamed from: d0, reason: collision with root package name */
    public TextView f23136d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextView f23137e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f23138f0;

    public PPSAppDetailTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView
    public final int a(Context context) {
        if (this.f23138f0 == 4) {
            return R.layout.hiad_landing_app_detail_insretemplate4;
        }
        return R.layout.hiad_landing_app_detail_template_custom;
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView
    public final void b() {
        super.b();
        this.f23136d0 = (TextView) findViewById(R.id.app_name);
        this.f23137e0 = (TextView) findViewById(R.id.app_develop_name);
        AppInfo appInfo = getAppInfo();
        if (appInfo != null) {
            this.f23136d0.setText(appInfo.getAppName());
            this.f23137e0.setText(appInfo.getDeveloperName());
        }
        Context context = getContext();
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            n7.e("PPSAppDetailTemplateView", "do not deal elderly font.");
            return;
        }
        TextView textView = this.f23136d0;
        if (textView != null && this.f23137e0 != null) {
            textView.setTextSize(1, 28);
            TextView textView2 = this.f23137e0;
            if (textView2 != null) {
                textView2.setTextSize(1, 21);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, (int) e2.a(4, context), 0, 0);
            if (this.f23138f0 != 4) {
                this.f23136d0.setLayoutParams(layoutParams);
            }
            this.f23137e0.setLayoutParams(layoutParams);
            return;
        }
        n7.g("PPSAppDetailTemplateView", "appName or appDeveloper tv is null.");
    }

    @Override // com.huawei.openalliance.ad.ppskit.views.PPSAppDetailView
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f14k0)) != null) {
            try {
                int integer = obtainStyledAttributes.getInteger(0, 2);
                this.f23138f0 = integer;
                n7.c("PPSAppDetailTemplateView", "insreTemplate %s", Integer.valueOf(integer));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
