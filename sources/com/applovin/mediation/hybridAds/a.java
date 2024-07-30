package com.applovin.mediation.hybridAds;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.r;
import com.applovin.sdk.AppLovinSdkUtils;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class a extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0226a f19602a;

    /* renamed from: com.applovin.mediation.hybridAds.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0226a {
        void a(a aVar);
    }

    public a(c cVar, Context context) {
        super(context);
        setOnClickListener(this);
        r rVar = new r(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, cVar.d());
        rVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        rVar.a(dpToPx);
        addView(rVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, (cVar.e() * 2) + cVar.d());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, cVar.b());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, cVar.c());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f19602a.a(this);
    }

    public void setListener(InterfaceC0226a interfaceC0226a) {
        this.f19602a = interfaceC0226a;
    }
}
