package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.io.Serializable;

@DataKeep
/* loaded from: classes2.dex */
public class VideoInfo implements Serializable {
    private static final long serialVersionUID = 5224357961234973073L;
    private Integer autoPlayAreaRatio;
    private Integer autoStopPlayAreaRatio;
    private int checkSha256Flag;
    private String originalDownloadUrl;
    private String sha256;
    private float splashSwitchTime;
    private String videoDownloadUrl;
    private int videoDuration;
    private int videoFileSize;
    private Float videoRatio;
    private String videoAutoPlayOnWifi = "y";
    private String videoAutoPlayWithSound = "n";
    private int timeBeforeVideoAutoPlay = 200;
    private int videoPlayMode = 1;
    private int downloadNetwork = 0;
    private String showSoundIcon = "y";

    public final Integer A() {
        return this.autoPlayAreaRatio;
    }

    public final Integer C() {
        return this.autoStopPlayAreaRatio;
    }

    public final Float E() {
        return this.videoRatio;
    }

    public final String F() {
        return this.showSoundIcon;
    }

    public final String k() {
        return this.videoAutoPlayOnWifi;
    }

    public final String p() {
        return this.videoAutoPlayWithSound;
    }

    public final String q() {
        return this.videoDownloadUrl;
    }

    public final int r() {
        return this.videoPlayMode;
    }

    public final int u() {
        return this.videoDuration;
    }

    public final int v() {
        return this.timeBeforeVideoAutoPlay;
    }

    public final int x() {
        return this.videoFileSize;
    }
}
