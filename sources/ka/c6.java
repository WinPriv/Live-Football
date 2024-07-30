package ka;

import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView;

/* loaded from: classes2.dex */
public final class c6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6 f31023s;

    public c6(a6 a6Var) {
        this.f31023s = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f6 f6Var = this.f31023s.L;
        if (f6Var != null) {
            PPSInterstitialView.d dVar = (PPSInterstitialView.d) f6Var;
            PPSInterstitialView pPSInterstitialView = PPSInterstitialView.this;
            if (!pPSInterstitialView.f23201p0) {
                Drawable drawable = dVar.f23218a;
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i10 = pPSInterstitialView.f23193h0;
                if (intrinsicHeight != i10 && drawable.getIntrinsicWidth() != i10) {
                    pPSInterstitialView.f23201p0 = true;
                    pPSInterstitialView.f23189d0.setVisibility(8);
                    pPSInterstitialView.L.requestLayout();
                    pPSInterstitialView.f23200o0 = true;
                    pPSInterstitialView.f23199n0 = System.currentTimeMillis();
                    pPSInterstitialView.s();
                }
            }
        }
    }
}
