package y4;

import com.anythink.expressad.exoplayer.k.o;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.g0;
import d6.w;
import j7.j0;
import java.util.ArrayList;
import java.util.Arrays;
import k4.i0;
import k4.z0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p4.z;
import y4.h;

/* compiled from: OpusReader.java */
/* loaded from: classes2.dex */
public final class g extends h {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f36679p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f36680n;

    public static boolean e(w wVar, byte[] bArr) {
        int i10 = wVar.f27386c;
        int i11 = wVar.f27385b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        wVar.b(bArr2, 0, bArr.length);
        wVar.E(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // y4.h
    public final long b(w wVar) {
        byte[] bArr = wVar.f27384a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f36688i * a0.a.N0(b11, b10)) / 1000000;
    }

    @Override // y4.h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(w wVar, long j10, h.a aVar) throws z0 {
        if (e(wVar, o)) {
            byte[] copyOf = Arrays.copyOf(wVar.f27384a, wVar.f27386c);
            int i10 = copyOf[9] & DefaultClassResolver.NAME;
            ArrayList o02 = a0.a.o0(copyOf);
            if (aVar.f36693a != null) {
                return true;
            }
            i0.a aVar2 = new i0.a();
            aVar2.f30534k = o.H;
            aVar2.f30546x = i10;
            aVar2.y = 48000;
            aVar2.f30536m = o02;
            aVar.f36693a = new i0(aVar2);
            return true;
        }
        if (e(wVar, f36679p)) {
            d6.a.e(aVar.f36693a);
            if (this.f36680n) {
                return true;
            }
            this.f36680n = true;
            wVar.F(8);
            Metadata a10 = z.a(j0.D(z.b(wVar, false, false).f34372a));
            if (a10 == null) {
                return true;
            }
            i0 i0Var = aVar.f36693a;
            i0Var.getClass();
            i0.a aVar3 = new i0.a(i0Var);
            Metadata metadata = aVar.f36693a.B;
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f19997s;
                if (entryArr.length != 0) {
                    int i11 = g0.f27302a;
                    Metadata.Entry[] entryArr2 = a10.f19997s;
                    Object[] copyOf2 = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, copyOf2, entryArr2.length, entryArr.length);
                    a10 = new Metadata(a10.f19998t, (Metadata.Entry[]) copyOf2);
                }
            }
            aVar3.f30532i = a10;
            aVar.f36693a = new i0(aVar3);
            return true;
        }
        d6.a.e(aVar.f36693a);
        return false;
    }

    @Override // y4.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f36680n = false;
        }
    }
}
