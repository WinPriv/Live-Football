package com.anythink.basead.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.anythink.core.common.k.u;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    int f4493a;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f4493a = dip2px(getContext(), 10.0f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        u.a(canvas, getWidth(), getHeight(), this.f4493a);
        canvas.restoreToCount(saveLayer);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4493a = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4493a = dip2px(getContext(), 10.0f);
    }
}
