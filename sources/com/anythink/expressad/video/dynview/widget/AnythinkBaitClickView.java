package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class AnythinkBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private static final String f11659a = "MBridgeAnimationClickView";

    /* renamed from: b, reason: collision with root package name */
    private AnyThinkImageView f11660b;

    /* renamed from: c, reason: collision with root package name */
    private AnyThinkImageView f11661c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f11662d;

    /* renamed from: e, reason: collision with root package name */
    private String f11663e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f11664g;

    /* renamed from: h, reason: collision with root package name */
    private int f11665h;

    /* renamed from: i, reason: collision with root package name */
    private int f11666i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f11667j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f11668k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f11669l;

    /* renamed from: m, reason: collision with root package name */
    private Animation f11670m;

    public AnythinkBaitClickView(Context context) {
        super(context);
        this.f11663e = "";
        this.f = "";
        this.f11664g = "Click now for details";
        this.f11665h = 1;
        this.f11666i = 1342177280;
    }

    private void d() {
        AnyThinkImageView anyThinkImageView = this.f11661c;
        if (anyThinkImageView != null) {
            anyThinkImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f11667j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f11667j.setRepeatCount(1);
        this.f11667j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(gl.Code, 1.5f, gl.Code, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f11668k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f11668k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
        this.f11669l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f11669l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f11668k);
        animationSet.addAnimation(this.f11669l);
        this.f11668k.setAnimationListener(new AnonymousClass3());
        this.f11667j.setAnimationListener(new AnonymousClass4(animationSet));
        AnyThinkImageView anyThinkImageView2 = this.f11660b;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(this.f11667j);
        }
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f11667j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f11667j.setRepeatCount(1);
        this.f11667j.setAnimationListener(new AnonymousClass5());
        AnyThinkImageView anyThinkImageView = this.f11660b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f11667j);
        }
    }

    private void f() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f11670m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f11670m.setRepeatMode(2);
        this.f11670m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(gl.Code, 1.2f, gl.Code, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f11668k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f11668k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
        this.f11669l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f11669l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f11668k);
        animationSet.addAnimation(this.f11669l);
        AnyThinkImageView anyThinkImageView = this.f11660b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f11670m);
        }
        AnyThinkImageView anyThinkImageView2 = this.f11661c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10) {
        this.f11665h = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f11667j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f11668k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f11669l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f11670m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i10 = this.f11665h;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                        this.f11667j = scaleAnimation;
                        scaleAnimation.setDuration(200L);
                        this.f11667j.setRepeatCount(-1);
                        this.f11667j.setRepeatMode(2);
                        AnyThinkImageView anyThinkImageView = this.f11660b;
                        if (anyThinkImageView != null) {
                            anyThinkImageView.startAnimation(this.f11667j);
                        }
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(gl.Code, 1.2f, gl.Code, 1.2f, 1, 0.5f, 1, 0.5f);
                        this.f11668k = scaleAnimation2;
                        scaleAnimation2.setDuration(400L);
                        this.f11668k.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        this.f11669l = alphaAnimation;
                        alphaAnimation.setDuration(400L);
                        this.f11669l.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(this.f11668k);
                        animationSet.addAnimation(this.f11669l);
                        AnyThinkImageView anyThinkImageView2 = this.f11661c;
                        if (anyThinkImageView2 != null) {
                            anyThinkImageView2.startAnimation(animationSet);
                            return;
                        }
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
                    this.f11670m = rotateAnimation;
                    rotateAnimation.setDuration(300L);
                    this.f11670m.setRepeatMode(2);
                    this.f11670m.setRepeatCount(-1);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(gl.Code, 1.2f, gl.Code, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.f11668k = scaleAnimation3;
                    scaleAnimation3.setDuration(600L);
                    this.f11668k.setRepeatCount(-1);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, gl.Code);
                    this.f11669l = alphaAnimation2;
                    alphaAnimation2.setDuration(600L);
                    this.f11669l.setRepeatCount(-1);
                    AnimationSet animationSet2 = new AnimationSet(true);
                    animationSet2.addAnimation(this.f11668k);
                    animationSet2.addAnimation(this.f11669l);
                    AnyThinkImageView anyThinkImageView3 = this.f11660b;
                    if (anyThinkImageView3 != null) {
                        anyThinkImageView3.startAnimation(this.f11670m);
                    }
                    AnyThinkImageView anyThinkImageView4 = this.f11661c;
                    if (anyThinkImageView4 != null) {
                        anyThinkImageView4.startAnimation(animationSet2);
                        return;
                    }
                    return;
                }
                this.f11661c.setVisibility(4);
                ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
                this.f11667j = scaleAnimation4;
                scaleAnimation4.setDuration(200L);
                this.f11667j.setRepeatCount(1);
                this.f11667j.setAnimationListener(new AnonymousClass5());
                AnyThinkImageView anyThinkImageView5 = this.f11660b;
                if (anyThinkImageView5 != null) {
                    anyThinkImageView5.startAnimation(this.f11667j);
                    return;
                }
                return;
            }
            AnyThinkImageView anyThinkImageView6 = this.f11661c;
            if (anyThinkImageView6 != null) {
                anyThinkImageView6.setVisibility(4);
            }
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f11667j = scaleAnimation5;
            scaleAnimation5.setDuration(500L);
            this.f11667j.setRepeatCount(1);
            this.f11667j.setRepeatMode(2);
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(gl.Code, 1.5f, gl.Code, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f11668k = scaleAnimation6;
            scaleAnimation6.setDuration(1000L);
            this.f11668k.setRepeatCount(0);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, gl.Code);
            this.f11669l = alphaAnimation3;
            alphaAnimation3.setDuration(1000L);
            this.f11669l.setRepeatCount(0);
            AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f11668k);
            animationSet3.addAnimation(this.f11669l);
            this.f11668k.setAnimationListener(new AnonymousClass3());
            this.f11667j.setAnimationListener(new AnonymousClass4(animationSet3));
            AnyThinkImageView anyThinkImageView7 = this.f11660b;
            if (anyThinkImageView7 != null) {
                anyThinkImageView7.startAnimation(this.f11667j);
                return;
            }
            return;
        }
        this.f11661c.setVisibility(4);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f11667j = scaleAnimation7;
        scaleAnimation7.setDuration(500L);
        this.f11667j.setRepeatCount(-1);
        this.f11667j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView8 = this.f11660b;
        if (anyThinkImageView8 != null) {
            anyThinkImageView8.startAnimation(this.f11667j);
        }
    }

    private void a() {
        try {
            this.f11664g = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.V) ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            o.d(f11659a, th.getMessage());
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f11667j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f11667j.setRepeatCount(-1);
        this.f11667j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.f11660b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f11667j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(gl.Code, 1.2f, gl.Code, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f11668k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f11668k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f11669l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f11669l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f11668k);
        animationSet.addAnimation(this.f11669l);
        AnyThinkImageView anyThinkImageView2 = this.f11661c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f11667j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f11667j.setRepeatCount(-1);
        this.f11667j.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.f11660b;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.f11667j);
        }
    }

    public void init(int i10, int i11) {
        this.f11666i = i10;
        this.f11665h = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f11666i = i10;
        this.f11665h = i11;
        this.f11663e = str;
        this.f = str2;
        this.f11664g = str3;
        init();
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11663e = "";
        this.f = "";
        this.f11664g = "Click now for details";
        this.f11665h = 1;
        this.f11666i = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f11666i);
            try {
                this.f11664g = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.V) ? "点击查看详情" : "Click now for details";
            } catch (Throwable th) {
                o.d(f11659a, th.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int b10 = t.b(getContext(), 55.0f);
            int b11 = t.b(getContext(), 33.0f);
            this.f11661c = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b10, b10);
            layoutParams.setMargins(b11, b11, 0, 0);
            this.f11661c.setLayoutParams(layoutParams);
            final int a10 = i.a(getContext(), "anythink_icon_click_circle", i.f10125c);
            if (TextUtils.isEmpty(this.f)) {
                this.f11661c.setImageResource(a10);
            } else {
                b.a(n.a().g()).a(this.f11663e, new c() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.1
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        AnythinkBaitClickView.this.f11661c.setImageBitmap(bitmap);
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                        AnythinkBaitClickView.this.f11661c.setImageResource(a10);
                    }
                });
            }
            int b12 = t.b(getContext(), 108.0f);
            int b13 = t.b(getContext(), 35.0f);
            int b14 = t.b(getContext(), 43.0f);
            this.f11660b = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b12, b12);
            layoutParams2.setMargins(b13, b14, 0, 0);
            this.f11660b.setLayoutParams(layoutParams2);
            final int a11 = i.a(getContext(), "anythink_icon_click_hand", i.f10125c);
            if (TextUtils.isEmpty(this.f11663e)) {
                this.f11660b.setImageResource(a11);
            } else {
                b.a(n.a().g()).a(this.f11663e, new c() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.2
                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        AnythinkBaitClickView.this.f11660b.setImageBitmap(bitmap);
                    }

                    @Override // com.anythink.expressad.foundation.g.d.c
                    public final void a(String str, String str2) {
                        AnythinkBaitClickView.this.f11660b.setImageResource(a11);
                    }
                });
            }
            relativeLayout.addView(this.f11661c);
            relativeLayout.addView(this.f11660b);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f11662d = new TextView(getContext());
            this.f11662d.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f11662d.setText(this.f11664g);
            this.f11662d.setTextColor(-1);
            this.f11662d.setGravity(14);
            linearLayout.addView(this.f11662d);
            addView(linearLayout);
        } catch (Throwable th2) {
            o.d(f11659a, th2.getMessage());
        }
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11663e = "";
        this.f = "";
        this.f11664g = "Click now for details";
        this.f11665h = 1;
        this.f11666i = 1342177280;
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f11663e = "";
        this.f = "";
        this.f11664g = "Click now for details";
        this.f11665h = 1;
        this.f11666i = 1342177280;
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            if (AnythinkBaitClickView.this.f11661c != null) {
                AnythinkBaitClickView.this.f11661c.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            if (AnythinkBaitClickView.this.f11661c != null) {
                AnythinkBaitClickView.this.f11661c.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f11676a;

        public AnonymousClass4(AnimationSet animationSet) {
            this.f11676a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.4.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f11660b != null) {
                        AnythinkBaitClickView.this.f11660b.startAnimation(AnythinkBaitClickView.this.f11667j);
                    }
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f11661c != null) {
                        AnythinkBaitClickView.this.f11661c.startAnimation(AnonymousClass4.this.f11676a);
                    }
                }
            }, 550L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Animation.AnimationListener {
        public AnonymousClass5() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView.5.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnythinkBaitClickView.this.f11660b != null) {
                        AnythinkBaitClickView.this.f11660b.startAnimation(AnythinkBaitClickView.this.f11667j);
                    }
                }
            }, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
