package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.q;
import java.util.HashMap;

/* compiled from: TextScale.java */
/* loaded from: classes2.dex */
public final class i extends androidx.transition.i {

    /* compiled from: TextScale.java */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f20880a;

        public a(TextView textView) {
            this.f20880a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f20880a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // androidx.transition.i
    public final void d(q qVar) {
        View view = qVar.f2491b;
        if (view instanceof TextView) {
            qVar.f2490a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.i
    public final void g(q qVar) {
        View view = qVar.f2491b;
        if (view instanceof TextView) {
            qVar.f2490a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.i
    public final Animator k(ViewGroup viewGroup, q qVar, q qVar2) {
        float f;
        if (qVar == null || qVar2 == null || !(qVar.f2491b instanceof TextView)) {
            return null;
        }
        View view = qVar2.f2491b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = qVar.f2490a;
        HashMap hashMap2 = qVar2.f2490a;
        float f10 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f10 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f == f10) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f10);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
