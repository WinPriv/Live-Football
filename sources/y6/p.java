package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f36810a;

    public p(q qVar) {
        this.f36810a = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        q qVar = this.f36810a;
        qVar.f36814g = (qVar.f36814g + 1) % qVar.f.f36771c.length;
        qVar.f36815h = true;
    }
}
