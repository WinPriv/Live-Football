package v4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import d6.w;
import java.io.IOException;

/* compiled from: Sniffer.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f35979a = new w(8);

    /* renamed from: b, reason: collision with root package name */
    public int f35980b;

    public final long a(p4.e eVar) throws IOException {
        w wVar = this.f35979a;
        int i10 = 0;
        eVar.c(wVar.f27384a, 0, 1, false);
        int i11 = wVar.f27384a[0] & DefaultClassResolver.NAME;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        eVar.c(wVar.f27384a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (wVar.f27384a[i10] & DefaultClassResolver.NAME) + (i14 << 8);
        }
        this.f35980b = i13 + 1 + this.f35980b;
        return i14;
    }
}
