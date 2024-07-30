package com.huawei.hms.ads.templatead;

import com.huawei.hms.ads.annotation.AllApi;
import java.util.List;
import java.util.Map;

@AllApi
/* loaded from: classes2.dex */
public interface TemplateAdListener {
    void onAdLoaded(Map<String, List<TemplateAd>> map);

    void onError(int i10);
}
