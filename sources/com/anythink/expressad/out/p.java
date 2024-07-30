package com.anythink.expressad.out;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i10);

        void a(com.anythink.expressad.foundation.d.c cVar, String str);

        void a(j jVar);

        void a(j jVar, String str);

        boolean a();

        void b(j jVar);

        void b(j jVar, String str);

        void c(j jVar);

        void d(j jVar);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private int f10501a;

        /* renamed from: b, reason: collision with root package name */
        private int f10502b;

        private d(int i10, int i11) {
            this.f10501a = i10;
            this.f10502b = i11;
        }

        private int a() {
            return this.f10501a;
        }

        private int b() {
            return this.f10502b;
        }

        private void a(int i10) {
            this.f10501a = i10;
        }

        private void b(int i10) {
            this.f10502b = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface e extends c {
        void b();
    }
}
