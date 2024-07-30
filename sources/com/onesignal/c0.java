package com.onesignal;

import android.app.Activity;
import com.google.android.gms.stats.CodePackage;
import com.hamkho.livefoot.R;
import com.onesignal.PermissionsActivity;
import com.onesignal.e3;

/* compiled from: LocationPermissionController.kt */
/* loaded from: classes2.dex */
public final class c0 implements PermissionsActivity.b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26701a = 0;

    static {
        PermissionsActivity.f26627x.put(CodePackage.LOCATION, new c0());
    }

    @Override // com.onesignal.PermissionsActivity.b
    public final void a() {
        a0.h(true, e3.u.PERMISSION_GRANTED);
        a0.i();
    }

    @Override // com.onesignal.PermissionsActivity.b
    public final void b(boolean z10) {
        Activity i10;
        a0.h(true, e3.u.PERMISSION_DENIED);
        if (z10 && (i10 = e3.i()) != null) {
            String string = i10.getString(R.string.location_permission_name_for_title);
            zc.d.c(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = i10.getString(R.string.location_permission_settings_message);
            zc.d.c(string2, "activity.getString(R.str…mission_settings_message)");
            d.a(i10, string, string2, new b0(i10));
        }
        a0.c();
    }
}
