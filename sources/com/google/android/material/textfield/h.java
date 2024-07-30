package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes2.dex */
public class h extends d7.g {
    public static final /* synthetic */ int Q = 0;
    public final RectF P;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    /* loaded from: classes2.dex */
    public static class a extends h {
        public a(d7.j jVar) {
            super(jVar);
        }

        @Override // d7.g
        public final void g(Canvas canvas) {
            RectF rectF = this.P;
            if (rectF.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(rectF);
            } else {
                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public h(d7.j jVar) {
        super(jVar == null ? new d7.j() : jVar);
        this.P = new RectF();
    }

    public final void o(float f, float f10, float f11, float f12) {
        RectF rectF = this.P;
        if (f != rectF.left || f10 != rectF.top || f11 != rectF.right || f12 != rectF.bottom) {
            rectF.set(f, f10, f11, f12);
            invalidateSelf();
        }
    }
}
