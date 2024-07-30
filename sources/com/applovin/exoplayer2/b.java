package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13321a;

    /* renamed from: b, reason: collision with root package name */
    private final a f13322b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13323c;

    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0153b f13327b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f13328c;

        public a(Handler handler, InterfaceC0153b interfaceC0153b) {
            this.f13328c = handler;
            this.f13327b = interfaceC0153b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f13328c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f13323c) {
                this.f13327b.a();
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0153b {
        void a();
    }

    public b(Context context, Handler handler, InterfaceC0153b interfaceC0153b) {
        this.f13321a = context.getApplicationContext();
        this.f13322b = new a(handler, interfaceC0153b);
    }

    public void a(boolean z10) {
        if (z10 && !this.f13323c) {
            this.f13321a.registerReceiver(this.f13322b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f13323c = true;
        } else {
            if (z10 || !this.f13323c) {
                return;
            }
            this.f13321a.unregisterReceiver(this.f13322b);
            this.f13323c = false;
        }
    }
}
