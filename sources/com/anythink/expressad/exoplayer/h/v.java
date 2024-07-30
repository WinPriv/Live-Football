package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.h.s;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class v extends f<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8540a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final s[] f8541b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<s> f8542c;

    /* renamed from: d, reason: collision with root package name */
    private final h f8543d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.ae f8544e;
    private Object f;

    /* renamed from: g, reason: collision with root package name */
    private int f8545g;

    /* renamed from: h, reason: collision with root package name */
    private a f8546h;

    /* loaded from: classes.dex */
    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8547a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f8548b = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.expressad.exoplayer.h.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0110a {
        }
    }

    private v(s... sVarArr) {
        this(new j(), sVarArr);
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a(com.anythink.expressad.exoplayer.h hVar, boolean z10) {
        super.a(hVar, z10);
        for (int i10 = 0; i10 < this.f8541b.length; i10++) {
            a((v) Integer.valueOf(i10), this.f8541b[i10]);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.s
    public final void b() {
        a aVar = this.f8546h;
        if (aVar == null) {
            super.b();
            return;
        }
        throw aVar;
    }

    private v(h hVar, s... sVarArr) {
        this.f8541b = sVarArr;
        this.f8543d = hVar;
        this.f8542c = new ArrayList<>(Arrays.asList(sVarArr));
        this.f8545g = -1;
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        int length = this.f8541b.length;
        r[] rVarArr = new r[length];
        for (int i10 = 0; i10 < length; i10++) {
            rVarArr[i10] = this.f8541b[i10].a(aVar, bVar);
        }
        return new u(this.f8543d, rVarArr);
    }

    @Override // com.anythink.expressad.exoplayer.h.s
    public final void a(r rVar) {
        u uVar = (u) rVar;
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f8541b;
            if (i10 >= sVarArr.length) {
                return;
            }
            sVarArr[i10].a(uVar.f8533a[i10]);
            i10++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.f, com.anythink.expressad.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8544e = null;
        this.f = null;
        this.f8545g = -1;
        this.f8546h = null;
        this.f8542c.clear();
        Collections.addAll(this.f8542c, this.f8541b);
    }

    private void a(s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f8546h == null) {
            if (this.f8545g == -1) {
                this.f8545g = aeVar.c();
            } else if (aeVar.c() != this.f8545g) {
                aVar = new a();
                this.f8546h = aVar;
            }
            aVar = null;
            this.f8546h = aVar;
        }
        if (this.f8546h != null) {
            return;
        }
        this.f8542c.remove(sVar);
        if (sVar == this.f8541b[0]) {
            this.f8544e = aeVar;
            this.f = obj;
        }
        if (this.f8542c.isEmpty()) {
            a(this.f8544e, this.f);
        }
    }

    private a a(com.anythink.expressad.exoplayer.ae aeVar) {
        if (this.f8545g == -1) {
            this.f8545g = aeVar.c();
            return null;
        }
        if (aeVar.c() != this.f8545g) {
            return new a();
        }
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.h.f
    public final /* synthetic */ void a(Integer num, s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj) {
        a aVar;
        if (this.f8546h == null) {
            if (this.f8545g == -1) {
                this.f8545g = aeVar.c();
            } else if (aeVar.c() != this.f8545g) {
                aVar = new a();
                this.f8546h = aVar;
            }
            aVar = null;
            this.f8546h = aVar;
        }
        if (this.f8546h == null) {
            this.f8542c.remove(sVar);
            if (sVar == this.f8541b[0]) {
                this.f8544e = aeVar;
                this.f = obj;
            }
            if (this.f8542c.isEmpty()) {
                a(this.f8544e, this.f);
            }
        }
    }
}
