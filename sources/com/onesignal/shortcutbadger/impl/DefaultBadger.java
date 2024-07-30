package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.activity.n;
import fc.a;
import fc.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DefaultBadger implements a {
    @Override // fc.a
    public final List<String> a() {
        return new ArrayList(0);
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (n.l0(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }
}
