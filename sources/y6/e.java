package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f36778a;

    public e(f fVar) {
        this.f36778a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        f fVar = this.f36778a;
        fVar.c();
        n1.c cVar = fVar.f36789k;
        if (cVar != null) {
            cVar.a((n) fVar.f36804a);
        }
    }
}
