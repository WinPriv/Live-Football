package com.anythink.core.common.res;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f6470a;

    /* renamed from: b, reason: collision with root package name */
    private int f6471b;

    /* renamed from: c, reason: collision with root package name */
    private int f6472c;

    /* renamed from: d, reason: collision with root package name */
    private int f6473d;

    /* renamed from: e, reason: collision with root package name */
    private int f6474e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f6475g;

    /* renamed from: h, reason: collision with root package name */
    private int f6476h;

    public c(int i10) {
        if (i10 > 0) {
            this.f6472c = i10;
            this.f6470a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static V b() {
        return null;
    }

    private int c(K k10, V v3) {
        int a10 = a(k10, v3);
        if (a10 >= 0) {
            return a10;
        }
        throw new IllegalStateException("Negative size: " + k10 + ContainerUtils.KEY_VALUE_DELIMITER + v3);
    }

    private synchronized int d() {
        return this.f6472c;
    }

    private synchronized int e() {
        return this.f6475g;
    }

    private synchronized int f() {
        return this.f6476h;
    }

    private synchronized int g() {
        return this.f6474e;
    }

    private synchronized int h() {
        return this.f6473d;
    }

    private synchronized int i() {
        return this.f;
    }

    private synchronized Map<K, V> j() {
        return new LinkedHashMap(this.f6470a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k() {
        /*
            r6 = this;
            java.util.LinkedHashMap<K, V> r0 = r6.f6470a
            monitor-enter(r0)
        L3:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L86
            int r1 = r6.f6471b     // Catch: java.lang.Throwable -> L83
            if (r1 < 0) goto L64
            java.util.LinkedHashMap<K, V> r1 = r6.f6470a     // Catch: java.lang.Throwable -> L83
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L14
            int r1 = r6.f6471b     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L64
        L14:
            int r1 = r6.f6471b     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L1a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            goto L3c
        L1a:
            java.util.LinkedHashMap<K, V> r1 = r6.f6470a     // Catch: java.lang.Throwable -> L83
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L83
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L83
            r2 = 0
            if (r1 <= 0) goto L38
            java.util.LinkedHashMap<K, V> r1 = r6.f6470a     // Catch: java.lang.Throwable -> L83
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L83
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L83
            goto L39
        L38:
            r1 = r2
        L39:
            if (r1 != 0) goto L43
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
        L3c:
            java.util.LinkedHashMap<K, V> r1 = r6.f6470a     // Catch: java.lang.Throwable -> L86
            r1.clear()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return
        L43:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L83
            java.util.LinkedHashMap<K, V> r4 = r6.f6470a     // Catch: java.lang.Throwable -> L83
            r4.remove(r3)     // Catch: java.lang.Throwable -> L83
            int r4 = r6.f6471b     // Catch: java.lang.Throwable -> L83
            int r5 = r6.c(r3, r1)     // Catch: java.lang.Throwable -> L83
            int r4 = r4 - r5
            r6.f6471b = r4     // Catch: java.lang.Throwable -> L83
            int r4 = r6.f     // Catch: java.lang.Throwable -> L83
            r5 = 1
            int r4 = r4 + r5
            r6.f = r4     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            r6.a(r5, r3, r1, r2)     // Catch: java.lang.Throwable -> L86
            goto L3
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r2.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L83
            r2.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = ".sizeOf() is reporting inconsistent results!"
            r2.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L83
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L83
            throw r1     // Catch: java.lang.Throwable -> L83
        L83:
            r1 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.c.k():void");
    }

    public int a(K k10, V v3) {
        return 1;
    }

    public final synchronized String toString() {
        int i10;
        int i11 = this.f6475g;
        int i12 = this.f6476h + i11;
        if (i12 != 0) {
            i10 = (i11 * 100) / i12;
        } else {
            i10 = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f6472c), Integer.valueOf(this.f6475g), Integer.valueOf(this.f6476h), Integer.valueOf(i10));
    }

    public void a(boolean z10, K k10, V v3, V v10) {
    }

    public final V b(K k10, V v3) {
        V put;
        if (k10 != null) {
            synchronized (this) {
                this.f6473d++;
                this.f6471b += c(k10, v3);
                put = this.f6470a.put(k10, v3);
                if (put != null) {
                    this.f6471b -= c(k10, put);
                }
            }
            if (put != null) {
                a(false, k10, put, v3);
            }
            b(this.f6472c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i10) {
        if (i10 > 0) {
            synchronized (this) {
                this.f6472c = i10;
            }
            b(i10);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private synchronized int c() {
        return this.f6471b;
    }

    public final V a(K k10) {
        if (k10 != null) {
            synchronized (this) {
                V v3 = this.f6470a.get(k10);
                if (v3 != null) {
                    this.f6475g++;
                    return v3;
                }
                this.f6476h++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r5.f6471b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results! --> size: " + r5.f6471b + ", map.isEmpty(): " + r5.f6470a.isEmpty());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r0 = r5.f6471b     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            if (r0 < 0) goto L5b
            java.util.LinkedHashMap<K, V> r0 = r5.f6470a     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            if (r0 == 0) goto L11
            int r0 = r5.f6471b     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            if (r0 != 0) goto L5b
        L11:
            int r0 = r5.f6471b     // Catch: java.lang.Throwable -> L90
            if (r0 > r6) goto L17
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            return
        L17:
            java.util.LinkedHashMap<K, V> r0 = r5.f6470a     // Catch: java.lang.Throwable -> L90
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L90
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L90
            r1 = 0
            if (r0 <= 0) goto L35
            java.util.LinkedHashMap<K, V> r0 = r5.f6470a     // Catch: java.lang.Throwable -> L90
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L90
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L90
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 != 0) goto L3a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            return
        L3a:
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L90
            java.util.LinkedHashMap<K, V> r3 = r5.f6470a     // Catch: java.lang.Throwable -> L90
            r3.remove(r2)     // Catch: java.lang.Throwable -> L90
            int r3 = r5.f6471b     // Catch: java.lang.Throwable -> L90
            int r4 = r5.c(r2, r0)     // Catch: java.lang.Throwable -> L90
            int r3 = r3 - r4
            r5.f6471b = r3     // Catch: java.lang.Throwable -> L90
            int r3 = r5.f     // Catch: java.lang.Throwable -> L90
            r4 = 1
            int r3 = r3 + r4
            r5.f = r3     // Catch: java.lang.Throwable -> L90
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            r5.a(r4, r2, r0, r1)
            goto L0
        L5b:
            r6 = 0
            r5.f6471b = r6     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results! --> size: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            int r1 = r5.f6471b     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r1 = ", map.isEmpty(): "
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.util.LinkedHashMap<K, V> r1 = r5.f6470a     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
            throw r6     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L92
        L90:
            r6 = move-exception
            goto L98
        L92:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            return
        L98:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.res.c.b(int):void");
    }

    public final void a() {
        b(-1);
    }

    private V b(K k10) {
        V remove;
        if (k10 != null) {
            synchronized (this) {
                remove = this.f6470a.remove(k10);
                if (remove != null) {
                    this.f6471b -= c(k10, remove);
                }
            }
            if (remove != null) {
                a(false, k10, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }
}
