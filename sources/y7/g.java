package y7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, v7.d<?>> f36844a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, v7.f<?>> f36845b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.d<Object> f36846c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: classes2.dex */
    public static final class a implements w7.a<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f36847a = new v7.d() { // from class: y7.f
            @Override // v7.a
            public final void a(Object obj, v7.e eVar) {
                throw new v7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            }
        };
    }

    public g(HashMap hashMap, HashMap hashMap2, f fVar) {
        this.f36844a = hashMap;
        this.f36845b = hashMap2;
        this.f36846c = fVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        Map<Class<?>, v7.d<?>> map = this.f36844a;
        e eVar = new e(byteArrayOutputStream, map, this.f36845b, this.f36846c);
        if (obj != null) {
            v7.d<?> dVar = map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, eVar);
            } else {
                throw new v7.b("No encoder for " + obj.getClass());
            }
        }
    }
}
