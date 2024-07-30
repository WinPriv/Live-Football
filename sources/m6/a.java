package m6;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d7.g;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f32905a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f32905a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f32905a.f20547i;
        if (gVar != null) {
            g.b bVar = gVar.f27403s;
            if (bVar.f27419j != floatValue) {
                bVar.f27419j = floatValue;
                gVar.f27407w = true;
                gVar.invalidateSelf();
            }
        }
    }
}
