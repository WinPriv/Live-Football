package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.os.IBinder;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.security.MessageDigest;
import ka.n7;
import ka.nj;

/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static String f22924a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f22925b = "";

    public static String a(Context context, IBinder iBinder) {
        String packageName = context.getPackageName();
        if (f22924a == null) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : digest) {
                    sb2.append(Integer.toHexString((b10 & DefaultClassResolver.NAME) | 256).substring(1, 3));
                }
                String sb3 = sb2.toString();
                f22924a = sb3;
                return b(iBinder, packageName, sb3);
            } catch (Throwable unused) {
                n7.g("OIdentifierManager", "realGetOUID ex.");
            }
        }
        return b(iBinder, packageName, f22924a);
    }

    public static String b(IBinder iBinder, String str, String str2) {
        try {
            nj njVar = (nj) nj.a.class.getDeclaredMethod(com.anythink.expressad.d.a.b.dH, IBinder.class).invoke(null, iBinder);
            if (njVar == null) {
                n7.g("OIdentifierManager", "IOpenID is null");
            }
            return njVar.a(str, str2, "OUID");
        } catch (Throwable th) {
            n7.h("OIdentifierManager", "getSerId error: %s", th.getClass().getSimpleName());
            return null;
        }
    }
}
