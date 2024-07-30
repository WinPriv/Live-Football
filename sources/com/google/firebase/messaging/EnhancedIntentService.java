package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.applovin.exoplayer2.a.n;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.b;
import i8.f0;
import i8.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.w0;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes2.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f21271x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ExecutorService f21272s;

    /* renamed from: t, reason: collision with root package name */
    public b f21273t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f21274u;

    /* renamed from: v, reason: collision with root package name */
    public int f21275v;

    /* renamed from: w, reason: collision with root package name */
    public int f21276w;

    /* loaded from: classes2.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f21272s = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f21274u = new Object();
        this.f21276w = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            f0.a(intent);
        }
        synchronized (this.f21274u) {
            int i10 = this.f21276w - 1;
            this.f21276w = i10;
            if (i10 == 0) {
                stopSelfResult(this.f21275v);
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f21273t == null) {
            this.f21273t = new b(new a());
        }
        return this.f21273t;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f21272s.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f21274u) {
            this.f21275v = i11;
            this.f21276w++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f21272s.execute(new w0(this, b10, taskCompletionSource, 2));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new h(0), new n(11, this, intent));
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
