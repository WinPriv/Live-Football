package m;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f32608s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f32609t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f32610u;

    public c(d dVar, String str, Bundle bundle) {
        this.f32610u = dVar;
        this.f32608s = str;
        this.f32609t = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32610u.f32612b.e(this.f32609t, this.f32608s);
        throw null;
    }
}
