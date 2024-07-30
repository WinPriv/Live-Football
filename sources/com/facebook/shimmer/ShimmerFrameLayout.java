package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.activity.n;
import com.facebook.shimmer.a;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public final Paint f19875s;

    /* renamed from: t, reason: collision with root package name */
    public final b f19876t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f19877u;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.b c0228a;
        this.f19875s = new Paint();
        b bVar = new b();
        this.f19876t = bVar;
        this.f19877u = true;
        setWillNotDraw(false);
        bVar.setCallback(this);
        if (attributeSet == null) {
            a(new a.C0228a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f507s, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                c0228a = new a.c();
            } else {
                c0228a = new a.C0228a();
            }
            a(c0228a.b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(a aVar) {
        boolean z10;
        PorterDuff.Mode mode;
        b bVar = this.f19876t;
        bVar.f = aVar;
        if (aVar != null) {
            Paint paint = bVar.f19898b;
            if (bVar.f.f19891p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        bVar.b();
        if (bVar.f != null) {
            ValueAnimator valueAnimator = bVar.f19901e;
            if (valueAnimator != null) {
                z10 = valueAnimator.isStarted();
                bVar.f19901e.cancel();
                bVar.f19901e.removeAllUpdateListeners();
            } else {
                z10 = false;
            }
            a aVar2 = bVar.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, ((float) (aVar2.f19895t / aVar2.f19894s)) + 1.0f);
            bVar.f19901e = ofFloat;
            ofFloat.setRepeatMode(bVar.f.f19893r);
            bVar.f19901e.setRepeatCount(bVar.f.f19892q);
            ValueAnimator valueAnimator2 = bVar.f19901e;
            a aVar3 = bVar.f;
            valueAnimator2.setDuration(aVar3.f19894s + aVar3.f19895t);
            bVar.f19901e.addUpdateListener(bVar.f19897a);
            if (z10) {
                bVar.f19901e.start();
            }
        }
        bVar.invalidateSelf();
        if (aVar != null && aVar.f19890n) {
            setLayerType(2, this.f19875s);
        } else {
            setLayerType(0, null);
        }
    }

    public final void b() {
        boolean z10;
        b bVar = this.f19876t;
        ValueAnimator valueAnimator = bVar.f19901e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bVar.f19901e.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f19877u) {
            this.f19876t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19876t.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f19876t.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f19876t) {
            return false;
        }
        return true;
    }
}
