package m8;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes2.dex */
public abstract class b implements m8.c {

    /* renamed from: s, reason: collision with root package name */
    public static final a f32910s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f32911t;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: classes2.dex */
    public enum a extends b {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // m8.c
        public final String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        f32910s = aVar;
        f32911t = new b[]{aVar, new b() { // from class: m8.b.b
            @Override // m8.c
            public final String a(Field field) {
                return b.c(field.getName());
            }
        }, new b() { // from class: m8.b.c
            @Override // m8.c
            public final String a(Field field) {
                return b.c(b.b(field.getName(), ' '));
            }
        }, new b() { // from class: m8.b.d
            @Override // m8.c
            public final String a(Field field) {
                return b.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new b() { // from class: m8.b.e
            @Override // m8.c
            public final String a(Field field) {
                return b.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new b() { // from class: m8.b.f
            @Override // m8.c
            public final String a(Field field) {
                return b.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new b() { // from class: m8.b.g
            @Override // m8.c
            public final String a(Field field) {
                return b.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public b() {
        throw null;
    }

    public b(String str, int i10) {
    }

    public static String b(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f32911t.clone();
    }
}
