package h7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* compiled from: ExpandableTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f28787a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f28787a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f28787a.f21241b = null;
    }
}
