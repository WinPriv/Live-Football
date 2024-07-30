package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.e;

/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.c {
    public boolean A;
    public boolean B;
    public float C;
    public View[] D;

    public float getProgress() {
        return this.C;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.F);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.A = obtainStyledAttributes.getBoolean(index, this.A);
                } else if (index == 0) {
                    this.B = obtainStyledAttributes.getBoolean(index, this.B);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.C = f;
        int i10 = 0;
        if (this.f1357t > 0) {
            this.D = j((ConstraintLayout) getParent());
            while (i10 < this.f1357t) {
                View view = this.D[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof MotionHelper;
            i10++;
        }
    }

    public void a() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.c
    public final void b() {
    }
}
