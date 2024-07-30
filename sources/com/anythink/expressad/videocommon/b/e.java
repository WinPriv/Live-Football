package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12353a = "DownLoadManager";

    /* renamed from: b, reason: collision with root package name */
    private static e f12354b;

    /* renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f12355c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12356d = false;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, n> f12357e = new ConcurrentHashMap<>();
    private Map<String, List<Map<String, c>>> f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, List<com.anythink.expressad.foundation.d.c>> f12358g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, List<c>> f12359h;

    private e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f12355c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static e a() {
        if (f12354b == null) {
            synchronized (e.class) {
                if (f12354b == null) {
                    f12354b = new e();
                }
            }
        }
        return f12354b;
    }

    private List<Map<String, c>> e(String str) {
        Map<String, List<Map<String, c>>> map = this.f;
        if (map != null && map.containsKey(str)) {
            return this.f.get(str);
        }
        return null;
    }

    private void f(String str) {
        n c10 = c(str);
        if (c10 != null) {
            c10.d();
        }
    }

    public final List<c> b(String str) {
        Map<String, List<c>> map = this.f12359h;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f12359h.get(str);
    }

    public final n c(String str) {
        ConcurrentHashMap<String, n> concurrentHashMap = this.f12357e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f12357e.get(str);
    }

    public final void d(String str) {
        n c10 = c(str);
        if (c10 != null) {
            c10.a();
        }
    }

    private c b(int i10, String str, boolean z10) {
        n c10 = c(str);
        if (c10 != null) {
            return c10.b(i10, z10);
        }
        return null;
    }

    private void d() {
        ConcurrentHashMap<String, n> concurrentHashMap = this.f12357e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, n>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                n value = it.next().getValue();
                if (value != null) {
                    value.b();
                }
            }
        }
    }

    public final void c() {
        ConcurrentHashMap<String, n> concurrentHashMap = this.f12357e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, n> entry : concurrentHashMap.entrySet()) {
                n value = entry.getValue();
                String key = entry.getKey();
                try {
                    com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), key);
                    if (a10 != null) {
                        if (a10.F() == 2) {
                            value.c();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e10) {
                    com.anythink.expressad.foundation.h.o.d(f12353a, e10.getMessage());
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            com.anythink.expressad.d.b.a();
                            com.anythink.expressad.d.c c10 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), key);
                            if (c10 == null) {
                                c10 = com.anythink.expressad.d.c.d(key);
                            }
                            if (c10.m() == 2) {
                                value.c();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e11) {
                        com.anythink.expressad.foundation.h.o.d(f12353a, e11.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0179, code lost:
    
        if (r11.size() > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x017e, code lost:
    
        r11 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0180, code lost:
    
        if (r11 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0182, code lost:
    
        r8.f = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0195, code lost:
    
        r11 = r8.f12359h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0197, code lost:
    
        if (r11 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0199, code lost:
    
        r8.f12359h = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ac, code lost:
    
        r11 = r8.f12358g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ae, code lost:
    
        if (r11 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b0, code lost:
    
        r8.f12358g = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c3, code lost:
    
        if (r10 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c9, code lost:
    
        if (r10.size() <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01cb, code lost:
    
        r11 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e2, code lost:
    
        if (r10.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01e4, code lost:
    
        r14 = r10.next();
        r1 = new java.util.concurrent.ConcurrentHashMap();
        r2 = r14.n();
        r1.put(r2.aZ() + r2.S() + r2.B(), r14);
        r11.add(r1);
        r12.add(r2);
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x021e, code lost:
    
        r8.f.put(r9, r11);
        r8.f12358g.put(r9, r12);
        r8.f12359h.put(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01bc, code lost:
    
        if (r11.containsKey(r9) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01be, code lost:
    
        r8.f12358g.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01a5, code lost:
    
        if (r11.containsKey(r9) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a7, code lost:
    
        r8.f12359h.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x018e, code lost:
    
        if (r11.containsKey(r9) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0190, code lost:
    
        r8.f.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0117, code lost:
    
        if (r13.size() >= r11) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r9, boolean r10, int r11, boolean r12, int r13, java.util.List<com.anythink.expressad.foundation.d.c> r14) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.b.e.b(java.lang.String, boolean, int, boolean, int, java.util.List):boolean");
    }

    public final c a(String str, String str2) {
        n c10 = c(str);
        if (c10 != null) {
            return c10.a(str2);
        }
        return null;
    }

    public final List<com.anythink.expressad.foundation.d.c> a(String str) {
        Map<String, List<com.anythink.expressad.foundation.d.c>> map = this.f12358g;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f12358g.get(str);
    }

    public final boolean a(int i10, String str, boolean z10) {
        try {
            n c10 = c(str);
            if (c10 != null) {
                return c10.a(i10, z10) != null;
            }
            return false;
        } catch (Exception e10) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean a(String str, boolean z10, int i10, boolean z11, int i11, List<com.anythink.expressad.foundation.d.c> list) {
        return b(str, z10, i10, z11, i11, list);
    }

    public final n a(String str, List<com.anythink.expressad.foundation.d.c> list, int i10, com.anythink.expressad.videocommon.d.b bVar) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        if (this.f12357e.containsKey(str)) {
            n nVar = this.f12357e.get(str);
            if (i10 != 94 && i10 != 287) {
                nVar.a(bVar);
            } else {
                nVar.a(list.get(0).Z(), bVar);
            }
            nVar.a(list);
            return nVar;
        }
        n nVar2 = new n(list, this.f12355c, str, i10);
        if (bVar != null) {
            nVar2.a(bVar);
        }
        this.f12357e.put(str, nVar2);
        return nVar2;
    }

    private n a(String str, com.anythink.expressad.foundation.d.c cVar, int i10, com.anythink.expressad.videocommon.d.b bVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return null;
        }
        if (this.f12357e.containsKey(str)) {
            n nVar = this.f12357e.get(str);
            if (i10 != 94 && i10 != 287) {
                nVar.a(bVar);
            } else {
                nVar.a(cVar.Z(), bVar);
            }
            nVar.a(cVar);
            return nVar;
        }
        n nVar2 = new n(cVar, this.f12355c, str, i10);
        if (bVar != null) {
            nVar2.a(bVar);
        }
        this.f12357e.put(str, nVar2);
        return nVar2;
    }

    public final void a(boolean z10) {
        if (z10) {
            if (this.f12356d) {
                return;
            }
        } else {
            this.f12356d = false;
        }
        ConcurrentHashMap<String, n> concurrentHashMap = this.f12357e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, n>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    private static void a(n nVar, String str) {
        try {
            com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), str);
            if (a10 == null) {
                return;
            }
            if (a10.F() == 2) {
                nVar.c();
            } else {
                nVar.a();
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(f12353a, e10.getMessage());
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.c c10 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), str);
                if (c10 == null) {
                    c10 = com.anythink.expressad.d.c.d(str);
                }
                if (c10.m() == 2) {
                    nVar.c();
                } else {
                    nVar.a();
                }
            } catch (Exception e11) {
                com.anythink.expressad.foundation.h.o.d(f12353a, e11.getMessage());
            }
        }
    }

    private void b(String str, String str2) {
        n c10 = c(str);
        if (c10 != null) {
            try {
                c10.b(str2);
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        this.f12356d = false;
        ConcurrentHashMap<String, n> concurrentHashMap = this.f12357e;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, n>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                n value = it.next().getValue();
                if (value != null) {
                    value.c();
                }
            }
        }
    }
}
