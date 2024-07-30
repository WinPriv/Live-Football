package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.drawable.Drawable;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView;
import ka.a6;
import ka.n7;

/* loaded from: classes2.dex */
public final class z implements com.huawei.openalliance.ad.ppskit.utils.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23611a = R.drawable.hiad_loading_image;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PPSInterstitialView f23612b;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Drawable f23613s;

        public a(Drawable drawable) {
            this.f23613s = drawable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            z zVar = z.this;
            PPSInterstitialView pPSInterstitialView = zVar.f23612b;
            int i10 = pPSInterstitialView.f23202q0;
            PPSInterstitialView pPSInterstitialView2 = zVar.f23612b;
            if (i10 == 1 && !com.huawei.openalliance.ad.ppskit.utils.d0.v(pPSInterstitialView.f23203r0)) {
                pPSInterstitialView2.N.setBackgroundColor(pPSInterstitialView2.getResources().getColor(R.color.hiad_70_percent_black));
            }
            Drawable drawable = this.f23613s;
            if (!(drawable instanceof a6)) {
                pPSInterstitialView2.f23189d0.setVisibility(8);
                pPSInterstitialView2.L.setImageDrawable(drawable);
                pPSInterstitialView2.f23200o0 = true;
                pPSInterstitialView2.f23199n0 = System.currentTimeMillis();
                pPSInterstitialView2.s();
            } else {
                pPSInterstitialView2.L.setImageDrawable(drawable);
                ((a6) drawable).L = new PPSInterstitialView.d(drawable);
            }
            int i11 = pPSInterstitialView2.y * 1000;
            pPSInterstitialView2.Q.setVisibility(0);
            t tVar = pPSInterstitialView2.M;
            if (tVar != null) {
                tVar.cancel();
            }
            t tVar2 = new t(pPSInterstitialView2, i11);
            pPSInterstitialView2.M = tVar2;
            tVar2.start();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            z zVar = z.this;
            zVar.f23612b.Q.setVisibility(8);
            zVar.f23612b.K.setVisibility(0);
            zVar.f23612b.L.setImageResource(zVar.f23611a);
        }
    }

    public z(PPSInterstitialView pPSInterstitialView) {
        this.f23612b = pPSInterstitialView;
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a() {
        n7.i("PPSInterstitialView", "loadImage fail");
        d2.a(new b());
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a(String str, Drawable drawable) {
        d2.a(new a(drawable));
    }
}
