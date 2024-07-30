package com.iab.omid.library.vungle.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.anythink.expressad.exoplayer.k.o;

/* loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24468a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f24469b;

    /* renamed from: c, reason: collision with root package name */
    private final a f24470c;

    /* renamed from: d, reason: collision with root package name */
    private final c f24471d;

    /* renamed from: e, reason: collision with root package name */
    private float f24472e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24468a = context;
        this.f24469b = (AudioManager) context.getSystemService(o.f9069b);
        this.f24470c = aVar;
        this.f24471d = cVar;
    }

    private float c() {
        return this.f24470c.a(this.f24469b.getStreamVolume(3), this.f24469b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24471d.a(this.f24472e);
    }

    public void a() {
        this.f24472e = c();
        d();
        this.f24468a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f24468a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (a(c10)) {
            this.f24472e = c10;
            d();
        }
    }

    private boolean a(float f) {
        return f != this.f24472e;
    }
}
