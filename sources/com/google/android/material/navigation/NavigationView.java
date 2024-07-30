package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.n;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import d0.a;
import i.f;

/* loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public f f20932t;

    /* loaded from: classes2.dex */
    public interface a {
    }

    private MenuInflater getMenuInflater() {
        if (this.f20932t == null) {
            this.f20932t = new f(getContext());
        }
        return this.f20932t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public MenuItem getCheckedItem() {
        throw null;
    }

    public int getDividerInsetEnd() {
        throw null;
    }

    public int getDividerInsetStart() {
        throw null;
    }

    public int getHeaderCount() {
        throw null;
    }

    public Drawable getItemBackground() {
        throw null;
    }

    public int getItemHorizontalPadding() {
        throw null;
    }

    public int getItemIconPadding() {
        throw null;
    }

    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemMaxLines() {
        throw null;
    }

    public ColorStateList getItemTextColor() {
        throw null;
    }

    public int getItemVerticalPadding() {
        throw null;
    }

    public Menu getMenu() {
        return null;
    }

    public int getSubheaderInsetEnd() {
        throw null;
    }

    public int getSubheaderInsetStart() {
        throw null;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.K0(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            }
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), 0), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((SavedState) parcelable).f1595s);
            throw null;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).f20933u = new Bundle();
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        boolean z10 = getParent() instanceof DrawerLayout;
        throw null;
    }

    public void setCheckedItem(int i10) {
        throw null;
    }

    public void setDividerInsetEnd(int i10) {
        throw null;
    }

    public void setDividerInsetStart(int i10) {
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n.J0(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(int i10) {
        Context context = getContext();
        Object obj = d0.a.f27248a;
        setItemBackground(a.c.b(context, i10));
    }

    public void setItemHorizontalPadding(int i10) {
        throw null;
    }

    public void setItemHorizontalPaddingResource(int i10) {
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setItemIconPadding(int i10) {
        throw null;
    }

    public void setItemIconPaddingResource(int i10) {
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setItemIconSize(int i10) {
        throw null;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemMaxLines(int i10) {
        throw null;
    }

    public void setItemTextAppearance(int i10) {
        throw null;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemVerticalPadding(int i10) {
        throw null;
    }

    public void setItemVerticalPaddingResource(int i10) {
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
    }

    public void setSubheaderInsetEnd(int i10) {
        throw null;
    }

    public void setSubheaderInsetStart(int i10) {
        throw null;
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public Bundle f20933u;

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
            this.f20933u = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeBundle(this.f20933u);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        menuItem.getItemId();
        throw null;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
    }

    public void setNavigationItemSelectedListener(a aVar) {
    }

    public void setTopInsetScrimEnabled(boolean z10) {
    }
}
