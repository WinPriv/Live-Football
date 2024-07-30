package x2;

import a3.l;
import android.util.Log;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f36291b;

    /* renamed from: c, reason: collision with root package name */
    public c f36292c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f36290a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f36293d = 0;

    public final boolean a() {
        if (this.f36292c.f36281b != 0) {
            return true;
        }
        return false;
    }

    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        boolean z13;
        if (this.f36291b != null) {
            if (a()) {
                return this.f36292c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f36292c.f36281b = 1;
            } else {
                this.f36292c.f = f();
                this.f36292c.f36285g = f();
                int c10 = c();
                c cVar = this.f36292c;
                if ((c10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f36286h = z10;
                cVar.f36287i = (int) Math.pow(2.0d, (c10 & 7) + 1);
                this.f36292c.f36288j = c();
                c cVar2 = this.f36292c;
                c();
                cVar2.getClass();
                if (this.f36292c.f36286h && !a()) {
                    c cVar3 = this.f36292c;
                    cVar3.f36280a = e(cVar3.f36287i);
                    c cVar4 = this.f36292c;
                    cVar4.f36289k = cVar4.f36280a[cVar4.f36288j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.f36292c.f36282c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 != 33) {
                        if (c11 != 44) {
                            if (c11 != 59) {
                                this.f36292c.f36281b = 1;
                            } else {
                                z14 = true;
                            }
                        } else {
                            c cVar5 = this.f36292c;
                            if (cVar5.f36283d == null) {
                                cVar5.f36283d = new b();
                            }
                            this.f36292c.f36283d.f36270a = f();
                            this.f36292c.f36283d.f36271b = f();
                            this.f36292c.f36283d.f36272c = f();
                            this.f36292c.f36283d.f36273d = f();
                            int c12 = c();
                            if ((c12 & 128) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c12 & 7) + 1);
                            b bVar = this.f36292c.f36283d;
                            if ((c12 & 64) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar.f36274e = z12;
                            if (z11) {
                                bVar.f36279k = e(pow);
                            } else {
                                bVar.f36279k = null;
                            }
                            this.f36292c.f36283d.f36278j = this.f36291b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.f36292c;
                                cVar6.f36282c++;
                                cVar6.f36284e.add(cVar6.f36283d);
                            }
                        }
                    } else {
                        int c13 = c();
                        if (c13 != 1) {
                            if (c13 != 249) {
                                if (c13 != 254) {
                                    if (c13 != 255) {
                                        g();
                                    } else {
                                        d();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i11 = 0;
                                        while (true) {
                                            bArr = this.f36290a;
                                            if (i11 >= 11) {
                                                break;
                                            }
                                            sb3.append((char) bArr[i11]);
                                            i11++;
                                        }
                                        if (sb3.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b10 = bArr[1];
                                                    byte b11 = bArr[2];
                                                    this.f36292c.getClass();
                                                }
                                                if (this.f36293d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            g();
                                        }
                                    }
                                } else {
                                    g();
                                }
                            } else {
                                this.f36292c.f36283d = new b();
                                c();
                                int c14 = c();
                                b bVar2 = this.f36292c.f36283d;
                                int i12 = (c14 & 28) >> 2;
                                bVar2.f36275g = i12;
                                if (i12 == 0) {
                                    bVar2.f36275g = 1;
                                }
                                if ((c14 & 1) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar2.f = z13;
                                int f = f();
                                if (f < 2) {
                                    f = 10;
                                }
                                b bVar3 = this.f36292c.f36283d;
                                bVar3.f36277i = f * 10;
                                bVar3.f36276h = c();
                                c();
                            }
                        } else {
                            g();
                        }
                    }
                }
                c cVar7 = this.f36292c;
                if (cVar7.f36282c < 0) {
                    cVar7.f36281b = 1;
                }
            }
            return this.f36292c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f36291b.get() & DefaultClassResolver.NAME;
        } catch (Exception unused) {
            this.f36292c.f36281b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f36293d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f36293d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f36291b.get(this.f36290a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder r10 = l.r("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                        r10.append(this.f36293d);
                        Log.d("GifHeaderParser", r10.toString(), e10);
                    }
                    this.f36292c.f36281b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f36291b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & DefaultClassResolver.NAME) << 16) | (-16777216) | ((bArr[i13] & DefaultClassResolver.NAME) << 8) | (bArr[i14] & DefaultClassResolver.NAME);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f36292c.f36281b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f36291b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f36291b.position(Math.min(this.f36291b.position() + c10, this.f36291b.limit()));
        } while (c10 > 0);
    }
}
