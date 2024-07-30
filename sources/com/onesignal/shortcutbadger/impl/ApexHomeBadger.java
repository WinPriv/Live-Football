package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.activity.n;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import fc.a;
import fc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class ApexHomeBadger implements a {
    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra(WiseOpenHianalyticsData.UNION_PACKAGE, componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        if (n.l0(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }
}
