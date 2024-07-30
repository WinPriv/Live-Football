package com.applovin.exoplayer2.c;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g extends com.applovin.exoplayer2.c.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f13644a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f13645b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13646c;

    /* renamed from: d, reason: collision with root package name */
    public long f13647d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f13648e;
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13649g;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f13650a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13651b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f13650a = i10;
            this.f13651b = i11;
        }
    }

    public g(int i10) {
        this(i10, 0);
    }

    public static g f() {
        return new g(0);
    }

    @Override // com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f13645b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f13648e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13646c = false;
    }

    public void e(int i10) {
        ByteBuffer byteBuffer = this.f13648e;
        if (byteBuffer != null && byteBuffer.capacity() >= i10) {
            this.f13648e.clear();
        } else {
            this.f13648e = ByteBuffer.allocate(i10);
        }
    }

    public final boolean g() {
        return d(1073741824);
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f13645b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f13648e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public g(int i10, int i11) {
        this.f13644a = new c();
        this.f = i10;
        this.f13649g = i11;
    }

    private ByteBuffer g(int i10) {
        int i11 = this.f;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f13645b;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void f(int i10) {
        int i11 = i10 + this.f13649g;
        ByteBuffer byteBuffer = this.f13645b;
        if (byteBuffer == null) {
            this.f13645b = g(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f13645b = byteBuffer;
            return;
        }
        ByteBuffer g6 = g(i12);
        g6.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g6.put(byteBuffer);
        }
        this.f13645b = g6;
    }
}
