package m;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f32614s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f32615t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f32616u;

    public e(d dVar, String str, Bundle bundle) {
        this.f32616u = dVar;
        this.f32614s = str;
        this.f32615t = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32616u.f32612b.m(this.f32615t, this.f32614s);
        throw null;
    }
}
