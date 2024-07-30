package o8;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.util.TreeSet;

/* compiled from: Streams.java */
/* loaded from: classes2.dex */
public final class u implements s {
    public static m8.n b(s8.a aVar) throws l1.c {
        boolean z10;
        try {
            try {
                aVar.f0();
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return (m8.n) TypeAdapters.f21386z.a(aVar);
            } catch (EOFException e11) {
                e = e11;
                z10 = false;
                if (z10) {
                    return m8.p.f32941s;
                }
                throw new m8.u(e);
            }
        } catch (s8.c e12) {
            throw new m8.u(e12);
        } catch (IOException e13) {
            throw new m8.o(e13);
        } catch (NumberFormatException e14) {
            throw new m8.u(e14);
        }
    }

    @Override // o8.s
    public Object a() {
        return new TreeSet();
    }
}
