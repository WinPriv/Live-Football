package com.anythink.core.b;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends e {
    public g(com.anythink.core.common.e.a aVar) {
        super(aVar);
    }

    @Override // com.anythink.core.b.e
    public final void a(List<JSONObject> list, com.anythink.core.common.g.i iVar) {
        com.anythink.core.b.a.b bVar = new com.anythink.core.b.a.b();
        bVar.f = this.f4607d.f5399n.ar();
        com.anythink.core.b.a.a aVar = new com.anythink.core.b.a.a(this.f4624n, this.f4623m, this.f4622l, list, 1);
        aVar.a(bVar);
        aVar.a(0, iVar);
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.f4607d.f5400p;
    }
}
