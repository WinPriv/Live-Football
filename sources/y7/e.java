package y7;

import com.huawei.hms.ads.gl;
import e0.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes2.dex */
public final class e implements v7.e {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final v7.c f36836g = new v7.c("key", com.ironsource.adapters.facebook.a.n(i.h(d.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final v7.c f36837h = new v7.c("value", com.ironsource.adapters.facebook.a.n(i.h(d.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final x7.a f36838i = new x7.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f36839a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, v7.d<?>> f36840b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, v7.f<?>> f36841c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.d<Object> f36842d;

    /* renamed from: e, reason: collision with root package name */
    public final h f36843e = new h(this);

    public e(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, v7.d dVar) {
        this.f36839a = byteArrayOutputStream;
        this.f36840b = map;
        this.f36841c = map2;
        this.f36842d = dVar;
    }

    public static int g(v7.c cVar) {
        d dVar = (d) ((Annotation) cVar.f35993b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f36832a;
        }
        throw new v7.b("Field has no @Protobuf config");
    }

    @Override // v7.e
    public final v7.e a(v7.c cVar, Object obj) throws IOException {
        d(cVar, obj, true);
        return this;
    }

    @Override // v7.e
    public final v7.e b(v7.c cVar, int i10) throws IOException {
        e(cVar, i10, true);
        return this;
    }

    @Override // v7.e
    public final v7.e c(v7.c cVar, long j10) throws IOException {
        if (j10 != 0) {
            d dVar = (d) ((Annotation) cVar.f35993b.get(d.class));
            if (dVar != null) {
                h(((a) dVar).f36832a << 3);
                i(j10);
            } else {
                throw new v7.b("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final e d(v7.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.f36839a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f36838i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                h((g(cVar) << 3) | 1);
                this.f36839a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != gl.Code) {
                h((g(cVar) << 3) | 5);
                this.f36839a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z10 || longValue != 0) {
                d dVar = (d) ((Annotation) cVar.f35993b.get(d.class));
                if (dVar != null) {
                    h(((a) dVar).f36832a << 3);
                    i(longValue);
                } else {
                    throw new v7.b("Field has no @Protobuf config");
                }
            }
            return this;
        }
        if (obj instanceof Boolean) {
            e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f36839a.write(bArr);
            return this;
        }
        v7.d<?> dVar2 = this.f36840b.get(obj.getClass());
        if (dVar2 != null) {
            f(dVar2, cVar, obj, z10);
            return this;
        }
        v7.f<?> fVar = this.f36841c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f36843e;
            hVar.f36848a = false;
            hVar.f36850c = cVar;
            hVar.f36849b = z10;
            fVar.a(obj, hVar);
            return this;
        }
        if (obj instanceof c) {
            e(cVar, ((c) obj).k(), true);
            return this;
        }
        if (obj instanceof Enum) {
            e(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        f(this.f36842d, cVar, obj, z10);
        return this;
    }

    public final void e(v7.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f35993b.get(d.class));
        if (dVar != null) {
            h(((a) dVar).f36832a << 3);
            h(i10);
            return;
        }
        throw new v7.b("Field has no @Protobuf config");
    }

    public final void f(v7.d dVar, v7.c cVar, Object obj, boolean z10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f36839a;
            this.f36839a = bVar;
            try {
                dVar.a(obj, this);
                this.f36839a = outputStream;
                long j10 = bVar.f36833s;
                bVar.close();
                if (z10 && j10 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j10);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f36839a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f36839a.write((i10 & com.anythink.expressad.video.module.a.a.R) | 128);
            i10 >>>= 7;
        }
        this.f36839a.write(i10 & com.anythink.expressad.video.module.a.a.R);
    }

    public final void i(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f36839a.write((((int) j10) & com.anythink.expressad.video.module.a.a.R) | 128);
            j10 >>>= 7;
        }
        this.f36839a.write(((int) j10) & com.anythink.expressad.video.module.a.a.R);
    }
}
