package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.e;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class ThirdPartyEventRecord extends a {
    public static final String AD_TYPE = "adType";
    public static final String LAST_REPORT_TIME = "lastReportTime";
    public static final String LOCK_TIME = "lockTime";
    public static final String REQUEST_ID = "requestId";
    public static final String TIME = "time";

    @e
    private String _id;
    private int adType;
    private String appPkgName;
    private String contentId;
    private String eventType;
    private long lastReportTime;
    private long lockTime;
    private String requestId;
    private int requestType;
    private String slotId;
    private long startShowTime;
    private long time;
    private EncryptionField<String> url;

    public ThirdPartyEventRecord() {
        this.lockTime = 0L;
        this.requestType = 0;
        this.startShowTime = -111111L;
    }

    public final EncryptionField<String> A() {
        return this.url;
    }

    public final void B(int i10) {
        this.requestType = i10;
    }

    public final void C(long j10) {
        this.lockTime = j10;
    }

    public final int E() {
        return this.adType;
    }

    public final void F(long j10) {
        this.startShowTime = j10;
    }

    public final void G(String str) {
        this.slotId = str;
    }

    public final void H(String str) {
        this.contentId = str;
    }

    public final String K() {
        return this.requestId;
    }

    public final void L(String str) {
        this.appPkgName = str;
    }

    public final String O() {
        return this.slotId;
    }

    public final void P(String str) {
        this.eventType = str;
    }

    public final String U() {
        return this.eventType;
    }

    public final int W() {
        return this.requestType;
    }

    public final long X() {
        return this.startShowTime;
    }

    public final String a() {
        return this._id;
    }

    public final String h() {
        return this.contentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyEventRecord(int i10, String str, String str2) {
        this();
        this.adType = i10;
        if (this.url == null) {
            this.url = new EncryptionField<>();
        }
        this.url.f22473u = str;
        this.requestId = str2;
        this.time = System.currentTimeMillis();
        this.lastReportTime = System.currentTimeMillis();
    }

    public final void a(int i10) {
        this.adType = i10;
    }
}
