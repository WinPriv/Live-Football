package p4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import p4.w;

/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f34361a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f34362b;

    /* renamed from: c, reason: collision with root package name */
    public int f34363c;

    /* renamed from: d, reason: collision with root package name */
    public long f34364d;

    /* renamed from: e, reason: collision with root package name */
    public int f34365e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f34366g;

    public final void a(w wVar, w.a aVar) {
        if (this.f34363c > 0) {
            wVar.c(this.f34364d, this.f34365e, this.f, this.f34366g, aVar);
            this.f34363c = 0;
        }
    }

    public final void b(w wVar, long j10, int i10, int i11, int i12, w.a aVar) {
        boolean z10;
        if (this.f34366g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f34362b) {
                return;
            }
            int i13 = this.f34363c;
            int i14 = i13 + 1;
            this.f34363c = i14;
            if (i13 == 0) {
                this.f34364d = j10;
                this.f34365e = i10;
                this.f = 0;
            }
            this.f += i11;
            this.f34366g = i12;
            if (i14 >= 16) {
                a(wVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(i iVar) throws IOException {
        char c10;
        if (this.f34362b) {
            return;
        }
        byte[] bArr = this.f34361a;
        int i10 = 0;
        iVar.j(bArr, 0, 10);
        iVar.h();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & DefaultClassResolver.NAME) == 187) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    c10 = '\t';
                } else {
                    c10 = '\b';
                }
                i10 = 40 << ((bArr[c10] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f34362b = true;
    }
}
