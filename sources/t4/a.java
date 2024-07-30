package t4;

import com.anythink.expressad.exoplayer.k.o;
import d6.v;
import java.util.Collections;
import k4.i0;
import k4.z0;
import m4.a;
import p4.w;
import t4.e;

/* compiled from: AudioTagPayloadReader.java */
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f35433e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f35434b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35435c;

    /* renamed from: d, reason: collision with root package name */
    public int f35436d;

    public a(w wVar) {
        super(wVar);
    }

    public final boolean a(d6.w wVar) throws e.a {
        String str;
        if (!this.f35434b) {
            int t10 = wVar.t();
            int i10 = (t10 >> 4) & 15;
            this.f35436d = i10;
            w wVar2 = this.f35454a;
            if (i10 == 2) {
                int i11 = f35433e[(t10 >> 2) & 3];
                i0.a aVar = new i0.a();
                aVar.f30534k = o.f9085t;
                aVar.f30546x = 1;
                aVar.y = i11;
                wVar2.b(aVar.a());
                this.f35435c = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new e.a("Audio format not supported: " + this.f35436d);
                }
            } else {
                if (i10 == 7) {
                    str = o.f9089x;
                } else {
                    str = o.y;
                }
                i0.a aVar2 = new i0.a();
                aVar2.f30534k = str;
                aVar2.f30546x = 1;
                aVar2.y = 8000;
                wVar2.b(aVar2.a());
                this.f35435c = true;
            }
            this.f35434b = true;
        } else {
            wVar.F(1);
        }
        return true;
    }

    public final boolean b(long j10, d6.w wVar) throws z0 {
        int i10 = this.f35436d;
        w wVar2 = this.f35454a;
        if (i10 == 2) {
            int i11 = wVar.f27386c - wVar.f27385b;
            wVar2.f(i11, wVar);
            this.f35454a.c(j10, 1, i11, 0, null);
            return true;
        }
        int t10 = wVar.t();
        if (t10 == 0 && !this.f35435c) {
            int i12 = wVar.f27386c - wVar.f27385b;
            byte[] bArr = new byte[i12];
            wVar.b(bArr, 0, i12);
            a.C0440a c10 = m4.a.c(new v(bArr, i12), false);
            i0.a aVar = new i0.a();
            aVar.f30534k = o.f9083r;
            aVar.f30531h = c10.f32670c;
            aVar.f30546x = c10.f32669b;
            aVar.y = c10.f32668a;
            aVar.f30536m = Collections.singletonList(bArr);
            wVar2.b(new i0(aVar));
            this.f35435c = true;
            return false;
        }
        if (this.f35436d == 10 && t10 != 1) {
            return false;
        }
        int i13 = wVar.f27386c - wVar.f27385b;
        wVar2.f(i13, wVar);
        this.f35454a.c(j10, 1, i13, 0, null);
        return true;
    }
}
