package com.huawei.openalliance.ad.ppskit.beans.server;

import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.ArrayList;

@DataKeep
/* loaded from: classes2.dex */
public class AnalysisReportReq extends EventReportReq {
    public AnalysisReportReq(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.server.EventReportReq, com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String c() {
        return "/contserver/reportException/action";
    }
}
