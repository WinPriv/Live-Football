package com.huawei.hms.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class hd {
    public static final float Code = -1.0f;
    private static final String I = "android.media.VOLUME_CHANGED_ACTION";
    private static final String V = "VolumeChangeObserver";
    private static final String Z = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    private b B;
    private a C;
    private boolean D = false;
    private AudioManager F;
    private Context S;

    /* loaded from: classes2.dex */
    public static class a extends BroadcastReceiver {
        private WeakReference<hd> Code;

        public a(hd hdVar) {
            this.Code = new WeakReference<>(hdVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            hd hdVar;
            b I;
            try {
                if ((("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra(hd.Z, 0) == 3) || intent.getIntExtra(hd.Z, 0) == 1) && (hdVar = this.Code.get()) != null && (I = hdVar.I()) != null) {
                    I.Code();
                }
            } catch (Throwable th) {
                e0.i.q(th, "onReceive error:", hd.V);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void Code();
    }

    public hd(Context context) {
        this.S = context;
        this.F = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b I() {
        return this.B;
    }

    public float Code(boolean z10) {
        AudioManager audioManager = this.F;
        return audioManager != null ? he.Code(audioManager, z10) : gl.Code;
    }

    public void V() {
        if (this.D) {
            try {
                this.S.unregisterReceiver(this.C);
            } catch (Exception e10) {
                ex.V(V, "unregisterReceiver, ".concat(e10.getClass().getSimpleName()));
            }
            this.B = null;
            this.D = false;
        }
    }

    public void Code() {
        if (this.C == null) {
            this.C = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            try {
                this.S.registerReceiver(this.C, intentFilter);
            } catch (Exception e10) {
                ex.V(V, "registerReceiver, ".concat(e10.getClass().getSimpleName()));
            }
            this.D = true;
        }
    }

    public void Code(b bVar) {
        this.B = bVar;
    }
}
