package w5;

import a3.l;
import android.graphics.Color;
import android.graphics.PointF;
import d6.g0;
import d6.p;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaStyle.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f36121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36122b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f36123c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f36124d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36125e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36126g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36127h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f36128i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36129j;

    /* compiled from: SsaStyle.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f36130a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36131b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36132c;

        /* renamed from: d, reason: collision with root package name */
        public final int f36133d;

        /* renamed from: e, reason: collision with root package name */
        public final int f36134e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f36135g;

        /* renamed from: h, reason: collision with root package name */
        public final int f36136h;

        /* renamed from: i, reason: collision with root package name */
        public final int f36137i;

        /* renamed from: j, reason: collision with root package name */
        public final int f36138j;

        /* renamed from: k, reason: collision with root package name */
        public final int f36139k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f36130a = i10;
            this.f36131b = i11;
            this.f36132c = i12;
            this.f36133d = i13;
            this.f36134e = i14;
            this.f = i15;
            this.f36135g = i16;
            this.f36136h = i17;
            this.f36137i = i18;
            this.f36138j = i19;
            this.f36139k = i20;
        }
    }

    /* compiled from: SsaStyle.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f36140a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b, reason: collision with root package name */
        public static final Pattern f36141b = Pattern.compile(g0.l("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f36142c = Pattern.compile(g0.l("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f36143d = Pattern.compile("\\\\an(\\d+)");

        public static PointF a(String str) {
            String group;
            String group2;
            Matcher matcher = f36141b.matcher(str);
            Matcher matcher2 = f36142c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    p.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public c(String str, int i10, Integer num, Integer num2, float f, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f36121a = str;
        this.f36122b = i10;
        this.f36123c = num;
        this.f36124d = num2;
        this.f36125e = f;
        this.f = z10;
        this.f36126g = z11;
        this.f36127h = z12;
        this.f36128i = z13;
        this.f36129j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        l.y("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            p.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            d6.a.a(z10);
            return Integer.valueOf(Color.argb(l7.a.g0(((parseLong >> 24) & 255) ^ 255), l7.a.g0(parseLong & 255), l7.a.g0((parseLong >> 8) & 255), l7.a.g0((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            p.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
