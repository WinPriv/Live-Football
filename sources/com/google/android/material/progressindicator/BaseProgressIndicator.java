package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.n;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Arrays;
import y6.b;
import y6.h;
import y6.k;
import y6.l;

/* loaded from: classes2.dex */
public abstract class BaseProgressIndicator<S extends y6.b> extends ProgressBar {
    public static final /* synthetic */ int E = 0;
    public final a A;
    public final b B;
    public final c C;
    public final d D;

    /* renamed from: s, reason: collision with root package name */
    public final S f20936s;

    /* renamed from: t, reason: collision with root package name */
    public int f20937t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20938u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f20939v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20940w;

    /* renamed from: x, reason: collision with root package name */
    public y6.a f20941x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f20942z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BaseProgressIndicator.E;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f20940w > 0) {
                SystemClock.uptimeMillis();
            }
            baseProgressIndicator.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BaseProgressIndicator.E;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            boolean z10 = false;
            ((k) baseProgressIndicator.getCurrentDrawable()).e(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                baseProgressIndicator.setVisibility(4);
            }
            baseProgressIndicator.getClass();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends n1.c {
        public c() {
        }

        @Override // n1.c
        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setIndeterminate(false);
            baseProgressIndicator.b(baseProgressIndicator.f20937t, baseProgressIndicator.f20938u);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends n1.c {
        public d() {
        }

        @Override // n1.c
        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (!baseProgressIndicator.y) {
                baseProgressIndicator.setVisibility(baseProgressIndicator.f20942z);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(g7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i10);
        this.y = false;
        this.f20942z = 4;
        this.A = new a();
        this.B = new b();
        this.C = new c();
        this.D = new d();
        Context context2 = getContext();
        this.f20936s = a(context2, attributeSet);
        TypedArray d10 = com.google.android.material.internal.k.d(context2, attributeSet, n.M, i10, i11, new int[0]);
        d10.getInt(5, -1);
        this.f20940w = Math.min(d10.getInt(3, -1), 1000);
        d10.recycle();
        this.f20941x = new y6.a();
        this.f20939v = true;
    }

    private l<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().D;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().D;
    }

    public abstract S a(Context context, AttributeSet attributeSet);

    public void b(int i10, boolean z10) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f20937t = i10;
                this.f20938u = z10;
                this.y = true;
                if (getIndeterminateDrawable().isVisible()) {
                    y6.a aVar = this.f20941x;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != gl.Code) {
                        getIndeterminateDrawable().E.g();
                        return;
                    }
                }
                this.C.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i10);
        if (getProgressDrawable() != null && !z10) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        if (getWindowVisibility() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, n0.l0> r0 = n0.c0.f33054a
            boolean r0 = n0.c0.g.b(r4)
            r1 = 0
            if (r0 == 0) goto L34
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L34
            r0 = r4
        L10:
            int r2 = r0.getVisibility()
            r3 = 1
            if (r2 == 0) goto L18
            goto L26
        L18:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L28
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L26
        L24:
            r0 = r3
            goto L2d
        L26:
            r0 = r1
            goto L2d
        L28:
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto L31
            goto L24
        L2d:
            if (r0 == 0) goto L34
            r1 = r3
            goto L34
        L31:
            android.view.View r0 = (android.view.View) r0
            goto L10
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.BaseProgressIndicator.c():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f20936s.f;
    }

    public int[] getIndicatorColor() {
        return this.f20936s.f36771c;
    }

    public int getShowAnimationBehavior() {
        return this.f20936s.f36773e;
    }

    public int getTrackColor() {
        return this.f20936s.f36772d;
    }

    public int getTrackCornerRadius() {
        return this.f20936s.f36770b;
    }

    public int getTrackThickness() {
        return this.f20936s.f36769a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().E.f(this.C);
        }
        h<S> progressDrawable = getProgressDrawable();
        d dVar = this.D;
        if (progressDrawable != null) {
            h<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f36800x == null) {
                progressDrawable2.f36800x = new ArrayList();
            }
            if (!progressDrawable2.f36800x.contains(dVar)) {
                progressDrawable2.f36800x.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            y6.n<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f36800x == null) {
                indeterminateDrawable.f36800x = new ArrayList();
            }
            if (!indeterminateDrawable.f36800x.contains(dVar)) {
                indeterminateDrawable.f36800x.add(dVar);
            }
        }
        if (c()) {
            if (this.f20940w > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.B);
        removeCallbacks(this.A);
        ((k) getCurrentDrawable()).e(false, false, false);
        y6.n<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.D;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(dVar);
            getIndeterminateDrawable().E.i();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        int e10;
        int d10;
        l<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        if (currentDrawingDelegate.e() < 0) {
            e10 = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        } else {
            e10 = currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight();
        }
        if (currentDrawingDelegate.d() < 0) {
            d10 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        } else {
            d10 = currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(e10, d10);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f20939v) {
            ((k) getCurrentDrawable()).e(c(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f20939v) {
            ((k) getCurrentDrawable()).e(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(y6.a aVar) {
        this.f20941x = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f36797u = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f36797u = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f20936s.f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        if (z10 == isIndeterminate()) {
            return;
        }
        k kVar = (k) getCurrentDrawable();
        if (kVar != null) {
            kVar.e(false, false, false);
        }
        super.setIndeterminate(z10);
        k kVar2 = (k) getCurrentDrawable();
        if (kVar2 != null) {
            kVar2.e(c(), false, false);
        }
        if ((kVar2 instanceof y6.n) && c()) {
            ((y6.n) kVar2).E.h();
        }
        this.y = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof y6.n) {
                ((k) drawable).e(false, false, false);
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{a0.a.L0(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f20936s.f36771c = iArr;
            getIndeterminateDrawable().E.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        b(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof h) {
                h hVar = (h) drawable;
                hVar.e(false, false, false);
                super.setProgressDrawable(hVar);
                hVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f20936s.f36773e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f20936s;
        if (s10.f36772d != i10) {
            s10.f36772d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f20936s;
        if (s10.f36770b != i10) {
            s10.f36770b = Math.min(i10, s10.f36769a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f20936s;
        if (s10.f36769a != i10) {
            s10.f36769a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f20942z = i10;
    }

    @Override // android.widget.ProgressBar
    public y6.n<S> getIndeterminateDrawable() {
        return (y6.n) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public h<S> getProgressDrawable() {
        return (h) super.getProgressDrawable();
    }
}
