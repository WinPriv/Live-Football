package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.applovin.exoplayer2.a.x;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class m extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f21168e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f21169g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f21170h;

    /* renamed from: i, reason: collision with root package name */
    public final com.anythink.basead.ui.e f21171i;

    /* renamed from: j, reason: collision with root package name */
    public final i f21172j;

    /* renamed from: k, reason: collision with root package name */
    public final x f21173k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21174l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21175m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21176n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f21177p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f21178q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f21179r;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.i] */
    public m(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f21171i = new com.anythink.basead.ui.e(this, 1);
        this.f21172j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                m mVar = m.this;
                mVar.f21174l = z10;
                mVar.q();
                if (!z10) {
                    mVar.t(false);
                    mVar.f21175m = false;
                }
            }
        };
        this.f21173k = new x(this, 8);
        this.o = Long.MAX_VALUE;
        this.f = w6.a.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 67);
        this.f21168e = w6.a.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 50);
        this.f21169g = w6.a.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, h6.a.f28768a);
    }

    @Override // com.google.android.material.textfield.n
    public final void a() {
        boolean z10;
        if (this.f21177p.isTouchExplorationEnabled()) {
            if (this.f21170h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f21183d.hasFocus()) {
                this.f21170h.dismissDropDown();
            }
        }
        this.f21170h.post(new androidx.activity.g(this, 9));
    }

    @Override // com.google.android.material.textfield.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnFocusChangeListener e() {
        return this.f21172j;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnClickListener f() {
        return this.f21171i;
    }

    @Override // com.google.android.material.textfield.n
    public final o0.d h() {
        return this.f21173k;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean i(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean j() {
        return this.f21174l;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean l() {
        return this.f21176n;
    }

    @Override // com.google.android.material.textfield.n
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f21170h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z10;
                    m mVar = m.this;
                    mVar.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - mVar.o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            mVar.f21175m = false;
                        }
                        mVar.u();
                        mVar.f21175m = true;
                        mVar.o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f21170h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    m mVar = m.this;
                    mVar.f21175m = true;
                    mVar.o = System.currentTimeMillis();
                    mVar.t(false);
                }
            });
            boolean z10 = false;
            this.f21170h.setThreshold(0);
            TextInputLayout textInputLayout = this.f21180a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z10 = true;
            }
            if (!z10 && this.f21177p.isTouchExplorationEnabled()) {
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                c0.d.s(this.f21183d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // com.google.android.material.textfield.n
    public final void n(o0.g gVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f21170h.getInputType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
        if (!z10) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z11 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z11 = false;
            }
        }
        if (z11) {
            gVar.h(null);
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (accessibilityEvent.getEventType() == 1 && this.f21177p.isEnabled()) {
            if (this.f21170h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                u();
                this.f21175m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl.Code, 1.0f);
        TimeInterpolator timeInterpolator = this.f21169g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i10 = 1;
        ofFloat.addUpdateListener(new a(this, i10));
        this.f21179r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, gl.Code);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f21168e);
        ofFloat2.addUpdateListener(new a(this, i10));
        this.f21178q = ofFloat2;
        ofFloat2.addListener(new l(this));
        this.f21177p = (AccessibilityManager) this.f21182c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.n
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f21170h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f21170h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f21176n != z10) {
            this.f21176n = z10;
            this.f21179r.cancel();
            this.f21178q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f21170h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f21175m = false;
        }
        if (!this.f21175m) {
            t(!this.f21176n);
            if (this.f21176n) {
                this.f21170h.requestFocus();
                this.f21170h.showDropDown();
                return;
            } else {
                this.f21170h.dismissDropDown();
                return;
            }
        }
        this.f21175m = false;
    }
}
