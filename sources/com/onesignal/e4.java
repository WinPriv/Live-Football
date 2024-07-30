package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.d4;
import com.onesignal.e3;

/* compiled from: PushRegistratorADM.java */
/* loaded from: classes2.dex */
public final class e4 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f26801s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d4.a f26802t;

    public e4(Context context, e3.k kVar) {
        this.f26801s = context;
        this.f26802t = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ADM adm = new ADM(this.f26801s);
        String registrationId = adm.getRegistrationId();
        if (registrationId == null) {
            adm.startRegister();
        } else {
            e3.a(6, "ADM Already registered with ID:".concat(registrationId));
            ((e3.k) this.f26802t).a(1, registrationId);
        }
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException unused) {
        }
        z10 = f4.f26829b;
        if (!z10) {
            e3.a(3, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
            f4.c(null);
        }
    }
}
