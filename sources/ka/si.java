package ka;

import android.content.Context;
import android.net.Uri;
import com.huawei.openalliance.ad.ppskit.utils.u1;
import java.lang.ref.SoftReference;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes2.dex */
public final class si {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f31854a = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_pub_store/get").build();

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f31855b = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_pub_store_ks/get").build();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f31856c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static SoftReference<RSAPublicKey> f31857d;

    /* renamed from: e, reason: collision with root package name */
    public static SoftReference<RSAPublicKey> f31858e;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f31859s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ u1.a f31860t;

        public a(Context context, u1.a aVar) {
            this.f31859s = context;
            this.f31860t = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r10 = this;
                android.content.Context r0 = r10.f31859s
                java.lang.String r1 = "OaidSettingsForAppUtil"
                java.lang.String r2 = "remote pub "
                r3 = 0
                android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                android.net.Uri r5 = ka.si.f31855b     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                if (r3 == 0) goto L46
                boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                if (r0 == 0) goto L46
                java.lang.String r0 = "pub_store_ks"
                int r0 = r3.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                androidx.transition.n.D(r3)
                goto L4b
            L2b:
                r0 = move-exception
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L73
            L34:
                java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L73
                goto L43
            L39:
                r0 = move-exception
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L73
                goto L34
            L43:
                ka.n7.g(r1, r0)     // Catch: java.lang.Throwable -> L73
            L46:
                androidx.transition.n.D(r3)
                java.lang.String r0 = ""
            L4b:
                java.lang.String r1 = "OaidSettingsForAppUtil"
                java.lang.String r2 = "##### remote pub store KS: %s"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r0
                ka.n7.c(r1, r2, r3)
                com.huawei.openalliance.ad.ppskit.utils.u1$a r1 = r10.f31860t
                byte[] r2 = r1.f23036a
                monitor-enter(r2)
                android.content.SharedPreferences r1 = r1.b()     // Catch: java.lang.Throwable -> L70
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L70
                java.lang.String r3 = "pub_store_door_ks"
                android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)     // Catch: java.lang.Throwable -> L70
                r0.apply()     // Catch: java.lang.Throwable -> L70
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
                return
            L70:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
                throw r0
            L73:
                r0 = move-exception
                androidx.transition.n.D(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.si.a.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f31861s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ u1.a f31862t;

        public b(Context context, u1.a aVar) {
            this.f31861s = context;
            this.f31862t = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r10 = this;
                android.content.Context r0 = r10.f31861s
                java.lang.String r1 = "OaidSettingsForAppUtil"
                java.lang.String r2 = "remote pub "
                r3 = 0
                android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                android.net.Uri r5 = ka.si.f31854a     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                if (r3 == 0) goto L46
                boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                if (r0 == 0) goto L46
                java.lang.String r0 = "pub_store"
                int r0 = r3.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L2b java.lang.IllegalArgumentException -> L39
                androidx.transition.n.D(r3)
                goto L4b
            L2b:
                r0 = move-exception
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L73
            L34:
                java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L73
                goto L43
            L39:
                r0 = move-exception
                java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L73
                java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L73
                goto L34
            L43:
                ka.n7.g(r1, r0)     // Catch: java.lang.Throwable -> L73
            L46:
                androidx.transition.n.D(r3)
                java.lang.String r0 = ""
            L4b:
                java.lang.String r1 = "OaidSettingsForAppUtil"
                java.lang.String r2 = "##### remote pub store: %s"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r0
                ka.n7.c(r1, r2, r3)
                com.huawei.openalliance.ad.ppskit.utils.u1$a r1 = r10.f31862t
                byte[] r2 = r1.f23036a
                monitor-enter(r2)
                android.content.SharedPreferences r1 = r1.b()     // Catch: java.lang.Throwable -> L70
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L70
                java.lang.String r3 = "pub_store_door"
                android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)     // Catch: java.lang.Throwable -> L70
                r0.apply()     // Catch: java.lang.Throwable -> L70
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
                return
            L70:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
                throw r0
            L73:
                r0 = move-exception
                androidx.transition.n.D(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.si.b.run():void");
        }
    }

    public static RSAPublicKey a(Context context) {
        RSAPublicKey rSAPublicKey;
        String string;
        synchronized (f31856c) {
            SoftReference<RSAPublicKey> softReference = f31858e;
            if (softReference != null) {
                rSAPublicKey = softReference.get();
            } else {
                rSAPublicKey = null;
            }
            if (rSAPublicKey == null) {
                Context applicationContext = context.getApplicationContext();
                u1.a a10 = u1.a.a(applicationContext);
                synchronized (a10.f23036a) {
                    string = a10.b().getString("pub_store_door_ks", "");
                }
                RSAPublicKey g6 = com.huawei.openalliance.ad.ppskit.utils.u1.g(string);
                if (g6 != null) {
                    f31858e = new SoftReference<>(g6);
                }
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(applicationContext, a10), 0);
                rSAPublicKey = g6;
            }
        }
        return rSAPublicKey;
    }

    public static RSAPublicKey b(Context context) {
        RSAPublicKey rSAPublicKey;
        String string;
        synchronized (f31856c) {
            SoftReference<RSAPublicKey> softReference = f31857d;
            if (softReference != null) {
                rSAPublicKey = softReference.get();
            } else {
                rSAPublicKey = null;
            }
            if (rSAPublicKey == null) {
                Context applicationContext = context.getApplicationContext();
                u1.a a10 = u1.a.a(applicationContext);
                synchronized (a10.f23036a) {
                    string = a10.b().getString("pub_store_door", "");
                }
                RSAPublicKey g6 = com.huawei.openalliance.ad.ppskit.utils.u1.g(string);
                if (g6 != null) {
                    f31857d = new SoftReference<>(g6);
                }
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new b(applicationContext, a10), 0);
                rSAPublicKey = g6;
            }
        }
        return rSAPublicKey;
    }
}
