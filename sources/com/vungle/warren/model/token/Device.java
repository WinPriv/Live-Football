package com.vungle.warren.model.token;

import com.vungle.warren.VungleApiClient;
import n8.b;

/* loaded from: classes2.dex */
public class Device {

    @b("amazon")
    private AndroidInfo amazon;

    /* renamed from: android, reason: collision with root package name */
    @b("android")
    private AndroidInfo f27244android;

    @b("battery_saver_enabled")
    private Boolean batterySaverEnabled;

    @b("extension")
    private Extension extension;

    @b(VungleApiClient.IFA)
    private String ifa;

    @b("language")
    private String language;

    @b("time_zone")
    private String timezone;

    @b("volume_level")
    private Double volumeLevel;

    public Device(Boolean bool, String str, String str2, Double d10, String str3, AndroidInfo androidInfo, AndroidInfo androidInfo2, Extension extension) {
        this.batterySaverEnabled = bool;
        this.language = str;
        this.timezone = str2;
        this.volumeLevel = d10;
        this.ifa = str3;
        this.amazon = androidInfo;
        this.f27244android = androidInfo2;
        this.extension = extension;
    }
}
