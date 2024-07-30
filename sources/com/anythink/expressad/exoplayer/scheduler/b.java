package com.anythink.expressad.exoplayer.scheduler;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.exoplayer.k.af;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9326a = "RequirementsWatcher";

    /* renamed from: b, reason: collision with root package name */
    private final Context f9327b;

    /* renamed from: c, reason: collision with root package name */
    private final c f9328c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.scheduler.a f9329d;

    /* renamed from: e, reason: collision with root package name */
    private C0117b f9330e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private a f9331g;

    /* loaded from: classes.dex */
    public final class a extends ConnectivityManager.NetworkCallback {
        private a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            super.onAvailable(network);
            Objects.toString(b.this);
            b.this.a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            super.onLost(network);
            Objects.toString(b.this);
            b.this.a(false);
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this();
        }
    }

    /* renamed from: com.anythink.expressad.exoplayer.scheduler.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0117b extends BroadcastReceiver {
        private C0117b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                Objects.toString(b.this);
                intent.getAction();
                b.this.a(false);
            }
        }

        public /* synthetic */ C0117b(b bVar, byte b10) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    private b(Context context, c cVar, com.anythink.expressad.exoplayer.scheduler.a aVar) {
        this.f9329d = aVar;
        this.f9328c = cVar;
        this.f9327b = context.getApplicationContext();
        toString();
    }

    private void b() {
        this.f9327b.unregisterReceiver(this.f9330e);
        this.f9330e = null;
        if (this.f9331g != null && af.f8993a >= 21) {
            ((ConnectivityManager) this.f9327b.getSystemService("connectivity")).unregisterNetworkCallback(this.f9331g);
            this.f9331g = null;
        }
        toString();
    }

    private com.anythink.expressad.exoplayer.scheduler.a c() {
        return this.f9329d;
    }

    @TargetApi(23)
    private void d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9327b.getSystemService("connectivity");
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        a aVar = new a(this, (byte) 0);
        this.f9331g = aVar;
        connectivityManager.registerNetworkCallback(build, aVar);
    }

    private void e() {
        if (af.f8993a >= 21) {
            ((ConnectivityManager) this.f9327b.getSystemService("connectivity")).unregisterNetworkCallback(this.f9331g);
            this.f9331g = null;
        }
    }

    public final String toString() {
        return super.toString();
    }

    private void a() {
        com.anythink.expressad.exoplayer.k.a.a(Looper.myLooper());
        a(true);
        IntentFilter intentFilter = new IntentFilter();
        byte b10 = 0;
        if (this.f9329d.a() != 0) {
            if (af.f8993a >= 23) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f9327b.getSystemService("connectivity");
                NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
                a aVar = new a(this, b10);
                this.f9331g = aVar;
                connectivityManager.registerNetworkCallback(build, aVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f9329d.b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f9329d.c()) {
            if (af.f8993a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        C0117b c0117b = new C0117b(this, b10);
        this.f9330e = c0117b;
        this.f9327b.registerReceiver(c0117b, intentFilter, null, new Handler());
        toString();
    }

    private static void f() {
    }

    private static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        boolean a10 = this.f9329d.a(this.f9327b);
        if (z10 || a10 != this.f) {
            this.f = a10;
        }
    }
}
