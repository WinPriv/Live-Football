package com.anythink.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.core.common.k.u;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class RoundRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    int f6535a;

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f6535a = dip2px(context, 4.0f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
        super.draw(canvas);
        u.a(canvas, getWidth(), getHeight(), this.f6535a);
        canvas.restoreToCount(saveLayer);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6535a = dip2px(context, 4.0f);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context);
    }
}
