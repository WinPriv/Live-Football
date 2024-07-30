package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.x;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.h;
import com.huawei.hms.ads.gl;
import d0.a;
import d7.g;
import d7.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l0.f;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] S0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public ColorStateList A0;
    public final p B;
    public ColorStateList B0;
    public boolean C;
    public int C0;
    public int D;
    public int D0;
    public boolean E;
    public int E0;
    public f F;
    public ColorStateList F0;
    public AppCompatTextView G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public CharSequence J;
    public int J0;
    public boolean K;
    public int K0;
    public AppCompatTextView L;
    public boolean L0;
    public ColorStateList M;
    public final com.google.android.material.internal.c M0;
    public int N;
    public boolean N0;
    public androidx.transition.e O;
    public boolean O0;
    public androidx.transition.e P;
    public ValueAnimator P0;
    public ColorStateList Q;
    public boolean Q0;
    public ColorStateList R;
    public boolean R0;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public d7.g V;
    public d7.g W;

    /* renamed from: c0, reason: collision with root package name */
    public StateListDrawable f21113c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f21114d0;

    /* renamed from: e0, reason: collision with root package name */
    public d7.g f21115e0;

    /* renamed from: f0, reason: collision with root package name */
    public d7.g f21116f0;

    /* renamed from: g0, reason: collision with root package name */
    public d7.j f21117g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f21118h0;

    /* renamed from: i0, reason: collision with root package name */
    public final int f21119i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f21120j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f21121k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f21122l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f21123m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f21124n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f21125o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f21126p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Rect f21127q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Rect f21128r0;

    /* renamed from: s, reason: collision with root package name */
    public final FrameLayout f21129s;

    /* renamed from: s0, reason: collision with root package name */
    public final RectF f21130s0;

    /* renamed from: t, reason: collision with root package name */
    public final StartCompoundLayout f21131t;

    /* renamed from: t0, reason: collision with root package name */
    public Typeface f21132t0;

    /* renamed from: u, reason: collision with root package name */
    public final EndCompoundLayout f21133u;

    /* renamed from: u0, reason: collision with root package name */
    public ColorDrawable f21134u0;

    /* renamed from: v, reason: collision with root package name */
    public EditText f21135v;

    /* renamed from: v0, reason: collision with root package name */
    public int f21136v0;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f21137w;

    /* renamed from: w0, reason: collision with root package name */
    public final LinkedHashSet<g> f21138w0;

    /* renamed from: x, reason: collision with root package name */
    public int f21139x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorDrawable f21140x0;
    public int y;
    public int y0;

    /* renamed from: z, reason: collision with root package name */
    public int f21141z;

    /* renamed from: z0, reason: collision with root package name */
    public Drawable f21142z0;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public CharSequence f21143u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f21144v;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f21143u) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            TextUtils.writeToParcel(this.f21143u, parcel, i10);
            parcel.writeInt(this.f21144v ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21143u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f21144v = parcel.readInt() == 1;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f21133u.y;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f21135v.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.M0.l(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends n0.a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f21149d;

        public e(TextInputLayout textInputLayout) {
            this.f21149d = textInputLayout;
        }

        @Override // n0.a
        public final void d(View view, o0.g gVar) {
            CharSequence charSequence;
            boolean z10;
            String str;
            View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f21149d;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(charSequence);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !textInputLayout.L0;
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z12) {
                str = hint.toString();
            } else {
                str = "";
            }
            StartCompoundLayout startCompoundLayout = textInputLayout.f21131t;
            AppCompatTextView appCompatTextView = startCompoundLayout.f21106t;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(startCompoundLayout.f21108v);
            }
            if (z11) {
                gVar.j(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                gVar.j(str);
                if (z13 && placeholderText != null) {
                    gVar.j(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                gVar.j(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    gVar.h(str);
                } else {
                    if (z11) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    gVar.j(str);
                }
                boolean z15 = true ^ z11;
                if (i10 >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z15);
                } else {
                    gVar.f(4, z15);
                }
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z10) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.B.y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f21133u.b().n(gVar);
        }

        @Override // n0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f21149d.f21133u.b().o(accessibilityEvent);
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes2.dex */
    public interface h {
        void a();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, com.hamkho.livefoot.R.attr.textInputStyle, com.hamkho.livefoot.R.style.Widget_Design_TextInputLayout), attributeSet, com.hamkho.livefoot.R.attr.textInputStyle);
        this.f21139x = -1;
        this.y = -1;
        this.f21141z = -1;
        this.A = -1;
        this.B = new p(this);
        this.F = new e0.i();
        this.f21127q0 = new Rect();
        this.f21128r0 = new Rect();
        this.f21130s0 = new RectF();
        this.f21138w0 = new LinkedHashSet<>();
        com.google.android.material.internal.c cVar = new com.google.android.material.internal.c(this);
        this.M0 = cVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f21129s = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = h6.a.f28768a;
        cVar.Q = linearInterpolator;
        cVar.h(false);
        cVar.P = linearInterpolator;
        cVar.h(false);
        if (cVar.f20838g != 8388659) {
            cVar.f20838g = 8388659;
            cVar.h(false);
        }
        m0 e10 = com.google.android.material.internal.k.e(context2, attributeSet, androidx.activity.n.f518x0, com.hamkho.livefoot.R.attr.textInputStyle, com.hamkho.livefoot.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, e10);
        this.f21131t = startCompoundLayout;
        this.S = e10.a(46, true);
        setHint(e10.k(4));
        this.O0 = e10.a(45, true);
        this.N0 = e10.a(40, true);
        if (e10.l(6)) {
            setMinEms(e10.h(6, -1));
        } else if (e10.l(3)) {
            setMinWidth(e10.d(3, -1));
        }
        if (e10.l(5)) {
            setMaxEms(e10.h(5, -1));
        } else if (e10.l(2)) {
            setMaxWidth(e10.d(2, -1));
        }
        this.f21117g0 = new d7.j(d7.j.b(context2, attributeSet, com.hamkho.livefoot.R.attr.textInputStyle, com.hamkho.livefoot.R.style.Widget_Design_TextInputLayout));
        this.f21119i0 = context2.getResources().getDimensionPixelOffset(com.hamkho.livefoot.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f21121k0 = e10.c(9, 0);
        this.f21123m0 = e10.d(16, context2.getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f21124n0 = e10.d(17, context2.getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f21122l0 = this.f21123m0;
        TypedArray typedArray = e10.f1206b;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        d7.j jVar = this.f21117g0;
        jVar.getClass();
        j.a aVar = new j.a(jVar);
        if (dimension >= gl.Code) {
            aVar.f27446e = new d7.a(dimension);
        }
        if (dimension2 >= gl.Code) {
            aVar.f = new d7.a(dimension2);
        }
        if (dimension3 >= gl.Code) {
            aVar.f27447g = new d7.a(dimension3);
        }
        if (dimension4 >= gl.Code) {
            aVar.f27448h = new d7.a(dimension4);
        }
        this.f21117g0 = new d7.j(aVar);
        ColorStateList b10 = z6.c.b(context2, e10, 7);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.G0 = defaultColor;
            this.f21126p0 = defaultColor;
            if (b10.isStateful()) {
                this.H0 = b10.getColorForState(new int[]{-16842910}, -1);
                this.I0 = b10.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.J0 = b10.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.I0 = this.G0;
                ColorStateList b11 = d0.a.b(com.hamkho.livefoot.R.color.mtrl_filled_background_color, context2);
                this.H0 = b11.getColorForState(new int[]{-16842910}, -1);
                this.J0 = b11.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f21126p0 = 0;
            this.G0 = 0;
            this.H0 = 0;
            this.I0 = 0;
            this.J0 = 0;
        }
        if (e10.l(1)) {
            ColorStateList b12 = e10.b(1);
            this.B0 = b12;
            this.A0 = b12;
        }
        ColorStateList b13 = z6.c.b(context2, e10, 14);
        this.E0 = typedArray.getColor(14, 0);
        Object obj = d0.a.f27248a;
        this.C0 = a.d.a(context2, com.hamkho.livefoot.R.color.mtrl_textinput_default_box_stroke_color);
        this.K0 = a.d.a(context2, com.hamkho.livefoot.R.color.mtrl_textinput_disabled_color);
        this.D0 = a.d.a(context2, com.hamkho.livefoot.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b13 != null) {
            setBoxStrokeColorStateList(b13);
        }
        if (e10.l(15)) {
            setBoxStrokeErrorColor(z6.c.b(context2, e10, 15));
        }
        if (e10.i(47, -1) != -1) {
            setHintTextAppearance(e10.i(47, 0));
        }
        int i10 = e10.i(38, 0);
        CharSequence k10 = e10.k(33);
        int h10 = e10.h(32, 1);
        boolean a10 = e10.a(34, false);
        int i11 = e10.i(43, 0);
        boolean a11 = e10.a(42, false);
        CharSequence k11 = e10.k(41);
        int i12 = e10.i(55, 0);
        CharSequence k12 = e10.k(54);
        boolean a12 = e10.a(18, false);
        setCounterMaxLength(e10.h(19, -1));
        this.I = e10.i(22, 0);
        this.H = e10.i(20, 0);
        setBoxBackgroundMode(e10.h(8, 0));
        setErrorContentDescription(k10);
        setErrorAccessibilityLiveRegion(h10);
        setCounterOverflowTextAppearance(this.H);
        setHelperTextTextAppearance(i11);
        setErrorTextAppearance(i10);
        setCounterTextAppearance(this.I);
        setPlaceholderText(k12);
        setPlaceholderTextAppearance(i12);
        if (e10.l(39)) {
            setErrorTextColor(e10.b(39));
        }
        if (e10.l(44)) {
            setHelperTextColor(e10.b(44));
        }
        if (e10.l(48)) {
            setHintTextColor(e10.b(48));
        }
        if (e10.l(23)) {
            setCounterTextColor(e10.b(23));
        }
        if (e10.l(21)) {
            setCounterOverflowTextColor(e10.b(21));
        }
        if (e10.l(56)) {
            setPlaceholderTextColor(e10.b(56));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, e10);
        this.f21133u = endCompoundLayout;
        boolean a13 = e10.a(0, true);
        e10.n();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(this, 2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26 && i13 >= 26) {
            c0.l.l(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(a13);
        setHelperTextEnabled(a11);
        setErrorEnabled(a10);
        setCounterEnabled(a12);
        setHelperText(k11);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z10;
        int i10;
        EditText editText = this.f21135v;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int K0 = a0.a.K0(com.hamkho.livefoot.R.attr.colorControlHighlight, this.f21135v);
                int i11 = this.f21120j0;
                int[][] iArr = S0;
                if (i11 == 2) {
                    Context context = getContext();
                    d7.g gVar = this.V;
                    TypedValue c10 = z6.b.c(context, com.hamkho.livefoot.R.attr.colorSurface, "TextInputLayout");
                    int i12 = c10.resourceId;
                    if (i12 != 0) {
                        Object obj = d0.a.f27248a;
                        i10 = a.d.a(context, i12);
                    } else {
                        i10 = c10.data;
                    }
                    d7.g gVar2 = new d7.g(gVar.f27403s.f27411a);
                    int S02 = a0.a.S0(0.1f, K0, i10);
                    gVar2.k(new ColorStateList(iArr, new int[]{S02, 0}));
                    gVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{S02, i10});
                    d7.g gVar3 = new d7.g(gVar.f27403s.f27411a);
                    gVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
                }
                if (i11 == 1) {
                    d7.g gVar4 = this.V;
                    int i13 = this.f21126p0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{a0.a.S0(0.1f, K0, i13), i13}), gVar4, gVar4);
                }
                return null;
            }
        }
        return this.V;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f21113c0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f21113c0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f21113c0.addState(new int[0], f(false));
        }
        return this.f21113c0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.W == null) {
            this.W = f(true);
        }
        return this.W;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f21135v == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f21135v = editText;
            int i10 = this.f21139x;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f21141z);
            }
            int i11 = this.y;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.A);
            }
            this.f21114d0 = false;
            i();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f21135v.getTypeface();
            com.google.android.material.internal.c cVar = this.M0;
            boolean j10 = cVar.j(typeface);
            boolean k10 = cVar.k(typeface);
            if (j10 || k10) {
                cVar.h(false);
            }
            float textSize = this.f21135v.getTextSize();
            if (cVar.f20840h != textSize) {
                cVar.f20840h = textSize;
                cVar.h(false);
            }
            float letterSpacing = this.f21135v.getLetterSpacing();
            if (cVar.W != letterSpacing) {
                cVar.W = letterSpacing;
                cVar.h(false);
            }
            int gravity = this.f21135v.getGravity();
            int i12 = (gravity & (-113)) | 48;
            if (cVar.f20838g != i12) {
                cVar.f20838g = i12;
                cVar.h(false);
            }
            if (cVar.f != gravity) {
                cVar.f = gravity;
                cVar.h(false);
            }
            this.f21135v.addTextChangedListener(new a());
            if (this.A0 == null) {
                this.A0 = this.f21135v.getHintTextColors();
            }
            if (this.S) {
                if (TextUtils.isEmpty(this.T)) {
                    CharSequence hint = this.f21135v.getHint();
                    this.f21137w = hint;
                    setHint(hint);
                    this.f21135v.setHint((CharSequence) null);
                }
                this.U = true;
            }
            if (this.G != null) {
                n(this.f21135v.getText());
            }
            q();
            this.B.b();
            this.f21131t.bringToFront();
            EndCompoundLayout endCompoundLayout = this.f21133u;
            endCompoundLayout.bringToFront();
            Iterator<g> it = this.f21138w0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            endCompoundLayout.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.T)) {
            this.T = charSequence;
            com.google.android.material.internal.c cVar = this.M0;
            if (charSequence == null || !TextUtils.equals(cVar.A, charSequence)) {
                cVar.A = charSequence;
                cVar.B = null;
                Bitmap bitmap = cVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.E = null;
                }
                cVar.h(false);
            }
            if (!this.L0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.K == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.L;
            if (appCompatTextView != null) {
                this.f21129s.addView(appCompatTextView);
                this.L.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.L;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.L = null;
        }
        this.K = z10;
    }

    public final void a(float f10) {
        com.google.android.material.internal.c cVar = this.M0;
        if (cVar.f20829b == f10) {
            return;
        }
        if (this.P0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P0 = valueAnimator;
            valueAnimator.setInterpolator(w6.a.d(getContext(), com.hamkho.livefoot.R.attr.motionEasingEmphasizedInterpolator, h6.a.f28769b));
            this.P0.setDuration(w6.a.c(getContext(), com.hamkho.livefoot.R.attr.motionDurationMedium4, 167));
            this.P0.addUpdateListener(new d());
        }
        this.P0.setFloatValues(cVar.f20829b, f10);
        this.P0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f21129s;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            d7.g r0 = r7.V
            if (r0 != 0) goto L5
            return
        L5:
            d7.g$b r1 = r0.f27403s
            d7.j r1 = r1.f27411a
            d7.j r2 = r7.f21117g0
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.f21120j0
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.f21122l0
            if (r0 <= r2) goto L22
            int r0 = r7.f21125o0
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            d7.g r0 = r7.V
            int r1 = r7.f21122l0
            float r1 = (float) r1
            int r5 = r7.f21125o0
            d7.g$b r6 = r0.f27403s
            r6.f27420k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            d7.g$b r5 = r0.f27403s
            android.content.res.ColorStateList r6 = r5.f27414d
            if (r6 == r1) goto L4b
            r5.f27414d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.f21126p0
            int r1 = r7.f21120j0
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130968895(0x7f04013f, float:1.7546457E38)
            int r0 = a0.a.L0(r0, r1, r3)
            int r1 = r7.f21126p0
            int r0 = f0.a.b(r1, r0)
        L62:
            r7.f21126p0 = r0
            d7.g r1 = r7.V
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r0)
            d7.g r0 = r7.f21115e0
            if (r0 == 0) goto La7
            d7.g r1 = r7.f21116f0
            if (r1 != 0) goto L76
            goto La7
        L76:
            int r1 = r7.f21122l0
            if (r1 <= r2) goto L7f
            int r1 = r7.f21125o0
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La4
            android.widget.EditText r1 = r7.f21135v
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L90
            int r1 = r7.C0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L96
        L90:
            int r1 = r7.f21125o0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L96:
            r0.k(r1)
            d7.g r0 = r7.f21116f0
            int r1 = r7.f21125o0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
        La4:
            r7.invalidate()
        La7:
            r7.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d10;
        if (!this.S) {
            return 0;
        }
        int i10 = this.f21120j0;
        com.google.android.material.internal.c cVar = this.M0;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            d10 = cVar.d() / 2.0f;
        } else {
            d10 = cVar.d();
        }
        return (int) d10;
    }

    public final androidx.transition.e d() {
        androidx.transition.e eVar = new androidx.transition.e();
        eVar.f2465u = w6.a.c(getContext(), com.hamkho.livefoot.R.attr.motionDurationShort2, 87);
        eVar.f2466v = w6.a.d(getContext(), com.hamkho.livefoot.R.attr.motionEasingLinearInterpolator, h6.a.f28768a);
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f21135v;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f21137w != null) {
            boolean z10 = this.U;
            this.U = false;
            CharSequence hint = editText.getHint();
            this.f21135v.setHint(this.f21137w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f21135v.setHint(hint);
                this.U = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f21129s;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f21135v) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.R0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.R0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        d7.g gVar;
        super.draw(canvas);
        boolean z10 = this.S;
        com.google.android.material.internal.c cVar = this.M0;
        if (z10) {
            cVar.getClass();
            int save = canvas.save();
            if (cVar.B != null) {
                RectF rectF = cVar.f20835e;
                if (rectF.width() > gl.Code && rectF.height() > gl.Code) {
                    TextPaint textPaint = cVar.N;
                    textPaint.setTextSize(cVar.G);
                    float f10 = cVar.f20847p;
                    float f11 = cVar.f20848q;
                    float f12 = cVar.F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    boolean z11 = true;
                    if (cVar.f20834d0 <= 1 || cVar.C) {
                        z11 = false;
                    }
                    if (z11) {
                        float lineStart = cVar.f20847p - cVar.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (cVar.f20830b0 * f13));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, a0.a.C0(cVar.K, textPaint.getAlpha()));
                        }
                        cVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (cVar.f20828a0 * f13));
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, a0.a.C0(cVar.K, textPaint.getAlpha()));
                        }
                        int lineBaseline = cVar.Y.getLineBaseline(0);
                        CharSequence charSequence = cVar.f20832c0;
                        float f14 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), gl.Code, f14, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                        }
                        String trim = cVar.f20832c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(cVar.Y.getLineEnd(0), str.length()), gl.Code, f14, (Paint) textPaint);
                    } else {
                        canvas.translate(f10, f11);
                        cVar.Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f21116f0 != null && (gVar = this.f21115e0) != null) {
            gVar.draw(canvas);
            if (this.f21135v.isFocused()) {
                Rect bounds = this.f21116f0.getBounds();
                Rect bounds2 = this.f21115e0.getBounds();
                float f15 = cVar.f20829b;
                int centerX = bounds2.centerX();
                bounds.left = h6.a.b(f15, centerX, bounds2.left);
                bounds.right = h6.a.b(f15, centerX, bounds2.right);
                this.f21116f0.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        boolean z11;
        boolean z12;
        if (this.Q0) {
            return;
        }
        boolean z13 = true;
        this.Q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.c cVar = this.M0;
        if (cVar != null) {
            cVar.L = drawableState;
            ColorStateList colorStateList2 = cVar.f20843k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cVar.f20842j) != null && colorStateList.isStateful())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                cVar.h(false);
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = z12 | false;
        } else {
            z10 = false;
        }
        if (this.f21135v != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (!c0.g.c(this) || !isEnabled()) {
                z13 = false;
            }
            t(z13, false);
        }
        q();
        w();
        if (z10) {
            invalidate();
        }
        this.Q0 = false;
    }

    public final boolean e() {
        if (this.S && !TextUtils.isEmpty(this.T) && (this.V instanceof com.google.android.material.textfield.h)) {
            return true;
        }
        return false;
    }

    public final d7.g f(boolean z10) {
        float f10;
        float dimensionPixelOffset;
        int i10;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.hamkho.livefoot.R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = gl.Code;
        }
        EditText editText = this.f21135v;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.hamkho.livefoot.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.hamkho.livefoot.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        j.a aVar = new j.a();
        aVar.f27446e = new d7.a(f10);
        aVar.f = new d7.a(f10);
        aVar.f27448h = new d7.a(dimensionPixelOffset2);
        aVar.f27447g = new d7.a(dimensionPixelOffset2);
        d7.j jVar = new d7.j(aVar);
        Context context = getContext();
        Paint paint = d7.g.O;
        TypedValue c10 = z6.b.c(context, com.hamkho.livefoot.R.attr.colorSurface, d7.g.class.getSimpleName());
        int i11 = c10.resourceId;
        if (i11 != 0) {
            Object obj = d0.a.f27248a;
            i10 = a.d.a(context, i11);
        } else {
            i10 = c10.data;
        }
        d7.g gVar = new d7.g();
        gVar.i(context);
        gVar.k(ColorStateList.valueOf(i10));
        gVar.j(dimensionPixelOffset);
        gVar.setShapeAppearanceModel(jVar);
        g.b bVar = gVar.f27403s;
        if (bVar.f27417h == null) {
            bVar.f27417h = new Rect();
        }
        gVar.f27403s.f27417h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft = this.f21135v.getCompoundPaddingLeft() + i10;
        if (getPrefixText() != null && !z10) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f21135v;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public d7.g getBoxBackground() {
        int i10 = this.f21120j0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.V;
    }

    public int getBoxBackgroundColor() {
        return this.f21126p0;
    }

    public int getBoxBackgroundMode() {
        return this.f21120j0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f21121k0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e10 = com.google.android.material.internal.n.e(this);
        RectF rectF = this.f21130s0;
        if (e10) {
            return this.f21117g0.f27437h.a(rectF);
        }
        return this.f21117g0.f27436g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e10 = com.google.android.material.internal.n.e(this);
        RectF rectF = this.f21130s0;
        if (e10) {
            return this.f21117g0.f27436g.a(rectF);
        }
        return this.f21117g0.f27437h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e10 = com.google.android.material.internal.n.e(this);
        RectF rectF = this.f21130s0;
        if (e10) {
            return this.f21117g0.f27435e.a(rectF);
        }
        return this.f21117g0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e10 = com.google.android.material.internal.n.e(this);
        RectF rectF = this.f21130s0;
        if (e10) {
            return this.f21117g0.f.a(rectF);
        }
        return this.f21117g0.f27435e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.F0;
    }

    public int getBoxStrokeWidth() {
        return this.f21123m0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f21124n0;
    }

    public int getCounterMaxLength() {
        return this.D;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.C && this.E && (appCompatTextView = this.G) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.R;
    }

    public ColorStateList getCounterTextColor() {
        return this.Q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0;
    }

    public EditText getEditText() {
        return this.f21135v;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f21133u.y.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f21133u.y.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f21133u.E;
    }

    public int getEndIconMode() {
        return this.f21133u.A;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f21133u.F;
    }

    public CheckableImageButton getEndIconView() {
        return this.f21133u.y;
    }

    public CharSequence getError() {
        p pVar = this.B;
        if (pVar.f21198q) {
            return pVar.f21197p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.B.f21201t;
    }

    public CharSequence getErrorContentDescription() {
        return this.B.f21200s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.B.f21199r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f21133u.f21087u.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.B;
        if (pVar.f21205x) {
            return pVar.f21204w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.B.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.S) {
            return this.T;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.M0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.c cVar = this.M0;
        return cVar.e(cVar.f20843k);
    }

    public ColorStateList getHintTextColor() {
        return this.B0;
    }

    public f getLengthCounter() {
        return this.F;
    }

    public int getMaxEms() {
        return this.y;
    }

    public int getMaxWidth() {
        return this.A;
    }

    public int getMinEms() {
        return this.f21139x;
    }

    public int getMinWidth() {
        return this.f21141z;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f21133u.y.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f21133u.y.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.K) {
            return this.J;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.N;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.M;
    }

    public CharSequence getPrefixText() {
        return this.f21131t.f21107u;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f21131t.f21106t.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f21131t.f21106t;
    }

    public d7.j getShapeAppearanceModel() {
        return this.f21117g0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f21131t.f21108v.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f21131t.f21108v.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f21131t.y;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f21131t.f21111z;
    }

    public CharSequence getSuffixText() {
        return this.f21133u.H;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f21133u.I.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f21133u.I;
    }

    public Typeface getTypeface() {
        return this.f21132t0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f21135v.getCompoundPaddingRight();
        if (getPrefixText() != null && z10) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    public final void i() {
        boolean z10;
        int i10 = this.f21120j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.S && !(this.V instanceof com.google.android.material.textfield.h)) {
                        d7.j jVar = this.f21117g0;
                        int i11 = com.google.android.material.textfield.h.Q;
                        this.V = new h.a(jVar);
                    } else {
                        this.V = new d7.g(this.f21117g0);
                    }
                    this.f21115e0 = null;
                    this.f21116f0 = null;
                } else {
                    throw new IllegalArgumentException(com.ironsource.adapters.facebook.a.i(new StringBuilder(), this.f21120j0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.V = new d7.g(this.f21117g0);
                this.f21115e0 = new d7.g();
                this.f21116f0 = new d7.g();
            }
        } else {
            this.V = null;
            this.f21115e0 = null;
            this.f21116f0 = null;
        }
        r();
        w();
        boolean z11 = false;
        if (this.f21120j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f21121k0 = getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (z6.c.e(getContext())) {
                this.f21121k0 = getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f21135v != null && this.f21120j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z11 = true;
            }
            if (z11) {
                EditText editText = this.f21135v;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.e.k(editText, c0.e.f(editText), getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.material_filled_edittext_font_2_0_padding_top), c0.e.e(this.f21135v), getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (z6.c.e(getContext())) {
                EditText editText2 = this.f21135v;
                WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
                c0.e.k(editText2, c0.e.f(editText2), getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.material_filled_edittext_font_1_3_padding_top), c0.e.e(this.f21135v), getResources().getDimensionPixelSize(com.hamkho.livefoot.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f21120j0 != 0) {
            s();
        }
        EditText editText3 = this.f21135v;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f21120j0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (!e()) {
            return;
        }
        int width = this.f21135v.getWidth();
        int gravity = this.f21135v.getGravity();
        com.google.android.material.internal.c cVar = this.M0;
        boolean b10 = cVar.b(cVar.A);
        cVar.C = b10;
        Rect rect = cVar.f20833d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b10) {
                    f10 = rect.right;
                    f11 = cVar.Z;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
            } else if (b10) {
                i11 = rect.left;
                f12 = i11;
            } else {
                f10 = rect.right;
                f11 = cVar.Z;
            }
            float max = Math.max(f12, rect.left);
            rectF = this.f21130s0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (cVar.C) {
                        i10 = rect.right;
                        f13 = i10;
                    } else {
                        f13 = cVar.Z + max;
                    }
                } else if (cVar.C) {
                    f13 = cVar.Z + max;
                } else {
                    i10 = rect.right;
                    f13 = i10;
                }
            } else {
                f13 = (width / 2.0f) + (cVar.Z / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = cVar.d() + rect.top;
            if (rectF.width() <= gl.Code && rectF.height() > gl.Code) {
                float f14 = rectF.left;
                float f15 = this.f21119i0;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f21122l0);
                com.google.android.material.textfield.h hVar = (com.google.android.material.textfield.h) this.V;
                hVar.getClass();
                hVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f10 = width / 2.0f;
        f11 = cVar.Z / 2.0f;
        f12 = f10 - f11;
        float max2 = Math.max(f12, rect.left);
        rectF = this.f21130s0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f13 = (width / 2.0f) + (cVar.Z / 2.0f);
        rectF.right = Math.min(f13, rect.right);
        rectF.bottom = cVar.d() + rect.top;
        if (rectF.width() <= gl.Code) {
        }
    }

    public final void l(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(2132017675);
            Context context = getContext();
            Object obj = d0.a.f27248a;
            textView.setTextColor(a.d.a(context, com.hamkho.livefoot.R.color.design_error));
        }
    }

    public final boolean m() {
        p pVar = this.B;
        if (pVar.o == 1 && pVar.f21199r != null && !TextUtils.isEmpty(pVar.f21197p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        l0.a aVar;
        ((e0.i) this.F).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z12 = this.E;
        int i12 = this.D;
        String str = null;
        if (i12 == -1) {
            this.G.setText(String.valueOf(i10));
            this.G.setContentDescription(null);
            this.E = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.E = z10;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.G;
            int i13 = this.D;
            if (this.E) {
                i11 = com.hamkho.livefoot.R.string.character_counter_overflowed_content_description;
            } else {
                i11 = com.hamkho.livefoot.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z12 != this.E) {
                o();
            }
            String str2 = l0.a.f32289d;
            Locale locale = Locale.getDefault();
            int i14 = l0.f.f32311a;
            if (f.a.a(locale) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar = l0.a.f32291g;
            } else {
                aVar = l0.a.f;
            }
            AppCompatTextView appCompatTextView2 = this.G;
            String string = getContext().getString(com.hamkho.livefoot.R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.D));
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.f32294c).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f21135v != null && z12 != this.E) {
            t(false, false);
            w();
            q();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.G;
        if (appCompatTextView != null) {
            if (this.E) {
                i10 = this.H;
            } else {
                i10 = this.I;
            }
            l(appCompatTextView, i10);
            if (!this.E && (colorStateList2 = this.Q) != null) {
                this.G.setTextColor(colorStateList2);
            }
            if (this.E && (colorStateList = this.R) != null) {
                this.G.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.M0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        int compoundPaddingTop;
        boolean z13;
        int compoundPaddingBottom;
        boolean z14;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f21135v;
        if (editText != null) {
            Rect rect = this.f21127q0;
            com.google.android.material.internal.d.a(this, editText, rect);
            d7.g gVar = this.f21115e0;
            if (gVar != null) {
                int i14 = rect.bottom;
                gVar.setBounds(rect.left, i14 - this.f21123m0, rect.right, i14);
            }
            d7.g gVar2 = this.f21116f0;
            if (gVar2 != null) {
                int i15 = rect.bottom;
                gVar2.setBounds(rect.left, i15 - this.f21124n0, rect.right, i15);
            }
            if (this.S) {
                float textSize = this.f21135v.getTextSize();
                com.google.android.material.internal.c cVar = this.M0;
                if (cVar.f20840h != textSize) {
                    cVar.f20840h = textSize;
                    cVar.h(false);
                }
                int gravity = this.f21135v.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (cVar.f20838g != i16) {
                    cVar.f20838g = i16;
                    cVar.h(false);
                }
                if (cVar.f != gravity) {
                    cVar.f = gravity;
                    cVar.h(false);
                }
                if (this.f21135v != null) {
                    boolean e10 = com.google.android.material.internal.n.e(this);
                    int i17 = rect.bottom;
                    Rect rect2 = this.f21128r0;
                    rect2.bottom = i17;
                    int i18 = this.f21120j0;
                    if (i18 != 1) {
                        if (i18 != 2) {
                            rect2.left = g(rect.left, e10);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, e10);
                        } else {
                            rect2.left = this.f21135v.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f21135v.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, e10);
                        rect2.top = rect.top + this.f21121k0;
                        rect2.right = h(rect.right, e10);
                    }
                    int i19 = rect2.left;
                    int i20 = rect2.top;
                    int i21 = rect2.right;
                    int i22 = rect2.bottom;
                    Rect rect3 = cVar.f20833d;
                    if (rect3.left == i19 && rect3.top == i20 && rect3.right == i21 && rect3.bottom == i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        rect3.set(i19, i20, i21, i22);
                        cVar.M = true;
                    }
                    if (this.f21135v != null) {
                        TextPaint textPaint = cVar.O;
                        textPaint.setTextSize(cVar.f20840h);
                        textPaint.setTypeface(cVar.f20852u);
                        textPaint.setLetterSpacing(cVar.W);
                        float f10 = -textPaint.ascent();
                        rect2.left = this.f21135v.getCompoundPaddingLeft() + rect.left;
                        if (this.f21120j0 == 1 && this.f21135v.getMinLines() <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            compoundPaddingTop = (int) (rect.centerY() - (f10 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f21135v.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f21135v.getCompoundPaddingRight();
                        if (this.f21120j0 == 1 && this.f21135v.getMinLines() <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            compoundPaddingBottom = (int) (rect2.top + f10);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f21135v.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i23 = rect2.left;
                        int i24 = rect2.top;
                        int i25 = rect2.right;
                        Rect rect4 = cVar.f20831c;
                        if (rect4.left == i23 && rect4.top == i24 && rect4.right == i25 && rect4.bottom == compoundPaddingBottom) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            rect4.set(i23, i24, i25, compoundPaddingBottom);
                            cVar.M = true;
                        }
                        cVar.h(false);
                        if (e() && !this.L0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f21135v;
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (editText2 != null && this.f21135v.getMeasuredHeight() < (max = Math.max(endCompoundLayout.getMeasuredHeight(), this.f21131t.getMeasuredHeight()))) {
            this.f21135v.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean p10 = p();
        if (z10 || p10) {
            this.f21135v.post(new c());
        }
        if (this.L != null && (editText = this.f21135v) != null) {
            this.L.setGravity(editText.getGravity());
            this.L.setPadding(this.f21135v.getCompoundPaddingLeft(), this.f21135v.getCompoundPaddingTop(), this.f21135v.getCompoundPaddingRight(), this.f21135v.getCompoundPaddingBottom());
        }
        endCompoundLayout.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        setError(savedState.f21143u);
        if (savedState.f21144v) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f21118h0) {
            d7.c cVar = this.f21117g0.f27435e;
            RectF rectF = this.f21130s0;
            float a10 = cVar.a(rectF);
            float a11 = this.f21117g0.f.a(rectF);
            float a12 = this.f21117g0.f27437h.a(rectF);
            float a13 = this.f21117g0.f27436g.a(rectF);
            d7.j jVar = this.f21117g0;
            androidx.activity.n nVar = jVar.f27431a;
            j.a aVar = new j.a();
            androidx.activity.n nVar2 = jVar.f27432b;
            aVar.f27442a = nVar2;
            float b10 = j.a.b(nVar2);
            if (b10 != -1.0f) {
                aVar.f27446e = new d7.a(b10);
            }
            aVar.f27443b = nVar;
            float b11 = j.a.b(nVar);
            if (b11 != -1.0f) {
                aVar.f = new d7.a(b11);
            }
            androidx.activity.n nVar3 = jVar.f27433c;
            aVar.f27445d = nVar3;
            float b12 = j.a.b(nVar3);
            if (b12 != -1.0f) {
                aVar.f27448h = new d7.a(b12);
            }
            androidx.activity.n nVar4 = jVar.f27434d;
            aVar.f27444c = nVar4;
            float b13 = j.a.b(nVar4);
            if (b13 != -1.0f) {
                aVar.f27447g = new d7.a(b13);
            }
            aVar.f27446e = new d7.a(a11);
            aVar.f = new d7.a(a10);
            aVar.f27448h = new d7.a(a13);
            aVar.f27447g = new d7.a(a12);
            d7.j jVar2 = new d7.j(aVar);
            this.f21118h0 = z10;
            setShapeAppearanceModel(jVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.f21143u = getError();
        }
        EndCompoundLayout endCompoundLayout = this.f21133u;
        boolean z11 = true;
        if (endCompoundLayout.A != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !endCompoundLayout.y.isChecked()) {
            z11 = false;
        }
        savedState.f21144v = z11;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r3.c() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r3.H != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f21135v;
        if (editText == null || this.f21120j0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = x.f1275a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(androidx.appcompat.widget.f.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.E && (appCompatTextView = this.G) != null) {
            mutate.setColorFilter(androidx.appcompat.widget.f.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f21135v.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f21135v;
        if (editText != null && this.V != null) {
            if ((this.f21114d0 || editText.getBackground() == null) && this.f21120j0 != 0) {
                EditText editText2 = this.f21135v;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.d.q(editText2, editTextBoxBackground);
                this.f21114d0 = true;
            }
        }
    }

    public final void s() {
        if (this.f21120j0 != 1) {
            FrameLayout frameLayout = this.f21129s;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f21126p0 != i10) {
            this.f21126p0 = i10;
            this.G0 = i10;
            this.I0 = i10;
            this.J0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setBoxBackgroundColor(a.d.a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.G0 = defaultColor;
        this.f21126p0 = defaultColor;
        this.H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.I0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f21120j0) {
            return;
        }
        this.f21120j0 = i10;
        if (this.f21135v != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f21121k0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        d7.j jVar = this.f21117g0;
        jVar.getClass();
        j.a aVar = new j.a(jVar);
        d7.c cVar = this.f21117g0.f27435e;
        androidx.activity.n p02 = androidx.activity.n.p0(i10);
        aVar.f27442a = p02;
        float b10 = j.a.b(p02);
        if (b10 != -1.0f) {
            aVar.f27446e = new d7.a(b10);
        }
        aVar.f27446e = cVar;
        d7.c cVar2 = this.f21117g0.f;
        androidx.activity.n p03 = androidx.activity.n.p0(i10);
        aVar.f27443b = p03;
        float b11 = j.a.b(p03);
        if (b11 != -1.0f) {
            aVar.f = new d7.a(b11);
        }
        aVar.f = cVar2;
        d7.c cVar3 = this.f21117g0.f27437h;
        androidx.activity.n p04 = androidx.activity.n.p0(i10);
        aVar.f27445d = p04;
        float b12 = j.a.b(p04);
        if (b12 != -1.0f) {
            aVar.f27448h = new d7.a(b12);
        }
        aVar.f27448h = cVar3;
        d7.c cVar4 = this.f21117g0.f27436g;
        androidx.activity.n p05 = androidx.activity.n.p0(i10);
        aVar.f27444c = p05;
        float b13 = j.a.b(p05);
        if (b13 != -1.0f) {
            aVar.f27447g = new d7.a(b13);
        }
        aVar.f27447g = cVar4;
        this.f21117g0 = new d7.j(aVar);
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.C0 = colorStateList.getDefaultColor();
            this.K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.D0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.E0 != colorStateList.getDefaultColor()) {
            this.E0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f21123m0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f21124n0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.C != z10) {
            Editable editable = null;
            p pVar = this.B;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.G = appCompatTextView;
                appCompatTextView.setId(com.hamkho.livefoot.R.id.textinput_counter);
                Typeface typeface = this.f21132t0;
                if (typeface != null) {
                    this.G.setTypeface(typeface);
                }
                this.G.setMaxLines(1);
                pVar.a(this.G, 2);
                n0.g.h((ViewGroup.MarginLayoutParams) this.G.getLayoutParams(), getResources().getDimensionPixelOffset(com.hamkho.livefoot.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.G != null) {
                    EditText editText = this.f21135v;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                pVar.g(this.G, 2);
                this.G = null;
            }
            this.C = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.D != i10) {
            if (i10 > 0) {
                this.D = i10;
            } else {
                this.D = -1;
            }
            if (this.C && this.G != null) {
                EditText editText = this.f21135v;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.H != i10) {
            this.H = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.I != i10) {
            this.I = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.B0 = colorStateList;
        if (this.f21135v != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f21133u.y.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f21133u.y.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        CharSequence text = i10 != 0 ? endCompoundLayout.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = endCompoundLayout.y;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        Drawable a10 = i10 != 0 ? g.a.a(endCompoundLayout.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = endCompoundLayout.y;
        checkableImageButton.setImageDrawable(a10);
        if (a10 != null) {
            ColorStateList colorStateList = endCompoundLayout.C;
            PorterDuff.Mode mode = endCompoundLayout.D;
            TextInputLayout textInputLayout = endCompoundLayout.f21085s;
            o.a(textInputLayout, checkableImageButton, colorStateList, mode);
            o.c(textInputLayout, checkableImageButton, endCompoundLayout.C);
        }
    }

    public void setEndIconMinSize(int i10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (i10 >= 0) {
            if (i10 != endCompoundLayout.E) {
                endCompoundLayout.E = i10;
                CheckableImageButton checkableImageButton = endCompoundLayout.y;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = endCompoundLayout.f21087u;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        endCompoundLayout.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.f21133u.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.G;
        CheckableImageButton checkableImageButton = endCompoundLayout.y;
        checkableImageButton.setOnClickListener(onClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.G = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.y;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.F = scaleType;
        endCompoundLayout.y.setScaleType(scaleType);
        endCompoundLayout.f21087u.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (endCompoundLayout.C != colorStateList) {
            endCompoundLayout.C = colorStateList;
            o.a(endCompoundLayout.f21085s, endCompoundLayout.y, colorStateList, endCompoundLayout.D);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (endCompoundLayout.D != mode) {
            endCompoundLayout.D = mode;
            o.a(endCompoundLayout.f21085s, endCompoundLayout.y, endCompoundLayout.C, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f21133u.g(z10);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.B;
        if (!pVar.f21198q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            pVar.c();
            pVar.f21197p = charSequence;
            pVar.f21199r.setText(charSequence);
            int i10 = pVar.f21196n;
            if (i10 != 1) {
                pVar.o = 1;
            }
            pVar.i(i10, pVar.o, pVar.h(pVar.f21199r, charSequence));
            return;
        }
        pVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        p pVar = this.B;
        pVar.f21201t = i10;
        AppCompatTextView appCompatTextView = pVar.f21199r;
        if (appCompatTextView != null) {
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.g.f(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.B;
        pVar.f21200s = charSequence;
        AppCompatTextView appCompatTextView = pVar.f21199r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        p pVar = this.B;
        if (pVar.f21198q != z10) {
            pVar.c();
            TextInputLayout textInputLayout = pVar.f21190h;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f21189g, null);
                pVar.f21199r = appCompatTextView;
                appCompatTextView.setId(com.hamkho.livefoot.R.id.textinput_error);
                pVar.f21199r.setTextAlignment(5);
                Typeface typeface = pVar.B;
                if (typeface != null) {
                    pVar.f21199r.setTypeface(typeface);
                }
                int i10 = pVar.f21202u;
                pVar.f21202u = i10;
                AppCompatTextView appCompatTextView2 = pVar.f21199r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i10);
                }
                ColorStateList colorStateList = pVar.f21203v;
                pVar.f21203v = colorStateList;
                AppCompatTextView appCompatTextView3 = pVar.f21199r;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = pVar.f21200s;
                pVar.f21200s = charSequence;
                AppCompatTextView appCompatTextView4 = pVar.f21199r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i11 = pVar.f21201t;
                pVar.f21201t = i11;
                AppCompatTextView appCompatTextView5 = pVar.f21199r;
                if (appCompatTextView5 != null) {
                    WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                    c0.g.f(appCompatTextView5, i11);
                }
                pVar.f21199r.setVisibility(4);
                pVar.a(pVar.f21199r, 0);
            } else {
                pVar.f();
                pVar.g(pVar.f21199r, 0);
                pVar.f21199r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            pVar.f21198q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.h(i10 != 0 ? g.a.a(endCompoundLayout.getContext(), i10) : null);
        o.c(endCompoundLayout.f21085s, endCompoundLayout.f21087u, endCompoundLayout.f21088v);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        CheckableImageButton checkableImageButton = endCompoundLayout.f21087u;
        View.OnLongClickListener onLongClickListener = endCompoundLayout.f21090x;
        checkableImageButton.setOnClickListener(onClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.f21090x = onLongClickListener;
        CheckableImageButton checkableImageButton = endCompoundLayout.f21087u;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (endCompoundLayout.f21088v != colorStateList) {
            endCompoundLayout.f21088v = colorStateList;
            o.a(endCompoundLayout.f21085s, endCompoundLayout.f21087u, colorStateList, endCompoundLayout.f21089w);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (endCompoundLayout.f21089w != mode) {
            endCompoundLayout.f21089w = mode;
            o.a(endCompoundLayout.f21085s, endCompoundLayout.f21087u, endCompoundLayout.f21088v, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        p pVar = this.B;
        pVar.f21202u = i10;
        AppCompatTextView appCompatTextView = pVar.f21199r;
        if (appCompatTextView != null) {
            pVar.f21190h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.B;
        pVar.f21203v = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f21199r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.N0 != z10) {
            this.N0 = z10;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.B;
        if (isEmpty) {
            if (pVar.f21205x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f21205x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f21204w = charSequence;
        pVar.y.setText(charSequence);
        int i10 = pVar.f21196n;
        if (i10 != 2) {
            pVar.o = 2;
        }
        pVar.i(i10, pVar.o, pVar.h(pVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.B;
        pVar.A = colorStateList;
        AppCompatTextView appCompatTextView = pVar.y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        p pVar = this.B;
        if (pVar.f21205x != z10) {
            pVar.c();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f21189g, null);
                pVar.y = appCompatTextView;
                appCompatTextView.setId(com.hamkho.livefoot.R.id.textinput_helper_text);
                pVar.y.setTextAlignment(5);
                Typeface typeface = pVar.B;
                if (typeface != null) {
                    pVar.y.setTypeface(typeface);
                }
                pVar.y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = pVar.y;
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.g.f(appCompatTextView2, 1);
                int i10 = pVar.f21206z;
                pVar.f21206z = i10;
                AppCompatTextView appCompatTextView3 = pVar.y;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i10);
                }
                ColorStateList colorStateList = pVar.A;
                pVar.A = colorStateList;
                AppCompatTextView appCompatTextView4 = pVar.y;
                if (appCompatTextView4 != null && colorStateList != null) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                pVar.a(pVar.y, 1);
                pVar.y.setAccessibilityDelegate(new q(pVar));
            } else {
                pVar.c();
                int i11 = pVar.f21196n;
                if (i11 == 2) {
                    pVar.o = 0;
                }
                pVar.i(i11, pVar.o, pVar.h(pVar.y, ""));
                pVar.g(pVar.y, 1);
                pVar.y = null;
                TextInputLayout textInputLayout = pVar.f21190h;
                textInputLayout.q();
                textInputLayout.w();
            }
            pVar.f21205x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        p pVar = this.B;
        pVar.f21206z = i10;
        AppCompatTextView appCompatTextView = pVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.S) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.O0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.S) {
            this.S = z10;
            if (!z10) {
                this.U = false;
                if (!TextUtils.isEmpty(this.T) && TextUtils.isEmpty(this.f21135v.getHint())) {
                    this.f21135v.setHint(this.T);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f21135v.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.T)) {
                        setHint(hint);
                    }
                    this.f21135v.setHint((CharSequence) null);
                }
                this.U = true;
            }
            if (this.f21135v != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        com.google.android.material.internal.c cVar = this.M0;
        View view = cVar.f20827a;
        z6.d dVar = new z6.d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f37318j;
        if (colorStateList != null) {
            cVar.f20843k = colorStateList;
        }
        float f10 = dVar.f37319k;
        if (f10 != gl.Code) {
            cVar.f20841i = f10;
        }
        ColorStateList colorStateList2 = dVar.f37310a;
        if (colorStateList2 != null) {
            cVar.U = colorStateList2;
        }
        cVar.S = dVar.f37314e;
        cVar.T = dVar.f;
        cVar.R = dVar.f37315g;
        cVar.V = dVar.f37317i;
        z6.a aVar = cVar.y;
        if (aVar != null) {
            aVar.f37309v = true;
        }
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(cVar);
        dVar.a();
        cVar.y = new z6.a(bVar, dVar.f37322n);
        dVar.c(view.getContext(), cVar.y);
        cVar.h(false);
        this.B0 = cVar.f20843k;
        if (this.f21135v != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            if (this.A0 == null) {
                com.google.android.material.internal.c cVar = this.M0;
                if (cVar.f20843k != colorStateList) {
                    cVar.f20843k = colorStateList;
                    cVar.h(false);
                }
            }
            this.B0 = colorStateList;
            if (this.f21135v != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.F = fVar;
    }

    public void setMaxEms(int i10) {
        this.y = i10;
        EditText editText = this.f21135v;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.A = i10;
        EditText editText = this.f21135v;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f21139x = i10;
        EditText editText = this.f21135v;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f21141z = i10;
        EditText editText = this.f21135v;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.y.setContentDescription(i10 != 0 ? endCompoundLayout.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.y.setImageDrawable(i10 != 0 ? g.a.a(endCompoundLayout.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        if (z10 && endCompoundLayout.A != 1) {
            endCompoundLayout.f(1);
        } else if (!z10) {
            endCompoundLayout.f(0);
        } else {
            endCompoundLayout.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.C = colorStateList;
        o.a(endCompoundLayout.f21085s, endCompoundLayout.y, colorStateList, endCompoundLayout.D);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.D = mode;
        o.a(endCompoundLayout.f21085s, endCompoundLayout.y, endCompoundLayout.C, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.L == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.L = appCompatTextView;
            appCompatTextView.setId(com.hamkho.livefoot.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.L;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            c0.d.s(appCompatTextView2, 2);
            androidx.transition.e d10 = d();
            this.O = d10;
            d10.f2464t = 67L;
            this.P = d();
            setPlaceholderTextAppearance(this.N);
            setPlaceholderTextColor(this.M);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.K) {
                setPlaceholderTextEnabled(true);
            }
            this.J = charSequence;
        }
        EditText editText = this.f21135v;
        if (editText != null) {
            editable = editText.getText();
        }
        u(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.N = i10;
        AppCompatTextView appCompatTextView = this.L;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            AppCompatTextView appCompatTextView = this.L;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        StartCompoundLayout startCompoundLayout = this.f21131t;
        startCompoundLayout.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        startCompoundLayout.f21107u = charSequence2;
        startCompoundLayout.f21106t.setText(charSequence);
        startCompoundLayout.d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f21131t.f21106t.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f21131t.f21106t.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(d7.j jVar) {
        d7.g gVar = this.V;
        if (gVar != null && gVar.f27403s.f27411a != jVar) {
            this.f21117g0 = jVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f21131t.f21108v.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f21131t.f21108v;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.a(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        StartCompoundLayout startCompoundLayout = this.f21131t;
        if (i10 >= 0) {
            if (i10 != startCompoundLayout.y) {
                startCompoundLayout.y = i10;
                CheckableImageButton checkableImageButton = startCompoundLayout.f21108v;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        startCompoundLayout.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        StartCompoundLayout startCompoundLayout = this.f21131t;
        View.OnLongClickListener onLongClickListener = startCompoundLayout.A;
        CheckableImageButton checkableImageButton = startCompoundLayout.f21108v;
        checkableImageButton.setOnClickListener(onClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        StartCompoundLayout startCompoundLayout = this.f21131t;
        startCompoundLayout.A = onLongClickListener;
        CheckableImageButton checkableImageButton = startCompoundLayout.f21108v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        StartCompoundLayout startCompoundLayout = this.f21131t;
        startCompoundLayout.f21111z = scaleType;
        startCompoundLayout.f21108v.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        StartCompoundLayout startCompoundLayout = this.f21131t;
        if (startCompoundLayout.f21109w != colorStateList) {
            startCompoundLayout.f21109w = colorStateList;
            o.a(startCompoundLayout.f21105s, startCompoundLayout.f21108v, colorStateList, startCompoundLayout.f21110x);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        StartCompoundLayout startCompoundLayout = this.f21131t;
        if (startCompoundLayout.f21110x != mode) {
            startCompoundLayout.f21110x = mode;
            o.a(startCompoundLayout.f21105s, startCompoundLayout.f21108v, startCompoundLayout.f21109w, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f21131t.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        EndCompoundLayout endCompoundLayout = this.f21133u;
        endCompoundLayout.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        endCompoundLayout.H = charSequence2;
        endCompoundLayout.I.setText(charSequence);
        endCompoundLayout.m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f21133u.I.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f21133u.I.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f21135v;
        if (editText != null) {
            c0.l(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f21132t0) {
            this.f21132t0 = typeface;
            com.google.android.material.internal.c cVar = this.M0;
            boolean j10 = cVar.j(typeface);
            boolean k10 = cVar.k(typeface);
            if (j10 || k10) {
                cVar.h(false);
            }
            p pVar = this.B;
            if (typeface != pVar.B) {
                pVar.B = typeface;
                AppCompatTextView appCompatTextView = pVar.f21199r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.G;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f21135v;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f21135v;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.A0;
        com.google.android.material.internal.c cVar = this.M0;
        if (colorStateList3 != null) {
            cVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.A0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.K0);
            } else {
                i10 = this.K0;
            }
            cVar.i(ColorStateList.valueOf(i10));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.B.f21199r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar.i(colorStateList2);
        } else if (this.E && (appCompatTextView = this.G) != null) {
            cVar.i(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.B0) != null && cVar.f20843k != colorStateList) {
            cVar.f20843k = colorStateList;
            cVar.h(false);
        }
        EndCompoundLayout endCompoundLayout = this.f21133u;
        StartCompoundLayout startCompoundLayout = this.f21131t;
        if (!z12 && this.N0 && (!isEnabled() || !z13)) {
            if (z11 || !this.L0) {
                ValueAnimator valueAnimator = this.P0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.P0.cancel();
                }
                if (z10 && this.O0) {
                    a(gl.Code);
                } else {
                    cVar.l(gl.Code);
                }
                if (e() && (!((com.google.android.material.textfield.h) this.V).P.isEmpty()) && e()) {
                    ((com.google.android.material.textfield.h) this.V).o(gl.Code, gl.Code, gl.Code, gl.Code);
                }
                this.L0 = true;
                AppCompatTextView appCompatTextView3 = this.L;
                if (appCompatTextView3 != null && this.K) {
                    appCompatTextView3.setText((CharSequence) null);
                    androidx.transition.m.a(this.f21129s, this.P);
                    this.L.setVisibility(4);
                }
                startCompoundLayout.B = true;
                startCompoundLayout.d();
                endCompoundLayout.J = true;
                endCompoundLayout.m();
                return;
            }
            return;
        }
        if (z11 || this.L0) {
            ValueAnimator valueAnimator2 = this.P0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.P0.cancel();
            }
            if (z10 && this.O0) {
                a(1.0f);
            } else {
                cVar.l(1.0f);
            }
            this.L0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f21135v;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            u(editable);
            startCompoundLayout.B = false;
            startCompoundLayout.d();
            endCompoundLayout.J = false;
            endCompoundLayout.m();
        }
    }

    public final void u(Editable editable) {
        int i10;
        ((e0.i) this.F).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        FrameLayout frameLayout = this.f21129s;
        if (i10 == 0 && !this.L0) {
            if (this.L != null && this.K && !TextUtils.isEmpty(this.J)) {
                this.L.setText(this.J);
                androidx.transition.m.a(frameLayout, this.O);
                this.L.setVisibility(0);
                this.L.bringToFront();
                announceForAccessibility(this.J);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.L;
        if (appCompatTextView != null && this.K) {
            appCompatTextView.setText((CharSequence) null);
            androidx.transition.m.a(frameLayout, this.P);
            this.L.setVisibility(4);
        }
    }

    public final void v(boolean z10, boolean z11) {
        int defaultColor = this.F0.getDefaultColor();
        int colorForState = this.F0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.F0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f21125o0 = colorForState2;
        } else if (z11) {
            this.f21125o0 = colorForState;
        } else {
            this.f21125o0 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w():void");
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f21131t.a(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f21133u.y.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f21133u.y.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f21133u.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f21133u.y;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        EndCompoundLayout endCompoundLayout = this.f21133u;
        CheckableImageButton checkableImageButton = endCompoundLayout.y;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = endCompoundLayout.C;
            PorterDuff.Mode mode = endCompoundLayout.D;
            TextInputLayout textInputLayout = endCompoundLayout.f21085s;
            o.a(textInputLayout, checkableImageButton, colorStateList, mode);
            o.c(textInputLayout, checkableImageButton, endCompoundLayout.C);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t(!textInputLayout.R0, false);
            if (textInputLayout.C) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.K) {
                textInputLayout.u(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
