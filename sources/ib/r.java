package ib;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.utils.f0;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.opendevice.open.IOaidManager;
import com.huawei.opendevice.open.OAIDSettingActivity;
import java.io.File;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29513a = 0;

    static {
        String str = File.separator;
    }

    public static void a(OAIDSettingActivity oAIDSettingActivity, boolean z10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("limit_track", Boolean.valueOf(z10));
        Uri I = z1.I(oAIDSettingActivity, "/oaid/reset");
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.g(oAIDSettingActivity, I)) {
            n7.g("OaidAccessUtil", "provider uri invalid.");
        } else {
            oAIDSettingActivity.getContentResolver().update(I, contentValues, null, null);
        }
    }

    public static Pair<String, Boolean> b(Context context, String str) {
        if (z1.P(context)) {
            IOaidManager B = androidx.activity.n.B(context);
            return new Pair<>(B.getOpenAnonymousID(str), Boolean.valueOf(B.isLimitTracking(str)));
        }
        Cursor cursor = null;
        try {
            try {
                Uri I = z1.I(context, "/oaid/query");
                if (!com.huawei.openalliance.ad.ppskit.utils.d0.g(context, I)) {
                    n7.g("OaidAccessUtil", "provider uri invalid.");
                    return null;
                }
                Cursor query = context.getContentResolver().query(I, null, null, new String[]{str}, null);
                if (query != null && query.moveToFirst()) {
                    Pair<String, Boolean> pair = new Pair<>(query.getString(query.getColumnIndexOrThrow("oaid")), Boolean.valueOf(TextUtils.equals(Boolean.TRUE.toString(), query.getString(query.getColumnIndexOrThrow("limit_track")))));
                    query.close();
                    return pair;
                }
                throw new s("no cursor found");
            } catch (IllegalArgumentException unused) {
                n7.g("OaidAccessUtil", "getOaidAndTrackLimit IllegalArgumentException");
                throw new s("getOaidAndTrackLimit IllegalArgumentException");
            } catch (Exception e10) {
                String concat = "getOaidAndTrackLimit ".concat(e10.getClass().getSimpleName());
                n7.g("OaidAccessUtil", concat);
                throw new s(concat);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        if (z1.P(context)) {
            return androidx.activity.n.B(context).getOpenAnonymousID(packageName);
        }
        Cursor cursor = null;
        try {
            try {
                Uri I = z1.I(context, "/oaid/query");
                if (!com.huawei.openalliance.ad.ppskit.utils.d0.g(context, I)) {
                    n7.g("OaidAccessUtil", "provider uri invalid.");
                    return null;
                }
                Cursor query = context.getContentResolver().query(I, null, null, new String[]{packageName}, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("oaid"));
                    query.close();
                    if (string == null) {
                        return "";
                    }
                    return string;
                }
                throw new s("no cursor found");
            } catch (IllegalArgumentException unused) {
                n7.g("OaidAccessUtil", "getOaid IllegalArgumentException");
                throw new s("getOaid IllegalArgumentException");
            } catch (Exception e10) {
                String concat = "getOaid ".concat(e10.getClass().getSimpleName());
                n7.g("OaidAccessUtil", concat);
                throw new s(concat);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (0 == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r12) {
        /*
            java.lang.String r0 = r12.getPackageName()
            java.lang.String r1 = "OaidAccessUtil"
            java.lang.String r2 = "isLimitTracking "
            boolean r3 = com.huawei.openalliance.ad.ppskit.utils.z1.P(r12)
            if (r3 == 0) goto L17
            com.huawei.opendevice.open.IOaidManager r12 = androidx.activity.n.B(r12)
            boolean r12 = r12.isLimitTracking(r0)
            goto L7e
        L17:
            r3 = 1
            r4 = 0
            java.lang.String r5 = "/oaid/query"
            android.net.Uri r7 = com.huawei.openalliance.ad.ppskit.utils.z1.I(r12, r5)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            boolean r5 = com.huawei.openalliance.ad.ppskit.utils.d0.g(r12, r7)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            if (r5 != 0) goto L2b
            java.lang.String r12 = "provider uri invalid."
            ka.n7.g(r1, r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            goto L7d
        L2b:
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            r8 = 0
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            r12 = 0
            r10[r12] = r0     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            r11 = 0
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            if (r4 == 0) goto L5b
            boolean r12 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            if (r12 == 0) goto L5b
            java.lang.String r12 = "limit_track"
            int r12 = r4.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            java.lang.String r12 = r4.getString(r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            boolean r12 = android.text.TextUtils.equals(r0, r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60 java.lang.IllegalArgumentException -> L73
            r4.close()
            goto L7e
        L5b:
            if (r4 == 0) goto L7d
            goto L7a
        L5e:
            r12 = move-exception
            goto L7f
        L60:
            r12 = move-exception
            java.lang.Class r12 = r12.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r12 = r12.getSimpleName()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r12 = r2.concat(r12)     // Catch: java.lang.Throwable -> L5e
            ka.n7.g(r1, r12)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L7d
            goto L7a
        L73:
            java.lang.String r12 = "isLimitTracking IllegalArgumentException"
            ka.n7.g(r1, r12)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L7d
        L7a:
            r4.close()
        L7d:
            r12 = r3
        L7e:
            return r12
        L7f:
            if (r4 == 0) goto L84
            r4.close()
        L84:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.r.d(android.content.Context):boolean");
    }

    public static boolean e(Context context) {
        Uri I;
        Cursor cursor = null;
        try {
            try {
                I = z1.I(context, "/oaid/query");
            } catch (IllegalArgumentException unused) {
                n7.g("OaidAccessUtil", "isDisableOaidCollection IllegalArgumentException");
                if (0 == 0) {
                    return false;
                }
            } catch (Exception e10) {
                n7.g("OaidAccessUtil", "isDisableOaidCollection ".concat(e10.getClass().getSimpleName()));
                if (0 == 0) {
                    return false;
                }
            }
            if (!com.huawei.openalliance.ad.ppskit.utils.d0.g(context, I)) {
                n7.g("OaidAccessUtil", "provider uri invalid.");
                return true;
            }
            cursor = context.getContentResolver().query(I, null, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                boolean equals = TextUtils.equals(Boolean.TRUE.toString(), cursor.getString(cursor.getColumnIndexOrThrow("disable_collection")));
                cursor.close();
                return equals;
            }
            if (cursor == null) {
                return false;
            }
            cursor.close();
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean f(Context context) {
        boolean z10;
        if (e(context) || !Cif.c(context)) {
            return true;
        }
        if (!Cif.a(context).d()) {
            if (f0.a.f22843a < 16 && f0.a.f22844b < 33) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(OAIDSettingActivity oAIDSettingActivity) {
        int i10;
        ConfigSpHandler b10 = ConfigSpHandler.b(oAIDSettingActivity);
        synchronized (b10.f22478a) {
            i10 = b10.s().getInt("bi_report_for_oaid", 0);
        }
        if (1 != i10) {
            return false;
        }
        return true;
    }
}
