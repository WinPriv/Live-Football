package com.anythink.expressad.atsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.anythink.expressad.exoplayer.k.o;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MraidVolumeChangeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static double f7015a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private static final String f7016b = "android.media.VOLUME_CHANGED_ACTION";

    /* renamed from: c, reason: collision with root package name */
    private static final String f7017c = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* renamed from: d, reason: collision with root package name */
    private Context f7018d;

    /* renamed from: e, reason: collision with root package name */
    private AudioManager f7019e;
    private boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    private VolumeChangeListener f7020g;

    /* renamed from: h, reason: collision with root package name */
    private VolumeChangeBroadcastReceiver f7021h;

    /* loaded from: classes.dex */
    public static class VolumeChangeBroadcastReceiver extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<MraidVolumeChangeReceiver> f7022a;

        public VolumeChangeBroadcastReceiver(MraidVolumeChangeReceiver mraidVolumeChangeReceiver) {
            this.f7022a = new WeakReference<>(mraidVolumeChangeReceiver);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MraidVolumeChangeReceiver mraidVolumeChangeReceiver;
            VolumeChangeListener volumeChangeListener;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra(MraidVolumeChangeReceiver.f7017c, -1) == 3 && (mraidVolumeChangeReceiver = this.f7022a.get()) != null && (volumeChangeListener = mraidVolumeChangeReceiver.getVolumeChangeListener()) != null) {
                double currentVolume = mraidVolumeChangeReceiver.getCurrentVolume();
                if (currentVolume >= 0.0d) {
                    volumeChangeListener.onVolumeChanged(currentVolume);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface VolumeChangeListener {
        void onVolumeChanged(double d10);
    }

    public MraidVolumeChangeReceiver(Context context) {
        this.f7018d = context;
        this.f7019e = (AudioManager) context.getApplicationContext().getSystemService(o.f9069b);
    }

    public double getCurrentVolume() {
        int i10;
        AudioManager audioManager = this.f7019e;
        int i11 = -1;
        if (audioManager != null) {
            i10 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
        }
        AudioManager audioManager2 = this.f7019e;
        if (audioManager2 != null) {
            i11 = audioManager2.getStreamVolume(3);
        }
        double d10 = (i11 * 100.0d) / i10;
        f7015a = d10;
        return d10;
    }

    public VolumeChangeListener getVolumeChangeListener() {
        return this.f7020g;
    }

    public void registerReceiver() {
        if (this.f7018d != null) {
            this.f7021h = new VolumeChangeBroadcastReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f7018d.registerReceiver(this.f7021h, intentFilter);
            this.f = true;
        }
    }

    public void setVolumeChangeListener(VolumeChangeListener volumeChangeListener) {
        this.f7020g = volumeChangeListener;
    }

    public void unregisterReceiver() {
        Context context;
        if (this.f && (context = this.f7018d) != null) {
            try {
                context.unregisterReceiver(this.f7021h);
                this.f7020g = null;
                this.f = false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
