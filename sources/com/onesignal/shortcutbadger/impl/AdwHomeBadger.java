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
public class AdwHomeBadger implements a {
    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i10);
        if (n.l0(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }
}
