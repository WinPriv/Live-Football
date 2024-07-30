package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import q.e;
import u.d;
import u.f;
import u.k;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public f C;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.C = new f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.C.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    f fVar = this.C;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.f35704u0 = dimensionPixelSize;
                    fVar.f35705v0 = dimensionPixelSize;
                    fVar.f35706w0 = dimensionPixelSize;
                    fVar.f35707x0 = dimensionPixelSize;
                } else if (index == 18) {
                    f fVar2 = this.C;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.f35706w0 = dimensionPixelSize2;
                    fVar2.y0 = dimensionPixelSize2;
                    fVar2.f35708z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.C.f35707x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.C.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.C.f35704u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.C.f35708z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.C.f35705v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.C.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.C.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.C.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.C.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.C.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.C.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.C.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.C.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.C.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.C.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.C.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.C.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.C.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.C.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.C.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.C.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.C.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.C.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1359v = this.C;
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(d dVar, boolean z10) {
        f fVar = this.C;
        int i10 = fVar.f35706w0;
        if (i10 > 0 || fVar.f35707x0 > 0) {
            if (z10) {
                fVar.y0 = fVar.f35707x0;
                fVar.f35708z0 = i10;
            } else {
                fVar.y0 = i10;
                fVar.f35708z0 = fVar.f35707x0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        p(this.C, i10, i11);
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

    public void setFirstHorizontalBias(float f) {
        this.C.N0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.C.H0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.C.O0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.C.I0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.C.T0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.C.L0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.C.R0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.C.F0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.C.P0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.C.J0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.C.Q0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.C.K0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.C.W0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.C.X0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        f fVar = this.C;
        fVar.f35704u0 = i10;
        fVar.f35705v0 = i10;
        fVar.f35706w0 = i10;
        fVar.f35707x0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.C.f35705v0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.C.y0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.C.f35708z0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.C.f35704u0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.C.U0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.C.M0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.C.S0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.C.G0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.C.V0 = i10;
        requestLayout();
    }
}
