package com.huawei.hms.ads.event;

import android.content.Context;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.cy;
import gb.b;
import ha.i;
import java.util.Map;

@AllApi
/* loaded from: classes2.dex */
public class AppEventReporter {
    @AllApi
    public static void reportEventData(Context context, Map<String, String> map) {
        i.e(context).d(cy.S, b.p(map), null, null);
    }
}
