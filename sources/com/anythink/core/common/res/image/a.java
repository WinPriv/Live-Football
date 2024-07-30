package com.anythink.core.common.res.image;

import com.anythink.core.common.b.n;
import com.anythink.core.common.k.f;
import com.anythink.core.common.res.d;
import com.anythink.core.common.res.e;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    e f6492a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0085a f6493b;

    /* renamed from: com.anythink.core.common.res.image.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0085a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public a(e eVar) {
        super(eVar.f);
        this.f6492a = eVar;
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        InterfaceC0085a interfaceC0085a = this.f6493b;
        if (interfaceC0085a != null) {
            interfaceC0085a.a(this.f6492a);
        }
    }

    public final void a(InterfaceC0085a interfaceC0085a) {
        this.f6493b = interfaceC0085a;
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        d a10 = d.a(n.a().g());
        e eVar = this.f6492a;
        return a10.a(eVar.f6491e, f.a(eVar.f), inputStream);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.k.b.b bVar) {
        com.anythink.core.common.k.b.a.a().a(bVar, 5);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        InterfaceC0085a interfaceC0085a = this.f6493b;
        if (interfaceC0085a != null) {
            interfaceC0085a.a(this.f6492a, str2);
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }
}
