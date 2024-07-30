package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.e0;

/* loaded from: classes2.dex */
public class FCMIntentService extends IntentService {

    /* loaded from: classes2.dex */
    public class a implements e0.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f26599a;

        public a(Intent intent) {
            this.f26599a = intent;
        }

        @Override // com.onesignal.e0.c
        public final void a(e0.d dVar) {
            a1.a.completeWakefulIntent(this.f26599a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        e3.y(this);
        e0.d(this, extras, new a(intent));
    }
}
