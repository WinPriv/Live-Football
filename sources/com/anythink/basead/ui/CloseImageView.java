package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.anythink.core.common.k.u;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class CloseImageView extends ImageView implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4227a = "CloseImageView";

    /* renamed from: b, reason: collision with root package name */
    private float f4228b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f4229c;

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4228b = 1.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float f = this.f4228b;
        if (f > 1.0f) {
            u.a(this, f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        if (this.f4228b < 1.0f && (((action = motionEvent.getAction()) == 0 || action == 5) && !this.f4229c.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.anythink.basead.ui.a
    public void setClickAreaScaleFactor(float f) {
        this.f4228b = f;
        if (f <= gl.Code) {
            this.f4228b = 1.0f;
        }
        float f10 = this.f4228b;
        if (f10 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.f4229c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.f4229c);
                    int width = ((int) ((CloseImageView.this.f4228b - 1.0f) * CloseImageView.this.f4229c.width())) / 2;
                    int height = ((int) ((CloseImageView.this.f4228b - 1.0f) * CloseImageView.this.f4229c.height())) / 2;
                    CloseImageView.this.f4229c.top -= height;
                    CloseImageView.this.f4229c.bottom += height;
                    CloseImageView.this.f4229c.left -= width;
                    CloseImageView.this.f4229c.right += width;
                }
            });
        } else if (f10 > 1.0f) {
            u.a(this, f10);
        }
    }
}
