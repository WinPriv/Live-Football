package com.anythink.expressad.exoplayer.k;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o {
    public static final String A = "audio/eac3";
    public static final String B = "audio/eac3-joc";
    public static final String C = "audio/true-hd";
    public static final String D = "audio/vnd.dts";
    public static final String E = "audio/vnd.dts.hd";
    public static final String F = "audio/vnd.dts.hd;profile=lbr";
    public static final String G = "audio/vorbis";
    public static final String H = "audio/opus";
    public static final String I = "audio/3gpp";
    public static final String J = "audio/amr-wb";
    public static final String K = "audio/flac";
    public static final String L = "audio/alac";
    public static final String M = "audio/gsm";
    public static final String N = "audio/x-unknown";
    public static final String O = "text/vtt";
    public static final String P = "text/x-ssa";
    public static final String Q = "application/mp4";
    public static final String R = "application/webm";
    public static final String S = "application/dash+xml";
    public static final String T = "application/x-mpegURL";
    public static final String U = "application/vnd.ms-sstr+xml";
    public static final String V = "application/id3";
    public static final String W = "application/cea-608";
    public static final String X = "application/cea-708";
    public static final String Y = "application/x-subrip";
    public static final String Z = "application/ttml+xml";

    /* renamed from: a, reason: collision with root package name */
    public static final String f9064a = "video";

    /* renamed from: aa, reason: collision with root package name */
    public static final String f9065aa = "application/x-quicktime-tx3g";

    /* renamed from: ab, reason: collision with root package name */
    public static final String f9066ab = "application/x-mp4-vtt";

    /* renamed from: ac, reason: collision with root package name */
    public static final String f9067ac = "application/x-mp4-cea-608";

    /* renamed from: ad, reason: collision with root package name */
    public static final String f9068ad = "application/x-rawcc";
    public static final String ae = "application/vobsub";
    public static final String af = "application/pgs";
    public static final String ag = "application/x-scte35";
    public static final String ah = "application/x-camera-motion";
    public static final String ai = "application/x-emsg";
    public static final String aj = "application/dvbsubs";
    public static final String ak = "application/x-exif";
    private static final ArrayList<a> al = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final String f9069b = "audio";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9070c = "text";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9071d = "application";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9072e = "video/mp4";
    public static final String f = "video/webm";

    /* renamed from: g, reason: collision with root package name */
    public static final String f9073g = "video/3gpp";

    /* renamed from: h, reason: collision with root package name */
    public static final String f9074h = "video/avc";

    /* renamed from: i, reason: collision with root package name */
    public static final String f9075i = "video/hevc";

    /* renamed from: j, reason: collision with root package name */
    public static final String f9076j = "video/x-vnd.on2.vp8";

    /* renamed from: k, reason: collision with root package name */
    public static final String f9077k = "video/x-vnd.on2.vp9";

    /* renamed from: l, reason: collision with root package name */
    public static final String f9078l = "video/mp4v-es";

    /* renamed from: m, reason: collision with root package name */
    public static final String f9079m = "video/mpeg";

    /* renamed from: n, reason: collision with root package name */
    public static final String f9080n = "video/mpeg2";
    public static final String o = "video/wvc1";

    /* renamed from: p, reason: collision with root package name */
    public static final String f9081p = "video/x-unknown";

    /* renamed from: q, reason: collision with root package name */
    public static final String f9082q = "audio/mp4";

    /* renamed from: r, reason: collision with root package name */
    public static final String f9083r = "audio/mp4a-latm";

    /* renamed from: s, reason: collision with root package name */
    public static final String f9084s = "audio/webm";

    /* renamed from: t, reason: collision with root package name */
    public static final String f9085t = "audio/mpeg";

    /* renamed from: u, reason: collision with root package name */
    public static final String f9086u = "audio/mpeg-L1";

    /* renamed from: v, reason: collision with root package name */
    public static final String f9087v = "audio/mpeg-L2";

    /* renamed from: w, reason: collision with root package name */
    public static final String f9088w = "audio/raw";

    /* renamed from: x, reason: collision with root package name */
    public static final String f9089x = "audio/g711-alaw";
    public static final String y = "audio/g711-mlaw";

    /* renamed from: z, reason: collision with root package name */
    public static final String f9090z = "audio/ac3";

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f9091a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9092b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9093c;

        public a(String str, String str2, int i10) {
            this.f9091a = str;
            this.f9092b = str2;
            this.f9093c = i10;
        }
    }

    private o() {
    }

    public static String a(int i10) {
        if (i10 == 32) {
            return f9078l;
        }
        if (i10 == 33) {
            return f9074h;
        }
        if (i10 == 35) {
            return f9075i;
        }
        if (i10 == 64) {
            return f9083r;
        }
        if (i10 == 163) {
            return o;
        }
        if (i10 == 177) {
            return f9077k;
        }
        if (i10 == 165) {
            return f9090z;
        }
        if (i10 == 166) {
            return A;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return f9080n;
            case 102:
            case 103:
            case 104:
                return f9083r;
            case 105:
            case 107:
                return f9085t;
            case 106:
                return f9079m;
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return D;
                    case 170:
                    case 171:
                        return E;
                    case 173:
                        return H;
                    default:
                        return null;
                }
        }
    }

    public static boolean b(String str) {
        return "video".equals(k(str));
    }

    public static String c(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("avc1") && !trim.startsWith("avc3")) {
            if (!trim.startsWith("hev1") && !trim.startsWith("hvc1")) {
                if (!trim.startsWith("vp9") && !trim.startsWith("vp09")) {
                    if (!trim.startsWith("vp8") && !trim.startsWith("vp08")) {
                        if (trim.startsWith("mp4a")) {
                            if (trim.startsWith("mp4a.")) {
                                String substring = trim.substring(5);
                                if (substring.length() >= 2) {
                                    try {
                                        str2 = a(Integer.parseInt(af.e(substring.substring(0, 2)), 16));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            if (str2 == null) {
                                return f9083r;
                            }
                            return str2;
                        }
                        if (!trim.startsWith("ac-3") && !trim.startsWith("dac3")) {
                            if (!trim.startsWith("ec-3") && !trim.startsWith("dec3")) {
                                if (trim.startsWith("ec+3")) {
                                    return B;
                                }
                                if (!trim.startsWith("dtsc") && !trim.startsWith("dtse")) {
                                    if (!trim.startsWith("dtsh") && !trim.startsWith("dtsl")) {
                                        if (trim.startsWith("opus")) {
                                            return H;
                                        }
                                        if (trim.startsWith("vorbis")) {
                                            return G;
                                        }
                                        int size = al.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            a aVar = al.get(i10);
                                            if (trim.startsWith(aVar.f9092b)) {
                                                return aVar.f9091a;
                                            }
                                        }
                                        return null;
                                    }
                                    return E;
                                }
                                return D;
                            }
                            return A;
                        }
                        return f9090z;
                    }
                    return f9076j;
                }
                return f9077k;
            }
            return f9075i;
        }
        return f9074h;
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (!f9070c.equals(k(str)) && !W.equals(str) && !X.equals(str) && !f9067ac.equals(str) && !Y.equals(str) && !Z.equals(str) && !f9065aa.equals(str) && !f9066ab.equals(str) && !f9068ad.equals(str) && !ae.equals(str) && !af.equals(str) && !aj.equals(str)) {
            if (!V.equals(str) && !ai.equals(str) && !ag.equals(str) && !ah.equals(str)) {
                int size = al.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a aVar = al.get(i10);
                    if (str.equals(aVar.f9091a)) {
                        return aVar.f9093c;
                    }
                }
                return -1;
            }
            return 4;
        }
        return 3;
    }

    public static int e(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(B)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(D)) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(f9090z)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(A)) {
                    c10 = 3;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(E)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(C)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                return 6;
            case 1:
                return 7;
            case 2:
                return 5;
            case 4:
                return 8;
            case 5:
                return 14;
            default:
                return 0;
        }
    }

    public static int f(String str) {
        return d(c(str));
    }

    private static boolean g(String str) {
        return f9070c.equals(k(str));
    }

    private static boolean h(String str) {
        return f9071d.equals(k(str));
    }

    private static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : af.a(str, ",")) {
            String c10 = c(str2);
            if (c10 != null && b(c10)) {
                return c10;
            }
        }
        return null;
    }

    private static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : af.a(str, ",")) {
            String c10 = c(str2);
            if (c10 != null && a(c10)) {
                return c10;
            }
        }
        return null;
    }

    private static String k(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }

    private static String l(String str) {
        int size = al.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = al.get(i10);
            if (str.startsWith(aVar.f9092b)) {
                return aVar.f9091a;
            }
        }
        return null;
    }

    private static int m(String str) {
        int size = al.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = al.get(i10);
            if (str.equals(aVar.f9091a)) {
                return aVar.f9093c;
            }
        }
        return -1;
    }

    private static void a(String str, String str2, int i10) {
        a aVar = new a(str, str2, i10);
        int size = al.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            ArrayList<a> arrayList = al;
            if (str.equals(arrayList.get(i11).f9091a)) {
                arrayList.remove(i11);
                break;
            }
            i11++;
        }
        al.add(aVar);
    }

    public static boolean a(String str) {
        return f9069b.equals(k(str));
    }
}
