package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.n;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f20233v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final b f20234s;

    /* renamed from: t, reason: collision with root package name */
    public float f20235t;

    /* renamed from: u, reason: collision with root package name */
    public int f20236u;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public final class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public boolean f20237s;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20237s = false;
            int i10 = AspectRatioFrameLayout.f20233v;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20236u = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f509t, 0, 0);
            try {
                this.f20236u = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f20234s = new b();
    }

    public int getResizeMode() {
        return this.f20236u;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f20235t <= gl.Code) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        float f13 = (this.f20235t / (f11 / f12)) - 1.0f;
        float abs = Math.abs(f13);
        b bVar = this.f20234s;
        if (abs <= 0.01f) {
            if (!bVar.f20237s) {
                bVar.f20237s = true;
                AspectRatioFrameLayout.this.post(bVar);
                return;
            }
            return;
        }
        int i12 = this.f20236u;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        if (f13 > gl.Code) {
                            f = this.f20235t;
                        } else {
                            f10 = this.f20235t;
                        }
                    }
                } else {
                    f = this.f20235t;
                }
                measuredWidth = (int) (f12 * f);
            } else {
                f10 = this.f20235t;
            }
            measuredHeight = (int) (f11 / f10);
        } else if (f13 > gl.Code) {
            f10 = this.f20235t;
            measuredHeight = (int) (f11 / f10);
        } else {
            f = this.f20235t;
            measuredWidth = (int) (f12 * f);
        }
        if (!bVar.f20237s) {
            bVar.f20237s = true;
            AspectRatioFrameLayout.this.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f20235t != f) {
            this.f20235t = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f20236u != i10) {
            this.f20236u = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
