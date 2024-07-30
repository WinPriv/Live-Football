package com.huawei.openalliance.ad.ppskit.db.bean;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import ma.b;
import pa.a;

@DataKeep
/* loaded from: classes2.dex */
public class SampleRecord extends a {
    public static final String TIME = "time";
    public static final String TYPE = "type";

    @b(a = "metaData")
    private String metaDataJsonStr;
    private String type;
    private long time = System.currentTimeMillis();

    @b(a = "eptS")
    private int encrypted = 1;

    public final long A() {
        return this.time;
    }

    public final void B(String str) {
        this.metaDataJsonStr = str;
    }

    public final boolean C() {
        if (this.encrypted == 1) {
            return true;
        }
        return false;
    }

    public final String E() {
        return this.metaDataJsonStr;
    }

    public final void a(int i10) {
        this.encrypted = i10;
    }

    public final void z(String str) {
        this.type = str;
    }
}
