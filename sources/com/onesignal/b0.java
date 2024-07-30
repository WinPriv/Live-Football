package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.huawei.openalliance.ad.constant.bj;
import com.onesignal.d;
import com.onesignal.e3;

/* compiled from: LocationPermissionController.kt */
/* loaded from: classes2.dex */
public final class b0 implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f26666a;

    public b0(Activity activity) {
        this.f26666a = activity;
    }

    @Override // com.onesignal.d.a
    public final void a() {
        Activity activity = this.f26666a;
        zc.d.d(activity, bj.f.o);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + activity.getPackageName()));
        activity.startActivity(intent);
        a0.h(true, e3.u.PERMISSION_DENIED);
    }

    @Override // com.onesignal.d.a
    public final void b() {
        a0.h(true, e3.u.PERMISSION_DENIED);
    }
}
