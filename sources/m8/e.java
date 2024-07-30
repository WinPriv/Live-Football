package m8;

import java.io.IOException;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class e extends a0<Number> {
    @Override // m8.a0
    public final Number a(s8.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        return Float.valueOf((float) aVar.S());
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            bVar.j();
            return;
        }
        float floatValue = number2.floatValue();
        i.a(floatValue);
        if (!(number2 instanceof Float)) {
            number2 = Float.valueOf(floatValue);
        }
        bVar.S(number2);
    }
}
