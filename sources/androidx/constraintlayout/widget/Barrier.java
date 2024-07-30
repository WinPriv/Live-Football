package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import q.e;
import u.d;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int A;
    public int B;
    public u.a C;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.C.f35596v0;
    }

    public int getMargin() {
        return this.C.f35597w0;
    }

    public int getType() {
        return this.A;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.C = new u.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.C.f35596v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.C.f35597w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1359v = this.C;
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(d dVar, boolean z10) {
        int i10 = this.A;
        this.B = i10;
        if (z10) {
            if (i10 == 5) {
                this.B = 1;
            } else if (i10 == 6) {
                this.B = 0;
            }
        } else if (i10 == 5) {
            this.B = 0;
        } else if (i10 == 6) {
            this.B = 1;
        }
        if (dVar instanceof u.a) {
            ((u.a) dVar).f35595u0 = this.B;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.C.f35596v0 = z10;
    }

    public void setDpMargin(int i10) {
        this.C.f35597w0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.C.f35597w0 = i10;
    }

    public void setType(int i10) {
        this.A = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
