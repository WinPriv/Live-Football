package ka;

import com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView;

/* loaded from: classes2.dex */
public final class z5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6 f32236s;

    public z5(a6 a6Var) {
        this.f32236s = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6 a6Var = this.f32236s;
        f6 f6Var = a6Var.L;
        if (f6Var != null) {
            PPSInterstitialView pPSInterstitialView = PPSInterstitialView.this;
            pPSInterstitialView.Q.setVisibility(8);
            pPSInterstitialView.K.setVisibility(0);
        }
        a6Var.b();
    }
}
