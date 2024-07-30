package androidx.constraintlayout.widget;

import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m() {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f1401q0.O(0);
        aVar.f1401q0.L(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        f();
    }
}
