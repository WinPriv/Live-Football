package com.applovin.exoplayer2.i.c;

import android.graphics.Bitmap;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final y f15679a;

    /* renamed from: b, reason: collision with root package name */
    private final y f15680b;

    /* renamed from: c, reason: collision with root package name */
    private final C0180a f15681c;

    /* renamed from: d, reason: collision with root package name */
    private Inflater f15682d;

    /* renamed from: com.applovin.exoplayer2.i.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0180a {

        /* renamed from: a, reason: collision with root package name */
        private final y f15683a = new y();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f15684b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f15685c;

        /* renamed from: d, reason: collision with root package name */
        private int f15686d;

        /* renamed from: e, reason: collision with root package name */
        private int f15687e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private int f15688g;

        /* renamed from: h, reason: collision with root package name */
        private int f15689h;

        /* renamed from: i, reason: collision with root package name */
        private int f15690i;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y yVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            yVar.e(2);
            Arrays.fill(this.f15684b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int h10 = yVar.h();
                int h11 = yVar.h();
                int h12 = yVar.h();
                int h13 = yVar.h();
                double d10 = h11;
                double d11 = h12 - 128;
                double d12 = h13 - 128;
                this.f15684b[h10] = (ai.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, p.f9095b) << 8) | (yVar.h() << 24) | (ai.a((int) ((1.402d * d11) + d10), 0, p.f9095b) << 16) | ai.a((int) ((d12 * 1.772d) + d10), 0, p.f9095b);
            }
            this.f15685c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(y yVar, int i10) {
            int m10;
            if (i10 < 4) {
                return;
            }
            yVar.e(3);
            int i11 = i10 - 4;
            if ((yVar.h() & 128) != 0) {
                if (i11 < 7 || (m10 = yVar.m()) < 4) {
                    return;
                }
                this.f15689h = yVar.i();
                this.f15690i = yVar.i();
                this.f15683a.a(m10 - 4);
                i11 -= 7;
            }
            int c10 = this.f15683a.c();
            int b10 = this.f15683a.b();
            if (c10 >= b10 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, b10 - c10);
            yVar.a(this.f15683a.d(), c10, min);
            this.f15683a.d(c10 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(y yVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f15686d = yVar.i();
            this.f15687e = yVar.i();
            yVar.e(11);
            this.f = yVar.i();
            this.f15688g = yVar.i();
        }

        public void b() {
            this.f15686d = 0;
            this.f15687e = 0;
            this.f = 0;
            this.f15688g = 0;
            this.f15689h = 0;
            this.f15690i = 0;
            this.f15683a.a(0);
            this.f15685c = false;
        }

        public com.applovin.exoplayer2.i.a a() {
            int i10;
            if (this.f15686d == 0 || this.f15687e == 0 || this.f15689h == 0 || this.f15690i == 0 || this.f15683a.b() == 0 || this.f15683a.c() != this.f15683a.b() || !this.f15685c) {
                return null;
            }
            this.f15683a.d(0);
            int i11 = this.f15689h * this.f15690i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int h10 = this.f15683a.h();
                if (h10 != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f15684b[h10];
                } else {
                    int h11 = this.f15683a.h();
                    if (h11 != 0) {
                        i10 = ((h11 & 64) == 0 ? h11 & 63 : ((h11 & 63) << 8) | this.f15683a.h()) + i12;
                        Arrays.fill(iArr, i12, i10, (h11 & 128) == 0 ? 0 : this.f15684b[this.f15683a.h()]);
                    }
                }
                i12 = i10;
            }
            return new a.C0175a().a(Bitmap.createBitmap(iArr, this.f15689h, this.f15690i, Bitmap.Config.ARGB_8888)).a(this.f / this.f15686d).b(0).a(this.f15688g / this.f15687e, 0).a(0).b(this.f15689h / this.f15686d).c(this.f15690i / this.f15687e).e();
        }
    }

    public a() {
        super("PgsDecoder");
        this.f15679a = new y();
        this.f15680b = new y();
        this.f15681c = new C0180a();
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) throws h {
        this.f15679a.a(bArr, i10);
        a(this.f15679a);
        this.f15681c.b();
        ArrayList arrayList = new ArrayList();
        while (this.f15679a.a() >= 3) {
            com.applovin.exoplayer2.i.a a10 = a(this.f15679a, this.f15681c);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    private void a(y yVar) {
        if (yVar.a() <= 0 || yVar.f() != 120) {
            return;
        }
        if (this.f15682d == null) {
            this.f15682d = new Inflater();
        }
        if (ai.a(yVar, this.f15680b, this.f15682d)) {
            yVar.a(this.f15680b.d(), this.f15680b.b());
        }
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, C0180a c0180a) {
        int b10 = yVar.b();
        int h10 = yVar.h();
        int i10 = yVar.i();
        int c10 = yVar.c() + i10;
        com.applovin.exoplayer2.i.a aVar = null;
        if (c10 > b10) {
            yVar.d(b10);
            return null;
        }
        if (h10 != 128) {
            switch (h10) {
                case 20:
                    c0180a.a(yVar, i10);
                    break;
                case 21:
                    c0180a.b(yVar, i10);
                    break;
                case 22:
                    c0180a.c(yVar, i10);
                    break;
            }
        } else {
            aVar = c0180a.a();
            c0180a.b();
        }
        yVar.d(c10);
        return aVar;
    }
}
