package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private String f19093a;

    /* renamed from: b, reason: collision with root package name */
    private String f19094b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19095c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f19096d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f19097e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private final T f19098g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19099h;

    /* renamed from: i, reason: collision with root package name */
    private int f19100i;

    /* renamed from: j, reason: collision with root package name */
    private final int f19101j;

    /* renamed from: k, reason: collision with root package name */
    private final int f19102k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f19103l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f19104m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f19105n;
    private final boolean o;

    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        String f19106a;

        /* renamed from: b, reason: collision with root package name */
        String f19107b;

        /* renamed from: c, reason: collision with root package name */
        String f19108c;

        /* renamed from: e, reason: collision with root package name */
        Map<String, String> f19110e;
        JSONObject f;

        /* renamed from: g, reason: collision with root package name */
        T f19111g;

        /* renamed from: i, reason: collision with root package name */
        int f19113i;

        /* renamed from: j, reason: collision with root package name */
        int f19114j;

        /* renamed from: k, reason: collision with root package name */
        boolean f19115k;

        /* renamed from: l, reason: collision with root package name */
        boolean f19116l;

        /* renamed from: m, reason: collision with root package name */
        boolean f19117m;

        /* renamed from: n, reason: collision with root package name */
        boolean f19118n;

        /* renamed from: h, reason: collision with root package name */
        int f19112h = 1;

        /* renamed from: d, reason: collision with root package name */
        Map<String, String> f19109d = CollectionUtils.map();

        public a(p pVar) {
            this.f19113i = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.f18721de)).intValue();
            this.f19114j = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.f18720dd)).intValue();
            this.f19116l = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.f18719dc)).booleanValue();
            this.f19117m = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.f18726fa)).booleanValue();
            this.f19118n = ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ff)).booleanValue();
        }

        public a<T> a(String str) {
            this.f19107b = str;
            return this;
        }

        public a<T> b(String str) {
            this.f19106a = str;
            return this;
        }

        public a<T> c(String str) {
            this.f19108c = str;
            return this;
        }

        public a<T> d(boolean z10) {
            this.f19118n = z10;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.f19109d = map;
            return this;
        }

        public a<T> b(Map<String, String> map) {
            this.f19110e = map;
            return this;
        }

        public a<T> c(int i10) {
            this.f19114j = i10;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        public a<T> b(int i10) {
            this.f19113i = i10;
            return this;
        }

        public a<T> c(boolean z10) {
            this.f19117m = z10;
            return this;
        }

        public a<T> a(T t10) {
            this.f19111g = t10;
            return this;
        }

        public a<T> b(boolean z10) {
            this.f19116l = z10;
            return this;
        }

        public a<T> a(int i10) {
            this.f19112h = i10;
            return this;
        }

        public a<T> a(boolean z10) {
            this.f19115k = z10;
            return this;
        }

        public c<T> a() {
            return new c<>(this);
        }
    }

    public c(a<T> aVar) {
        this.f19093a = aVar.f19107b;
        this.f19094b = aVar.f19106a;
        this.f19095c = aVar.f19109d;
        this.f19096d = aVar.f19110e;
        this.f19097e = aVar.f;
        this.f = aVar.f19108c;
        this.f19098g = aVar.f19111g;
        int i10 = aVar.f19112h;
        this.f19099h = i10;
        this.f19100i = i10;
        this.f19101j = aVar.f19113i;
        this.f19102k = aVar.f19114j;
        this.f19103l = aVar.f19115k;
        this.f19104m = aVar.f19116l;
        this.f19105n = aVar.f19117m;
        this.o = aVar.f19118n;
    }

    public String a() {
        return this.f19093a;
    }

    public String b() {
        return this.f19094b;
    }

    public Map<String, String> c() {
        return this.f19095c;
    }

    public Map<String, String> d() {
        return this.f19096d;
    }

    public JSONObject e() {
        return this.f19097e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f19093a;
        if (str == null ? cVar.f19093a != null : !str.equals(cVar.f19093a)) {
            return false;
        }
        Map<String, String> map = this.f19095c;
        if (map == null ? cVar.f19095c != null : !map.equals(cVar.f19095c)) {
            return false;
        }
        Map<String, String> map2 = this.f19096d;
        if (map2 == null ? cVar.f19096d != null : !map2.equals(cVar.f19096d)) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null ? cVar.f != null : !str2.equals(cVar.f)) {
            return false;
        }
        String str3 = this.f19094b;
        if (str3 == null ? cVar.f19094b != null : !str3.equals(cVar.f19094b)) {
            return false;
        }
        JSONObject jSONObject = this.f19097e;
        if (jSONObject == null ? cVar.f19097e != null : !jSONObject.equals(cVar.f19097e)) {
            return false;
        }
        T t10 = this.f19098g;
        if (t10 == null ? cVar.f19098g != null : !t10.equals(cVar.f19098g)) {
            return false;
        }
        if (this.f19099h == cVar.f19099h && this.f19100i == cVar.f19100i && this.f19101j == cVar.f19101j && this.f19102k == cVar.f19102k && this.f19103l == cVar.f19103l && this.f19104m == cVar.f19104m && this.f19105n == cVar.f19105n && this.o == cVar.o) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.f;
    }

    public T g() {
        return this.f19098g;
    }

    public int h() {
        return this.f19100i;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = super.hashCode() * 31;
        String str = this.f19093a;
        int i13 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (hashCode + i10) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f19094b;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        T t10 = this.f19098g;
        if (t10 != null) {
            i13 = t10.hashCode();
        }
        int i17 = ((((((((((((((((i16 + i13) * 31) + this.f19099h) * 31) + this.f19100i) * 31) + this.f19101j) * 31) + this.f19102k) * 31) + (this.f19103l ? 1 : 0)) * 31) + (this.f19104m ? 1 : 0)) * 31) + (this.f19105n ? 1 : 0)) * 31) + (this.o ? 1 : 0);
        Map<String, String> map = this.f19095c;
        if (map != null) {
            i17 = (i17 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f19096d;
        if (map2 != null) {
            i17 = (i17 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f19097e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (i17 * 31) + new String(charArray).hashCode();
        }
        return i17;
    }

    public int i() {
        return this.f19099h - this.f19100i;
    }

    public int j() {
        return this.f19101j;
    }

    public int k() {
        return this.f19102k;
    }

    public boolean l() {
        return this.f19103l;
    }

    public boolean m() {
        return this.f19104m;
    }

    public boolean n() {
        return this.f19105n;
    }

    public boolean o() {
        return this.o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f19093a + ", backupEndpoint=" + this.f + ", httpMethod=" + this.f19094b + ", httpHeaders=" + this.f19096d + ", body=" + this.f19097e + ", emptyResponse=" + this.f19098g + ", initialRetryAttempts=" + this.f19099h + ", retryAttemptsLeft=" + this.f19100i + ", timeoutMillis=" + this.f19101j + ", retryDelayMillis=" + this.f19102k + ", exponentialRetries=" + this.f19103l + ", retryOnAllErrors=" + this.f19104m + ", encodingEnabled=" + this.f19105n + ", gzipBodyEncoding=" + this.o + '}';
    }

    public void a(String str) {
        this.f19093a = str;
    }

    public void b(String str) {
        this.f19094b = str;
    }

    public void a(int i10) {
        this.f19100i = i10;
    }

    public static <T> a<T> a(p pVar) {
        return new a<>(pVar);
    }
}
