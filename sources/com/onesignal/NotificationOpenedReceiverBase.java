package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: NotificationOpenedReceiverBase.kt */
/* loaded from: classes2.dex */
public abstract class NotificationOpenedReceiverBase extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i0.a(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        zc.d.d(intent, "intent");
        super.onNewIntent(intent);
        i0.a(this, getIntent());
        finish();
    }
}
