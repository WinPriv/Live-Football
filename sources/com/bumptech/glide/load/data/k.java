package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import h3.u;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final u f19775a;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final b3.b f19776a;

        public a(b3.b bVar) {
            this.f19776a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f19776a);
        }
    }

    public k(InputStream inputStream, b3.b bVar) {
        u uVar = new u(inputStream, bVar);
        this.f19775a = uVar;
        uVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public final InputStream a() throws IOException {
        u uVar = this.f19775a;
        uVar.reset();
        return uVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        this.f19775a.release();
    }
}
