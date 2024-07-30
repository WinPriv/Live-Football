package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.b.f;
import com.anythink.expressad.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class u implements f {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7560b;

    /* renamed from: c, reason: collision with root package name */
    private int f7561c;

    /* renamed from: d, reason: collision with root package name */
    private int f7562d;

    /* renamed from: e, reason: collision with root package name */
    private int f7563e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f7564g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f7565h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f7566i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f7567j;

    /* renamed from: k, reason: collision with root package name */
    private int f7568k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7569l;

    public u() {
        ByteBuffer byteBuffer = f.f7351a;
        this.f7565h = byteBuffer;
        this.f7566i = byteBuffer;
        this.f7563e = -1;
        this.f = -1;
        this.f7567j = new byte[0];
    }

    public final void a(int i10, int i11) {
        this.f7561c = i10;
        this.f7562d = i11;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int b() {
        return this.f7563e;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int d() {
        return this.f;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void e() {
        this.f7569l = true;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7566i;
        this.f7566i = f.f7351a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean g() {
        if (this.f7569l && this.f7566i == f.f7351a) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void h() {
        this.f7566i = f.f7351a;
        this.f7569l = false;
        this.f7564g = 0;
        this.f7568k = 0;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void i() {
        h();
        this.f7565h = f.f7351a;
        this.f7563e = -1;
        this.f = -1;
        this.f7567j = new byte[0];
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a(int i10, int i11, int i12) {
        if (i12 == 2) {
            this.f7563e = i11;
            this.f = i10;
            int i13 = this.f7562d;
            this.f7567j = new byte[i13 * i11 * 2];
            this.f7568k = 0;
            int i14 = this.f7561c;
            this.f7564g = i11 * i14 * 2;
            boolean z10 = this.f7560b;
            boolean z11 = (i14 == 0 && i13 == 0) ? false : true;
            this.f7560b = z11;
            return z10 != z11;
        }
        throw new f.a(i10, i11, i12);
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a() {
        return this.f7560b;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int min = Math.min(i10, this.f7564g);
        this.f7564g -= min;
        byteBuffer.position(position + min);
        if (this.f7564g > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f7568k + i11) - this.f7567j.length;
        if (this.f7565h.capacity() < length) {
            this.f7565h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7565h.clear();
        }
        int a10 = af.a(length, 0, this.f7568k);
        this.f7565h.put(this.f7567j, 0, a10);
        int a11 = af.a(length - a10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + a11);
        this.f7565h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - a11;
        int i13 = this.f7568k - a10;
        this.f7568k = i13;
        byte[] bArr = this.f7567j;
        System.arraycopy(bArr, a10, bArr, 0, i13);
        byteBuffer.get(this.f7567j, this.f7568k, i12);
        this.f7568k += i12;
        this.f7565h.flip();
        this.f7566i = this.f7565h;
    }
}
