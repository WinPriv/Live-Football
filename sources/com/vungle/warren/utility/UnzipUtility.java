package com.vungle.warren.utility;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "com.vungle.warren.utility.UnzipUtility";

    /* loaded from: classes2.dex */
    public interface Filter {
        boolean matches(String str);
    }

    /* loaded from: classes2.dex */
    public static class ZipSecurityException extends IOException {
        public ZipSecurityException(String str) {
            super(str);
        }
    }

    public static void extractFile(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        FileUtility.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[BUFFER_SIZE];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            FileUtility.closeQuietly(inputStream);
                            FileUtility.closeQuietly(bufferedOutputStream2);
                            FileUtility.closeQuietly(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    FileUtility.closeQuietly(inputStream);
                    FileUtility.closeQuietly(bufferedOutputStream);
                    FileUtility.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static List<File> unzip(String str, String str2) throws IOException {
        return unzip(str, str2, null);
    }

    private static String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath;
        }
        Log.e(TAG, "File is outside extraction target directory.");
        throw new ZipSecurityException("File is outside extraction target directory.");
    }

    public static List<File> unzip(String str, String str2, Filter filter) throws IOException {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                ArrayList arrayList = new ArrayList();
                ZipFile zipFile = null;
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            String str3 = str2 + File.separator + nextElement.getName();
                            if (filter == null || filter.matches(str3)) {
                                validateFilename(str3, str2);
                                if (nextElement.isDirectory()) {
                                    File file3 = new File(str3);
                                    if (!file3.exists()) {
                                        file3.mkdir();
                                    }
                                } else {
                                    extractFile(zipFile2.getInputStream(nextElement), str3);
                                    arrayList.add(new File(str3));
                                }
                            }
                        }
                        try {
                            zipFile2.close();
                        } catch (IOException unused) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IOException("File does not exist");
            }
        } else {
            throw new IOException("Path is empty");
        }
    }
}
