package com.anythink.basead.a.b;

import com.anythink.core.common.a.j;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import com.anythink.core.common.res.a.a;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    final String f3597a = "f";

    /* renamed from: b, reason: collision with root package name */
    private String f3598b;

    /* renamed from: c, reason: collision with root package name */
    private String f3599c;

    /* renamed from: d, reason: collision with root package name */
    private String f3600d;

    /* renamed from: e, reason: collision with root package name */
    private int f3601e;
    private i f;

    /* renamed from: g, reason: collision with root package name */
    private k f3602g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.core.common.res.a.a f3603h;

    public f(String str, final i iVar, k kVar) {
        this.f3598b = iVar.x();
        this.f = iVar;
        this.f3602g = kVar;
        this.f3599c = str;
        this.f3600d = iVar.p();
        this.f3601e = iVar.d();
        com.anythink.core.common.res.a.a a10 = com.anythink.core.common.res.a.c.a().a(this.f3598b);
        this.f3603h = a10;
        a10.a(new com.anythink.core.common.res.a.b(this.f3602g.S(), this.f3602g.U()));
        this.f3603h.a(new a.AbstractC0083a() { // from class: com.anythink.basead.a.b.f.1
            @Override // com.anythink.core.common.res.a.a.AbstractC0083a
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.core.common.res.a.a.AbstractC0083a
            public final boolean a(int i10, long j10, long j11) {
                if (i10 < f.this.f3602g.S()) {
                    return false;
                }
                d.a().a(f.this.f3598b, i10);
                return true;
            }
        });
        this.f3603h.f6420k = new a.b() { // from class: com.anythink.basead.a.b.f.2
            @Override // com.anythink.core.common.res.a.a.b
            public final void a(long j10, long j11, long j12, long j13, long j14) {
                com.anythink.basead.a.b.a(30, iVar, new com.anythink.basead.c.i("", ""));
                com.anythink.core.common.j.c.a(f.this.f3599c, f.this.f3600d, f.this.f3598b, "1", j10, (String) null, j11, j12, f.this.f3601e, j14 - j13);
            }

            @Override // com.anythink.core.common.res.a.a.b
            public final void a(String str2, String str3, long j10, long j11, long j12, long j13) {
                com.anythink.core.common.j.c.a(f.this.f3599c, f.this.f3600d, f.this.f3598b, "0", j10, str3, j11, 0L, f.this.f3601e, j13 - j12);
                d.a().a(f.this.f3598b, com.anythink.basead.c.f.a(str2, str3));
            }
        };
    }

    public final void a() {
        this.f3603h.e();
    }

    public final void b() {
        int b10 = j.a().b(this.f3598b);
        this.f3602g.T();
        if (b10 == 100) {
            return;
        }
        this.f3603h.f();
    }
}
