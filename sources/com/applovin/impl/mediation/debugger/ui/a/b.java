package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.b.a.e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.d.d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.a f18029a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.b f18030b;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f18031d;

    /* renamed from: e, reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f18032e;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.mediation.debugger.ui.b.a.a {
        private final com.applovin.impl.mediation.debugger.b.a.b o;

        public a(com.applovin.impl.mediation.debugger.b.a.b bVar, String str, boolean z10) {
            super(bVar.a().c(), ((com.applovin.impl.mediation.debugger.ui.d.d) b.this).f18168c);
            SpannedString spannedString;
            this.o = bVar;
            this.f18137d = StringUtils.createSpannedString(bVar.a().b(), -16777216, 18, 1);
            if (!TextUtils.isEmpty(str)) {
                spannedString = new SpannedString(str);
            } else {
                spannedString = null;
            }
            this.f18138e = spannedString;
            this.f18136c = z10;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
        public boolean c() {
            return this.f18136c;
        }

        public com.applovin.impl.mediation.debugger.b.a.b d() {
            return this.o;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.d.c
        public int e() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0211b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public b(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, Context context) {
        super(context);
        this.f18029a = aVar;
        this.f18030b = bVar;
        this.f18031d = b();
        this.f18032e = c();
        this.f = d();
        notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d() {
        boolean z10;
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.f18030b;
        if (bVar != null && bVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.b> b10 = this.f18029a.e().b();
        ArrayList arrayList = new ArrayList(b10.size());
        for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : b10) {
            com.applovin.impl.mediation.debugger.b.a.b bVar3 = this.f18030b;
            if (bVar3 == null || bVar3.a().a().equals(bVar2.a().a())) {
                if (this.f18030b == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new a(bVar2, null, z10));
                for (e eVar : bVar2.d()) {
                    arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a(eVar.a()).b(eVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    private com.applovin.impl.mediation.debugger.ui.d.c f() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("ID").b(this.f18029a.a()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c g() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Ad Format").b(this.f18029a.c()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c h() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Selected Network").b(this.f18030b.a().b()).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
        if (i10 == EnumC0211b.INFO.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("INFO");
        }
        if (i10 == EnumC0211b.BIDDERS.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("BIDDERS");
        }
        return new com.applovin.impl.mediation.debugger.ui.d.e("WATERFALL");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
        if (i10 == EnumC0211b.INFO.ordinal()) {
            return this.f18031d;
        }
        if (i10 == EnumC0211b.BIDDERS.ordinal()) {
            return this.f18032e;
        }
        return this.f;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return EnumC0211b.COUNT.ordinal();
    }

    public String a() {
        return this.f18029a.b();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        if (i10 == EnumC0211b.INFO.ordinal()) {
            return this.f18031d.size();
        }
        if (i10 == EnumC0211b.BIDDERS.ordinal()) {
            return this.f18032e.size();
        }
        return this.f.size();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(f());
        arrayList.add(g());
        if (this.f18030b != null) {
            arrayList.add(h());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> c() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.f18030b;
        if (bVar != null && !bVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.b> a10 = this.f18029a.e().a();
        ArrayList arrayList = new ArrayList(a10.size());
        for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : a10) {
            com.applovin.impl.mediation.debugger.b.a.b bVar3 = this.f18030b;
            if (bVar3 == null || bVar3.a().a().equals(bVar2.a().a())) {
                arrayList.add(new a(bVar2, bVar2.b() != null ? bVar2.b().a() : "", this.f18030b == null));
            }
        }
        return arrayList;
    }
}
