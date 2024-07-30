package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.m0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.hamkho.livefoot.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class EndCompoundLayout extends LinearLayout {
    public static final /* synthetic */ int O = 0;
    public int A;
    public final LinkedHashSet<TextInputLayout.h> B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public int E;
    public ImageView.ScaleType F;
    public View.OnLongClickListener G;
    public CharSequence H;
    public final AppCompatTextView I;
    public boolean J;
    public EditText K;
    public final AccessibilityManager L;
    public o0.d M;
    public final a N;

    /* renamed from: s, reason: collision with root package name */
    public final TextInputLayout f21085s;

    /* renamed from: t, reason: collision with root package name */
    public final FrameLayout f21086t;

    /* renamed from: u, reason: collision with root package name */
    public final CheckableImageButton f21087u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f21088v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f21089w;

    /* renamed from: x, reason: collision with root package name */
    public View.OnLongClickListener f21090x;
    public final CheckableImageButton y;

    /* renamed from: z, reason: collision with root package name */
    public final d f21091z;

    /* loaded from: classes2.dex */
    public class a extends com.google.android.material.internal.j {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EndCompoundLayout.this.b().a();
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EndCompoundLayout.this.b().b();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            if (endCompoundLayout.K == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = endCompoundLayout.K;
            a aVar = endCompoundLayout.N;
            if (editText != null) {
                editText.removeTextChangedListener(aVar);
                if (endCompoundLayout.K.getOnFocusChangeListener() == endCompoundLayout.b().e()) {
                    endCompoundLayout.K.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            endCompoundLayout.K = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(aVar);
            }
            endCompoundLayout.b().m(endCompoundLayout.K);
            endCompoundLayout.i(endCompoundLayout.b());
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            int i10 = EndCompoundLayout.O;
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            if (endCompoundLayout.M != null && (accessibilityManager = endCompoundLayout.L) != null) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (c0.g.b(endCompoundLayout)) {
                    o0.c.a(accessibilityManager, endCompoundLayout.M);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            int i10 = EndCompoundLayout.O;
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            o0.d dVar = endCompoundLayout.M;
            if (dVar != null && (accessibilityManager = endCompoundLayout.L) != null) {
                o0.c.b(accessibilityManager, dVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<n> f21095a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public final EndCompoundLayout f21096b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21097c;

        /* renamed from: d, reason: collision with root package name */
        public final int f21098d;

        public d(EndCompoundLayout endCompoundLayout, m0 m0Var) {
            this.f21096b = endCompoundLayout;
            this.f21097c = m0Var.i(26, 0);
            this.f21098d = m0Var.i(50, 0);
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, m0 m0Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.A = 0;
        this.B = new LinkedHashSet<>();
        this.N = new a();
        b bVar = new b();
        this.L = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f21085s = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21086t = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f21087u = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.y = a11;
        this.f21091z = new d(this, m0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.I = appCompatTextView;
        if (m0Var.l(36)) {
            this.f21088v = z6.c.b(getContext(), m0Var, 36);
        }
        if (m0Var.l(37)) {
            this.f21089w = com.google.android.material.internal.n.f(m0Var.h(37, -1), null);
        }
        if (m0Var.l(35)) {
            h(m0Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!m0Var.l(51)) {
            if (m0Var.l(30)) {
                this.C = z6.c.b(getContext(), m0Var, 30);
            }
            if (m0Var.l(31)) {
                this.D = com.google.android.material.internal.n.f(m0Var.h(31, -1), null);
            }
        }
        if (m0Var.l(28)) {
            f(m0Var.h(28, 0));
            if (m0Var.l(25) && a11.getContentDescription() != (k10 = m0Var.k(25))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(m0Var.a(24, true));
        } else if (m0Var.l(51)) {
            if (m0Var.l(52)) {
                this.C = z6.c.b(getContext(), m0Var, 52);
            }
            if (m0Var.l(53)) {
                this.D = com.google.android.material.internal.n.f(m0Var.h(53, -1), null);
            }
            f(m0Var.a(51, false) ? 1 : 0);
            CharSequence k11 = m0Var.k(49);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = m0Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.E) {
                this.E = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            if (m0Var.l(29)) {
                ImageView.ScaleType b10 = o.b(m0Var.h(29, -1));
                this.F = b10;
                a11.setScaleType(b10);
                a10.setScaleType(b10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            c0.g.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(m0Var.i(70, 0));
            if (m0Var.l(71)) {
                appCompatTextView.setTextColor(m0Var.b(71));
            }
            CharSequence k12 = m0Var.k(69);
            this.H = TextUtils.isEmpty(k12) ? null : k12;
            appCompatTextView.setText(k12);
            m();
            frameLayout.addView(a11);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f21138w0.add(bVar);
            if (textInputLayout.f21135v != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (z6.c.e(getContext())) {
            n0.g.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n gVar;
        int i10 = this.A;
        d dVar = this.f21091z;
        SparseArray<n> sparseArray = dVar.f21095a;
        n nVar = sparseArray.get(i10);
        if (nVar == null) {
            EndCompoundLayout endCompoundLayout = dVar.f21096b;
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                gVar = new m(endCompoundLayout);
                            } else {
                                throw new IllegalArgumentException(a3.l.i("Invalid end icon mode: ", i10));
                            }
                        } else {
                            gVar = new f(endCompoundLayout);
                        }
                    } else {
                        nVar = new t(endCompoundLayout, dVar.f21098d);
                        sparseArray.append(i10, nVar);
                    }
                } else {
                    gVar = new s(endCompoundLayout);
                }
            } else {
                gVar = new g(endCompoundLayout);
            }
            nVar = gVar;
            sparseArray.append(i10, nVar);
        }
        return nVar;
    }

    public final boolean c() {
        if (this.f21086t.getVisibility() == 0 && this.y.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f21087u.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        n b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.y;
        boolean z12 = true;
        if (k10 && (isChecked = checkableImageButton.isChecked()) != b10.l()) {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof m) && (isActivated = checkableImageButton.isActivated()) != b10.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            o.c(this.f21085s, checkableImageButton, this.C);
        }
    }

    public final void f(int i10) {
        boolean z10;
        Drawable drawable;
        if (this.A == i10) {
            return;
        }
        n b10 = b();
        o0.d dVar = this.M;
        AccessibilityManager accessibilityManager = this.L;
        if (dVar != null && accessibilityManager != null) {
            o0.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.M = null;
        b10.s();
        this.A = i10;
        Iterator<TextInputLayout.h> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        n b11 = b();
        int i11 = this.f21091z.f21097c;
        if (i11 == 0) {
            i11 = b11.d();
        }
        if (i11 != 0) {
            drawable = g.a.a(getContext(), i11);
        } else {
            drawable = null;
        }
        CheckableImageButton checkableImageButton = this.y;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f21085s;
        if (drawable != null) {
            o.a(textInputLayout, checkableImageButton, this.C, this.D);
            o.c(textInputLayout, checkableImageButton, this.C);
        }
        int c10 = b11.c();
        if (c10 != 0) {
            charSequence = getResources().getText(c10);
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(b11.k());
        if (b11.i(textInputLayout.getBoxBackgroundMode())) {
            b11.r();
            o0.d h10 = b11.h();
            this.M = h10;
            if (h10 != null && accessibilityManager != null) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                if (c0.g.b(this)) {
                    o0.c.a(accessibilityManager, this.M);
                }
            }
            View.OnClickListener f = b11.f();
            View.OnLongClickListener onLongClickListener = this.G;
            checkableImageButton.setOnClickListener(f);
            o.d(checkableImageButton, onLongClickListener);
            EditText editText = this.K;
            if (editText != null) {
                b11.m(editText);
                i(b11);
            }
            o.a(textInputLayout, checkableImageButton, this.C, this.D);
            e(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
    }

    public final void g(boolean z10) {
        int i10;
        if (c() != z10) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.y.setVisibility(i10);
            j();
            l();
            this.f21085s.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f21087u;
        checkableImageButton.setImageDrawable(drawable);
        k();
        o.a(this.f21085s, checkableImageButton, this.f21088v, this.f21089w);
    }

    public final void i(n nVar) {
        if (this.K == null) {
            return;
        }
        if (nVar.e() != null) {
            this.K.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.y.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void j() {
        int i10;
        boolean z10;
        boolean z11;
        int i11 = 8;
        if (this.y.getVisibility() == 0 && !d()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f21086t.setVisibility(i10);
        if (this.H != null && !this.J) {
            z10 = false;
        } else {
            z10 = 8;
        }
        if (!c() && !d() && z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void k() {
        boolean z10;
        int i10;
        CheckableImageButton checkableImageButton = this.f21087u;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z11 = true;
        TextInputLayout textInputLayout = this.f21085s;
        if (drawable != null && textInputLayout.B.f21198q && textInputLayout.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        j();
        l();
        if (this.A == 0) {
            z11 = false;
        }
        if (!z11) {
            textInputLayout.p();
        }
    }

    public final void l() {
        int i10;
        TextInputLayout textInputLayout = this.f21085s;
        if (textInputLayout.f21135v == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f21135v;
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            i10 = c0.e.e(editText);
        } else {
            i10 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f21135v.getPaddingTop();
        int paddingBottom = textInputLayout.f21135v.getPaddingBottom();
        WeakHashMap<View, l0> weakHashMap2 = c0.f33054a;
        c0.e.k(this.I, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void m() {
        int i10;
        AppCompatTextView appCompatTextView = this.I;
        int visibility = appCompatTextView.getVisibility();
        boolean z10 = false;
        if (this.H != null && !this.J) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            n b10 = b();
            if (i10 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        j();
        appCompatTextView.setVisibility(i10);
        this.f21085s.p();
    }
}
