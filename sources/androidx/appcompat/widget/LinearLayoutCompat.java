package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public int[] A;
    public int[] B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1025s;

    /* renamed from: t, reason: collision with root package name */
    public int f1026t;

    /* renamed from: u, reason: collision with root package name */
    public int f1027u;

    /* renamed from: v, reason: collision with root package name */
    public int f1028v;

    /* renamed from: w, reason: collision with root package name */
    public int f1029w;

    /* renamed from: x, reason: collision with root package name */
    public int f1030x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1031z;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i10) {
        this.C.setBounds(getPaddingLeft() + this.G, i10, (getWidth() - getPaddingRight()) - this.G, this.E + i10);
        this.C.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.C.setBounds(i10, getPaddingTop() + this.G, this.D + i10, (getHeight() - getPaddingBottom()) - this.G);
        this.C.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1028v;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1026t < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1026t;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1026t == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1027u;
            if (this.f1028v == 1 && (i10 = this.f1029w & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1030x;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1030x) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1026t;
    }

    public Drawable getDividerDrawable() {
        return this.C;
    }

    public int getDividerPadding() {
        return this.G;
    }

    public int getDividerWidth() {
        return this.D;
    }

    public int getGravity() {
        return this.f1029w;
    }

    public int getOrientation() {
        return this.f1028v;
    }

    public int getShowDividers() {
        return this.F;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            if ((this.F & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i10 == getChildCount()) {
            if ((this.F & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.F & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.C == null) {
            return;
        }
        int i11 = 0;
        if (this.f1028v == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && i(i11)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.E);
                }
                i11++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.E;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = u0.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.D;
                }
                e(canvas, left2);
            }
            i11++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.D;
                    right = left - i10;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.D;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1025s = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1026t = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.C) {
            return;
        }
        this.C = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.D = drawable.getIntrinsicWidth();
            this.E = drawable.getIntrinsicHeight();
        } else {
            this.D = 0;
            this.E = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.G = i10;
    }

    public void setGravity(int i10) {
        if (this.f1029w != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1029w = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1029w;
        if ((8388615 & i12) != i11) {
            this.f1029w = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1031z = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1028v != i10) {
            this.f1028v = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.F) {
            requestLayout();
        }
        this.F = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1029w;
        if ((i12 & 112) != i11) {
            this.f1029w = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.y = Math.max(gl.Code, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f1025s = true;
        this.f1026t = -1;
        this.f1027u = 0;
        this.f1029w = 8388659;
        int[] iArr = a0.a.P;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0.c0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.y = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1026t = obtainStyledAttributes.getInt(3, -1);
        this.f1031z = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = g.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.F = obtainStyledAttributes.getInt(8, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}
