package com.anythink.expressad.exoplayer.i;

import com.anythink.expressad.exoplayer.h.ae;
import com.anythink.expressad.exoplayer.i.f;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final int f8668a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8669b;

    public d(ae aeVar, int i10) {
        this(aeVar, i10, 0, null);
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int b() {
        return 0;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final int c() {
        return this.f8668a;
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final Object d() {
        return this.f8669b;
    }

    public d(ae aeVar, int i10, int i11, Object obj) {
        super(aeVar, i10);
        this.f8668a = i11;
        this.f8669b = obj;
    }

    /* loaded from: classes.dex */
    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f8670a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f8671b;

        public a() {
            this.f8670a = 0;
            this.f8671b = null;
        }

        private d b(ae aeVar, int... iArr) {
            boolean z10 = true;
            if (iArr.length != 1) {
                z10 = false;
            }
            com.anythink.expressad.exoplayer.k.a.a(z10);
            return new d(aeVar, iArr[0], this.f8670a, this.f8671b);
        }

        @Override // com.anythink.expressad.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            boolean z10 = true;
            if (iArr.length != 1) {
                z10 = false;
            }
            com.anythink.expressad.exoplayer.k.a.a(z10);
            return new d(aeVar, iArr[0], this.f8670a, this.f8671b);
        }

        private a(int i10, Object obj) {
            this.f8670a = i10;
            this.f8671b = obj;
        }
    }

    @Override // com.anythink.expressad.exoplayer.i.f
    public final void a(long j10, long j11) {
    }
}
