package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public final class z extends y {
    @Override // androidx.transition.y, a0.a
    public final void W0(int i10, View view) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.v
    public final float Z0(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.v
    public final void a1(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.w
    public final void b1(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.w
    public final void c1(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.x
    public final void d1(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
