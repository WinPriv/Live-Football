package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.exoplayer.b.f;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class p implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f7484b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7485c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7486d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f7487e;
    private ByteBuffer f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7488g;

    public p() {
        ByteBuffer byteBuffer = f.f7351a;
        this.f7487e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a(int i10, int i11, int i12) {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new f.a(i10, i11, i12);
        }
        if (this.f7484b == i10 && this.f7485c == i11 && this.f7486d == i12) {
            return false;
        }
        this.f7484b = i10;
        this.f7485c = i11;
        this.f7486d = i12;
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int b() {
        return this.f7485c;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final int d() {
        return this.f7484b;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void e() {
        this.f7488g = true;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f;
        this.f = f.f7351a;
        return byteBuffer;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean g() {
        if (this.f7488g && this.f == f.f7351a) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void h() {
        this.f = f.f7351a;
        this.f7488g = false;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final void i() {
        h();
        this.f7484b = -1;
        this.f7485c = -1;
        this.f7486d = 0;
        this.f7487e = f.f7351a;
    }

    @Override // com.anythink.expressad.exoplayer.b.f
    public final boolean a() {
        int i10 = this.f7486d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[ADDED_TO_REGION, LOOP:2: B:24:0x0081->B:25:0x0083, LOOP_START, PHI: r0
      0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0041, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.anythink.expressad.exoplayer.b.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f7486d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.f7487e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f7487e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f7487e
            r2.clear()
        L3f:
            int r2 = r7.f7486d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7487e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7487e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7487e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7487e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7487e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7487e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f7487e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f7487e
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.b.p.a(java.nio.ByteBuffer):void");
    }
}
