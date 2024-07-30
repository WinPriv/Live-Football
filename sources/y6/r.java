package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f36817a;

    public r(t tVar) {
        this.f36817a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        t tVar = this.f36817a;
        tVar.f36825h = (tVar.f36825h + 1) % tVar.f36824g.f36771c.length;
        tVar.f36826i = true;
    }
}
