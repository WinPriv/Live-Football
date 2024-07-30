package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.R;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final b f16677a;

    /* renamed from: b, reason: collision with root package name */
    private a f16678b;

    /* renamed from: c, reason: collision with root package name */
    private float f16679c;

    /* renamed from: d, reason: collision with root package name */
    private int f16680d;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, float f10, boolean z10);
    }

    /* loaded from: classes.dex */
    public final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private float f16682b;

        /* renamed from: c, reason: collision with root package name */
        private float f16683c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16684d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16685e;

        private b() {
        }

        public void a(float f, float f10, boolean z10) {
            this.f16682b = f;
            this.f16683c = f10;
            this.f16684d = z10;
            if (!this.f16685e) {
                this.f16685e = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16685e = false;
            if (AspectRatioFrameLayout.this.f16678b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f16678b.a(this.f16682b, this.f16683c, this.f16684d);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f16680d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f16679c <= gl.Code) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = f11 / f12;
        float f14 = (this.f16679c / f13) - 1.0f;
        if (Math.abs(f14) <= 0.01f) {
            this.f16677a.a(this.f16679c, f13, false);
            return;
        }
        int i12 = this.f16680d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f14 > gl.Code) {
                            f = this.f16679c;
                        } else {
                            f10 = this.f16679c;
                        }
                    }
                } else {
                    f = this.f16679c;
                }
                measuredWidth = (int) (f12 * f);
            } else {
                f10 = this.f16679c;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f14 > gl.Code) {
            f10 = this.f16679c;
            measuredHeight = (int) (f11 / f10);
        } else {
            f = this.f16679c;
            measuredWidth = (int) (f12 * f);
        }
        this.f16677a.a(this.f16679c, f13, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f16679c != f) {
            this.f16679c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
        this.f16678b = aVar;
    }

    public void setResizeMode(int i10) {
        if (this.f16680d != i10) {
            this.f16680d = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16680d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f16680d = obtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f16677a = new b();
    }
}
