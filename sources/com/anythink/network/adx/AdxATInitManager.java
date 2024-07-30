package com.anythink.network.adx;

import android.content.Context;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATInitManager extends ATInitMediation {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AdxATInitManager f12611a;

    public static AdxATInitManager getInstance() {
        if (f12611a == null) {
            synchronized (AdxATInitManager.class) {
                if (f12611a == null) {
                    f12611a = new AdxATInitManager();
                }
            }
        }
        return f12611a;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Adx";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.anythink.core.api.ATSDK";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public List getResourceStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("anythink_myoffer_full_screen");
        arrayList.add("anythink_myoffer_splash_ad_layout_asseblem_vertical_port");
        return arrayList;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
    }
}
