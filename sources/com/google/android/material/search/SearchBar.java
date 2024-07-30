package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.n;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.l;
import com.huawei.hms.ads.gl;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* renamed from: r0, reason: collision with root package name */
    public Drawable f20949r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f20950s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f20951t0;

    private void setNavigationIconDecorative(boolean z10) {
        Drawable drawable;
        ImageButton a10 = l.a(this);
        if (a10 == null) {
            return;
        }
        a10.setClickable(!z10);
        a10.setFocusable(!z10);
        Drawable background = a10.getBackground();
        if (background != null) {
            this.f20949r0 = background;
        }
        if (z10) {
            drawable = null;
        } else {
            drawable = this.f20949r0;
        }
        a10.setBackgroundDrawable(drawable);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        return c0.i.i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f20950s0;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void k(int i10) {
        super.k(i10);
        this.f20950s0 = i10;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.L0(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        setText(savedState.f20952u);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState((Toolbar.SavedState) super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        savedState.f20952u = charSequence;
        return savedState;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f20951t0 = z10;
        if (getLayoutParams() instanceof AppBarLayout.d) {
            AppBarLayout.d dVar = (AppBarLayout.d) getLayoutParams();
            if (this.f20951t0) {
                if (dVar.f20441a == 0) {
                    dVar.f20441a = 53;
                }
            } else if (dVar.f20441a == 53) {
                dVar.f20441a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z10;
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setNavigationIconDecorative(z10);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() == i10) {
            return;
        }
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() == f) {
        } else {
            throw null;
        }
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public String f20952u;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20952u = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeString(this.f20952u);
        }

        public SavedState(Toolbar.SavedState savedState) {
            super(savedState);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g, reason: collision with root package name */
        public boolean f20953g;

        public ScrollingViewBehavior() {
            this.f20953g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.d(coordinatorLayout, view, view2);
            if (!this.f20953g && (view2 instanceof AppBarLayout)) {
                this.f20953g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(gl.Code);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20953g = false;
        }
    }

    public void setHint(int i10) {
        throw null;
    }

    public void setText(int i10) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
