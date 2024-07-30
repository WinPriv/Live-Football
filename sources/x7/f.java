package x7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import v7.g;

/* compiled from: JsonValueObjectEncoderContext.java */
/* loaded from: classes2.dex */
public final class f implements v7.e, g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f36495a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f36496b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, v7.d<?>> f36497c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, v7.f<?>> f36498d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.d<Object> f36499e;
    public final boolean f;

    public f(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f36496b = new JsonWriter(bufferedWriter);
        this.f36497c = hashMap;
        this.f36498d = hashMap2;
        this.f36499e = aVar;
        this.f = z10;
    }

    @Override // v7.e
    public final v7.e a(v7.c cVar, Object obj) throws IOException {
        return g(obj, cVar.f35992a);
    }

    @Override // v7.e
    public final v7.e b(v7.c cVar, int i10) throws IOException {
        String str = cVar.f35992a;
        h();
        JsonWriter jsonWriter = this.f36496b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i10);
        return this;
    }

    @Override // v7.e
    public final v7.e c(v7.c cVar, long j10) throws IOException {
        String str = cVar.f35992a;
        h();
        JsonWriter jsonWriter = this.f36496b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j10);
        return this;
    }

    @Override // v7.g
    public final g d(String str) throws IOException {
        h();
        this.f36496b.value(str);
        return this;
    }

    @Override // v7.g
    public final g e(boolean z10) throws IOException {
        h();
        this.f36496b.value(z10);
        return this;
    }

    public final f f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f36496b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    jsonWriter.value(r7[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    long j10 = jArr[i10];
                    h();
                    jsonWriter.value(j10);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    jsonWriter.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    jsonWriter.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i10 < length5) {
                    f(numberArr[i10]);
                    i10++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i10 < length6) {
                    f(objArr[i10]);
                    i10++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g(entry.getValue(), (String) key);
                } catch (ClassCastException e10) {
                    throw new v7.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        v7.d<?> dVar = this.f36497c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        v7.f<?> fVar = this.f36498d.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            h();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.f36499e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final f g(Object obj, String str) throws IOException {
        boolean z10 = this.f;
        JsonWriter jsonWriter = this.f36496b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            h();
            jsonWriter.name(str);
            return f(obj);
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return f(obj);
    }

    public final void h() throws IOException {
        if (this.f36495a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
