package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ba;
import java.io.IOException;

/* loaded from: classes.dex */
public interface p {

    /* loaded from: classes.dex */
    public static final class a extends o {
        public a(Object obj) {
            super(obj);
        }

        @Override // com.applovin.exoplayer2.h.o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            return new a(super.a(obj));
        }

        public a(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public a(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public a(o oVar) {
            super(oVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onSourceInfoRefreshed(p pVar, ba baVar);
    }

    void a(Handler handler, com.applovin.exoplayer2.d.g gVar);

    void a(Handler handler, q qVar);

    void a(com.applovin.exoplayer2.d.g gVar);

    void a(n nVar);

    void a(b bVar);

    void a(b bVar, com.applovin.exoplayer2.k.aa aaVar);

    void a(q qVar);

    n b(a aVar, com.applovin.exoplayer2.k.b bVar, long j10);

    void b(b bVar);

    void c(b bVar);

    void e() throws IOException;

    com.applovin.exoplayer2.ab g();

    default ba h() {
        return null;
    }

    default boolean i() {
        return true;
    }
}
