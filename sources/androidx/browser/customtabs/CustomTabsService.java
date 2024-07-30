package androidx.browser.customtabs;

import a.b;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m.d;
import m.m;
import q.i;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: s, reason: collision with root package name */
    public final i<IBinder, IBinder.DeathRecipient> f1294s = new i<>();

    /* renamed from: t, reason: collision with root package name */
    public final a f1295t = new a();

    /* loaded from: classes.dex */
    public class a extends b.a {
        public a() {
        }

        public static PendingIntent m(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // a.b
        public final boolean c(d dVar) {
            return n(dVar, null);
        }

        @Override // a.b
        public final boolean d(long j10) {
            return CustomTabsService.this.i();
        }

        @Override // a.b
        public final boolean f(a.a aVar, Uri uri, Bundle bundle, ArrayList arrayList) {
            PendingIntent m10 = m(bundle);
            if (aVar == null && m10 == null) {
                throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
            }
            return CustomTabsService.this.b();
        }

        public final boolean n(a.a aVar, PendingIntent pendingIntent) {
            final m mVar = new m(aVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: m.j
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        IBinder asBinder;
                        CustomTabsService.a aVar2 = CustomTabsService.a.this;
                        m mVar2 = mVar;
                        CustomTabsService customTabsService = CustomTabsService.this;
                        customTabsService.getClass();
                        try {
                            synchronized (customTabsService.f1294s) {
                                a.a aVar3 = mVar2.f32633a;
                                if (aVar3 == null) {
                                    asBinder = null;
                                } else {
                                    asBinder = aVar3.asBinder();
                                }
                                if (asBinder != null) {
                                    asBinder.unlinkToDeath(customTabsService.f1294s.getOrDefault(asBinder, null), 0);
                                    customTabsService.f1294s.remove(asBinder);
                                }
                            }
                        } catch (NoSuchElementException unused) {
                        }
                    }
                };
                synchronized (CustomTabsService.this.f1294s) {
                    aVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f1294s.put(aVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1295t;
    }
}
