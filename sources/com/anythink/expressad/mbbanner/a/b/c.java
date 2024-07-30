package com.anythink.expressad.mbbanner.a.b;

import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.h.k;
import com.huawei.hms.framework.common.ContainerUtils;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10309a = "2000067";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10310b = "2000068";

    /* renamed from: c, reason: collision with root package name */
    public static final String f10311c = "2000069";

    /* renamed from: d, reason: collision with root package name */
    private String f10312d;

    /* renamed from: e, reason: collision with root package name */
    private String f10313e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f10314g;

    /* renamed from: h, reason: collision with root package name */
    private String f10315h;

    /* renamed from: i, reason: collision with root package name */
    private String f10316i;

    /* renamed from: j, reason: collision with root package name */
    private String f10317j;

    /* renamed from: k, reason: collision with root package name */
    private String f10318k;

    /* renamed from: l, reason: collision with root package name */
    private int f10319l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10320m;

    private c() {
    }

    private c a(boolean z10) {
        this.f10320m = z10;
        return this;
    }

    private String b() {
        return this.f10312d;
    }

    private String c() {
        return this.f10313e;
    }

    private String d() {
        return this.f;
    }

    private String e() {
        return this.f10314g;
    }

    private String f() {
        return this.f10315h;
    }

    private String g() {
        return this.f10316i;
    }

    private String h() {
        return this.f10317j;
    }

    private String i() {
        return this.f10318k;
    }

    private int j() {
        return this.f10319l;
    }

    private String k() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f10313e)) {
            sb2.append("unit_id=");
            sb2.append(this.f10313e);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(this.f10314g)) {
            sb2.append("cid=");
            sb2.append(this.f10314g);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(this.f10315h)) {
            sb2.append("rid=");
            sb2.append(this.f10315h);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(this.f10316i)) {
            sb2.append("rid_n=");
            sb2.append(this.f10316i);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(this.f10317j)) {
            sb2.append("creative_id=");
            sb2.append(this.f10317j);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (!TextUtils.isEmpty(this.f10318k)) {
            sb2.append("reason=");
            sb2.append(this.f10318k);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (this.f10319l != 0) {
            sb2.append("result=");
            sb2.append(this.f10319l);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        if (this.f10320m) {
            sb2.append("hb=1&");
        }
        sb2.append("network_type=");
        n.a().g();
        sb2.append(k.a());
        sb2.append(ContainerUtils.FIELD_DELIMITER);
        if (!TextUtils.isEmpty(this.f10312d)) {
            sb2.append("key=");
            sb2.append(this.f10312d);
        }
        return sb2.toString();
    }

    private static c a() {
        return new c();
    }

    private c b(String str) {
        this.f10313e = str;
        return this;
    }

    private c c(String str) {
        this.f = str;
        return this;
    }

    private c d(String str) {
        this.f10314g = str;
        return this;
    }

    private c e(String str) {
        this.f10315h = str;
        return this;
    }

    private c f(String str) {
        this.f10316i = str;
        return this;
    }

    private c g(String str) {
        this.f10317j = str;
        return this;
    }

    private c h(String str) {
        this.f10318k = str;
        return this;
    }

    private c a(String str) {
        this.f10312d = str;
        return this;
    }

    private c a(int i10) {
        this.f10319l = i10;
        return this;
    }
}
