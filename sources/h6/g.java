package h6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import q.i;

/* compiled from: MotionSpec.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i<String, h> f28780a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    public final i<String, PropertyValuesHolder[]> f28781b = new i<>();

    public static g a(int i10, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public static g b(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f28781b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.f28770c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f28771d;
                    }
                } else {
                    interpolator = a.f28769b;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f28785d = objectAnimator.getRepeatCount();
                hVar.f28786e = objectAnimator.getRepeatMode();
                gVar.f28780a.put(propertyName, hVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h c(String str) {
        boolean z10;
        i<String, h> iVar = this.f28780a;
        if (iVar.getOrDefault(str, null) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return iVar.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f28780a.equals(((g) obj).f28780a);
    }

    public final int hashCode() {
        return this.f28780a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f28780a + "}\n";
    }
}
