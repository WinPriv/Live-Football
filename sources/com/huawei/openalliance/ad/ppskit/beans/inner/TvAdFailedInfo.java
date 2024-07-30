package com.huawei.openalliance.ad.ppskit.beans.inner;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class TvAdFailedInfo {
    private String brand;
    private int errCode;
    private int playMode;
    private String slotId;
    private int startMode;
    private long timestamp;

    public final String toString() {
        return "TvAdFailedInfo{timestamp=" + this.timestamp + ", startMode=" + this.startMode + ", slotId='" + this.slotId + "', playMode=" + this.playMode + ", brand='" + this.brand + "', errCode=" + this.errCode + '}';
    }
}
