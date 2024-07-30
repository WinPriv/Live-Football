package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScanningView f24153a;

    public q(ScanningView scanningView) {
        this.f24153a = scanningView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ScanningView scanningView = this.f24153a;
        scanningView.setVisibility(8);
        Animator.AnimatorListener animatorListener = scanningView.C;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ScanningView scanningView = this.f24153a;
        scanningView.setVisibility(8);
        Animator.AnimatorListener animatorListener = scanningView.C;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ScanningView scanningView = this.f24153a;
        scanningView.setVisibility(0);
        Animator.AnimatorListener animatorListener = scanningView.C;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
