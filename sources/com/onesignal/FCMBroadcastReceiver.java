package com.onesignal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.onesignal.JobIntentService;
import com.onesignal.e0;

/* loaded from: classes2.dex */
public class FCMBroadcastReceiver extends a1.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f26596s = 0;

    /* loaded from: classes2.dex */
    public class a implements e0.c {
        public a() {
        }

        @Override // com.onesignal.e0.c
        public final void a(e0.d dVar) {
            FCMBroadcastReceiver fCMBroadcastReceiver = FCMBroadcastReceiver.this;
            if (dVar == null) {
                int i10 = FCMBroadcastReceiver.f26596s;
                if (fCMBroadcastReceiver.isOrderedBroadcast()) {
                    fCMBroadcastReceiver.setResultCode(-1);
                    return;
                }
                return;
            }
            if (!dVar.f26737b && !dVar.f26739d) {
                int i11 = FCMBroadcastReceiver.f26596s;
                if (fCMBroadcastReceiver.isOrderedBroadcast()) {
                    fCMBroadcastReceiver.setResultCode(-1);
                    return;
                }
                return;
            }
            int i12 = FCMBroadcastReceiver.f26596s;
            if (fCMBroadcastReceiver.isOrderedBroadcast()) {
                fCMBroadcastReceiver.abortBroadcast();
                fCMBroadcastReceiver.setResultCode(-1);
            }
        }
    }

    public static void a(Bundle bundle, androidx.transition.r rVar) {
        rVar.n(e0.a(bundle).toString());
        e3.f26775w.getClass();
        rVar.m(Long.valueOf(System.currentTimeMillis() / 1000));
    }

    @TargetApi(21)
    public static void b(Context context, Bundle bundle) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("json_payload", e0.a(bundle).toString());
        e3.f26775w.getClass();
        persistableBundle.putLong("timestamp", Long.valueOf(System.currentTimeMillis() / 1000).longValue());
        Intent intent = new Intent(context, (Class<?>) FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", persistableBundle);
        int i10 = FCMIntentJobService.f26598z;
        ComponentName componentName = new ComponentName(context, (Class<?>) FCMIntentJobService.class);
        synchronized (JobIntentService.f26600x) {
            JobIntentService.WorkEnqueuer b10 = JobIntentService.b(context, componentName, true, 123890, false);
            b10.ensureJobId(123890);
            try {
                b10.enqueueWork(intent);
            } catch (IllegalStateException e10) {
                throw e10;
            }
        }
    }

    public static void c(Context context, Bundle bundle) {
        ComponentName componentName = new ComponentName(context.getPackageName(), FCMIntentService.class.getName());
        Bundle bundle2 = new Bundle();
        bundle2.putString("json_payload", e0.a(bundle).toString());
        e3.f26775w.getClass();
        bundle2.putLong("timestamp", Long.valueOf(System.currentTimeMillis() / 1000).longValue());
        a1.a.startWakefulService(context, new Intent().replaceExtras(bundle2).setComponent(componentName));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        String stringExtra;
        Bundle extras = intent.getExtras();
        if (extras != null && !"google.com/iid".equals(extras.getString("from"))) {
            e3.y(context);
            a aVar = new a();
            if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) && ((stringExtra = intent.getStringExtra("message_type")) == null || "gcm".equals(stringExtra))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                aVar.a(null);
            }
            e0.d(context, extras, new l(context, extras, aVar));
        }
    }
}
