package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f477s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f478t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f479u;

    public f(ComponentActivity.b bVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f479u = bVar;
        this.f477s = i10;
        this.f478t = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f479u.a(this.f477s, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f478t));
    }
}
