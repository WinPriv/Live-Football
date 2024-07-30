package com.anythink.expressad.foundation.g.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements e<String, JSONObject> {

    /* renamed from: c, reason: collision with root package name */
    private int f9812c;

    /* renamed from: b, reason: collision with root package name */
    private final int f9811b = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f9810a = new LinkedHashMap<>(0, 0.75f, true);

    private static int c() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 != null) {
            synchronized (this) {
                if (this.f9810a.remove(str2) != null) {
                    this.f9812c--;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f9811b));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        if (str != null) {
            synchronized (this) {
                if (this.f9810a.remove(str) != null) {
                    this.f9812c--;
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final void b() {
        a(-1);
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final JSONObject b(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f9810a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final boolean a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            synchronized (this) {
                this.f9812c++;
                if (this.f9810a.put(str, jSONObject) != null) {
                    this.f9812c--;
                }
            }
            a(this.f9811b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        throw new java.lang.IllegalStateException(com.anythink.expressad.foundation.g.a.d.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f9812c     // Catch: java.lang.Throwable -> L67
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f9810a     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L11
            int r0 = r2.f9812c     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f9812c     // Catch: java.lang.Throwable -> L67
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f9810a     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f9810a     // Catch: java.lang.Throwable -> L67
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L67
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            return
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L67
            r0.getValue()     // Catch: java.lang.Throwable -> L67
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r2.f9810a     // Catch: java.lang.Throwable -> L46
            r0.remove(r1)     // Catch: java.lang.Throwable -> L46
            int r0 = r2.f9812c     // Catch: java.lang.Throwable -> L46
            int r0 = r0 + (-1)
            r2.f9812c = r0     // Catch: java.lang.Throwable -> L46
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.Class<com.anythink.expressad.foundation.g.a.d> r1 = com.anythink.expressad.foundation.g.a.d.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L67
            r0.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L67
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L67
            throw r3     // Catch: java.lang.Throwable -> L67
        L67:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.a.d.a(int):void");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f9810a.keySet());
        }
        return hashSet;
    }
}
