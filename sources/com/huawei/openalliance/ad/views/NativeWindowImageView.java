package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.huawei.hms.ads.dt;
import com.huawei.hms.ads.dv;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import com.huawei.hms.ads.ju;
import com.huawei.hms.ads.nativead.NativeView;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import gb.w0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class NativeWindowImageView extends AutoScaleSizeRelativeLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ju, gb.j {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f23747l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageView f23748c0;

    /* renamed from: d0, reason: collision with root package name */
    public ProgressBar f23749d0;

    /* renamed from: e0, reason: collision with root package name */
    public com.huawei.openalliance.ad.inter.data.e f23750e0;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f23751f0;

    /* renamed from: g0, reason: collision with root package name */
    public Rect f23752g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Rect f23753h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f23754i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f23755j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f23756k0;
    public View y;

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Drawable f23758s;

        public b(Drawable drawable) {
            this.f23758s = drawable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NativeWindowImageView nativeWindowImageView = NativeWindowImageView.this;
            Drawable drawable = this.f23758s;
            nativeWindowImageView.f23751f0 = drawable;
            nativeWindowImageView.setImageDrawable(drawable);
        }
    }

    public NativeWindowImageView(Context context) {
        super(context);
        this.f23753h0 = new Rect();
        this.f23754i0 = 1.3007812f;
        this.f23755j0 = 0;
        this.f23756k0 = true;
        LayoutInflater.from(context).inflate(R.layout.hiad_window_image_layout, this);
        this.y = this;
        this.f23748c0 = (ImageView) findViewById(R.id.window_image_content);
        this.f23749d0 = (ProgressBar) findViewById(R.id.window_image_progress);
        setRatio(Float.valueOf(1.7777778f));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f23752g0 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageDrawable(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof dt) {
                ((dt) drawable).Code(new a());
            } else {
                int intrinsicWidth = this.f23751f0.getIntrinsicWidth();
                int intrinsicHeight = this.f23751f0.getIntrinsicHeight();
                if (intrinsicHeight != 0 && intrinsicWidth != 0) {
                    this.f23754i0 = intrinsicHeight / intrinsicWidth;
                }
                C();
            }
            this.f23748c0.setImageDrawable(drawable);
            this.f23749d0.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        boolean z10;
        float f;
        boolean z11;
        boolean z12;
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        boolean z13 = true;
        if (rect.width() > 0 && rect.height() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        if (this.f23756k0) {
            ViewParent viewParent = this.y.getParent();
            while (viewParent != 0) {
                if (!(viewParent instanceof PPSNativeView) && !(viewParent instanceof NativeView)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    break;
                } else {
                    viewParent = viewParent.getParent();
                }
            }
            if (!(viewParent instanceof PPSNativeView) && !(viewParent instanceof NativeView)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                this.y = (View) viewParent;
            }
        }
        Object parent = this.y.getParent();
        if (parent == null) {
            ex.Z("NativeWindowImageView", "invalid parent obj");
        } else {
            ((View) parent).getGlobalVisibleRect(this.f23752g0);
        }
        Rect rect2 = new Rect();
        getLocalVisibleRect(rect2);
        Rect rect3 = new Rect();
        getGlobalVisibleRect(rect3);
        int i10 = rect3.left - rect2.left;
        Rect rect4 = this.f23753h0;
        rect4.left = i10;
        rect4.right = getWidth() + i10;
        int i11 = rect3.top - rect2.top;
        rect4.top = i11;
        rect4.bottom = getHeight() + i11;
        int width = (int) (getWidth() * this.f23754i0);
        if (this.f23752g0.height() < width) {
            z13 = false;
        }
        if (z13) {
            int height = (this.f23752g0.height() - width) / 2;
            int i12 = rect4.top;
            Rect rect5 = this.f23752g0;
            int i13 = rect5.top;
            if (i12 - i13 <= height) {
                this.f23755j0 = 0;
            } else if (rect5.bottom - rect4.bottom <= height) {
                this.f23755j0 = rect4.height() - width;
            } else {
                this.f23755j0 = (i13 + height) - i12;
            }
        }
        if (this.f23751f0 != null) {
            this.f23748c0.setScaleType(ImageView.ScaleType.MATRIX);
            int intrinsicWidth = this.f23751f0.getIntrinsicWidth();
            if (intrinsicWidth != 0) {
                f = getWidth() / intrinsicWidth;
            } else {
                f = 1.0f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            matrix.postTranslate(gl.Code, this.f23755j0);
            this.f23748c0.setImageMatrix(matrix);
            this.f23748c0.invalidate();
        }
    }

    @Override // gb.j
    public final void Code() {
        ex.Z("NativeWindowImageView", "load image fail");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C();
    }

    @Override // com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ImageView imageView = this.f23748c0;
        imageView.layout(0, 0, imageView.getMeasuredWidth(), this.f23748c0.getMeasuredHeight());
    }

    @Override // com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getMeasuredWidth();
        this.f23748c0.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * this.f23754i0), 1073741824));
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C();
    }

    @Override // com.huawei.hms.ads.ju
    public void setDisplayView(View view) {
        if (view != null) {
            this.f23756k0 = false;
            this.y = view;
        }
    }

    @Override // com.huawei.hms.ads.ju
    public void setNativeAd(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.f23750e0 = eVar;
        if (eVar != null) {
            Iterator<com.huawei.openalliance.ad.inter.data.h> it = eVar.Z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.huawei.openalliance.ad.inter.data.h next = it.next();
                if (next != null) {
                    SourceParam sourceParam = new SourceParam();
                    sourceParam.i(next.f22260s);
                    sourceParam.k(next.f22263v);
                    sourceParam.l(next.f22264w);
                    w0.e(getContext(), sourceParam, this);
                    break;
                }
            }
            requestLayout();
        }
    }

    @Override // gb.j
    public final void Code(String str, Drawable drawable) {
        gb.w.b(new b(drawable));
    }

    /* loaded from: classes2.dex */
    public class a implements dv {
        public a() {
        }

        @Override // com.huawei.hms.ads.dv
        public final void Code() {
            int i10 = NativeWindowImageView.f23747l0;
            NativeWindowImageView nativeWindowImageView = NativeWindowImageView.this;
            int intrinsicWidth = nativeWindowImageView.f23751f0.getIntrinsicWidth();
            int intrinsicHeight = nativeWindowImageView.f23751f0.getIntrinsicHeight();
            if (intrinsicHeight != 0 && intrinsicWidth != 0) {
                nativeWindowImageView.f23754i0 = intrinsicHeight / intrinsicWidth;
            }
            nativeWindowImageView.C();
        }

        @Override // com.huawei.hms.ads.dv
        public final void I() {
        }

        @Override // com.huawei.hms.ads.dv
        public final void V() {
        }
    }
}
