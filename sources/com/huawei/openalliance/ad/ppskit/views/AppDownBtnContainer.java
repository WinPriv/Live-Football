package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.views.ProgressButton;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class AppDownBtnContainer extends RelativeLayout implements View.OnClickListener, ProgressButton.b {
    public static final /* synthetic */ int E = 0;
    public int A;
    public int B;
    public boolean C;
    public boolean D;

    /* renamed from: s, reason: collision with root package name */
    public ProgressButton f23076s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f23077t;

    /* renamed from: u, reason: collision with root package name */
    public RelativeLayout.LayoutParams f23078u;

    /* renamed from: v, reason: collision with root package name */
    public int f23079v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23080w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23081x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f23082z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AppDownBtnContainer f23083s;

        public a(AppDownloadButton appDownloadButton) {
            this.f23083s = appDownloadButton;
        }

        @Override // java.lang.Runnable
        public final void run() {
            n7.b("AppDownBtnContainer", "post run");
            AppDownBtnContainer appDownBtnContainer = this.f23083s;
            int measuredHeight = appDownBtnContainer.getMeasuredHeight();
            int i10 = AppDownBtnContainer.E;
            appDownBtnContainer.e(measuredHeight);
        }
    }

    public AppDownBtnContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23080w = false;
        this.f23081x = true;
        this.C = false;
        this.D = false;
        if (context != null && attributeSet != null) {
            this.f23080w = true;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f21r0);
            try {
                this.f23081x = obtainStyledAttributes.getBoolean(4, true);
                this.y = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.f23082z = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            } finally {
                try {
                } finally {
                }
            }
        }
        n7.c("AppDownBtnContainer", "init, create with attrs: %s", Boolean.valueOf(this.f23080w));
        ProgressButton progressButton = new ProgressButton(context, attributeSet);
        this.f23076s = progressButton;
        progressButton.setId(R.id.haid_down_btn_cancel_btn);
        setOnClickListener(this);
        this.f23076s.setResetListener(this);
        this.f23076s.setOnClickListener(this);
        addView(this.f23076s);
        if (context != null) {
            this.f23077t = new ImageView(context);
            this.f23079v = com.huawei.openalliance.ad.ppskit.utils.d0.b(context, 16.0f);
            this.f23077t.setImageDrawable(context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            this.f23078u = layoutParams;
            layoutParams.addRule(19, this.f23076s.getId());
            this.f23078u.addRule(15);
        }
    }

    private Drawable getCancelBtnDrawable() {
        return getContext().getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn);
    }

    public final void c(int i10, int i11) {
        n7.c("AppDownBtnContainer", "on size reset: %s, %s", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 > 0 && i11 > 0) {
            if (this.D) {
                this.A = i10;
                this.D = false;
            } else if (this.f23081x || this.A <= 0) {
                int i12 = this.y;
                if ((i12 > 0 && i10 > i12) || ((i12 = this.f23082z) > 0 && i10 < i12)) {
                    this.A = i12;
                } else {
                    this.A = i10;
                }
            }
            this.B = i11;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.B;
                layoutParams.width = this.A;
                setLayoutParams(layoutParams);
            }
            if (this.C) {
                e(this.B);
            }
        }
    }

    public final void d(AppStatus appStatus) {
        boolean z10;
        if (appStatus == null) {
            return;
        }
        if (AppStatus.PAUSE == appStatus) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
        n7.c("AppDownBtnContainer", "configCancelBtn, status: %s", appStatus);
        if (!this.C) {
            try {
                if (this.f23077t.getParent() == this) {
                    removeView(this.f23077t);
                    return;
                }
                return;
            } catch (Throwable th) {
                n7.h("AppDownBtnContainer", "remove cancel btn ex: %s", th.getClass().getSimpleName());
                return;
            }
        }
        this.f23077t.setImageDrawable(getCancelBtnDrawable());
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight <= 0) {
            post(new a((AppDownloadButton) this));
        } else {
            e(measuredHeight);
        }
    }

    public final void e(int i10) {
        int b10;
        if (i10 < com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), 40.0f)) {
            b10 = com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), 12.0f);
        } else {
            b10 = com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), 16.0f);
        }
        this.f23079v = b10;
        n7.c("AppDownBtnContainer", "btnHeight: %s, cancelBtnSize: %s", Integer.valueOf(i10), Integer.valueOf(this.f23079v));
        RelativeLayout.LayoutParams layoutParams = this.f23078u;
        layoutParams.height = i10;
        layoutParams.width = i10;
        layoutParams.setMarginEnd(0);
        int i11 = this.f23079v;
        int i12 = (i10 - i11) / 2;
        if (i12 <= 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.f23078u;
            layoutParams2.height = i11;
            layoutParams2.width = i11;
            layoutParams2.setMarginEnd(com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), 12.0f));
            i12 = 0;
        }
        this.f23077t.setPaddingRelative(i12, i12, i12, i12);
        try {
            if (this.f23077t.getParent() != this) {
                addView(this.f23077t, this.f23078u);
            }
        } catch (Throwable th) {
            n7.h("AppDownBtnContainer", "add cancel btn ex: %s", th.getClass().getSimpleName());
        }
    }

    public int getProgress() {
        return this.f23076s.getProgress();
    }

    public Drawable getProgressDrawable() {
        return this.f23076s.getProgressDrawable();
    }

    public Rect getPromptRect() {
        return this.f23076s.getPromptRect();
    }

    public abstract AppStatus getStatus();

    public CharSequence getText() {
        return this.f23076s.getText();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ProgressButton progressButton = this.f23076s;
        if (progressButton != null && this.f23080w) {
            ViewGroup.LayoutParams layoutParams = progressButton.getLayoutParams();
            layoutParams.height = View.MeasureSpec.getSize(i11);
            layoutParams.width = View.MeasureSpec.getSize(i10);
            int i13 = this.B;
            if (i13 > 0) {
                layoutParams.height = i13;
            }
            if (this.f23081x && (i12 = this.A) > 0) {
                layoutParams.width = i12;
            }
            int i14 = this.y;
            if (i14 > 0 && layoutParams.width > i14) {
                layoutParams.width = i14;
            }
            int i15 = this.f23082z;
            if (i15 > 0 && layoutParams.width < i15) {
                layoutParams.width = i15;
            }
            if (layoutParams.width > 0 && layoutParams.height > 0) {
                this.f23076s.setLayoutParams(layoutParams);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCancelBtnClickListener(View.OnClickListener onClickListener) {
        this.f23077t.setOnClickListener(onClickListener);
    }

    public void setClickListenerInner(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.f23076s.setOnClickListener(onClickListener);
    }

    public void setFixedWidth(boolean z10) {
        this.f23076s.setFixedWidth(z10);
    }

    public void setFontFamily(String str) {
        this.f23076s.setFontFamily(str);
    }

    public void setLayoutParamsInner(ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
        this.f23076s.setLayoutParams(layoutParams);
    }

    public void setLayoutParamsSkipSizeReset(ViewGroup.LayoutParams layoutParams) {
        this.D = true;
        setLayoutParams(layoutParams);
    }

    public void setMax(int i10) {
        this.f23076s.setMax(i10);
    }

    public void setMaxWidth(int i10) {
        this.f23076s.setMaxWidth(i10);
    }

    public void setMinWidth(int i10) {
        this.f23076s.setMinWidth(i10);
    }

    public void setPaintTypeface(Typeface typeface) {
        this.f23076s.setPaintTypeface(typeface);
    }

    public void setProgress(int i10) {
        this.f23076s.setProgress(i10);
    }

    public void setProgressDrawable(Drawable drawable) {
        this.f23076s.setProgressDrawable(drawable);
    }

    public void setResetWidth(boolean z10) {
        this.f23081x = z10;
        this.f23076s.setResetWidth(z10);
    }

    public void setText(CharSequence charSequence) {
        boolean z10;
        ProgressButton progressButton = this.f23076s;
        if (AppStatus.PAUSE == getStatus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        progressButton.U = z10;
        progressButton.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.f23076s.setTextColor(i10);
    }

    public void setTextSize(float f) {
        this.f23076s.setTextSize(f);
    }

    public void setVisibilityInner(int i10) {
        this.f23076s.setVisibility(i10);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
