package com.huawei.openalliance.ad.ppskit.utils;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import com.vungle.warren.model.Advertisement;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import ka.d5;
import ka.f5;
import ka.n7;
import ka.t5;
import ka.y4;

/* loaded from: classes2.dex */
public final class x {
    public static boolean A(String str) {
        if (str == null) {
            return false;
        }
        if (!str.contains("../") && !str.contains("..\\") && !str.contains("..") && !str.contains("./") && !str.contains(".\\.\\") && !str.contains("%00")) {
            return false;
        }
        return true;
    }

    public static File a(Context context, InputStream inputStream, String str, String str2) {
        Object th;
        FileOutputStream fileOutputStream = null;
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(w1.c(context.createDeviceProtectedStorageContext()));
            String str3 = File.separator;
            String q10 = a3.l.q(j10, str3, "pps", str3, str2);
            n7.c("FileUtil", "root=%s", q10);
            File file = new File(q10);
            if (!file.exists() && !v(file)) {
                n7.g("FileUtil", "mkdir error");
                return null;
            }
            File file2 = new File(q10, str);
            if (file2.exists()) {
                n(file2);
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            n7.g("FileUtil", "write file:" + th.getClass().getSimpleName());
                            return file2;
                        } finally {
                            androidx.transition.n.D(fileOutputStream);
                        }
                    }
                }
                fileOutputStream2.flush();
                androidx.transition.n.D(fileOutputStream2);
            } catch (Throwable th3) {
                th = th3;
            }
            return file2;
        }
        n7.e("FileUtil", "inputStream is null");
        return null;
    }

    public static String b(long j10) {
        float f = (((float) j10) * 1.0f) / 1048576.0f;
        if (f < 0.1f) {
            f = 0.1f;
        }
        return String.format(Locale.getDefault(), "%.1f", Float.valueOf(f));
    }

    public static String c(Context context, Uri uri, String str, String str2) {
        String str3;
        InputStream inputStream = null;
        String str4 = null;
        inputStream = null;
        if (context == null || uri == null || uri.getAuthority() == null) {
            return null;
        }
        try {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    try {
                        File a10 = a(context, openInputStream, str, str2);
                        if (a10 != null) {
                            str3 = a10.getPath();
                            try {
                                n7.e("FileUtil", "target file path:" + str3);
                                str4 = str3;
                            } catch (FileNotFoundException unused) {
                                inputStream = openInputStream;
                                n7.g("FileUtil", "copy file error");
                                androidx.transition.n.D(inputStream);
                                return str3;
                            }
                        }
                        androidx.transition.n.D(openInputStream);
                        return str4;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = openInputStream;
                        androidx.transition.n.D(inputStream);
                        throw th;
                    }
                } catch (FileNotFoundException unused2) {
                    str3 = null;
                }
            } catch (FileNotFoundException unused3) {
                str3 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String d(Uri uri) {
        if (uri == null) {
            return "";
        }
        String uri2 = uri.toString();
        if (uri2.startsWith(Advertisement.FILE_SCHEME)) {
            return uri2.substring(7);
        }
        return uri2;
    }

    public static void e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f(context, str, "normal");
    }

    public static void f(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (d5.i(str)) {
            if (y1.h(str2)) {
                str2 = "normal";
            }
            y4.a(context, str2).o(context, str);
            return;
        }
        n(new File(str));
    }

    public static void g(String str) {
        File[] listFiles;
        if (y1.h(str)) {
            return;
        }
        File file = new File(str);
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (!file2.isDirectory()) {
                long lastModified = file2.lastModified() + 604800000;
                HashMap hashMap = d0.f22830a;
                if (lastModified < System.currentTimeMillis()) {
                    s(file2);
                }
            }
        }
    }

    public static boolean h(Context context, File file, String str, ContentResource contentResource, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (d5.i(str)) {
            if (y1.h(str2)) {
                str2 = "normal";
            }
            d5 a10 = y4.a(context, str2);
            f5 b10 = a10.b(context, true);
            if (b10 == null) {
                str3 = "fileDiskCache is null";
            } else {
                if (contentResource != null) {
                    contentResource.M(a10.f31091e);
                }
                String k10 = d5.k(str);
                if (k10 != null && file.exists()) {
                    try {
                        b10.b(k10, file, contentResource);
                        return true;
                    } catch (Exception e10) {
                        str3 = "putOuterFileToCache ".concat(e10.getClass().getSimpleName());
                    }
                } else {
                    str3 = "param error";
                }
            }
            n7.g(a10.f31090d, str3);
            return false;
        }
        File file2 = new File(str);
        n(file2);
        return file.renameTo(file2);
    }

    public static boolean i(File file) {
        if (file.exists() && file.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0049: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:74), block:B:31:0x0049 */
    public static boolean j(String str, File file) {
        Closeable closeable;
        FileInputStream fileInputStream;
        if (y1.h(str)) {
            return false;
        }
        String str2 = null;
        str2 = null;
        str2 = null;
        Closeable closeable2 = null;
        try {
            if (i(file)) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = false;
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                            z10 = true;
                        }
                        if (z10) {
                            str2 = androidx.transition.n.w(messageDigest.digest());
                        }
                    } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
                        n7.g("Sha256Util", "fail to get file sha256");
                        androidx.transition.n.D(fileInputStream);
                        return str.equalsIgnoreCase(str2);
                    }
                } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused2) {
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    androidx.transition.n.D(closeable2);
                    throw th;
                }
                androidx.transition.n.D(fileInputStream);
            }
            return str.equalsIgnoreCase(str2);
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    public static boolean k(String str, String str2) {
        String str3;
        try {
            return h2.c(str, str2);
        } catch (t5 unused) {
            str3 = "unzip SecurityCommonException:".concat(t5.class.getSimpleName());
            n7.e("FileUtil", str3);
            return false;
        } catch (Exception unused2) {
            str3 = "unzip file error";
            n7.e("FileUtil", str3);
            return false;
        }
    }

    public static File l(Context context, String str, String str2) {
        if (d5.i(str)) {
            if (y1.h(str2)) {
                str2 = "normal";
            }
            str = y4.a(context, str2).h(context, str);
        }
        if (!TextUtils.isEmpty(str)) {
            return new File(str);
        }
        return null;
    }

    public static String m(long j10) {
        try {
            if (j10 < 1024) {
                return j10 + "B";
            }
            long ceil = (long) Math.ceil((j10 * 1.0d) / 1024.0d);
            if (ceil < 1024) {
                return ceil + "K";
            }
            long ceil2 = (long) Math.ceil((ceil * 1.0d) / 1024.0d);
            if (ceil2 < 1024) {
                return ceil2 + "M";
            }
            long ceil3 = (long) Math.ceil((ceil2 * 1.0d) / 1024.0d);
            if (ceil3 < 1024) {
                return ceil3 + "G";
            }
            return ((long) Math.ceil((ceil3 * 1.0d) / 1024.0d)) + "T";
        } catch (Throwable th) {
            e0.i.p(th, "getFileSize ", "FileUtil");
            return "";
        }
    }

    public static void n(File file) {
        String str;
        if (file.exists()) {
            if (file.isFile()) {
                File file2 = new File(w(file) + "_delete");
                if (file.renameTo(file2)) {
                    if (file2.delete()) {
                        return;
                    }
                } else if (file.delete()) {
                    return;
                }
                str = "fail to delete file";
            } else if (!file.delete()) {
                str = "cannot delete file";
            } else {
                return;
            }
            n7.g("FileUtil", str);
        }
    }

    public static boolean o(Context context, String str) {
        if (d5.i(str)) {
            return y4.a(context, "normal").l(context, str);
        }
        return q(str);
    }

    public static void p(File file) {
        RandomAccessFile randomAccessFile;
        String str;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            long length = randomAccessFile.length();
            randomAccessFile.setLength(1 + length);
            randomAccessFile.setLength(length);
            androidx.transition.n.D(randomAccessFile);
        } catch (FileNotFoundException unused3) {
            randomAccessFile2 = randomAccessFile;
            str = "fail to update modify time, file not exist";
            n7.i("FileUtil", str);
            androidx.transition.n.D(randomAccessFile2);
        } catch (IOException unused4) {
            randomAccessFile2 = randomAccessFile;
            str = "fail to update modify time, read file exception";
            n7.i("FileUtil", str);
            androidx.transition.n.D(randomAccessFile2);
        } catch (Throwable th2) {
            th = th2;
            androidx.transition.n.D(randomAccessFile);
            throw th;
        }
    }

    public static boolean q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return new File(str).exists();
        } catch (Exception unused) {
            n7.i("FileUtil", "check file exists error");
            return false;
        }
    }

    public static boolean r(Context context, String str, String str2) {
        if (d5.i(str)) {
            if (y1.h(str2)) {
                str2 = "normal";
            }
            String h10 = y4.a(context, str2).h(context, str);
            if (!TextUtils.isEmpty(h10) && i(new File(h10))) {
                return true;
            }
            return false;
        }
        return i(new File(str));
    }

    public static boolean s(File file) {
        try {
            File file2 = new File(file.getCanonicalPath() + System.currentTimeMillis());
            if (file.renameTo(file2)) {
                return file2.delete();
            }
            return false;
        } catch (IOException unused) {
            n7.g("FileUtil", "deleteSingleFile IOException");
            return false;
        }
    }

    public static Long t(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (IllegalArgumentException e10) {
            e0.i.p(e10, "getDiskFreeSpace ", "FileUtil");
            return null;
        }
    }

    public static Long u(String str) {
        try {
            return Long.valueOf(new StatFs(str).getTotalBytes());
        } catch (IllegalArgumentException e10) {
            e0.i.p(e10, "getDiskTotalSpace ", "FileUtil");
            return null;
        }
    }

    public static boolean v(File file) {
        boolean z10;
        if (file == null || file.mkdirs()) {
            return true;
        }
        File file2 = file;
        int i10 = 0;
        while (true) {
            if (i10 >= 10 || file2 == null) {
                break;
            }
            String w10 = w(file2);
            ArrayList arrayList = x1.f23060a;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(w10)) {
                z10 = arrayList.contains(w10);
            } else {
                z10 = false;
            }
            if (!z10) {
                i10++;
                if (file2.exists()) {
                    n7.b("FileUtil", "current file exists");
                    if (file2.isFile()) {
                        s(file2);
                    }
                } else {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && TextUtils.equals(w(parentFile), w(file2))) {
                        n7.g("FileUtil", "parent file is the same as current");
                        break;
                    }
                    file2 = parentFile;
                }
            } else {
                break;
            }
        }
        return file.mkdirs();
    }

    public static String w(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            n7.i("FileUtil", "get path error");
            return null;
        }
    }

    public static String x(String str) {
        if (str == null) {
            return null;
        }
        String Q = androidx.transition.n.Q(str);
        if (TextUtils.isEmpty(Q)) {
            return String.valueOf(str.hashCode());
        }
        return Q;
    }

    public static void y(File file) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        y(file2);
                    } else {
                        s(file2);
                    }
                }
            }
            s(file);
        }
    }

    public static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.substring(str.lastIndexOf(".")).trim();
    }
}
