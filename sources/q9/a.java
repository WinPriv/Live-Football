package q9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f34714d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f34715e;

    /* renamed from: a, reason: collision with root package name */
    public String f34716a;

    /* renamed from: b, reason: collision with root package name */
    public long f34717b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f34718c;

    public a(Context context) {
        try {
            this.f34718c = context.createDeviceProtectedStorageContext().getSharedPreferences("MarketHomeCountry.DataStorage", 0);
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "getSharedPreference error");
        }
    }

    public static a a(Context context) {
        if (f34715e == null) {
            synchronized (f34714d) {
                if (f34715e == null) {
                    f34715e = new a(context);
                }
            }
        }
        return f34715e;
    }

    public final void b(long j10) {
        try {
            this.f34718c.edit().putLong("effectiveduration", j10).commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "setEffectiveDuration, putLong error");
        }
    }

    public final void c(String str) {
        SharedPreferences sharedPreferences = this.f34718c;
        try {
            sharedPreferences.edit().putString("homeCountryInProvider", str).commit();
            sharedPreferences.edit().putLong("providerUpdateTime", System.currentTimeMillis()).commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "setHomeCountryInProvider, putString error");
        }
    }

    public final void d(String str) {
        long j10;
        this.f34716a = str;
        if (str != null) {
            j10 = System.currentTimeMillis();
        } else {
            j10 = 0;
        }
        this.f34717b = j10;
    }
}
