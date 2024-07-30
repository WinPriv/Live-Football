package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class GhostViewHolder extends FrameLayout {
    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() != 1 || getChildAt(0) != view) && getChildCount() != 0) {
        } else {
            throw null;
        }
    }
}
