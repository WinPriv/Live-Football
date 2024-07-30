package y7;

import java.lang.annotation.Annotation;
import y7.d;

/* compiled from: AtProtobuf.java */
/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f36832a;

    public a(int i10) {
        this.f36832a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f36832a == aVar.f36832a) {
            Object obj2 = d.a.DEFAULT;
            aVar.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f36832a) + (d.a.DEFAULT.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f36832a + "intEncoding=" + d.a.DEFAULT + ')';
    }
}
