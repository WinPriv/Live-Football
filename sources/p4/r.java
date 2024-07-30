package p4;

import com.applovin.exoplayer2.b0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: Id3Peeker.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final d6.w f34344a = new d6.w(10);

    public final Metadata a(e eVar, b0 b0Var) throws IOException {
        d6.w wVar = this.f34344a;
        Metadata metadata = null;
        int i10 = 0;
        while (true) {
            try {
                eVar.c(wVar.f27384a, 0, 10, false);
                wVar.E(0);
                if (wVar.v() != 4801587) {
                    break;
                }
                wVar.F(3);
                int s10 = wVar.s();
                int i11 = s10 + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(wVar.f27384a, 0, bArr, 0, 10);
                    eVar.c(bArr, 10, s10, false);
                    metadata = new g5.a(b0Var).i(i11, bArr);
                } else {
                    eVar.k(s10, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        eVar.f = 0;
        eVar.k(i10, false);
        return metadata;
    }
}
