package m;

import a.a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public final class d extends a.AbstractBinderC0000a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.d f32612b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f32611a = new Handler(Looper.getMainLooper());

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a(Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.f32612b.k();
            throw null;
        }
    }

    @Override // a.a
    public final void a(Bundle bundle, String str) throws RemoteException {
        if (this.f32612b == null) {
            return;
        }
        this.f32611a.post(new e(this, str, bundle));
    }

    @Override // a.a
    public final void j(Bundle bundle) throws RemoteException {
        if (this.f32612b == null) {
            return;
        }
        this.f32611a.post(new a(bundle));
    }
}
