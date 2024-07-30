package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class j implements com.anythink.expressad.e.b, com.anythink.expressad.foundation.g.d.c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final long f10473a = 1;
    public static final int cR = 1;
    public static final int cS = 2;
    public static final int cT = 3;
    public String cU;

    /* renamed from: j, reason: collision with root package name */
    private double f10481j;

    /* renamed from: l, reason: collision with root package name */
    private Object f10483l;

    /* renamed from: n, reason: collision with root package name */
    private String f10485n;
    private Drawable o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f10486p;

    /* renamed from: q, reason: collision with root package name */
    private q f10487q;

    /* renamed from: b, reason: collision with root package name */
    private String f10474b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f10475c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f10476d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f10477e = "";
    private String f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f10478g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f10479h = "";

    /* renamed from: i, reason: collision with root package name */
    private long f10480i = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f10482k = 33333;

    /* renamed from: m, reason: collision with root package name */
    private int f10484m = 1;

    /* renamed from: r, reason: collision with root package name */
    private int f10488r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f10489s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f10490t = 0;

    private Drawable b() {
        return this.f10486p;
    }

    private void c(q qVar) {
        this.f10487q = qVar;
    }

    private String d() {
        return this.cU;
    }

    private int e() {
        return this.f10488r;
    }

    private int f() {
        return this.f10489s;
    }

    private String g() {
        return this.f10485n;
    }

    public final void A(String str) {
        this.f10479h = str;
    }

    public final void B(String str) {
        this.f = str;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
    }

    public final double aX() {
        return this.f10481j;
    }

    public final int aY() {
        return this.f10482k;
    }

    public final String aZ() {
        return this.f10474b;
    }

    public final String ba() {
        return this.f10475c;
    }

    public final String bb() {
        return this.f10476d;
    }

    public final String bc() {
        return this.f10477e;
    }

    public final String bd() {
        return this.f10478g;
    }

    public final String be() {
        return this.f10479h;
    }

    public final int bf() {
        return this.f10484m;
    }

    public final long bg() {
        return this.f10480i;
    }

    public final String bh() {
        return this.f;
    }

    public final int bi() {
        return this.f10490t;
    }

    public final void o(int i10) {
        this.f10482k = i10;
    }

    public final void p(int i10) {
        this.f10484m = i10;
    }

    public final void q(int i10) {
        this.f10490t = i10;
    }

    public final void v(String str) {
        this.f10474b = str;
    }

    public final void w(String str) {
        this.f10475c = str;
    }

    public final void x(String str) {
        this.f10476d = str;
    }

    public final void y(String str) {
        this.f10477e = str;
    }

    public final void z(String str) {
        this.f10478g = str;
    }

    private Drawable a() {
        return this.o;
    }

    private void b(q qVar) {
        this.f10487q = qVar;
        if (TextUtils.isEmpty(this.f10479h)) {
            return;
        }
        a3.k.f().a(this.f10479h, this);
    }

    private Object c() {
        return this.f10483l;
    }

    public void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.cU = str;
    }

    private void a(q qVar) {
        this.f10487q = qVar;
        if (TextUtils.isEmpty(this.f10478g)) {
            return;
        }
        a3.k.f().a(this.f10478g, this);
    }

    private void b(int i10) {
        this.f10489s = i10;
    }

    private void b(Drawable drawable) {
        this.f10486p = drawable;
    }

    public final void a(double d10) {
        this.f10481j = d10;
    }

    private void a(Object obj) {
        this.f10483l = obj;
    }

    public final void a(long j10) {
        this.f10480i = j10;
    }

    private void a(int i10) {
        this.f10488r = i10;
    }

    private void a(String str) {
        this.f10485n = str;
    }

    private static Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private void a(Drawable drawable) {
        this.o = drawable;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.f10479h) && this.f10479h.equals(str) && bitmap != null) {
            this.f10486p = a(bitmap);
            if (this.f10487q != null) {
                a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.f10478g) || (str2 = this.f10478g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.o = a(bitmap);
        if (this.f10487q != null) {
            a(bitmap);
        }
    }
}
