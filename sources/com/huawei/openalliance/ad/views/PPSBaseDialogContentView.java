package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowMetrics;
import android.widget.LinearLayout;
import com.huawei.hms.ads.eu;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import gb.h0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class PPSBaseDialogContentView extends LinearLayout {
    public int A;
    public int B;
    public Boolean C;
    public final a D;

    /* renamed from: s, reason: collision with root package name */
    public View f23797s;

    /* renamed from: t, reason: collision with root package name */
    public View f23798t;

    /* renamed from: u, reason: collision with root package name */
    public View f23799u;

    /* renamed from: v, reason: collision with root package name */
    public float f23800v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f23801w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f23802x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public int f23803z;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            PPSBaseDialogContentView pPSBaseDialogContentView = PPSBaseDialogContentView.this;
            try {
                View view = pPSBaseDialogContentView.f23798t;
                if (view == null) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredHeight = pPSBaseDialogContentView.f23798t.getMeasuredHeight();
                View view2 = pPSBaseDialogContentView.f23798t;
                int min = Math.min(measuredHeight, pPSBaseDialogContentView.y);
                pPSBaseDialogContentView.getClass();
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = min;
                    view2.setLayoutParams(layoutParams);
                }
            } catch (Throwable th) {
                ex.I("PPSBaseDialogContentView", "onGlobalLayout error: %s", th.getClass().getSimpleName());
            }
        }
    }

    public PPSBaseDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = (int) (gb.z.d(getContext()) * 0.8f);
        this.D = new a();
        try {
            c(context);
            if (!h0.a(context) && (!h0.d() || !h0.b(context))) {
                this.f23800v = 0.86f;
                a(context);
                e(context);
                b();
            }
            this.f23800v = 0.6f;
            a(context);
            e(context);
            b();
        } catch (Throwable th) {
            ex.I("PPSBaseDialogContentView", "init ex: %s", th.getClass().getSimpleName());
        }
    }

    public final void a(Context context) {
        float min;
        int i10;
        int i11;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        if (this.f23799u != null) {
            int h10 = gb.z.h(context);
            int d10 = gb.z.d(context);
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT >= 30) {
                    Activity activity = (Activity) context;
                    currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    i10 = bounds.width();
                    currentWindowMetrics2 = activity.getWindowManager().getCurrentWindowMetrics();
                    bounds2 = currentWindowMetrics2.getBounds();
                    i11 = bounds2.height();
                } else {
                    Point point = new Point();
                    ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
                    i10 = point.x;
                    i11 = point.y;
                }
                int i12 = i10;
                d10 = i11;
                h10 = i12;
            }
            ViewGroup.LayoutParams layoutParams = this.f23799u.getLayoutParams();
            if (gb.u.r(context) == 1) {
                min = h10;
            } else {
                min = Math.min(h10, d10);
            }
            this.f23803z = (int) (min * this.f23800v);
            layoutParams.width = this.f23803z;
            this.f23799u.setLayoutParams(layoutParams);
        }
    }

    public abstract void b();

    public abstract void c(Context context);

    public final void d(int[] iArr, int[] iArr2) {
        if (iArr != null && iArr2 != null) {
            this.f23801w = Arrays.copyOf(iArr, iArr.length);
            this.f23802x = Arrays.copyOf(iArr2, iArr2.length);
        }
    }

    public abstract void e(Context context);

    public float getViewWidthPercent() {
        return this.f23800v;
    }

    public int getViewWith() {
        return this.f23803z;
    }

    public void setPaddingStart(int i10) {
        if (gb.u.k()) {
            this.A = 0;
            this.B = i10;
        } else {
            this.A = i10;
            this.B = 0;
        }
        b();
    }

    public void setShowWhyThisAd(boolean z10) {
        this.C = Boolean.valueOf(z10);
    }

    public void setAdContentData(AdContentData adContentData) {
    }

    public void setFeedbackListener(ba.b bVar) {
    }

    public void setViewClickListener(eu euVar) {
    }
}
