package com.google.android.material.slider;

import a3.k;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import com.google.android.material.internal.n;
import com.google.android.material.slider.BaseSlider;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import d7.j;
import g0.a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L, T> extends View {
    public static final /* synthetic */ int W = 0;
    public MotionEvent A;
    public boolean B;
    public float C;
    public float D;
    public ArrayList<Float> E;
    public int F;
    public int G;
    public float H;
    public float[] I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public ColorStateList N;
    public ColorStateList O;
    public ColorStateList P;
    public ColorStateList Q;
    public ColorStateList R;
    public Drawable S;
    public ArrayList T;
    public float U;
    public int V;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20984s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f20985t;

    /* renamed from: u, reason: collision with root package name */
    public ValueAnimator f20986u;

    /* renamed from: v, reason: collision with root package name */
    public int f20987v;

    /* renamed from: w, reason: collision with root package name */
    public int f20988w;

    /* renamed from: x, reason: collision with root package name */
    public int f20989x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public float f20990z;

    /* loaded from: classes2.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        public float f20991s;

        /* renamed from: t, reason: collision with root package name */
        public float f20992t;

        /* renamed from: u, reason: collision with root package name */
        public ArrayList<Float> f20993u;

        /* renamed from: v, reason: collision with root package name */
        public float f20994v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f20995w;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f20991s);
            parcel.writeFloat(this.f20992t);
            parcel.writeList(this.f20993u);
            parcel.writeFloat(this.f20994v);
            parcel.writeBooleanArray(new boolean[]{this.f20995w});
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f20991s = parcel.readFloat();
            this.f20992t = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f20993u = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f20994v = parcel.readFloat();
            this.f20995w = parcel.createBooleanArray()[0];
        }
    }

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i10 = BaseSlider.W;
            BaseSlider.this.getClass();
            throw null;
        }
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.E.size() == 1) {
            floatValue2 = this.C;
        }
        float k10 = k(floatValue2);
        float k11 = k(floatValue);
        if (g()) {
            return new float[]{k11, k10};
        }
        return new float[]{k10, k11};
    }

    private float getValueOfTouchPosition() {
        double d10;
        float f = this.U;
        float f10 = this.H;
        if (f10 > gl.Code) {
            d10 = Math.round(f * r1) / ((int) ((this.D - this.C) / f10));
        } else {
            d10 = f;
        }
        if (g()) {
            d10 = 1.0d - d10;
        }
        float f11 = this.D;
        return (float) ((d10 * (f11 - r1)) + this.C);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.U;
        if (g()) {
            f = 1.0f - f;
        }
        float f10 = this.D;
        float f11 = this.C;
        return k.d(f10, f11, f, f11);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.E.size() == arrayList.size() && this.E.equals(arrayList)) {
                return;
            }
            this.E = arrayList;
            this.M = true;
            this.G = 0;
            n();
            throw null;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final int a() {
        int i10 = this.f20987v;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 3) {
                z10 = false;
            }
            if (!z10) {
                return 0;
            }
        }
        throw null;
    }

    public final ValueAnimator b(boolean z10) {
        float f;
        ValueAnimator valueAnimator;
        int c10;
        TimeInterpolator d10;
        float f10 = gl.Code;
        if (z10) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z10) {
            valueAnimator = this.f20986u;
        } else {
            valueAnimator = this.f20985t;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f10);
        if (z10) {
            c10 = w6.a.c(getContext(), R.attr.motionDurationMedium4, 83);
            d10 = w6.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, h6.a.f28772e);
        } else {
            c10 = w6.a.c(getContext(), R.attr.motionDurationShort3, 117);
            d10 = w6.a.d(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, h6.a.f28770c);
        }
        ofFloat.setDuration(c10);
        ofFloat.setInterpolator(d10);
        ofFloat.addUpdateListener(new a());
        return ofFloat;
    }

    public final void c(Canvas canvas, int i10, int i11, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((0 + ((int) (k(f) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void d(ColorStateList colorStateList) {
        colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d(this.R);
        throw null;
    }

    public final boolean e() {
        ViewParent parent = getParent();
        while (true) {
            boolean z10 = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z10 = true;
            }
            if (z10 && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final boolean f(float f) {
        if (Math.abs(Math.round(r0) - new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.H)), MathContext.DECIMAL64).doubleValue()) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        if (c0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        throw null;
    }

    public int getActiveThumbIndex() {
        return this.F;
    }

    public int getFocusedThumbIndex() {
        return this.G;
    }

    public int getHaloRadius() {
        return this.y;
    }

    public ColorStateList getHaloTintList() {
        return this.N;
    }

    public int getLabelBehavior() {
        return this.f20987v;
    }

    public float getMinSeparation() {
        return gl.Code;
    }

    public float getStepSize() {
        return this.H;
    }

    public float getThumbElevation() {
        throw null;
    }

    public int getThumbRadius() {
        return this.f20989x;
    }

    public ColorStateList getThumbStrokeColor() {
        throw null;
    }

    public float getThumbStrokeWidth() {
        throw null;
    }

    public ColorStateList getThumbTintList() {
        throw null;
    }

    public ColorStateList getTickActiveTintList() {
        return this.O;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.P;
    }

    public ColorStateList getTickTintList() {
        if (this.P.equals(this.O)) {
            return this.O;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.Q;
    }

    public int getTrackHeight() {
        return this.f20988w;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.R;
    }

    public int getTrackSidePadding() {
        return 0;
    }

    public ColorStateList getTrackTintList() {
        if (this.R.equals(this.Q)) {
            return this.Q;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.K;
    }

    public float getValueFrom() {
        return this.C;
    }

    public float getValueTo() {
        return this.D;
    }

    public List<Float> getValues() {
        return new ArrayList(this.E);
    }

    public final void h() {
        if (this.H <= gl.Code) {
            return;
        }
        o();
        int min = Math.min((int) (((this.D - this.C) / this.H) + 1.0f), (this.K / (this.f20988w * 2)) + 1);
        float[] fArr = this.I;
        if (fArr == null || fArr.length != min * 2) {
            this.I = new float[min * 2];
        }
        float f = this.K / (min - 1);
        for (int i10 = 0; i10 < min * 2; i10 += 2) {
            float[] fArr2 = this.I;
            float f10 = 0;
            fArr2[i10] = ((i10 / 2.0f) * f) + f10;
            a();
            fArr2[i10 + 1] = f10;
        }
    }

    public final boolean i(int i10) {
        int i11 = this.G;
        long j10 = i11 + i10;
        long size = this.E.size() - 1;
        if (j10 < 0) {
            j10 = 0;
        } else if (j10 > size) {
            j10 = size;
        }
        int i12 = (int) j10;
        this.G = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.F != -1) {
            this.F = i12;
        }
        n();
        postInvalidate();
        return true;
    }

    public final void j(int i10) {
        if (g()) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = -i10;
            }
        }
        i(i10);
    }

    public final float k(float f) {
        float f10 = this.C;
        float f11 = (f - f10) / (this.D - f10);
        if (g()) {
            return 1.0f - f11;
        }
        return f11;
    }

    public boolean l() {
        boolean z10;
        if (this.F != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float f = 0;
        float k10 = (k(valueOfTouchPositionAbsolute) * this.K) + f;
        this.F = 0;
        float abs = Math.abs(this.E.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.E.size(); i10++) {
            float abs2 = Math.abs(this.E.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float k11 = (k(this.E.get(i10).floatValue()) * this.K) + f;
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!g() ? k11 - k10 < gl.Code : k11 - k10 > gl.Code) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.F = i10;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(k11 - k10) < f) {
                        this.F = -1;
                        return false;
                    }
                    if (z10) {
                        this.F = i10;
                    }
                }
            }
            abs = abs2;
        }
        if (this.F != -1) {
            return true;
        }
        return false;
    }

    public final void m(float f) {
        float floatValue;
        float floatValue2;
        int i10 = this.F;
        this.G = i10;
        if (Math.abs(f - this.E.get(i10).floatValue()) < 1.0E-4d) {
            return;
        }
        float minSeparation = getMinSeparation();
        if (this.V == 0) {
            if (minSeparation == gl.Code) {
                minSeparation = 0.0f;
            } else {
                float f10 = this.C;
                minSeparation = k.d(f10, this.D, (minSeparation - 0) / this.K, f10);
            }
        }
        if (g()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        if (i11 >= this.E.size()) {
            floatValue = this.D;
        } else {
            floatValue = this.E.get(i11).floatValue() - minSeparation;
        }
        int i12 = i10 - 1;
        if (i12 < 0) {
            floatValue2 = this.C;
        } else {
            floatValue2 = minSeparation + this.E.get(i12).floatValue();
        }
        if (f >= floatValue2) {
            if (f > floatValue) {
                f = floatValue;
            }
        } else {
            f = floatValue2;
        }
        this.E.set(i10, Float.valueOf(f));
        throw null;
    }

    public final void n() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int k10 = (int) ((k(this.E.get(this.G).floatValue()) * this.K) + 0);
                a();
                int i10 = this.y;
                a.b.f(background, k10 - i10, 0 - i10, k10 + i10, 0 + i10);
            }
        }
    }

    public final void o() {
        if (this.M) {
            float f = this.C;
            float f10 = this.D;
            if (f < f10) {
                if (f10 > f) {
                    if (this.H > gl.Code && !f(f10 - f)) {
                        throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.H), Float.valueOf(this.C), Float.valueOf(this.D)));
                    }
                    Iterator<Float> it = this.E.iterator();
                    while (it.hasNext()) {
                        Float next = it.next();
                        if (next.floatValue() >= this.C && next.floatValue() <= this.D) {
                            if (this.H > gl.Code && !f(next.floatValue() - this.C)) {
                                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.C), Float.valueOf(this.H), Float.valueOf(this.H)));
                            }
                        } else {
                            throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.C), Float.valueOf(this.D)));
                        }
                    }
                    float minSeparation = getMinSeparation();
                    if (minSeparation >= gl.Code) {
                        float f11 = this.H;
                        if (f11 > gl.Code && minSeparation > gl.Code) {
                            if (this.V == 1) {
                                if (minSeparation < f11 || !f(minSeparation)) {
                                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.H), Float.valueOf(this.H)));
                                }
                            } else {
                                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.H)));
                            }
                        }
                        float f12 = this.H;
                        if (f12 != gl.Code) {
                            if (((int) f12) != f12) {
                                Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f12)));
                            }
                            float f13 = this.C;
                            if (((int) f13) != f13) {
                                Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f13)));
                            }
                            float f14 = this.D;
                            if (((int) f14) != f14) {
                                Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f14)));
                            }
                        }
                        this.M = false;
                        return;
                    }
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
                }
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.D), Float.valueOf(this.C)));
            }
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.C), Float.valueOf(this.D)));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f20984s = false;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
    
        if (r0 != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 == 66) {
                            j(Integer.MIN_VALUE);
                            throw null;
                        }
                        throw null;
                    }
                    j(Integer.MAX_VALUE);
                    throw null;
                }
                i(Integer.MIN_VALUE);
                throw null;
            }
            i(Integer.MAX_VALUE);
            throw null;
        }
        this.F = -1;
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.E.size() == 1) {
            this.F = 0;
        }
        Float f = null;
        Boolean bool = null;
        if (this.F == -1) {
            if (i10 != 61) {
                if (i10 != 66) {
                    if (i10 != 81) {
                        if (i10 != 69) {
                            if (i10 != 70) {
                                switch (i10) {
                                    case 21:
                                        j(-1);
                                        bool = Boolean.TRUE;
                                        break;
                                    case 22:
                                        j(1);
                                        bool = Boolean.TRUE;
                                        break;
                                }
                            }
                        } else {
                            i(-1);
                            bool = Boolean.TRUE;
                        }
                    }
                    i(1);
                    bool = Boolean.TRUE;
                }
                this.F = this.G;
                postInvalidate();
                bool = Boolean.TRUE;
            } else if (keyEvent.hasNoModifiers()) {
                bool = Boolean.valueOf(i(1));
            } else if (keyEvent.isShiftPressed()) {
                bool = Boolean.valueOf(i(-1));
            } else {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return super.onKeyDown(i10, keyEvent);
        }
        boolean isLongPress = this.L | keyEvent.isLongPress();
        this.L = isLongPress;
        float f10 = 1.0f;
        if (isLongPress) {
            float f11 = this.H;
            if (f11 != gl.Code) {
                f10 = f11;
            }
            if ((this.D - this.C) / f10 > 20) {
                f10 *= Math.round(r0 / r11);
            }
        } else {
            float f12 = this.H;
            if (f12 != gl.Code) {
                f10 = f12;
            }
        }
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 != 69) {
                    if (i10 == 70 || i10 == 81) {
                        f = Float.valueOf(f10);
                    }
                } else {
                    f = Float.valueOf(-f10);
                }
            } else {
                if (g()) {
                    f10 = -f10;
                }
                f = Float.valueOf(f10);
            }
        } else {
            if (!g()) {
                f10 = -f10;
            }
            f = Float.valueOf(f10);
        }
        if (f != null) {
            m(f.floatValue() + this.E.get(this.F).floatValue());
            return true;
        }
        if (i10 != 23) {
            if (i10 != 61) {
                if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return i(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return i(-1);
            }
        }
        this.F = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.L = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f20987v;
        boolean z10 = true;
        if (i12 != 1) {
            if (i12 != 3) {
                z10 = false;
            }
            if (!z10) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
                return;
            }
        }
        throw null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.C = sliderState.f20991s;
        this.D = sliderState.f20992t;
        setValuesInternal(sliderState.f20993u);
        this.H = sliderState.f20994v;
        if (sliderState.f20995w) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f20991s = this.C;
        sliderState.f20992t = this.D;
        sliderState.f20993u = new ArrayList<>(this.E);
        sliderState.f20994v = this.H;
        sliderState.f20995w = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.K = Math.max(i10 - 0, 0);
        h();
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r3 != 3) goto L48;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || n.d(this) == null) {
        } else {
            throw null;
        }
    }

    public void setActiveThumbIndex(int i10) {
        this.F = i10;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        int i10;
        super.setEnabled(z10);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        setLayerType(i10, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 >= 0 && i10 < this.E.size()) {
            this.G = i10;
            throw null;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.y) {
            return;
        }
        this.y = i10;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.y);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.N)) {
            return;
        }
        this.N = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
        } else {
            d(colorStateList);
            throw null;
        }
    }

    public void setLabelBehavior(int i10) {
        if (this.f20987v != i10) {
            this.f20987v = i10;
            requestLayout();
        }
    }

    public void setSeparationUnit(int i10) {
        this.V = i10;
        this.M = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= gl.Code) {
            if (this.H != f) {
                this.H = f;
                this.M = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.C), Float.valueOf(this.D)));
    }

    public void setThumbElevation(float f) {
        throw null;
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(int i10) {
        if (i10 == this.f20989x) {
            return;
        }
        this.f20989x = i10;
        j.a aVar = new j.a();
        float f = this.f20989x;
        androidx.activity.n p02 = androidx.activity.n.p0(0);
        aVar.f27442a = p02;
        float b10 = j.a.b(p02);
        if (b10 != -1.0f) {
            aVar.f27446e = new d7.a(b10);
        }
        aVar.f27443b = p02;
        float b11 = j.a.b(p02);
        if (b11 != -1.0f) {
            aVar.f = new d7.a(b11);
        }
        aVar.f27444c = p02;
        float b12 = j.a.b(p02);
        if (b12 != -1.0f) {
            aVar.f27447g = new d7.a(b12);
        }
        aVar.f27445d = p02;
        float b13 = j.a.b(p02);
        if (b13 != -1.0f) {
            aVar.f27448h = new d7.a(b13);
        }
        aVar.f27446e = new d7.a(f);
        aVar.f = new d7.a(f);
        aVar.f27447g = new d7.a(f);
        aVar.f27448h = new d7.a(f);
        aVar.a();
        throw null;
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(d0.a.b(i10, getContext()));
        }
    }

    public void setThumbStrokeWidth(float f) {
        throw null;
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.O)) {
            return;
        }
        this.O = colorStateList;
        d(colorStateList);
        throw null;
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.P)) {
            return;
        }
        this.P = colorStateList;
        d(colorStateList);
        throw null;
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.Q)) {
            return;
        }
        this.Q = colorStateList;
        d(colorStateList);
        throw null;
    }

    public void setTrackHeight(int i10) {
        if (this.f20988w == i10) {
            return;
        }
        this.f20988w = i10;
        throw null;
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.R)) {
            return;
        }
        this.R = colorStateList;
        d(colorStateList);
        throw null;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.C = f;
        this.M = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.D = f;
        this.M = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        int i10 = this.f20989x * 2;
        int intrinsicWidth = newDrawable.getIntrinsicWidth();
        int intrinsicHeight = newDrawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            newDrawable.setBounds(0, 0, i10, i10);
        } else {
            float max = i10 / Math.max(intrinsicWidth, intrinsicHeight);
            newDrawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
        this.S = newDrawable;
        this.T.clear();
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.S = null;
        this.T = new ArrayList();
        for (Drawable drawable : drawableArr) {
            ArrayList arrayList = this.T;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            int i10 = this.f20989x * 2;
            int intrinsicWidth = newDrawable.getIntrinsicWidth();
            int intrinsicHeight = newDrawable.getIntrinsicHeight();
            if (intrinsicWidth == -1 && intrinsicHeight == -1) {
                newDrawable.setBounds(0, 0, i10, i10);
            } else {
                float max = i10 / Math.max(intrinsicWidth, intrinsicHeight);
                newDrawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
            }
            arrayList.add(newDrawable);
        }
        postInvalidate();
    }

    public void setLabelFormatter(b bVar) {
    }
}
