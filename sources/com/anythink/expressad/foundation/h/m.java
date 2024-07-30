package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10156a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10157b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10158c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10159d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final String f10160e = "/download/.at";
    public static final String f = "/atdownload";

    /* renamed from: g, reason: collision with root package name */
    private static final String f10161g = "SameFileTool";

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10162a = 448;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10163b = 256;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10164c = 128;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10165d = 64;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10166e = 56;
        public static final int f = 32;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10167g = 16;

        /* renamed from: h, reason: collision with root package name */
        public static final int f10168h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final int f10169i = 7;

        /* renamed from: j, reason: collision with root package name */
        public static final int f10170j = 4;

        /* renamed from: k, reason: collision with root package name */
        public static final int f10171k = 2;

        /* renamed from: l, reason: collision with root package name */
        public static final int f10172l = 1;
    }

    private static double a(long j10, int i10) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i10 == 1) {
            return Double.valueOf(decimalFormat.format(j10)).doubleValue();
        }
        if (i10 == 2) {
            return Double.valueOf(decimalFormat.format(j10 / 1024.0d)).doubleValue();
        }
        if (i10 == 3) {
            return Double.valueOf(decimalFormat.format(j10 / 1048576.0d)).doubleValue();
        }
        if (i10 != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j10 / 1.073741824E9d)).doubleValue();
    }

    private static double b(String str, int i10) {
        long j10;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j10 = d(file);
            } else {
                j10 = c(file);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            o.d("获取文件大小", "获取失败!");
            j10 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i10 == 1) {
            return Double.valueOf(decimalFormat.format(j10)).doubleValue();
        }
        if (i10 == 2) {
            return Double.valueOf(decimalFormat.format(j10 / 1024.0d)).doubleValue();
        }
        if (i10 == 3) {
            return Double.valueOf(decimalFormat.format(j10 / 1048576.0d)).doubleValue();
        }
        if (i10 != 4) {
            return 0.0d;
        }
        return Double.valueOf(decimalFormat.format(j10 / 1.073741824E9d)).doubleValue();
    }

    private static long c(File file) {
        long j10 = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            j10 = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e10) {
                            e = e10;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return j10;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        o.d("获取文件大小", "文件不存在!");
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return j10;
    }

    private static long d(File file) {
        long c10;
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (int i10 = 0; i10 < listFiles.length; i10++) {
                if (listFiles[i10].isDirectory()) {
                    c10 = d(listFiles[i10]);
                } else {
                    c10 = c(listFiles[i10]);
                }
                j10 += c10;
            }
        }
        return j10;
    }

    private static String e(String str) {
        long j10;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j10 = d(file);
            } else {
                j10 = c(file);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            o.d("获取文件大小", "获取失败!");
            j10 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j10 == 0) {
            return "0B";
        }
        if (j10 < 1024) {
            return decimalFormat.format(j10) + "B";
        }
        if (j10 < com.huawei.openalliance.ad.constant.w.f22146c) {
            return decimalFormat.format(j10 / 1024.0d) + "KB";
        }
        if (j10 < 1073741824) {
            return decimalFormat.format(j10 / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j10 / 1.073741824E9d) + "GB";
    }

    private static void f(String str) {
        try {
            ArrayList<File> e10 = e(new File(str));
            Collections.sort(e10, new Comparator<File>() { // from class: com.anythink.expressad.foundation.h.m.4
                private static int a(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    if (lastModified == 0) {
                        return 0;
                    }
                    return -1;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long lastModified = file.lastModified() - file2.lastModified();
                    if (lastModified > 0) {
                        return 1;
                    }
                    if (lastModified == 0) {
                        return 0;
                    }
                    return -1;
                }

                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }
            });
            int size = (e10.size() - 1) / 2;
            for (int i10 = 0; i10 < size; i10++) {
                File file = e10.get(i10);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            o.d(f10161g, "del memory failed");
        }
    }

    private static void g(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : b(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String d(String str) {
        return !TextUtils.isEmpty(str) ? p.a(x.a(str.trim())) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0048: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:28:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r4) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L47
        L10:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            if (r2 == 0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            r3.append(r2)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            r4.append(r2)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L47
            goto L10
        L2b:
            r1.close()     // Catch: java.io.IOException -> L3f
            goto L3f
        L2f:
            r2 = move-exception
            goto L39
        L31:
            r2 = move-exception
            r4 = r0
            goto L39
        L34:
            r4 = move-exception
            goto L49
        L36:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L39:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L3f
            goto L2b
        L3f:
            if (r4 == 0) goto L46
            java.lang.String r4 = r4.toString()
            return r4
        L46:
            return r0
        L47:
            r4 = move-exception
            r0 = r1
        L49:
            if (r0 == 0) goto L4e
            r0.close()     // Catch: java.io.IOException -> L4e
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.m.a(java.io.File):java.lang.String");
    }

    private static boolean d(String str, int i10) {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("setPermissions", String.class, cls2, cls2, cls2).invoke(null, str, Integer.valueOf(i10), -1, -1);
            return true;
        } catch (ClassNotFoundException e10) {
            o.a(f10161g, "error when set permissions:", e10);
            return false;
        } catch (IllegalAccessException e11) {
            o.a(f10161g, "error when set permissions:", e11);
            return false;
        } catch (IllegalArgumentException e12) {
            o.a(f10161g, "error when set permissions:", e12);
            return false;
        } catch (NoSuchMethodException e13) {
            o.a(f10161g, "error when set permissions:", e13);
            return false;
        } catch (InvocationTargetException e14) {
            o.a(f10161g, "error when set permissions:", e14);
            return false;
        }
    }

    public static void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - 1440000;
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                            b(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    b(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static ArrayList<File> e(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.anythink.expressad.foundation.h.m.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                if (!file3.isHidden() || file3.isDirectory()) {
                    return true;
                }
                return false;
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(e(file2));
            }
        }
        return arrayList;
    }

    private static String b(long j10) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j10 == 0) {
            return "0B";
        }
        if (j10 < 1024) {
            return decimalFormat.format(j10) + "B";
        }
        if (j10 < com.huawei.openalliance.ad.constant.w.f22146c) {
            return decimalFormat.format(j10 / 1024.0d) + "KB";
        }
        if (j10 < 1073741824) {
            return decimalFormat.format(j10 / 1048576.0d) + "AT";
        }
        return decimalFormat.format(j10 / 1.073741824E9d) + "GB";
    }

    public static boolean a(String str) {
        if (com.anythink.expressad.foundation.g.d.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a() {
        new Thread(new Runnable() { // from class: com.anythink.expressad.foundation.h.m.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.anythink.expressad.foundation.b.a.b().d() != null) {
                        String b10 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC);
                        try {
                            File file = new File(b10);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : m.b(b10)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                } catch (Exception e11) {
                    if (com.anythink.expressad.a.f6552a) {
                        e11.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void a(long j10) {
        try {
            Iterator<File> it = e(new File(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j10 && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            o.b(f10161g, th.getMessage(), th);
        }
    }

    public static void b() {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.expressad.foundation.h.m.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.foundation.b.a.b().e();
                    com.anythink.expressad.d.a b10 = com.anythink.expressad.d.b.b();
                    if (b10 == null) {
                        com.anythink.expressad.d.b.a();
                        b10 = com.anythink.expressad.d.b.c();
                    }
                    m.a(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR), b10.b());
                    m.a(System.currentTimeMillis() - (b10.n() * 1000));
                } catch (Exception e10) {
                    if (com.anythink.expressad.a.f6552a) {
                        e10.printStackTrace();
                    }
                }
            }
        });
    }

    public static String b(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (!file.isDirectory()) {
                return "";
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    b(file2);
                }
                file.delete();
                return "";
            }
            file.delete();
            return "";
        } catch (Exception e10) {
            return e10.getMessage();
        }
    }

    private static void c(String str, int i10) {
        try {
            if (d(new File(str)) > i10 * com.anythink.expressad.exoplayer.h.o.f8460d) {
                f(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
            o.d(f10161g, "clean memory failed");
        }
    }

    private static boolean a(String str, String str2, String str3) {
        try {
            if (r.b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(str3);
                String sb3 = sb2.toString();
                File file = new File(sb3);
                if (file.exists() && file.isFile() && r.a(file.length())) {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    int b10 = b(sb3, str2 + str4 + str3);
                    if (file.exists() && b10 == 0) {
                        file.delete();
                        return true;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    private static boolean c(String str, String str2) {
        File[] listFiles;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0 && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                if (str2.equals(file2.getName())) {
                                    return true;
                                }
                            } else {
                                c(file2.getAbsolutePath(), str2);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private static int b(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (!r.f10188a) {
                return -1;
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    File file = new File(str2);
                    if (file.exists()) {
                        if (file.isFile()) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                            return 0;
                        }
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    return -1;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e17) {
                            e17.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e11) {
                e11.printStackTrace();
                return true;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
                return false;
            }
            try {
                fileOutputStream2.close();
                return false;
            } catch (IOException e13) {
                e13.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00de, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e2, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e3, code lost:
    
        r9.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00f8, code lost:
    
        throw new java.lang.Exception("zipEntry's name is unsafe!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00dc, code lost:
    
        if (r9 == null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.m.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ void a(String str, int i10) {
        try {
            if (d(new File(str)) > i10 * com.anythink.expressad.exoplayer.h.o.f8460d) {
                f(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
            o.d(f10161g, "clean memory failed");
        }
    }
}
