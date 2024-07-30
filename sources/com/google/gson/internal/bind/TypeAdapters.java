package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o8.r;

/* loaded from: classes2.dex */
public final class TypeAdapters {
    public static final m8.b0 A;
    public static final m8.b0 B;

    /* renamed from: a, reason: collision with root package name */
    public static final m8.b0 f21364a = new AnonymousClass31(Class.class, new m8.z(new k()));

    /* renamed from: b, reason: collision with root package name */
    public static final m8.b0 f21365b = new AnonymousClass31(BitSet.class, new m8.z(new u()));

    /* renamed from: c, reason: collision with root package name */
    public static final w f21366c;

    /* renamed from: d, reason: collision with root package name */
    public static final m8.b0 f21367d;

    /* renamed from: e, reason: collision with root package name */
    public static final m8.b0 f21368e;
    public static final m8.b0 f;

    /* renamed from: g, reason: collision with root package name */
    public static final m8.b0 f21369g;

    /* renamed from: h, reason: collision with root package name */
    public static final m8.b0 f21370h;

    /* renamed from: i, reason: collision with root package name */
    public static final m8.b0 f21371i;

    /* renamed from: j, reason: collision with root package name */
    public static final m8.b0 f21372j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f21373k;

    /* renamed from: l, reason: collision with root package name */
    public static final m8.b0 f21374l;

    /* renamed from: m, reason: collision with root package name */
    public static final g f21375m;

    /* renamed from: n, reason: collision with root package name */
    public static final h f21376n;
    public static final i o;

    /* renamed from: p, reason: collision with root package name */
    public static final m8.b0 f21377p;

    /* renamed from: q, reason: collision with root package name */
    public static final m8.b0 f21378q;

    /* renamed from: r, reason: collision with root package name */
    public static final m8.b0 f21379r;

    /* renamed from: s, reason: collision with root package name */
    public static final m8.b0 f21380s;

    /* renamed from: t, reason: collision with root package name */
    public static final m8.b0 f21381t;

    /* renamed from: u, reason: collision with root package name */
    public static final m8.b0 f21382u;

    /* renamed from: v, reason: collision with root package name */
    public static final m8.b0 f21383v;

    /* renamed from: w, reason: collision with root package name */
    public static final m8.b0 f21384w;

    /* renamed from: x, reason: collision with root package name */
    public static final m8.b0 f21385x;
    public static final m8.b0 y;

    /* renamed from: z, reason: collision with root package name */
    public static final t f21386z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass30 implements m8.b0 {
        @Override // m8.b0
        public final <T> m8.a0<T> a(m8.i iVar, r8.a<T> aVar) {
            aVar.equals(null);
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass31 implements m8.b0 {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Class f21387s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m8.a0 f21388t;

        public AnonymousClass31(Class cls, m8.a0 a0Var) {
            this.f21387s = cls;
            this.f21388t = a0Var;
        }

        @Override // m8.b0
        public final <T> m8.a0<T> a(m8.i iVar, r8.a<T> aVar) {
            if (aVar.getRawType() == this.f21387s) {
                return this.f21388t;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f21387s.getName() + ",adapter=" + this.f21388t + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass32 implements m8.b0 {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Class f21389s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Class f21390t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ m8.a0 f21391u;

        public AnonymousClass32(Class cls, Class cls2, m8.a0 a0Var) {
            this.f21389s = cls;
            this.f21390t = cls2;
            this.f21391u = a0Var;
        }

        @Override // m8.b0
        public final <T> m8.a0<T> a(m8.i iVar, r8.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType != this.f21389s && rawType != this.f21390t) {
                return null;
            }
            return this.f21391u;
        }

        public final String toString() {
            return "Factory[type=" + this.f21390t.getName() + "+" + this.f21389s.getName() + ",adapter=" + this.f21391u + "]";
        }
    }

    /* loaded from: classes2.dex */
    public class a extends m8.a0<AtomicIntegerArray> {
        @Override // m8.a0
        public final AtomicIntegerArray a(s8.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.l()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.X()));
                } catch (NumberFormatException e10) {
                    throw new m8.u(e10);
                }
            }
            aVar.f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            bVar.c();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.P(r6.get(i10));
            }
            bVar.f();
        }
    }

    /* loaded from: classes2.dex */
    public class a0 extends m8.a0<AtomicInteger> {
        @Override // m8.a0
        public final AtomicInteger a(s8.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.X());
            } catch (NumberFormatException e10) {
                throw new m8.u(e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, AtomicInteger atomicInteger) throws IOException {
            bVar.P(atomicInteger.get());
        }
    }

    /* loaded from: classes2.dex */
    public class b extends m8.a0<Number> {
        @Override // m8.a0
        public final Number a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            try {
                return Long.valueOf(aVar.Y());
            } catch (NumberFormatException e10) {
                throw new m8.u(e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                bVar.j();
            } else {
                bVar.P(number2.longValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b0 extends m8.a0<AtomicBoolean> {
        @Override // m8.a0
        public final AtomicBoolean a(s8.a aVar) throws IOException {
            return new AtomicBoolean(aVar.Q());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, AtomicBoolean atomicBoolean) throws IOException {
            bVar.Y(atomicBoolean.get());
        }
    }

    /* loaded from: classes2.dex */
    public class c extends m8.a0<Number> {
        @Override // m8.a0
        public final Number a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return Float.valueOf((float) aVar.S());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                bVar.j();
                return;
            }
            if (!(number2 instanceof Float)) {
                number2 = Float.valueOf(number2.floatValue());
            }
            bVar.S(number2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0<T extends Enum<T>> extends m8.a0<T> {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f21399a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f21400b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f21401c = new HashMap();

        /* loaded from: classes2.dex */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f21402a;

            public a(Class cls) {
                this.f21402a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f21402a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public c0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    String str = r42.toString();
                    n8.b bVar = (n8.b) field.getAnnotation(n8.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str2 : bVar.alternate()) {
                            this.f21399a.put(str2, r42);
                        }
                    }
                    this.f21399a.put(name, r42);
                    this.f21400b.put(str, r42);
                    this.f21401c.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // m8.a0
        public final Object a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            String d02 = aVar.d0();
            Enum r02 = (Enum) this.f21399a.get(d02);
            if (r02 == null) {
                return (Enum) this.f21400b.get(d02);
            }
            return r02;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Object obj) throws IOException {
            String str;
            Enum r32 = (Enum) obj;
            if (r32 == null) {
                str = null;
            } else {
                str = (String) this.f21401c.get(r32);
            }
            bVar.X(str);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends m8.a0<Number> {
        @Override // m8.a0
        public final Number a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return Double.valueOf(aVar.S());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                bVar.j();
            } else {
                bVar.m(number2.doubleValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e extends m8.a0<Character> {
        @Override // m8.a0
        public final Character a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            String d02 = aVar.d0();
            if (d02.length() == 1) {
                return Character.valueOf(d02.charAt(0));
            }
            StringBuilder s10 = a3.l.s("Expecting character, got: ", d02, "; at ");
            s10.append(aVar.k());
            throw new m8.u(s10.toString());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Character ch) throws IOException {
            String valueOf;
            Character ch2 = ch;
            if (ch2 == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch2);
            }
            bVar.X(valueOf);
        }
    }

    /* loaded from: classes2.dex */
    public class f extends m8.a0<String> {
        @Override // m8.a0
        public final String a(s8.a aVar) throws IOException {
            int f02 = aVar.f0();
            if (f02 == 9) {
                aVar.b0();
                return null;
            }
            if (f02 == 8) {
                return Boolean.toString(aVar.Q());
            }
            return aVar.d0();
        }

        @Override // m8.a0
        public final void b(s8.b bVar, String str) throws IOException {
            bVar.X(str);
        }
    }

    /* loaded from: classes2.dex */
    public class g extends m8.a0<BigDecimal> {
        @Override // m8.a0
        public final BigDecimal a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            String d02 = aVar.d0();
            try {
                return new BigDecimal(d02);
            } catch (NumberFormatException e10) {
                StringBuilder s10 = a3.l.s("Failed parsing '", d02, "' as BigDecimal; at path ");
                s10.append(aVar.k());
                throw new m8.u(s10.toString(), e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, BigDecimal bigDecimal) throws IOException {
            bVar.S(bigDecimal);
        }
    }

    /* loaded from: classes2.dex */
    public class h extends m8.a0<BigInteger> {
        @Override // m8.a0
        public final BigInteger a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            String d02 = aVar.d0();
            try {
                return new BigInteger(d02);
            } catch (NumberFormatException e10) {
                StringBuilder s10 = a3.l.s("Failed parsing '", d02, "' as BigInteger; at path ");
                s10.append(aVar.k());
                throw new m8.u(s10.toString(), e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, BigInteger bigInteger) throws IOException {
            bVar.S(bigInteger);
        }
    }

    /* loaded from: classes2.dex */
    public class i extends m8.a0<o8.q> {
        @Override // m8.a0
        public final o8.q a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return new o8.q(aVar.d0());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, o8.q qVar) throws IOException {
            bVar.S(qVar);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends m8.a0<StringBuilder> {
        @Override // m8.a0
        public final StringBuilder a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return new StringBuilder(aVar.d0());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, StringBuilder sb2) throws IOException {
            String sb3;
            StringBuilder sb4 = sb2;
            if (sb4 == null) {
                sb3 = null;
            } else {
                sb3 = sb4.toString();
            }
            bVar.X(sb3);
        }
    }

    /* loaded from: classes2.dex */
    public class k extends m8.a0<Class> {
        @Override // m8.a0
        public final Class a(s8.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes2.dex */
    public class l extends m8.a0<StringBuffer> {
        @Override // m8.a0
        public final StringBuffer a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return new StringBuffer(aVar.d0());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, StringBuffer stringBuffer) throws IOException {
            String stringBuffer2;
            StringBuffer stringBuffer3 = stringBuffer;
            if (stringBuffer3 == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer3.toString();
            }
            bVar.X(stringBuffer2);
        }
    }

    /* loaded from: classes2.dex */
    public class m extends m8.a0<URL> {
        @Override // m8.a0
        public final URL a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
            } else {
                String d02 = aVar.d0();
                if (!"null".equals(d02)) {
                    return new URL(d02);
                }
            }
            return null;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, URL url) throws IOException {
            String externalForm;
            URL url2 = url;
            if (url2 == null) {
                externalForm = null;
            } else {
                externalForm = url2.toExternalForm();
            }
            bVar.X(externalForm);
        }
    }

    /* loaded from: classes2.dex */
    public class n extends m8.a0<URI> {
        @Override // m8.a0
        public final URI a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
            } else {
                try {
                    String d02 = aVar.d0();
                    if (!"null".equals(d02)) {
                        return new URI(d02);
                    }
                } catch (URISyntaxException e10) {
                    throw new m8.o(e10);
                }
            }
            return null;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, URI uri) throws IOException {
            String aSCIIString;
            URI uri2 = uri;
            if (uri2 == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri2.toASCIIString();
            }
            bVar.X(aSCIIString);
        }
    }

    /* loaded from: classes2.dex */
    public class o extends m8.a0<InetAddress> {
        @Override // m8.a0
        public final InetAddress a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return InetAddress.getByName(aVar.d0());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, InetAddress inetAddress) throws IOException {
            String hostAddress;
            InetAddress inetAddress2 = inetAddress;
            if (inetAddress2 == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress2.getHostAddress();
            }
            bVar.X(hostAddress);
        }
    }

    /* loaded from: classes2.dex */
    public class p extends m8.a0<UUID> {
        @Override // m8.a0
        public final UUID a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            String d02 = aVar.d0();
            try {
                return UUID.fromString(d02);
            } catch (IllegalArgumentException e10) {
                StringBuilder s10 = a3.l.s("Failed parsing '", d02, "' as UUID; at path ");
                s10.append(aVar.k());
                throw new m8.u(s10.toString(), e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, UUID uuid) throws IOException {
            String uuid2;
            UUID uuid3 = uuid;
            if (uuid3 == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid3.toString();
            }
            bVar.X(uuid2);
        }
    }

    /* loaded from: classes2.dex */
    public class q extends m8.a0<Currency> {
        @Override // m8.a0
        public final Currency a(s8.a aVar) throws IOException {
            String d02 = aVar.d0();
            try {
                return Currency.getInstance(d02);
            } catch (IllegalArgumentException e10) {
                StringBuilder s10 = a3.l.s("Failed parsing '", d02, "' as Currency; at path ");
                s10.append(aVar.k());
                throw new m8.u(s10.toString(), e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Currency currency) throws IOException {
            bVar.X(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes2.dex */
    public class r extends m8.a0<Calendar> {
        @Override // m8.a0
        public final Calendar a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.f0() != 4) {
                String Z = aVar.Z();
                int X = aVar.X();
                if ("year".equals(Z)) {
                    i10 = X;
                } else if ("month".equals(Z)) {
                    i11 = X;
                } else if ("dayOfMonth".equals(Z)) {
                    i12 = X;
                } else if ("hourOfDay".equals(Z)) {
                    i13 = X;
                } else if ("minute".equals(Z)) {
                    i14 = X;
                } else if ("second".equals(Z)) {
                    i15 = X;
                }
            }
            aVar.g();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                bVar.j();
                return;
            }
            bVar.d();
            bVar.h("year");
            bVar.P(r4.get(1));
            bVar.h("month");
            bVar.P(r4.get(2));
            bVar.h("dayOfMonth");
            bVar.P(r4.get(5));
            bVar.h("hourOfDay");
            bVar.P(r4.get(11));
            bVar.h("minute");
            bVar.P(r4.get(12));
            bVar.h("second");
            bVar.P(r4.get(13));
            bVar.g();
        }
    }

    /* loaded from: classes2.dex */
    public class s extends m8.a0<Locale> {
        @Override // m8.a0
        public final Locale a(s8.a aVar) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.d0(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Locale locale) throws IOException {
            String locale2;
            Locale locale3 = locale;
            if (locale3 == null) {
                locale2 = null;
            } else {
                locale2 = locale3.toString();
            }
            bVar.X(locale2);
        }
    }

    /* loaded from: classes2.dex */
    public class t extends m8.a0<m8.n> {
        public static m8.n c(s8.a aVar, int i10) throws IOException {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                aVar.b0();
                                return m8.p.f32941s;
                            }
                            throw new IllegalStateException("Unexpected token: ".concat(com.ironsource.adapters.facebook.a.z(i10)));
                        }
                        return new m8.s(Boolean.valueOf(aVar.Q()));
                    }
                    return new m8.s(new o8.q(aVar.d0()));
                }
                return new m8.s(aVar.d0());
            }
            throw null;
        }

        public static m8.n d(s8.a aVar, int i10) throws IOException {
            if (i10 != 0) {
                int i11 = i10 - 1;
                if (i11 != 0) {
                    if (i11 != 2) {
                        return null;
                    }
                    aVar.c();
                    return new m8.q();
                }
                aVar.b();
                return new m8.l();
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void e(m8.n nVar, s8.b bVar) throws IOException {
            boolean z10;
            if (nVar != null && !(nVar instanceof m8.p)) {
                boolean z11 = nVar instanceof m8.s;
                if (z11) {
                    if (z11) {
                        m8.s sVar = (m8.s) nVar;
                        Serializable serializable = sVar.f32943s;
                        if (serializable instanceof Number) {
                            bVar.S(sVar.n());
                            return;
                        } else if (serializable instanceof Boolean) {
                            bVar.Y(sVar.e());
                            return;
                        } else {
                            bVar.X(sVar.m());
                            return;
                        }
                    }
                    throw new IllegalStateException("Not a JSON Primitive: " + nVar);
                }
                if (nVar instanceof m8.l) {
                    bVar.c();
                    Iterator<m8.n> it = nVar.i().iterator();
                    while (it.hasNext()) {
                        e(it.next(), bVar);
                    }
                    bVar.f();
                    return;
                }
                if (nVar instanceof m8.q) {
                    bVar.d();
                    o8.r rVar = o8.r.this;
                    r.e eVar = rVar.f33756x.f33767v;
                    int i10 = rVar.f33755w;
                    while (true) {
                        r.e eVar2 = rVar.f33756x;
                        if (eVar != eVar2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (eVar != eVar2) {
                                if (rVar.f33755w == i10) {
                                    r.e eVar3 = eVar.f33767v;
                                    bVar.h((String) eVar.f33769x);
                                    e((m8.n) eVar.f33770z, bVar);
                                    eVar = eVar3;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            bVar.g();
                            return;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Couldn't write " + nVar.getClass());
                }
            } else {
                bVar.j();
            }
        }

        @Override // m8.a0
        public final m8.n a(s8.a aVar) throws IOException {
            String str;
            boolean z10;
            if (aVar instanceof com.google.gson.internal.bind.b) {
                com.google.gson.internal.bind.b bVar = (com.google.gson.internal.bind.b) aVar;
                int f02 = bVar.f0();
                if (f02 != 5 && f02 != 2 && f02 != 4 && f02 != 10) {
                    m8.n nVar = (m8.n) bVar.p0();
                    bVar.l0();
                    return nVar;
                }
                throw new IllegalStateException("Unexpected " + com.ironsource.adapters.facebook.a.z(f02) + " when reading a JsonElement.");
            }
            int f03 = aVar.f0();
            m8.n d10 = d(aVar, f03);
            if (d10 == null) {
                return c(aVar, f03);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.l()) {
                    if (d10 instanceof m8.q) {
                        str = aVar.Z();
                    } else {
                        str = null;
                    }
                    int f04 = aVar.f0();
                    m8.n d11 = d(aVar, f04);
                    if (d11 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (d11 == null) {
                        d11 = c(aVar, f04);
                    }
                    if (d10 instanceof m8.l) {
                        ((m8.l) d10).o(d11);
                    } else {
                        ((m8.q) d10).n(d11, str);
                    }
                    if (z10) {
                        arrayDeque.addLast(d10);
                        d10 = d11;
                    }
                } else {
                    if (d10 instanceof m8.l) {
                        aVar.f();
                    } else {
                        aVar.g();
                    }
                    if (arrayDeque.isEmpty()) {
                        return d10;
                    }
                    d10 = (m8.n) arrayDeque.removeLast();
                }
            }
        }

        @Override // m8.a0
        public final /* bridge */ /* synthetic */ void b(s8.b bVar, m8.n nVar) throws IOException {
            e(nVar, bVar);
        }
    }

    /* loaded from: classes2.dex */
    public class u extends m8.a0<BitSet> {
        @Override // m8.a0
        public final BitSet a(s8.a aVar) throws IOException {
            boolean z10;
            BitSet bitSet = new BitSet();
            aVar.b();
            int f02 = aVar.f0();
            int i10 = 0;
            while (f02 != 2) {
                int c10 = s.f.c(f02);
                if (c10 != 5 && c10 != 6) {
                    if (c10 == 7) {
                        z10 = aVar.Q();
                    } else {
                        throw new m8.u("Invalid bitset value type: " + com.ironsource.adapters.facebook.a.z(f02) + "; at path " + aVar.i());
                    }
                } else {
                    int X = aVar.X();
                    if (X == 0) {
                        z10 = false;
                    } else if (X == 1) {
                        z10 = true;
                    } else {
                        StringBuilder n10 = a3.k.n("Invalid bitset value ", X, ", expected 0 or 1; at path ");
                        n10.append(aVar.k());
                        throw new m8.u(n10.toString());
                    }
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                f02 = aVar.f0();
            }
            aVar.f();
            return bitSet;
        }

        @Override // m8.a0
        public final void b(s8.b bVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            bVar.c();
            int length = bitSet2.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.P(bitSet2.get(i10) ? 1L : 0L);
            }
            bVar.f();
        }
    }

    /* loaded from: classes2.dex */
    public class v extends m8.a0<Boolean> {
        @Override // m8.a0
        public final Boolean a(s8.a aVar) throws IOException {
            int f02 = aVar.f0();
            if (f02 == 9) {
                aVar.b0();
                return null;
            }
            if (f02 == 6) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.d0()));
            }
            return Boolean.valueOf(aVar.Q());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Boolean bool) throws IOException {
            bVar.Q(bool);
        }
    }

    /* loaded from: classes2.dex */
    public class w extends m8.a0<Boolean> {
        @Override // m8.a0
        public final Boolean a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            return Boolean.valueOf(aVar.d0());
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Boolean bool) throws IOException {
            String bool2;
            Boolean bool3 = bool;
            if (bool3 == null) {
                bool2 = "null";
            } else {
                bool2 = bool3.toString();
            }
            bVar.X(bool2);
        }
    }

    /* loaded from: classes2.dex */
    public class x extends m8.a0<Number> {
        @Override // m8.a0
        public final Number a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            try {
                int X = aVar.X();
                if (X <= 255 && X >= -128) {
                    return Byte.valueOf((byte) X);
                }
                StringBuilder n10 = a3.k.n("Lossy conversion from ", X, " to byte; at path ");
                n10.append(aVar.k());
                throw new m8.u(n10.toString());
            } catch (NumberFormatException e10) {
                throw new m8.u(e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Number number) throws IOException {
            if (number == null) {
                bVar.j();
            } else {
                bVar.P(r4.byteValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class y extends m8.a0<Number> {
        @Override // m8.a0
        public final Number a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            try {
                int X = aVar.X();
                if (X <= 65535 && X >= -32768) {
                    return Short.valueOf((short) X);
                }
                StringBuilder n10 = a3.k.n("Lossy conversion from ", X, " to short; at path ");
                n10.append(aVar.k());
                throw new m8.u(n10.toString());
            } catch (NumberFormatException e10) {
                throw new m8.u(e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Number number) throws IOException {
            if (number == null) {
                bVar.j();
            } else {
                bVar.P(r4.shortValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class z extends m8.a0<Number> {
        @Override // m8.a0
        public final Number a(s8.a aVar) throws IOException {
            if (aVar.f0() == 9) {
                aVar.b0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.X());
            } catch (NumberFormatException e10) {
                throw new m8.u(e10);
            }
        }

        @Override // m8.a0
        public final void b(s8.b bVar, Number number) throws IOException {
            if (number == null) {
                bVar.j();
            } else {
                bVar.P(r4.intValue());
            }
        }
    }

    static {
        v vVar = new v();
        f21366c = new w();
        f21367d = new AnonymousClass32(Boolean.TYPE, Boolean.class, vVar);
        f21368e = new AnonymousClass32(Byte.TYPE, Byte.class, new x());
        f = new AnonymousClass32(Short.TYPE, Short.class, new y());
        f21369g = new AnonymousClass32(Integer.TYPE, Integer.class, new z());
        f21370h = new AnonymousClass31(AtomicInteger.class, new m8.z(new a0()));
        f21371i = new AnonymousClass31(AtomicBoolean.class, new m8.z(new b0()));
        f21372j = new AnonymousClass31(AtomicIntegerArray.class, new m8.z(new a()));
        f21373k = new b();
        new c();
        new d();
        f21374l = new AnonymousClass32(Character.TYPE, Character.class, new e());
        f fVar = new f();
        f21375m = new g();
        f21376n = new h();
        o = new i();
        f21377p = new AnonymousClass31(String.class, fVar);
        f21378q = new AnonymousClass31(StringBuilder.class, new j());
        f21379r = new AnonymousClass31(StringBuffer.class, new l());
        f21380s = new AnonymousClass31(URL.class, new m());
        f21381t = new AnonymousClass31(URI.class, new n());
        final o oVar = new o();
        final Class<InetAddress> cls = InetAddress.class;
        f21382u = new m8.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$a */
            /* loaded from: classes2.dex */
            public class a extends m8.a0<Object> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Class f21397a;

                public a(Class cls) {
                    this.f21397a = cls;
                }

                @Override // m8.a0
                public final Object a(s8.a aVar) throws IOException {
                    Object a10 = oVar.a(aVar);
                    if (a10 != null) {
                        Class cls = this.f21397a;
                        if (!cls.isInstance(a10)) {
                            throw new m8.u("Expected a " + cls.getName() + " but was " + a10.getClass().getName() + "; at path " + aVar.k());
                        }
                    }
                    return a10;
                }

                @Override // m8.a0
                public final void b(s8.b bVar, Object obj) throws IOException {
                    oVar.b(bVar, obj);
                }
            }

            @Override // m8.b0
            public final <T2> m8.a0<T2> a(m8.i iVar, r8.a<T2> aVar) {
                Class<? super T2> rawType = aVar.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new a(rawType);
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + oVar + "]";
            }
        };
        f21383v = new AnonymousClass31(UUID.class, new p());
        f21384w = new AnonymousClass31(Currency.class, new m8.z(new q()));
        final r rVar = new r();
        f21385x = new m8.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.33

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Class f21392s = Calendar.class;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Class f21393t = GregorianCalendar.class;

            @Override // m8.b0
            public final <T> m8.a0<T> a(m8.i iVar, r8.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType != this.f21392s && rawType != this.f21393t) {
                    return null;
                }
                return rVar;
            }

            public final String toString() {
                return "Factory[type=" + this.f21392s.getName() + "+" + this.f21393t.getName() + ",adapter=" + rVar + "]";
            }
        };
        y = new AnonymousClass31(Locale.class, new s());
        final t tVar = new t();
        f21386z = tVar;
        final Class<m8.n> cls2 = m8.n.class;
        A = new m8.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$a */
            /* loaded from: classes2.dex */
            public class a extends m8.a0<Object> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Class f21397a;

                public a(Class cls) {
                    this.f21397a = cls;
                }

                @Override // m8.a0
                public final Object a(s8.a aVar) throws IOException {
                    Object a10 = tVar.a(aVar);
                    if (a10 != null) {
                        Class cls = this.f21397a;
                        if (!cls.isInstance(a10)) {
                            throw new m8.u("Expected a " + cls.getName() + " but was " + a10.getClass().getName() + "; at path " + aVar.k());
                        }
                    }
                    return a10;
                }

                @Override // m8.a0
                public final void b(s8.b bVar, Object obj) throws IOException {
                    tVar.b(bVar, obj);
                }
            }

            @Override // m8.b0
            public final <T2> m8.a0<T2> a(m8.i iVar, r8.a<T2> aVar) {
                Class<? super T2> rawType = aVar.getRawType();
                if (!cls2.isAssignableFrom(rawType)) {
                    return null;
                }
                return new a(rawType);
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + tVar + "]";
            }
        };
        B = new m8.b0() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // m8.b0
            public final <T> m8.a0<T> a(m8.i iVar, r8.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = rawType.getSuperclass();
                    }
                    return new c0(rawType);
                }
                return null;
            }
        };
    }

    public static <TT> m8.b0 a(Class<TT> cls, Class<TT> cls2, m8.a0<? super TT> a0Var) {
        return new AnonymousClass32(cls, cls2, a0Var);
    }

    public static <TT> m8.b0 b(Class<TT> cls, m8.a0<TT> a0Var) {
        return new AnonymousClass31(cls, a0Var);
    }
}
