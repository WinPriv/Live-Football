package z4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import k4.i0;
import m4.x;
import z4.d0;

/* compiled from: MpegAudioReader.java */
/* loaded from: classes2.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final d6.w f37237a;

    /* renamed from: b, reason: collision with root package name */
    public final x.a f37238b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37239c;

    /* renamed from: d, reason: collision with root package name */
    public p4.w f37240d;

    /* renamed from: e, reason: collision with root package name */
    public String f37241e;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f37242g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37243h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37244i;

    /* renamed from: j, reason: collision with root package name */
    public long f37245j;

    /* renamed from: k, reason: collision with root package name */
    public int f37246k;

    /* renamed from: l, reason: collision with root package name */
    public long f37247l;

    public q(String str) {
        d6.w wVar = new d6.w(4);
        this.f37237a = wVar;
        wVar.f27384a[0] = -1;
        this.f37238b = new x.a();
        this.f37247l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f37239c = str;
    }

    @Override // z4.j
    public final void a() {
        this.f = 0;
        this.f37242g = 0;
        this.f37244i = false;
        this.f37247l = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // z4.j
    public final void c(d6.w wVar) {
        boolean z10;
        boolean z11;
        d6.a.e(this.f37240d);
        while (true) {
            int i10 = wVar.f27386c;
            int i11 = wVar.f27385b;
            int i12 = i10 - i11;
            if (i12 > 0) {
                int i13 = this.f;
                d6.w wVar2 = this.f37237a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            int min = Math.min(i12, this.f37246k - this.f37242g);
                            this.f37240d.f(min, wVar);
                            int i14 = this.f37242g + min;
                            this.f37242g = i14;
                            int i15 = this.f37246k;
                            if (i14 >= i15) {
                                long j10 = this.f37247l;
                                if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                                    this.f37240d.c(j10, 1, i15, 0, null);
                                    this.f37247l += this.f37245j;
                                }
                                this.f37242g = 0;
                                this.f = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i12, 4 - this.f37242g);
                        wVar.b(wVar2.f27384a, this.f37242g, min2);
                        int i16 = this.f37242g + min2;
                        this.f37242g = i16;
                        if (i16 >= 4) {
                            wVar2.E(0);
                            int d10 = wVar2.d();
                            x.a aVar = this.f37238b;
                            if (!aVar.a(d10)) {
                                this.f37242g = 0;
                                this.f = 1;
                            } else {
                                this.f37246k = aVar.f32877c;
                                if (!this.f37243h) {
                                    int i17 = aVar.f32878d;
                                    this.f37245j = (aVar.f32880g * 1000000) / i17;
                                    i0.a aVar2 = new i0.a();
                                    aVar2.f30525a = this.f37241e;
                                    aVar2.f30534k = aVar.f32876b;
                                    aVar2.f30535l = 4096;
                                    aVar2.f30546x = aVar.f32879e;
                                    aVar2.y = i17;
                                    aVar2.f30527c = this.f37239c;
                                    this.f37240d.b(new i0(aVar2));
                                    this.f37243h = true;
                                }
                                wVar2.E(0);
                                this.f37240d.f(4, wVar2);
                                this.f = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = wVar.f27384a;
                    while (true) {
                        if (i11 < i10) {
                            byte b10 = bArr[i11];
                            if ((b10 & DefaultClassResolver.NAME) == 255) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.f37244i && (b10 & 224) == 224) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f37244i = z10;
                            if (z11) {
                                wVar.E(i11 + 1);
                                this.f37244i = false;
                                wVar2.f27384a[1] = bArr[i11];
                                this.f37242g = 2;
                                this.f = 1;
                                break;
                            }
                            i11++;
                        } else {
                            wVar.E(i10);
                            break;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // z4.j
    public final void e(int i10, long j10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f37247l = j10;
        }
    }

    @Override // z4.j
    public final void f(p4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f37241e = dVar.f37051e;
        dVar.b();
        this.f37240d = jVar.s(dVar.f37050d, 1);
    }

    @Override // z4.j
    public final void d() {
    }
}
