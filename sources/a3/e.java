package a3;

import a3.h;
import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public final class e implements h, d.a<Object> {
    public File A;

    /* renamed from: s, reason: collision with root package name */
    public final List<y2.e> f106s;

    /* renamed from: t, reason: collision with root package name */
    public final i<?> f107t;

    /* renamed from: u, reason: collision with root package name */
    public final h.a f108u;

    /* renamed from: v, reason: collision with root package name */
    public int f109v = -1;

    /* renamed from: w, reason: collision with root package name */
    public y2.e f110w;

    /* renamed from: x, reason: collision with root package name */
    public List<e3.n<File, ?>> f111x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public volatile n.a<?> f112z;

    public e(List<y2.e> list, i<?> iVar, h.a aVar) {
        this.f106s = list;
        this.f107t = iVar;
        this.f108u = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r8.f112z = null;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r8.y >= r8.f111x.size()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r3 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r3 = r8.f111x;
        r4 = r8.y;
        r8.y = r4 + 1;
        r3 = r3.get(r4);
        r4 = r8.A;
        r5 = r8.f107t;
        r8.f112z = r3.b(r4, r5.f122e, r5.f, r5.f125i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r8.f112z == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8.f107t.c(r8.f112z.f27705c.a()) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r3 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r8.f112z.f27705c.e(r8.f107t.o, r8);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0026, code lost:
    
        r3 = false;
     */
    @Override // a3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r8 = this;
        L0:
            java.util.List<e3.n<java.io.File, ?>> r0 = r8.f111x     // Catch: java.lang.Throwable -> Lb3
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6e
            int r3 = r8.y     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb3
            if (r3 >= r0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L14
            goto L6e
        L14:
            r0 = 0
            r8.f112z = r0     // Catch: java.lang.Throwable -> Lb3
            r0 = r1
        L18:
            if (r0 != 0) goto L6d
            int r3 = r8.y     // Catch: java.lang.Throwable -> Lb3
            java.util.List<e3.n<java.io.File, ?>> r4 = r8.f111x     // Catch: java.lang.Throwable -> Lb3
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lb3
            if (r3 >= r4) goto L26
            r3 = r2
            goto L27
        L26:
            r3 = r1
        L27:
            if (r3 == 0) goto L6d
            java.util.List<e3.n<java.io.File, ?>> r3 = r8.f111x     // Catch: java.lang.Throwable -> Lb3
            int r4 = r8.y     // Catch: java.lang.Throwable -> Lb3
            int r5 = r4 + 1
            r8.y = r5     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lb3
            e3.n r3 = (e3.n) r3     // Catch: java.lang.Throwable -> Lb3
            java.io.File r4 = r8.A     // Catch: java.lang.Throwable -> Lb3
            a3.i<?> r5 = r8.f107t     // Catch: java.lang.Throwable -> Lb3
            int r6 = r5.f122e     // Catch: java.lang.Throwable -> Lb3
            int r7 = r5.f     // Catch: java.lang.Throwable -> Lb3
            y2.g r5 = r5.f125i     // Catch: java.lang.Throwable -> Lb3
            e3.n$a r3 = r3.b(r4, r6, r7, r5)     // Catch: java.lang.Throwable -> Lb3
            r8.f112z = r3     // Catch: java.lang.Throwable -> Lb3
            e3.n$a<?> r3 = r8.f112z     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L18
            a3.i<?> r3 = r8.f107t     // Catch: java.lang.Throwable -> Lb3
            e3.n$a<?> r4 = r8.f112z     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.data.d<Data> r4 = r4.f27705c     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r4 = r4.a()     // Catch: java.lang.Throwable -> Lb3
            a3.v r3 = r3.c(r4)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 == 0) goto L18
            e3.n$a<?> r0 = r8.f112z     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.load.data.d<Data> r0 = r0.f27705c     // Catch: java.lang.Throwable -> Lb3
            a3.i<?> r3 = r8.f107t     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.j r3 = r3.o     // Catch: java.lang.Throwable -> Lb3
            r0.e(r3, r8)     // Catch: java.lang.Throwable -> Lb3
            r0 = r2
            goto L18
        L6d:
            return r0
        L6e:
            int r0 = r8.f109v     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0 + r2
            r8.f109v = r0     // Catch: java.lang.Throwable -> Lb3
            java.util.List<y2.e> r2 = r8.f106s     // Catch: java.lang.Throwable -> Lb3
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb3
            if (r0 < r2) goto L7c
            return r1
        L7c:
            java.util.List<y2.e> r0 = r8.f106s     // Catch: java.lang.Throwable -> Lb3
            int r2 = r8.f109v     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb3
            y2.e r0 = (y2.e) r0     // Catch: java.lang.Throwable -> Lb3
            a3.f r2 = new a3.f     // Catch: java.lang.Throwable -> Lb3
            a3.i<?> r3 = r8.f107t     // Catch: java.lang.Throwable -> Lb3
            y2.e r4 = r3.f130n     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lb3
            a3.j$d r3 = r3.f124h     // Catch: java.lang.Throwable -> Lb3
            a3.o$c r3 = (a3.o.c) r3     // Catch: java.lang.Throwable -> Lb3
            c3.a r3 = r3.a()     // Catch: java.lang.Throwable -> Lb3
            java.io.File r2 = r3.j(r2)     // Catch: java.lang.Throwable -> Lb3
            r8.A = r2     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L0
            r8.f110w = r0     // Catch: java.lang.Throwable -> Lb3
            a3.i<?> r0 = r8.f107t     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.h r0 = r0.f120c     // Catch: java.lang.Throwable -> Lb3
            com.bumptech.glide.k r0 = r0.a()     // Catch: java.lang.Throwable -> Lb3
            java.util.List r0 = r0.e(r2)     // Catch: java.lang.Throwable -> Lb3
            r8.f111x = r0     // Catch: java.lang.Throwable -> Lb3
            r8.y = r1     // Catch: java.lang.Throwable -> Lb3
            goto L0
        Lb3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.e.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f108u.a(this.f110w, exc, this.f112z.f27705c, y2.a.DATA_DISK_CACHE);
    }

    @Override // a3.h
    public final void cancel() {
        n.a<?> aVar = this.f112z;
        if (aVar != null) {
            aVar.f27705c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f108u.c(this.f110w, obj, this.f112z.f27705c, y2.a.DATA_DISK_CACHE, this.f110w);
    }
}
