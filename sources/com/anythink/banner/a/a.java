package com.anythink.banner.a;

import android.content.Context;
import com.anythink.core.common.h;
import com.anythink.core.common.v;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends com.anythink.core.common.f<c> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3509a = "Bannera";

    private a(Context context, String str) {
        super(context, str);
    }

    @Override // com.anythink.core.common.f
    public final String a() {
        return "2";
    }

    @Override // com.anythink.core.common.f
    public final /* synthetic */ h a(c cVar) {
        c cVar2 = cVar;
        f fVar = new f(cVar2.a());
        fVar.a(cVar2.f6023d);
        return fVar;
    }

    public static a a(Context context, String str) {
        com.anythink.core.common.f b10 = v.a().b(str);
        if (b10 == null || !(b10 instanceof a)) {
            b10 = new a(context, str);
            v.a().a(str, b10);
        }
        return (a) b10;
    }

    public final void a(Context context, int i10, com.anythink.core.common.b.a aVar, com.anythink.core.common.b.b bVar, Map<String, Object> map) {
        c cVar = new c();
        cVar.f6024e = bVar;
        cVar.a(context);
        cVar.f6023d = i10;
        cVar.f6025g = map;
        super.a(this.f5764b, "2", this.f5765c, (String) cVar, aVar);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static h a2(c cVar) {
        f fVar = new f(cVar.a());
        fVar.a(cVar.f6023d);
        return fVar;
    }
}
