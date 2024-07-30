package o9;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33780b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33781c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.b f33782d;

    public a(d0.b bVar, Context context, String str, boolean z10) {
        this.f33779a = context;
        this.f33780b = str;
        this.f33781c = z10;
        this.f33782d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if ((r9 - r11) < r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        android.util.Log.i("HomeCountryImpl", "current homeCountry is valid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if ((r9 - r11) < r7) goto L31;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void call() {
        /*
            r15 = this;
            java.lang.String r0 = "appgallery_service_homecountry"
            r1 = 0
            boolean r2 = r15.f33781c
            d0.b r3 = r15.f33782d
            java.lang.String r4 = "HomeCountryImpl"
            android.content.Context r5 = r15.f33779a
            if (r2 == 0) goto L14
            java.lang.String r0 = "force homeCountry"
            android.util.Log.i(r4, r0)
            goto Lbd
        L14:
            q9.a r2 = q9.a.a(r5)
            java.lang.String r2 = r2.f34716a
            java.lang.String r6 = "effectiveduration"
            r7 = 47839000(0x2d9f718, double:2.36356064E-316)
            if (r2 == 0) goto L45
            java.lang.String r9 = "homeCountry from cache"
            android.util.Log.i(r4, r9)
            long r9 = java.lang.System.currentTimeMillis()
            q9.a r11 = q9.a.a(r5)
            long r11 = r11.f34717b
            q9.a r13 = q9.a.a(r5)
            r13.getClass()
            android.content.SharedPreferences r13 = r13.f34718c     // Catch: java.lang.Exception -> L3e
            long r13 = r13.getLong(r6, r7)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r13 = r7
        L3f:
            long r9 = r9 - r11
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 >= 0) goto L45
            goto Lb4
        L45:
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r0)     // Catch: java.lang.Exception -> L4e
            goto L54
        L4e:
            java.lang.String r2 = "getHomeCountryBySettings exception"
            android.util.Log.e(r4, r2)
            r2 = r1
        L54:
            if (r2 == 0) goto L7a
            java.lang.String r6 = "homeCountry from settings"
            android.util.Log.i(r4, r6)
            o9.b r6 = new o9.b     // Catch: java.lang.Exception -> L6d
            r6.<init>(r5)     // Catch: java.lang.Exception -> L6d
            android.content.ContentResolver r7 = r5.getContentResolver()     // Catch: java.lang.Exception -> L6d
            android.net.Uri r0 = android.provider.Settings.Secure.getUriFor(r0)     // Catch: java.lang.Exception -> L6d
            r8 = 0
            r7.registerContentObserver(r0, r8, r6)     // Catch: java.lang.Exception -> L6d
            goto L72
        L6d:
            java.lang.String r0 = "registerHomeCountryObserver exception"
            android.util.Log.e(r4, r0)
        L72:
            q9.a r0 = q9.a.a(r5)
            r0.d(r2)
            goto Lb9
        L7a:
            q9.a r0 = q9.a.a(r5)
            java.lang.String r2 = "homeCountryInProvider"
            android.content.SharedPreferences r0 = r0.f34718c
            java.lang.String r2 = r0.getString(r2, r1)
            if (r2 == 0) goto Lbd
            java.lang.String r0 = "homeCountry from sp"
            android.util.Log.i(r4, r0)
            long r9 = java.lang.System.currentTimeMillis()
            q9.a r0 = q9.a.a(r5)
            r0.getClass()
            r11 = 0
            android.content.SharedPreferences r0 = r0.f34718c     // Catch: java.lang.Exception -> La2
            java.lang.String r13 = "providerUpdateTime"
            long r11 = r0.getLong(r13, r11)     // Catch: java.lang.Exception -> La2
        La2:
            q9.a r0 = q9.a.a(r5)
            r0.getClass()
            android.content.SharedPreferences r0 = r0.f34718c     // Catch: java.lang.Exception -> Laf
            long r7 = r0.getLong(r6, r7)     // Catch: java.lang.Exception -> Laf
        Laf:
            long r9 = r9 - r11
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb4:
            java.lang.String r0 = "current homeCountry is valid"
            android.util.Log.i(r4, r0)
        Lb9:
            r3.g(r2)
            goto Lc2
        Lbd:
            java.lang.String r0 = r15.f33780b
            j7.r.u(r3, r5, r0)
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.a.call():java.lang.Object");
    }
}
