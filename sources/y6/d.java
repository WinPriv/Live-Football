package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f36777a;

    public d(f fVar) {
        this.f36777a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        f fVar = this.f36777a;
        fVar.f36786h = (fVar.f36786h + 4) % fVar.f36785g.f36771c.length;
    }
}
