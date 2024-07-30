package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.huawei.hms.ads.gl;
import q.e;
import u.k;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {
    public boolean A;
    public boolean B;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.A = true;
                } else if (index == 22) {
                    this.B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A || this.B) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f1357t; i10++) {
                    View b10 = constraintLayout.b(this.f1356s[i10]);
                    if (b10 != null) {
                        if (this.A) {
                            b10.setVisibility(visibility);
                        }
                        if (this.B && elevation > gl.Code) {
                            b10.setTranslationZ(b10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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

    public void p(k kVar, int i10, int i11) {
    }
}
