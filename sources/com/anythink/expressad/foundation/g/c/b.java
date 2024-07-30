package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9850b = "anythink_template/";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9851c = "anythink_template/res/Movies";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9852d = "anythink_template/res";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9853e = "anythink_template/res/.Anythink_VC";
    private static final String f = "anythink_template/res/.anythink700";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9854g = "anythink_template/res/img";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9855h = "anythink_template/crashinfo";

    /* renamed from: i, reason: collision with root package name */
    private static final String f9856i = "anythink_template/other";

    /* renamed from: j, reason: collision with root package name */
    private static final String f9857j = "anythink_template/res/xml";

    /* renamed from: k, reason: collision with root package name */
    private static final String f9858k = "anythink_template/anythink/config";

    /* renamed from: l, reason: collision with root package name */
    private static final String f9859l = "anythink_template/res/res";

    /* renamed from: m, reason: collision with root package name */
    private static final String f9860m = "anythink_template/res/html";

    public b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        f.a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, f9852d);
        f.a(arrayList, a.AD_MOVIES, f9851c).a(a.ANYTHINK_VC, f9853e);
        e a10 = f.a(arrayList, a.AD_ANYTHINK_700, f);
        a10.a(a.ANYTHINK_700_IMG, f9854g);
        a10.a(a.ANYTHINK_700_XML, f9857j);
        a10.a(a.MBRIDGE_700_CONFIG, f9858k);
        a10.a(a.ANYTHINK_700_RES, f9859l);
        a10.a(a.ANYTHINK_700_HTML, f9860m);
        a aVar = a.ANYTHINK_OTHER;
        f.a(arrayList, aVar, f9856i);
        f.a(arrayList, a.ANYTHINK_CRASH_INFO, f9855h);
        f.a(arrayList, aVar, f9856i);
        return arrayList;
    }
}
