package com.anythink.nativead.a;

import android.content.Context;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.e.e;
import com.anythink.core.common.f;
import com.anythink.core.common.h;
import com.anythink.core.common.k.s;
import com.anythink.core.common.v;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends f<d> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12594a = "a";

    private a(Context context, String str) {
        super(context, str);
    }

    @Override // com.anythink.core.common.f
    public final String a() {
        return "0";
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(d dVar) {
        d dVar2 = dVar;
        c cVar = new c(dVar2.a());
        cVar.a(dVar2.f6023d);
        return cVar;
    }

    public static a a(Context context, String str) {
        f b10 = v.a().b(str);
        if (b10 == null || !(b10 instanceof a)) {
            b10 = new a(context, str);
            v.a().a(str, b10);
        }
        return (a) b10;
    }

    public final com.anythink.core.common.e.b a(String str, Map<String, Object> map) {
        com.anythink.core.common.e.b a10 = com.anythink.core.common.a.a().a(this.f5764b, this.f5765c);
        if (a10 == null || !(a10.f() instanceof com.anythink.nativead.unitgroup.a) || !(a10.e() instanceof CustomNativeAdapter)) {
            return null;
        }
        BaseAd f = a10.f();
        ATBaseAdAdapter e10 = a10.e();
        e detail = f.getDetail();
        detail.C = str;
        com.anythink.core.common.a.a().a(this.f5765c, detail.x(), a10);
        com.anythink.core.common.a.a();
        com.anythink.core.common.a.b(this.f5765c, e10.getUnitGroupInfo());
        s.a(map, detail);
        return a10;
    }

    public final void a(Context context, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar, Map<String, Object> map) {
        d dVar = new d();
        dVar.a(context);
        dVar.f6024e = bVar;
        dVar.f6023d = 0;
        dVar.f6025g = map;
        super.a(this.f5764b, "0", this.f5765c, (String) dVar, aVar);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static h a2(d dVar) {
        c cVar = new c(dVar.a());
        cVar.a(dVar.f6023d);
        return cVar;
    }
}
