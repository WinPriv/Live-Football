package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
class ViewOverlayApi14$OverlayViewGroup extends ViewGroup {
    static {
        try {
            Class cls = Integer.TYPE;
            ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public ViewOverlayApi14$OverlayViewGroup() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
