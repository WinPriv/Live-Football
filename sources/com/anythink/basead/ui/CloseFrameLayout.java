package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.anythink.core.common.k.u;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class CloseFrameLayout extends FrameLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4223a = "CloseFrameLayout";

    /* renamed from: b, reason: collision with root package name */
    private float f4224b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f4225c;

    public CloseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4224b = 1.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        if (this.f4224b < 1.0f && (((action = motionEvent.getAction()) == 0 || action == 5) && !this.f4225c.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.anythink.basead.ui.a
    public void setClickAreaScaleFactor(float f) {
        this.f4224b = f;
        if (f <= gl.Code) {
            this.f4224b = 1.0f;
        }
        float f10 = this.f4224b;
        if (f10 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseFrameLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseFrameLayout.this.f4225c = new Rect();
                    CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
                    closeFrameLayout.getHitRect(closeFrameLayout.f4225c);
                    int width = ((int) ((CloseFrameLayout.this.f4224b - 1.0f) * CloseFrameLayout.this.f4225c.width())) / 2;
                    int height = ((int) ((CloseFrameLayout.this.f4224b - 1.0f) * CloseFrameLayout.this.f4225c.height())) / 2;
                    CloseFrameLayout.this.f4225c.top -= height;
                    CloseFrameLayout.this.f4225c.bottom += height;
                    CloseFrameLayout.this.f4225c.left -= width;
                    CloseFrameLayout.this.f4225c.right += width;
                }
            });
        } else if (f10 > 1.0f) {
            u.a(this, f10);
        }
    }
}
