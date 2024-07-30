package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.n;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f19079a = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: b, reason: collision with root package name */
    private final p f19080b;

    /* renamed from: c, reason: collision with root package name */
    private final y f19081c;

    /* renamed from: d, reason: collision with root package name */
    private final e f19082d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f19083a;

        /* renamed from: b, reason: collision with root package name */
        private long f19084b;

        public long a() {
            return this.f19083a;
        }

        public long b() {
            return this.f19084b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f19083a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f19084b = j10;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0221b<T> implements m0.a<e.c> {

        /* renamed from: b, reason: collision with root package name */
        private final String f19086b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.c<T> f19087c;

        /* renamed from: d, reason: collision with root package name */
        private final String f19088d;

        /* renamed from: e, reason: collision with root package name */
        private final T f19089e;
        private final boolean f;

        /* renamed from: g, reason: collision with root package name */
        private final long f19090g;

        /* renamed from: h, reason: collision with root package name */
        private final a f19091h;

        /* renamed from: i, reason: collision with root package name */
        private final c<T> f19092i;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e.c cVar) {
            String str;
            Object obj = null;
            int i10 = 0;
            try {
                int a10 = cVar.a();
                if (a10 <= 0) {
                    b.this.a(this.f19088d, this.f19086b, a10, this.f19090g, (Throwable) null);
                    this.f19092i.a(a10, null, null);
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f19090g;
                if (a10 >= 200 && a10 < 400) {
                    a aVar = this.f19091h;
                    if (aVar != null) {
                        aVar.a(currentTimeMillis);
                    }
                    b.this.a(this.f19088d, this.f19086b, a10, this.f19090g);
                    String b10 = cVar.b();
                    p unused = b.this.f19080b;
                    if (Utils.isDspDemoApp(p.y())) {
                        String str2 = "";
                        if (b10 == null) {
                            str = "";
                        } else {
                            str = b10;
                        }
                        if (this.f19087c.e() != null) {
                            str2 = this.f19087c.e().toString();
                        }
                        b.this.f19080b.ab().a(str, this.f19086b, str2);
                    }
                    if (b10 != null) {
                        b.this.f19081c.a("ConnectionManager", b10);
                        a aVar2 = this.f19091h;
                        if (aVar2 != null) {
                            aVar2.b(b10.length());
                        }
                        if (this.f) {
                            String a11 = n.a(b10, b.this.f19080b.B());
                            if (a11 == null) {
                                Map<String, String> map = CollectionUtils.map(2);
                                map.put("request", StringUtils.getHostAndPath(this.f19086b));
                                map.put("response", b10);
                                b.this.f19080b.G().trackEvent("rdf", map);
                            }
                            b10 = a11;
                        }
                        try {
                            this.f19092i.a(b.this.a(b10, (String) this.f19089e), a10);
                            return;
                        } catch (Throwable th) {
                            String str3 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f19086b) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                            y unused2 = b.this.f19081c;
                            if (y.a()) {
                                b.this.f19081c.b("ConnectionManager", str3, th);
                            }
                            b.this.f19080b.P().a(com.applovin.impl.sdk.d.f.f18816k);
                            this.f19092i.a(AppLovinErrorCodes.INVALID_RESPONSE, str3, null);
                            return;
                        }
                    }
                    this.f19092i.a(this.f19089e, a10);
                    return;
                }
                this.f19092i.a(a10, null, null);
            } catch (MalformedURLException e10) {
                if (this.f19089e == null) {
                    b.this.a(this.f19088d, this.f19086b, 0, this.f19090g);
                    this.f19092i.a(this.f19089e, -901);
                } else {
                    b.this.a(this.f19088d, this.f19086b, 0, this.f19090g, e10);
                    this.f19092i.a(-901, e10.getMessage(), null);
                }
            } catch (Throwable th2) {
                if (0 == 0) {
                    i10 = b.this.a(th2);
                }
                try {
                    String c10 = cVar.c();
                    if (c10 != null) {
                        if (this.f) {
                            c10 = n.a(c10, b.this.f19080b.B());
                        }
                        obj = b.this.a(c10, (String) this.f19089e);
                    }
                } catch (Throwable unused3) {
                }
                b.this.a(this.f19088d, this.f19086b, i10, this.f19090g, th2);
                this.f19092i.a(i10, th2.getMessage(), obj);
            }
        }

        private C0221b(String str, com.applovin.impl.sdk.network.c<T> cVar, String str2, T t10, boolean z10, long j10, a aVar, c<T> cVar2) {
            this.f19086b = str;
            this.f19087c = cVar;
            this.f19088d = str2;
            this.f19089e = t10;
            this.f = z10;
            this.f19090g = j10;
            this.f19091h = aVar;
            this.f19092i = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void a(int i10, String str, T t10);

        void a(T t10, int i10);
    }

    public b(p pVar) {
        this.f19080b = pVar;
        this.f19081c = pVar.L();
        e eVar = new e(pVar);
        this.f19082d = eVar;
        eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0 A[Catch: all -> 0x0279, TryCatch #1 {all -> 0x0279, blocks: (B:39:0x00fc, B:41:0x010c, B:44:0x0133, B:45:0x012f, B:46:0x0142, B:49:0x0167, B:51:0x017b, B:52:0x0191, B:56:0x019c, B:60:0x01da, B:62:0x01e0, B:63:0x01fd, B:66:0x020c, B:68:0x0219, B:71:0x01be, B:73:0x01c4, B:75:0x0189, B:76:0x0220, B:78:0x0226, B:79:0x023a, B:59:0x01b0), top: B:38:0x00fc, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219 A[Catch: all -> 0x0279, TryCatch #1 {all -> 0x0279, blocks: (B:39:0x00fc, B:41:0x010c, B:44:0x0133, B:45:0x012f, B:46:0x0142, B:49:0x0167, B:51:0x017b, B:52:0x0191, B:56:0x019c, B:60:0x01da, B:62:0x01e0, B:63:0x01fd, B:66:0x020c, B:68:0x0219, B:71:0x01be, B:73:0x01c4, B:75:0x0189, B:76:0x0220, B:78:0x0226, B:79:0x023a, B:59:0x01b0), top: B:38:0x00fc, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void a(com.applovin.impl.sdk.network.c<T> r22, com.applovin.impl.sdk.network.b.a r23, com.applovin.impl.sdk.network.b.c<T> r24) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.b.a(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(String str, T t10) throws JSONException, SAXException, ClassCastException {
        if (t10 == null) {
            return str;
        }
        if (str != 0 && str.length() >= 3) {
            if (t10 instanceof JSONObject) {
                return (T) new JSONObject(str);
            }
            if (t10 instanceof t) {
                return (T) u.a(str, this.f19080b);
            }
            if (t10 instanceof String) {
                return str;
            }
            if (y.a()) {
                this.f19081c.e("ConnectionManager", "Failed to process response of type '" + t10.getClass().getName() + "'");
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (y.a()) {
            this.f19081c.c("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (((float) (System.currentTimeMillis() - j10)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.i.f(this.f19080b) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (y.a()) {
            this.f19081c.b("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (((float) (System.currentTimeMillis() - j10)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.i.f(this.f19080b) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
