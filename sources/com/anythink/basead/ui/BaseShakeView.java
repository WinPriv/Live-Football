package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.basead.c.h;
import com.anythink.core.common.e.k;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public abstract class BaseShakeView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected ImageView f4201a;

    /* renamed from: b, reason: collision with root package name */
    h f4202b;

    /* renamed from: c, reason: collision with root package name */
    private Animation f4203c;

    /* renamed from: d, reason: collision with root package name */
    private int f4204d;

    /* renamed from: e, reason: collision with root package name */
    private a f4205e;

    /* renamed from: com.anythink.basead.ui.BaseShakeView$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Interpolator {
        public AnonymousClass3() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if ((BaseShakeView.this.f4204d / 2) % 3 == 0) {
                return gl.Code;
            }
            return f;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    public BaseShakeView(Context context) {
        super(context);
        this.f4204d = 0;
        this.f4202b = new h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.c.h
            public final boolean a() {
                if (!BaseShakeView.this.isShown() || BaseShakeView.this.f4205e == null) {
                    return false;
                }
                return BaseShakeView.this.f4205e.a();
            }
        };
        a();
    }

    public static /* synthetic */ int b(BaseShakeView baseShakeView) {
        int i10 = baseShakeView.f4204d;
        baseShakeView.f4204d = i10 + 1;
        return i10;
    }

    public abstract void a();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4201a != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.8f, 1, 0.8f);
            this.f4203c = rotateAnimation;
            rotateAnimation.setDuration(150L);
            this.f4203c.setRepeatMode(2);
            this.f4203c.setRepeatCount(-1);
            this.f4203c.setAnimationListener(new AnonymousClass2());
            this.f4203c.setInterpolator(new AnonymousClass3());
            this.f4201a.startAnimation(this.f4203c);
        }
        com.anythink.expressad.shake.a.a().a(this.f4202b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animation animation = this.f4203c;
        if (animation != null) {
            animation.cancel();
        }
        com.anythink.expressad.shake.a.a().b(this.f4202b);
    }

    public void setOnShakeListener(a aVar, k kVar) {
        this.f4202b.a(kVar.N(), kVar.O());
        this.f4205e = aVar;
    }

    private void b() {
        if (this.f4201a != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.8f, 1, 0.8f);
            this.f4203c = rotateAnimation;
            rotateAnimation.setDuration(150L);
            this.f4203c.setRepeatMode(2);
            this.f4203c.setRepeatCount(-1);
            this.f4203c.setAnimationListener(new AnonymousClass2());
            this.f4203c.setInterpolator(new AnonymousClass3());
            this.f4201a.startAnimation(this.f4203c);
        }
    }

    public BaseShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4204d = 0;
        this.f4202b = new h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.c.h
            public final boolean a() {
                if (!BaseShakeView.this.isShown() || BaseShakeView.this.f4205e == null) {
                    return false;
                }
                return BaseShakeView.this.f4205e.a();
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4204d = 0;
        this.f4202b = new h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.c.h
            public final boolean a() {
                if (!BaseShakeView.this.isShown() || BaseShakeView.this.f4205e == null) {
                    return false;
                }
                return BaseShakeView.this.f4205e.a();
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4204d = 0;
        this.f4202b = new h() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.c.h
            public final boolean a() {
                if (!BaseShakeView.this.isShown() || BaseShakeView.this.f4205e == null) {
                    return false;
                }
                return BaseShakeView.this.f4205e.a();
            }
        };
        a();
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Animation.AnimationListener {
        public AnonymousClass2() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            BaseShakeView.b(BaseShakeView.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
