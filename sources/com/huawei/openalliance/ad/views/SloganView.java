package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.in;
import com.huawei.hms.ads.kj;
import com.huawei.hms.ads.ko;

/* loaded from: classes2.dex */
public class SloganView extends RelativeLayout implements kj {

    /* renamed from: s, reason: collision with root package name */
    public in f24088s;

    /* renamed from: t, reason: collision with root package name */
    public final int f24089t;

    /* renamed from: u, reason: collision with root package name */
    public int f24090u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24091v;

    /* renamed from: w, reason: collision with root package name */
    public View f24092w;

    /* renamed from: x, reason: collision with root package name */
    public float f24093x;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f24094s;

        public a(int i10) {
            this.f24094s = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageView;
            SloganView sloganView = SloganView.this;
            View view = sloganView.f24092w;
            if (view instanceof ImageView) {
                imageView = (ImageView) view;
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                sloganView.removeAllViews();
                imageView = new ImageView(sloganView.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                sloganView.f24092w = imageView;
                sloganView.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
            }
            imageView.setImageResource(this.f24094s);
        }
    }

    public SloganView(Context context, int i10) {
        super(context);
        this.f24090u = 0;
        this.f24091v = 1;
        this.f24089t = i10;
        this.f24088s = new in(getContext(), this);
    }

    @Override // com.huawei.hms.ads.kj
    public final void Code(int i10) {
        gb.w.b(new a(i10));
    }

    public final void a() {
        if (this.f24092w == null) {
            this.f24088s.Code(this.f24089t, true);
        }
        setVisibility(0);
    }

    public int getOrientation() {
        return this.f24091v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        ex.Code("SloganView", "onSizeChanged w: %d h: %d oldw: %d oldh: %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        if (i10 > 0 && i11 > 0) {
            float f = (i10 * 1.0f) / i11;
            float abs = Math.abs(this.f24093x - f);
            ex.Code("SloganView", "ratio: %s diff: %s", Float.valueOf(f), Float.valueOf(abs));
            if (abs > 0.01f) {
                this.f24093x = f;
                if (f > 0.9f && (i14 = this.f24090u) > 0) {
                    ex.Code("SloganView", "pick wideSloganResId");
                } else {
                    ex.Code("SloganView", "pick defaultSloganResId");
                    i14 = this.f24089t;
                }
                this.f24088s.Code(i14, false);
            }
        }
    }

    public void setSloganShowListener(ko koVar) {
        this.f24088s.Code(koVar);
    }

    public void setWideSloganResId(int i10) {
        this.f24090u = i10;
    }

    public SloganView(Context context, int i10, int i11) {
        super(context);
        this.f24090u = 0;
        this.f24091v = 1;
        this.f24091v = i10;
        this.f24089t = i11;
        this.f24088s = new in(getContext(), this);
    }
}
