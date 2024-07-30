package com.anythink.core.common.j;

import a3.k;
import a3.l;
import android.content.Context;
import com.anythink.core.common.e.h;
import com.anythink.core.common.g.a.c;
import com.anythink.core.common.g.i;
import com.anythink.core.common.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d extends o<h> {
    private static volatile d f;

    private d(Context context) {
        super(context);
    }

    public static d a(Context context) {
        if (f == null) {
            synchronized (d.class) {
                if (f == null) {
                    f = new d(context);
                }
            }
        }
        return f;
    }

    @Override // com.anythink.core.common.o
    public final void a(final List<h> list) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.j.d.1
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h) it.next()).a().toString());
                }
                com.anythink.core.c.a h10 = l.h(k.e());
                if (h10 != null) {
                    if (h10.u() != 1) {
                        com.anythink.core.common.g.b bVar = new com.anythink.core.common.g.b(((o) d.this).f6362e, h10.u(), arrayList);
                        bVar.p();
                        bVar.a(0, (i) null);
                        return;
                    } else {
                        com.anythink.core.common.g.a.a aVar = new com.anythink.core.common.g.a.a(arrayList);
                        aVar.a(1, h10.t());
                        aVar.a();
                        aVar.a((c.a) null);
                        return;
                    }
                }
                com.anythink.core.common.g.b bVar2 = new com.anythink.core.common.g.b(((o) d.this).f6362e, 0, arrayList);
                bVar2.p();
                bVar2.a(0, (i) null);
            }
        });
    }
}
