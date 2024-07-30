package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import fc.a;
import fc.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ZukHomeBadger implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f27060a = Uri.parse("content://com.android.badge/badge");

    @Override // fc.a
    public final List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // fc.a
    @TargetApi(11)
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f27060a, "setAppBadgeCount", (String) null, bundle);
    }
}
