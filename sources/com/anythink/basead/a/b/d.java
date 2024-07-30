package com.anythink.basead.a.b;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3588a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f3589b;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f3590c = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, int i10);

        void a(String str, com.anythink.basead.c.e eVar);
    }

    private d() {
    }

    public static d a() {
        if (f3589b == null) {
            synchronized (d.class) {
                if (f3589b == null) {
                    f3589b = new d();
                }
            }
        }
        return f3589b;
    }

    public final synchronized void b(a aVar) {
        int size = this.f3590c.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (aVar == this.f3590c.get(i10)) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            this.f3590c.remove(i10);
        }
    }

    public final synchronized void a(a aVar) {
        this.f3590c.add(aVar);
    }

    public final void a(String str, int i10) {
        List<a> list = this.f3590c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, i10);
            }
        }
    }

    public final void a(String str, com.anythink.basead.c.e eVar) {
        List<a> list = this.f3590c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(str, eVar);
            }
        }
    }
}
