package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.views.BaseVideoView;

/* loaded from: classes2.dex */
public class VideoView extends BaseVideoView {
    public VideoView(Context context) {
        super(context);
    }

    public final void B() {
        TextureView textureView = this.f23662c0;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            ViewParent parent = this.f23662c0.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f23662c0);
            }
            TextureView textureView2 = new TextureView(getContext());
            this.f23662c0 = textureView2;
            textureView2.setSurfaceTextureListener(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.f23662c0, layoutParams);
        }
        Surface surface = this.A0;
        if (surface != null) {
            surface.release();
        }
        this.A0 = null;
        this.B0 = null;
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView
    public final void Code(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_view_video, this);
        TextureView textureView = (TextureView) findViewById(R.id.hiad_id_video_texture_view);
        this.f23662c0 = textureView;
        textureView.setSurfaceTextureListener(this);
    }

    public Bitmap getSurfaceBitmap() {
        return this.f23662c0.getBitmap();
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ex.V("BaseVideoView", "resetVideoView");
        if (this.f23665f0.d() <= 1) {
            this.f23665f0.Code((Surface) null);
            this.f23665f0.b();
        }
        ia.a aVar = this.f23666g0;
        if (aVar != null) {
            aVar.Code((Surface) null);
            this.f23666g0.b();
        }
        Surface surface = this.A0;
        if (surface != null) {
            surface.release();
            this.A0 = null;
        }
        SurfaceTexture surfaceTexture = this.B0;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.B0 = null;
        this.f23663d0 = false;
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ex.V("VideoView", "onSurfaceTextureAvailable width: %d height: %d", Integer.valueOf(i10), Integer.valueOf(i11));
        this.f23664e0 = true;
        Surface surface = this.A0;
        if (surface == null || this.B0 != surfaceTexture) {
            if (surface != null) {
                ex.V("VideoView", "release old surface when onSurfaceTextureAvailable");
                this.A0.release();
            }
            if (this.B0 != null) {
                ex.V("VideoView", "release old SurfaceTexture when onSurfaceTextureAvailable");
                this.B0.release();
            }
            Surface surface2 = new Surface(surfaceTexture);
            this.A0 = surface2;
            this.f23665f0.Code(surface2);
            this.B0 = surfaceTexture;
        }
        if (this.I0 == null) {
            BaseVideoView.p pVar = new BaseVideoView.p(this.N0);
            this.I0 = pVar;
            this.f23665f0.Code(pVar);
        }
        if (this.f23663d0) {
            h(this.C0);
        }
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ex.V("VideoView", "onSurfaceTextureDestroyed");
        this.f23664e0 = false;
        if (this.F0) {
            L();
        }
        BaseVideoView.o oVar = this.y0;
        if (oVar != null) {
            a0 a0Var = (a0) oVar;
            a0Var.j();
            a0Var.i(false);
        }
        if (this.A0 != null) {
            ex.V("VideoView", "release old surface when onSurfaceTextureDestroyed");
            this.A0.release();
            this.A0 = null;
        }
        if (this.B0 != null) {
            ex.V("VideoView", "release old surfaceTexture when onSurfaceTextureDestroyed");
            this.B0.release();
            this.B0 = null;
            return true;
        }
        return true;
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
