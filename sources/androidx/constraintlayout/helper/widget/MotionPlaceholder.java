package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import u.j;
import u.k;

/* loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f1359v = new j();
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        p(null, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void p(k kVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (kVar != null) {
            kVar.S(mode, size, mode2, size2);
            setMeasuredDimension(kVar.B0, kVar.C0);
        } else {
            setMeasuredDimension(0, 0);
        }
    }
}
