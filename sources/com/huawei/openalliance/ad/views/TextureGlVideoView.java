package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class TextureGlVideoView extends BaseGlVideoView {
    public final int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public SurfaceTexture f24105a1;

    /* renamed from: b1, reason: collision with root package name */
    public Surface f24106b1;

    public TextureGlVideoView(Context context) {
        super(context);
        this.Z0 = hashCode();
    }

    private void i() {
        Surface surface = this.f24106b1;
        if (surface != null) {
            surface.release();
            this.f24106b1 = null;
        }
        SurfaceTexture surfaceTexture = this.f24105a1;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f24105a1 = null;
        }
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView
    public final void Code(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_view_video, this);
        TextureView textureView = (TextureView) findViewById(R.id.hiad_id_video_texture_view);
        this.f23662c0 = textureView;
        textureView.setSurfaceTextureListener(this);
    }

    @Override // com.huawei.openalliance.ad.views.BaseGlVideoView
    public String getLogTag() {
        return "TextureGlVideoView" + this.Z0;
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ex.V(getLogTag(), "onAttachedToWindow");
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.V(getLogTag(), "onDetachedFromWindow");
        i();
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        i();
        this.f24105a1 = surfaceTexture;
        this.f24106b1 = new Surface(surfaceTexture);
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        return true;
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
