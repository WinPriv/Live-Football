package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.db.bean.AppDownloadRecord;
import fc.a;
import fc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class VivoHomeBadger implements a {
    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra(AppDownloadRecord.PACKAGE_NAME, context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i10);
        context.sendBroadcast(intent);
    }
}
