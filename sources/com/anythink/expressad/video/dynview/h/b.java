package com.anythink.expressad.video.dynview.h;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import com.anythink.expressad.video.dynview.c;
import com.huawei.hms.ads.gl;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: com.anythink.expressad.video.dynview.h.b$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11475a;

        public AnonymousClass5(View view) {
            this.f11475a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f11475a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f11475a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.h.b$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11477a;

        public AnonymousClass6(View view) {
            this.f11477a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11477a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f11477a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    private static void a(Map map, c cVar, View view) {
        if (view != null) {
            com.anythink.expressad.video.dynview.i.a.a.a().a(map, cVar, view);
        }
    }

    private static PropertyValuesHolder b(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(gl.Code, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.6f), Keyframe.ofFloat(0.3f, 1.0f), Keyframe.ofFloat(0.4f, 1.0f), Keyframe.ofFloat(0.5f, 1.0f), Keyframe.ofFloat(0.6f, 1.0f), Keyframe.ofFloat(0.7f, 1.0f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    public static ObjectAnimator c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.ROTATION, 2.0f)).setDuration(900L);
        duration.setRepeatCount(-1);
        return duration;
    }

    public static void e(View view) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(gl.Code);
            view.animate().alpha(1.0f).setDuration(500L);
        }
    }

    private static TranslateAnimation f(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, gl.Code, 1, gl.Code, 1, 1.0f, 1, gl.Code);
        translateAnimation.setDuration(400L);
        view.setVisibility(0);
        return translateAnimation;
    }

    private static ObjectAnimator g(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X), a(View.SCALE_Y), a(View.ROTATION_X, 5.0f)).setDuration(2000L);
    }

    private static ObjectAnimator h(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X), b(View.SCALE_Y)).setDuration(2000L);
    }

    private static ObjectAnimator i(View view) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.ROTATION, 2.0f)).setDuration(900L);
    }

    public final void d(final View view) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(gl.Code).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: com.anythink.expressad.video.dynview.h.b.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 != null && (view2 instanceof ViewGroup)) {
                        ((ViewGroup) view2).removeAllViews();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 != null && (view2 instanceof ViewGroup)) {
                        ((ViewGroup) view2).removeAllViews();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    private void a(View view, long j10) {
        ValueAnimator ofInt;
        if (view == null) {
            return;
        }
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, r0);
        } else {
            ofInt = ValueAnimator.ofInt(r0, 0);
        }
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator ofFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(gl.Code, 1.0f) : ValueAnimator.ofFloat(1.0f, gl.Code);
        ofFloat.setDuration(j10);
        ofFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    public static ObjectAnimator b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X), b(View.SCALE_Y)).setDuration(2000L);
        duration.setRepeatCount(-1);
        return duration;
    }

    private void a(final View view, int i10, int i11, long j10) {
        ValueAnimator duration = ValueAnimator.ofInt(i10, i11).setDuration(j10);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    view.requestLayout();
                }
            }
        });
        duration.start();
    }

    private void a(final View view, int i10, int i11, int i12, int i13, long j10) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i12, i13);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.expressad.video.dynview.h.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(j10);
        animatorSet.start();
    }

    private void a(View view, int i10, long j10) {
        ValueAnimator ofInt;
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, i10);
        } else {
            ofInt = ValueAnimator.ofInt(i10, 0);
        }
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new AnonymousClass5(view));
        ValueAnimator ofFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(gl.Code, 1.0f) : ValueAnimator.ofFloat(1.0f, gl.Code);
        ofFloat.setDuration(j10);
        ofFloat.addUpdateListener(new AnonymousClass6(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    private static PropertyValuesHolder a(Property property) {
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(gl.Code, 1.0f), Keyframe.ofFloat(0.1f, 0.6f), Keyframe.ofFloat(0.2f, 0.8f), Keyframe.ofFloat(0.3f, 1.3f), Keyframe.ofFloat(0.4f, 0.8f), Keyframe.ofFloat(0.5f, 1.3f), Keyframe.ofFloat(0.6f, 0.9f), Keyframe.ofFloat(0.7f, 1.3f), Keyframe.ofFloat(0.8f, 1.0f), Keyframe.ofFloat(0.9f, 1.1f), Keyframe.ofFloat(1.0f, 1.0f));
    }

    private static PropertyValuesHolder a(Property property, float f) {
        float f10 = (-2.0f) * f;
        float f11 = f * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(gl.Code, gl.Code), Keyframe.ofFloat(0.1f, f10), Keyframe.ofFloat(0.2f, f10), Keyframe.ofFloat(0.3f, f11), Keyframe.ofFloat(0.4f, f10), Keyframe.ofFloat(0.5f, f11), Keyframe.ofFloat(0.6f, f10), Keyframe.ofFloat(0.7f, f11), Keyframe.ofFloat(0.8f, f10), Keyframe.ofFloat(0.9f, f11), Keyframe.ofFloat(1.0f, gl.Code));
    }

    public static ObjectAnimator a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X), a(View.SCALE_Y), a(View.ROTATION_X, 5.0f)).setDuration(2000L);
        duration.setRepeatCount(-1);
        return duration;
    }
}
