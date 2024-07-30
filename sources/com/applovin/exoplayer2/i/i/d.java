package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {
    private int f;

    /* renamed from: h, reason: collision with root package name */
    private int f15824h;
    private float o;

    /* renamed from: a, reason: collision with root package name */
    private String f15818a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f15819b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f15820c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f15821d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f15822e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15823g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15825i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f15826j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f15827k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f15828l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f15829m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f15830n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f15831p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15832q = false;

    public void a(String str) {
        this.f15818a = str;
    }

    public void b(String str) {
        this.f15819b = str;
    }

    public void c(String str) {
        this.f15821d = str;
    }

    public String d() {
        return this.f15822e;
    }

    public int e() {
        if (this.f15823g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public boolean f() {
        return this.f15823g;
    }

    public int g() {
        if (this.f15825i) {
            return this.f15824h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean h() {
        return this.f15825i;
    }

    public int i() {
        return this.f15830n;
    }

    public float j() {
        return this.o;
    }

    public int k() {
        return this.f15831p;
    }

    public boolean l() {
        return this.f15832q;
    }

    public void a(String[] strArr) {
        this.f15820c = new HashSet(Arrays.asList(strArr));
    }

    public boolean b() {
        return this.f15826j == 1;
    }

    public boolean c() {
        return this.f15827k == 1;
    }

    public d d(String str) {
        this.f15822e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public int a(String str, String str2, Set<String> set, String str3) {
        if (this.f15818a.isEmpty() && this.f15819b.isEmpty() && this.f15820c.isEmpty() && this.f15821d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a10 = a(a(a(0, this.f15818a, str, 1073741824), this.f15819b, str2, 2), this.f15821d, str3, 4);
        if (a10 == -1 || !set.containsAll(this.f15820c)) {
            return 0;
        }
        return (this.f15820c.size() * 4) + a10;
    }

    public d b(boolean z10) {
        this.f15828l = z10 ? 1 : 0;
        return this;
    }

    public d c(boolean z10) {
        this.f15829m = z10 ? 1 : 0;
        return this;
    }

    public d d(int i10) {
        this.f15831p = i10;
        return this;
    }

    public d b(int i10) {
        this.f15824h = i10;
        this.f15825i = true;
        return this;
    }

    public d c(int i10) {
        this.f15830n = i10;
        return this;
    }

    public d d(boolean z10) {
        this.f15832q = z10;
        return this;
    }

    public int a() {
        int i10 = this.f15828l;
        if (i10 == -1 && this.f15829m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f15829m == 1 ? 2 : 0);
    }

    public d a(boolean z10) {
        this.f15827k = z10 ? 1 : 0;
        return this;
    }

    public d a(int i10) {
        this.f = i10;
        this.f15823g = true;
        return this;
    }

    public d a(float f) {
        this.o = f;
        return this;
    }

    private static int a(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
