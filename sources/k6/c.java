package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30877a;

    public c(BottomAppBar bottomAppBar) {
        this.f30877a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = BottomAppBar.D0;
        BottomAppBar bottomAppBar = this.f30877a;
        bottomAppBar.getClass();
        bottomAppBar.f20512t0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = BottomAppBar.D0;
        this.f30877a.getClass();
    }
}
