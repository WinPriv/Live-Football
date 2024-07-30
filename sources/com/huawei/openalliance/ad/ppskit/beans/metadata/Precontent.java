package com.huawei.openalliance.ad.ppskit.beans.metadata;

import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import com.huawei.openalliance.ad.ppskit.beans.base.RspBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.ppskit.beans.metadata.v3.TemplateV3;
import java.util.ArrayList;
import java.util.List;
import ma.d;
import ma.f;

@DataKeep
/* loaded from: classes2.dex */
public class Precontent extends RspBean {
    private Integer apiVer;
    private List<Asset> assets;
    private String contentid;
    private int creativetype;
    private String ctrlSwitchs;
    private List<ImageInfo> imageInfo;
    private List<MediaFile> mediaFileList;

    @f
    private List<String> noReportEventList;

    @d(a = "prio")
    private Integer priority;
    private String slotid;

    @d(a = "splashPlMode")
    private Integer splashPreloadMode;
    private TemplateV3 template;
    private VideoInfo videoInfo;
    private List<XRInfo> xRInfo;

    public final Integer A() {
        return this.priority;
    }

    public final List<XRInfo> C() {
        return this.xRInfo;
    }

    public final Integer E() {
        return this.apiVer;
    }

    public final TemplateV3 F() {
        return this.template;
    }

    public final String a() {
        return this.slotid;
    }

    public final void b(List<AdTypeEvent> list, int i10) {
        List<String> b10;
        if (n.M(list)) {
            return;
        }
        for (AdTypeEvent adTypeEvent : list) {
            if (adTypeEvent != null && adTypeEvent.a() == i10 && (b10 = adTypeEvent.b()) != null && b10.size() > 0) {
                ArrayList arrayList = new ArrayList();
                this.noReportEventList = arrayList;
                arrayList.addAll(b10);
            }
        }
    }

    public final String k() {
        return this.contentid;
    }

    public final List<Asset> l() {
        return this.assets;
    }

    public final int p() {
        return this.creativetype;
    }

    public final List<ImageInfo> q() {
        return this.imageInfo;
    }

    public final VideoInfo r() {
        return this.videoInfo;
    }

    public final String u() {
        return this.ctrlSwitchs;
    }

    public final List<String> v() {
        return this.noReportEventList;
    }

    public final List<MediaFile> x() {
        return this.mediaFileList;
    }
}
