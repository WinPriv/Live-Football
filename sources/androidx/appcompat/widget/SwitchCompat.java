package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import com.huawei.hms.ads.gl;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final a R = new a();
    public static final int[] S = {R.attr.state_checked};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public CharSequence G;
    public CharSequence H;
    public CharSequence I;
    public CharSequence J;
    public boolean K;
    public float L;
    public StaticLayout M;
    public StaticLayout N;
    public ObjectAnimator O;
    public h P;
    public c Q;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f1078s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f1079t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f1080u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1081v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1082w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f1083x;
    public ColorStateList y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f1084z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.L);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f1085a;

        public c(SwitchCompat switchCompat) {
            this.f1085a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.e
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1085a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1085a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }
    }

    public static StaticLayout c(CharSequence charSequence) {
        int i10;
        if (charSequence != null) {
            i10 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, null));
        } else {
            i10 = 0;
        }
        return new StaticLayout(charSequence, null, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, gl.Code, true);
    }

    private h getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new h(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        if (this.L > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (u0.a(this)) {
            f = 1.0f - this.L;
        } else {
            f = this.L;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1083x;
        if (drawable != null) {
            drawable.getPadding(null);
            Drawable drawable2 = this.f1078s;
            if (drawable2 != null) {
                x.b(drawable2);
                throw null;
            }
            int[] iArr = x.f1275a;
            throw null;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.I = charSequence;
        TransformationMethod e10 = getEmojiTextViewHelper().f1182b.f36023a.e(null);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.J = charSequence;
        this.N = null;
        if (this.K) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.G = charSequence;
        TransformationMethod e10 = getEmojiTextViewHelper().f1182b.f36023a.e(null);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.H = charSequence;
        this.M = null;
        if (this.K) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f1078s;
        if (drawable != null) {
            if (this.f1081v || this.f1082w) {
                Drawable mutate = drawable.mutate();
                this.f1078s = mutate;
                if (this.f1081v) {
                    a.b.h(mutate, this.f1079t);
                }
                if (this.f1082w) {
                    a.b.i(this.f1078s, this.f1080u);
                }
                if (this.f1078s.isStateful()) {
                    this.f1078s.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1083x;
        if (drawable != null) {
            if (this.A || this.B) {
                Drawable mutate = drawable.mutate();
                this.f1083x = mutate;
                if (this.A) {
                    a.b.h(mutate, this.y);
                }
                if (this.B) {
                    a.b.i(this.f1083x, this.f1084z);
                }
                if (this.f1083x.isStateful()) {
                    this.f1083x.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        setTextOnInternal(this.G);
        setTextOffInternal(this.I);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        getThumbOffset();
        Drawable drawable = this.f1078s;
        if (drawable != null) {
            x.b(drawable);
        } else {
            int[] iArr = x.f1275a;
        }
        Drawable drawable2 = this.f1083x;
        if (drawable2 == null) {
            Drawable drawable3 = this.f1078s;
            if (drawable3 == null) {
                super.draw(canvas);
                return;
            } else {
                drawable3.getPadding(null);
                throw null;
            }
        }
        drawable2.getPadding(null);
        throw null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f10) {
        super.drawableHotspotChanged(f, f10);
        Drawable drawable = this.f1078s;
        if (drawable != null) {
            a.b.e(drawable, f, f10);
        }
        Drawable drawable2 = this.f1083x;
        if (drawable2 != null) {
            a.b.e(drawable2, f, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1078s;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1083x;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (this.Q == null && this.P.f1182b.f36023a.b()) {
            if (androidx.emoji2.text.f.f1619j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                int b10 = a10.b();
                if (b10 == 3 || b10 == 0) {
                    c cVar = new c(this);
                    this.Q = cVar;
                    a10.g(cVar);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!u0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + 0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.E;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (u0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + 0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.E;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r0.j.d(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.K;
    }

    public boolean getSplitTrack() {
        return this.F;
    }

    public int getSwitchMinWidth() {
        return this.D;
    }

    public int getSwitchPadding() {
        return this.E;
    }

    public CharSequence getTextOff() {
        return this.I;
    }

    public CharSequence getTextOn() {
        return this.G;
    }

    public Drawable getThumbDrawable() {
        return this.f1078s;
    }

    public final float getThumbPosition() {
        return this.L;
    }

    public int getThumbTextPadding() {
        return this.C;
    }

    public ColorStateList getThumbTintList() {
        return this.f1079t;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1080u;
    }

    public Drawable getTrackDrawable() {
        return this.f1083x;
    }

    public ColorStateList getTrackTintList() {
        return this.y;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1084z;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1078s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1083x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.O.end();
            this.O = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f1083x;
        drawable.getClass();
        drawable.getPadding(null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.G;
            } else {
                charSequence = this.I;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f1078s == null) {
            if (u0.a(this)) {
                getPaddingLeft();
            } else {
                getWidth();
                getPaddingRight();
            }
            int gravity = getGravity() & 112;
            if (gravity != 16) {
                if (gravity != 80) {
                    getPaddingTop();
                    return;
                } else {
                    getHeight();
                    getPaddingBottom();
                    return;
                }
            }
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            return;
        }
        Drawable drawable = this.f1083x;
        drawable.getClass();
        drawable.getPadding(null);
        int i14 = x.b(this.f1078s).left;
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.K) {
            if (this.M == null) {
                this.M = c(this.H);
            }
            if (this.N == null) {
                this.N = c(this.J);
            }
        }
        Drawable drawable = this.f1078s;
        if (drawable == null) {
            if (this.K) {
                i12 = (this.C * 2) + Math.max(this.M.getWidth(), this.N.getWidth());
            } else {
                i12 = 0;
            }
            Math.max(i12, 0);
            Drawable drawable2 = this.f1083x;
            drawable2.getClass();
            drawable2.getPadding(null);
            this.f1083x.getIntrinsicHeight();
            throw null;
        }
        drawable.getPadding(null);
        this.f1078s.getIntrinsicWidth();
        throw null;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.G;
        } else {
            charSequence = this.I;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.G;
                if (obj == null) {
                    obj = getResources().getString(com.hamkho.livefoot.R.string.abc_capital_on);
                }
                WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
                new n0.a0().e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.I;
            if (obj2 == null) {
                obj2 = getResources().getString(com.hamkho.livefoot.R.string.abc_capital_off);
            }
            WeakHashMap<View, n0.l0> weakHashMap2 = n0.c0.f33054a;
            new n0.a0().e(this, obj2);
        }
        float f = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, n0.l0> weakHashMap3 = n0.c0.f33054a;
            if (c0.g.c(this)) {
                if (!isChecked) {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, f);
                this.O = ofFloat;
                ofFloat.setDuration(250L);
                b.a(this.O, true);
                this.O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r0.j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.G);
        setTextOffInternal(this.I);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            requestLayout();
            if (z10) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        throw null;
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.I;
            if (obj == null) {
                obj = getResources().getString(com.hamkho.livefoot.R.string.abc_capital_off);
            }
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            new n0.a0().e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.G;
            if (obj == null) {
                obj = getResources().getString(com.hamkho.livefoot.R.string.abc_capital_on);
            }
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            new n0.a0().e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1078s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1078s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.L = f;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(g.a.a(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1079t = colorStateList;
        this.f1081v = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1080u = mode;
        this.f1082w = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1083x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1083x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(g.a.a(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        this.A = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1084z = mode;
        this.B = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1078s && drawable != this.f1083x) {
            return false;
        }
        return true;
    }
}
