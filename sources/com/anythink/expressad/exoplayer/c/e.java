package com.anythink.expressad.exoplayer.c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends com.anythink.expressad.exoplayer.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7590a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7591b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7592c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final b f7593d = new b();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f7594e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7595g;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public e(int i10) {
        this.f7595g = i10;
    }

    public static e e() {
        return new e(0);
    }

    @Override // com.anythink.expressad.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f7594e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i10) {
        ByteBuffer byteBuffer = this.f7594e;
        if (byteBuffer == null) {
            this.f7594e = e(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f7594e.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            return;
        }
        ByteBuffer e10 = e(i11);
        if (position > 0) {
            this.f7594e.position(0);
            this.f7594e.limit(position);
            e10.put(this.f7594e);
        }
        this.f7594e = e10;
    }

    public final boolean f() {
        if (this.f7594e == null && this.f7595g == 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return c(1073741824);
    }

    public final void h() {
        this.f7594e.flip();
    }

    private ByteBuffer e(int i10) {
        int i11 = this.f7595g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f7594e;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }
}
