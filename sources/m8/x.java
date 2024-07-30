package m8;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToNumberPolicy.java */
/* loaded from: classes2.dex */
public abstract class x implements y {

    /* renamed from: s, reason: collision with root package name */
    public static final a f32946s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f32947t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ x[] f32948u;

    /* compiled from: ToNumberPolicy.java */
    /* loaded from: classes2.dex */
    public enum a extends x {
        public a() {
            super("DOUBLE", 0);
        }

        @Override // m8.y
        public final Number a(s8.a aVar) throws IOException {
            return Double.valueOf(aVar.S());
        }
    }

    /* compiled from: ToNumberPolicy.java */
    /* loaded from: classes2.dex */
    public enum b extends x {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        @Override // m8.y
        public final Number a(s8.a aVar) throws IOException {
            return new o8.q(aVar.d0());
        }
    }

    static {
        a aVar = new a();
        f32946s = aVar;
        b bVar = new b();
        f32947t = bVar;
        f32948u = new x[]{aVar, bVar, new x() { // from class: m8.x.c
            @Override // m8.y
            public final Number a(s8.a aVar2) throws IOException, l1.c {
                String d02 = aVar2.d0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(d02));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(d02);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.f35267t) {
                            return valueOf;
                        }
                        throw new s8.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.k());
                    }
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = a3.l.s("Cannot parse ", d02, "; at path ");
                    s10.append(aVar2.k());
                    throw new l1.c(s10.toString(), e10);
                }
            }
        }, new x() { // from class: m8.x.d
            @Override // m8.y
            public final Number a(s8.a aVar2) throws IOException {
                String d02 = aVar2.d0();
                try {
                    return new BigDecimal(d02);
                } catch (NumberFormatException e10) {
                    StringBuilder s10 = a3.l.s("Cannot parse ", d02, "; at path ");
                    s10.append(aVar2.k());
                    throw new l1.c(s10.toString(), e10);
                }
            }
        }};
    }

    public x() {
        throw null;
    }

    public x(String str, int i10) {
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f32948u.clone();
    }
}
