package com.huawei.openalliance.ad.ppskit.net.http;

import android.content.Context;
import android.text.TextUtils;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.ServerConfig;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import ka.Cif;
import ka.n7;
import ka.q9;
import ka.xa;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f22718l = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f22719a;

    /* renamed from: b, reason: collision with root package name */
    public final e f22720b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22721c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22722d;

    /* renamed from: e, reason: collision with root package name */
    public final c f22723e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22724g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22725h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f22726i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f22727j;

    /* renamed from: k, reason: collision with root package name */
    public final xa f22728k;

    /* renamed from: com.huawei.openalliance.ad.ppskit.net.http.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0291a {

        /* renamed from: a, reason: collision with root package name */
        public final d f22729a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f22730b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f22731c;

        /* renamed from: d, reason: collision with root package name */
        public final String f22732d;

        /* renamed from: e, reason: collision with root package name */
        public final c f22733e;
        public Class<?> f;

        /* renamed from: g, reason: collision with root package name */
        public e f22734g;

        /* renamed from: h, reason: collision with root package name */
        public String f22735h;

        /* renamed from: i, reason: collision with root package name */
        public String f22736i;

        /* renamed from: l, reason: collision with root package name */
        public byte[] f22739l;

        /* renamed from: m, reason: collision with root package name */
        public String f22740m;

        /* renamed from: n, reason: collision with root package name */
        public String f22741n;

        /* renamed from: t, reason: collision with root package name */
        public Map<String, String> f22746t;

        /* renamed from: u, reason: collision with root package name */
        public xa f22747u;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f22737j = new ArrayList(4);

        /* renamed from: k, reason: collision with root package name */
        public final LinkedHashSet f22738k = new LinkedHashSet();
        public int o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f22742p = 0;

        /* renamed from: q, reason: collision with root package name */
        public int f22743q = 0;

        /* renamed from: r, reason: collision with root package name */
        public boolean f22744r = false;

        /* renamed from: s, reason: collision with root package name */
        public boolean f22745s = false;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r2 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0291a(com.huawei.openalliance.ad.ppskit.net.http.d r9, java.lang.reflect.Method r10, java.lang.Object[] r11, com.huawei.openalliance.ad.ppskit.net.http.c r12, ka.la r13) {
            /*
                r8 = this;
                r8.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                r8.f22737j = r0
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r8.f22738k = r0
                r0 = 0
                r8.o = r0
                r8.f22742p = r0
                r8.f22743q = r0
                r8.f22744r = r0
                r8.f22745s = r0
                r8.f22729a = r9
                r8.f22730b = r10
                java.lang.String r1 = r10.getName()
                r8.f22732d = r1
                if (r11 != 0) goto L2b
                java.lang.Object[] r11 = new java.lang.Object[r0]
            L2b:
                r8.f22731c = r11
                r8.f22733e = r12
                java.lang.annotation.Annotation[][] r10 = r10.getParameterAnnotations()
                int r12 = r10.length
                int r1 = r11.length
                if (r12 != r1) goto La9
                r1 = r0
                r2 = r1
            L39:
                r3 = 0
                if (r1 >= r12) goto L85
                r4 = r10[r1]
                if (r4 == 0) goto L76
                int r5 = r4.length
                if (r5 == 0) goto L76
                int r5 = r4.length
                r6 = r0
            L45:
                if (r6 >= r5) goto L70
                r7 = r4[r6]
                boolean r7 = r7 instanceof ka.ka
                if (r7 == 0) goto L6d
                r2 = r11[r1]
                r4 = 1
                if (r2 != 0) goto L54
                r2 = r3
                goto L5a
            L54:
                boolean r5 = r2 instanceof java.util.Map
                if (r5 == 0) goto L5e
                java.util.Map r2 = (java.util.Map) r2
            L5a:
                r8.f22746t = r2
                r2 = r4
                goto L70
            L5e:
                java.lang.Object[] r9 = new java.lang.Object[r4]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
                r9[r0] = r10
                java.lang.String r10 = "Argument %d with @GrsConfig annotation can only be Map type!"
                java.lang.IllegalArgumentException r9 = r8.a(r10, r9)
                throw r9
            L6d:
                int r6 = r6 + 1
                goto L45
            L70:
                if (r2 == 0) goto L73
                goto L85
            L73:
                int r1 = r1 + 1
                goto L39
            L76:
                java.lang.String r9 = "Argument "
                java.lang.String r10 = " doesn't have annotations!"
                java.lang.String r9 = a3.l.j(r9, r1, r10)
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r9 = r8.a(r9, r10)
                throw r9
            L85:
                if (r13 == 0) goto La3
                com.huawei.openalliance.ad.ppskit.net.http.e$a r9 = new com.huawei.openalliance.ad.ppskit.net.http.e$a
                boolean r10 = r13.b()
                r9.<init>(r10)
                java.lang.String r10 = r13.a()
                java.lang.String r10 = r8.c(r10)
                r9.a(r10)
                com.huawei.openalliance.ad.ppskit.net.http.e r10 = new com.huawei.openalliance.ad.ppskit.net.http.e
                r10.<init>(r9)
                r8.f22734g = r10
                goto La8
            La3:
                r9.getClass()
                r8.f22734g = r3
            La8:
                return
            La9:
                java.lang.String r9 = "Parameter annotation number doesn't equal to parameter number"
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r9 = r8.a(r9, r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.net.http.a.C0291a.<init>(com.huawei.openalliance.ad.ppskit.net.http.d, java.lang.reflect.Method, java.lang.Object[], com.huawei.openalliance.ad.ppskit.net.http.c, ka.la):void");
        }

        public static byte[] b(byte[] bArr) {
            GZIPOutputStream gZIPOutputStream;
            n7.e("AccessMethod.Builder", "gzip content");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    try {
                        n7.g("AccessMethod.Builder", "gzip fail ".concat(th.getClass().getSimpleName()));
                        return null;
                    } finally {
                        n.D(gZIPOutputStream);
                        n.D(byteArrayOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        }

        public final IllegalArgumentException a(String str, Object... objArr) {
            StringBuilder sb2 = new StringBuilder();
            if (objArr.length != 0) {
                str = String.format(Locale.ENGLISH, str, objArr);
            }
            sb2.append(str);
            sb2.append(" (method: ");
            sb2.append(this.f22732d);
            sb2.append(")");
            String sb3 = sb2.toString();
            n7.g("AccessMethod.Builder", sb3);
            return new IllegalArgumentException(sb3);
        }

        public final String c(String str) {
            String str2;
            boolean z10;
            String a10;
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            n7.c("AccessMethod.Builder", "originalUrl: %s", y1.j(str));
            if (str.startsWith("http")) {
                return str;
            }
            Context context = this.f22729a.f22755g;
            Map<String, String> map = this.f22746t;
            if (map == null) {
                str2 = null;
            } else {
                str2 = map.get("callAppName");
            }
            n7.c("AccessMethod.Builder", "callPkg:%s", str2);
            if (!TextUtils.isEmpty(str2) && d0.q(context, str2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a10 = l.d(context).l(str2);
                n7.c("AccessMethod.Builder", "test countryCode:%s", a10);
            } else {
                a10 = a0.a.K(context).a();
                q1.m(context).R(a10);
            }
            n7.e("AccessMethod.Builder", "countryCode:" + a10);
            if (!TextUtils.isEmpty(a10)) {
                Pattern pattern = a.f22718l;
                if (com.huawei.openalliance.ad.ppskit.utils.h.a(context).c()) {
                    if (Cif.a(context).d()) {
                        a10 = "CN";
                    } else if (a10.equalsIgnoreCase("CN")) {
                        n7.e("AccessMethod", "country code not match device region, reset to UNKNOWN.");
                        a10 = "UNKNOWN";
                    }
                }
                String c10 = ConfigSpHandler.b(context).c(str, a10);
                if (n7.d()) {
                    n7.c("AccessMethod.Builder", "app: %s service name: %s original url: %s server url from grs: %s", ServerConfig.a(), ServerConfig.b(), y1.j(str), y1.j(c10));
                }
                if (!z10 && TextUtils.isEmpty(c10)) {
                    c10 = q9.a(context, str);
                }
                n7.c("AccessMethod.Builder", "serverUrl=%s", y1.j(c10));
                return c10;
            }
            return "";
        }
    }

    public a(C0291a c0291a) {
        String str;
        this.f22719a = c0291a.f;
        this.f22720b = c0291a.f22734g;
        this.f22721c = c0291a.f22736i;
        this.f22722d = c0291a.f22735h;
        this.f22725h = c0291a.f22737j;
        this.f22726i = c0291a.f22739l;
        this.f22723e = c0291a.f22733e;
        this.f22728k = c0291a.f22747u;
        if (!y1.h(c0291a.f22741n)) {
            str = c0291a.f22741n;
        } else {
            str = c0291a.f22740m;
        }
        this.f = str;
        this.f22724g = c0291a.f22743q;
        this.f22727j = c0291a.f22744r;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder(this.f22720b.a());
        String str = this.f22721c;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("/")) {
                sb2.append('/');
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
