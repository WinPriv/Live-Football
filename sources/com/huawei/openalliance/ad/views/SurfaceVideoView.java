package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.splash.R;

/* loaded from: classes2.dex */
public class SurfaceVideoView extends BaseGlVideoView {
    public final int Z0;

    /* loaded from: classes2.dex */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            SurfaceVideoView.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceVideoView surfaceVideoView = SurfaceVideoView.this;
            ex.V(surfaceVideoView.getLogTag(), "surfaceCreated");
            surfaceHolder.getSurface();
            surfaceVideoView.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SurfaceVideoView.this.getClass();
        }
    }

    public SurfaceVideoView(Context context) {
        super(context);
        this.Z0 = hashCode();
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.hiad_surfaceview_video, this);
        ((SurfaceView) findViewById(R.id.hiad_id_video_surface_view)).getHolder().addCallback(aVar);
    }

    @Override // com.huawei.openalliance.ad.views.BaseGlVideoView
    public String getLogTag() {
        return "SurfaceVideoView" + this.Z0;
    }
}
