package com.anythink.expressad.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h.aa;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends com.anythink.expressad.exoplayer.h.f<e> implements x.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8369a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8370b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8371c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8372d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8373e = 4;
    private static final int f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8374g = 6;

    /* renamed from: h, reason: collision with root package name */
    private final List<e> f8375h;

    /* renamed from: i, reason: collision with root package name */
    private final List<e> f8376i;

    /* renamed from: j, reason: collision with root package name */
    private final e f8377j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<r, e> f8378k;

    /* renamed from: l, reason: collision with root package name */
    private final List<d> f8379l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f8380m;

    /* renamed from: n, reason: collision with root package name */
    private final ae.b f8381n;
    private com.anythink.expressad.exoplayer.h o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8382p;

    /* renamed from: q, reason: collision with root package name */
    private aa f8383q;

    /* renamed from: r, reason: collision with root package name */
    private int f8384r;

    /* renamed from: s, reason: collision with root package name */
    private int f8385s;

    /* loaded from: classes.dex */
    public static final class a extends com.anythink.expressad.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final int f8386b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8387c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f8388d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f8389e;
        private final com.anythink.expressad.exoplayer.ae[] f;

        /* renamed from: g, reason: collision with root package name */
        private final Object[] f8390g;

        /* renamed from: h, reason: collision with root package name */
        private final HashMap<Object, Integer> f8391h;

        public a(Collection<e> collection, int i10, int i11, aa aaVar, boolean z10) {
            super(z10, aaVar);
            this.f8386b = i10;
            this.f8387c = i11;
            int size = collection.size();
            this.f8388d = new int[size];
            this.f8389e = new int[size];
            this.f = new com.anythink.expressad.exoplayer.ae[size];
            this.f8390g = new Object[size];
            this.f8391h = new HashMap<>();
            int i12 = 0;
            for (e eVar : collection) {
                this.f[i12] = eVar.f8399c;
                this.f8388d[i12] = eVar.f;
                this.f8389e[i12] = eVar.f8401e;
                Object[] objArr = this.f8390g;
                Object obj = eVar.f8398b;
                objArr[i12] = obj;
                this.f8391h.put(obj, Integer.valueOf(i12));
                i12++;
            }
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int a(int i10) {
            return com.anythink.expressad.exoplayer.k.af.a(this.f8388d, i10 + 1);
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int b(int i10) {
            return com.anythink.expressad.exoplayer.k.af.a(this.f8389e, i10 + 1);
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final com.anythink.expressad.exoplayer.ae c(int i10) {
            return this.f[i10];
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int d(int i10) {
            return this.f8388d[i10];
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int e(int i10) {
            return this.f8389e[i10];
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final Object f(int i10) {
            return this.f8390g[i10];
        }

        @Override // com.anythink.expressad.exoplayer.h.a
        public final int b(Object obj) {
            Integer num = this.f8391h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int c() {
            return this.f8387c;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int b() {
            return this.f8386b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends p {

        /* renamed from: c, reason: collision with root package name */
        private static final Object f8392c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private static final ae.a f8393d = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private static final c f8394e = new c(0);
        private final Object f;

        public b() {
            this(f8394e, null);
        }

        public final b a(com.anythink.expressad.exoplayer.ae aeVar) {
            Object obj;
            if (this.f == null && aeVar.c() > 0) {
                obj = aeVar.a(0, f8393d, true).f7273b;
            } else {
                obj = this.f;
            }
            return new b(aeVar, obj);
        }

        public final com.anythink.expressad.exoplayer.ae d() {
            return this.f8476b;
        }

        private b(com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
            super(aeVar);
            this.f = obj;
        }

        @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
        public final ae.a a(int i10, ae.a aVar, boolean z10) {
            this.f8476b.a(i10, aVar, z10);
            if (com.anythink.expressad.exoplayer.k.af.a(aVar.f7273b, this.f)) {
                aVar.f7273b = f8392c;
            }
            return aVar;
        }

        @Override // com.anythink.expressad.exoplayer.h.p, com.anythink.expressad.exoplayer.ae
        public final int a(Object obj) {
            com.anythink.expressad.exoplayer.ae aeVar = this.f8476b;
            if (f8392c.equals(obj)) {
                obj = this.f;
            }
            return aeVar.a(obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.anythink.expressad.exoplayer.ae {
        private c() {
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int a(Object obj) {
            return obj == null ? 0 : -1;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int b() {
            return 1;
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final int c() {
            return 1;
        }

        public /* synthetic */ c(byte b10) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final ae.b a(int i10, ae.b bVar, boolean z10, long j10) {
            return bVar.a(null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, false, true, j10 > 0 ? com.anythink.expressad.exoplayer.b.f7291b : 0L, com.anythink.expressad.exoplayer.b.f7291b, 0L);
        }

        @Override // com.anythink.expressad.exoplayer.ae
        public final ae.a a(int i10, ae.a aVar, boolean z10) {
            return aVar.a(null, null, com.anythink.expressad.exoplayer.b.f7291b, 0L);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f8395a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f8396b;

        public d(Runnable runnable) {
            Looper mainLooper;
            this.f8396b = runnable;
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            this.f8395a = new Handler(mainLooper);
        }

        private void a() {
            this.f8395a.post(this.f8396b);
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f8405a;

        /* renamed from: b, reason: collision with root package name */
        public final T f8406b;

        /* renamed from: c, reason: collision with root package name */
        public final d f8407c;

        public f(int i10, T t10, Runnable runnable) {
            d dVar;
            this.f8405a = i10;
            if (runnable != null) {
                dVar = new d(runnable);
            } else {
                dVar = null;
            }
            this.f8407c = dVar;
            this.f8406b = t10;
        }
    }

    public i() {
        this(false, (aa) new aa.a());
    }

    private s b(int i10) {
        return this.f8375h.get(i10).f8397a;
    }

    private void c(int i10) {
        e remove = this.f8376i.remove(i10);
        b bVar = remove.f8399c;
        a(i10, -1, -bVar.b(), -bVar.c());
        remove.f8403h = true;
        if (remove.f8404i.isEmpty()) {
            a((i) remove);
        }
    }

    private int d() {
        return this.f8375h.size();
    }

    private void e() {
        List arrayList;
        this.f8382p = false;
        if (this.f8379l.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(this.f8379l);
        }
        this.f8379l.clear();
        a(new a(this.f8376i, this.f8384r, this.f8385s, this.f8383q, this.f8380m), (Object) null);
        if (!arrayList.isEmpty()) {
            this.o.a((x.b) this).a(6).a(arrayList).i();
        }
    }

    private void f() {
        for (int size = this.f8376i.size() - 1; size >= 0; size--) {
            c(size);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* bridge */ /* synthetic */ int a(e eVar, int i10) {
        return i10 + eVar.f8401e;
    }

    private i(boolean z10) {
        this(z10, new aa.a());
    }

    private void b(int i10, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            a(i10, it.next());
            i10++;
        }
    }

    private int d(int i10) {
        e eVar = this.f8377j;
        eVar.f = i10;
        int binarySearch = Collections.binarySearch(this.f8376i, eVar);
        if (binarySearch < 0) {
            return (-binarySearch) - 2;
        }
        while (binarySearch < this.f8376i.size() - 1) {
            int i11 = binarySearch + 1;
            if (this.f8376i.get(i11).f != i10) {
                break;
            }
            binarySearch = i11;
        }
        return binarySearch;
    }

    private i(boolean z10, aa aaVar) {
        this(z10, aaVar, new s[0]);
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* synthetic */ s.a a(e eVar, s.a aVar) {
        e eVar2 = eVar;
        for (int i10 = 0; i10 < eVar2.f8404i.size(); i10++) {
            if (eVar2.f8404i.get(i10).f8409b.f8487d == aVar.f8487d) {
                return aVar.a(aVar.f8484a + eVar2.f);
            }
        }
        return null;
    }

    private i(s... sVarArr) {
        this(sVarArr, (byte) 0);
    }

    private void b(e eVar, com.anythink.expressad.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f8399c;
            if (bVar.d() == aeVar) {
                return;
            }
            int b10 = aeVar.b() - bVar.b();
            int c10 = aeVar.c() - bVar.c();
            if (b10 != 0 || c10 != 0) {
                a(eVar.f8400d + 1, 0, b10, c10);
            }
            eVar.f8399c = bVar.a(aeVar);
            if (!eVar.f8402g && !aeVar.a()) {
                aeVar.a(0, this.f8381n, false);
                ae.b bVar2 = this.f8381n;
                long j10 = bVar2.f7285j + bVar2.f7283h;
                for (int i10 = 0; i10 < eVar.f8404i.size(); i10++) {
                    l lVar = eVar.f8404i.get(i10);
                    lVar.d(j10);
                    lVar.f();
                }
                eVar.f8402g = true;
            }
            a((d) null);
            return;
        }
        throw new IllegalArgumentException();
    }

    private i(s[] sVarArr, byte b10) {
        this(false, new aa.a(), sVarArr);
    }

    /* loaded from: classes.dex */
    public static final class e implements Comparable<e> {

        /* renamed from: a, reason: collision with root package name */
        public final s f8397a;

        /* renamed from: d, reason: collision with root package name */
        public int f8400d;

        /* renamed from: e, reason: collision with root package name */
        public int f8401e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8402g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8403h;

        /* renamed from: c, reason: collision with root package name */
        public b f8399c = new b();

        /* renamed from: i, reason: collision with root package name */
        public List<l> f8404i = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f8398b = new Object();

        public e(s sVar) {
            this.f8397a = sVar;
        }

        public final void a(int i10, int i11, int i12) {
            this.f8400d = i10;
            this.f8401e = i11;
            this.f = i12;
            this.f8402g = false;
            this.f8403h = false;
            this.f8404i.clear();
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(e eVar) {
            return this.f - eVar.f;
        }

        private int a(e eVar) {
            return this.f - eVar.f;
        }
    }

    private i(boolean z10, aa aaVar, s... sVarArr) {
        for (s sVar : sVarArr) {
            com.anythink.expressad.exoplayer.k.a.a(sVar);
        }
        this.f8383q = aaVar.a() > 0 ? aaVar.d() : aaVar;
        this.f8378k = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        this.f8375h = arrayList;
        this.f8376i = new ArrayList();
        this.f8379l = new ArrayList();
        this.f8377j = new e(null);
        this.f8380m = z10;
        this.f8381n = new ae.b();
        a(arrayList.size(), Arrays.asList(sVarArr), (Runnable) null);
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* synthetic */ void a(e eVar, s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        e eVar2 = eVar;
        if (eVar2 != null) {
            b bVar = eVar2.f8399c;
            if (bVar.d() != aeVar) {
                int b10 = aeVar.b() - bVar.b();
                int c10 = aeVar.c() - bVar.c();
                if (b10 != 0 || c10 != 0) {
                    a(eVar2.f8400d + 1, 0, b10, c10);
                }
                eVar2.f8399c = bVar.a(aeVar);
                if (!eVar2.f8402g && !aeVar.a()) {
                    aeVar.a(0, this.f8381n, false);
                    ae.b bVar2 = this.f8381n;
                    long j10 = bVar2.f7285j + bVar2.f7283h;
                    for (int i10 = 0; i10 < eVar2.f8404i.size(); i10++) {
                        l lVar = eVar2.f8404i.get(i10);
                        lVar.d(j10);
                        lVar.f();
                    }
                    eVar2.f8402g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void c() {
        this.f8375h.clear();
        com.anythink.expressad.exoplayer.h hVar = this.o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a((Object) null).i();
        }
    }

    private void b(int i10, int i11) {
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        int i12 = this.f8376i.get(min).f8401e;
        int i13 = this.f8376i.get(min).f;
        List<e> list = this.f8376i;
        list.add(i11, list.remove(i10));
        while (min <= max) {
            e eVar = this.f8376i.get(min);
            eVar.f8401e = i12;
            eVar.f = i13;
            i12 += eVar.f8399c.b();
            i13 += eVar.f8399c.c();
            min++;
        }
    }

    private void a(s sVar) {
        a(this.f8375h.size(), sVar, (Runnable) null);
    }

    private void a(s sVar, Runnable runnable) {
        a(this.f8375h.size(), sVar, runnable);
    }

    private void a(int i10, s sVar) {
        a(i10, sVar, (Runnable) null);
    }

    private void a(int i10, s sVar, Runnable runnable) {
        com.anythink.expressad.exoplayer.k.a.a(sVar);
        e eVar = new e(sVar);
        this.f8375h.add(i10, eVar);
        com.anythink.expressad.exoplayer.h hVar = this.o;
        if (hVar != null) {
            hVar.a((x.b) this).a(0).a(new f(i10, eVar, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Collection<s> collection) {
        a(this.f8375h.size(), collection, (Runnable) null);
    }

    private void a(Collection<s> collection, Runnable runnable) {
        a(this.f8375h.size(), collection, runnable);
    }

    private void a(int i10, Collection<s> collection) {
        a(i10, collection, (Runnable) null);
    }

    private void a(int i10, Collection<s> collection, Runnable runnable) {
        Iterator<s> it = collection.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.exoplayer.k.a.a(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<s> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next()));
        }
        this.f8375h.addAll(i10, arrayList);
        if (this.o != null && !collection.isEmpty()) {
            this.o.a((x.b) this).a(1).a(new f(i10, arrayList, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i10, Runnable runnable) {
        this.f8375h.remove(i10);
        com.anythink.expressad.exoplayer.h hVar = this.o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i10, null, runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(int i10, int i11, Runnable runnable) {
        if (i10 == i11) {
            return;
        }
        List<e> list = this.f8375h;
        list.add(i11, list.remove(i10));
        com.anythink.expressad.exoplayer.h hVar = this.o;
        if (hVar != null) {
            hVar.a((x.b) this).a(3).a(new f(i10, Integer.valueOf(i11), runnable)).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    private void a(Runnable runnable) {
        this.f8375h.clear();
        com.anythink.expressad.exoplayer.h hVar = this.o;
        if (hVar != null) {
            hVar.a((x.b) this).a(4).a(runnable != null ? new d(runnable) : null).i();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        super.a(hVar, z10);
        this.o = hVar;
        if (this.f8375h.isEmpty()) {
            e();
            return;
        }
        this.f8383q = this.f8383q.a(0, this.f8375h.size());
        b(0, this.f8375h);
        a((d) null);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        int i10;
        int i11 = aVar.f8484a;
        e eVar = this.f8377j;
        eVar.f = i11;
        int binarySearch = Collections.binarySearch(this.f8376i, eVar);
        if (binarySearch < 0) {
            i10 = (-binarySearch) - 2;
        } else {
            while (binarySearch < this.f8376i.size() - 1) {
                int i12 = binarySearch + 1;
                if (this.f8376i.get(i12).f != i11) {
                    break;
                }
                binarySearch = i12;
            }
            i10 = binarySearch;
        }
        e eVar2 = this.f8376i.get(i10);
        l lVar = new l(eVar2.f8397a, aVar.a(aVar.f8484a - eVar2.f), bVar);
        this.f8378k.put(lVar, eVar2);
        eVar2.f8404i.add(lVar);
        if (eVar2.f8402g) {
            lVar.f();
        }
        return lVar;
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        e remove = this.f8378k.remove(rVar);
        ((l) rVar).g();
        remove.f8404i.remove(rVar);
        if (remove.f8404i.isEmpty() && remove.f8403h) {
            a((i) remove);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8376i.clear();
        this.o = null;
        this.f8383q = this.f8383q.d();
        this.f8384r = 0;
        this.f8385s = 0;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static s.a a2(e eVar, s.a aVar) {
        for (int i10 = 0; i10 < eVar.f8404i.size(); i10++) {
            if (eVar.f8404i.get(i10).f8409b.f8487d == aVar.f8487d) {
                return aVar.a(aVar.f8484a + eVar.f);
            }
        }
        return null;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static int a2(e eVar, int i10) {
        return i10 + eVar.f8401e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.exoplayer.x.b
    public final void a(int i10, Object obj) {
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                this.f8383q = this.f8383q.a(fVar.f8405a, 1);
                a(fVar.f8405a, (e) fVar.f8406b);
                a(fVar.f8407c);
                return;
            case 1:
                f fVar2 = (f) obj;
                this.f8383q = this.f8383q.a(fVar2.f8405a, ((Collection) fVar2.f8406b).size());
                b(fVar2.f8405a, (Collection<e>) fVar2.f8406b);
                a(fVar2.f8407c);
                return;
            case 2:
                f fVar3 = (f) obj;
                this.f8383q = this.f8383q.c(fVar3.f8405a);
                c(fVar3.f8405a);
                a(fVar3.f8407c);
                return;
            case 3:
                f fVar4 = (f) obj;
                aa c10 = this.f8383q.c(fVar4.f8405a);
                this.f8383q = c10;
                this.f8383q = c10.a(((Integer) fVar4.f8406b).intValue(), 1);
                int i11 = fVar4.f8405a;
                int intValue = ((Integer) fVar4.f8406b).intValue();
                int min = Math.min(i11, intValue);
                int max = Math.max(i11, intValue);
                int i12 = this.f8376i.get(min).f8401e;
                int i13 = this.f8376i.get(min).f;
                List<e> list = this.f8376i;
                list.add(intValue, list.remove(i11));
                while (min <= max) {
                    e eVar = this.f8376i.get(min);
                    eVar.f8401e = i12;
                    eVar.f = i13;
                    i12 += eVar.f8399c.b();
                    i13 += eVar.f8399c.c();
                    min++;
                }
                a(fVar4.f8407c);
                return;
            case 4:
                for (int size = this.f8376i.size() - 1; size >= 0; size--) {
                    c(size);
                }
                a((d) obj);
                return;
            case 5:
                e();
                return;
            case 6:
                List list2 = (List) obj;
                for (int i14 = 0; i14 < list2.size(); i14++) {
                    d dVar = (d) list2.get(i14);
                    dVar.f8395a.post(dVar.f8396b);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(d dVar) {
        if (!this.f8382p) {
            this.o.a((x.b) this).a(5).i();
            this.f8382p = true;
        }
        if (dVar != null) {
            this.f8379l.add(dVar);
        }
    }

    private void a(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f8376i.get(i10 - 1);
            eVar.a(i10, eVar2.f8399c.b() + eVar2.f8401e, eVar2.f8399c.c() + eVar2.f);
        } else {
            eVar.a(i10, 0, 0);
        }
        a(i10, 1, eVar.f8399c.b(), eVar.f8399c.c());
        this.f8376i.add(i10, eVar);
        a((i) eVar, eVar.f8397a);
    }

    private void a(int i10, int i11, int i12, int i13) {
        this.f8384r += i12;
        this.f8385s += i13;
        while (i10 < this.f8376i.size()) {
            this.f8376i.get(i10).f8400d += i11;
            this.f8376i.get(i10).f8401e += i12;
            this.f8376i.get(i10).f += i13;
            i10++;
        }
    }

    private void a(int i10) {
        this.f8375h.remove(i10);
        com.anythink.expressad.exoplayer.h hVar = this.o;
        if (hVar != null) {
            hVar.a((x.b) this).a(2).a(new f(i10, null, null)).i();
        }
    }

    private void a(int i10, int i11) {
        if (i10 != i11) {
            List<e> list = this.f8375h;
            list.add(i11, list.remove(i10));
            com.anythink.expressad.exoplayer.h hVar = this.o;
            if (hVar != null) {
                hVar.a((x.b) this).a(3).a(new f(i10, Integer.valueOf(i11), null)).i();
            }
        }
    }

    private void a(e eVar, com.anythink.expressad.exoplayer.ae aeVar) {
        if (eVar != null) {
            b bVar = eVar.f8399c;
            if (bVar.d() != aeVar) {
                int b10 = aeVar.b() - bVar.b();
                int c10 = aeVar.c() - bVar.c();
                if (b10 != 0 || c10 != 0) {
                    a(eVar.f8400d + 1, 0, b10, c10);
                }
                eVar.f8399c = bVar.a(aeVar);
                if (!eVar.f8402g && !aeVar.a()) {
                    aeVar.a(0, this.f8381n, false);
                    ae.b bVar2 = this.f8381n;
                    long j10 = bVar2.f7285j + bVar2.f7283h;
                    for (int i10 = 0; i10 < eVar.f8404i.size(); i10++) {
                        l lVar = eVar.f8404i.get(i10);
                        lVar.d(j10);
                        lVar.f();
                    }
                    eVar.f8402g = true;
                }
                a((d) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
