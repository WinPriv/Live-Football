package m8;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes2.dex */
public abstract class n {
    @Deprecated
    public n() {
    }

    public abstract n d();

    public boolean e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final l i() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final q j() {
        if (this instanceof q) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public long l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            s8.b bVar = new s8.b(stringWriter);
            bVar.f35278x = true;
            TypeAdapters.f21386z.b(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
