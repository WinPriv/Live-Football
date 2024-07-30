package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f36794a;

    public j(k kVar) {
        this.f36794a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        k kVar = this.f36794a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = kVar.f36800x;
        if (arrayList != null && !kVar.y) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n1.c) it.next()).a(kVar);
            }
        }
    }
}
