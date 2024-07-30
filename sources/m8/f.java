package m8;

import java.io.IOException;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class f extends a0<Number> {
    @Override // m8.a0
    public final Number a(s8.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        return Long.valueOf(aVar.Y());
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            bVar.j();
        } else {
            bVar.X(number2.toString());
        }
    }
}
