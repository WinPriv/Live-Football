package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.e0;
import org.json.JSONObject;

/* compiled from: ADMMessageHandlerJob.kt */
/* loaded from: classes2.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    /* compiled from: ADMMessageHandlerJob.kt */
    /* loaded from: classes2.dex */
    public static final class a implements e0.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f26579a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f26580b;

        public a(Context context, Bundle bundle) {
            this.f26579a = bundle;
            this.f26580b = context;
        }

        @Override // com.onesignal.e0.c
        public final void a(e0.d dVar) {
            if (dVar != null && dVar.a()) {
                return;
            }
            JSONObject a10 = e0.a(this.f26579a);
            t1 t1Var = new t1(a10);
            Context context = this.f26580b;
            z1 z1Var = new z1(context);
            z1Var.f27214c = a10;
            z1Var.f27213b = context;
            z1Var.b(t1Var);
            e0.e(new u1(z1Var, z1Var.f27215d), true);
        }
    }

    public void onMessage(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        e0.d(context, bundle, new a(context, bundle));
    }

    public void onRegistered(Context context, String str) {
        e3.b(5, "ADM registration ID: " + str, null);
        f4.c(str);
    }

    public void onRegistrationError(Context context, String str) {
        e3.b(3, "ADM:onRegistrationError: " + str, null);
        if (zc.d.a("INVALID_SENDER", str)) {
            e3.b(3, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null);
        }
        f4.c(null);
    }

    public void onUnregistered(Context context, String str) {
        e3.b(5, "ADM:onUnregistered: " + str, null);
    }
}
