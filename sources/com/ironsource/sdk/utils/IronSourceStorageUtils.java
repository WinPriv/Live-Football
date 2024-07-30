package com.ironsource.sdk.utils;

import a3.k;
import a3.l;
import android.content.Context;
import android.os.Build;
import com.ironsource.environment.h;
import com.ironsource.sdk.h.e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceStorageUtils {

    /* renamed from: a, reason: collision with root package name */
    public static e f26552a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f26553b = false;

    public static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    public static File b(File file) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        return new File(k.m(sb2, str, "supersonicads", str));
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return l.p(com.ironsource.adapters.facebook.a.j(str), File.separator, str2);
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object c10;
        String name;
        Object c11;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    c10 = c(file2);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                if (c10 instanceof JSONArray) {
                    name = "files";
                    c11 = c(file2);
                } else if (c10 instanceof JSONObject) {
                    name = file2.getName();
                    c11 = c(file2);
                }
                jSONObject.put(name, c11);
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(com.ironsource.sdk.h.c cVar, JSONObject jSONObject) {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (cVar != null && cVar.isDirectory()) {
            File[] listFiles = cVar.listFiles();
            if (listFiles == null) {
                return new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            for (File file : listFiles) {
                com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                if (cVar2.isFile()) {
                    name = cVar2.getName();
                    buildFilesMapOfDirectory = cVar2.a();
                    if (jSONObject.has(name)) {
                        buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(buildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                    }
                } else if (cVar2.isDirectory()) {
                    name = cVar2.getName();
                    buildFilesMapOfDirectory = buildFilesMapOfDirectory(cVar2, jSONObject);
                }
                jSONObject2.put(name, buildFilesMapOfDirectory);
            }
            return jSONObject2;
        }
        return new JSONObject();
    }

    public static Object c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    public static void deleteCacheDirectories(Context context) {
        a(h.r(context));
        a(h.t(context));
    }

    public static synchronized boolean deleteFile(com.ironsource.sdk.h.c cVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (cVar.exists()) {
                return cVar.delete();
            }
            return false;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        a(h.s(context));
        a(h.u(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                if (file.delete()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z10 &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public static void ensurePathSafety(File file, String str) {
        e eVar = f26552a;
        if (eVar != null && eVar.f26526a.optBoolean("trvch", false)) {
            return;
        }
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        if (canonicalPath2.startsWith(canonicalPath)) {
        } else {
            throw new Exception("illegal path access".concat(canonicalPath2));
        }
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File u2;
        File s10;
        e eVar = f26552a;
        boolean z10 = false;
        if ((eVar != null && eVar.f26526a.optBoolean("uxt", false)) || Build.VERSION.SDK_INT > 28) {
            z10 = true;
        }
        if (z10 && SDKUtils.isExternalStorageAvailable()) {
            e eVar2 = f26552a;
            if (eVar2 != null && eVar2.a()) {
                s10 = h.r(context);
            } else {
                s10 = h.s(context);
            }
            if (s10 != null && s10.canWrite()) {
                f26553b = true;
                return s10.getPath();
            }
        }
        e eVar3 = f26552a;
        if (eVar3 != null && eVar3.a()) {
            u2 = h.t(context);
        } else {
            u2 = h.u(context);
        }
        return u2.getPath();
    }

    public static ArrayList<com.ironsource.sdk.h.c> getFilesInFolderRecursive(com.ironsource.sdk.h.c cVar) {
        if (cVar != null && cVar.isDirectory()) {
            ArrayList<com.ironsource.sdk.h.c> arrayList = new ArrayList<>();
            File[] listFiles = cVar.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                    if (cVar2.isDirectory()) {
                        arrayList.addAll(getFilesInFolderRecursive(cVar2));
                    }
                    if (cVar2.isFile()) {
                        arrayList.add(cVar2);
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList<>();
    }

    public static String getNetworkStorageDir(Context context) {
        File b10 = b(new File(getDiskCacheDirPath(context)));
        if (!b10.exists()) {
            b10.mkdir();
        }
        return b10.getPath();
    }

    public static long getTotalSizeOfDir(com.ironsource.sdk.h.c cVar) {
        long totalSizeOfDir;
        long j10 = 0;
        if (cVar != null && cVar.isDirectory()) {
            File[] listFiles = cVar.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                if (cVar2.isFile()) {
                    totalSizeOfDir = cVar2.length();
                } else if (cVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(cVar2);
                }
                j10 = totalSizeOfDir + j10;
            }
        }
        return j10;
    }

    public static void initializeCacheDirectory(Context context, e eVar) {
        f26552a = eVar;
        if (eVar != null && eVar.f26526a.optBoolean("deleteCacheDir", false)) {
            deleteCacheDirectories(context);
        }
        e eVar2 = f26552a;
        if (eVar2 != null && eVar2.f26526a.optBoolean("deleteFilesDir", false)) {
            deleteFilesDirectories(context);
        }
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return f26553b;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file.getPath();
    }

    public static String readFile(com.ironsource.sdk.h.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append('\n');
            } else {
                bufferedReader.close();
                return sb2.toString();
            }
        }
    }

    public static boolean renameFile(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i10 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read != -1) {
                    fileOutputStream.write(bArr2, 0, read);
                    i10 += read;
                } else {
                    return i10;
                }
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
