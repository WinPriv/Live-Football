package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.e;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class EventMonitorRecord extends a {
    public static final String ADD_TIME = "addTime";
    public static final String AD_TYPE = "adType";
    public static final String EVENT_ID = "eventId";

    @e
    private String _id;
    private int adType = -1;
    private long addTime;
    private String eventId;

    public final void A(String str) {
        this.eventId = str;
    }

    public final void a(int i10) {
        this.adType = i10;
    }

    public final String d() {
        return this.eventId;
    }

    public final void z(long j10) {
        this.addTime = j10;
    }
}
