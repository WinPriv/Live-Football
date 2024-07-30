package com.applovin.impl.mediation.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17680a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17681b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17682c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17683d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17684e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17685g;

    /* renamed from: h, reason: collision with root package name */
    private final String f17686h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONArray f17687i;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f17688j;

    /* renamed from: k, reason: collision with root package name */
    private final List<String> f17689k;

    /* renamed from: com.applovin.impl.mediation.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0202a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f17690a;

        /* renamed from: b, reason: collision with root package name */
        private String f17691b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17692c;

        /* renamed from: d, reason: collision with root package name */
        private String f17693d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17694e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f17695g;

        /* renamed from: h, reason: collision with root package name */
        private String f17696h;

        /* renamed from: i, reason: collision with root package name */
        private String f17697i;

        /* renamed from: j, reason: collision with root package name */
        private int f17698j;

        /* renamed from: k, reason: collision with root package name */
        private int f17699k;

        /* renamed from: l, reason: collision with root package name */
        private String f17700l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f17701m;

        /* renamed from: n, reason: collision with root package name */
        private JSONArray f17702n;
        private boolean o;

        /* renamed from: p, reason: collision with root package name */
        private List<String> f17703p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f17704q;

        /* renamed from: r, reason: collision with root package name */
        private List<String> f17705r;

        public C0202a a(int i10) {
            this.f17698j = i10;
            return this;
        }

        public C0202a b(int i10) {
            this.f17699k = i10;
            return this;
        }

        public C0202a c(String str) {
            this.f = str;
            this.f17694e = true;
            return this;
        }

        public C0202a d(String str) {
            this.f17696h = str;
            this.f17695g = true;
            return this;
        }

        public C0202a e(String str) {
            this.f17697i = str;
            return this;
        }

        public C0202a f(String str) {
            this.f17700l = str;
            return this;
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.f17691b + ", title$value=" + this.f17693d + ", advertiser$value=" + this.f + ", body$value=" + this.f17696h + ", mainImageUrl=" + this.f17697i + ", mainImageWidth=" + this.f17698j + ", mainImageHeight=" + this.f17699k + ", clickDestinationUrl=" + this.f17700l + ", clickTrackingUrls$value=" + this.f17702n + ", jsTrackers$value=" + this.f17703p + ", impressionUrls$value=" + this.f17705r + ")";
        }

        public C0202a a(String str) {
            this.f17691b = str;
            this.f17690a = true;
            return this;
        }

        public C0202a b(String str) {
            this.f17693d = str;
            this.f17692c = true;
            return this;
        }

        public C0202a a(List<String> list) {
            this.f17703p = list;
            this.o = true;
            return this;
        }

        public C0202a b(List<String> list) {
            this.f17705r = list;
            this.f17704q = true;
            return this;
        }

        public C0202a a(JSONArray jSONArray) {
            this.f17702n = jSONArray;
            this.f17701m = true;
            return this;
        }

        public a a() {
            String str = this.f17691b;
            if (!this.f17690a) {
                str = a.m();
            }
            String str2 = str;
            String str3 = this.f17693d;
            if (!this.f17692c) {
                str3 = a.n();
            }
            String str4 = str3;
            String str5 = this.f;
            if (!this.f17694e) {
                str5 = a.o();
            }
            String str6 = str5;
            String str7 = this.f17696h;
            if (!this.f17695g) {
                str7 = a.p();
            }
            String str8 = str7;
            JSONArray jSONArray = this.f17702n;
            if (!this.f17701m) {
                jSONArray = a.q();
            }
            JSONArray jSONArray2 = jSONArray;
            List<String> list = this.f17703p;
            if (!this.o) {
                list = a.r();
            }
            List<String> list2 = list;
            List<String> list3 = this.f17705r;
            if (!this.f17704q) {
                list3 = a.s();
            }
            return new a(str2, str4, str6, str8, this.f17697i, this.f17698j, this.f17699k, this.f17700l, jSONArray2, list2, list3);
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, JSONArray jSONArray, List<String> list, List<String> list2) {
        this.f17680a = str;
        this.f17681b = str2;
        this.f17682c = str3;
        this.f17683d = str4;
        this.f17684e = str5;
        this.f = i10;
        this.f17685g = i11;
        this.f17686h = str6;
        this.f17687i = jSONArray;
        this.f17688j = list;
        this.f17689k = list2;
    }

    public static C0202a a() {
        return new C0202a();
    }

    public static /* synthetic */ String m() {
        return t();
    }

    public static /* synthetic */ String n() {
        return u();
    }

    public static /* synthetic */ String o() {
        return v();
    }

    public static /* synthetic */ String p() {
        return w();
    }

    public static /* synthetic */ JSONArray q() {
        return x();
    }

    public static /* synthetic */ List r() {
        return y();
    }

    public static /* synthetic */ List s() {
        return z();
    }

    private static String t() {
        return "";
    }

    private static String u() {
        return "";
    }

    private static String v() {
        return "";
    }

    private static String w() {
        return "";
    }

    private static JSONArray x() {
        return new JSONArray();
    }

    private static List<String> y() {
        return new ArrayList();
    }

    private static List<String> z() {
        return new ArrayList();
    }

    public String b() {
        return this.f17680a;
    }

    public String c() {
        return this.f17681b;
    }

    public String d() {
        return this.f17682c;
    }

    public String e() {
        return this.f17683d;
    }

    public String f() {
        return this.f17684e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.f17685g;
    }

    public String i() {
        return this.f17686h;
    }

    public JSONArray j() {
        return this.f17687i;
    }

    public List<String> k() {
        return this.f17688j;
    }

    public List<String> l() {
        return this.f17689k;
    }
}
