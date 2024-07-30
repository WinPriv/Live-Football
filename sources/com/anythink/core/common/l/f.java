package com.anythink.core.common.l;

import android.content.Context;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.al;
import com.anythink.core.common.e.m;
import com.anythink.core.common.e.r;
import com.anythink.core.common.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6312a = "h";

    /* renamed from: b, reason: collision with root package name */
    final int f6313b;

    /* renamed from: c, reason: collision with root package name */
    int f6314c;

    /* renamed from: d, reason: collision with root package name */
    int f6315d;

    /* renamed from: e, reason: collision with root package name */
    long f6316e;

    /* renamed from: m, reason: collision with root package name */
    al f6323m;

    /* renamed from: n, reason: collision with root package name */
    List<ai> f6324n;
    private List<ai> o;

    /* renamed from: i, reason: collision with root package name */
    volatile int f6319i = 0;

    /* renamed from: j, reason: collision with root package name */
    volatile int f6320j = 0;

    /* renamed from: k, reason: collision with root package name */
    volatile int f6321k = 0;

    /* renamed from: l, reason: collision with root package name */
    volatile int f6322l = 0;
    List<ai> f = Collections.synchronizedList(new ArrayList(5));

    /* renamed from: g, reason: collision with root package name */
    List<ai> f6317g = Collections.synchronizedList(new ArrayList(5));

    /* renamed from: h, reason: collision with root package name */
    List<ai> f6318h = Collections.synchronizedList(new ArrayList(2));

    public f(g gVar) {
        this.f6314c = 1;
        this.f.addAll(gVar.f6328d);
        if (this.f6324n == null) {
            this.f6324n = Collections.synchronizedList(new ArrayList());
        }
        this.f6324n.clear();
        this.f6324n.addAll(gVar.f6328d);
        this.f6313b = gVar.f6327c.am();
        this.f6314c = gVar.f6327c.k();
        this.f6315d = gVar.f6327c.aa();
        this.f6316e = gVar.f6327c.m();
        List<ai> b10 = b(gVar.f6328d);
        if (b10 != null) {
            this.f.removeAll(b10);
            this.f6318h.addAll(b10);
        }
        this.o = Collections.synchronizedList(new ArrayList(3));
        this.f6323m = gVar.f6330g;
    }

    private double i() {
        return a(false);
    }

    private double j() {
        return a(true);
    }

    public final List<ai> a() {
        return this.f;
    }

    public final List<ai> b() {
        return this.f6317g;
    }

    public final List<ai> c() {
        return this.f6318h;
    }

    public final int d() {
        return this.f6319i;
    }

    public final int e() {
        return this.f6320j;
    }

    public final int f() {
        return this.f6321k;
    }

    public final al g() {
        return this.f6323m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.List<com.anythink.core.common.e.ai>, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.List<com.anythink.core.common.e.ai>] */
    public final List<ai> h() {
        ?? r02;
        int i10 = this.f6314c;
        if (i10 == 1) {
            r02 = new ArrayList();
            int min = Math.min(this.f6315d, this.f.size());
            for (int i11 = 0; i11 < min; i11++) {
                r02.add(this.f.get(i11));
            }
        } else if (i10 == 2) {
            r02 = b(1);
        } else {
            r02 = 0;
        }
        if (r02 != 0) {
            r02.size();
        }
        if (r02.size() > 0) {
            this.f.removeAll(r02);
        }
        return r02;
    }

    public static String a(List<ai> list) {
        String str = "";
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                str = com.ironsource.adapters.facebook.a.h(str, ",");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(list.get(i10).c());
            str = com.ironsource.adapters.facebook.a.h(str, sb2.toString());
        }
        return str;
    }

    public final List<ai> b(int i10) {
        List<ai> list;
        if (i10 != 2) {
            list = this.f;
        } else {
            list = this.f6318h;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            ai aiVar = list.get(0);
            if (i10 == 2) {
                arrayList.add(aiVar);
            } else {
                boolean z10 = com.anythink.core.common.k.g.a(aiVar) > a(true);
                int i11 = this.f6314c;
                if (i11 == 1) {
                    if ((this.f6320j < this.f6315d ? 1 : 0) != 0 && z10) {
                        arrayList.add(aiVar);
                    }
                } else if (i11 == 2 && this.f6322l == 0 && z10) {
                    double a10 = com.anythink.core.common.k.g.a(aiVar);
                    int size = list.size();
                    while (r3 < size) {
                        ai aiVar2 = list.get(r3);
                        if (com.anythink.core.common.k.g.a(aiVar2) == a10) {
                            arrayList.add(aiVar2);
                        }
                        r3++;
                    }
                    this.f6322l = arrayList.size();
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
        return arrayList;
    }

    public final boolean c(ai aiVar) {
        double d10;
        double a10 = com.anythink.core.common.k.g.a(aiVar);
        double a11 = a(true);
        synchronized (this.f6317g) {
            Iterator<ai> it = this.f6317g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    d10 = 0.0d;
                    break;
                }
                ai next = it.next();
                d10 = com.anythink.core.common.k.g.a(next);
                if (next.j() && d10 > com.anythink.core.common.k.g.a(aiVar)) {
                    break;
                }
            }
        }
        return a10 > Math.max(a11, d10);
    }

    public final void a(int i10, int i11) {
        this.f6319i += i10;
        if (i11 != 2) {
            this.f6320j += i10;
        } else {
            this.f6321k += i10;
        }
    }

    public final void a(int i10) {
        if (this.f6314c == 2 && i10 == 1) {
            this.f6322l--;
        }
    }

    public final void a(ai aiVar) {
        synchronized (this.f6324n) {
            List<ai> list = this.f6324n;
            if (list != null) {
                if (list.size() == 0) {
                    this.f6324n.add(aiVar);
                    a(aiVar, 0, null);
                    return;
                }
                for (int i10 = 0; i10 < this.f6324n.size(); i10++) {
                    ai aiVar2 = this.f6324n.get(i10);
                    if (com.anythink.core.common.k.g.a(aiVar) > com.anythink.core.common.k.g.a(aiVar2)) {
                        this.f6324n.add(i10, aiVar);
                        a(aiVar, i10, aiVar2);
                        return;
                    }
                }
                this.f6324n.add(aiVar);
                a(aiVar, this.f6324n.size() - 1, null);
            }
        }
    }

    private static List<ai> b(List<ai> list) {
        ArrayList arrayList = null;
        for (ai aiVar : list) {
            if (aiVar.l() == 8) {
                if (arrayList == null) {
                    arrayList = new ArrayList(4);
                }
                arrayList.add(aiVar);
            }
        }
        return arrayList;
    }

    public final void b(ai aiVar) {
        synchronized (this.o) {
            if (this.o.size() == 0) {
                this.o.add(aiVar);
            } else {
                double a10 = com.anythink.core.common.k.g.a(aiVar);
                int i10 = 0;
                while (true) {
                    if (i10 >= this.o.size()) {
                        break;
                    }
                    if (a10 > com.anythink.core.common.k.g.a(this.o.get(i10))) {
                        this.o.add(i10, aiVar);
                        break;
                    } else {
                        if (i10 == this.o.size() - 1) {
                            this.o.add(aiVar);
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    private void a(ai aiVar, int i10, ai aiVar2) {
        m N;
        m N2;
        if (aiVar.j() && (N2 = aiVar.N()) != null) {
            if (aiVar2 != null) {
                N2.f5704q = com.anythink.core.common.k.g.a(aiVar2);
            } else {
                N2.f5704q = com.anythink.core.common.k.g.a(aiVar);
            }
        }
        if (i10 > 0) {
            ai aiVar3 = this.f6324n.get(i10 - 1);
            if (!aiVar3.j() || (N = aiVar3.N()) == null) {
                return;
            }
            N.f5704q = com.anythink.core.common.k.g.a(aiVar);
        }
    }

    public final double a(boolean z10) {
        synchronized (this.o) {
            int size = this.o.size();
            if (size == 0) {
                return 0.0d;
            }
            int i10 = this.f6313b - 1;
            int i11 = size - 1;
            if (z10 && i11 < i10) {
                return 0.0d;
            }
            return com.anythink.core.common.k.g.a(this.o.get(Math.min(i10, i11)));
        }
    }

    public final void a(com.anythink.core.common.e.e eVar, ai aiVar) {
        ArrayList arrayList = new ArrayList(5);
        synchronized (this.o) {
            a(arrayList, this.o);
        }
        synchronized (this.f6317g) {
            a(arrayList, this.f6317g);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((ai) it.next(), eVar, aiVar, false);
        }
    }

    public static void a(ai aiVar, com.anythink.core.common.e.e eVar, ai aiVar2, boolean z10) {
        m N;
        if (aiVar2 == null || (N = aiVar.N()) == null) {
            return;
        }
        double a10 = com.anythink.core.common.k.g.a(aiVar2);
        r rVar = new r();
        rVar.f5731a = 2;
        rVar.f5732b = a10;
        rVar.f5735e = eVar;
        rVar.f5733c = aiVar2;
        rVar.f5734d = aiVar;
        N.a(rVar, z10);
    }

    private void a(List<ai> list, List<ai> list2) {
        int af;
        int size = list2.size();
        int size2 = this.o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ai aiVar = list2.get(i10);
            if (aiVar.j() && (af = aiVar.af()) > 0 && af <= size2 && com.anythink.core.common.k.g.a(aiVar) < com.anythink.core.common.k.g.a(this.o.get(af - 1))) {
                list.add(aiVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r4 != 7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.anythink.core.common.e.ai r4, com.anythink.core.common.l.h r5) {
        /*
            int r0 = r4.Z()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L2c
            int r4 = r4.l()
            if (r4 == r2) goto L25
            r3 = 3
            if (r4 == r3) goto L25
            r3 = 6
            if (r4 == r3) goto L1d
            r3 = 7
            if (r4 == r3) goto L25
            goto L2c
        L1d:
            boolean r4 = r5.f6336g
            if (r4 == 0) goto L22
            goto L2d
        L22:
            r5.f6336g = r2
            goto L2c
        L25:
            boolean r4 = r5.f
            if (r4 == 0) goto L2a
            goto L2d
        L2a:
            r5.f = r2
        L2c:
            r1 = r0
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.l.f.a(com.anythink.core.common.e.ai, com.anythink.core.common.l.h):boolean");
    }

    public static void a(Context context, String str, String str2, ai aiVar, ai aiVar2) {
        al.a aVar;
        al.a aVar2 = null;
        if (aiVar != null) {
            al.a aVar3 = new al.a(aiVar);
            aVar = null;
            aVar2 = aVar3;
        } else {
            aVar = aiVar2 != null ? new al.a(aiVar2) : null;
        }
        x.a(context).a(str, str2, aVar2, aVar);
    }

    public static void a(Context context, String str) {
        x.a(context).a(str);
    }
}
