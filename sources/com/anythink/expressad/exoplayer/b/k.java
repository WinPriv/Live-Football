package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class k implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f7414b;

    /* renamed from: c, reason: collision with root package name */
    private int f7415c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f7416d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7417e;
    private int[] f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f7418g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f7419h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7420i;

    public k() {
        ByteBuffer byteBuffer = f.f7351a;
        this.f7418g = byteBuffer;
        this.f7419h = byteBuffer;
        this.f7414b = -1;
        this.f7415c = -1;
    }

    public final void a(int[] iArr) {
        this.f7416d = iArr;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int b() {
        int[] iArr = this.f;
        if (iArr == null) {
            return this.f7414b;
        }
        return iArr.length;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int d() {
        return this.f7415c;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void e() {
        this.f7420i = true;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7419h;
        this.f7419h = f.f7351a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean g() {
        if (this.f7420i && this.f7419h == f.f7351a) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void h() {
        this.f7419h = f.f7351a;
        this.f7420i = false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void i() {
        h();
        this.f7418g = f.f7351a;
        this.f7414b = -1;
        this.f7415c = -1;
        this.f = null;
        this.f7416d = null;
        this.f7417e = false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a(int i10, int i11, int i12) {
        boolean z10 = !Arrays.equals(this.f7416d, this.f);
        int[] iArr = this.f7416d;
        this.f = iArr;
        if (iArr == null) {
            this.f7417e = false;
            return z10;
        }
        if (i12 == 2) {
            if (!z10 && this.f7415c == i10 && this.f7414b == i11) {
                return false;
            }
            this.f7415c = i10;
            this.f7414b = i11;
            this.f7417e = i11 != iArr.length;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    this.f7417e = (i14 != i13) | this.f7417e;
                    i13++;
                } else {
                    throw new f.a(i10, i11, i12);
                }
            }
        } else {
            throw new f.a(i10, i11, i12);
        }
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a() {
        return this.f7417e;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.expressad.exoplayer.k.a.b(this.f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f7414b * 2)) * this.f.length * 2;
        if (this.f7418g.capacity() < length) {
            this.f7418g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7418g.clear();
        }
        while (position < limit) {
            for (int i10 : this.f) {
                this.f7418g.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f7414b * 2;
        }
        byteBuffer.position(limit);
        this.f7418g.flip();
        this.f7419h = this.f7418g;
    }
}
