package i7;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: Joiner.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f29205a;

    public e(String str) {
        str.getClass();
        this.f29205a = str;
    }

    public final void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f29205a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
