package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.b.f;
import com.anythink.expressad.exoplayer.k.af;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.gl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class n implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final int f7468b = Float.floatToIntBits(Float.NaN);

    /* renamed from: c, reason: collision with root package name */
    private static final double f7469c = 4.656612875245797E-10d;

    /* renamed from: d, reason: collision with root package name */
    private int f7470d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f7471e = -1;
    private int f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f7472g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f7473h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7474i;

    public n() {
        ByteBuffer byteBuffer = f.f7351a;
        this.f7472g = byteBuffer;
        this.f7473h = byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a(int i10, int i11, int i12) {
        if (af.c(i12)) {
            if (this.f7470d == i10 && this.f7471e == i11 && this.f == i12) {
                return false;
            }
            this.f7470d = i10;
            this.f7471e = i11;
            this.f = i12;
            return true;
        }
        throw new f.a(i10, i11, i12);
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int b() {
        return this.f7471e;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int c() {
        return 4;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int d() {
        return this.f7470d;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void e() {
        this.f7474i = true;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7473h;
        this.f7473h = f.f7351a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean g() {
        if (this.f7474i && this.f7473h == f.f7351a) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void h() {
        this.f7473h = f.f7351a;
        this.f7474i = false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void i() {
        h();
        this.f7470d = -1;
        this.f7471e = -1;
        this.f = 0;
        this.f7472g = f.f7351a;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a() {
        return af.c(this.f);
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        boolean z10 = this.f == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (!z10) {
            i10 = (i10 / 3) * 4;
        }
        if (this.f7472g.capacity() < i10) {
            this.f7472g = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f7472g.clear();
        }
        if (z10) {
            while (position < limit) {
                a((byteBuffer.get(position) & DefaultClassResolver.NAME) | ((byteBuffer.get(position + 1) & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get(position + 2) & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get(position + 3) & DefaultClassResolver.NAME) << 24), this.f7472g);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get(position + 1) & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get(position + 2) & DefaultClassResolver.NAME) << 24), this.f7472g);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f7472g.flip();
        this.f7473h = this.f7472g;
    }

    private static void a(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * f7469c));
        if (floatToIntBits == f7468b) {
            floatToIntBits = Float.floatToIntBits(gl.Code);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
