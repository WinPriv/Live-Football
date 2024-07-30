package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.io.Serializable;
import java.util.List;
import ma.a;

@DataKeep
/* loaded from: classes2.dex */
public class Monitor implements Serializable {
    private static final long serialVersionUID = -478373722166817617L;
    private String eventType;
    private int retryFlag = 1;

    @a
    private List<String> url;

    public final String a() {
        return this.eventType;
    }

    public final void b(String str) {
        this.eventType = str;
    }

    public final void c(List<String> list) {
        this.url = list;
    }

    public final List<String> k() {
        return this.url;
    }

    public final int p() {
        return this.retryFlag;
    }

    public final void a(int i10) {
        this.retryFlag = i10;
    }
}
