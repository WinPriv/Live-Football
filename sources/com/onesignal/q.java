package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;

/* compiled from: GooglePlayServicesUpgradePrompt.java */
/* loaded from: classes2.dex */
public final class q {

    /* compiled from: GooglePlayServicesUpgradePrompt.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* compiled from: GooglePlayServicesUpgradePrompt.java */
        /* renamed from: com.onesignal.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class DialogInterfaceOnClickListenerC0348a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                r3.i(r3.f27010a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
            }
        }

        /* compiled from: GooglePlayServicesUpgradePrompt.java */
        /* loaded from: classes2.dex */
        public class b implements DialogInterface.OnClickListener {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Activity f26977s;

            public b(Activity activity) {
                this.f26977s = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Activity activity = this.f26977s;
                try {
                    GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                    PendingIntent errorResolutionPendingIntent = googleApiAvailability.getErrorResolutionPendingIntent(activity, googleApiAvailability.isGooglePlayServicesAvailable(e3.f26748b), 9000);
                    if (errorResolutionPendingIntent != null) {
                        errorResolutionPendingIntent.send();
                    }
                } catch (PendingIntent.CanceledException e10) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity i10 = e3.i();
            if (i10 == null) {
                return;
            }
            String d10 = OSUtils.d(i10, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String d11 = OSUtils.d(i10, "onesignal_gms_missing_alert_button_update", "Update");
            String d12 = OSUtils.d(i10, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(i10).setMessage(d10).setPositiveButton(d11, new b(i10)).setNegativeButton(d12, new DialogInterfaceOnClickListenerC0348a()).setNeutralButton(OSUtils.d(i10, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public static void a() {
        boolean z10;
        boolean z11;
        new OSUtils();
        if (OSUtils.b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        try {
            PackageManager packageManager = e3.f26748b.getPackageManager();
            z11 = !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            z11 = false;
        }
        if (z11) {
            e3.f26776x.getClass();
            String str = r3.f27010a;
            if (r3.b(str, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false) || r3.b(str, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                return;
            }
            OSUtils.s(new a());
        }
    }
}
