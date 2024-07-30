package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.ads.gl;
import q.e;
import u.d;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public float A;
    public float B;
    public float C;
    public ConstraintLayout D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public View[] M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f34521z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.P = true;
                } else if (index == 22) {
                    this.Q = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m() {
        q();
        this.G = Float.NaN;
        this.H = Float.NaN;
        d dVar = ((ConstraintLayout.a) getLayoutParams()).f1401q0;
        dVar.O(0);
        dVar.L(0);
        p();
        layout(((int) this.K) - getPaddingLeft(), ((int) this.L) - getPaddingTop(), getPaddingRight() + ((int) this.I), getPaddingBottom() + ((int) this.J));
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(ConstraintLayout constraintLayout) {
        this.D = constraintLayout;
        float rotation = getRotation();
        if (rotation == gl.Code) {
            if (!Float.isNaN(this.C)) {
                this.C = rotation;
                return;
            }
            return;
        }
        this.C = rotation;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = (ConstraintLayout) getParent();
        if (this.P || this.Q) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f1357t; i10++) {
                View b10 = this.D.b(this.f1356s[i10]);
                if (b10 != null) {
                    if (this.P) {
                        b10.setVisibility(visibility);
                    }
                    if (this.Q && elevation > gl.Code) {
                        b10.setTranslationZ(b10.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void p() {
        if (this.D == null) {
            return;
        }
        if (!Float.isNaN(this.G) && !Float.isNaN(this.H)) {
            return;
        }
        if (!Float.isNaN(this.A) && !Float.isNaN(this.B)) {
            this.H = this.B;
            this.G = this.A;
            return;
        }
        View[] j10 = j(this.D);
        int left = j10[0].getLeft();
        int top = j10[0].getTop();
        int right = j10[0].getRight();
        int bottom = j10[0].getBottom();
        for (int i10 = 0; i10 < this.f1357t; i10++) {
            View view = j10[i10];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.I = right;
        this.J = bottom;
        this.K = left;
        this.L = top;
        if (Float.isNaN(this.A)) {
            this.G = (left + right) / 2;
        } else {
            this.G = this.A;
        }
        if (Float.isNaN(this.B)) {
            this.H = (top + bottom) / 2;
        } else {
            this.H = this.B;
        }
    }

    public final void q() {
        int i10;
        if (this.D == null || (i10 = this.f1357t) == 0) {
            return;
        }
        View[] viewArr = this.M;
        if (viewArr == null || viewArr.length != i10) {
            this.M = new View[i10];
        }
        for (int i11 = 0; i11 < this.f1357t; i11++) {
            this.M[i11] = this.D.b(this.f1356s[i11]);
        }
    }

    public final void r() {
        double radians;
        if (this.D == null) {
            return;
        }
        if (this.M == null) {
            q();
        }
        p();
        if (Float.isNaN(this.C)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.C);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.E;
        float f10 = f * cos;
        float f11 = this.F;
        float f12 = (-f11) * sin;
        float f13 = f * sin;
        float f14 = f11 * cos;
        for (int i10 = 0; i10 < this.f1357t; i10++) {
            View view = this.M[i10];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f15 = right - this.G;
            float f16 = bottom - this.H;
            float f17 = (((f12 * f16) + (f10 * f15)) - f15) + this.N;
            float f18 = (((f14 * f16) + (f15 * f13)) - f16) + this.O;
            view.setTranslationX(f17);
            view.setTranslationY(f18);
            view.setScaleY(this.F);
            view.setScaleX(this.E);
            if (!Float.isNaN(this.C)) {
                view.setRotation(this.C);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.A = f;
        r();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.B = f;
        r();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.C = f;
        r();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.E = f;
        r();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.F = f;
        r();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.N = f;
        r();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.O = f;
        r();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        f();
    }
}
