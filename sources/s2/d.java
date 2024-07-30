package s2;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.activity.n;
import com.huawei.hms.ads.gl;
import g2.h;
import java.util.Iterator;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public final class d extends a implements Choreographer.FrameCallback {
    public h D;

    /* renamed from: v, reason: collision with root package name */
    public float f35105v = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35106w = false;

    /* renamed from: x, reason: collision with root package name */
    public long f35107x = 0;
    public float y = gl.Code;

    /* renamed from: z, reason: collision with root package name */
    public float f35108z = gl.Code;
    public int A = 0;
    public float B = -2.1474836E9f;
    public float C = 2.1474836E9f;
    public boolean E = false;
    public boolean F = false;

    public final float c() {
        h hVar = this.D;
        if (hVar == null) {
            return gl.Code;
        }
        float f = this.C;
        if (f == 2.1474836E9f) {
            return hVar.f28416l;
        }
        return f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f35101t.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(e());
        f(true);
    }

    public final float d() {
        h hVar = this.D;
        if (hVar == null) {
            return gl.Code;
        }
        float f = this.B;
        if (f == -2.1474836E9f) {
            return hVar.f28415k;
        }
        return f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        boolean z10;
        float d10;
        float c10;
        if (this.E) {
            f(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        h hVar = this.D;
        if (hVar != null && this.E) {
            long j11 = this.f35107x;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float abs = ((float) j12) / ((1.0E9f / hVar.f28417m) / Math.abs(this.f35105v));
            float f = this.y;
            if (e()) {
                abs = -abs;
            }
            float f10 = f + abs;
            float d11 = d();
            float c11 = c();
            PointF pointF = f.f35110a;
            if (f10 >= d11 && f10 <= c11) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            float f11 = this.y;
            float b10 = f.b(f10, d(), c());
            this.y = b10;
            if (this.F) {
                b10 = (float) Math.floor(b10);
            }
            this.f35108z = b10;
            this.f35107x = j10;
            if (!this.F || this.y != f11) {
                b();
            }
            if (z11) {
                if (getRepeatCount() != -1 && this.A >= getRepeatCount()) {
                    if (this.f35105v < gl.Code) {
                        c10 = d();
                    } else {
                        c10 = c();
                    }
                    this.y = c10;
                    this.f35108z = c10;
                    f(true);
                    a(e());
                } else {
                    Iterator it = this.f35101t.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.A++;
                    if (getRepeatMode() == 2) {
                        this.f35106w = !this.f35106w;
                        this.f35105v = -this.f35105v;
                    } else {
                        if (e()) {
                            d10 = c();
                        } else {
                            d10 = d();
                        }
                        this.y = d10;
                        this.f35108z = d10;
                    }
                    this.f35107x = j10;
                }
            }
            if (this.D != null) {
                float f12 = this.f35108z;
                if (f12 < this.B || f12 > this.C) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.B), Float.valueOf(this.C), Float.valueOf(this.f35108z)));
                }
            }
            n.s0();
        }
    }

    public final boolean e() {
        if (this.f35105v < gl.Code) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.E = false;
        }
    }

    public final void g(float f) {
        if (this.y == f) {
            return;
        }
        float b10 = f.b(f, d(), c());
        this.y = b10;
        if (this.F) {
            b10 = (float) Math.floor(b10);
        }
        this.f35108z = b10;
        this.f35107x = 0L;
        b();
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float d10;
        float c10;
        float d11;
        if (this.D == null) {
            return gl.Code;
        }
        if (e()) {
            d10 = c() - this.f35108z;
            c10 = c();
            d11 = d();
        } else {
            d10 = this.f35108z - d();
            c10 = c();
            d11 = d();
        }
        return d10 / (c10 - d11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f;
        h hVar = this.D;
        if (hVar == null) {
            f = gl.Code;
        } else {
            float f10 = this.f35108z;
            float f11 = hVar.f28415k;
            f = (f10 - f11) / (hVar.f28416l - f11);
        }
        return Float.valueOf(f);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.D == null) {
            return 0L;
        }
        return r0.b();
    }

    public final void h(float f, float f10) {
        float f11;
        float f12;
        if (f <= f10) {
            h hVar = this.D;
            if (hVar == null) {
                f11 = -3.4028235E38f;
            } else {
                f11 = hVar.f28415k;
            }
            if (hVar == null) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = hVar.f28416l;
            }
            float b10 = f.b(f, f11, f12);
            float b11 = f.b(f10, f11, f12);
            if (b10 != this.B || b11 != this.C) {
                this.B = b10;
                this.C = b11;
                g((int) f.b(this.f35108z, b10, b11));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f10)));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.E;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f35106w) {
            this.f35106w = false;
            this.f35105v = -this.f35105v;
        }
    }
}
