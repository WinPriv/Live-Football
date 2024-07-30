package com.huawei.openalliance.ad.ppskit.beans.metadata;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class Ad30 extends RspBean {
    private String brsetting;
    private String configMap;
    private List<Content> content;

    /* renamed from: fc, reason: collision with root package name */
    private FlowControl f22455fc;
    private List<ImpEX> impEXs;
    private String slotid;
    private int retcode30 = -1;
    private int adtype = -1;

    public final String a() {
        return this.slotid;
    }

    public final void b(List<Content> list) {
        this.content = list;
    }

    public final String d() {
        return this.brsetting;
    }

    public final List<Content> k() {
        return this.content;
    }

    public final List<ImpEX> p() {
        return this.impEXs;
    }

    public final int q() {
        return this.adtype;
    }

    public final String r() {
        return this.configMap;
    }

    public final FlowControl u() {
        return this.f22455fc;
    }

    public final int b() {
        return this.retcode30;
    }
}
