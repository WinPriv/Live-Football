package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: s, reason: collision with root package name */
    public MotionLayout f1355s;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(null);
        if (this.f1355s == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f1355s = (MotionLayout) parent;
                return;
            }
            return;
        }
        getWidth();
        getHeight();
        this.f1355s.getClass();
        throw null;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence.toString();
        requestLayout();
    }
}
