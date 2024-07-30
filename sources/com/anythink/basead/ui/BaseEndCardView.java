package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.RelativeLayout;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.u;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public abstract class BaseEndCardView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected String f4144a;

    /* renamed from: b, reason: collision with root package name */
    protected i f4145b;

    /* renamed from: c, reason: collision with root package name */
    protected j f4146c;

    /* renamed from: d, reason: collision with root package name */
    protected k f4147d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4148e;

    public BaseEndCardView(Context context, i iVar, j jVar) {
        super(context);
        this.f4144a = getClass().getSimpleName();
        super.setWillNotDraw(false);
        this.f4145b = iVar;
        this.f4146c = jVar;
        this.f4147d = jVar.f5664m;
    }

    private static RectF a(int i10, int i11) {
        int i12 = i10 / 2;
        float f = i11;
        int i13 = (int) (1.0f * f);
        RectF rectF = new RectF();
        rectF.left = i12 - i13;
        rectF.top = i11 - (i13 * 2);
        rectF.right = i12 + i13;
        rectF.bottom = f;
        return rectF;
    }

    public abstract void a();

    @Override // android.view.View
    public void draw(Canvas canvas) {
        try {
            if (this.f4148e) {
                int saveLayer = canvas.saveLayer(gl.Code, gl.Code, getWidth(), getHeight(), null, 31);
                super.draw(canvas);
                int width = getWidth();
                int height = getHeight();
                int width2 = getWidth();
                int i10 = width2 / 2;
                float height2 = getHeight();
                int i11 = (int) (1.0f * height2);
                RectF rectF = new RectF();
                rectF.left = i10 - i11;
                rectF.top = r4 - (i11 * 2);
                rectF.right = i10 + i11;
                rectF.bottom = height2;
                u.a(canvas, width, height, rectF);
                canvas.restoreToCount(saveLayer);
                return;
            }
        } catch (Exception unused) {
        }
        super.draw(canvas);
    }

    public void setNeedArc(boolean z10) {
        this.f4148e = z10;
        invalidate();
    }
}
