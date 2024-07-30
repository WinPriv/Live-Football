package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public b0 f931s;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: s, reason: collision with root package name */
        public static final int[] f932s = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Drawable drawable;
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f932s);
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable = g.a.a(context, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(0);
            }
            setBackgroundDrawable(drawable);
            obtainStyledAttributes.recycle();
        }
    }

    public b getDataModel() {
        throw null;
    }

    public b0 getListPopupWindow() {
        if (this.f931s == null) {
            b0 b0Var = new b0(getContext());
            this.f931s = b0Var;
            b0Var.m(null);
            b0 b0Var2 = this.f931s;
            b0Var2.G = this;
            b0Var2.Q = true;
            b0Var2.R.setFocusable(true);
            b0 b0Var3 = this.f931s;
            b0Var3.H = null;
            b0Var3.R.setOnDismissListener(null);
        }
        return this.f931s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        throw null;
    }

    public void setActivityChooserModel(b bVar) {
        throw null;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        getContext().getString(i10);
        throw null;
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i10) {
    }

    public void setInitialActivityCount(int i10) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
    }

    public void setProvider(n0.b bVar) {
    }
}
