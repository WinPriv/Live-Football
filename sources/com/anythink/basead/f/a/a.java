package com.anythink.basead.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.a.b.b;
import com.anythink.basead.a.f;
import com.anythink.basead.c.c;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f3965a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3966b;

    private a(Context context) {
        this.f3966b = context.getApplicationContext();
    }

    public static a a(Context context) {
        if (f3965a == null) {
            f3965a = new a(context);
        }
        return f3965a;
    }

    public final String b(String str) {
        d a10 = e.a(this.f3966b).a(str);
        if (a10 == null) {
            return "";
        }
        List<s> E = a10.E();
        ArrayList arrayList = new ArrayList();
        if (E == null || E.size() == 0) {
            return "";
        }
        for (int size = E.size() - 1; size >= 0; size--) {
            s sVar = E.get(size);
            f.a();
            if (!f.a(sVar, a10.X(), a10.D())) {
                E.remove(size);
            } else {
                arrayList.add(b.a(this.f3966b).d(sVar));
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        Collections.sort(arrayList, new Comparator<c>() { // from class: com.anythink.basead.f.a.a.1
            private static int a(c cVar, c cVar2) {
                return Integer.valueOf(cVar.f3738d).compareTo(Integer.valueOf(cVar2.f3738d));
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(c cVar, c cVar2) {
                return Integer.valueOf(cVar.f3738d).compareTo(Integer.valueOf(cVar2.f3738d));
            }
        });
        return ((c) arrayList.get(0)).f3735a;
    }

    public final void a(String str) {
        List<s> E;
        u D;
        d a10 = e.a(this.f3966b).a(str);
        if (a10 == null || (E = a10.E()) == null || (D = a10.D()) == null) {
            return;
        }
        f.a();
        int size = E.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = new j();
            jVar.f5664m = D;
            f.a(str, true, E.get(i10), jVar, null);
        }
    }

    public final s a(String str, String str2) {
        d a10 = e.a(this.f3966b).a(str);
        if (a10 == null) {
            return null;
        }
        return a10.e(str2);
    }

    public final void a(String str, s sVar, j jVar, b.InterfaceC0049b interfaceC0049b) {
        if (a(sVar)) {
            interfaceC0049b.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3751h, com.anythink.basead.c.f.G));
            return;
        }
        if (b.a(this.f3966b).b(sVar)) {
            interfaceC0049b.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3749e, com.anythink.basead.c.f.f3767z));
        } else if (b.a(this.f3966b).c(sVar)) {
            interfaceC0049b.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f, com.anythink.basead.c.f.A));
        } else {
            f.a();
            f.a(str, sVar, jVar, interfaceC0049b);
        }
    }

    private static boolean a(s sVar) {
        List<String> k10 = n.a().k();
        if (k10 == null) {
            return false;
        }
        Iterator<String> it = k10.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(sVar.B(), it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(s sVar, j jVar, boolean z10) {
        if (this.f3966b == null || sVar == null || a(sVar)) {
            return false;
        }
        if (z10) {
            f.a();
            return f.a(sVar, jVar);
        }
        if (!b.a(this.f3966b).b(sVar) && !b.a(this.f3966b).c(sVar)) {
            f.a();
            if (f.a(sVar, jVar)) {
                return true;
            }
        }
        return false;
    }
}
