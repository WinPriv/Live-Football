package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.c;
import i8.h;
import k4.w0;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes2.dex */
public final class b extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21302b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f21303a;

    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public b(EnhancedIntentService.a aVar) {
        this.f21303a = aVar;
    }

    public final void a(c.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = aVar.f21310a;
            EnhancedIntentService.a aVar2 = (EnhancedIntentService.a) this.f21303a;
            aVar2.getClass();
            int i10 = EnhancedIntentService.f21271x;
            EnhancedIntentService enhancedIntentService = EnhancedIntentService.this;
            enhancedIntentService.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            enhancedIntentService.f21272s.execute(new w0(enhancedIntentService, intent, taskCompletionSource, 2));
            taskCompletionSource.getTask().addOnCompleteListener(new h(2), new b0.b(aVar, 11));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
