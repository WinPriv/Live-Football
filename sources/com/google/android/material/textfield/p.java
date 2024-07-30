package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes2.dex */
public final class p {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f21184a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21186c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f21187d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f21188e;
    public final TimeInterpolator f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f21189g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f21190h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f21191i;

    /* renamed from: j, reason: collision with root package name */
    public int f21192j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f21193k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f21194l;

    /* renamed from: m, reason: collision with root package name */
    public final float f21195m;

    /* renamed from: n, reason: collision with root package name */
    public int f21196n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f21197p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21198q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f21199r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f21200s;

    /* renamed from: t, reason: collision with root package name */
    public int f21201t;

    /* renamed from: u, reason: collision with root package name */
    public int f21202u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f21203v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f21204w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21205x;
    public AppCompatTextView y;

    /* renamed from: z, reason: collision with root package name */
    public int f21206z;

    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f21207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f21208b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f21209c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f21210d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f21207a = i10;
            this.f21208b = textView;
            this.f21209c = i11;
            this.f21210d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i10 = this.f21207a;
            p pVar = p.this;
            pVar.f21196n = i10;
            pVar.f21194l = null;
            TextView textView = this.f21208b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f21209c == 1 && (appCompatTextView = pVar.f21199r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f21210d;
            if (textView2 != null) {
                textView2.setTranslationY(gl.Code);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f21210d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(gl.Code);
            }
        }
    }

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f21189g = context;
        this.f21190h = textInputLayout;
        this.f21195m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f21184a = w6.a.c(context, R.attr.motionDurationShort4, 217);
        this.f21185b = w6.a.c(context, R.attr.motionDurationMedium4, 167);
        this.f21186c = w6.a.c(context, R.attr.motionDurationShort4, 167);
        this.f21187d = w6.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, h6.a.f28771d);
        LinearInterpolator linearInterpolator = h6.a.f28768a;
        this.f21188e = w6.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = w6.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        boolean z10;
        if (this.f21191i == null && this.f21193k == null) {
            Context context = this.f21189g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f21191i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f21191i;
            TextInputLayout textInputLayout = this.f21190h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f21193k = new FrameLayout(context);
            this.f21191i.addView(this.f21193k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f21193k.setVisibility(0);
            this.f21193k.addView(textView);
        } else {
            this.f21191i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21191i.setVisibility(0);
        this.f21192j++;
    }

    public final void b() {
        boolean z10;
        LinearLayout linearLayout = this.f21191i;
        TextInputLayout textInputLayout = this.f21190h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f21189g;
            boolean e10 = z6.c.e(context);
            LinearLayout linearLayout2 = this.f21191i;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            int f = c0.e.f(editText);
            if (e10) {
                f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (e10) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e11 = c0.e.e(editText);
            if (e10) {
                e11 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            c0.e.k(linearLayout2, f, dimensionPixelSize, e11, 0);
        }
    }

    public final void c() {
        Animator animator = this.f21194l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        float f;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z13;
        if (textView != null && z10) {
            if (i10 != i12 && i10 != i11) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i12 == i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f);
                int i14 = this.f21186c;
                if (z12) {
                    i13 = this.f21185b;
                } else {
                    i13 = i14;
                }
                ofFloat.setDuration(i13);
                if (z12) {
                    timeInterpolator = this.f21188e;
                } else {
                    timeInterpolator = this.f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    ofFloat.setStartDelay(i14);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f21195m, gl.Code);
                    ofFloat2.setDuration(this.f21184a);
                    ofFloat2.setInterpolator(this.f21187d);
                    ofFloat2.setStartDelay(i14);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.y;
        }
        return this.f21199r;
    }

    public final void f() {
        this.f21197p = null;
        c();
        if (this.f21196n == 1) {
            if (this.f21205x && !TextUtils.isEmpty(this.f21204w)) {
                this.o = 2;
            } else {
                this.o = 0;
            }
        }
        i(this.f21196n, this.o, h(this.f21199r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f21191i;
        if (linearLayout == null) {
            return;
        }
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        if (z10 && (frameLayout = this.f21193k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f21192j - 1;
        this.f21192j = i11;
        LinearLayout linearLayout2 = this.f21191i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        TextInputLayout textInputLayout = this.f21190h;
        if (c0.g.c(textInputLayout) && textInputLayout.isEnabled() && (this.o != this.f21196n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView e10;
        TextView e11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f21194l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f21205x, this.y, 2, i10, i11);
            d(arrayList, this.f21198q, this.f21199r, 1, i10, i11);
            a0.a.U0(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e11 = e(i11)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(4);
                if (i10 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f21196n = i11;
        }
        TextInputLayout textInputLayout = this.f21190h;
        textInputLayout.q();
        textInputLayout.t(z10, false);
        textInputLayout.w();
    }
}
