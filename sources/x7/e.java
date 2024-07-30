package x7;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import v7.g;

/* compiled from: JsonDataEncoderBuilder.java */
/* loaded from: classes2.dex */
public final class e implements w7.a<e> {

    /* renamed from: e, reason: collision with root package name */
    public static final x7.a f36487e = new x7.a(0);
    public static final b f = new v7.f() { // from class: x7.b
        @Override // v7.a
        public final void a(Object obj, g gVar) {
            gVar.d((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final c f36488g = new v7.f() { // from class: x7.c
        @Override // v7.a
        public final void a(Object obj, g gVar) {
            gVar.e(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final a f36489h = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f36490a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f36491b;

    /* renamed from: c, reason: collision with root package name */
    public final x7.a f36492c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36493d;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* loaded from: classes2.dex */
    public static final class a implements v7.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f36494a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f36494a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // v7.a
        public final void a(Object obj, g gVar) throws IOException {
            gVar.d(f36494a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f36490a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f36491b = hashMap2;
        this.f36492c = f36487e;
        this.f36493d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f36488g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f36489h);
        hashMap.remove(Date.class);
    }

    public final w7.a a(Class cls, v7.d dVar) {
        this.f36490a.put(cls, dVar);
        this.f36491b.remove(cls);
        return this;
    }
}
