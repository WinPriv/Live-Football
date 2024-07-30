package j7;

import j7.n2;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: Tables.java */
/* loaded from: classes2.dex */
public abstract class o2<R, C, V> implements n2.a<R, C, V> {
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n2.a)) {
            return false;
        }
        n2.a aVar = (n2.a) obj;
        p2 p2Var = (p2) this;
        if (i7.g.a(p2Var.f30076s, aVar.p())) {
            if (i7.g.a(p2Var.f30077t, aVar.k())) {
                if (i7.g.a(p2Var.f30078u, aVar.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p2 p2Var = (p2) this;
        return Arrays.hashCode(new Object[]{p2Var.f30076s, p2Var.f30077t, p2Var.f30078u});
    }

    public final String toString() {
        p2 p2Var = (p2) this;
        String valueOf = String.valueOf(p2Var.f30076s);
        String valueOf2 = String.valueOf(p2Var.f30077t);
        String valueOf3 = String.valueOf(p2Var.f30078u);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + valueOf2.length() + valueOf.length() + 4);
        sb2.append("(");
        sb2.append(valueOf);
        sb2.append(",");
        sb2.append(valueOf2);
        return a3.l.p(sb2, ")=", valueOf3);
    }
}
