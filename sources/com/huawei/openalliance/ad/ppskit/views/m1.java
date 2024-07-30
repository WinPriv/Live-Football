package com.huawei.openalliance.ad.ppskit.views;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import com.huawei.hms.ads.gl;
import ka.n7;
import ka.t6;

/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatorSet f23511a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f23512b;

    /* renamed from: c, reason: collision with root package name */
    public float f23513c;

    /* renamed from: d, reason: collision with root package name */
    public float f23514d;

    /* renamed from: e, reason: collision with root package name */
    public float f23515e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23516g;

    /* renamed from: h, reason: collision with root package name */
    public final float f23517h;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f23518a;

        public a(View view) {
            this.f23518a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            m1 m1Var = m1.this;
            try {
                m1Var.f23513c = ((Float) valueAnimator.getAnimatedValue(View.TRANSLATION_X.getName())).floatValue();
                m1Var.f23514d = ((Float) valueAnimator.getAnimatedValue(View.TRANSLATION_Y.getName())).floatValue();
                m1Var.f23515e = ((Float) valueAnimator.getAnimatedValue(View.SCALE_X.getName())).floatValue();
                m1Var.f = ((Float) valueAnimator.getAnimatedValue(View.SCALE_Y.getName())).floatValue();
                this.f23518a.postInvalidate();
            } catch (Throwable th) {
                n7.h("ParticleAnimator", "onAnimationUpdate: %s", th.getClass().getSimpleName());
            }
        }
    }

    public m1(float[][] fArr, int[] iArr, Bitmap bitmap, View view) {
        float height;
        this.f23512b = bitmap;
        float width = bitmap.getWidth();
        this.f23516g = width;
        float height2 = bitmap.getHeight();
        this.f23517h = height2;
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(gl.Code, view.getWidth() * fArr[0][0]), Keyframe.ofFloat(1.0f, (view.getWidth() * fArr[0][1]) - (width / 2.0f)));
        Property property = View.TRANSLATION_Y;
        Keyframe[] keyframeArr = new Keyframe[2];
        keyframeArr[0] = Keyframe.ofFloat(gl.Code, view.getHeight() * fArr[1][0]);
        if (fArr[1][1] < gl.Code) {
            height = (view.getHeight() * fArr[1][1]) - height2;
        } else {
            height = fArr[1][1] * view.getHeight();
        }
        keyframeArr[1] = Keyframe.ofFloat(1.0f, height);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofKeyframe, PropertyValuesHolder.ofKeyframe(property, keyframeArr), PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(gl.Code, fArr[2][0]), Keyframe.ofFloat(1.0f, fArr[2][1])), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(gl.Code, fArr[2][0]), Keyframe.ofFloat(1.0f, fArr[2][1])));
        ofPropertyValuesHolder.setInterpolator(new t6(1.0f, 1.0f));
        ofPropertyValuesHolder.setDuration(iArr[1] + 80);
        ofPropertyValuesHolder.addUpdateListener(new a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f23511a = animatorSet;
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(gl.Code, 1.0f), Keyframe.ofFloat(1.0f, 1.0f));
        ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(ofKeyframe2);
        ofPropertyValuesHolder2.setDuration(iArr[0]);
        ValueAnimator ofPropertyValuesHolder3 = ValueAnimator.ofPropertyValuesHolder(ofKeyframe2);
        ofPropertyValuesHolder3.setDuration(((1400 - iArr[0]) - iArr[1]) - 80);
        animatorSet.playSequentially(ofPropertyValuesHolder2, ofPropertyValuesHolder, ofPropertyValuesHolder3);
    }
}
