package com.huawei.openalliance.ad.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public class PPSBaseSwipeView extends PPSBaseStyleView {

    /* renamed from: w, reason: collision with root package name */
    public ImageView f23809w;

    /* renamed from: x, reason: collision with root package name */
    public ScanningView f23810x;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            PPSBaseSwipeView pPSBaseSwipeView = PPSBaseSwipeView.this;
            ex.V(pPSBaseSwipeView.getViewTag(), "POST %s %s", Integer.valueOf(pPSBaseSwipeView.f23809w.getHeight()), Integer.valueOf(pPSBaseSwipeView.f23809w.getWidth()));
            if (pPSBaseSwipeView.f23810x.getSrcBitmap() == null) {
                ScanningView scanningView = pPSBaseSwipeView.f23810x;
                ImageView imageView = pPSBaseSwipeView.f23809w;
                pPSBaseSwipeView.getClass();
                if (imageView != null) {
                    imageView.setDrawingCacheEnabled(true);
                    imageView.buildDrawingCache();
                    Bitmap drawingCache = imageView.getDrawingCache();
                    int measuredWidth = imageView.getMeasuredWidth();
                    int measuredHeight = imageView.getMeasuredHeight();
                    if (measuredWidth > 0 && measuredHeight > 0 && drawingCache != null) {
                        bitmap = Bitmap.createBitmap(drawingCache, 0, 0, measuredWidth, measuredHeight);
                        imageView.destroyDrawingCache();
                        scanningView.setSrcBitmap(bitmap);
                    } else {
                        ex.V(pPSBaseSwipeView.getViewTag(), "captureWidget NULL");
                    }
                }
                bitmap = null;
                scanningView.setSrcBitmap(bitmap);
            }
            ScanningView scanningView2 = pPSBaseSwipeView.f23810x;
            if (scanningView2 != null) {
                if (scanningView2.f24082t == null) {
                    ex.V("ScanningView", "start, mSrcBitmap is null");
                } else {
                    scanningView2.post(new r(scanningView2));
                }
            }
        }
    }

    public PPSBaseSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b() {
        ScanningView scanningView = this.f23810x;
        if (scanningView != null) {
            ValueAnimator valueAnimator = scanningView.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                scanningView.B.cancel();
            }
            scanningView.y = scanningView.f24087z;
            scanningView.postInvalidate();
        }
    }

    public String getViewTag() {
        return "PPSSplashSwipeClickView";
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ex.V(getViewTag(), "w=%s, h=%s, oldw=%s, oldh=%s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        this.f23809w.post(new a());
    }
}
