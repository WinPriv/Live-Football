package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes2.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f36818a;

    public s(t tVar) {
        this.f36818a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        t tVar = this.f36818a;
        tVar.c();
        n1.c cVar = tVar.f36828k;
        if (cVar != null) {
            cVar.a((n) tVar.f36804a);
        }
    }
}
