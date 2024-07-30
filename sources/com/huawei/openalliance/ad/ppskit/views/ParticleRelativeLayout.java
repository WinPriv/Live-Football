package com.huawei.openalliance.ad.ppskit.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import ka.n7;
import ka.zi;

/* loaded from: classes2.dex */
public class ParticleRelativeLayout extends AutoScaleSizeRelativeLayout implements zi {
    public Paint A;
    public ValueAnimator B;
    public ArrayList C;
    public PorterDuffXfermode D;
    public View E;
    public ContentRecord F;
    public boolean G;
    public boolean H;
    public final Handler I;

    /* renamed from: x, reason: collision with root package name */
    public int f23307x;
    public Bitmap y;

    /* renamed from: z, reason: collision with root package name */
    public Paint f23308z;

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ParticleRelativeLayout particleRelativeLayout = ParticleRelativeLayout.this;
            if (androidx.transition.n.M(particleRelativeLayout.C)) {
                return true;
            }
            Iterator it = particleRelativeLayout.C.iterator();
            while (it.hasNext()) {
                AnimatorSet animatorSet = ((m1) it.next()).f23511a;
                if (animatorSet != null) {
                    animatorSet.start();
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2;
            ParticleRelativeLayout particleRelativeLayout = ParticleRelativeLayout.this;
            View view = particleRelativeLayout.E;
            if (view != null && (valueAnimator2 = particleRelativeLayout.B) != null) {
                view.setScaleY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                particleRelativeLayout.E.setScaleX(((Float) particleRelativeLayout.B.getAnimatedValue()).floatValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            Handler handler = ParticleRelativeLayout.this.I;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1002, 300L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            Handler handler = ParticleRelativeLayout.this.I;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1002, 300L);
            }
        }
    }

    public ParticleRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G = false;
        this.H = true;
        this.I = new Handler(Looper.myLooper(), new a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f18o0);
        this.f23307x = obtainStyledAttributes.getDimensionPixelOffset(0, 36);
        obtainStyledAttributes.recycle();
        n7.e("ParticleRelativeLayout", "init");
        try {
            this.C = new ArrayList();
            Paint paint = new Paint(1);
            this.A = paint;
            paint.setDither(true);
            this.A.setFilterBitmap(true);
            Paint paint2 = new Paint(1);
            this.f23308z = paint2;
            paint2.setDither(true);
            this.f23308z.setStyle(Paint.Style.FILL);
            this.f23308z.setColor(-1);
            this.f23308z.setFilterBitmap(true);
            this.D = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } catch (Throwable th) {
            n7.h("ParticleRelativeLayout", "init exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ka.zi
    public final void b() {
        n7.e("ParticleRelativeLayout", "stop");
        try {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.B.cancel();
            }
        } catch (Throwable th) {
            n7.h("ParticleRelativeLayout", "cancel animator exception: %s", th.getClass().getSimpleName());
        }
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y == null) {
            return;
        }
        try {
            int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), this.A, 31);
            r(canvas);
            this.A.setXfermode(this.D);
            canvas.drawBitmap(this.y, gl.Code, gl.Code, this.A);
            this.A.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        } catch (Throwable th) {
            n7.h("ParticleRelativeLayout", "dispatchDraw exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // ka.zi
    public final boolean e() {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0010, B:9:0x001d, B:14:0x002d, B:17:0x0031, B:20:0x0035), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0010, B:9:0x001d, B:14:0x002d, B:17:0x0031, B:20:0x0035), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r5 = this;
            java.lang.String r0 = "ParticleRelativeLayout"
            r1 = 0
            r2 = 1
            int r3 = r5.getHeight()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L35
            int r3 = r5.getWidth()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L35
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r3 = r5.F     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r3.q0()     // Catch: java.lang.Throwable -> L3b
            int r3 = androidx.transition.n.X(r3)     // Catch: java.lang.Throwable -> L3b
            r4 = 2
            if (r3 == r4) goto L2a
            android.content.Context r3 = r5.getContext()     // Catch: java.lang.Throwable -> L3b
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.d0.v(r3)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L28
            goto L2a
        L28:
            r3 = r1
            goto L2b
        L2a:
            r3 = r2
        L2b:
            if (r3 == 0) goto L31
            r5.t()     // Catch: java.lang.Throwable -> L3b
            goto L4d
        L31:
            r5.h()     // Catch: java.lang.Throwable -> L3b
            goto L4d
        L35:
            java.lang.String r3 = "not support particle animator"
            ka.n7.e(r0, r3)     // Catch: java.lang.Throwable -> L3b
            goto L4d
        L3b:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2[r1] = r3
            java.lang.String r1 = "initParticleAnimator error: %s"
            ka.n7.h(r0, r1, r2)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.ParticleRelativeLayout.g():void");
    }

    public final void h() {
        s(new int[]{0, 300}, new float[][]{new float[]{0.375f, 0.239f}, new float[]{0.75f, 1.119f}, new float[]{gl.Code, 0.9f}}, R.drawable.hiad_hollow_circle);
        s(new int[]{50, 300}, new float[][]{new float[]{0.314f, 0.083f}, new float[]{0.369f, -0.065f}, new float[]{gl.Code, 0.5f}}, R.drawable.hiad_hollow_circle);
        s(new int[]{0, 300}, new float[][]{new float[]{0.683f, 0.825f}, new float[]{0.315f, -0.155f}, new float[]{gl.Code, 1.0f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.436f, 0.369f}, new float[]{0.298f, -0.107f}, new float[]{gl.Code, 0.7f}}, R.drawable.hiad_filled_circle);
        s(new int[]{50, 300}, new float[][]{new float[]{0.244f, 0.05f}, new float[]{0.667f, 1.054f}, new float[]{gl.Code, 0.4f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, 300}, new float[][]{new float[]{0.692f, 0.953f}, new float[]{0.708f, 1.089f}, new float[]{gl.Code, 0.7f}}, R.drawable.hiad_filled_circle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.B.cancel();
            }
            this.F = null;
            this.E = null;
            if (!androidx.transition.n.M(this.C)) {
                this.C.clear();
            }
        } catch (Throwable th) {
            n7.h("ParticleRelativeLayout", "onDetachedFromWindow exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        n7.e("ParticleRelativeLayout", "onSizeChanged");
        if (getHeight() > 0 && getWidth() > 0) {
            try {
                this.y = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(this.y).drawRoundRect(new RectF(gl.Code, gl.Code, getWidth(), getHeight()), com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), this.f23307x), com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), this.f23307x), this.f23308z);
            } catch (Throwable th) {
                n7.h("ParticleRelativeLayout", "createBitMapException: %s", th.getClass().getSimpleName());
            }
        }
        if (!this.H && this.G && this.F != null) {
            if (!androidx.transition.n.M(this.C)) {
                this.C.clear();
            }
            g();
        }
        if (i10 != 0 && i11 != 0) {
            this.H = false;
        }
    }

    @Override // ka.zi
    public final void p(RelativeLayout relativeLayout, ContentRecord contentRecord) {
        if (relativeLayout != null && contentRecord != null) {
            n7.e("ParticleRelativeLayout", "start");
            this.E = relativeLayout;
            this.F = contentRecord;
            post(new y0(this));
            return;
        }
        n7.e("ParticleRelativeLayout", "view or adLandingPageData is null");
    }

    public final void r(Canvas canvas) {
        try {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                m1 m1Var = (m1) it.next();
                float f = m1Var.f23513c;
                float f10 = m1Var.f23514d;
                canvas.drawBitmap(m1Var.f23512b, (Rect) null, new RectF(f, f10, (m1Var.f23516g * m1Var.f23515e) + f, (m1Var.f23517h * m1Var.f) + f10), this.A);
            }
        } catch (Throwable th) {
            n7.h("ParticleRelativeLayout", "drawBitmaps: %s", th.getClass().getSimpleName());
        }
    }

    public final void s(int[] iArr, float[][] fArr, int i10) {
        if (this.C != null) {
            Drawable drawable = getResources().getDrawable(i10);
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            this.C.add(new m1(fArr, iArr, createBitmap, this));
        }
    }

    @Override // ka.zi
    public void setAutoRepeat(boolean z10) {
        this.G = z10;
    }

    public void setRadius(int i10) {
        this.f23307x = i10;
        setRectCornerRadius(com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), i10));
    }

    public final void t() {
        s(new int[]{50, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.668f, 0.74f}, new float[]{0.363f, -0.131f}, new float[]{gl.Code, 1.0f}}, R.drawable.hiad_filled_circle);
        s(new int[]{100, 300}, new float[][]{new float[]{0.535f, 0.582f}, new float[]{0.797f, 1.12f}, new float[]{gl.Code, 1.0f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.488f, 0.465f}, new float[]{0.268f, -0.107f}, new float[]{gl.Code, 0.9f}}, R.drawable.hiad_filled_circle);
        s(new int[]{50, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.171f, 0.073f}, new float[]{0.429f, -0.107f}, new float[]{gl.Code, 0.6f}}, R.drawable.hiad_filled_circle);
        s(new int[]{IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 200}, new float[][]{new float[]{0.299f, 0.253f}, new float[]{0.268f, -0.071f}, new float[]{gl.Code, 0.4f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.124f, 0.017f}, new float[]{0.369f, -0.155f}, new float[]{gl.Code, 1.0f}}, R.drawable.hiad_filled_circle);
        s(new int[]{100, 200}, new float[][]{new float[]{0.204f, 0.168f}, new float[]{0.762f, 1.054f}, new float[]{gl.Code, 0.4f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.15f, 0.11f}, new float[]{0.702f, 1.071f}, new float[]{gl.Code, 0.5f}}, R.drawable.hiad_filled_circle);
        s(new int[]{50, 350}, new float[][]{new float[]{0.58f, 0.654f}, new float[]{0.446f, -0.065f}, new float[]{gl.Code, 0.45f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.655f, 0.685f}, new float[]{0.774f, 1.065f}, new float[]{gl.Code, 0.4f}}, R.drawable.hiad_filled_circle);
        s(new int[]{50, 200}, new float[][]{new float[]{0.884f, 1.01f}, new float[]{0.506f, -0.077f}, new float[]{gl.Code, 0.8f}}, R.drawable.hiad_filled_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.465f, 0.431f}, new float[]{0.786f, 1.071f}, new float[]{gl.Code, 0.5f}}, R.drawable.hiad_hollow_circle);
        s(new int[]{50, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.261f, 0.203f}, new float[]{0.357f, -0.077f}, new float[]{gl.Code, 0.6f}}, R.drawable.hiad_hollow_circle);
        s(new int[]{0, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.778f, 0.854f}, new float[]{0.357f, -0.101f}, new float[]{gl.Code, 0.8f}}, R.drawable.hiad_hollow_circle);
        s(new int[]{50, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED}, new float[][]{new float[]{0.711f, 0.794f}, new float[]{0.429f, -0.054f}, new float[]{gl.Code, 0.4f}}, R.drawable.hiad_hollow_circle);
        s(new int[]{100, 300}, new float[][]{new float[]{0.809f, 0.885f}, new float[]{0.72f, 1.125f}, new float[]{gl.Code, 1.0f}}, R.drawable.hiad_hollow_circle);
    }

    public final void u() {
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(gl.Code, 1.0f), Keyframe.ofFloat(0.2f, 0.95f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(gl.Code, 1.0f), Keyframe.ofFloat(0.2f, 0.95f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
        this.B = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(1500L);
        this.B.setTarget(this.E);
        if (this.G) {
            this.B.setRepeatCount(-1);
        }
        this.B.addUpdateListener(new b());
        this.B.addListener(new c());
    }
}
