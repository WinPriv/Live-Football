package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class MBSplashClickView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11173a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: b, reason: collision with root package name */
    private final String f11174b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11175c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11176d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11177e;
    private final String f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11178g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11179h;

    /* renamed from: i, reason: collision with root package name */
    private final String f11180i;

    /* renamed from: j, reason: collision with root package name */
    private final String f11181j;

    /* renamed from: k, reason: collision with root package name */
    private final String f11182k;

    /* renamed from: l, reason: collision with root package name */
    private final String f11183l;

    /* renamed from: m, reason: collision with root package name */
    private String f11184m;

    /* renamed from: n, reason: collision with root package name */
    private int f11185n;
    private ImageView o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f11186p;

    /* renamed from: q, reason: collision with root package name */
    private final RectF f11187q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f11188r;

    /* renamed from: s, reason: collision with root package name */
    private final Paint f11189s;

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f11193a;

        public AnonymousClass2(ScaleAnimation scaleAnimation) {
            this.f11193a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.f11186p.startAnimation(this.f11193a);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f11174b = "浏览第三方应用";
        this.f11175c = "View";
        this.f11176d = "打开第三方应用";
        this.f11177e = "Open";
        this.f = "下载第三方应用";
        this.f11178g = "Install";
        this.f11179h = "anythink_splash_btn_arrow_right";
        this.f11180i = "anythink_splash_btn_circle";
        this.f11181j = "anythink_splash_btn_finger";
        this.f11182k = "anythink_splash_btn_go";
        this.f11183l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f11187q = new RectF();
        this.f11188r = new Paint();
        this.f11189s = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(gl.Code, 0.5f, gl.Code, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new AnonymousClass1(scaleAnimation2));
        this.f11186p.setVisibility(4);
        this.o.startAnimation(scaleAnimation);
        this.f11186p.postDelayed(new AnonymousClass2(scaleAnimation2), 500L);
    }

    private void d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, gl.Code, 0, gl.Code);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnonymousClass3());
        this.o.startAnimation(translateAnimation);
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.o.startAnimation(scaleAnimation);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f11187q, this.f11189s, 31);
        canvas.drawRoundRect(this.f11187q, 200.0f, 200.0f, this.f11189s);
        canvas.saveLayer(this.f11187q, this.f11188r, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void initView(String str) {
        char c10;
        boolean z10;
        RelativeLayout.LayoutParams layoutParams;
        this.f11184m = str;
        str.getClass();
        String str2 = "浏览第三方应用";
        int i10 = 0;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                this.f11185n = 3;
                z10 = true;
                break;
            case 1:
            case 4:
                this.f11185n = 1;
                z10 = true;
                break;
            case 2:
            case 5:
                this.f11185n = 2;
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f11379ac);
            if (TextUtils.isEmpty(this.f11184m)) {
                if (contains) {
                    str2 = "View";
                }
                this.f11184m = str2;
            }
            this.f11185n = 2;
        }
        int i11 = this.f11185n;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i11 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f11184m);
        this.o = new ImageView(getContext());
        int i12 = this.f11185n;
        if (i12 == 2) {
            i10 = getResources().getIdentifier("anythink_splash_btn_go", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 35.0f), t.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = t.b(getContext(), 10.0f);
        } else if (i12 == 1) {
            i10 = getResources().getIdentifier("anythink_splash_btn_light", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = t.b(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("anythink_splash_btn_arrow_right", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i12 == 3) {
            i10 = getResources().getIdentifier("anythink_splash_btn_finger", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 25.0f), t.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = t.b(getContext(), 50.0f);
            layoutParams.topMargin = t.b(getContext(), 18.0f);
            this.f11186p = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(t.b(getContext(), 30.0f), t.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = t.b(getContext(), 50.0f);
            layoutParams4.topMargin = t.b(getContext(), 5.0f);
            this.f11186p.setLayoutParams(layoutParams4);
            this.f11186p.setImageResource(getResources().getIdentifier("anythink_splash_btn_circle", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
            addView(this.f11186p);
        } else {
            layoutParams = null;
        }
        this.o.setLayoutParams(layoutParams);
        this.o.setImageResource(i10);
        addView(textView);
        addView(this.o);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f11185n;
        if (i10 == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.o.startAnimation(scaleAnimation);
            return;
        }
        if (i10 == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, gl.Code, 0, gl.Code);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnonymousClass3());
            this.o.startAnimation(translateAnimation);
            return;
        }
        if (i10 == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(400L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(gl.Code, 0.5f, gl.Code, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(200L);
            scaleAnimation3.setAnimationListener(new AnonymousClass1(scaleAnimation3));
            this.f11186p.setVisibility(4);
            this.o.startAnimation(scaleAnimation2);
            this.f11186p.postDelayed(new AnonymousClass2(scaleAnimation3), 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f11187q.set(gl.Code, gl.Code, getWidth(), getHeight());
    }

    private void a() {
        this.f11188r.setAntiAlias(true);
        this.f11188r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f11189s.setAntiAlias(true);
        this.f11189s.setColor(-1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b() {
        char c10;
        boolean z10;
        RelativeLayout.LayoutParams layoutParams;
        String str = this.f11184m;
        str.getClass();
        int i10 = 0;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                this.f11185n = 3;
                z10 = true;
                break;
            case 1:
            case 4:
                this.f11185n = 1;
                z10 = true;
                break;
            case 2:
            case 5:
                this.f11185n = 2;
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f11379ac);
            if (TextUtils.isEmpty(this.f11184m)) {
                this.f11184m = contains ? "View" : "浏览第三方应用";
            }
            this.f11185n = 2;
        }
        int i11 = this.f11185n;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i11 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f11184m);
        this.o = new ImageView(getContext());
        int i12 = this.f11185n;
        if (i12 == 2) {
            i10 = getResources().getIdentifier("anythink_splash_btn_go", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 35.0f), t.b(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = t.b(getContext(), 10.0f);
        } else if (i12 == 1) {
            i10 = getResources().getIdentifier("anythink_splash_btn_light", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = t.b(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("anythink_splash_btn_arrow_right", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i12 == 3) {
            i10 = getResources().getIdentifier("anythink_splash_btn_finger", i.f10125c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams = new RelativeLayout.LayoutParams(t.b(getContext(), 25.0f), t.b(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = t.b(getContext(), 50.0f);
            layoutParams.topMargin = t.b(getContext(), 18.0f);
            this.f11186p = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(t.b(getContext(), 30.0f), t.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = t.b(getContext(), 50.0f);
            layoutParams4.topMargin = t.b(getContext(), 5.0f);
            this.f11186p.setLayoutParams(layoutParams4);
            this.f11186p.setImageResource(getResources().getIdentifier("anythink_splash_btn_circle", i.f10125c, com.anythink.expressad.foundation.b.a.b().a()));
            addView(this.f11186p);
        } else {
            layoutParams = null;
        }
        this.o.setLayoutParams(layoutParams);
        this.o.setImageResource(i10);
        addView(textView);
        addView(this.o);
        invalidate();
    }

    private void a(int i10) {
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
    }

    private boolean a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2666181:
                if (str.equals("View")) {
                    c10 = 2;
                    break;
                }
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                this.f11185n = 3;
                return true;
            case 1:
            case 4:
                this.f11185n = 1;
                return true;
            case 2:
            case 5:
                this.f11185n = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11174b = "浏览第三方应用";
        this.f11175c = "View";
        this.f11176d = "打开第三方应用";
        this.f11177e = "Open";
        this.f = "下载第三方应用";
        this.f11178g = "Install";
        this.f11179h = "anythink_splash_btn_arrow_right";
        this.f11180i = "anythink_splash_btn_circle";
        this.f11181j = "anythink_splash_btn_finger";
        this.f11182k = "anythink_splash_btn_go";
        this.f11183l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f11187q = new RectF();
        this.f11188r = new Paint();
        this.f11189s = new Paint();
        a();
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f11190a;

        public AnonymousClass1(ScaleAnimation scaleAnimation) {
            this.f11190a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f11186p.setVisibility(4);
            MBSplashClickView.this.f11186p.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f11186p.startAnimation(AnonymousClass1.this.f11190a);
                }
            }, 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f11186p.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.o.setVisibility(4);
            MBSplashClickView.this.o.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.o.startAnimation(animation);
                }
            }, 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.o.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11174b = "浏览第三方应用";
        this.f11175c = "View";
        this.f11176d = "打开第三方应用";
        this.f11177e = "Open";
        this.f = "下载第三方应用";
        this.f11178g = "Install";
        this.f11179h = "anythink_splash_btn_arrow_right";
        this.f11180i = "anythink_splash_btn_circle";
        this.f11181j = "anythink_splash_btn_finger";
        this.f11182k = "anythink_splash_btn_go";
        this.f11183l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f11187q = new RectF();
        this.f11188r = new Paint();
        this.f11189s = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f11174b = "浏览第三方应用";
        this.f11175c = "View";
        this.f11176d = "打开第三方应用";
        this.f11177e = "Open";
        this.f = "下载第三方应用";
        this.f11178g = "Install";
        this.f11179h = "anythink_splash_btn_arrow_right";
        this.f11180i = "anythink_splash_btn_circle";
        this.f11181j = "anythink_splash_btn_finger";
        this.f11182k = "anythink_splash_btn_go";
        this.f11183l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f11187q = new RectF();
        this.f11188r = new Paint();
        this.f11189s = new Paint();
    }
}
