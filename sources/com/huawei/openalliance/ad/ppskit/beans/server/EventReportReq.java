package com.huawei.openalliance.ad.ppskit.beans.server;

import android.content.Context;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEvent;
import java.util.ArrayList;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class EventReportReq extends ReqBean {
    private List<AdEvent> event;
    private String version = "3.4";
    private String sdkversion = "3.4.65.300";

    public EventReportReq() {
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String a() {
        return "action";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String b(Context context) {
        return context.getString(R.string.hiad_content_server_sig);
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public String c() {
        return "/contserver/newcontent/action";
    }

    @Override // com.huawei.openalliance.ad.ppskit.beans.base.ReqBean
    public final String d() {
        return "100003";
    }

    public EventReportReq(ArrayList arrayList) {
        this.event = arrayList;
    }
}
