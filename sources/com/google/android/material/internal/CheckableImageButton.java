package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import n0.c0;

/* loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] y = {R.attr.state_checked};

    /* renamed from: v, reason: collision with root package name */
    public boolean f20812v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20813w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20814x;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f20815u;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeInt(this.f20815u ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20815u = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.hamkho.livefoot.R.attr.imageButtonStyle);
        this.f20813w = true;
        this.f20814x = true;
        c0.l(this, new a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f20812v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f20812v) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), y);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        setChecked(savedState.f20815u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20815u = this.f20812v;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f20813w != z10) {
            this.f20813w = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f20813w && this.f20812v != z10) {
            this.f20812v = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f20814x = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f20814x) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f20812v);
    }
}
