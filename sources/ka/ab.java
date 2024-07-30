package ka;

import android.util.Pair;
import java.io.BufferedInputStream;

/* loaded from: classes2.dex */
public interface ab<R> {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final wa f30929a = new wa(1);

        public static ua a(Class cls) {
            if (cls != Integer.TYPE && cls != Integer.class) {
                int i10 = 0;
                if (cls != Float.TYPE && cls != Float.class) {
                    if (cls != Double.TYPE && cls != Double.class) {
                        if (cls != Long.TYPE && cls != Long.class) {
                            if (cls == String.class) {
                                return f30929a;
                            }
                            if (!cls.isPrimitive()) {
                                return new za(cls);
                            }
                            throw new IllegalArgumentException("Response type: " + cls + " not supported!");
                        }
                        return new va(1);
                    }
                    return new va(i10);
                }
                return new wa(i10);
            }
            return new ya();
        }
    }

    long a();

    Pair a(int i10, BufferedInputStream bufferedInputStream, long j10, na naVar);
}
