package com.anythink.expressad.playercommon;

import a3.l;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class DefaultVideoPlayerStatusListener implements VideoPlayerStatusListener {
    protected static final String TAG = "DefaultVideoPlayerStatusListener";

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        o.a(TAG, "OnBufferingEnd");
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        l.C(str, "OnBufferingStart:", TAG);
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        o.a(TAG, "onPlayCompleted");
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        l.C(str, "onPlayError:", TAG);
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        o.a(TAG, "onPlayProgress:" + i10 + ",allDuration:" + i11);
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        o.a(TAG, "onPlayProgressMS:");
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        l.C(str, "onPlaySetDataSourceError:", TAG);
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        l.u(i10, "onPlayStarted:", TAG);
    }

    @Override // com.anythink.expressad.playercommon.VideoPlayerStatusListener
    public void onVideoDownloadResume() {
        o.a(TAG, "onVideoDownloadResume:");
    }
}
