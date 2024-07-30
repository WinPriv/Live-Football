package com.applovin.exoplayer2.l;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f16329a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f16330b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16331a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16332b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16333c;
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16334a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16335b;

        public b(int i10, int i11) {
            this.f16334a = i10;
            this.f16335b = i11;
        }

        public int a() {
            int i10 = this.f16335b;
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

    public static String a(int i10) {
        if (i10 == 32) {
            return com.anythink.expressad.exoplayer.k.o.f9078l;
        }
        if (i10 == 33) {
            return com.anythink.expressad.exoplayer.k.o.f9074h;
        }
        if (i10 == 35) {
            return com.anythink.expressad.exoplayer.k.o.f9075i;
        }
        if (i10 == 64) {
            return com.anythink.expressad.exoplayer.k.o.f9083r;
        }
        if (i10 == 163) {
            return com.anythink.expressad.exoplayer.k.o.o;
        }
        if (i10 == 177) {
            return com.anythink.expressad.exoplayer.k.o.f9077k;
        }
        if (i10 == 165) {
            return com.anythink.expressad.exoplayer.k.o.f9090z;
        }
        if (i10 == 166) {
            return com.anythink.expressad.exoplayer.k.o.A;
        }
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

    public static boolean b(String str) {
        return "video".equals(h(str));
    }

    public static boolean c(String str) {
        if (!com.anythink.expressad.exoplayer.k.o.f9070c.equals(h(str)) && !com.anythink.expressad.exoplayer.k.o.W.equals(str) && !com.anythink.expressad.exoplayer.k.o.X.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9067ac.equals(str) && !com.anythink.expressad.exoplayer.k.o.Y.equals(str) && !com.anythink.expressad.exoplayer.k.o.Z.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9065aa.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9066ab.equals(str) && !com.anythink.expressad.exoplayer.k.o.f9068ad.equals(str) && !com.anythink.expressad.exoplayer.k.o.ae.equals(str) && !com.anythink.expressad.exoplayer.k.o.af.equals(str) && !com.anythink.expressad.exoplayer.k.o.aj.equals(str)) {
            return false;
        }
        return true;
    }

    public static String d(String str) {
        b g6;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (!lowerCase.startsWith("avc1") && !lowerCase.startsWith("avc3")) {
            if (!lowerCase.startsWith("hev1") && !lowerCase.startsWith("hvc1")) {
                if (!lowerCase.startsWith("dvav") && !lowerCase.startsWith("dva1") && !lowerCase.startsWith("dvhe") && !lowerCase.startsWith("dvh1")) {
                    if (lowerCase.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!lowerCase.startsWith("vp9") && !lowerCase.startsWith("vp09")) {
                        if (!lowerCase.startsWith("vp8") && !lowerCase.startsWith("vp08")) {
                            if (lowerCase.startsWith("mp4a")) {
                                if (lowerCase.startsWith("mp4a.") && (g6 = g(lowerCase)) != null) {
                                    str2 = a(g6.f16334a);
                                }
                                if (str2 == null) {
                                    return com.anythink.expressad.exoplayer.k.o.f9083r;
                                }
                                return str2;
                            }
                            if (lowerCase.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (lowerCase.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!lowerCase.startsWith("ac-3") && !lowerCase.startsWith("dac3")) {
                                if (!lowerCase.startsWith("ec-3") && !lowerCase.startsWith("dec3")) {
                                    if (lowerCase.startsWith("ec+3")) {
                                        return com.anythink.expressad.exoplayer.k.o.B;
                                    }
                                    if (!lowerCase.startsWith("ac-4") && !lowerCase.startsWith("dac4")) {
                                        if (lowerCase.startsWith("dtsc")) {
                                            return com.anythink.expressad.exoplayer.k.o.D;
                                        }
                                        if (lowerCase.startsWith("dtse")) {
                                            return com.anythink.expressad.exoplayer.k.o.F;
                                        }
                                        if (!lowerCase.startsWith("dtsh") && !lowerCase.startsWith("dtsl")) {
                                            if (lowerCase.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (lowerCase.startsWith("opus")) {
                                                return com.anythink.expressad.exoplayer.k.o.H;
                                            }
                                            if (lowerCase.startsWith("vorbis")) {
                                                return com.anythink.expressad.exoplayer.k.o.G;
                                            }
                                            if (lowerCase.startsWith("flac")) {
                                                return com.anythink.expressad.exoplayer.k.o.K;
                                            }
                                            if (lowerCase.startsWith("stpp")) {
                                                return com.anythink.expressad.exoplayer.k.o.Z;
                                            }
                                            if (lowerCase.startsWith("wvtt")) {
                                                return com.anythink.expressad.exoplayer.k.o.O;
                                            }
                                            if (lowerCase.contains("cea708")) {
                                                return com.anythink.expressad.exoplayer.k.o.X;
                                            }
                                            if (!lowerCase.contains("eia608") && !lowerCase.contains("cea608")) {
                                                return i(lowerCase);
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

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if (!com.anythink.expressad.exoplayer.k.o.V.equals(str) && !com.anythink.expressad.exoplayer.k.o.ai.equals(str) && !com.anythink.expressad.exoplayer.k.o.ag.equals(str)) {
            if (com.anythink.expressad.exoplayer.k.o.ah.equals(str)) {
                return 6;
            }
            return j(str);
        }
        return 5;
    }

    public static String f(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.anythink.expressad.exoplayer.k.o.K;
            case 1:
                return "audio/wav";
            case 2:
                return com.anythink.expressad.exoplayer.k.o.f9085t;
            default:
                return str;
        }
    }

    public static b g(String str) {
        int i10;
        Matcher matcher = f16330b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            } else {
                i10 = 0;
            }
            return new b(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private static String i(String str) {
        int size = f16329a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f16329a.get(i10);
            if (str.startsWith(aVar.f16332b)) {
                return aVar.f16331a;
            }
        }
        return null;
    }

    private static int j(String str) {
        int size = f16329a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f16329a.get(i10);
            if (str.equals(aVar.f16331a)) {
                return aVar.f16333c;
            }
        }
        return -1;
    }

    public static boolean a(String str) {
        return com.anythink.expressad.exoplayer.k.o.f9069b.equals(h(str));
    }

    public static int b(String str, String str2) {
        b g6;
        str.getClass();
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
            case 1505942594:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.E)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(com.anythink.expressad.exoplayer.k.o.C)) {
                    c10 = '\b';
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
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
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
                return (str2 == null || (g6 = g(str2)) == null || (a10 = g6.a()) == 0 || a10 == 16) ? false : true;
            default:
                return false;
        }
    }
}
