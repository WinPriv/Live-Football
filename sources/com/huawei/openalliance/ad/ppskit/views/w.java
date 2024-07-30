package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.a6;
import ka.n7;

/* loaded from: classes2.dex */
public final class w implements com.huawei.openalliance.ad.ppskit.utils.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSInterstitialView f23579a;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Drawable f23580s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Drawable f23581t;

        public a(Drawable drawable, BitmapDrawable bitmapDrawable) {
            this.f23580s = drawable;
            this.f23581t = bitmapDrawable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup;
            Drawable drawable;
            View view;
            w wVar = w.this;
            PPSAppDetailView pPSAppDetailView = wVar.f23579a.H;
            Drawable drawable2 = this.f23580s;
            pPSAppDetailView.setAppIconImageDrawable(drawable2);
            PPSInterstitialView pPSInterstitialView = wVar.f23579a;
            PPSAppDetailTemplateView pPSAppDetailTemplateView = pPSInterstitialView.f23210x0;
            if (pPSAppDetailTemplateView != null) {
                pPSAppDetailTemplateView.setAppIconImageDrawable(drawable2);
            }
            if (!(drawable2 instanceof a6) && (viewGroup = pPSInterstitialView.N) != null && (drawable = this.f23581t) != null && pPSInterstitialView.F != 3) {
                viewGroup.setBackground(drawable);
                Context context = pPSInterstitialView.f23203r0;
                if (context == null) {
                    view = null;
                } else {
                    View view2 = new View(context);
                    view2.setBackgroundResource(R.color.hiad_30_percent_white);
                    view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    view = view2;
                }
                if (view != null) {
                    pPSInterstitialView.N.addView(view, 0);
                }
            }
            n7.b("PPSInterstitialView", "get icon suucess");
        }
    }

    public w(PPSInterstitialView pPSInterstitialView) {
        this.f23579a = pPSInterstitialView;
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a() {
        n7.e("PPSInterstitialView", "get icon failed");
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a(String str, Drawable drawable) {
        if (drawable != null) {
            d2.a(new a(drawable, androidx.activity.n.x(this.f23579a.f23203r0, drawable)));
        }
    }
}
