package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final b f2392a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2393b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2394a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f2395b;

        /* renamed from: c, reason: collision with root package name */
        public int f2396c;

        /* renamed from: d, reason: collision with root package name */
        public int f2397d;

        /* renamed from: e, reason: collision with root package name */
        public int f2398e;

        public final boolean a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f2394a;
            int i14 = 2;
            if ((i13 & 7) != 0) {
                int i15 = this.f2397d;
                int i16 = this.f2395b;
                if (i15 > i16) {
                    i12 = 1;
                } else if (i15 == i16) {
                    i12 = 2;
                } else {
                    i12 = 4;
                }
                if (((i12 << 0) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 112) != 0) {
                int i17 = this.f2397d;
                int i18 = this.f2396c;
                if (i17 > i18) {
                    i11 = 1;
                } else if (i17 == i18) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                if (((i11 << 4) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 1792) != 0) {
                int i19 = this.f2398e;
                int i20 = this.f2395b;
                if (i19 > i20) {
                    i10 = 1;
                } else if (i19 == i20) {
                    i10 = 2;
                } else {
                    i10 = 4;
                }
                if (((i10 << 8) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 28672) != 0) {
                int i21 = this.f2398e;
                int i22 = this.f2396c;
                if (i21 > i22) {
                    i14 = 1;
                } else if (i21 != i22) {
                    i14 = 4;
                }
                if ((i13 & (i14 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public z(b bVar) {
        this.f2392a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        b bVar = this.f2392a;
        int b10 = bVar.b();
        int c10 = bVar.c();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View d10 = bVar.d(i10);
            int a10 = bVar.a(d10);
            int e10 = bVar.e(d10);
            a aVar = this.f2393b;
            aVar.f2395b = b10;
            aVar.f2396c = c10;
            aVar.f2397d = a10;
            aVar.f2398e = e10;
            if (i12 != 0) {
                aVar.f2394a = i12 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i13 != 0) {
                aVar.f2394a = i13 | 0;
                if (aVar.a()) {
                    view = d10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f2392a;
        int b10 = bVar.b();
        int c10 = bVar.c();
        int a10 = bVar.a(view);
        int e10 = bVar.e(view);
        a aVar = this.f2393b;
        aVar.f2395b = b10;
        aVar.f2396c = c10;
        aVar.f2397d = a10;
        aVar.f2398e = e10;
        aVar.f2394a = 24579 | 0;
        return aVar.a();
    }
}
