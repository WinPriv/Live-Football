package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9633a = "key";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9634b = "time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9635c = "ad_source_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9636d = "num";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9637e = "unit_id";
    public static final String f = "fb";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9638g = "timeout";

    /* renamed from: h, reason: collision with root package name */
    public static final String f9639h = "network_type";

    /* renamed from: i, reason: collision with root package name */
    public static final String f9640i = "network_str";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9641j = "2000006";

    /* renamed from: k, reason: collision with root package name */
    public static final String f9642k = "hb";

    /* renamed from: l, reason: collision with root package name */
    private int f9643l;

    /* renamed from: m, reason: collision with root package name */
    private String f9644m;

    /* renamed from: n, reason: collision with root package name */
    private int f9645n;
    private String o;

    /* renamed from: p, reason: collision with root package name */
    private int f9646p;

    /* renamed from: q, reason: collision with root package name */
    private int f9647q;

    /* renamed from: r, reason: collision with root package name */
    private int f9648r;

    /* renamed from: s, reason: collision with root package name */
    private String f9649s;

    /* renamed from: t, reason: collision with root package name */
    private int f9650t;

    /* renamed from: u, reason: collision with root package name */
    private String f9651u;

    private l(int i10, String str, int i11, String str2, int i12, int i13, int i14) {
        this.f9643l = i10;
        this.f9644m = str;
        this.f9645n = i11;
        this.o = str2;
        this.f9646p = i12;
        this.f9647q = i13;
        this.f9648r = i14;
    }

    private int a() {
        return this.f9650t;
    }

    private int b() {
        return this.f9643l;
    }

    private String c() {
        return this.f9644m;
    }

    private String d() {
        return this.f9651u;
    }

    private int e() {
        return this.f9645n;
    }

    private String f() {
        return this.o;
    }

    private int g() {
        return this.f9646p;
    }

    private int h() {
        return this.f9647q;
    }

    private int i() {
        return this.f9648r;
    }

    private String j() {
        return this.f9649s;
    }

    private void a(int i10) {
        this.f9650t = i10;
    }

    private void b(int i10) {
        this.f9643l = i10;
    }

    private void c(int i10) {
        this.f9645n = i10;
    }

    private void d(int i10) {
        this.f9646p = i10;
    }

    private void e(int i10) {
        this.f9647q = i10;
    }

    private void f(int i10) {
        this.f9648r = i10;
    }

    private void a(String str) {
        this.f9644m = str;
    }

    private void b(String str) {
        this.f9651u = str;
    }

    private void c(String str) {
        this.o = str;
    }

    private void d(String str) {
        this.f9649s = str;
    }

    private static String a(List<l> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (l lVar : list) {
            stringBuffer.append("ad_source_id=" + lVar.f9643l);
            stringBuffer.append("&time=" + lVar.f9644m);
            stringBuffer.append("&num=" + lVar.f9645n);
            stringBuffer.append("&unit_id=" + lVar.o);
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + lVar.f9646p);
            if (lVar.f9650t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + lVar.f9647q + "\n");
        }
        return stringBuffer.toString();
    }

    public l() {
    }
}
