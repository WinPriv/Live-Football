package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f21151b;

    public /* synthetic */ a(n nVar, int i10) {
        this.f21150a = i10;
        this.f21151b = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f21150a;
        n nVar = this.f21151b;
        switch (i10) {
            case 0:
                f fVar = (f) nVar;
                fVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = fVar.f21183d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
            default:
                m mVar = (m) nVar;
                mVar.getClass();
                mVar.f21183d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
