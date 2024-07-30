package com.anythink.expressad.exoplayer.j.a;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.anythink.expressad.exoplayer.j.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0114a extends IOException {
        public C0114a(String str) {
            super(str);
        }

        public C0114a(Throwable th) {
            super(th);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    e a(String str, long j10);

    NavigableSet<e> a(String str);

    NavigableSet<e> a(String str, b bVar);

    void a();

    void a(e eVar);

    void a(File file);

    void a(String str, k kVar);

    boolean a(String str, long j10, long j11);

    long b(String str);

    long b(String str, long j10, long j11);

    e b(String str, long j10);

    Set<String> b();

    void b(e eVar);

    void b(String str, b bVar);

    long c();

    i c(String str);

    File c(String str, long j10);

    void d(String str, long j10);
}
