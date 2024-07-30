package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.anythink.expressad.exoplayer.k.o;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24372a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f24373b;

    /* renamed from: c, reason: collision with root package name */
    private final a f24374c;

    /* renamed from: d, reason: collision with root package name */
    private final c f24375d;

    /* renamed from: e, reason: collision with root package name */
    private float f24376e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24372a = context;
        this.f24373b = (AudioManager) context.getSystemService(o.f9069b);
        this.f24374c = aVar;
        this.f24375d = cVar;
    }

    private float a() {
        return this.f24374c.a(this.f24373b.getStreamVolume(3), this.f24373b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f24375d.a(this.f24376e);
    }

    public final void c() {
        this.f24376e = a();
        b();
        this.f24372a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void d() {
        this.f24372a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f24376e = a10;
            b();
        }
    }

    private boolean a(float f) {
        return f != this.f24376e;
    }
}
