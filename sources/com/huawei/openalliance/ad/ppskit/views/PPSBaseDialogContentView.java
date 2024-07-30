package com.huawei.openalliance.ad.ppskit.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ka.hj;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class PPSBaseDialogContentView extends LinearLayout {
    public static final /* synthetic */ int D = 0;
    public int A;
    public Boolean B;
    public final a C;

    /* renamed from: s, reason: collision with root package name */
    public View f23164s;

    /* renamed from: t, reason: collision with root package name */
    public View f23165t;

    /* renamed from: u, reason: collision with root package name */
    public float f23166u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f23167v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f23168w;

    /* renamed from: x, reason: collision with root package name */
    public final int f23169x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f23170z;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            PPSBaseDialogContentView pPSBaseDialogContentView = PPSBaseDialogContentView.this;
            try {
                View view = pPSBaseDialogContentView.f23164s;
                if (view == null) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int measuredHeight = pPSBaseDialogContentView.f23164s.getMeasuredHeight();
                View view2 = pPSBaseDialogContentView.f23164s;
                int min = Math.min(measuredHeight, pPSBaseDialogContentView.f23169x);
                int i10 = PPSBaseDialogContentView.D;
                pPSBaseDialogContentView.getClass();
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = min;
                    view2.setLayoutParams(layoutParams);
                }
            } catch (Throwable th) {
                n7.h("PPSBaseDialogContentView", "onGlobalLayout error: %s", th.getClass().getSimpleName());
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public PPSBaseDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        Context context2 = getContext();
        if (context2 == null) {
            i10 = 0;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context2.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            }
            i10 = displayMetrics.heightPixels;
        }
        this.f23169x = (int) (i10 * 0.8f);
        this.C = new a();
        try {
            b(context);
            if (!com.huawei.openalliance.ad.ppskit.utils.m.K(context) && (!com.huawei.openalliance.ad.ppskit.utils.m.L(context) || !com.huawei.openalliance.ad.ppskit.utils.m.M(context))) {
                this.f23166u = 0.86f;
                d(context);
                c();
                a();
            }
            this.f23166u = 0.6f;
            d(context);
            c();
            a();
        } catch (Throwable th) {
            n7.h("PPSBaseDialogContentView", "init ex: %s", th.getClass().getSimpleName());
        }
    }

    public abstract void a();

    public abstract void b(Context context);

    public abstract void c();

    public final void d(Context context) {
        int i10;
        float min;
        int i11;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        if (this.f23165t != null) {
            int i12 = 0;
            if (context == null) {
                i10 = 0;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                i10 = displayMetrics.widthPixels;
            }
            if (context != null) {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
                if (windowManager2 != null) {
                    windowManager2.getDefaultDisplay().getRealMetrics(displayMetrics2);
                }
                i12 = displayMetrics2.heightPixels;
            }
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT >= 30) {
                    Activity activity = (Activity) context;
                    currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    i11 = bounds.width();
                    currentWindowMetrics2 = activity.getWindowManager().getCurrentWindowMetrics();
                    bounds2 = currentWindowMetrics2.getBounds();
                    i12 = bounds2.height();
                } else {
                    Point point = new Point();
                    ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
                    i11 = point.x;
                    i12 = point.y;
                }
                i10 = i11;
            }
            ViewGroup.LayoutParams layoutParams = this.f23165t.getLayoutParams();
            if (z1.V(context) == 1) {
                min = i10;
            } else {
                min = Math.min(i10, i12);
            }
            int i13 = (int) (min * this.f23166u);
            this.y = i13;
            layoutParams.width = i13;
            this.f23165t.setLayoutParams(layoutParams);
        }
    }

    public float getViewWidthPercent() {
        return this.f23166u;
    }

    public int getViewWith() {
        return this.y;
    }

    public void setPaddingStart(int i10) {
        if (z1.D()) {
            this.f23170z = 0;
            this.A = i10;
        } else {
            this.f23170z = i10;
            this.A = 0;
        }
        a();
    }

    public void setShowWhyThisAd(boolean z10) {
        this.B = Boolean.valueOf(z10);
    }

    public void setAdContentData(AdContentData adContentData) {
    }

    public void setContentInfo(ContentRecord contentRecord) {
    }

    public void setViewClickListener(hj hjVar) {
    }

    public void setWhyThisAdClickListener(b bVar) {
    }
}
