package h6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f28782a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28783b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f28784c;

    /* renamed from: d, reason: collision with root package name */
    public int f28785d;

    /* renamed from: e, reason: collision with root package name */
    public int f28786e;

    public h(long j10) {
        this.f28782a = 0L;
        this.f28783b = 300L;
        this.f28784c = null;
        this.f28785d = 0;
        this.f28786e = 1;
        this.f28782a = j10;
        this.f28783b = 150L;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f28782a);
        animator.setDuration(this.f28783b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f28785d);
            valueAnimator.setRepeatMode(this.f28786e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f28784c;
        if (timeInterpolator == null) {
            return a.f28769b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f28782a != hVar.f28782a || this.f28783b != hVar.f28783b || this.f28785d != hVar.f28785d || this.f28786e != hVar.f28786e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public final int hashCode() {
        long j10 = this.f28782a;
        long j11 = this.f28783b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f28785d) * 31) + this.f28786e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(h.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f28782a);
        sb2.append(" duration: ");
        sb2.append(this.f28783b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f28785d);
        sb2.append(" repeatMode: ");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f28786e, "}\n");
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f28782a = 0L;
        this.f28783b = 300L;
        this.f28784c = null;
        this.f28785d = 0;
        this.f28786e = 1;
        this.f28782a = j10;
        this.f28783b = j11;
        this.f28784c = timeInterpolator;
    }
}
