package com.huawei.openalliance.ad.ppskit.beans.metadata;

import java.util.ArrayList;
import java.util.List;
import ma.a;

/* loaded from: classes2.dex */
public class AppCollection {
    private String acceler;

    @a
    private List<AppCollectInfo> appInfos;
    private Integer appUsageCollect;
    private String baro;
    private String battery;

    @a
    private List<BluetoothInfo> blueToothList;
    private String brand;
    private String buildVer;
    private String charging;
    private String cpuCoreCnt;
    private String cpuModel;
    private String cpuSpeed;
    private Long dataTime;
    private String emuiVer;
    private String eventType;
    private String extra1;
    private String extra2;
    private String extra3;
    private String extra4;
    private String extra5;
    private String freeSto;

    @a
    private String gaid;

    @a
    private String gaidTrackingEnabled;
    private String gpuModel;
    private String gyro;
    private String hmsVersion;
    private String internetAccess;

    @a
    private Integer isOaidTrackingEnabled;
    private String kitVersion;
    private String lang;
    private String magicUIVer;
    private String magnet;
    private String maker;
    private String mcc;
    private String mnc;
    private String model;

    @a
    private String oaid;

    @a
    private String odid;
    private String pdtName;
    private Long reportTimestamp;
    private String routerCountry;
    private String seqId;
    private String timeZone;
    private String totalMem;
    private String totalSto;

    @a
    private String udid;

    @a
    private String uuid;
    private String vendCountry;
    private String vendor;
    private String wifi;

    @a
    private List<WifiInfo> wifiList;

    public final void a(String str) {
        this.routerCountry = str;
    }

    public final void b(String str) {
        this.uuid = str;
    }

    public final void c(String str) {
        this.gaid = str;
    }

    public final void d(String str) {
        this.gaidTrackingEnabled = str;
    }

    public final void e(String str) {
        this.maker = str;
    }

    public final void f(String str) {
        this.brand = str;
    }

    public final void g(Long l10) {
        this.reportTimestamp = l10;
    }

    public final void h(String str) {
        this.seqId = str;
    }

    public final void i(ArrayList arrayList) {
        this.appInfos = arrayList;
    }

    public final void j(Integer num) {
        this.isOaidTrackingEnabled = num;
    }

    public final void k(String str) {
        this.model = str;
    }

    public final void l(String str) {
        this.buildVer = str;
    }

    public final void m(String str) {
        this.timeZone = str;
    }

    public final void n(String str) {
        this.oaid = str;
    }

    public final void o(String str) {
        this.extra1 = str;
    }

    public final void p() {
        this.eventType = "appInstallList";
    }

    public final void q(String str) {
        this.internetAccess = str;
    }

    public final void r(String str) {
        this.mnc = str;
    }

    public final void s(String str) {
        this.mcc = str;
    }

    public final void t(String str) {
        this.lang = str;
    }
}
