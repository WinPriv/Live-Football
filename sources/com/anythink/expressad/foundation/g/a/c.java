package com.anythink.expressad.foundation.g.a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class c implements e<String, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, Bitmap> f9807a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9808b;

    /* renamed from: c, reason: collision with root package name */
    private int f9809c;

    public c(int i10) {
        if (i10 > 0) {
            this.f9808b = i10;
            this.f9807a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        if (str2 != null) {
            synchronized (this) {
                Bitmap remove = this.f9807a.remove(str2);
                if (remove != null) {
                    this.f9809c -= a(remove);
                }
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f9808b));
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private void b2(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap remove = this.f9807a.remove(str);
                if (remove != null) {
                    this.f9809c -= a(remove);
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Bitmap b(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.f9807a.get(str);
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                return bitmap;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.anythink.expressad.foundation.g.a.e
    public boolean a(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            synchronized (this) {
                this.f9809c += a(bitmap);
                Bitmap put = this.f9807a.put(str, bitmap);
                if (put != null) {
                    this.f9809c -= a(put);
                }
            }
            a(this.f9808b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        throw new java.lang.IllegalStateException(com.anythink.expressad.foundation.g.a.c.class.getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f9809c     // Catch: java.lang.Throwable -> L73
            if (r0 < 0) goto L56
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f9807a     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L11
            int r0 = r3.f9809c     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L56
        L11:
            int r0 = r3.f9809c     // Catch: java.lang.Throwable -> L73
            if (r0 <= r4) goto L54
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f9807a     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L1e
            goto L54
        L1e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f9807a     // Catch: java.lang.Throwable -> L73
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L73
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L73
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            return
        L32:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L73
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L73
            int r0 = a(r0)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f9807a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L52
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L52
            r1.recycle()     // Catch: java.lang.Throwable -> L52
            int r1 = r3.f9809c     // Catch: java.lang.Throwable -> L52
            int r1 = r1 - r0
            r3.f9809c = r1     // Catch: java.lang.Throwable -> L52
        L52:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            goto L0
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L73
            return
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Class<com.anythink.expressad.foundation.g.a.c> r1 = com.anythink.expressad.foundation.g.a.c.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L73
            r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L73
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r4     // Catch: java.lang.Throwable -> L73
        L73:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.a.c.a(int):void");
    }

    @Override // com.anythink.expressad.foundation.g.a.e
    public final Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f9807a.keySet());
        }
        return hashSet;
    }

    private static int a(Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}
