package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.e0;

/* loaded from: classes2.dex */
public class FCMIntentJobService extends JobIntentService {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f26598z = 0;

    @Override // com.onesignal.JobIntentService
    public final void c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        e3.y(this);
        e0.d(this, extras, new a());
    }

    /* loaded from: classes2.dex */
    public class a implements e0.c {
        @Override // com.onesignal.e0.c
        public final void a(e0.d dVar) {
        }
    }
}
