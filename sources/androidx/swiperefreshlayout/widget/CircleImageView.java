package androidx.swiperefreshlayout.widget;

import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
class CircleImageView extends ImageView {
    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }
}
