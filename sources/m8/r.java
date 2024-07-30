package m8;

import java.io.IOException;
import java.io.StringReader;

/* compiled from: JsonParser.java */
/* loaded from: classes2.dex */
public final class r {
    public static n a(s8.a aVar) throws o, u {
        boolean z10 = aVar.f35267t;
        aVar.f35267t = true;
        try {
            try {
                try {
                    return o8.u.b(aVar);
                } catch (StackOverflowError e10) {
                    throw new l1.c("Failed parsing JSON source: " + aVar + " to Json", e10);
                }
            } catch (OutOfMemoryError e11) {
                throw new l1.c("Failed parsing JSON source: " + aVar + " to Json", e11);
            }
        } finally {
            aVar.f35267t = z10;
        }
    }

    public static n b(String str) throws u {
        try {
            s8.a aVar = new s8.a(new StringReader(str));
            n a10 = a(aVar);
            a10.getClass();
            if (!(a10 instanceof p) && aVar.f0() != 10) {
                throw new u("Did not consume the entire document.");
            }
            return a10;
        } catch (IOException e10) {
            throw new o(e10);
        } catch (NumberFormatException e11) {
            throw new u(e11);
        } catch (s8.c e12) {
            throw new u(e12);
        }
    }
}
