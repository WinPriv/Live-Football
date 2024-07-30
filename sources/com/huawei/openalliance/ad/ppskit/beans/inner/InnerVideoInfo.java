package com.huawei.openalliance.ad.ppskit.beans.inner;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class InnerVideoInfo implements Serializable {
    private static final long serialVersionUID = 30414300;
    private int autoPlayNetwork;
    private boolean checkSha256;
    private String sha256;
    private String videoDownloadUrl;
    private int videoDuration;
    private int videoFileSize;
    private Float videoRatio;
    private String videoAutoPlay = "y";
    private String videoAutoPlayWithSound = "n";
    private int timeBeforeVideoAutoPlay = 200;
    private int playProgress = 0;
    private String soundSwitch = "n";
    private int videoPlayMode = 1;
    private boolean needContinueAutoPlay = true;
    private boolean backFromFullScreen = false;
    private int autoPlayAreaRatio = 100;
    private int autoStopPlayAreaRatio = 90;
    private int downloadNetwork = 0;
    private boolean showSoundIcon = true;
    private boolean directReturnVideoAd = false;
}
