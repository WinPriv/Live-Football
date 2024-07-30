package com.huawei.openalliance.ad.fadata;

import com.huawei.openalliance.ad.annotations.DataKeep;
import java.util.ArrayList;

@DataKeep
/* loaded from: classes2.dex */
public class PPSAbilityResult {
    private ArrayList<PPSAbilityData> abilityDatas;
    private String intentSn;

    public final void a() {
        this.intentSn = "1";
    }

    public final void b(ArrayList<PPSAbilityData> arrayList) {
        this.abilityDatas = arrayList;
    }
}
