package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.anythink.core.common.k.h;
import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.foundation.h.i;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class SpreadAnimLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Paint f4458a;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f4459b;

    /* renamed from: c, reason: collision with root package name */
    private a f4460c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f4461d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f4462e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f4463g;

    /* renamed from: h, reason: collision with root package name */
    private int f4464h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f4465i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4466j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4467k;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        RectF f4470a;

        /* renamed from: b, reason: collision with root package name */
        int f4471b;
    }

    public SpreadAnimLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f4466j && this.f4467k) {
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
            this.f4458a.setAlpha(this.f4460c.f4471b);
            RectF rectF = this.f4460c.f4470a;
            int i10 = this.f;
            canvas.drawRoundRect(rectF, i10, i10, this.f4458a);
            RectF rectF2 = this.f4461d;
            int i11 = this.f;
            canvas.drawRoundRect(rectF2, i11, i11, this.f4465i);
            canvas.restoreToCount(saveLayer);
            super.draw(canvas);
            return;
        }
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f4463g;
        setPadding(i12, i12, i12, i12);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f4466j) {
            if (i10 == 0) {
                post(new Runnable() { // from class: com.anythink.basead.ui.SpreadAnimLayout.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpreadAnimLayout.this.startSpreadAnimation();
                    }
                });
                return;
            }
            ValueAnimator valueAnimator = this.f4459b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
    }

    public void setMaxSpreadDistance(int i10) {
        this.f4463g = i10;
    }

    public void startSpreadAnimation() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f4466j = true;
        if (!this.f4467k) {
            this.f4461d = new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            this.f4462e = new RectF(this.f4461d);
            a aVar = new a();
            this.f4460c = aVar;
            aVar.f4471b = p.f9095b;
            aVar.f4470a = this.f4462e;
            this.f4463g = Math.min(this.f4463g, Math.min((getWidth() - childAt.getWidth()) / 2, (getHeight() - childAt.getHeight()) / 2));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, 1.0f);
            this.f4459b = ofFloat;
            ofFloat.setDuration(this.f4464h);
            this.f4459b.setRepeatMode(1);
            this.f4459b.setRepeatCount(-1);
            this.f4459b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f4459b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SpreadAnimLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SpreadAnimLayout.this.f4460c.f4471b = (int) ((1.0f - floatValue) * 255.0f);
                    SpreadAnimLayout.this.f4460c.f4470a.set(SpreadAnimLayout.this.f4461d);
                    float f = -((int) (SpreadAnimLayout.this.f4463g * floatValue));
                    SpreadAnimLayout.this.f4460c.f4470a.inset(f, f);
                    SpreadAnimLayout.this.invalidate();
                }
            });
            this.f4467k = true;
        }
        this.f4459b.start();
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4466j = true;
        setWillNotDraw(false);
        int color = getResources().getColor(h.a(context, "color_spread", i.f10126d));
        this.f4463g = getResources().getDimensionPixelSize(h.a(getContext(), "myoffer_spread_max_distance_normal", "dimen"));
        this.f = h.a(context, 4.0f);
        this.f4464h = 1000;
        Paint paint = new Paint();
        this.f4458a = paint;
        paint.setAntiAlias(true);
        this.f4458a.setAlpha(p.f9095b);
        this.f4458a.setColor(color);
        Paint paint2 = new Paint(1);
        this.f4465i = paint2;
        paint2.setColor(-1);
        this.f4465i.setStyle(Paint.Style.FILL);
        this.f4465i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
