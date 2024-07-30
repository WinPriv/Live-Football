package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.m0;
import com.google.android.material.internal.CheckableImageButton;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class StartCompoundLayout extends LinearLayout {
    public View.OnLongClickListener A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public final TextInputLayout f21105s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatTextView f21106t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f21107u;

    /* renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f21108v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f21109w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f21110x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView.ScaleType f21111z;

    public StartCompoundLayout(TextInputLayout textInputLayout, m0 m0Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f21105s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f21108v = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f21106t = appCompatTextView;
        if (z6.c.e(getContext())) {
            n0.g.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.A;
        checkableImageButton.setOnClickListener(null);
        o.d(checkableImageButton, onLongClickListener);
        this.A = null;
        checkableImageButton.setOnLongClickListener(null);
        o.d(checkableImageButton, null);
        if (m0Var.l(67)) {
            this.f21109w = z6.c.b(getContext(), m0Var, 67);
        }
        if (m0Var.l(68)) {
            this.f21110x = com.google.android.material.internal.n.f(m0Var.h(68, -1), null);
        }
        if (m0Var.l(64)) {
            a(m0Var.e(64));
            if (m0Var.l(63) && checkableImageButton.getContentDescription() != (k10 = m0Var.k(63))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(m0Var.a(62, true));
        }
        int d10 = m0Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.y) {
                this.y = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (m0Var.l(66)) {
                ImageView.ScaleType b10 = o.b(m0Var.h(66, -1));
                this.f21111z = b10;
                checkableImageButton.setScaleType(b10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.g.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(m0Var.i(58, 0));
            if (m0Var.l(59)) {
                appCompatTextView.setTextColor(m0Var.b(59));
            }
            CharSequence k11 = m0Var.k(57);
            this.f21107u = TextUtils.isEmpty(k11) ? null : k11;
            appCompatTextView.setText(k11);
            d();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f21108v;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f21109w;
            PorterDuff.Mode mode = this.f21110x;
            TextInputLayout textInputLayout = this.f21105s;
            o.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            o.c(textInputLayout, checkableImageButton, this.f21109w);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.A;
        checkableImageButton.setOnClickListener(null);
        o.d(checkableImageButton, onLongClickListener);
        this.A = null;
        checkableImageButton.setOnLongClickListener(null);
        o.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f21108v;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        boolean z10;
        EditText editText = this.f21105s.f21135v;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (this.f21108v.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            i10 = c0.e.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
        c0.e.k(this.f21106t, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.f21107u != null && !this.B) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f21108v.getVisibility() != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f21106t.setVisibility(i10);
        this.f21105s.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
