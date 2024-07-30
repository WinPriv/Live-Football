package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bj;
import com.onesignal.PermissionsActivity;
import com.onesignal.d;
import com.onesignal.e3;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: NotificationPermissionController.kt */
/* loaded from: classes2.dex */
public final class j0 implements PermissionsActivity.b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f26867a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f26868b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f26869c;

    /* compiled from: NotificationPermissionController.kt */
    /* loaded from: classes2.dex */
    public static final class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f26870a;

        public a(Activity activity) {
            this.f26870a = activity;
        }

        @Override // com.onesignal.d.a
        public final void a() {
            Activity activity = this.f26870a;
            zc.d.d(activity, bj.f.o);
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.addFlags(268435456);
            intent.putExtra("app_package", activity.getPackageName());
            intent.putExtra("app_uid", activity.getApplicationInfo().uid);
            intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            activity.startActivity(intent);
            HashSet hashSet = j0.f26867a;
            j0.f26868b = true;
        }

        @Override // com.onesignal.d.a
        public final void b() {
            j0.c(false);
        }
    }

    static {
        int i10;
        j0 j0Var = new j0();
        f26867a = new HashSet();
        PermissionsActivity.f26627x.put("NOTIFICATION", j0Var);
        boolean z10 = false;
        if (Build.VERSION.SDK_INT > 32) {
            Context context = e3.f26748b;
            try {
                i10 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
                i10 = 15;
            }
            if (i10 > 32) {
                z10 = true;
            }
        }
        f26869c = z10;
    }

    public static void c(boolean z10) {
        HashSet hashSet = f26867a;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((e3.v) it.next()).a(z10);
        }
        hashSet.clear();
    }

    public static boolean d() {
        Activity i10 = e3.i();
        if (i10 != null) {
            String string = i10.getString(R.string.notification_permission_name_for_title);
            zc.d.c(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = i10.getString(R.string.notification_permission_settings_message);
            zc.d.c(string2, "activity.getString(R.str…mission_settings_message)");
            d.a(i10, string, string2, new a(i10));
            return true;
        }
        return false;
    }

    @Override // com.onesignal.PermissionsActivity.b
    public final void a() {
        boolean z10;
        m2 j10 = e3.j(e3.f26748b);
        j10.getClass();
        boolean a10 = OSUtils.a();
        if (j10.f26924t != a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        j10.f26924t = a10;
        if (z10) {
            j10.f26923s.a(j10);
        }
        c(true);
    }

    @Override // com.onesignal.PermissionsActivity.b
    public final void b(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = d();
        } else {
            z11 = false;
        }
        if (!z11) {
            c(false);
        }
    }
}
