package com.anythink.expressad.video.dynview.i;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {
    private static PointF a(float f, PointF pointF, PointF pointF2, PointF pointF3) {
        PointF pointF4 = new PointF();
        float f10 = 1.0f - f;
        float f11 = f10 * f10;
        float f12 = 2.0f * f * f10;
        float f13 = f * f;
        pointF4.x = (pointF3.x * f13) + (pointF2.x * f12) + (pointF.x * f11);
        pointF4.y = (f13 * pointF3.y) + (f12 * pointF2.y) + (f11 * pointF.y);
        return pointF4;
    }

    private static PointF a(float f, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        PointF pointF5 = new PointF();
        float f10 = 1.0f - f;
        pointF5.x = (pointF4.x * f * f * f) + (pointF3.x * 3.0f * f * f * f10) + (pointF2.x * 3.0f * f * f10 * f10) + (pointF.x * f10 * f10 * f10);
        pointF5.y = (pointF4.y * f * f * f) + (pointF3.y * 3.0f * f * f * f10) + (pointF2.y * 3.0f * f * f10 * f10) + (pointF.y * f10 * f10 * f10);
        return pointF5;
    }
}
