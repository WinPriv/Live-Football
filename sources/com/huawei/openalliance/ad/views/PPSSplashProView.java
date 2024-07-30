package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ed;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.splash.R;
import gb.r0;

/* loaded from: classes2.dex */
public class PPSSplashProView extends RelativeLayout {
    public static final /* synthetic */ int G = 0;
    public AnimatorSet A;
    public AnimatorSet B;
    public AnimatorSet C;
    public AnimatorSet D;
    public AnimatorSet E;
    public AnimatorSet F;

    /* renamed from: s, reason: collision with root package name */
    public View f23952s;

    /* renamed from: t, reason: collision with root package name */
    public ScanningRelativeLayout f23953t;

    /* renamed from: u, reason: collision with root package name */
    public int f23954u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f23955v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f23956w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23957x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public RoundLinearLayout f23958z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f23959s;

        public a(int i10) {
            this.f23959s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSSplashProView pPSSplashProView = PPSSplashProView.this;
            ViewGroup.LayoutParams layoutParams = pPSSplashProView.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = this.f23959s;
                pPSSplashProView.setLayoutParams(layoutParams2);
            }
        }
    }

    public PPSSplashProView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        this.f23954u = 1;
        this.y = 1;
        try {
            View inflate = View.inflate(context, R.layout.hiad_layout_splash_pro, this);
            this.f23952s = inflate;
            this.f23953t = (ScanningRelativeLayout) inflate.findViewById(R.id.hiad_pro_layout);
            this.f23958z = (RoundLinearLayout) this.f23952s.findViewById(R.id.hiad_pro_desc_layout);
            this.f23953t.setBackground(getResources().getDrawable(R.drawable.hiad_splash_pro_bg));
            this.f23955v = (TextView) this.f23952s.findViewById(R.id.hiad_pro_desc);
            this.f23956w = (ImageView) this.f23952s.findViewById(R.id.hiad_pro_arrow);
            c();
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            ex.I("PPSSplashProView", str);
        } catch (Exception unused2) {
            str = "init error";
            ex.I("PPSSplashProView", str);
        }
    }

    public final void a() {
        this.C = new AnimatorSet();
        this.D = new AnimatorSet();
        this.E = new AnimatorSet();
        this.F = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23956w, "scaleX", 1.0f, 1.225f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f23956w, "scaleY", 1.0f, 1.225f);
        ofFloat.setDuration(350L);
        ofFloat2.setDuration(350L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f23956w, "scaleX", 1.225f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f23956w, "scaleY", 1.225f, 1.0f);
        ofFloat3.setDuration(500L);
        ofFloat4.setDuration(500L);
        this.E.playSequentially(ofFloat, ofFloat3);
        this.F.playSequentially(ofFloat2, ofFloat4);
        this.E.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
        this.F.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f23956w, "scaleX", 1.0f, gl.Code);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f23956w, "scaleY", 1.0f, gl.Code);
        ofFloat5.setDuration(0L);
        ofFloat6.setDuration(0L);
        ofFloat5.addListener(new b());
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f23956w, "scaleX", gl.Code, 1.225f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f23956w, "scaleY", gl.Code, 1.225f);
        ofFloat7.setDuration(400L);
        ofFloat8.setDuration(400L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f23956w, "scaleX", 1.225f, 0.989f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f23956w, "scaleY", 1.225f, 0.989f);
        ofFloat9.setDuration(500L);
        ofFloat10.setDuration(500L);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.f23956w, "scaleX", 0.989f, 1.0f);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.f23956w, "scaleY", 0.989f, 1.0f);
        ofFloat11.setDuration(350L);
        ofFloat12.setDuration(350L);
        this.C.playSequentially(ofFloat5, ofFloat7, ofFloat9, ofFloat11);
        this.D.playSequentially(ofFloat6, ofFloat8, ofFloat10, ofFloat12);
        this.C.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
        this.D.setInterpolator(new ed(0.2f, gl.Code, 0.2f, 1.0f));
        this.C.addListener(new c());
    }

    public final void b() {
        ScanningRelativeLayout scanningRelativeLayout = this.f23953t;
        if (scanningRelativeLayout != null) {
            scanningRelativeLayout.getClass();
            ex.V("ScanningRelativeLayout", "stop");
            try {
                ValueAnimator valueAnimator = scanningRelativeLayout.f24078j0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    scanningRelativeLayout.f24078j0.cancel();
                }
            } catch (Throwable th) {
                ex.I("ScanningRelativeLayout", "cancel animation exception: %s", th.getClass().getSimpleName());
            }
            scanningRelativeLayout.f24075g0 = scanningRelativeLayout.f24076h0;
            scanningRelativeLayout.postInvalidate();
        }
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.B = null;
        }
        AnimatorSet animatorSet2 = this.A;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.A = null;
        }
        AnimatorSet animatorSet3 = this.C;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.C = null;
        }
        AnimatorSet animatorSet4 = this.D;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.D = null;
        }
        AnimatorSet animatorSet5 = this.E;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
            this.E = null;
        }
        AnimatorSet animatorSet6 = this.F;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
            this.F = null;
        }
    }

    public final void c() {
        TextView textView;
        float K;
        Context applicationContext = getContext().getApplicationContext();
        ec Code = ec.Code(applicationContext);
        int i10 = r0.i(applicationContext, Code.J());
        int M = Code.M();
        int i11 = r0.i(applicationContext, Code.K());
        int i12 = r0.i(applicationContext, Code.V(applicationContext));
        this.f23953t.setRadius(M);
        this.f23958z.setRectCornerRadius(r0.i(applicationContext, M));
        this.f23953t.setMinimumHeight(i10);
        int i13 = 2;
        if (r0.p(getContext())) {
            textView = this.f23955v;
            K = Code.K() * 2;
            i13 = 1;
        } else {
            textView = this.f23955v;
            K = Code.K();
        }
        textView.setTextSize(i13, K);
        this.f23955v.setMinimumHeight(i10);
        ViewGroup.LayoutParams layoutParams = this.f23956w.getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i11;
        this.f23956w.setLayoutParams(layoutParams);
        this.f23952s.post(new a(i12));
    }

    public int getMode() {
        return this.f23954u;
    }

    public void setDesc(String str) {
        if (this.f23955v != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f23955v.setText(str);
            } else {
                this.f23955v.setText(R.string.hiad_splash_pro_desc);
            }
        }
    }

    public void setMode(int i10) {
        this.f23954u = i10;
    }

    public void setOrientation(int i10) {
        this.y = i10;
    }

    /* loaded from: classes2.dex */
    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            try {
                PPSSplashProView.this.f23956w.setVisibility(0);
            } catch (Throwable th) {
                ex.I("PPSSplashProView", "arrowImage set visible err: %s", th.getClass().getSimpleName());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Animator.AnimatorListener {

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                PPSSplashProView pPSSplashProView = PPSSplashProView.this;
                AnimatorSet animatorSet = pPSSplashProView.E;
                if (animatorSet != null && pPSSplashProView.F != null) {
                    animatorSet.start();
                    PPSSplashProView.this.F.start();
                }
            }
        }

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gb.w.a(450L, new a());
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
