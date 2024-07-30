package i6;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes2.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f29176a;

    public c(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f29176a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29176a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
