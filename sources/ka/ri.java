package ka;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.openalliance.ad.ppskit.utils.u1;

/* loaded from: classes2.dex */
public final class ri {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f31779a = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid/query").build();

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f31780b = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_scp/get").build();

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f31781s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ u1.a f31782t;

        public a(Context context, u1.a aVar) {
            this.f31781s = context;
            this.f31782t = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r15 = this;
                android.content.Context r0 = r15.f31781s
                com.huawei.openalliance.ad.ppskit.handlers.l r0 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r0)
                android.content.Context r1 = r15.f31781s
                java.lang.String r1 = r1.getPackageName()
                java.lang.String r2 = "oaidKey"
                r3 = 30
                boolean r0 = r0.j(r3, r1, r2)
                if (r0 == 0) goto L1e
                java.lang.String r0 = "OaidProviderUtil"
                java.lang.String r1 = "within oaid key time interval."
                ka.n7.b(r0, r1)
                return
            L1e:
                android.content.Context r0 = r15.f31781s
                java.lang.String r1 = ""
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L27
                goto L7e
            L27:
                r4 = 0
                com.huawei.openalliance.ad.ppskit.handlers.l r5 = com.huawei.openalliance.ad.ppskit.handlers.l.d(r0)     // Catch: java.lang.Throwable -> L64
                java.lang.String r6 = r0.getPackageName()     // Catch: java.lang.Throwable -> L64
                java.lang.String r7 = "oaidKey"
                r5.S(r6, r7)     // Catch: java.lang.Throwable -> L64
                android.net.Uri r9 = ka.ri.f31780b     // Catch: java.lang.Throwable -> L64
                java.util.HashMap r5 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a     // Catch: java.lang.Throwable -> L64
                if (r9 != 0) goto L3d
                r0 = r4
                goto L49
            L3d:
                android.content.ContentResolver r8 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L64
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                android.database.Cursor r0 = r8.query(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L64
            L49:
                if (r0 == 0) goto L5f
                boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5d
                if (r5 != 0) goto L52
                goto L5f
            L52:
                java.lang.String r4 = "op_wk"
                int r4 = r0.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r1 = r0.getString(r4)     // Catch: java.lang.Throwable -> L5d
                goto L7b
            L5d:
                r4 = move-exception
                goto L68
            L5f:
                androidx.transition.n.D(r0)
                r1 = r4
                goto L7e
            L64:
                r0 = move-exception
                r14 = r4
                r4 = r0
                r0 = r14
            L68:
                java.lang.String r5 = "OaidProviderUtil"
                java.lang.String r6 = "get remote key ex: %s"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lbd
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> Lbd
                r7[r2] = r4     // Catch: java.lang.Throwable -> Lbd
                ka.n7.h(r5, r6, r7)     // Catch: java.lang.Throwable -> Lbd
            L7b:
                androidx.transition.n.D(r0)
            L7e:
                boolean r0 = ka.n7.d()
                if (r0 == 0) goto L93
                java.lang.String r0 = "OaidProviderUtil"
                java.lang.String r4 = "async get remote key: %s"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r5 = com.huawei.openalliance.ad.ppskit.utils.y1.w(r1)
                r3[r2] = r5
                ka.n7.c(r0, r4, r3)
            L93:
                com.huawei.openalliance.ad.ppskit.utils.u1$a r0 = r15.f31782t
                byte[] r2 = r0.f23038c
                monitor-enter(r2)
                java.lang.String r3 = "hiad_sp_red_stone_file"
                android.content.Context r4 = r0.f23039d     // Catch: java.lang.Throwable -> Lba
                r5 = 4
                android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r5)     // Catch: java.lang.Throwable -> Lba
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> Lba
                android.content.Context r0 = r0.f23039d     // Catch: java.lang.Throwable -> Lba
                byte[] r0 = com.huawei.openalliance.ad.ppskit.utils.u1.h(r0)     // Catch: java.lang.Throwable -> Lba
                java.lang.String r4 = "read_first_chapter"
                java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.m2.a(r1, r0)     // Catch: java.lang.Throwable -> Lba
                android.content.SharedPreferences$Editor r0 = r3.putString(r4, r0)     // Catch: java.lang.Throwable -> Lba
                r0.apply()     // Catch: java.lang.Throwable -> Lba
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lba
                return
            Lba:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lba
                throw r0
            Lbd:
                r1 = move-exception
                androidx.transition.n.D(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.ri.a.run():void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.String, java.lang.Boolean> a(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            if (r6 == 0) goto Lab
            android.net.Uri r1 = ka.ri.f31780b
            boolean r1 = b(r6, r1)
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L14
            return r0
        L14:
            com.huawei.openalliance.ad.ppskit.utils.u1$a r1 = com.huawei.openalliance.ad.ppskit.utils.u1.a.a(r6)
            byte[] r2 = r1.f23038c
            monitor-enter(r2)
            java.lang.String r3 = "hiad_sp_red_stone_file"
            android.content.Context r4 = r1.f23039d     // Catch: java.lang.Throwable -> La8
            r5 = 4
            android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r4 = "read_first_chapter"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)     // Catch: java.lang.Throwable -> La8
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L33
            goto L3d
        L33:
            android.content.Context r4 = r1.f23039d     // Catch: java.lang.Throwable -> La8
            byte[] r4 = com.huawei.openalliance.ad.ppskit.utils.u1.h(r4)     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = com.huawei.openalliance.ad.ppskit.utils.m2.c(r3, r4)     // Catch: java.lang.Throwable -> La8
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La8
            ka.ri$a r2 = new ka.ri$a
            r2.<init>(r6, r1)
            r6 = 0
            com.huawei.openalliance.ad.ppskit.utils.p2.a(r2, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L55
            java.lang.String r6 = "OaidProviderUtil"
            java.lang.String r7 = "scp is empty"
            ka.n7.b(r6, r7)
            return r0
        L55:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L89
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L62
            goto L89
        L62:
            byte[] r1 = com.huawei.openalliance.ad.ppskit.utils.u1.f23032b
            monitor-enter(r1)
            byte[] r2 = androidx.transition.n.V(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = com.huawei.openalliance.ad.ppskit.utils.m2.c(r7, r2)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L86
            goto L8a
        L6f:
            r7 = move-exception
            java.lang.String r2 = "SecretUtil"
            java.lang.String r3 = "decrypt oaid ex: %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L86
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r7.getSimpleName()     // Catch: java.lang.Throwable -> L86
            r4[r6] = r7     // Catch: java.lang.Throwable -> L86
            ka.n7.h(r2, r3, r4)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L86
            goto L89
        L86:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L86
            throw r6
        L89:
            r6 = r0
        L8a:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L98
            java.lang.String r6 = "OaidProviderUtil"
            java.lang.String r7 = "decrypt oaid failed."
            ka.n7.b(r6, r7)
            return r0
        L98:
            java.lang.String r7 = "00000000-0000-0000-0000-000000000000"
            boolean r7 = r7.equalsIgnoreCase(r6)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.<init>(r6, r7)
            return r0
        La8:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La8
            throw r6
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ri.a(android.content.Context, java.lang.String):android.util.Pair");
    }

    public static boolean b(Context context, Uri uri) {
        Integer num;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj;
        if (context != null && uri != null) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(com.huawei.openalliance.ad.ppskit.utils.o2.h(context), 128);
            } catch (Throwable th) {
                n7.f("ApkUtil", "getPpsKitVerCode ex: %s", th.getClass().getSimpleName());
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("ppskit_ver_code")) != null) {
                String obj2 = obj.toString();
                if (n7.d()) {
                    n7.c("ApkUtil", "ppsKitVerCode:%s", obj2);
                }
                num = com.huawei.openalliance.ad.ppskit.utils.y1.q(obj2);
                if (num != null && 30462100 <= num.intValue()) {
                    return com.huawei.openalliance.ad.ppskit.utils.d0.g(context, uri);
                }
            }
            num = null;
            if (num != null) {
                return com.huawei.openalliance.ad.ppskit.utils.d0.g(context, uri);
            }
        }
        return false;
    }
}
