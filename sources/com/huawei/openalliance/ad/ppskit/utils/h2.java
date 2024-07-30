package com.huawei.openalliance.ad.ppskit.utils;

import java.io.File;
import ka.n7;

/* loaded from: classes2.dex */
public final class h2 {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x002a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r5) {
        /*
            java.lang.String r0 = "close zipFile IOException "
            java.lang.String r1 = "ZipUtil"
            java.lang.String r2 = "UTF-8"
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            java.util.Enumeration r5 = r4.entries()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
        L10:
            boolean r3 = r5.hasMoreElements()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            if (r3 == 0) goto L21
            r5.nextElement()     // Catch: java.lang.Exception -> L1a java.lang.Throwable -> L2e
            goto L10
        L1a:
            java.lang.String r5 = "zipFile format exception"
            ka.n7.g(r1, r5)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            if (r5 == 0) goto L26
            java.lang.String r2 = "GBK"
        L26:
            r4.close()     // Catch: java.io.IOException -> L2a
            goto L3f
        L2a:
            ka.n7.i(r1, r0)
            goto L3f
        L2e:
            r5 = move-exception
            r3 = r4
            goto L40
        L31:
            r3 = r4
            goto L35
        L33:
            r5 = move-exception
            goto L40
        L35:
            java.lang.String r5 = "zipFile create exception"
            ka.n7.g(r1, r5)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.io.IOException -> L2a
        L3f:
            return r2
        L40:
            if (r3 == 0) goto L49
            r3.close()     // Catch: java.io.IOException -> L46
            goto L49
        L46:
            ka.n7.i(r1, r0)
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.h2.a(java.lang.String):java.lang.String");
    }

    public static void b(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            d(file);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    b(file2);
                }
                d(file);
                return;
            }
            d(file);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.zip.ZipFile] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.utils.h2.c(java.lang.String, java.lang.String):boolean");
    }

    public static void d(File file) {
        if (file != null && !file.delete()) {
            n7.i("ZipUtil", "delete file error");
        }
    }

    public static boolean e(String str) {
        if (!str.contains("../") && !str.contains("..\\") && !str.contains("..") && !str.contains("./") && !str.contains(".\\.\\") && !str.contains("%00")) {
            return false;
        }
        return true;
    }
}
