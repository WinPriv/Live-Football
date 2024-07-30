package i8;

import java.util.HashMap;
import y7.g;

/* compiled from: ProtoEncoderDoNotUse.java */
/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final y7.g f29299a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        y7.f fVar = g.a.f36847a;
        hashMap.put(s.class, c.f29239a);
        hashMap2.remove(s.class);
        hashMap.put(j8.b.class, b.f29234a);
        hashMap2.remove(j8.b.class);
        hashMap.put(j8.a.class, a.f29216a);
        hashMap2.remove(j8.a.class);
        f29299a = new y7.g(new HashMap(hashMap), new HashMap(hashMap2), fVar);
    }

    public abstract j8.b a();
}
