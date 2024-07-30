package com.huawei.hms.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import gb.w0;

/* loaded from: classes2.dex */
public class n extends Drawable implements m {
    private static final String Code = "DrawableWrapper";
    private String B;
    private String C;
    private String I;
    private Drawable V;
    private com.huawei.openalliance.ad.inter.data.h Z;
    private volatile boolean S = false;
    private Drawable.Callback F = new Drawable.Callback() { // from class: com.huawei.hms.ads.n.1
        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            n.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            n.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            n.this.unscheduleSelf(runnable);
        }
    };

    public n(com.huawei.openalliance.ad.inter.data.h hVar) {
        this.Z = hVar;
    }

    private SourceParam Code(com.huawei.openalliance.ad.inter.data.h hVar) {
        SourceParam sourceParam = new SourceParam();
        sourceParam.i(hVar.f22260s);
        sourceParam.b();
        sourceParam.k(hVar.f22263v);
        sourceParam.l(hVar.f22264w);
        sourceParam.h();
        return sourceParam;
    }

    private void V() {
        Context Z = k.Code().Z();
        if (Z == null) {
            ex.I(Code, com.anythink.expressad.foundation.g.b.b.f9831a);
            return;
        }
        this.S = true;
        w0.f(Z, Code(this.Z), new gb.j() { // from class: com.huawei.hms.ads.n.2
            @Override // gb.j
            public void Code() {
                ex.I(n.Code, "image load fail");
                n.this.S = false;
            }

            @Override // gb.j
            public void Code(String str, final Drawable drawable) {
                if (n.this.Z == null || !TextUtils.equals(str, n.this.Z.f22260s)) {
                    return;
                }
                gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.n.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        n.this.S = false;
                        n.this.Code(drawable);
                    }
                });
            }
        }, this.B, this.C);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.V;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return com.anythink.expressad.exoplayer.k.p.f9095b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.V;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.V;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.V;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.getOutline(outline);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.V;
        if (drawable != null && drawable.getPadding(rect)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.V;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i10) {
        Drawable drawable = this.V;
        if (drawable != null && drawable.setLayoutDirection(i10)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.V;
        if (drawable != null && drawable.setLevel(i10)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.V;
        if (drawable != null && drawable.isStateful()) {
            boolean state = this.V.setState(iArr);
            if (state) {
                onBoundsChange(getBounds());
            }
            return state;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f10) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setHotspot(f, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean z12;
        if (this.V == null && !this.S) {
            V();
        }
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.V;
        if (drawable != null && drawable.setVisible(z10, z11)) {
            z12 = true;
        } else {
            z12 = false;
        }
        return z12 | visible;
    }

    public n(String str) {
        this.I = str;
    }

    public void V(String str) {
        this.C = str;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        Drawable drawable = this.V;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public String Code() {
        return this.I;
    }

    @Override // com.huawei.hms.ads.m
    public void Code(Drawable drawable) {
        ex.Code(Code, "setDrawable %s for %s", drawable, androidx.transition.n.e(this.I));
        Drawable drawable2 = this.V;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.V = drawable;
        if (drawable != null) {
            drawable.setVisible(isVisible(), true);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (drawable instanceof dt) {
                ((dt) drawable).Code(this.F);
            } else {
                drawable.setCallback(this.F);
            }
            drawable.setLayoutDirection(getLayoutDirection());
        }
        invalidateSelf();
    }

    public void Code(String str) {
        this.B = str;
    }
}
