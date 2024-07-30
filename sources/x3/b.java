package x3;

import a4.m;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import com.applovin.exoplayer2.h.k0;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.f;
import x7.d;
import x7.e;
import y3.c;
import y3.f;
import y3.g;
import y3.i;
import y3.j;
import y3.k;
import y3.o;
import y3.p;
import z3.n;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final d f36317a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f36318b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f36319c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f36320d;

    /* renamed from: e, reason: collision with root package name */
    public final i4.a f36321e;
    public final i4.a f;

    /* renamed from: g, reason: collision with root package name */
    public final int f36322g;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f36323a;

        /* renamed from: b, reason: collision with root package name */
        public final j f36324b;

        /* renamed from: c, reason: collision with root package name */
        public final String f36325c;

        public a(URL url, j jVar, String str) {
            this.f36323a = url;
            this.f36324b = jVar;
            this.f36325c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: x3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0506b {

        /* renamed from: a, reason: collision with root package name */
        public final int f36326a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f36327b;

        /* renamed from: c, reason: collision with root package name */
        public final long f36328c;

        public C0506b(int i10, URL url, long j10) {
            this.f36326a = i10;
            this.f36327b = url;
            this.f36328c = j10;
        }
    }

    public b(Context context, i4.a aVar, i4.a aVar2) {
        e eVar = new e();
        y3.b.f36570a.a(eVar);
        eVar.f36493d = true;
        this.f36317a = new d(eVar);
        this.f36319c = context;
        this.f36318b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = x3.a.f36312c;
        try {
            this.f36320d = new URL(str);
            this.f36321e = aVar2;
            this.f = aVar;
            this.f36322g = 130000;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(f.b("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (y3.o.a.f36642s.get(r0) != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    @Override // a4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z3.h a(z3.n r7) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.b.a(z3.n):z3.h");
    }

    @Override // a4.m
    public final a4.b b(a4.a aVar) {
        String str;
        Object apply;
        Integer num;
        String str2;
        String str3;
        f.a aVar2;
        long longValue;
        String str4;
        HashMap hashMap = new HashMap();
        for (n nVar : aVar.f239a) {
            String g6 = nVar.g();
            if (!hashMap.containsKey(g6)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar);
                hashMap.put(g6, arrayList);
            } else {
                ((List) hashMap.get(g6)).add(nVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n nVar2 = (n) ((List) entry.getValue()).get(0);
            p pVar = p.DEFAULT;
            Long valueOf = Long.valueOf(this.f.a());
            Long valueOf2 = Long.valueOf(this.f36321e.a());
            y3.e eVar = new y3.e(k.a.ANDROID_FIREBASE, new c(Integer.valueOf(nVar2.f("sdk-version")), nVar2.a("model"), nVar2.a("hardware"), nVar2.a("device"), nVar2.a(AppLovinEventTypes.USER_VIEWED_PRODUCT), nVar2.a("os-uild"), nVar2.a("manufacturer"), nVar2.a("fingerprint"), nVar2.a("locale"), nVar2.a(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY), nVar2.a("mcc_mnc"), nVar2.a("application_build")));
            try {
                str2 = null;
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                num = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                n nVar3 = (n) it2.next();
                z3.m d10 = nVar3.d();
                Iterator it3 = it;
                w3.b bVar = d10.f36953a;
                Iterator it4 = it2;
                boolean equals = bVar.equals(new w3.b("proto"));
                byte[] bArr = d10.f36954b;
                if (equals) {
                    aVar2 = new f.a();
                    aVar2.f36628d = bArr;
                } else if (bVar.equals(new w3.b("json"))) {
                    String str5 = new String(bArr, Charset.forName("UTF-8"));
                    f.a aVar3 = new f.a();
                    aVar3.f36629e = str5;
                    aVar2 = aVar3;
                } else {
                    String c10 = d4.a.c("CctTransportBackend");
                    if (Log.isLoggable(c10, 5)) {
                        Log.w(c10, String.format("Received event of unsupported encoding %s. Skipping...", bVar));
                    }
                    it2 = it4;
                    it = it3;
                }
                aVar2.f36625a = Long.valueOf(nVar3.e());
                aVar2.f36627c = Long.valueOf(nVar3.h());
                String str6 = nVar3.b().get("tz-offset");
                if (str6 == null) {
                    longValue = 0;
                } else {
                    longValue = Long.valueOf(str6).longValue();
                }
                aVar2.f = Long.valueOf(longValue);
                aVar2.f36630g = new i(o.b.f36644s.get(nVar3.f("net-type")), o.a.f36642s.get(nVar3.f("mobile-subtype")));
                if (nVar3.c() != null) {
                    aVar2.f36626b = nVar3.c();
                }
                if (aVar2.f36625a != null) {
                    str4 = "";
                } else {
                    str4 = " eventTimeMs";
                }
                if (aVar2.f36627c == null) {
                    str4 = str4.concat(" eventUptimeMs");
                }
                if (aVar2.f == null) {
                    str4 = com.ironsource.adapters.facebook.a.h(str4, " timezoneOffsetSeconds");
                }
                if (str4.isEmpty()) {
                    arrayList3.add(new y3.f(aVar2.f36625a.longValue(), aVar2.f36626b, aVar2.f36627c.longValue(), aVar2.f36628d, aVar2.f36629e, aVar2.f.longValue(), aVar2.f36630g));
                    it2 = it4;
                    it = it3;
                } else {
                    throw new IllegalStateException("Missing required properties:".concat(str4));
                }
            }
            Iterator it5 = it;
            if (valueOf != null) {
                str3 = "";
            } else {
                str3 = " requestTimeMs";
            }
            if (valueOf2 == null) {
                str3 = str3.concat(" requestUptimeMs");
            }
            if (str3.isEmpty()) {
                arrayList2.add(new g(valueOf.longValue(), valueOf2.longValue(), eVar, num, str2, arrayList3, pVar));
                it = it5;
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str3));
            }
        }
        int i10 = 5;
        y3.d dVar = new y3.d(arrayList2);
        byte[] bArr2 = aVar.f240b;
        URL url = this.f36320d;
        if (bArr2 != null) {
            try {
                x3.a a10 = x3.a.a(bArr2);
                str = a10.f36316b;
                if (str == null) {
                    str = null;
                }
                String str7 = a10.f36315a;
                if (str7 != null) {
                    try {
                        url = new URL(str7);
                    } catch (MalformedURLException e10) {
                        throw new IllegalArgumentException("Invalid url: " + str7, e10);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                return new a4.b(3, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar4 = new a(url, dVar, str);
            k0 k0Var = new k0(this, 1);
            do {
                apply = k0Var.apply(aVar4);
                C0506b c0506b = (C0506b) apply;
                URL url2 = c0506b.f36327b;
                if (url2 != null) {
                    d4.a.a(url2, "CctTransportBackend", "Following redirect to: %s");
                    aVar4 = new a(c0506b.f36327b, aVar4.f36324b, aVar4.f36325c);
                } else {
                    aVar4 = null;
                }
                if (aVar4 == null) {
                    break;
                }
                i10--;
            } while (i10 >= 1);
            C0506b c0506b2 = (C0506b) apply;
            int i11 = c0506b2.f36326a;
            if (i11 == 200) {
                return new a4.b(1, c0506b2.f36328c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return new a4.b(4, -1L);
                }
                return new a4.b(3, -1L);
            }
            return new a4.b(2, -1L);
        } catch (IOException e11) {
            d4.a.b("CctTransportBackend", "Could not make request to the backend", e11);
            return new a4.b(2, -1L);
        }
    }
}
