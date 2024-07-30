package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.e0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    /* loaded from: classes2.dex */
    public class a implements e0.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f26577a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f26578b;

        public a(Bundle bundle, Context context) {
            this.f26577a = bundle;
            this.f26578b = context;
        }

        @Override // com.onesignal.e0.c
        public final void a(e0.d dVar) {
            if (dVar.a()) {
                return;
            }
            JSONObject a10 = e0.a(this.f26577a);
            t1 t1Var = new t1(a10);
            Context context = this.f26578b;
            z1 z1Var = new z1(context);
            z1Var.f27214c = a10;
            z1Var.f27213b = context;
            z1Var.b(t1Var);
            e0.e(new u1(z1Var, z1Var.f27215d), true);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        e0.d(applicationContext, extras, new a(extras, applicationContext));
    }

    public void onRegistered(String str) {
        e3.b(5, "ADM registration ID: " + str, null);
        f4.c(str);
    }

    public void onRegistrationError(String str) {
        e3.b(3, "ADM:onRegistrationError: " + str, null);
        if ("INVALID_SENDER".equals(str)) {
            e3.b(3, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null);
        }
        f4.c(null);
    }

    public void onUnregistered(String str) {
        e3.b(5, "ADM:onUnregistered: " + str, null);
    }
}
