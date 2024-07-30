package com.anythink.expressad.exoplayer.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.expressad.exoplayer.k.af;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    c f7346a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7347b;

    /* renamed from: c, reason: collision with root package name */
    private final b f7348c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f7349d;

    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                c a10 = c.a(intent);
                if (!a10.equals(d.this.f7346a)) {
                    d dVar = d.this;
                    dVar.f7346a = a10;
                    b unused = dVar.f7348c;
                }
            }
        }

        public /* synthetic */ a(d dVar, byte b10) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private d(Context context, b bVar) {
        a aVar;
        this.f7347b = (Context) com.anythink.expressad.exoplayer.k.a.a(context);
        this.f7348c = (b) com.anythink.expressad.exoplayer.k.a.a(bVar);
        if (af.f8993a >= 21) {
            aVar = new a(this, (byte) 0);
        } else {
            aVar = null;
        }
        this.f7349d = aVar;
    }

    private void b() {
        BroadcastReceiver broadcastReceiver = this.f7349d;
        if (broadcastReceiver != null) {
            this.f7347b.unregisterReceiver(broadcastReceiver);
        }
    }

    private c a() {
        BroadcastReceiver broadcastReceiver = this.f7349d;
        c a10 = c.a(broadcastReceiver == null ? null : this.f7347b.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
        this.f7346a = a10;
        return a10;
    }
}
