package com.anythink.core.common.res;

import a3.k;
import a3.l;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.i;
import com.anythink.core.common.k.j;
import com.anythink.core.common.res.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6477a = "about:blank";

    /* renamed from: d, reason: collision with root package name */
    private static final String f6478d = "anythink_internal_resouce";

    /* renamed from: e, reason: collision with root package name */
    private static final String f6479e = "anythink_custom_resouce";
    private static final String f = "anythink_internal_extra_resource";

    /* renamed from: g, reason: collision with root package name */
    private static final String f6480g = "anythink_internal_video_resource";

    /* renamed from: h, reason: collision with root package name */
    private static final String f6481h = "anythink_internal_html_resouce";

    /* renamed from: i, reason: collision with root package name */
    private static volatile d f6482i;

    /* renamed from: j, reason: collision with root package name */
    private Context f6485j;

    /* renamed from: k, reason: collision with root package name */
    private File f6486k;

    /* renamed from: c, reason: collision with root package name */
    private final String f6484c = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<Integer, a> f6483b = new ConcurrentHashMap<>();

    private d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6485j = applicationContext;
        this.f6486k = j.a(applicationContext);
    }

    public static d a(Context context) {
        if (f6482i == null) {
            synchronized (d.class) {
                if (f6482i == null) {
                    f6482i = new d(context);
                }
            }
        }
        return f6482i;
    }

    public final void b() {
        File[] listFiles;
        try {
            File file = new File(this.f6486k, f6481h);
            if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                try {
                    if (file2.isFile() && System.currentTimeMillis() - file2.lastModified() > 86400000) {
                        file2.delete();
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final String a() {
        return this.f6486k.getAbsolutePath();
    }

    public final String a(String str, com.anythink.core.common.e.j jVar, i iVar) {
        FileOutputStream fileOutputStream;
        byte[] bytes;
        File file = new File(this.f6486k, f6481h);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, jVar.f5656d + "_" + iVar.p() + ".html");
        try {
            bytes = str.getBytes(com.anythink.expressad.foundation.g.a.bN);
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bytes, 0, bytes.length);
            String url = file2.toURL().toString();
            try {
                fileOutputStream.close();
                return url;
            } catch (Throwable unused2) {
                return url;
            }
        } catch (Throwable unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return "";
        }
    }

    public final File b(com.anythink.core.common.e.j jVar, i iVar) {
        File file = new File(new File(this.f6486k, f6481h), jVar.f5656d + "_" + iVar.p() + ".html");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String b(int i10, String str) {
        if (i10 != 4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a(i10));
            return k.m(sb2, File.separator, str, ".0");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a(i10));
        return l.p(sb3, File.separator, str);
    }

    public final void a(com.anythink.core.common.e.j jVar, i iVar) {
        try {
            File file = new File(new File(this.f6486k, f6481h), jVar.f5656d + "_" + iVar.p() + ".html");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r6, java.lang.String r7, java.io.InputStream r8) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L80
            if (r8 != 0) goto L7
            goto L80
        L7:
            java.lang.String r1 = r5.a(r6)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L12
            return r0
        L12:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L20
            r2.mkdirs()
        L20:
            com.anythink.core.common.res.a r6 = r5.a(r6, r2)
            if (r6 == 0) goto L80
            r1 = 0
            com.anythink.core.common.res.a$c r2 = r6.a(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r2 != 0) goto L52
            com.anythink.core.common.res.a$a r6 = r6.b(r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r6 == 0) goto L59
            java.io.OutputStream r1 = r6.a(r0)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            r7 = 2048(0x800, float:2.87E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
        L3b:
            int r2 = r8.read(r7)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            r3 = -1
            if (r2 == r3) goto L46
            r1.write(r7, r0, r2)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            goto L3b
        L46:
            r6.a()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            r1.close()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L60
            goto L59
        L4d:
            r7 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L64
        L52:
            java.io.InputStream r6 = r2.a()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r6.close()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L59:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L5e
        L5e:
            r0 = 1
            goto L80
        L60:
            r6 = move-exception
            goto L7a
        L62:
            r7 = move-exception
            r6 = r1
        L64:
            r7.toString()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L71
            r1.b()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L77
            goto L71
        L6d:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L77
        L71:
            if (r6 == 0) goto L80
            r6.close()     // Catch: java.io.IOException -> L80
            goto L80
        L77:
            r7 = move-exception
            r1 = r6
            r6 = r7
        L7a:
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.io.IOException -> L7f
        L7f:
            throw r6
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.d.a(int, java.lang.String, java.io.InputStream):boolean");
    }

    public final FileInputStream a(int i10, String str) {
        InputStream a10;
        if (i10 != 4) {
            String a11 = a(i10);
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            File file = new File(a11);
            if (!file.exists()) {
                file.mkdirs();
            }
            a a12 = a(i10, file);
            if (a12 != null) {
                try {
                    a.c a13 = a12.a(str);
                    if (a13 != null && (a10 = a13.a()) != null) {
                        return (FileInputStream) a10;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return null;
        }
        try {
            return new FileInputStream(new File(b(4, str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private synchronized a a(int i10, File file) {
        a aVar;
        aVar = this.f6483b.get(Integer.valueOf(i10));
        if (aVar == null) {
            try {
                aVar = a.a(file, n.a().d(i10));
                this.f6483b.put(Integer.valueOf(i10), aVar);
            } catch (Throwable th) {
                if (n.a().A()) {
                    Log.e(this.f6484c, "Create DiskCache error.");
                    th.printStackTrace();
                }
            }
        }
        return aVar;
    }

    public final String a(int i10) {
        return new File(this.f6486k, i10 != 1 ? i10 != 3 ? i10 != 4 ? f6479e : f6480g : f : f6478d).getAbsolutePath();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(1));
        return new File(k.m(sb2, File.separator, str, ".0")).exists();
    }
}
