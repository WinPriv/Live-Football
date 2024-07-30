package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.kl;

/* loaded from: classes2.dex */
public class LinkedSurfaceView extends RelativeLayout implements kl {

    /* renamed from: s, reason: collision with root package name */
    public BaseGlVideoView f23706s;

    /* renamed from: t, reason: collision with root package name */
    public int f23707t;

    /* renamed from: u, reason: collision with root package name */
    public int f23708u;

    public LinkedSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        BaseGlVideoView textureGlVideoView;
        if (Build.VERSION.SDK_INT >= 26) {
            textureGlVideoView = new SurfaceVideoView(context);
        } else {
            textureGlVideoView = new TextureGlVideoView(context);
        }
        this.f23706s = textureGlVideoView;
        addView(this.f23706s, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ex.V("LinkedSurfaceView", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.V("LinkedSurfaceView", "onDetachedFromWindow");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f23708u == 0 && this.f23707t == 0) {
            this.f23707t = i12 - i10;
            this.f23708u = i13 - i11;
        }
        if (this.f23706s.getVideoHeight() != 0 && (i14 = this.f23708u) != 0) {
            this.f23706s.Code(this.f23707t, i14);
            int i15 = this.f23707t;
            int i16 = this.f23708u;
            this.f23706s.c((r2.getVideoWidth() * 1.0f) / this.f23706s.getVideoHeight(), (i15 * 1.0f) / i16, i15, i16);
        }
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z10) {
        this.f23706s.setAutoScaleResizeLayoutOnVideoSizeChange(z10);
    }

    public void setNeedPauseOnSurfaceDestory(boolean z10) {
        this.f23706s.setNeedPauseOnSurfaceDestory(z10);
    }

    public void setScreenOnWhilePlaying(boolean z10) {
        this.f23706s.setScreenOnWhilePlaying(z10);
    }

    public void setVideoRatio(Float f) {
        this.f23706s.setVideoRatio(f);
    }

    public void setVideoScaleMode(int i10) {
        this.f23706s.setVideoScaleMode(i10);
    }
}
