package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f36793a;

    public i(k kVar) {
        this.f36793a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        k kVar = this.f36793a;
        ArrayList arrayList = kVar.f36800x;
        if (arrayList != null && !kVar.y) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n1.c) it.next()).b(kVar);
            }
        }
    }
}
