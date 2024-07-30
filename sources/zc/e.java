package zc;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes2.dex */
public abstract class e<R> implements Serializable {
    public final String toString() {
        f.f37365a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d.c(obj, "renderLambdaToString(this)");
        return obj;
    }
}
