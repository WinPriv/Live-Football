package v6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
public final class c extends d {
    public StateListAnimator I;

    public c(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f20787q.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(Rect rect) {
        boolean z10;
        if (FloatingActionButton.this.B) {
            super.f(rect);
            return;
        }
        boolean z11 = this.f20774b;
        FloatingActionButton floatingActionButton = this.f20787q;
        if (z11 && floatingActionButton.getSizeDimension() < 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int sizeDimension = (0 - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
        n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(float f, float f10, float f11) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f20787q;
        if (floatingActionButton.getStateListAnimator() == this.I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.C, o(f, f11));
            stateListAnimator.addState(d.D, o(f, f10));
            stateListAnimator.addState(d.E, o(f, f10));
            stateListAnimator.addState(d.F, o(f, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, gl.Code).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f20771x);
            stateListAnimator.addState(d.G, animatorSet);
            stateListAnimator.addState(d.H, o(gl.Code, gl.Code));
            this.I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!p()) {
            return;
        }
        n();
        throw null;
    }

    public final AnimatorSet o(float f, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f20787q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(d.f20771x);
        return animatorSet;
    }

    public final boolean p() {
        boolean z10;
        if (FloatingActionButton.this.B) {
            return true;
        }
        if (this.f20774b && this.f20787q.getSizeDimension() < 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void l() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void m() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i(int[] iArr) {
    }
}
