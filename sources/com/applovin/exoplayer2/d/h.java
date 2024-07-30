package com.applovin.exoplayer2.d;

import android.os.Looper;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: b */
    public static final h f14035b;

    /* renamed from: c */
    @Deprecated
    public static final h f14036c;

    /* renamed from: com.applovin.exoplayer2.d.h$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements h {
        @Override // com.applovin.exoplayer2.d.h
        public int a(com.applovin.exoplayer2.v vVar) {
            if (vVar.o != null) {
                return 1;
            }
            return 0;
        }

        @Override // com.applovin.exoplayer2.d.h
        public f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
            if (vVar.o == null) {
                return null;
            }
            return new l(new f.a(new t(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new h() { // from class: com.applovin.exoplayer2.d.h.1
            @Override // com.applovin.exoplayer2.d.h
            public int a(com.applovin.exoplayer2.v vVar) {
                if (vVar.o != null) {
                    return 1;
                }
                return 0;
            }

            @Override // com.applovin.exoplayer2.d.h
            public f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
                if (vVar.o == null) {
                    return null;
                }
                return new l(new f.a(new t(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
        };
        f14035b = anonymousClass1;
        f14036c = anonymousClass1;
    }

    int a(com.applovin.exoplayer2.v vVar);

    default void a() {
    }

    f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar);

    default a a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        return a.f14037b;
    }

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: b */
        public static final a f14037b = new com.applovin.exoplayer2.a.l(6);

        static /* synthetic */ void b() {
            a();
        }

        void release();

        static /* synthetic */ void a() {
        }
    }

    default void b() {
    }
}
