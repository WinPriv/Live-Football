package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.appcompat.widget.n0;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.d;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes2.dex */
public final class c implements ServiceConnection {

    /* renamed from: s, reason: collision with root package name */
    public final Context f21304s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f21305t;

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledExecutorService f21306u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f21307v;

    /* renamed from: w, reason: collision with root package name */
    public b f21308w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21309x;

    /* compiled from: WithinAppServiceConnection.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f21310a;

        /* renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<Void> f21311b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f21310a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public c(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f21307v = new ArrayDeque();
        this.f21309x = false;
        Context applicationContext = context.getApplicationContext();
        this.f21304s = applicationContext;
        this.f21305t = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f21306u = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f21307v.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            b bVar = this.f21308w;
            if (bVar != null && bVar.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f21308w.a((a) this.f21307v.poll());
            } else {
                c();
                return;
            }
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f21306u;
        aVar.f21311b.getTask().addOnCompleteListener(scheduledExecutorService, new d(scheduledExecutorService.schedule(new n0(aVar, 10), 20L, TimeUnit.SECONDS), 12));
        this.f21307v.add(aVar);
        a();
        return aVar.f21311b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f21309x);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f21309x) {
            return;
        }
        this.f21309x = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (ConnectionTracker.getInstance().bindService(this.f21304s, this.f21305t, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f21309x = false;
        while (true) {
            ArrayDeque arrayDeque = this.f21307v;
            if (!arrayDeque.isEmpty()) {
                ((a) arrayDeque.poll()).f21311b.trySetResult(null);
            } else {
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f21309x = false;
        if (!(iBinder instanceof b)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f21307v;
                if (!arrayDeque.isEmpty()) {
                    ((a) arrayDeque.poll()).f21311b.trySetResult(null);
                } else {
                    return;
                }
            }
        } else {
            this.f21308w = (b) iBinder;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
