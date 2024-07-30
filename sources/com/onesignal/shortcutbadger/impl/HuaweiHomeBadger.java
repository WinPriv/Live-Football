package com.onesignal.shortcutbadger.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import fc.a;
import fc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class HuaweiHomeBadger implements a {
    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // fc.a
    @SuppressLint({"NewApi"})
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Bundle bundle = new Bundle();
        bundle.putString(WiseOpenHianalyticsData.UNION_PACKAGE, context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i10);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
