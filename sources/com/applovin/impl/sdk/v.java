package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    private final p f19552b;

    /* renamed from: c, reason: collision with root package name */
    private final y f19553c;

    /* renamed from: a, reason: collision with root package name */
    private final String f19551a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f19554d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set<String> f19555e = new HashSet();

    public v(p pVar) {
        this.f19552b = pVar;
        this.f19553c = pVar.L();
    }

    private long c(Context context) {
        boolean z10;
        long a10 = a();
        boolean z11 = a10 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List<String> b10 = this.f19552b.b(com.applovin.impl.sdk.c.b.bD);
        long j10 = 0;
        for (File file : d(context)) {
            if (!z11 || b10.contains(file.getName()) || e(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= a10) {
                z10 = false;
            } else {
                if (y.a()) {
                    this.f19553c.b("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z10 = b(file);
            }
            if (z10) {
                this.f19552b.P().a(com.applovin.impl.sdk.d.f.f18812g);
            } else {
                j10 = file.length() + j10;
            }
        }
        return j10;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f19554d) {
            this.f19555e.remove(absolutePath);
            this.f19554d.notifyAll();
        }
    }

    private boolean e(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f19554d) {
            contains = this.f19555e.contains(absolutePath);
        }
        return contains;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public boolean b(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (y.a()) {
            this.f19553c.b("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file)) {
            if (y.a()) {
                this.f19553c.e("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!y.a()) {
            return true;
        }
        this.f19553c.b("FileManager", "Caching completed for " + file);
        return true;
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (y.a()) {
                this.f19553c.b("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (y.a()) {
            a3.k.t("Looking up cached resource: ", str, this.f19553c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File e10 = e(context);
        File file = new File(e10, str);
        if (z10) {
            try {
                e10.mkdirs();
            } catch (Throwable th) {
                if (y.a()) {
                    this.f19553c.b("FileManager", "Unable to make cache directory at " + e10, th);
                }
                return null;
            }
        }
        return file;
    }

    private boolean b(File file) {
        if (y.a()) {
            this.f19553c.b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            try {
                c(file);
                return file.delete();
            } catch (Exception e10) {
                if (y.a()) {
                    this.f19553c.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e10);
                }
                d(file);
                return false;
            }
        } finally {
            d(file);
        }
    }

    private File e(Context context) {
        return new File(context.getFilesDir(), com.anythink.expressad.foundation.d.c.bl);
    }

    private List<File> d(Context context) {
        File[] listFiles;
        File e10 = e(context);
        if (e10.isDirectory() && (listFiles = e10.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f19554d) {
            boolean add = this.f19555e.add(absolutePath);
            while (!add) {
                try {
                    this.f19554d.wait();
                    add = this.f19555e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (y.a()) {
                        this.f19553c.b("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    private boolean b() {
        return ((Boolean) this.f19552b.a(com.applovin.impl.sdk.c.b.bw)).booleanValue();
    }

    public boolean b(String str, Context context) {
        File a10 = a(str, false, context);
        return (a10 == null || !a10.exists() || a10.isDirectory()) ? false : true;
    }

    public void b(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(e(context), ".nomedia");
            if (file.exists()) {
                return;
            }
            if (y.a()) {
                this.f19553c.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (!file.createNewFile() && y.a()) {
                this.f19553c.e("FileManager", "Failed to create .nomedia file");
            }
        } catch (IOException e10) {
            if (y.a()) {
                this.f19553c.b("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public java.lang.String a(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            boolean r1 = com.applovin.impl.sdk.y.a()
            java.lang.String r2 = "FileManager"
            if (r1 == 0) goto L23
            com.applovin.impl.sdk.y r1 = r8.f19553c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Reading resource from filesystem: "
            r3.<init>(r4)
            java.lang.String r4 = r9.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.b(r2, r3)
        L23:
            r8.c(r9)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L6a java.io.FileNotFoundException -> L90
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L6a java.io.FileNotFoundException -> L90
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L6a java.io.FileNotFoundException -> L90
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
        L34:
            r6 = 0
            int r7 = r1.read(r5, r6, r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            if (r7 < 0) goto L4d
            r3.write(r5, r6, r7)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L54
            goto L34
        L3f:
            com.applovin.impl.sdk.p r4 = r8.f19552b     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            com.applovin.impl.sdk.utils.Utils.close(r3, r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
        L44:
            com.applovin.impl.sdk.p r2 = r8.f19552b
            com.applovin.impl.sdk.utils.Utils.close(r1, r2)
            r8.d(r9)
            return r0
        L4d:
            java.lang.String r4 = "UTF-8"
            java.lang.String r0 = r3.toString(r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            goto L44
        L54:
            r3 = move-exception
            goto L5c
        L56:
            r3 = move-exception
            goto L6c
        L58:
            r3 = move-exception
            goto L92
        L5a:
            r3 = move-exception
            r1 = r0
        L5c:
            boolean r4 = com.applovin.impl.sdk.y.a()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L44
            com.applovin.impl.sdk.y r4 = r8.f19553c     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "Unknown failure to read file."
            r4.b(r2, r5, r3)     // Catch: java.lang.Throwable -> Laf
            goto L44
        L6a:
            r3 = move-exception
            r1 = r0
        L6c:
            boolean r4 = com.applovin.impl.sdk.y.a()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L44
            com.applovin.impl.sdk.y r4 = r8.f19553c     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r5.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "Failed to read file: "
            r5.append(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = r9.getName()     // Catch: java.lang.Throwable -> Laf
            r5.append(r6)     // Catch: java.lang.Throwable -> Laf
            r5.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Laf
            r4.b(r2, r3)     // Catch: java.lang.Throwable -> Laf
            goto L44
        L90:
            r3 = move-exception
            r1 = r0
        L92:
            boolean r4 = com.applovin.impl.sdk.y.a()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L44
            com.applovin.impl.sdk.y r4 = r8.f19553c     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r5.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "File not found. "
            r5.append(r6)     // Catch: java.lang.Throwable -> Laf
            r5.append(r3)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Laf
            r4.c(r2, r3)     // Catch: java.lang.Throwable -> Laf
            goto L44
        Laf:
            r0 = move-exception
            com.applovin.impl.sdk.p r2 = r8.f19552b
            com.applovin.impl.sdk.utils.Utils.close(r1, r2)
            r8.d(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.v.a(java.io.File):java.lang.String");
    }

    public boolean a(InputStream inputStream, File file) {
        if (y.a()) {
            this.f19553c.b("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        FileOutputStream fileOutputStream = null;
        try {
            c(file);
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        try {
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (Exception e10) {
                            if (y.a()) {
                                this.f19553c.b("FileManager", "Failed to write next buffer to file", e10);
                            }
                            Utils.close(fileOutputStream2, this.f19552b);
                            d(file);
                            return false;
                        }
                    } else {
                        Utils.close(fileOutputStream2, this.f19552b);
                        d(file);
                        return true;
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    if (y.a()) {
                        this.f19553c.b("FileManager", "Unknown failure to write file.", th);
                    }
                    Utils.close(fileOutputStream, this.f19552b);
                    d(file);
                    return false;
                } catch (Throwable th2) {
                    Utils.close(fileOutputStream, this.f19552b);
                    d(file);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.d.e eVar) {
        return a(file, str, list, true, eVar);
    }

    private boolean a(File file, String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        InputStream inputStream;
        if (file != null && file.exists() && !file.isDirectory()) {
            if (y.a()) {
                a3.k.t("File exists for ", str, this.f19553c, "FileManager");
            }
            if (eVar == null) {
                return true;
            }
            eVar.b(file.length());
            return true;
        }
        try {
            inputStream = a(str, list, z10, eVar);
            try {
                boolean b10 = b(inputStream, file);
                Utils.close(inputStream, this.f19552b);
                return b10;
            } catch (Throwable th) {
                th = th;
                Utils.close(inputStream, this.f19552b);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public InputStream a(String str, List<String> list, boolean z10, com.applovin.impl.sdk.d.e eVar) {
        if (z10 && !Utils.isDomainWhitelisted(str, list)) {
            if (y.a()) {
                a3.k.t("Domain is not whitelisted, skipping precache for url: ", str, this.f19553c, "FileManager");
            }
            return null;
        }
        if (((Boolean) this.f19552b.a(com.applovin.impl.sdk.c.b.dg)).booleanValue() && !str.contains("https://")) {
            if (y.a()) {
                this.f19553c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (y.a()) {
            this.f19553c.b("FileManager", "Loading " + str + "...");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(((Integer) this.f19552b.a(com.applovin.impl.sdk.c.b.f18721de)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f19552b.a(com.applovin.impl.sdk.c.b.df)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            eVar.a(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (y.a()) {
                    this.f19553c.b("FileManager", "Opened stream to resource " + str);
                }
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e10) {
            if (y.a()) {
                this.f19553c.b("FileManager", "Error loading " + str, e10);
            }
            eVar.a(e10);
            return null;
        }
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, boolean z11, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z10, z11, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z10, boolean z11, boolean z12, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            if (y.a()) {
                this.f19553c.b("FileManager", "Nothing to cache, skipping...");
            }
            return null;
        }
        String fileName = Utils.getFileName(Uri.parse(str));
        if (z11) {
            fileName = StringUtils.encodeUriString(fileName);
        }
        int intValue = ((Integer) this.f19552b.a(com.applovin.impl.sdk.c.b.bE)).intValue();
        int length = StringUtils.emptyIfNull(str2).length() + StringUtils.emptyIfNull(fileName).length();
        if (length > intValue && StringUtils.isValidString(fileName)) {
            fileName = fileName.substring(length - intValue);
        }
        if (StringUtils.isValidString(fileName) && StringUtils.isValidString(str2)) {
            fileName = com.ironsource.adapters.facebook.a.h(str2, fileName);
        }
        String str3 = fileName;
        File a10 = a(str3, context);
        if (!a(a10, str, list, z10, eVar)) {
            return null;
        }
        if (y.a()) {
            a3.k.t("Caching succeeded for file ", str3, this.f19553c, "FileManager");
        }
        return z12 ? Uri.fromFile(a10).toString() : str3;
    }

    public void a(Context context) {
        if (b() && this.f19552b.c()) {
            if (y.a()) {
                this.f19553c.b("FileManager", "Compacting cache...");
            }
            a(c(context), context);
        }
    }

    private void a(long j10, Context context) {
        if (b()) {
            long intValue = ((Integer) this.f19552b.a(com.applovin.impl.sdk.c.b.by)).intValue();
            if (intValue == -1) {
                if (y.a()) {
                    this.f19553c.b("FileManager", "Cache has no maximum size set; skipping drop...");
                }
            } else {
                if (a(j10) > intValue) {
                    if (y.a()) {
                        this.f19553c.b("FileManager", "Cache has exceeded maximum size; dropping...");
                    }
                    Iterator<File> it = d(context).iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                    this.f19552b.P().a(com.applovin.impl.sdk.d.f.f18813h);
                    return;
                }
                if (y.a()) {
                    this.f19553c.b("FileManager", "Cache is present but under size limit; not dropping...");
                }
            }
        }
    }

    private long a() {
        long longValue = ((Long) this.f19552b.a(com.applovin.impl.sdk.c.b.bx)).longValue();
        if (longValue < 0 || !b()) {
            return -1L;
        }
        return longValue;
    }

    private long a(long j10) {
        return j10 / com.huawei.openalliance.ad.constant.w.f22146c;
    }
}
