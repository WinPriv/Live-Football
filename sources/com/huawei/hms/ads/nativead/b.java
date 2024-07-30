package com.huawei.hms.ads.nativead;

import android.view.View;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.bw;
import com.huawei.openalliance.ad.inter.data.e;
import com.huawei.openalliance.ad.inter.data.j;
import com.huawei.openalliance.ad.inter.data.p;
import com.huawei.openalliance.ad.views.NativeVideoView;
import com.huawei.openalliance.ad.views.NativeWindowImageView;

/* loaded from: classes2.dex */
public class b {
    private p B;
    private e C;
    private NativeVideoView Code;
    private NativeAdConfiguration I;
    private NativeAd S;
    private NativeWindowImageView V;
    private VideoConfiguration Z;

    public b(NativeVideoView nativeVideoView, NativeWindowImageView nativeWindowImageView) {
        this.Code = nativeVideoView;
        this.V = nativeWindowImageView;
    }

    private boolean S() {
        if (this.C.b() != 13 && this.C.b() != 113) {
            return false;
        }
        return true;
    }

    public View B() {
        if (this.C == null) {
            return null;
        }
        if (S()) {
            return this.V;
        }
        return this.Code;
    }

    public void Code(final VideoOperator.VideoLifecycleListener videoLifecycleListener) {
        this.Code.setVideoEventListener(new NativeVideoView.g() { // from class: com.huawei.hms.ads.nativead.b.1
            boolean Code = true;

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void Code() {
                if (this.Code) {
                    videoLifecycleListener.onVideoStart();
                    this.Code = false;
                }
                videoLifecycleListener.onVideoPlay();
            }

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void I() {
                this.Code = true;
                videoLifecycleListener.onVideoEnd();
            }

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void V() {
                videoLifecycleListener.onVideoPause();
            }

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void Code(boolean z10) {
                videoLifecycleListener.onVideoMute(z10);
            }

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void V(boolean z10, int i10) {
            }

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void Code(boolean z10, int i10) {
            }

            @Override // com.huawei.openalliance.ad.views.NativeVideoView.g
            public void Z() {
            }
        });
    }

    public NativeVideoView I() {
        return this.Code;
    }

    public void Code(NativeAd nativeAd) {
        this.S = nativeAd;
        if (nativeAd instanceof bw) {
            Code(((bw) nativeAd).Code());
        }
    }

    private void Code(e eVar) {
        View view;
        if (eVar == null) {
            return;
        }
        this.C = eVar;
        this.B = eVar.B();
        e eVar2 = this.C;
        if (eVar2 instanceof j) {
            NativeAdConfiguration nativeAdConfiguration = ((j) eVar2).J;
            this.I = nativeAdConfiguration;
            if (nativeAdConfiguration != null) {
                this.Z = nativeAdConfiguration.getVideoConfiguration();
            }
        }
        if (S()) {
            this.Code.setVisibility(8);
            view = this.V;
        } else {
            this.V.setVisibility(8);
            view = this.Code;
        }
        view.setVisibility(0);
    }
}
