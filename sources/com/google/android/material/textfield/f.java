package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.n0;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class f extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f21156e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f21157g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f21158h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f21159i;

    /* renamed from: j, reason: collision with root package name */
    public final b7.a f21160j;

    /* renamed from: k, reason: collision with root package name */
    public final c f21161k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f21162l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f21163m;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.c] */
    public f(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f21160j = new b7.a(this, 1);
        this.f21161k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = f.this;
                fVar.t(fVar.u());
            }
        };
        this.f21156e = w6.a.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 100);
        this.f = w6.a.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        this.f21157g = w6.a.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, h6.a.f28768a);
        this.f21158h = w6.a.d(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, h6.a.f28771d);
    }

    @Override // com.google.android.material.textfield.n
    public final void a() {
        if (this.f21181b.H != null) {
            return;
        }
        t(u());
    }

    @Override // com.google.android.material.textfield.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnFocusChangeListener e() {
        return this.f21161k;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnClickListener f() {
        return this.f21160j;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnFocusChangeListener g() {
        return this.f21161k;
    }

    @Override // com.google.android.material.textfield.n
    public final void m(EditText editText) {
        this.f21159i = editText;
        this.f21180a.setEndIconVisible(u());
    }

    @Override // com.google.android.material.textfield.n
    public final void p(boolean z10) {
        if (this.f21181b.H == null) {
            return;
        }
        t(z10);
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f21158h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new a(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gl.Code, 1.0f);
        TimeInterpolator timeInterpolator = this.f21157g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f21156e;
        ofFloat2.setDuration(i10);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f fVar = f.this;
                fVar.getClass();
                fVar.f21183d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f21162l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f21162l.addListener(new d(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, gl.Code);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f fVar = f.this;
                fVar.getClass();
                fVar.f21183d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f21163m = ofFloat3;
        ofFloat3.addListener(new e(this));
    }

    @Override // com.google.android.material.textfield.n
    public final void s() {
        EditText editText = this.f21159i;
        if (editText != null) {
            editText.post(new n0(this, 9));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f21181b.c() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f21162l.isRunning()) {
            this.f21163m.cancel();
            this.f21162l.start();
            if (z11) {
                this.f21162l.end();
                return;
            }
            return;
        }
        if (!z10) {
            this.f21162l.cancel();
            this.f21163m.start();
            if (z11) {
                this.f21163m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f21159i;
        if (editText != null && ((editText.hasFocus() || this.f21183d.hasFocus()) && this.f21159i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
