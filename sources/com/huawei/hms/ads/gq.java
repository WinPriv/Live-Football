package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import java.util.List;

/* loaded from: classes2.dex */
public class gq {
    private static final String Code = "AdSessionAgentFactory";

    public static hl Code(Context context, AdContentData adContentData, gk gkVar, boolean z10) {
        hf Code2;
        if (adContentData != null && context != null) {
            if (z10 && (gkVar == null || gkVar.getOpenMeasureView() == null)) {
                ex.V(Code, "MeasureView is null");
                return new gt();
            }
            if (gp.Code()) {
                ex.Code(Code, "AdSessionAgent is avalible");
                gp gpVar = new gp();
                List<Om> q02 = adContentData.q0();
                if (q02 == null) {
                    ex.V(Code, "Oms is null");
                    return gpVar;
                }
                if (adContentData.Y0() == null && (adContentData.Z0() == null || !"video/mp4".equals(adContentData.Z0().q()))) {
                    Code2 = hf.Code(hi.NATIVE_DISPLAY, hn.VIEWABLE, ho.NATIVE, ho.NONE, false);
                } else {
                    ex.V(Code, "Video adsession");
                    hi hiVar = hi.VIDEO;
                    hn hnVar = hn.VIEWABLE;
                    ho hoVar = ho.NATIVE;
                    Code2 = hf.Code(hiVar, hnVar, hoVar, hoVar, false);
                }
                if (Code2 == null) {
                    return gpVar;
                }
                ex.V(Code, "init adSessionAgent");
                gpVar.Code(context, q02, Code2);
                if (z10) {
                    gpVar.Code(gkVar.getOpenMeasureView());
                }
                return gpVar;
            }
            return new gt();
        }
        return new gt();
    }
}
