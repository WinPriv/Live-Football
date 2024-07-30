package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import b.b;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: s, reason: collision with root package name */
    public NotificationManager f1298s;

    /* renamed from: t, reason: collision with root package name */
    public int f1299t = -1;

    /* renamed from: u, reason: collision with root package name */
    public final a f1300u = new a();

    /* loaded from: classes.dex */
    public class a extends b {
        public a() {
        }

        public final void m() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i10 = trustedWebActivityService.f1299t;
            if (i10 != -1) {
                if (i10 == Binder.getCallingUid()) {
                } else {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                trustedWebActivityService.c();
                throw null;
            }
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.f1298s != null) {
        } else {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract n.b c();

    public final int d() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1300u;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f1298s = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f1299t = -1;
        return super.onUnbind(intent);
    }
}
