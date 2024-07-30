package n1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f33158a;

    public e(d dVar) {
        this.f33158a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f33158a;
        ArrayList arrayList = new ArrayList(dVar.f33150w);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).a(dVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f33158a;
        ArrayList arrayList = new ArrayList(dVar.f33150w);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).b(dVar);
        }
    }
}
