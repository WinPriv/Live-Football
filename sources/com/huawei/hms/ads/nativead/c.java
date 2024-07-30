package com.huawei.hms.ads.nativead;

import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.bx;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.views.NativeVideoView;
import com.huawei.openalliance.ad.views.VideoView;

/* loaded from: classes2.dex */
public class c implements VideoOperator {
    private boolean B;
    private VideoOperator.VideoLifecycleListener Code;
    private bx I;
    private b V;
    private MediaView Z;

    public c(bx bxVar) {
        this.B = false;
        this.I = bxVar;
        if (bxVar != null) {
            this.B = bxVar.Z();
        }
    }

    public MediaContent Code() {
        NativeVideoView I;
        b bVar = this.V;
        if (bVar == null || (I = bVar.I()) == null) {
            return null;
        }
        return I.getMediaContent();
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public float getAspectRatio() {
        bx bxVar = this.I;
        if (bxVar != null) {
            return bxVar.I();
        }
        return gl.Code;
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public VideoOperator.VideoLifecycleListener getVideoLifecycleListener() {
        return this.Code;
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public boolean hasVideo() {
        bx bxVar = this.I;
        if (bxVar != null && bxVar.Code()) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public boolean isClickToFullScreenEnabled() {
        return false;
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public boolean isCustomizeOperateEnabled() {
        return this.B;
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public boolean isMuted() {
        bx bxVar = this.I;
        if (bxVar != null && bxVar.V()) {
            return true;
        }
        return false;
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public void mute(boolean z10) {
        b bVar = this.V;
        if (bVar != null && this.B) {
            if (z10) {
                bVar.I().f23733r0.b();
            } else {
                bVar.I().f23733r0.c();
            }
        }
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public void pause() {
        b bVar;
        VideoView videoView;
        if (this.B && (bVar = this.V) != null && (videoView = bVar.I().f23725j0.f24109a) != null) {
            videoView.L();
        }
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public void play() {
        b bVar;
        if (this.B && (bVar = this.V) != null) {
            bVar.I().f23725j0.g(false);
        }
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public final void setVideoLifecycleListener(VideoOperator.VideoLifecycleListener videoLifecycleListener) {
        this.Code = videoLifecycleListener;
        b bVar = this.V;
        if (bVar != null) {
            bVar.Code(videoLifecycleListener);
        }
    }

    @Override // com.huawei.hms.ads.VideoOperator
    public void stop() {
        b bVar;
        if (this.B && (bVar = this.V) != null) {
            bVar.I().S();
        }
    }

    public final void Code(MediaView mediaView) {
        this.Z = mediaView;
        this.V = mediaView.getMediaViewAdapter();
        VideoOperator.VideoLifecycleListener videoLifecycleListener = this.Code;
        if (videoLifecycleListener != null) {
            setVideoLifecycleListener(videoLifecycleListener);
        }
    }
}
