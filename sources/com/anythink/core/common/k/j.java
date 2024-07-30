package com.anythink.core.common.k;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public final class j {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if ((b() <= 31457280) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(android.content.Context r6) {
        /*
            r0 = 0
            java.io.File r1 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Le
            java.io.File r1 = a(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lf
            return r1
        Le:
            r1 = r0
        Lf:
            if (r1 != 0) goto L51
            boolean r2 = b(r6)
            if (r2 == 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = r6.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = a(r2)
            long r2 = b()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 != 0) goto L51
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 != 0) goto L65
            java.io.File r6 = r6.getFilesDir()
            java.io.File r6 = r6.getAbsoluteFile()
            java.lang.String r6 = r6.getAbsolutePath()
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.k.j.a(android.content.Context):java.io.File");
    }

    private static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static boolean c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static long b() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Error unused) {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0L;
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

    private static boolean a() {
        return b() > 31457280;
    }

    private static String a(String str) {
        return f.a(str);
    }
}
