package com.anythink.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.u;
import com.anythink.core.common.res.image.RecycleImageView;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class RoundImageView extends RecycleImageView {

    /* renamed from: a, reason: collision with root package name */
    int f6533a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6534b;

    public RoundImageView(Context context) {
        super(context);
        this.f6533a = h.a(getContext(), 5.0f);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            if (this.f6534b) {
                int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
                super.dispatchDraw(canvas);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                u.a(canvas, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.f6533a);
                canvas.restoreToCount(saveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (this.f6534b) {
                int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
                super.onDraw(canvas);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                u.a(canvas, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.f6533a);
                canvas.restoreToCount(saveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
    }

    public void setNeedRadiu(boolean z10) {
        this.f6534b = z10;
    }

    public void setRadiusInDip(int i10) {
        this.f6533a = h.a(getContext(), i10);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6533a = h.a(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6533a = h.a(getContext(), 5.0f);
    }
}
