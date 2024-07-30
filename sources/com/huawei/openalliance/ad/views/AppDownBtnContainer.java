package com.huawei.openalliance.ad.views;

import android.annotation.SuppressLint;
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
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.views.ProgressButton;
import gb.r0;

/* loaded from: classes2.dex */
public abstract class AppDownBtnContainer extends RelativeLayout implements View.OnClickListener, ProgressButton.b {
    private ProgressButton B;
    private ImageView C;
    private boolean D;
    private int F;
    private boolean L;
    private RelativeLayout.LayoutParams S;
    protected s V;

    /* renamed from: a, reason: collision with root package name */
    private int f23624a;

    /* renamed from: b, reason: collision with root package name */
    private int f23625b;

    /* renamed from: c, reason: collision with root package name */
    private int f23626c;

    /* renamed from: d, reason: collision with root package name */
    private int f23627d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23628e;
    private boolean f;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ex.Code("AppDownBtnContainer", "post run");
            AppDownBtnContainer appDownBtnContainer = AppDownBtnContainer.this;
            appDownBtnContainer.V(appDownBtnContainer.getMeasuredHeight());
        }
    }

    public AppDownBtnContainer(Context context) {
        super(context);
        this.D = false;
        this.L = true;
        this.f23628e = false;
        this.f = false;
        Code(context, (AttributeSet) null);
    }

    private void I(int i10) {
        if (!this.L && this.f23626c > 0) {
            return;
        }
        int i11 = this.f23624a;
        if ((i11 > 0 && i10 > i11) || ((i11 = this.f23625b) > 0 && i10 < i11)) {
            this.f23626c = i11;
        } else {
            this.f23626c = i10;
        }
    }

    private void V() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f23627d;
            layoutParams.width = this.f23626c;
            setLayoutParams(layoutParams);
        }
        if (this.f23628e) {
            V(this.f23627d);
        }
    }

    private Drawable getCancelBtnDrawable() {
        s sVar = this.V;
        if (sVar == null) {
            return getContext().getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn);
        }
        return sVar.B;
    }

    @Override // com.huawei.openalliance.ad.views.ProgressButton.b
    public void Code(int i10, int i11) {
        ex.Code("AppDownBtnContainer", "on size reset: %s, %s", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        if (this.f) {
            this.f23626c = i10;
            this.f = false;
        } else {
            I(i10);
        }
        this.f23627d = i11;
        V();
    }

    public int getProgress() {
        return this.B.getProgress();
    }

    public Drawable getProgressDrawable() {
        return this.B.getProgressDrawable();
    }

    public Rect getPromptRect() {
        return this.B.getPromptRect();
    }

    public abstract da.n getStatus();

    public CharSequence getText() {
        return this.B.getText();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        ProgressButton progressButton = this.B;
        if (progressButton != null && this.D) {
            ViewGroup.LayoutParams layoutParams = progressButton.getLayoutParams();
            layoutParams.height = View.MeasureSpec.getSize(i11);
            layoutParams.width = View.MeasureSpec.getSize(i10);
            int i13 = this.f23627d;
            if (i13 > 0) {
                layoutParams.height = i13;
            }
            if (this.L && (i12 = this.f23626c) > 0) {
                layoutParams.width = i12;
            }
            int i14 = this.f23624a;
            if (i14 > 0 && layoutParams.width > i14) {
                layoutParams.width = i14;
            }
            int i15 = this.f23625b;
            if (i15 > 0 && layoutParams.width < i15) {
                layoutParams.width = i15;
            }
            if (layoutParams.width > 0 && layoutParams.height > 0) {
                this.B.setLayoutParams(layoutParams);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCancelBtnClickListener(View.OnClickListener onClickListener) {
        this.C.setOnClickListener(onClickListener);
    }

    public void setFixedWidth(boolean z10) {
        this.B.setFixedWidth(z10);
    }

    public void setFontFamily(String str) {
        this.B.setFontFamily(str);
    }

    public void setLayoutParamsSkipSizeReset(ViewGroup.LayoutParams layoutParams) {
        this.f = true;
        setLayoutParams(layoutParams);
    }

    public void setMax(int i10) {
        this.B.setMax(i10);
    }

    public void setMaxWidth(int i10) {
        this.B.setMaxWidth(i10);
    }

    public void setMinWidth(int i10) {
        this.B.setMinWidth(i10);
    }

    public void setPaintTypeface(Typeface typeface) {
        this.B.setPaintTypeface(typeface);
    }

    public void setProgress(int i10) {
        this.B.setProgress(i10);
    }

    public void setProgressDrawable(Drawable drawable) {
        this.B.setProgressDrawable(drawable);
    }

    public void setResetWidth(boolean z10) {
        this.L = z10;
        this.B.setResetWidth(z10);
    }

    public void setText(CharSequence charSequence) {
        ProgressButton progressButton = this.B;
        progressButton.U = Code(getStatus());
        progressButton.setText(charSequence);
    }

    public void setTextColor(int i10) {
        this.B.setTextColor(i10);
    }

    public void setTextSize(float f) {
        this.B.setTextSize(f);
    }

    public void setVisibilityInner(int i10) {
        this.B.setVisibility(i10);
    }

    public AppDownBtnContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = false;
        this.L = true;
        this.f23628e = false;
        this.f = false;
        Code(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        this.F = i10 < r0.i(getContext(), 40.0f) ? r0.i(getContext(), 12.0f) : r0.i(getContext(), 16.0f);
        ex.Code("AppDownBtnContainer", "btnHeight: %s, cancelBtnSize: %s", Integer.valueOf(i10), Integer.valueOf(this.F));
        RelativeLayout.LayoutParams layoutParams = this.S;
        layoutParams.height = i10;
        layoutParams.width = i10;
        layoutParams.setMarginEnd(0);
        int i11 = this.F;
        int i12 = (i10 - i11) / 2;
        if (i12 <= 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.S;
            layoutParams2.height = i11;
            layoutParams2.width = i11;
            layoutParams2.setMarginEnd(r0.i(getContext(), 12.0f));
            i12 = 0;
        }
        this.C.setPaddingRelative(i12, i12, i12, i12);
        try {
            if (this.C.getParent() != this) {
                addView(this.C, this.S);
            }
        } catch (Throwable th) {
            ex.I("AppDownBtnContainer", "add cancel btn ex: %s", th.getClass().getSimpleName());
        }
    }

    public void Code(int i10, int i11, int i12, int i13) {
        this.B.setPadding(i10, i11, i12, i13);
    }

    public AppDownBtnContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = false;
        this.L = true;
        this.f23628e = false;
        this.f = false;
        Code(context, attributeSet);
    }

    private void Code(Context context) {
        if (context == null) {
            return;
        }
        this.C = new ImageView(context);
        this.F = r0.i(context, 16.0f);
        this.C.setImageDrawable(context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.S = layoutParams;
        layoutParams.addRule(19, this.B.getId());
        this.S.addRule(15);
    }

    public void V(int i10, int i11, int i12, int i13) {
        this.B.setPaddingRelative(i10, i11, i12, i13);
    }

    @SuppressLint({"NewApi"})
    public AppDownBtnContainer(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.D = false;
        this.L = true;
        this.f23628e = false;
        this.f = false;
        Code(context, attributeSet);
    }

    private void Code(Context context, AttributeSet attributeSet) {
        V(context, attributeSet);
        ex.Code("AppDownBtnContainer", "init, create with attrs: %s", Boolean.valueOf(this.D));
        ProgressButton progressButton = new ProgressButton(context, attributeSet);
        this.B = progressButton;
        progressButton.setId(R.id.haid_down_btn_cancel_btn);
        setOnClickListener(this);
        this.B.setResetListener(this);
        this.B.setOnClickListener(this);
        addView(this.B);
        Code(context);
    }

    private void V(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        this.D = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.hiad_progress_button);
        try {
            this.L = obtainStyledAttributes.getBoolean(R.styleable.hiad_progress_button_hiad_resetWidth, true);
            this.f23624a = obtainStyledAttributes.getDimensionPixelSize(R.styleable.hiad_progress_button_hiad_maxWidth, 0);
            this.f23625b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.hiad_progress_button_hiad_minWidth, 0);
        } finally {
            try {
            } finally {
            }
        }
    }

    public void Code(Drawable drawable, int i10) {
        this.B.h(drawable, i10);
    }

    public void V(da.n nVar) {
        if (nVar == null) {
            return;
        }
        this.f23628e = Code(nVar);
        ex.Code("AppDownBtnContainer", "configCancelBtn, status: %s", nVar);
        if (this.f23628e) {
            this.C.setImageDrawable(getCancelBtnDrawable());
            int measuredHeight = getMeasuredHeight();
            if (measuredHeight <= 0) {
                post(new a());
                return;
            } else {
                V(measuredHeight);
                return;
            }
        }
        try {
            if (this.C.getParent() == this) {
                removeView(this.C);
            }
        } catch (Throwable th) {
            ex.I("AppDownBtnContainer", "remove cancel btn ex: %s", th.getClass().getSimpleName());
        }
    }

    public void Code(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.B.setOnClickListener(onClickListener);
    }

    public boolean Code() {
        ProgressButton progressButton = this.B;
        progressButton.getClass();
        if (System.currentTimeMillis() - progressButton.L < 500) {
            return true;
        }
        progressButton.L = System.currentTimeMillis();
        return false;
    }

    private static boolean Code(da.n nVar) {
        return da.n.PAUSE == nVar || da.n.WAITING_FOR_WIFI == nVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
