package com.huawei.hms.ads.jsb.inner.data;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;

@DataKeep
/* loaded from: classes2.dex */
public class Video {
    private String autoPlay;
    private Integer autoPlayAreaRatio;
    private String autoPlayWithSound;
    private Integer autoStopPlayAreaRatio;
    private int duration;
    private int fileSize;
    private float ratio;
    private String soundSwitch;
    private Integer timeBeforeAutoPlay;
    private String url;

    public Video(VideoInfo videoInfo) {
        float floatValue;
        this.autoPlay = "y";
        this.soundSwitch = "n";
        this.url = videoInfo.q();
        this.autoStopPlayAreaRatio = videoInfo.C();
        if (!TextUtils.equals(videoInfo.k(), "y") && !TextUtils.equals(videoInfo.k(), "a")) {
            this.autoPlay = "n";
        } else {
            this.autoPlay = "y";
        }
        this.autoPlayAreaRatio = videoInfo.A();
        this.timeBeforeAutoPlay = Integer.valueOf(videoInfo.v());
        this.autoPlayWithSound = videoInfo.p();
        this.soundSwitch = videoInfo.p();
        this.duration = videoInfo.u();
        this.fileSize = videoInfo.x();
        if (videoInfo.E() == null) {
            floatValue = 1.7777778f;
        } else {
            floatValue = videoInfo.E().floatValue();
        }
        this.ratio = floatValue;
    }
}
