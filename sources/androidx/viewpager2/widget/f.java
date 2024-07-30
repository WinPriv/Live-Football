package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.ads.gl;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class f extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    public ViewPager2.e f2572a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f2573b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f2574c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f2575d;

    /* renamed from: e, reason: collision with root package name */
    public int f2576e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final a f2577g;

    /* renamed from: h, reason: collision with root package name */
    public int f2578h;

    /* renamed from: i, reason: collision with root package name */
    public int f2579i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2580j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2581k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2582l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2583m;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2584a;

        /* renamed from: b, reason: collision with root package name */
        public float f2585b;

        /* renamed from: c, reason: collision with root package name */
        public int f2586c;
    }

    public f(ViewPager2 viewPager2) {
        this.f2573b = viewPager2;
        RecyclerView recyclerView = viewPager2.B;
        this.f2574c = recyclerView;
        this.f2575d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f2577g = new a();
        d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        boolean z11;
        ViewPager2.e eVar;
        ViewPager2.e eVar2;
        int i11 = this.f2576e;
        boolean z12 = true;
        if ((i11 != 1 || this.f != 1) && i10 == 1) {
            this.f2583m = false;
            this.f2576e = 1;
            int i12 = this.f2579i;
            if (i12 != -1) {
                this.f2578h = i12;
                this.f2579i = -1;
            } else if (this.f2578h == -1) {
                this.f2578h = this.f2575d.M0();
            }
            c(1);
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && i10 == 2) {
            if (this.f2581k) {
                c(2);
                this.f2580j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        a aVar = this.f2577g;
        if (z11 && i10 == 0) {
            e();
            if (!this.f2581k) {
                int i13 = aVar.f2584a;
                if (i13 != -1 && (eVar2 = this.f2572a) != null) {
                    eVar2.b(gl.Code, i13, 0);
                }
            } else if (aVar.f2586c == 0) {
                int i14 = this.f2578h;
                int i15 = aVar.f2584a;
                if (i14 != i15 && (eVar = this.f2572a) != null) {
                    eVar.c(i15);
                }
            } else {
                z12 = false;
            }
            if (z12) {
                c(0);
                d();
            }
        }
        if (this.f2576e == 2 && i10 == 0 && this.f2582l) {
            e();
            if (aVar.f2586c == 0) {
                int i16 = this.f2579i;
                int i17 = aVar.f2584a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    ViewPager2.e eVar3 = this.f2572a;
                    if (eVar3 != null) {
                        eVar3.c(i17);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == r8) goto L17;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f2581k = r6
            r5.e()
            boolean r0 = r5.f2580j
            r1 = -1
            androidx.viewpager2.widget.f$a r2 = r5.f2577g
            r3 = 0
            if (r0 == 0) goto L46
            r5.f2580j = r3
            if (r8 > 0) goto L2b
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f2573b
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.y
            int r8 = r8.z()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r6
        L2c:
            if (r7 == 0) goto L36
            int r7 = r2.f2586c
            if (r7 == 0) goto L36
            int r7 = r2.f2584a
            int r7 = r7 + r6
            goto L38
        L36:
            int r7 = r2.f2584a
        L38:
            r5.f2579i = r7
            int r8 = r5.f2578h
            if (r8 == r7) goto L56
            androidx.viewpager2.widget.ViewPager2$e r8 = r5.f2572a
            if (r8 == 0) goto L56
            r8.c(r7)
            goto L56
        L46:
            int r7 = r5.f2576e
            if (r7 != 0) goto L56
            int r7 = r2.f2584a
            if (r7 != r1) goto L4f
            r7 = r3
        L4f:
            androidx.viewpager2.widget.ViewPager2$e r8 = r5.f2572a
            if (r8 == 0) goto L56
            r8.c(r7)
        L56:
            int r7 = r2.f2584a
            if (r7 != r1) goto L5b
            r7 = r3
        L5b:
            float r8 = r2.f2585b
            int r0 = r2.f2586c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.f2572a
            if (r4 == 0) goto L66
            r4.b(r8, r7, r0)
        L66:
            int r7 = r2.f2584a
            int r8 = r5.f2579i
            if (r7 == r8) goto L6e
            if (r8 != r1) goto L7c
        L6e:
            int r7 = r2.f2586c
            if (r7 != 0) goto L7c
            int r7 = r5.f
            if (r7 == r6) goto L7c
            r5.c(r3)
            r5.d()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.f.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        if ((this.f2576e == 3 && this.f == 0) || this.f == i10) {
            return;
        }
        this.f = i10;
        ViewPager2.e eVar = this.f2572a;
        if (eVar != null) {
            eVar.a(i10);
        }
    }

    public final void d() {
        this.f2576e = 0;
        this.f = 0;
        a aVar = this.f2577g;
        aVar.f2584a = -1;
        aVar.f2585b = gl.Code;
        aVar.f2586c = 0;
        this.f2578h = -1;
        this.f2579i = -1;
        this.f2580j = false;
        this.f2581k = false;
        this.f2583m = false;
        this.f2582l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011e, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.f.e():void");
    }
}
