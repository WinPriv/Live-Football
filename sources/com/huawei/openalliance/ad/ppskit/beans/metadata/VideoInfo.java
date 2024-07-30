package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.constant.NetworkTypeForControl;
import com.huawei.openalliance.ad.ppskit.constant.ShowFlag;
import com.huawei.openalliance.ad.ppskit.constant.VideoPlayFlag;
import com.huawei.openalliance.ad.ppskit.constant.VideoShowMode;
import com.huawei.openalliance.ad.ppskit.constant.VideoSoundFlag;
import ma.a;
import ma.h;

@DataKeep
/* loaded from: classes2.dex */
public class VideoInfo {

    @h(e = {1, 100}, f = 100)
    private Integer autoPlayAreaRatio;

    @h(e = {0, 99}, f = 90)
    private Integer autoStopPlayAreaRatio;
    private int checkSha256Flag;

    @a
    private String originalDownloadUrl;
    private String sha256;
    private float splashSwitchTime;

    @a
    private String videoDownloadUrl;
    private int videoDuration;
    private int videoFileSize;
    private Float videoRatio;

    @h(b = VideoPlayFlag.class, d = "y")
    private String videoAutoPlayOnWifi = "y";

    @h(b = VideoSoundFlag.class, d = "n")
    private String videoAutoPlayWithSound = "n";
    private int timeBeforeVideoAutoPlay = 200;

    @h(b = VideoShowMode.class, c = 1)
    private int videoPlayMode = 1;

    @h(b = NetworkTypeForControl.class, c = 0)
    private int downloadNetwork = 0;

    @h(b = ShowFlag.class, d = "y")
    private String showSoundIcon = "y";

    public final Float A() {
        return this.videoRatio;
    }

    public final String B() {
        return this.showSoundIcon;
    }

    public final String a() {
        return this.videoDownloadUrl;
    }

    public final void b(int i10) {
        this.videoDuration = i10;
    }

    public final void c(Float f) {
        this.videoRatio = f;
    }

    public final void d(Integer num) {
        this.autoPlayAreaRatio = num;
    }

    public final void e(String str) {
        this.videoDownloadUrl = str;
    }

    public final String f() {
        return this.originalDownloadUrl;
    }

    public final void g(int i10) {
        this.videoFileSize = i10;
    }

    public final void h(Integer num) {
        this.autoStopPlayAreaRatio = num;
    }

    public final void i(String str) {
        this.originalDownloadUrl = str;
    }

    public final int j() {
        return this.videoDuration;
    }

    public final void k(int i10) {
        this.timeBeforeVideoAutoPlay = i10;
    }

    public final void l(String str) {
        this.videoAutoPlayOnWifi = str;
    }

    public final int m() {
        return this.videoFileSize;
    }

    public final void n(int i10) {
        this.videoPlayMode = i10;
    }

    public final void o(String str) {
        this.videoAutoPlayWithSound = str;
    }

    public final String p() {
        return this.videoAutoPlayOnWifi;
    }

    public final void q(int i10) {
        this.checkSha256Flag = i10;
    }

    public final void r(String str) {
        this.sha256 = str;
    }

    public final String s() {
        return this.videoAutoPlayWithSound;
    }

    public final int t() {
        return this.timeBeforeVideoAutoPlay;
    }

    public final String u() {
        return this.sha256;
    }

    public final int v() {
        return this.videoPlayMode;
    }

    public final int w() {
        return this.checkSha256Flag;
    }

    public final Integer x() {
        return this.autoPlayAreaRatio;
    }

    public final Integer y() {
        return this.autoStopPlayAreaRatio;
    }

    public final int z() {
        return this.downloadNetwork;
    }
}
