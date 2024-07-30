package k4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import k4.a0;

/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30361a;

    /* renamed from: b, reason: collision with root package name */
    public final a f30362b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30363c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: classes2.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final InterfaceC0416b f30364s;

        /* renamed from: t, reason: collision with root package name */
        public final Handler f30365t;

        public a(Handler handler, a0.b bVar) {
            this.f30365t = handler;
            this.f30364s = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f30365t.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f30363c) {
                a0.this.q0(-1, 3, false);
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: k4.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0416b {
    }

    public b(Context context, Handler handler, a0.b bVar) {
        this.f30361a = context.getApplicationContext();
        this.f30362b = new a(handler, bVar);
    }

    public final void a() {
        if (this.f30363c) {
            this.f30361a.unregisterReceiver(this.f30362b);
            this.f30363c = false;
        }
    }
}
