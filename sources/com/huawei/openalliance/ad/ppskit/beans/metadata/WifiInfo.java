package com.huawei.openalliance.ad.ppskit.beans.metadata;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.utils.y1;

@DataKeep
/* loaded from: classes2.dex */
public class WifiInfo implements Comparable<WifiInfo> {
    private String bssid;
    private Integer encrypted;
    private Integer frequency;
    private Integer level;
    private String ssid;
    private Long time;
    private int wifiState;

    public WifiInfo() {
        this.wifiState = 0;
    }

    public final void a(Long l10) {
        this.time = l10;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.ssid = "";
        }
        this.ssid = y1.y(str.replace("\"", ""));
    }

    public final void c(Integer num) {
        this.encrypted = num;
    }

    @Override // java.lang.Comparable
    public final int compareTo(WifiInfo wifiInfo) {
        int intValue;
        WifiInfo wifiInfo2 = wifiInfo;
        if (wifiInfo2 == null) {
            return -1;
        }
        int i10 = wifiInfo2.wifiState - this.wifiState;
        if (i10 == 0) {
            Integer num = this.level;
            int i11 = Integer.MIN_VALUE;
            if (num == null) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = num.intValue();
            }
            Integer num2 = wifiInfo2.level;
            if (num2 != null) {
                i11 = num2.intValue();
            }
            return i11 - intValue;
        }
        return i10;
    }

    public final void d(String str) {
        int i10;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "[ESS]")) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.encrypted = Integer.valueOf(i10);
    }

    public final void e(Integer num) {
        this.frequency = num;
    }

    public WifiInfo(ScanResult scanResult) {
        int i10 = 0;
        this.wifiState = 0;
        this.bssid = scanResult.BSSID;
        b(scanResult.SSID);
        this.level = Integer.valueOf(scanResult.level);
        String str = scanResult.capabilities;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "[ESS]")) {
            i10 = 1;
        }
        this.encrypted = Integer.valueOf(i10);
        this.frequency = Integer.valueOf(scanResult.frequency);
        this.time = Long.valueOf(scanResult.timestamp);
    }

    public WifiInfo(WifiConfiguration wifiConfiguration) {
        this.wifiState = 0;
        this.bssid = wifiConfiguration.BSSID;
        b(wifiConfiguration.SSID);
    }

    public WifiInfo(android.net.wifi.WifiInfo wifiInfo) {
        this.wifiState = 0;
        this.bssid = wifiInfo.getBSSID();
        b(wifiInfo.getSSID());
        this.level = Integer.valueOf(wifiInfo.getRssi());
        this.wifiState = 1;
    }
}
