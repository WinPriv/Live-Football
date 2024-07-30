package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.activity.n;
import fc.a;
import fc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class NewHtcHomeBadger implements a {
    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        if (!n.l0(context, intent) && !n.l0(context, intent2)) {
            throw new b("unable to resolve intent: " + intent2.toString());
        }
        context.sendBroadcast(intent);
        context.sendBroadcast(intent2);
    }
}
