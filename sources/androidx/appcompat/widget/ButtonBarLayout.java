package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: s, reason: collision with root package name */
    public boolean f1001s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1002t;

    /* renamed from: u, reason: collision with root package name */
    public int f1003u;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1003u = -1;
        int[] iArr = a0.a.M;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        n0.c0.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f1001s = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1001s);
        }
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        if (this.f1002t != z10) {
            if (!z10 || this.f1001s) {
                this.f1002t = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i10 = 8388613;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int paddingBottom;
        boolean z11;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f1001s) {
            if (size > this.f1003u && this.f1002t) {
                setStacked(false);
            }
            this.f1003u = size;
        }
        if (!this.f1002t && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f1001s && !this.f1002t) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 < childCount) {
                if (getChildAt(i15).getVisibility() == 0) {
                    break;
                } else {
                    i15++;
                }
            } else {
                i15 = -1;
                break;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1002t) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    }
                    i16++;
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i14 += paddingBottom;
        }
        WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
        if (c0.d.d(this) != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1001s != z10) {
            this.f1001s = z10;
            if (!z10 && this.f1002t) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
