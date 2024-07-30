package x2;

import android.graphics.Bitmap;
import android.util.Log;
import com.anythink.expressad.exoplayer.k.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import x2.a;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public int[] f36294a;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0505a f36296c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f36297d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f36298e;
    public short[] f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f36299g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f36300h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f36301i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f36302j;

    /* renamed from: k, reason: collision with root package name */
    public int f36303k;

    /* renamed from: l, reason: collision with root package name */
    public c f36304l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f36305m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36306n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f36307p;

    /* renamed from: q, reason: collision with root package name */
    public int f36308q;

    /* renamed from: r, reason: collision with root package name */
    public int f36309r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f36310s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f36295b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f36311t = Bitmap.Config.ARGB_8888;

    public e(l3.b bVar, c cVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.f36296c = bVar;
        this.f36304l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.o = 0;
                this.f36304l = cVar;
                this.f36303k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f36297d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f36297d.order(ByteOrder.LITTLE_ENDIAN);
                this.f36306n = false;
                Iterator it = cVar.f36284e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f36275g == 3) {
                        this.f36306n = true;
                        break;
                    }
                }
                this.f36307p = highestOneBit;
                int i11 = cVar.f;
                this.f36309r = i11 / highestOneBit;
                int i12 = cVar.f36285g;
                this.f36308q = i12 / highestOneBit;
                int i13 = i11 * i12;
                b3.b bVar2 = ((l3.b) this.f36296c).f32357b;
                if (bVar2 == null) {
                    bArr = new byte[i13];
                } else {
                    bArr = (byte[]) bVar2.c(byte[].class, i13);
                }
                this.f36301i = bArr;
                a.InterfaceC0505a interfaceC0505a = this.f36296c;
                int i14 = this.f36309r * this.f36308q;
                b3.b bVar3 = ((l3.b) interfaceC0505a).f32357b;
                if (bVar3 == null) {
                    iArr = new int[i14];
                } else {
                    iArr = (int[]) bVar3.c(int[].class, i14);
                }
                this.f36302j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    @Override // x2.a
    public final synchronized Bitmap a() {
        b bVar;
        byte[] bArr;
        if (this.f36304l.f36282c <= 0 || this.f36303k < 0) {
            if (Log.isLoggable(com.anythink.core.c.e.f4869a, 3)) {
                Log.d(com.anythink.core.c.e.f4869a, "Unable to decode frame, frameCount=" + this.f36304l.f36282c + ", framePointer=" + this.f36303k);
            }
            this.o = 1;
        }
        int i10 = this.o;
        if (i10 != 1 && i10 != 2) {
            this.o = 0;
            if (this.f36298e == null) {
                b3.b bVar2 = ((l3.b) this.f36296c).f32357b;
                if (bVar2 == null) {
                    bArr = new byte[p.f9095b];
                } else {
                    bArr = (byte[]) bVar2.c(byte[].class, p.f9095b);
                }
                this.f36298e = bArr;
            }
            b bVar3 = (b) this.f36304l.f36284e.get(this.f36303k);
            int i11 = this.f36303k - 1;
            if (i11 >= 0) {
                bVar = (b) this.f36304l.f36284e.get(i11);
            } else {
                bVar = null;
            }
            int[] iArr = bVar3.f36279k;
            if (iArr == null) {
                iArr = this.f36304l.f36280a;
            }
            this.f36294a = iArr;
            if (iArr == null) {
                if (Log.isLoggable(com.anythink.core.c.e.f4869a, 3)) {
                    Log.d(com.anythink.core.c.e.f4869a, "No valid color table found for frame #" + this.f36303k);
                }
                this.o = 1;
                return null;
            }
            if (bVar3.f) {
                System.arraycopy(iArr, 0, this.f36295b, 0, iArr.length);
                int[] iArr2 = this.f36295b;
                this.f36294a = iArr2;
                iArr2[bVar3.f36276h] = 0;
                if (bVar3.f36275g == 2 && this.f36303k == 0) {
                    this.f36310s = Boolean.TRUE;
                }
            }
            return i(bVar3, bVar);
        }
        if (Log.isLoggable(com.anythink.core.c.e.f4869a, 3)) {
            Log.d(com.anythink.core.c.e.f4869a, "Unable to decode frame, status=" + this.o);
        }
        return null;
    }

    @Override // x2.a
    public final void b() {
        this.f36303k = (this.f36303k + 1) % this.f36304l.f36282c;
    }

    @Override // x2.a
    public final int c() {
        return this.f36304l.f36282c;
    }

    @Override // x2.a
    public final void clear() {
        b3.b bVar;
        b3.b bVar2;
        b3.b bVar3;
        this.f36304l = null;
        byte[] bArr = this.f36301i;
        a.InterfaceC0505a interfaceC0505a = this.f36296c;
        if (bArr != null && (bVar3 = ((l3.b) interfaceC0505a).f32357b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f36302j;
        if (iArr != null && (bVar2 = ((l3.b) interfaceC0505a).f32357b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f36305m;
        if (bitmap != null) {
            ((l3.b) interfaceC0505a).f32356a.d(bitmap);
        }
        this.f36305m = null;
        this.f36297d = null;
        this.f36310s = null;
        byte[] bArr2 = this.f36298e;
        if (bArr2 != null && (bVar = ((l3.b) interfaceC0505a).f32357b) != null) {
            bVar.put(bArr2);
        }
    }

    @Override // x2.a
    public final int d() {
        int i10;
        c cVar = this.f36304l;
        int i11 = cVar.f36282c;
        if (i11 > 0 && (i10 = this.f36303k) >= 0) {
            if (i10 >= 0 && i10 < i11) {
                return ((b) cVar.f36284e.get(i10)).f36277i;
            }
            return -1;
        }
        return 0;
    }

    @Override // x2.a
    public final int e() {
        return this.f36303k;
    }

    @Override // x2.a
    public final int f() {
        return (this.f36302j.length * 4) + this.f36297d.limit() + this.f36301i.length;
    }

    public final Bitmap g() {
        Bitmap.Config config;
        Boolean bool = this.f36310s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f36311t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c10 = ((l3.b) this.f36296c).f32356a.c(this.f36309r, this.f36308q, config);
        c10.setHasAlpha(true);
        return c10;
    }

    @Override // x2.a
    public final ByteBuffer getData() {
        return this.f36297d;
    }

    public final void h(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f36311t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r3.f36288j == r36.f36276h) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap i(x2.b r36, x2.b r37) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.e.i(x2.b, x2.b):android.graphics.Bitmap");
    }
}
