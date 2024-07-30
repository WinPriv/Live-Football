package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.i;
import com.applovin.sdk.AppLovinSdkUtils;
import com.huawei.hms.ads.gl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends Dialog implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f17165a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f17166b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f17167c;

    /* renamed from: d, reason: collision with root package name */
    private final d f17168d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f17169e;
    private RelativeLayout f;

    /* renamed from: g, reason: collision with root package name */
    private i f17170g;

    public l(com.applovin.impl.sdk.ad.a aVar, d dVar, Activity activity, com.applovin.impl.sdk.p pVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar != null) {
            if (dVar != null) {
                if (pVar != null) {
                    if (activity != null) {
                        this.f17166b = pVar;
                        this.f17167c = pVar.L();
                        this.f17165a = activity;
                        this.f17168d = dVar;
                        this.f17169e = aVar;
                        requestWindowFeature(1);
                        setCancelable(false);
                        return;
                    }
                    throw new IllegalArgumentException("No activity specified");
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No main view specified");
        }
        throw new IllegalArgumentException("No ad specified");
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.k
    public void dismiss() {
        com.applovin.impl.sdk.d.d statsManagerHelper = this.f17168d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.f17165a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.3
            @Override // java.lang.Runnable
            public void run() {
                l.this.f.removeView(l.this.f17168d);
                l.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f17168d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.l.2
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f17165a.getWindow().getAttributes().flags, this.f17165a.getWindow().getAttributes().flags);
                window.addFlags(com.anythink.expressad.exoplayer.b.f7294bc);
            } else if (com.applovin.impl.sdk.y.a()) {
                this.f17167c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f17167c.b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a(i.a aVar) {
        if (this.f17170g != null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f17167c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        i a10 = i.a(aVar, this.f17165a);
        this.f17170g = a10;
        a10.setVisibility(8);
        this.f17170g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                l.this.d();
            }
        });
        this.f17170g.setClickable(false);
        int a11 = a(((Integer) this.f17166b.a(com.applovin.impl.sdk.c.b.ci)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a11, a11);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.p pVar = this.f17166b;
        com.applovin.impl.sdk.c.b<Boolean> bVar = com.applovin.impl.sdk.c.b.cl;
        layoutParams.addRule(((Boolean) pVar.a(bVar)).booleanValue() ? 9 : 11);
        this.f17170g.a(a11);
        int a12 = a(((Integer) this.f17166b.a(com.applovin.impl.sdk.c.b.ck)).intValue());
        int a13 = a(((Integer) this.f17166b.a(com.applovin.impl.sdk.c.b.cj)).intValue());
        layoutParams.setMargins(a13, a12, a13, 0);
        this.f.addView(this.f17170g, layoutParams);
        this.f17170g.bringToFront();
        int a14 = a(((Integer) this.f17166b.a(com.applovin.impl.sdk.c.b.cm)).intValue());
        View view = new View(this.f17165a);
        view.setBackgroundColor(0);
        int i10 = a11 + a14;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f17166b.a(bVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a13 - a(5), a12 - a(5), a13 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (l.this.f17170g.isClickable()) {
                    l.this.f17170g.performClick();
                }
            }
        });
        this.f.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f17168d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f17165a);
        this.f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f.setBackgroundColor(-1157627904);
        this.f.addView(this.f17168d);
        if (!this.f17169e.m()) {
            a(this.f17169e.n());
            e();
        }
        setContentView(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f17168d.a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.l.1
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    private void e() {
        this.f17165a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (l.this.f17170g == null) {
                        l.this.d();
                    }
                    l.this.f17170g.setVisibility(0);
                    l.this.f17170g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(gl.Code, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.l.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            l.this.f17170g.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    l.this.f17170g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y unused = l.this.f17167c;
                    if (com.applovin.impl.sdk.y.a()) {
                        l.this.f17167c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    l.this.d();
                }
            }
        });
    }

    public d b() {
        return this.f17168d;
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f17165a, i10);
    }

    public com.applovin.impl.sdk.ad.a a() {
        return this.f17169e;
    }
}
