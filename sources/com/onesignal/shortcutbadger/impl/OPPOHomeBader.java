package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import fc.a;
import fc.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class OPPOHomeBader implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f27054a = -1;

    @Override // fc.a
    public final List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        if (this.f27054a == i10) {
            return;
        }
        this.f27054a = i10;
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
