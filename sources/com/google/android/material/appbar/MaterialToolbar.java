package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.n;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import com.hamkho.livefoot.R;
import d7.g;
import g0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: w0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f20454w0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: r0, reason: collision with root package name */
    public Integer f20455r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f20456s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f20457t0;

    /* renamed from: u0, reason: collision with root package name */
    public ImageView.ScaleType f20458u0;

    /* renamed from: v0, reason: collision with root package name */
    public Boolean f20459v0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(g7.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d10 = k.d(context2, attributeSet, n.f500l0, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.f20456s0 = d10.getBoolean(4, false);
        this.f20457t0 = d10.getBoolean(3, false);
        int i10 = d10.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f20454w0;
            if (i10 < scaleTypeArr.length) {
                this.f20458u0 = scaleTypeArr[i10];
            }
        }
        if (d10.hasValue(0)) {
            this.f20459v0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.i(context2);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            gVar.j(c0.i.i(this));
            c0.d.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f20458u0;
    }

    public Integer getNavigationIconTint() {
        return this.f20455r0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.K0(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f20456s0 || this.f20457t0) {
            ArrayList b10 = l.b(this, getTitle());
            boolean isEmpty = b10.isEmpty();
            l.a aVar = l.f20883a;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(b10, aVar);
            }
            ArrayList b11 = l.b(this, getSubtitle());
            if (b11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(b11, aVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f20456s0 && textView != null) {
                    t(textView, pair);
                }
                if (this.f20457t0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f20459v0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f20458u0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n.J0(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f20459v0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f20459v0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f20458u0 != scaleType) {
            this.f20458u0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f20455r0 != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f20455r0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f20455r0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f20457t0 != z10) {
            this.f20457t0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f20456s0 != z10) {
            this.f20456s0 = z10;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
