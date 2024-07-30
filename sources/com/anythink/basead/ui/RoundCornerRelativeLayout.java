package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.core.common.k.h;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private Path f4412a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f4413b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f4414c;

    /* renamed from: d, reason: collision with root package name */
    private float f4415d;

    public RoundCornerRelativeLayout(Context context) {
        super(context);
        this.f4415d = gl.Code;
        a();
    }

    private void a() {
        this.f4415d = h.a(getContext(), 12.0f);
        this.f4412a = new Path();
        this.f4413b = new Paint(1);
        this.f4414c = new RectF();
        this.f4413b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Path b() {
        this.f4412a.reset();
        Path path = this.f4412a;
        RectF rectF = this.f4414c;
        float f = this.f4415d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f4412a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        this.f4412a.reset();
        Path path = this.f4412a;
        RectF rectF = this.f4414c;
        float f = this.f4415d;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.f4412a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f4414c.set(gl.Code, gl.Code, i10, i11);
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4415d = gl.Code;
        a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4415d = gl.Code;
        a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4415d = gl.Code;
        a();
    }
}
