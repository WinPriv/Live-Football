package com.anythink.basead.ui;

import a3.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.WaveAnimImageView;
import com.anythink.core.common.k.h;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class GuideToClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WaveAnimImageView f4264a;

    /* renamed from: b, reason: collision with root package name */
    WaveAnimImageView f4265b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f4266c;

    /* renamed from: d, reason: collision with root package name */
    float f4267d;

    /* renamed from: e, reason: collision with root package name */
    float f4268e;
    float f;

    /* renamed from: g, reason: collision with root package name */
    float f4269g;

    /* renamed from: h, reason: collision with root package name */
    float f4270h;

    /* renamed from: i, reason: collision with root package name */
    float f4271i;

    /* renamed from: j, reason: collision with root package name */
    final int f4272j;

    /* renamed from: k, reason: collision with root package name */
    final int f4273k;

    /* renamed from: l, reason: collision with root package name */
    final float f4274l;

    /* renamed from: m, reason: collision with root package name */
    ValueAnimator f4275m;

    /* renamed from: n, reason: collision with root package name */
    ValueAnimator f4276n;
    ScaleAnimation o;

    public GuideToClickView(Context context) {
        super(context);
        this.f4272j = 1000;
        this.f4273k = 200;
        this.f4274l = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(h.a(context, "myoffer_guide_to_click", "layout"), this);
        this.f4267d = 0.8f;
        this.f4268e = 0.05f;
        this.f = h.a(context, 4.0f);
        this.f4269g = h.a(context, 18.0f);
        this.f4270h = h.a(context, 2.0f);
        this.f4271i = h.a(context, 40.0f);
        this.f4264a = (WaveAnimImageView) findViewById(h.a(context, "myoffer_wave_anim_image", "id"));
        this.f4265b = (WaveAnimImageView) findViewById(h.a(context, "myoffer_wave_anim_image2", "id"));
        this.f4275m = ValueAnimator.ofFloat(gl.Code, 1.0f);
        this.f4276n = ValueAnimator.ofFloat(gl.Code, 1.0f);
        this.f4266c = (ImageView) findViewById(h.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.o = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.o.setRepeatCount(-1);
        this.o.setDuration(333L);
    }

    private void b() {
        ValueAnimator valueAnimator = this.f4275m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f4276n;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ScaleAnimation scaleAnimation = this.o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnim(this.f4275m, this.f4264a, 0L);
        startAnim(this.f4276n, this.f4265b, 800L);
        this.f4266c.startAnimation(this.o);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4275m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f4276n;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ScaleAnimation scaleAnimation = this.o;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j10) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.GuideToClickView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f;
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (floatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f10 = floatValue / 0.71428573f;
                    GuideToClickView guideToClickView = GuideToClickView.this;
                    float f11 = guideToClickView.f4270h;
                    float d10 = k.d(guideToClickView.f4271i, f11, f10, f11);
                    float d11 = k.d(guideToClickView.f4269g, f11, f10, guideToClickView.f);
                    double d12 = f10;
                    if (d12 < 0.2d) {
                        f = (float) (((1.0d - ((f10 * 1.0f) / 0.2d)) * (guideToClickView.f4268e - r3)) + guideToClickView.f4267d);
                    } else {
                        f = (float) (((((d12 - 0.2d) * 1.0d) / 0.8d) * (guideToClickView.f4268e - r15)) + guideToClickView.f4267d);
                    }
                    try {
                        if (guideToClickView.isShown()) {
                            waveAnimImageView.setWaveAnimParams(new WaveAnimImageView.a(d10, d11, f));
                            if (waveAnimImageView.getVisibility() != 0) {
                                waveAnimImageView.setVisibility(0);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            valueAnimator.setStartDelay(j10);
            valueAnimator.start();
        }
    }

    public GuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4272j = 1000;
        this.f4273k = 200;
        this.f4274l = 0.71428573f;
        a(context);
    }

    public GuideToClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4272j = 1000;
        this.f4273k = 200;
        this.f4274l = 0.71428573f;
        a(context);
    }

    private void a() {
        startAnim(this.f4275m, this.f4264a, 0L);
        startAnim(this.f4276n, this.f4265b, 800L);
        this.f4266c.startAnimation(this.o);
    }
}
