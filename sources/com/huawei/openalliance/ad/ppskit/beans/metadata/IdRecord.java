package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;

@DataKeep
/* loaded from: classes2.dex */
public class IdRecord {
    private int readTimes = 0;
    private long lastReportTime = 0;

    public final void a(long j10) {
        this.lastReportTime = j10;
    }

    public final void b() {
        this.readTimes = 0;
    }

    public final int c() {
        return this.readTimes;
    }

    public final long d() {
        return this.lastReportTime;
    }

    public final void e() {
        this.readTimes++;
    }
}
