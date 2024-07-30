package com.anythink.basead.ui;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f4485a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f4486b;

    /* renamed from: c, reason: collision with root package name */
    private int f4487c;

    /* renamed from: com.anythink.basead.ui.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (b.this.f4485a instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b.this.f4487c, b.this.f4487c);
                    layoutParams.addRule(13);
                    b.this.f4485a.addView(b.this.f4486b, layoutParams);
                } else if (b.this.f4485a instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b.this.f4487c, b.this.f4487c);
                    layoutParams2.gravity = 17;
                    b.this.f4485a.addView(b.this.f4486b, layoutParams2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public b(ViewGroup viewGroup) {
        this.f4485a = viewGroup;
        ImageView imageView = new ImageView(this.f4485a.getContext());
        this.f4486b = imageView;
        imageView.setId(h.a(this.f4485a.getContext(), "myoffer_loading_id", "id"));
        this.f4486b.setImageResource(h.a(this.f4485a.getContext(), "myoffer_loading", i.f10125c));
        this.f4487c = (int) TypedValue.applyDimension(1, 50.0f, this.f4485a.getResources().getDisplayMetrics());
    }

    private void d() {
        ImageView imageView = this.f4486b;
        if (imageView != null) {
            this.f4485a.removeView(imageView);
        }
        this.f4485a.post(new AnonymousClass1());
    }

    public final void a() {
        this.f4487c = (int) TypedValue.applyDimension(1, 30.0f, this.f4485a.getResources().getDisplayMetrics());
    }

    public final void b() {
        ImageView imageView = this.f4486b;
        if (imageView != null) {
            this.f4485a.removeView(imageView);
        }
        this.f4485a.post(new AnonymousClass1());
        this.f4486b.post(new Runnable() { // from class: com.anythink.basead.ui.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f4486b.setAlpha(1.0f);
                    RotateAnimation rotateAnimation = new RotateAnimation(gl.Code, -360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(1000L);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    rotateAnimation.setRepeatCount(-1);
                    b.this.f4486b.startAnimation(rotateAnimation);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final void c() {
        if (this.f4486b != null) {
            this.f4485a.post(new Runnable() { // from class: com.anythink.basead.ui.b.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.f4486b.clearAnimation();
                        b.this.f4486b.setAlpha(gl.Code);
                        b.this.f4485a.removeView(b.this.f4486b);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
