package androidx.fragment.app;

import androidx.lifecycle.i;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: b, reason: collision with root package name */
    public int f1891b;

    /* renamed from: c, reason: collision with root package name */
    public int f1892c;

    /* renamed from: d, reason: collision with root package name */
    public int f1893d;

    /* renamed from: e, reason: collision with root package name */
    public int f1894e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1895g;

    /* renamed from: h, reason: collision with root package name */
    public String f1896h;

    /* renamed from: i, reason: collision with root package name */
    public int f1897i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1898j;

    /* renamed from: k, reason: collision with root package name */
    public int f1899k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1900l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<String> f1901m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f1902n;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f1890a = new ArrayList<>();
    public boolean o = false;

    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1903a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f1904b;

        /* renamed from: c, reason: collision with root package name */
        public int f1905c;

        /* renamed from: d, reason: collision with root package name */
        public int f1906d;

        /* renamed from: e, reason: collision with root package name */
        public int f1907e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public i.c f1908g;

        /* renamed from: h, reason: collision with root package name */
        public i.c f1909h;

        public a() {
        }

        public a(Fragment fragment, int i10) {
            this.f1903a = i10;
            this.f1904b = fragment;
            i.c cVar = i.c.RESUMED;
            this.f1908g = cVar;
            this.f1909h = cVar;
        }

        public a(Fragment fragment, i.c cVar) {
            this.f1903a = 10;
            this.f1904b = fragment;
            this.f1908g = fragment.mMaxState;
            this.f1909h = cVar;
        }
    }

    public final void b(a aVar) {
        this.f1890a.add(aVar);
        aVar.f1905c = this.f1891b;
        aVar.f1906d = this.f1892c;
        aVar.f1907e = this.f1893d;
        aVar.f = this.f1894e;
    }

    public abstract void c(int i10, Fragment fragment, String str, int i11);
}
