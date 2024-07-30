package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.activity.n;
import com.google.android.material.timepicker.ClockHandView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.util.Arrays;
import n0.c0;
import o0.g;

/* loaded from: classes2.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.a {
    public final ClockHandView L;
    public final Rect M;
    public final RectF N;
    public final Rect O;
    public final SparseArray<TextView> P;
    public final b Q;
    public final int[] R;
    public final float[] S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;

    /* renamed from: c0, reason: collision with root package name */
    public String[] f21219c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f21220d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ColorStateList f21221e0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.M = new Rect();
        this.N = new RectF();
        this.O = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.P = sparseArray;
        this.S = new float[]{gl.Code, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.R, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a10 = z6.c.a(context, obtainStyledAttributes, 1);
        this.f21221e0 = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.L = clockHandView;
        this.T = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{android.R.attr.state_selected}, a10.getDefaultColor());
        this.R = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f21224u.add(this);
        int defaultColor = d0.a.b(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList a11 = z6.c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.Q = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f21219c0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.f21219c0.length, size); i10++) {
            TextView textView = sparseArray.get(i10);
            if (i10 >= this.f21219c0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f21219c0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                c0.l(textView, this.Q);
                textView.setTextColor(this.f21221e0);
            }
        }
        ClockHandView clockHandView2 = this.L;
        if (clockHandView2.f21223t && !z10) {
            clockHandView2.E = 1;
        }
        clockHandView2.f21223t = z10;
        clockHandView2.invalidate();
        this.U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.V = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.W = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f) {
        if (Math.abs(this.f21220d0 - f) > 0.001f) {
            this.f21220d0 = f;
            q();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) g.b.a(1, this.f21219c0.length, 1).f33535a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.W / Math.max(Math.max(this.U / displayMetrics.heightPixels, this.V / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void p() {
        super.p();
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.P;
            if (i10 < sparseArray.size()) {
                sparseArray.get(i10).setVisibility(0);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void q() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        boolean z10;
        RadialGradient radialGradient;
        RectF rectF2 = this.L.y;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.P;
            int size = sparseArray.size();
            rectF = this.N;
            rect = this.M;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.O);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.R, this.S, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }
}
