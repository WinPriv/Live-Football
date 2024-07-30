package com.anythink.core.activity.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class LoadingView extends ImageView {
    public LoadingView(Context context) {
        super(context);
        a();
    }

    private void a() {
        setImageDrawable(getResources().getDrawable(h.a(getContext(), "core_loading", i.f10125c)));
        try {
            setLayerType(2, null);
        } catch (Exception unused) {
        }
        a(this);
    }

    public void startAnimation() {
        a(this);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private static void a(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(gl.Code, 360.0f, 1, 0.5f, 1, 0.5f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(linearInterpolator);
        rotateAnimation.setDuration(1000L);
        view.startAnimation(rotateAnimation);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
