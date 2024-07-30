package androidx.constraintlayout.helper.widget;

import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* loaded from: classes.dex */
    public interface a {
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return 0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            if (this.f1357t > 0) {
                motionLayout.b(this.f1356s[0]);
                throw null;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.c
    public final void a() {
    }

    public void setAdapter(a aVar) {
    }
}
