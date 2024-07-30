package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResultV2;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class EventReportRsp extends RspBean {

    /* renamed from: e, reason: collision with root package name */
    private List<AdEventResultV2> f22464e;

    /* renamed from: r, reason: collision with root package name */
    private Integer f22465r;
    private List<AdEventResult> result;

    public final List<AdEventResult> k() {
        return this.result;
    }

    public final void l(List<AdEventResult> list) {
        this.result = list;
    }

    public final Integer p() {
        return this.f22465r;
    }

    public final void q(List<AdEventResultV2> list) {
        this.f22464e = list;
    }

    public final List<AdEventResultV2> r() {
        return this.f22464e;
    }
}
