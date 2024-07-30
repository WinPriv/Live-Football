package com.huawei.openalliance.ad.ppskit.fadata;

import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.annotations.DataKeep;
import java.util.ArrayList;
import java.util.List;

@DataKeep
/* loaded from: classes2.dex */
public class PPSAbilityData {
    private List<PPSAbilityDataContent> abilityDataContent;
    private String displayForm;

    public final void a() {
        this.displayForm = w.cD;
    }

    public final void b(ArrayList arrayList) {
        this.abilityDataContent = arrayList;
    }
}
