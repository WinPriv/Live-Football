package e5;

import c5.c;
import c5.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import d6.w;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {
    public static EventMessage i(w wVar) {
        String n10 = wVar.n();
        n10.getClass();
        String n11 = wVar.n();
        n11.getClass();
        return new EventMessage(n10, n11, wVar.m(), wVar.m(), Arrays.copyOfRange(wVar.f27384a, wVar.f27385b, wVar.f27386c));
    }

    @Override // c5.e
    public final Metadata g(c cVar, ByteBuffer byteBuffer) {
        return new Metadata(i(new w(byteBuffer.array(), byteBuffer.limit())));
    }
}
