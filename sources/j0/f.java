package j0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f29562b = new f(new h(b.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final g f29563a;

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Locale[] f29564a = {new Locale(com.anythink.expressad.video.dynview.a.a.f11379ac, "XA"), new Locale(com.anythink.expressad.video.dynview.a.a.f11377aa, "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f29564a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (localeArr[i10].equals(locale)) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                int length2 = localeArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (localeArr[i11].equals(locale2)) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    String c10 = l0.b.c(l0.b.a(l0.b.b(locale)));
                    if (c10.isEmpty()) {
                        String country = locale.getCountry();
                        if (country.isEmpty() || country.equals(locale2.getCountry())) {
                            return true;
                        }
                        return false;
                    }
                    return c10.equals(l0.b.c(l0.b.a(l0.b.b(locale2))));
                }
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public f(h hVar) {
        this.f29563a = hVar;
    }

    public static f a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = a.a(split[i10]);
            }
            return new f(new h(b.a(localeArr)));
        }
        return f29562b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (this.f29563a.equals(((f) obj).f29563a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29563a.hashCode();
    }

    public final String toString() {
        return this.f29563a.toString();
    }
}
