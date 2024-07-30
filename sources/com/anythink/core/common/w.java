package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.e.ai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static volatile w f6538a;

    /* renamed from: c, reason: collision with root package name */
    private final String f6540c = "Waterfall_Final";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f6539b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f6541a;

        /* renamed from: b, reason: collision with root package name */
        ConcurrentHashMap<String, C0086a> f6542b = new ConcurrentHashMap<>();

        /* renamed from: com.anythink.core.common.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0086a {

            /* renamed from: a, reason: collision with root package name */
            com.anythink.core.c.d f6544a;

            /* renamed from: b, reason: collision with root package name */
            CopyOnWriteArrayList<ai> f6545b;

            /* renamed from: c, reason: collision with root package name */
            boolean f6546c;

            public C0086a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public synchronized void b() {
                if (this.f6546c) {
                    return;
                }
                this.f6546c = true;
            }

            private boolean c() {
                return this.f6546c;
            }

            private List<ai> a() {
                return this.f6545b;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public synchronized void a(ai aiVar) {
                com.anythink.core.common.k.g.a((List<ai>) this.f6545b, aiVar, true);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public synchronized void a(List<ai> list) {
                CopyOnWriteArrayList<ai> copyOnWriteArrayList = this.f6545b;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    this.f6545b.removeAll(list);
                }
            }
        }

        public a() {
        }

        private boolean b(String str) {
            C0086a c0086a = this.f6542b.get(str);
            if (c0086a != null) {
                return c0086a.f6546c;
            }
            return false;
        }

        private void c(String str) {
            C0086a c0086a = this.f6542b.get(str);
            if (c0086a != null) {
                c0086a.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void d(String str) {
            Iterator<Map.Entry<String, C0086a>> it = this.f6542b.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (key != null) {
                    String obj = key.toString();
                    if (this.f6542b.get(obj).f6546c && !TextUtils.equals(str, obj)) {
                        it.remove();
                    }
                }
            }
        }

        private void a(String str, com.anythink.core.c.d dVar, List<ai> list) {
            C0086a c0086a = new C0086a();
            c0086a.f6544a = dVar;
            CopyOnWriteArrayList<ai> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.addAll(list);
            c0086a.f6545b = copyOnWriteArrayList;
            this.f6542b.put(str, c0086a);
        }

        public static /* synthetic */ void b(a aVar, String str) {
            C0086a c0086a = aVar.f6542b.get(str);
            if (c0086a != null) {
                c0086a.b();
            }
        }

        public static /* synthetic */ List c(a aVar, String str) {
            C0086a c0086a = aVar.f6542b.get(str);
            if (c0086a != null) {
                return c0086a.f6545b;
            }
            return null;
        }

        private List<ai> a(String str) {
            C0086a c0086a = this.f6542b.get(str);
            if (c0086a != null) {
                return c0086a.f6545b;
            }
            return null;
        }

        private void a(String str, ai aiVar) {
            C0086a c0086a = this.f6542b.get(str);
            if (c0086a != null) {
                c0086a.a(aiVar);
            }
        }

        private static /* synthetic */ boolean d(a aVar, String str) {
            C0086a c0086a = aVar.f6542b.get(str);
            if (c0086a != null) {
                return c0086a.f6546c;
            }
            return false;
        }

        private void a(String str, List<ai> list) {
            C0086a c0086a = this.f6542b.get(str);
            if (c0086a != null) {
                c0086a.a(list);
            }
        }

        private static /* synthetic */ void a(a aVar, String str, com.anythink.core.c.d dVar, List list) {
            C0086a c0086a = new C0086a();
            c0086a.f6544a = dVar;
            CopyOnWriteArrayList<ai> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.addAll(list);
            c0086a.f6545b = copyOnWriteArrayList;
            aVar.f6542b.put(str, c0086a);
        }

        private static /* synthetic */ void a(a aVar, String str, ai aiVar) {
            C0086a c0086a = aVar.f6542b.get(str);
            if (c0086a != null) {
                c0086a.a(aiVar);
            }
        }

        public static /* synthetic */ void a(a aVar, String str, List list) {
            C0086a c0086a = aVar.f6542b.get(str);
            if (c0086a != null) {
                c0086a.a((List<ai>) list);
            }
        }
    }

    private w() {
    }

    public static w a() {
        if (f6538a == null) {
            synchronized (w.class) {
                if (f6538a == null) {
                    f6538a = new w();
                }
            }
        }
        return f6538a;
    }

    public final synchronized void b(String str, String str2, List<ai> list) {
        a aVar = this.f6539b.get(str);
        if (aVar == null) {
            return;
        }
        a.a(aVar, str2, list);
        a(str, str2, list);
    }

    public final List<ai> b(String str, String str2) {
        a aVar = this.f6539b.get(str);
        if (aVar != null) {
            return a.c(aVar, str2);
        }
        return null;
    }

    public final synchronized void a(String str, String str2, com.anythink.core.c.d dVar, List<ai> list) {
        a aVar = this.f6539b.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        a.C0086a c0086a = aVar.f6542b.get(str2);
        boolean z10 = c0086a != null ? c0086a.f6546c : false;
        a.C0086a c0086a2 = new a.C0086a();
        c0086a2.f6544a = dVar;
        CopyOnWriteArrayList<ai> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(list);
        c0086a2.f6545b = copyOnWriteArrayList;
        aVar.f6542b.put(str2, c0086a2);
        aVar.f6541a = str2;
        this.f6539b.put(str, aVar);
        aVar.d(str2);
        if (z10) {
            a.b(aVar, str2);
        }
    }

    public final String b(String str) {
        a aVar = this.f6539b.get(str);
        return aVar != null ? aVar.f6541a : "";
    }

    public final synchronized void a(String str, String str2, List<ai> list) {
        a aVar = this.f6539b.get(str);
        if (aVar == null) {
            return;
        }
        for (ai aiVar : list) {
            a.C0086a c0086a = aVar.f6542b.get(str2);
            if (c0086a != null) {
                c0086a.a(aiVar);
            }
        }
    }

    public final synchronized void a(String str, String str2, ai aiVar) {
        a aVar = this.f6539b.get(str);
        if (aVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(aiVar);
        a.a(aVar, str2, arrayList);
    }

    public final synchronized void a(String str, String str2) {
        a aVar = this.f6539b.get(str);
        if (aVar == null) {
            return;
        }
        a.b(aVar, str2);
    }

    public final List<ai> a(String str) {
        a aVar = this.f6539b.get(str);
        List c10 = aVar != null ? a.c(aVar, aVar.f6541a) : null;
        if (c10 == null) {
            com.anythink.core.c.d a10 = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(str);
            if (a10 != null) {
                return a10.F();
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c10);
        return arrayList;
    }
}
