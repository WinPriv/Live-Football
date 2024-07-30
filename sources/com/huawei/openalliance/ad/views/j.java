package com.huawei.openalliance.ad.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.huawei.hms.ads.ed;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public final class j implements View.OnLayoutChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PPSSplashProView f24145s;

    public j(PPSSplashProView pPSSplashProView) {
        this.f24145s = pPSSplashProView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i12 - i10 > 0 && i13 - i11 > 0 && i14 == 0 && i16 == 0) {
            int i18 = PPSSplashProView.G;
            PPSSplashProView pPSSplashProView = this.f24145s;
            pPSSplashProView.getClass();
            ex.V("PPSSplashProView", "startAnimators");
            try {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pPSSplashProView.f23958z, "alpha", gl.Code, 1.0f);
                ofFloat.setDuration(300L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pPSSplashProView.f23953t, "scaleX", 0.85f, 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pPSSplashProView.f23953t, "scaleY", 0.85f, 1.0f);
                ofFloat2.setDuration(300L);
                ofFloat3.setDuration(300L);
                AnimatorSet animatorSet = new AnimatorSet();
                pPSSplashProView.A = animatorSet;
                animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat);
                pPSSplashProView.A.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
                pPSSplashProView.A.addListener(new k(pPSSplashProView));
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pPSSplashProView.f23953t, "scaleX", 1.0f, 0.85f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pPSSplashProView.f23953t, "scaleY", 1.0f, 0.85f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                pPSSplashProView.B = animatorSet2;
                animatorSet2.setDuration(0L);
                pPSSplashProView.B.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
                pPSSplashProView.B.playTogether(ofFloat4, ofFloat5);
                pPSSplashProView.B.addListener(new l(pPSSplashProView));
                pPSSplashProView.f23956w.setVisibility(4);
                pPSSplashProView.a();
                pPSSplashProView.B.start();
            } catch (Throwable th) {
                ex.I("PPSSplashProView", "anim error: %s", th.getClass().getSimpleName());
                RoundLinearLayout roundLinearLayout = pPSSplashProView.f23958z;
                if (roundLinearLayout != null) {
                    roundLinearLayout.setBackground(pPSSplashProView.getResources().getDrawable(R.drawable.hiad_splash_pro_bg_scan));
                }
                pPSSplashProView.setVisibility(0);
            }
        }
    }
}
