package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.hamkho.livefoot.R;
import java.lang.ref.SoftReference;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f23031a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23032b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static SoftReference<byte[]> f23033c;

    /* renamed from: d, reason: collision with root package name */
    public static SoftReference<byte[]> f23034d;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final byte[] f23035e = new byte[0];
        public static a f;

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f23036a = new byte[0];

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f23037b = new byte[0];

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f23038c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        public final Context f23039d;

        public a(Context context) {
            Context applicationContext = context.getApplicationContext();
            try {
                Context createDeviceProtectedStorageContext = applicationContext.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("pps_de_migration", 4);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (!sharedPreferences.getBoolean("hiad_sp_story_book_file", false)) {
                    if (!createDeviceProtectedStorageContext.moveSharedPreferencesFrom(applicationContext, "hiad_sp_story_book_file")) {
                        n7.g("DEMigrationHandler", "Failed to migrate hiad_sp_story_book_file");
                    }
                    edit.putBoolean("hiad_sp_story_book_file", true);
                    edit.apply();
                }
            } catch (Throwable th) {
                e0.i.p(th, "migrateFile ex: ", "DEMigrationHandler");
            }
            this.f23039d = context.createDeviceProtectedStorageContext();
        }

        public static a a(Context context) {
            a aVar;
            synchronized (f23035e) {
                if (f == null) {
                    f = new a(context);
                }
                aVar = f;
            }
            return aVar;
        }

        public final SharedPreferences b() {
            return this.f23039d.getSharedPreferences("hiad_sp_story_book_file", 4);
        }
    }

    public static String a(Context context, a aVar, String str) {
        byte[] bArr = new byte[16];
        j().nextBytes(bArr);
        String w10 = androidx.transition.n.w(bArr);
        String a10 = m2.a(w10, l(context));
        synchronized (aVar.f23037b) {
            aVar.f23039d.getSharedPreferences("hiad_sp_bed_rock_file", 4).edit().putString(str, a10).commit();
        }
        return w10;
    }

    public static byte[] b(Context context, String str) {
        String string = context.getString(R.string.hiad_str_2);
        String string2 = context.getString(R.string.hiad_str_3);
        byte[] O = androidx.transition.n.O(str);
        byte[] O2 = androidx.transition.n.O(string);
        return c(c(O, O2), androidx.transition.n.O(string2));
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= bArr2.length) {
            bArr2 = bArr;
            bArr = bArr2;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length];
        int i10 = 0;
        while (i10 < length2) {
            bArr3[i10] = (byte) (bArr2[i10] ^ bArr[i10]);
            i10++;
        }
        while (i10 < bArr.length) {
            bArr3[i10] = bArr[i10];
            i10++;
        }
        return bArr3;
    }

    public static byte[] d(byte[] bArr, char[] cArr) {
        String str;
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, bArr, 10000, 256);
        if (Build.VERSION.SDK_INT > 26) {
            str = "PBKDF2WithHmacSHA256";
        } else {
            str = "PBKDF2WithHmacSHA1";
        }
        return SecretKeyFactory.getInstance(str).generateSecret(pBEKeySpec).getEncoded();
    }

    public static byte[] e(Context context, String str) {
        try {
            return androidx.transition.n.V(f(context, str));
        } catch (Throwable th) {
            n7.g("SecretUtil", "getWorkKeyBytes ".concat(th.getClass().getSimpleName()));
            return k(context, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.content.Context r6, java.lang.String r7) {
        /*
            if (r6 != 0) goto L5
            java.lang.String r6 = ""
            return r6
        L5:
            byte[] r0 = com.huawei.openalliance.ad.ppskit.utils.u1.f23031a
            monitor-enter(r0)
            com.huawei.openalliance.ad.ppskit.utils.u1$a r1 = com.huawei.openalliance.ad.ppskit.utils.u1.a.a(r6)     // Catch: java.lang.Throwable -> L3c
            byte[] r2 = r1.f23037b     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "hiad_sp_bed_rock_file"
            android.content.Context r4 = r1.f23039d     // Catch: java.lang.Throwable -> L39
            r5 = 4
            android.content.SharedPreferences r3 = r4.getSharedPreferences(r3, r5)     // Catch: java.lang.Throwable -> L39
            r4 = 0
            java.lang.String r3 = r3.getString(r7, r4)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L25
            goto L33
        L25:
            byte[] r2 = l(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = com.huawei.openalliance.ad.ppskit.utils.m2.c(r3, r2)     // Catch: java.lang.Throwable -> L3c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L37
        L33:
            java.lang.String r2 = a(r6, r1, r7)     // Catch: java.lang.Throwable -> L3c
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r2
        L39:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r6     // Catch: java.lang.Throwable -> L3c
        L3c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.u1.f(android.content.Context, java.lang.String):java.lang.String");
    }

    public static RSAPublicKey g(String str) {
        try {
            byte[] O = androidx.transition.n.O(str);
            if (O.length == 0) {
                return null;
            }
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(O));
        } catch (Throwable th) {
            e0.i.p(th, "load public key err:", "SecretUtil");
            return null;
        }
    }

    public static byte[] h(Context context) {
        byte[] bArr;
        synchronized (f23031a) {
            SoftReference<byte[]> softReference = f23033c;
            if (softReference != null) {
                bArr = softReference.get();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                bArr = e(context, "get_a_book");
                f23033c = new SoftReference<>(bArr);
            }
        }
        return bArr;
    }

    public static byte[] i(Context context, boolean z10) {
        byte[] bArr;
        byte[] bArr2;
        SoftReference<byte[]> softReference;
        synchronized (f23031a) {
            if (z10) {
                bArr2 = k(context, "op_wk");
                softReference = new SoftReference<>(bArr2);
            } else {
                SoftReference<byte[]> softReference2 = f23034d;
                if (softReference2 != null) {
                    bArr = softReference2.get();
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    bArr2 = e(context, "op_wk");
                    softReference = new SoftReference<>(bArr2);
                } else {
                    bArr2 = bArr;
                }
            }
            f23034d = softReference;
        }
        return bArr2;
    }

    public static SecureRandom j() {
        SecureRandom secureRandom;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                secureRandom = SecureRandom.getInstanceStrong();
            } else {
                secureRandom = SecureRandom.getInstance("SHA1PRNG");
            }
        } catch (Exception e10) {
            n7.h("SecretUtil", "getInstanceStrong, exception: %s", e10.getClass().getSimpleName());
            secureRandom = null;
        }
        if (secureRandom == null) {
            return new SecureRandom();
        }
        return secureRandom;
    }

    public static byte[] k(Context context, String str) {
        n7.e("SecretUtil", "regenerateWorkKey");
        n7.c("SecretUtil", "regenerate %s", y1.j(str));
        a a10 = a.a(context);
        synchronized (a10.f23037b) {
            a10.f23039d.getSharedPreferences("hiad_sp_bed_rock_file", 4).edit().putString(str, "").commit();
        }
        return androidx.transition.n.O(f(context, str));
    }

    public static byte[] l(Context context) {
        String string;
        String str;
        String string2;
        if (context == null) {
            return new byte[0];
        }
        a a10 = a.a(context);
        a a11 = a.a(context);
        synchronized (a11.f23036a) {
            string = a11.b().getString("aes_work_key1", "");
        }
        if (y1.h(string)) {
            try {
                SecureRandom j10 = j();
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < 64; i10++) {
                    sb2.append(Integer.toHexString(j10.nextInt(16)));
                }
                str = sb2.toString();
            } catch (Throwable th) {
                e0.i.p(th, "generate aes key1 err:", "SecretUtil");
                str = "";
            }
            string = str;
            p2.a(new t1(a11, string), 0);
        }
        byte[] b10 = b(context, string);
        synchronized (a10.f23036a) {
            string2 = a10.b().getString("catch_a_cat", null);
            if (string2 == null) {
                byte[] bArr = new byte[16];
                j().nextBytes(bArr);
                string2 = androidx.transition.n.w(bArr);
                synchronized (a10.f23036a) {
                    a10.b().edit().putString("catch_a_cat", string2).commit();
                }
            }
        }
        try {
            return d(androidx.transition.n.O(string2), androidx.transition.n.w(b10).toCharArray());
        } catch (NoSuchAlgorithmException unused) {
            n7.g("SecretUtil", "get userRootKey NoSuchAlgorithmException");
            return null;
        } catch (Throwable th2) {
            e0.i.p(th2, "get userRootKey ", "SecretUtil");
            return null;
        }
    }
}
