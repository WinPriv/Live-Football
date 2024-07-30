package com.huawei.openalliance.ad.ppskit.views;

import com.huawei.openalliance.ad.ppskit.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.y1;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VideoInfo f23411s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterstitialVideoView f23412t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.f23412t.B.setVideoFileUrl(dVar.f23411s.getVideoDownloadUrl());
            InterstitialVideoView interstitialVideoView = dVar.f23412t;
            interstitialVideoView.f23126x = true;
            if (interstitialVideoView.y) {
                interstitialVideoView.y = false;
                interstitialVideoView.s(true);
            }
            interstitialVideoView.B.A.m();
        }
    }

    public d(InterstitialVideoView interstitialVideoView, VideoInfo videoInfo) {
        this.f23412t = interstitialVideoView;
        this.f23411s = videoInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoInfo videoInfo = this.f23411s;
        if (y1.t(videoInfo.getVideoDownloadUrl()) || videoInfo.a(this.f23412t.getContext())) {
            d2.a(new a());
        }
    }
}
