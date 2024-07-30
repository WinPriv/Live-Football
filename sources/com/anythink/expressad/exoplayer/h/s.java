package com.anythink.expressad.exoplayer.h;

import android.os.Handler;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8484a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8485b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8486c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8487d;

        public a(int i10) {
            this(i10, -1L);
        }

        public final a a(int i10) {
            return this.f8484a == i10 ? this : new a(i10, this.f8485b, this.f8486c, this.f8487d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8484a == aVar.f8484a && this.f8485b == aVar.f8485b && this.f8486c == aVar.f8486c && this.f8487d == aVar.f8487d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((((this.f8484a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f8485b) * 31) + this.f8486c) * 31) + ((int) this.f8487d);
        }

        public a(int i10, long j10) {
            this(i10, -1, -1, j10);
        }

        public a(int i10, int i11, int i12, long j10) {
            this.f8484a = i10;
            this.f8485b = i11;
            this.f8486c = i12;
            this.f8487d = j10;
        }

        public final boolean a() {
            return this.f8485b != -1;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(s sVar, com.anythink.expressad.exoplayer.ae aeVar, Object obj);
    }

    r a(a aVar, com.anythink.expressad.exoplayer.j.b bVar);

    void a(Handler handler, t tVar);

    void a(r rVar);

    void a(b bVar);

    void a(t tVar);

    void a(com.anythink.expressad.exoplayer.h hVar, boolean z10, b bVar);

    void b();
}
