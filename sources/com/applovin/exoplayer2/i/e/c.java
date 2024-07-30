package com.applovin.exoplayer2.i.e;

import a3.l;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15710b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f15711c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15712d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15713e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15714g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15715h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15716a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15717b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15718c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15719d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15720e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15721g;

        /* renamed from: h, reason: collision with root package name */
        public final int f15722h;

        /* renamed from: i, reason: collision with root package name */
        public final int f15723i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f15716a = i10;
            this.f15717b = i11;
            this.f15718c = i12;
            this.f15719d = i13;
            this.f15720e = i14;
            this.f = i15;
            this.f15721g = i16;
            this.f15722h = i17;
            this.f15723i = i18;
        }

        public static a a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < split.length; i18++) {
                String lowerCase = Ascii.toLowerCase(split[i18].trim());
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case -1178781136:
                        if (lowerCase.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (lowerCase.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (lowerCase.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (lowerCase.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (lowerCase.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (lowerCase.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (lowerCase.equals("alignment")) {
                            c10 = 7;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        i15 = i18;
                        break;
                    case 1:
                        i16 = i18;
                        break;
                    case 2:
                        i17 = i18;
                        break;
                    case 3:
                        i12 = i18;
                        break;
                    case 4:
                        i14 = i18;
                        break;
                    case 5:
                        i10 = i18;
                        break;
                    case 6:
                        i13 = i18;
                        break;
                    case 7:
                        i11 = i18;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f15724c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f15725d = Pattern.compile(ai.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f15726e = Pattern.compile(ai.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f15727a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f15728b;

        private b(int i10, PointF pointF) {
            this.f15727a = i10;
            this.f15728b = pointF;
        }

        public static b a(String str) {
            Matcher matcher = f15724c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
                try {
                    PointF c10 = c(str2);
                    if (c10 != null) {
                        pointF = c10;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int d10 = d(str2);
                    if (d10 != -1) {
                        i10 = d10;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        public static String b(String str) {
            return f15724c.matcher(str).replaceAll("");
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f15725d.matcher(str);
            Matcher matcher2 = f15726e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    q.b("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (find2) {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else {
                return null;
            }
            return new PointF(Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(group)).trim()), Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(group2)).trim()));
        }

        private static int d(String str) {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return c.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            return -1;
        }
    }

    private c(String str, int i10, Integer num, float f, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15709a = str;
        this.f15710b = i10;
        this.f15711c = num;
        this.f15712d = f;
        this.f15713e = z10;
        this.f = z11;
        this.f15714g = z12;
        this.f15715h = z13;
    }

    private static boolean a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        l.D("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    private static float d(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            q.b("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            q.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static c a(String str, a aVar) {
        com.applovin.exoplayer2.l.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f15723i;
        if (length != i10) {
            q.c("SsaStyle", ai.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f15716a].trim();
            int i11 = aVar.f15717b;
            int c10 = i11 != -1 ? c(split[i11].trim()) : -1;
            int i12 = aVar.f15718c;
            Integer a10 = i12 != -1 ? a(split[i12].trim()) : null;
            int i13 = aVar.f15719d;
            float d10 = i13 != -1 ? d(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f15720e;
            boolean z10 = i14 != -1 && e(split[i14].trim());
            int i15 = aVar.f;
            boolean z11 = i15 != -1 && e(split[i15].trim());
            int i16 = aVar.f15721g;
            boolean z12 = i16 != -1 && e(split[i16].trim());
            int i17 = aVar.f15722h;
            return new c(trim, c10, a10, d10, z10, z11, z12, i17 != -1 && e(split[i17].trim()));
        } catch (RuntimeException e10) {
            q.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static Integer a(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            com.applovin.exoplayer2.l.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(com.applovin.exoplayer2.common.b.c.a(((parseLong >> 24) & 255) ^ 255), com.applovin.exoplayer2.common.b.c.a(parseLong & 255), com.applovin.exoplayer2.common.b.c.a((parseLong >> 8) & 255), com.applovin.exoplayer2.common.b.c.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            q.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
