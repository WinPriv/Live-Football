package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    static boolean f10188a = false;

    /* renamed from: b, reason: collision with root package name */
    static String f10189b = "";

    /* renamed from: c, reason: collision with root package name */
    public static char[] f10190c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: d, reason: collision with root package name */
    private static final String f10191d = "common-exception";

    /* renamed from: e, reason: collision with root package name */
    private static final String f10192e = "SameSDCardTool";
    private static boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    private static int f10193g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static int f10194h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static int f10195i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static int f10196j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static String f10197k;

    public static void a(Context context) {
        if (f) {
            return;
        }
        try {
            try {
                f10189b = context.getFilesDir().getAbsolutePath() + File.separator;
                if (context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0) {
                    f10188a = true;
                } else {
                    f10188a = false;
                }
                b(context);
            } catch (Exception unused) {
                f10189b = context.getFilesDir().getAbsolutePath() + File.separator;
                b(context);
            }
        } catch (Exception unused2) {
        }
        f = true;
    }

    private static void b(Context context) {
        String c10 = c(context);
        f10197k = c10;
        com.anythink.expressad.foundation.g.c.d.a(new com.anythink.expressad.foundation.g.c.b(c10));
        com.anythink.expressad.foundation.g.c.d.a().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if ((e() > 31457280) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String c(android.content.Context r6) {
        /*
            r0 = 0
            java.io.File r1 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L14
            java.io.File r1 = a(r1)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r1 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.anythink.expressad.foundation.h.o.b(r2, r3, r1)
        L14:
            r1 = r0
        L15:
            boolean r2 = com.anythink.expressad.foundation.h.r.f10188a
            if (r2 == 0) goto L5c
            if (r1 != 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.String r3 = "Android"
            java.lang.String r4 = "data"
            e0.i.o(r1, r2, r3, r2, r4)
            r1.append(r2)
            java.lang.String r2 = r6.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = a(r2)
        L4b:
            long r2 = e()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L58
            r2 = 1
            goto L59
        L58:
            r2 = 0
        L59:
            if (r2 != 0) goto L5c
            goto L5d
        L5c:
            r0 = r1
        L5d:
            if (r0 == 0) goto L65
            boolean r1 = r0.exists()
            if (r1 != 0) goto L6d
        L65:
            java.io.File r6 = r6.getFilesDir()
            java.io.File r0 = r6.getAbsoluteFile()
        L6d:
            java.lang.String r6 = r0.getAbsolutePath()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.r.c(android.content.Context):java.lang.String");
    }

    private static int d() {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            long longValue = ((Long) v.b(d10, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f10194h == -1) {
                f10194h = Long.valueOf((e() / 1000) / 1000).intValue();
                v.a(d10, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            o.b(f10192e, th.getMessage(), th);
        }
        return f10194h;
    }

    private static long e() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    private static boolean f() {
        if (e() > 31457280) {
            return true;
        }
        return false;
    }

    private static int g() {
        if (f10193g == -1) {
            try {
                f10193g = new Long((h() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                o.b(f10192e, th.getMessage(), th);
            }
        }
        return f10193g;
    }

    private static long h() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0L;
    }

    private static int i() {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            long longValue = ((Long) v.b(d10, "TotalDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f10195i == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f10195i = Long.valueOf(((statFs.getBlockCount() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                v.a(d10, "TotalDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            o.b(f10192e, th.getMessage(), th);
        }
        return f10195i;
    }

    private static int j() {
        try {
            Context d10 = com.anythink.expressad.foundation.b.a.b().d();
            long longValue = ((Long) v.b(d10, "FreeDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || f10196j == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f10196j = Long.valueOf(((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                v.a(d10, "FreeDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            o.b(f10192e, th.getMessage(), th);
        }
        return f10196j;
    }

    private static long k() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    private static long l() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    public static boolean b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            o.d("", "hasSDCard is failed");
            return false;
        }
    }

    private static long d(Context context) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            new StatFs(absolutePath).restat(absolutePath);
            return r0.getAvailableBlocks() * r0.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String a() {
        return f10197k;
    }

    private static File a(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(UUID.randomUUID());
        File file2 = new File(file, sb2.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    private static boolean c() {
        return f10188a;
    }

    public static boolean a(long j10) {
        return e() > j10;
    }
}
