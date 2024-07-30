package d6;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeTypes.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f27343a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f27344b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: MimeTypes.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27345a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27346b;

        public b(int i10, int i11) {
            this.f27345a = i10;
            this.f27346b = i11;
        }

        public final int a() {
            int i10 = this.f27346b;
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 29) {
                        if (i10 != 42) {
                            if (i10 != 22) {
                                if (i10 != 23) {
                                    return 0;
                                }
                                return 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    public static boolean a(String str, String str2) {
        b g6;
        int a10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.B)) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9086u)) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9087v)) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9083r)) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9090z)) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9088w)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.A)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.K)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9085t)) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9089x)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.y)) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (g6 = g(str2)) == null || (a10 = g6.a()) == 0 || a10 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.R(str)) {
            String e10 = e(str2);
            if (e10 != null && k(e10)) {
                return e10;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] R = g0.R(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : R) {
            if (str2.equals(e(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() <= 0) {
            return null;
        }
        return sb2.toString();
    }

    public static int d(String str, String str2) {
        b g6;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.B)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.D)) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9083r)) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9090z)) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.A)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.f9085t)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.H)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.E)) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.C)) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (g6 = g(str2)) == null) {
                    return 0;
                }
                return g6.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 20;
            case '\b':
                return 8;
            case '\t':
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        b g6;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String c10 = i7.g.c(str.trim());
        if (!c10.startsWith("avc1") && !c10.startsWith("avc3")) {
            if (!c10.startsWith("hev1") && !c10.startsWith("hvc1")) {
                if (!c10.startsWith("dvav") && !c10.startsWith("dva1") && !c10.startsWith("dvhe") && !c10.startsWith("dvh1")) {
                    if (c10.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!c10.startsWith("vp9") && !c10.startsWith("vp09")) {
                        if (!c10.startsWith("vp8") && !c10.startsWith("vp08")) {
                            if (c10.startsWith("mp4a")) {
                                if (c10.startsWith("mp4a.") && (g6 = g(c10)) != null) {
                                    str2 = f(g6.f27345a);
                                }
                                if (str2 == null) {
                                    return com.anythink.expressad.exoplayer.k.o.f9083r;
                                }
                                return str2;
                            }
                            if (c10.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (c10.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!c10.startsWith("ac-3") && !c10.startsWith("dac3")) {
                                if (!c10.startsWith("ec-3") && !c10.startsWith("dec3")) {
                                    if (c10.startsWith("ec+3")) {
                                        return com.anythink.expressad.exoplayer.k.o.B;
                                    }
                                    if (!c10.startsWith("ac-4") && !c10.startsWith("dac4")) {
                                        if (c10.startsWith("dtsc")) {
                                            return com.anythink.expressad.exoplayer.k.o.D;
                                        }
                                        if (c10.startsWith("dtse")) {
                                            return com.anythink.expressad.exoplayer.k.o.F;
                                        }
                                        if (!c10.startsWith("dtsh") && !c10.startsWith("dtsl")) {
                                            if (c10.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (c10.startsWith("opus")) {
                                                return com.anythink.expressad.exoplayer.k.o.H;
                                            }
                                            if (c10.startsWith("vorbis")) {
                                                return com.anythink.expressad.exoplayer.k.o.G;
                                            }
                                            if (c10.startsWith("flac")) {
                                                return com.anythink.expressad.exoplayer.k.o.K;
                                            }
                                            if (c10.startsWith("stpp")) {
                                                return com.anythink.expressad.exoplayer.k.o.Z;
                                            }
                                            if (c10.startsWith("wvtt")) {
                                                return com.anythink.expressad.exoplayer.k.o.O;
                                            }
                                            if (c10.contains("cea708")) {
                                                return com.anythink.expressad.exoplayer.k.o.X;
                                            }
                                            if (!c10.contains("eia608") && !c10.contains("cea608")) {
                                                ArrayList<a> arrayList = f27343a;
                                                int size = arrayList.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    arrayList.get(i10).getClass();
                                                    if (c10.startsWith(null)) {
                                                        break;
                                                    }
                                                }
                                                return null;
                                            }
                                            return com.anythink.expressad.exoplayer.k.o.W;
                                        }
                                        return com.anythink.expressad.exoplayer.k.o.E;
                                    }
                                    return "audio/ac4";
                                }
                                return com.anythink.expressad.exoplayer.k.o.A;
                            }
                            return com.anythink.expressad.exoplayer.k.o.f9090z;
                        }
                        return com.anythink.expressad.exoplayer.k.o.f9076j;
                    }
                    return com.anythink.expressad.exoplayer.k.o.f9077k;
                }
                return "video/dolby-vision";
            }
            return com.anythink.expressad.exoplayer.k.o.f9075i;
        }
        return com.anythink.expressad.exoplayer.k.o.f9074h;
    }

    public static String f(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 165) {
                                    if (i10 != 166) {
                                        switch (i10) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return com.anythink.expressad.exoplayer.k.o.f9080n;
                                            case 102:
                                            case 103:
                                            case 104:
                                                return com.anythink.expressad.exoplayer.k.o.f9083r;
                                            case 105:
                                            case 107:
                                                return com.anythink.expressad.exoplayer.k.o.f9085t;
                                            case 106:
                                                return com.anythink.expressad.exoplayer.k.o.f9079m;
                                            default:
                                                switch (i10) {
                                                    case 169:
                                                    case 172:
                                                        return com.anythink.expressad.exoplayer.k.o.D;
                                                    case 170:
                                                    case 171:
                                                        return com.anythink.expressad.exoplayer.k.o.E;
                                                    case 173:
                                                        return com.anythink.expressad.exoplayer.k.o.H;
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return com.anythink.expressad.exoplayer.k.o.A;
                                }
                                return com.anythink.expressad.exoplayer.k.o.f9090z;
                            }
                            return com.anythink.expressad.exoplayer.k.o.f9077k;
                        }
                        return com.anythink.expressad.exoplayer.k.o.o;
                    }
                    return com.anythink.expressad.exoplayer.k.o.f9083r;
                }
                return com.anythink.expressad.exoplayer.k.o.f9075i;
            }
            return com.anythink.expressad.exoplayer.k.o.f9074h;
        }
        return com.anythink.expressad.exoplayer.k.o.f9078l;
    }

    public static b g(String str) {
        int i10;
        Matcher matcher = f27344b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i10 = Integer.parseInt(group2);
            } else {
                i10 = 0;
            }
            return new b(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (c.C0119c.f9528e.equals(h(str))) {
            return 4;
        }
        if (!com.anythink.expressad.exoplayer.k.o.V.equals(str) && !com.anythink.expressad.exoplayer.k.o.ai.equals(str) && !com.anythink.expressad.exoplayer.k.o.ag.equals(str)) {
            if (com.anythink.expressad.exoplayer.k.o.ah.equals(str)) {
                return 6;
            }
            ArrayList<a> arrayList = f27343a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).getClass();
                if (str.equals(null)) {
                    return 0;
                }
            }
            return -1;
        }
        return 5;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.R(str)) {
            String e10 = e(str2);
            if (e10 != null && m(e10)) {
                return e10;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return com.anythink.expressad.exoplayer.k.o.f9069b.equals(h(str));
    }

    public static boolean l(String str) {
        if (!com.anythink.expressad.exoplayer.k.o.f9070c.equals(h(str)) && !com.anythink.expressad.exoplayer.k.o.W.equals(str) && !com.anythink.expressad.exoplayer.k.o.X.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9067ac.equals(str) && !com.anythink.expressad.exoplayer.k.o.Y.equals(str) && !com.anythink.expressad.exoplayer.k.o.Z.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9065aa.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9066ab.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9068ad.equals(str) && !com.anythink.expressad.exoplayer.k.o.ae.equals(str) && !com.anythink.expressad.exoplayer.k.o.af.equals(str) && !com.anythink.expressad.exoplayer.k.o.aj.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean m(String str) {
        return "video".equals(h(str));
    }
}
