package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.anythink.expressad.exoplayer.k.o;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24254a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f24255b;

    /* renamed from: c, reason: collision with root package name */
    private final a f24256c;

    /* renamed from: d, reason: collision with root package name */
    private final c f24257d;

    /* renamed from: e, reason: collision with root package name */
    private float f24258e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24254a = context;
        this.f24255b = (AudioManager) context.getSystemService(o.f9069b);
        this.f24256c = aVar;
        this.f24257d = cVar;
    }

    private float a() {
        return this.f24256c.a(this.f24255b.getStreamVolume(3), this.f24255b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f24257d.a(this.f24258e);
    }

    public void c() {
        this.f24258e = a();
        b();
        this.f24254a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f24254a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f24258e = a10;
            b();
        }
    }

    private boolean a(float f) {
        return f != this.f24258e;
    }
}
