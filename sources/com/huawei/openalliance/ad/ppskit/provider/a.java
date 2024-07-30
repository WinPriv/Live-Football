package com.huawei.openalliance.ad.ppskit.provider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ka.d5;
import ka.n7;
import ka.y4;
import s.f;

/* loaded from: classes2.dex */
public interface a {

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap<String, a> f22796a = new HashMap<>();

        public static String a(Context context, String str) {
            return b(context, str, "normal");
        }

        public static String b(Context context, String str, String str2) {
            String str3;
            Uri build;
            boolean z10 = false;
            if (!TextUtils.isEmpty(str) && (str.startsWith(Advertisement.FILE_SCHEME) || str.startsWith("diskcache://") || str.startsWith(File.separator))) {
                z10 = true;
            }
            if (!z10) {
                return str;
            }
            if (str.startsWith(Advertisement.FILE_SCHEME)) {
                str3 = str.substring(7);
            } else if (d5.i(str)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "normal";
                }
                str3 = y4.a(context, str2).h(context, str);
            } else {
                str3 = str;
            }
            String b10 = InnerApiProvider.b(context);
            File file = new File(str3);
            a c10 = c(context, b10);
            if (c10 != null) {
                build = c10.a(file);
            } else {
                build = new Uri.Builder().build();
            }
            if (build != null) {
                return build.toString();
            }
            return str;
        }

        public static a c(Context context, String str) {
            a aVar;
            HashMap<String, a> hashMap = f22796a;
            synchronized (hashMap) {
                aVar = hashMap.get(str);
                if (aVar == null) {
                    try {
                        aVar = d(context, str);
                    } catch (IllegalArgumentException unused) {
                        n7.g("PathStrategy.Util", "getPathStrategy IllegalArgumentException");
                    } catch (Throwable th) {
                        n7.g("PathStrategy.Util", "getPathStrategy ".concat(th.getClass().getSimpleName()));
                    }
                    f22796a.put(str, aVar);
                }
            }
            return aVar;
        }

        public static C0292a d(Context context, String str) {
            File file;
            C0292a c0292a = new C0292a(str);
            Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            String[] strArr = {"cache-path", "external-cache-path", "ce-cache-path"};
            String[] strArr2 = {"file_cache_download", "file_download", "file_ce_cache_download"};
            for (int i10 = 0; i10 < 3; i10++) {
                String str2 = strArr[i10];
                String str3 = strArr2[i10];
                if ("cache-path".equals(str2)) {
                    file = createDeviceProtectedStorageContext.getCacheDir();
                } else if ("external-cache-path".equals(str2)) {
                    file = createDeviceProtectedStorageContext.getExternalCacheDir();
                } else if ("ce-cache-path".equals(str2)) {
                    file = context.getCacheDir();
                } else {
                    file = null;
                }
                if (file != null) {
                    String str4 = new String[]{"pps"}[0];
                    if (str4 != null) {
                        file = new File(file, str4);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            c0292a.f22795b.put(str3, file.getCanonicalFile());
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                        }
                    } else {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                }
            }
            return c0292a;
        }
    }

    Uri a(File file);

    File a(Uri uri);

    /* renamed from: com.huawei.openalliance.ad.ppskit.provider.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0292a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f22794a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap<String, File> f22795b = new HashMap<>();

        public C0292a(String str) {
            this.f22794a = str;
        }

        @Override // com.huawei.openalliance.ad.ppskit.provider.a
        public final Uri a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f22795b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(f.b("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f22794a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // com.huawei.openalliance.ad.ppskit.provider.a
        public final File a(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Empty uri");
            }
            String encodedPath = uri.getEncodedPath();
            if (encodedPath == null) {
                throw new IllegalArgumentException("Failed to getEncodedPath ");
            }
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f22795b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root");
            }
            try {
                File canonicalFile = new File(file, decode2).getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path");
            }
        }
    }
}
