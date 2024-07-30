package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.b;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet a(b bVar, float f, float f10, float f11) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(bVar, b.C0237b.f20639a, b.a.f20637b, new b.d(f, f10, f11));
        b.d revealInfo = bVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) bVar, (int) f, (int) f10, revealInfo.f20643c, f11);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
