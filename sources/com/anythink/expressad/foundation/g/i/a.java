package com.anythink.expressad.foundation.g.i;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private String f10089b;

    /* renamed from: c, reason: collision with root package name */
    private MediaPlayer f10090c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f10091d;
    private volatile MediaPlayer.OnPreparedListener f;

    /* renamed from: a, reason: collision with root package name */
    Object f10088a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f10092e = false;

    public static /* synthetic */ boolean a(a aVar) {
        aVar.f10092e = true;
        return true;
    }

    private String c() {
        return this.f10089b;
    }

    private MediaPlayer d() {
        return this.f10090c;
    }

    private void a(MediaPlayer mediaPlayer, String str) {
        this.f10090c = mediaPlayer;
        this.f10089b = str;
        this.f10091d = true;
        this.f10090c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.i.a.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (a.this.f10088a) {
                    a.a(a.this);
                    if (a.this.f != null) {
                        a.this.f.onPrepared(mediaPlayer2);
                    }
                }
            }
        });
        try {
            this.f10090c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    private boolean b() {
        boolean z10;
        synchronized (this.f10088a) {
            z10 = this.f10092e;
        }
        return z10;
    }

    private boolean a() {
        boolean z10;
        synchronized (this.f10088a) {
            z10 = this.f10091d;
        }
        return z10;
    }

    private void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f10088a) {
            this.f = onPreparedListener;
        }
    }
}
