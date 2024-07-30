package com.anythink.expressad.exoplayer.e;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final Constructor<? extends e> f7939a;

    /* renamed from: b, reason: collision with root package name */
    private int f7940b;

    /* renamed from: c, reason: collision with root package name */
    private int f7941c;

    static {
        Constructor<? extends e> constructor;
        try {
            constructor = Class.forName("com.anythink.expressad.exoplayer.ext.flac.FlacExtractor").asSubclass(e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f7939a = constructor;
    }

    private synchronized c a(int i10) {
        this.f7940b = i10;
        return this;
    }

    private synchronized c b(int i10) {
        this.f7941c = i10;
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.e.h
    public final synchronized e[] a() {
        e[] eVarArr;
        Constructor<? extends e> constructor = f7939a;
        eVarArr = new e[constructor == null ? 2 : 3];
        eVarArr[0] = new com.anythink.expressad.exoplayer.e.a.e(this.f7941c);
        eVarArr[1] = new com.anythink.expressad.exoplayer.e.a.g(this.f7940b);
        if (constructor != null) {
            try {
                eVarArr[2] = constructor.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }
        return eVarArr;
    }
}
