package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import com.hamkho.livefoot.R;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public final class m {
    public static a a(Context context, Fragment fragment, boolean z10, boolean z11) {
        int exitAnim;
        int i10;
        int nextTransition = fragment.getNextTransition();
        if (z11) {
            if (z10) {
                exitAnim = fragment.getPopEnterAnim();
            } else {
                exitAnim = fragment.getPopExitAnim();
            }
        } else if (z10) {
            exitAnim = fragment.getEnterAnim();
        } else {
            exitAnim = fragment.getExitAnim();
        }
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, exitAnim);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, exitAnim);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (exitAnim == 0 && nextTransition != 0) {
            if (nextTransition != 4097) {
                if (nextTransition != 4099) {
                    if (nextTransition != 8194) {
                        i10 = -1;
                    } else if (z10) {
                        i10 = R.animator.fragment_close_enter;
                    } else {
                        i10 = R.animator.fragment_close_exit;
                    }
                } else if (z10) {
                    i10 = R.animator.fragment_fade_enter;
                } else {
                    i10 = R.animator.fragment_fade_exit;
                }
            } else if (z10) {
                i10 = R.animator.fragment_open_enter;
            } else {
                i10 = R.animator.fragment_open_exit;
            }
            exitAnim = i10;
        }
        if (exitAnim != 0) {
            boolean equals = com.anythink.expressad.foundation.h.i.f.equals(context.getResources().getResourceTypeName(exitAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f1855a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f1856b;

        public a(Animation animation) {
            this.f1855a = animation;
            this.f1856b = null;
        }

        public a(Animator animator) {
            this.f1855a = null;
            this.f1856b = animator;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final ViewGroup f1857s;

        /* renamed from: t, reason: collision with root package name */
        public final View f1858t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f1859u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f1860v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f1861w;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1861w = true;
            this.f1857s = viewGroup;
            this.f1858t = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f1861w = true;
            if (this.f1859u) {
                return !this.f1860v;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f1859u = true;
                n0.v.a(this.f1857s, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f1859u;
            ViewGroup viewGroup = this.f1857s;
            if (!z10 && this.f1861w) {
                this.f1861w = false;
                viewGroup.post(this);
            } else {
                viewGroup.endViewTransition(this.f1858t);
                this.f1860v = true;
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f) {
            this.f1861w = true;
            if (this.f1859u) {
                return !this.f1860v;
            }
            if (!super.getTransformation(j10, transformation, f)) {
                this.f1859u = true;
                n0.v.a(this.f1857s, this);
            }
            return true;
        }
    }
}
