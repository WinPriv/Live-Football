package com.huawei.hms.ads;

import com.huawei.hms.ads.annotation.GlobalApi;

@GlobalApi
/* loaded from: classes2.dex */
public interface VideoOperator {
    float getAspectRatio();

    VideoLifecycleListener getVideoLifecycleListener();

    boolean hasVideo();

    boolean isClickToFullScreenEnabled();

    boolean isCustomizeOperateEnabled();

    boolean isMuted();

    void mute(boolean z10);

    void pause();

    void play();

    void setVideoLifecycleListener(VideoLifecycleListener videoLifecycleListener);

    void stop();

    @GlobalApi
    /* loaded from: classes2.dex */
    public static abstract class VideoLifecycleListener {
        @GlobalApi
        public VideoLifecycleListener() {
        }

        @GlobalApi
        public void onVideoEnd() {
        }

        @GlobalApi
        public void onVideoPause() {
        }

        @GlobalApi
        public void onVideoPlay() {
        }

        @GlobalApi
        public void onVideoStart() {
        }

        @GlobalApi
        public void onVideoMute(boolean z10) {
        }
    }
}
