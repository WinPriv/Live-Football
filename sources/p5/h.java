package p5;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import c6.d0;
import com.anythink.expressad.exoplayer.k.o;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.huawei.openalliance.ad.constant.w;
import d6.e0;
import d6.g0;
import d6.p;
import j7.j0;
import j7.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.i0;
import k4.z0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p5.e;
import p5.f;

/* compiled from: HlsPlaylistParser.java */
/* loaded from: classes2.dex */
public final class h implements d0.a<g> {

    /* renamed from: a, reason: collision with root package name */
    public final f f34473a;

    /* renamed from: b, reason: collision with root package name */
    public final e f34474b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f34452c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f34453d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f34454e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f34455g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f34456h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f34457i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f34458j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f34459k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f34460l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f34461m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f34462n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f34463p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f34464q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f34465r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f34466s = b("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f34467t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f34468u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f34469v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f34470w = b("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f34471x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f34472z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = b("AUTOSELECT");
    public static final Pattern U = b("DEFAULT");
    public static final Pattern V = b("FORCED");
    public static final Pattern W = b("INDEPENDENT");
    public static final Pattern X = b("GAP");
    public static final Pattern Y = b("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f34450a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f34451b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: classes2.dex */
    public static final class a extends IOException {
    }

    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f34475a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue<String> f34476b;

        /* renamed from: c, reason: collision with root package name */
        public String f34477c;

        public b(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.f34476b = arrayDeque;
            this.f34475a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public final boolean a() throws IOException {
            String trim;
            if (this.f34477c != null) {
                return true;
            }
            Queue<String> queue = this.f34476b;
            if (!queue.isEmpty()) {
                String poll = queue.poll();
                poll.getClass();
                this.f34477c = poll;
                return true;
            }
            do {
                String readLine = this.f34475a.readLine();
                this.f34477c = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.f34477c = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
            return true;
        }

        public final String b() throws IOException {
            if (a()) {
                String str = this.f34477c;
                this.f34477c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public h(f fVar, e eVar) {
        this.f34473a = fVar;
        this.f34474b = eVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i10];
            schemeDataArr2[i10] = new DrmInitData.SchemeData(schemeData.f19910t, schemeData.f19911u, schemeData.f19912v, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData d(String str, String str2, HashMap hashMap) throws z0 {
        String k10 = k(str, J, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = K;
        if (equals) {
            String l10 = l(str, pattern, hashMap);
            return new DrmInitData.SchemeData(k4.g.f30466d, null, "video/mp4", Base64.decode(l10.substring(l10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(k4.g.f30466d, null, "hls", g0.C(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(k10)) {
            return null;
        }
        String l11 = l(str, pattern, hashMap);
        byte[] decode = Base64.decode(l11.substring(l11.indexOf(44)), 0);
        UUID uuid = k4.g.f30467e;
        return new DrmInitData.SchemeData(uuid, null, "video/mp4", x4.h.a(uuid, null, decode));
    }

    public static int e(String str, Pattern pattern) throws z0 {
        return Integer.parseInt(l(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e f(f fVar, e eVar, b bVar, String str) throws IOException {
        boolean z10;
        List list;
        long j10;
        long j11;
        long j12;
        HashMap hashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        boolean z11;
        int i10;
        String str4;
        ArrayList arrayList3;
        int i11;
        String hexString;
        long j13;
        HashMap hashMap5;
        long j14;
        boolean z12;
        DrmInitData drmInitData;
        e.c cVar;
        String hexString2;
        boolean z13;
        long j15;
        String hexString3;
        long j16;
        String str5;
        String str6;
        boolean z14 = fVar.f34449c;
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        e.C0460e c0460e = new e.C0460e(com.anythink.expressad.exoplayer.b.f7291b, false, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, false);
        TreeMap treeMap = new TreeMap();
        String str7 = "";
        e eVar2 = eVar;
        f fVar2 = fVar;
        boolean z15 = z14;
        e.C0460e c0460e2 = c0460e;
        String str8 = "";
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = -1;
        int i12 = 0;
        long j26 = com.anythink.expressad.exoplayer.b.f7291b;
        boolean z16 = false;
        boolean z17 = false;
        int i13 = 0;
        int i14 = 1;
        long j27 = com.anythink.expressad.exoplayer.b.f7291b;
        long j28 = com.anythink.expressad.exoplayer.b.f7291b;
        boolean z18 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z19 = false;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i15 = 0;
        boolean z20 = false;
        e.c cVar2 = null;
        ArrayList arrayList8 = arrayList5;
        e.a aVar = null;
        while (bVar.a()) {
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList7.add(b10);
            }
            if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String l10 = l(b10, f34464q, hashMap6);
                if ("VOD".equals(l10)) {
                    i12 = 1;
                } else if ("EVENT".equals(l10)) {
                    i12 = 2;
                }
            } else if (b10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z20 = true;
            } else if (b10.startsWith("#EXT-X-START")) {
                double parseDouble = Double.parseDouble(l(b10, C, Collections.emptyMap()));
                z16 = h(b10, Y);
                j26 = (long) (parseDouble * 1000000.0d);
                i12 = i12;
            } else {
                int i16 = i12;
                if (b10.startsWith("#EXT-X-SERVER-CONTROL")) {
                    double i17 = i(b10, f34465r);
                    if (i17 == -9.223372036854776E18d) {
                        j10 = com.anythink.expressad.exoplayer.b.f7291b;
                    } else {
                        j10 = (long) (i17 * 1000000.0d);
                    }
                    boolean h10 = h(b10, f34466s);
                    double i18 = i(b10, f34468u);
                    if (i18 == -9.223372036854776E18d) {
                        j11 = com.anythink.expressad.exoplayer.b.f7291b;
                    } else {
                        j11 = (long) (i18 * 1000000.0d);
                    }
                    double i19 = i(b10, f34469v);
                    if (i19 == -9.223372036854776E18d) {
                        j12 = com.anythink.expressad.exoplayer.b.f7291b;
                    } else {
                        j12 = (long) (i19 * 1000000.0d);
                    }
                    c0460e2 = new e.C0460e(j10, h10, j11, j12, h(b10, f34470w));
                } else if (b10.startsWith("#EXT-X-PART-INF")) {
                    j28 = (long) (Double.parseDouble(l(b10, o, Collections.emptyMap())) * 1000000.0d);
                } else {
                    boolean startsWith = b10.startsWith("#EXT-X-MAP");
                    Pattern pattern = E;
                    arrayList2 = arrayList7;
                    Pattern pattern2 = K;
                    if (startsWith) {
                        String l11 = l(b10, pattern2, hashMap6);
                        String k10 = k(b10, pattern, null, hashMap6);
                        if (k10 != null) {
                            int i20 = g0.f27302a;
                            String[] split = k10.split("@", -1);
                            j25 = Long.parseLong(split[0]);
                            if (split.length > 1) {
                                j19 = Long.parseLong(split[1]);
                            }
                        }
                        if (j25 == -1) {
                            j19 = 0;
                        }
                        if (str10 != null && str9 == null) {
                            throw z0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        cVar2 = new e.c(j19, j25, l11, str10, str9);
                        if (j25 != -1) {
                            j19 += j25;
                        }
                        i12 = i16;
                        j25 = -1;
                        arrayList7 = arrayList2;
                    } else {
                        HashMap hashMap8 = hashMap7;
                        e.a aVar2 = aVar;
                        if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                            j27 = e(b10, f34461m) * 1000000;
                        } else if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j18 = Long.parseLong(l(b10, f34471x, Collections.emptyMap()));
                            arrayList = arrayList6;
                            str2 = str7;
                            j20 = j18;
                            str3 = str11;
                            aVar = aVar2;
                            hashMap = hashMap8;
                            hashMap2 = hashMap;
                            arrayList6 = arrayList;
                            str11 = str3;
                            i12 = i16;
                            arrayList7 = arrayList2;
                            hashMap7 = hashMap2;
                            str7 = str2;
                        } else if (b10.startsWith("#EXT-X-VERSION")) {
                            i14 = e(b10, f34463p);
                        } else {
                            if (b10.startsWith("#EXT-X-DEFINE")) {
                                String k11 = k(b10, f34450a0, null, hashMap6);
                                if (k11 != null) {
                                    String str12 = fVar2.f34437l.get(k11);
                                    if (str12 != null) {
                                        hashMap6.put(k11, str12);
                                    }
                                } else {
                                    hashMap6.put(l(b10, P, hashMap6), l(b10, Z, hashMap6));
                                }
                                hashMap3 = hashMap6;
                                arrayList = arrayList6;
                                str2 = str7;
                                str3 = str11;
                                hashMap4 = hashMap8;
                            } else if (b10.startsWith("#EXTINF")) {
                                j23 = new BigDecimal(l(b10, y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                str8 = k(b10, f34472z, str7, hashMap6);
                            } else {
                                if (b10.startsWith("#EXT-X-SKIP")) {
                                    int e10 = e(b10, f34467t);
                                    if (eVar2 != null && arrayList4.isEmpty()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    d6.a.d(z11);
                                    int i21 = g0.f27302a;
                                    int i22 = (int) (j18 - eVar2.f34403k);
                                    int i23 = e10 + i22;
                                    if (i22 >= 0 && i23 <= eVar2.f34409r.size()) {
                                        while (i22 < i23) {
                                            e.c cVar3 = (e.c) eVar2.f34409r.get(i22);
                                            String str13 = str7;
                                            if (j18 != eVar2.f34403k) {
                                                int i24 = (eVar2.f34402j - i13) + cVar3.f34420v;
                                                ArrayList arrayList9 = new ArrayList();
                                                long j29 = j22;
                                                int i25 = 0;
                                                while (true) {
                                                    j0 j0Var = cVar3.E;
                                                    i10 = i23;
                                                    if (i25 >= j0Var.size()) {
                                                        break;
                                                    }
                                                    e.a aVar3 = (e.a) j0Var.get(i25);
                                                    arrayList9.add(new e.a(aVar3.f34417s, aVar3.f34418t, aVar3.f34419u, i24, j29, aVar3.f34422x, aVar3.y, aVar3.f34423z, aVar3.A, aVar3.B, aVar3.C, aVar3.D, aVar3.E));
                                                    j29 += aVar3.f34419u;
                                                    i25++;
                                                    i23 = i10;
                                                    str13 = str13;
                                                    arrayList6 = arrayList6;
                                                }
                                                str4 = str13;
                                                arrayList3 = arrayList6;
                                                cVar3 = new e.c(cVar3.f34417s, cVar3.f34418t, cVar3.D, cVar3.f34419u, i24, j22, cVar3.f34422x, cVar3.y, cVar3.f34423z, cVar3.A, cVar3.B, cVar3.C, arrayList9);
                                            } else {
                                                i10 = i23;
                                                str4 = str13;
                                                arrayList3 = arrayList6;
                                            }
                                            arrayList4.add(cVar3);
                                            j22 += cVar3.f34419u;
                                            long j30 = cVar3.B;
                                            if (j30 != -1) {
                                                j19 = cVar3.A + j30;
                                            }
                                            String str14 = cVar3.f34423z;
                                            if (str14 == null || !str14.equals(Long.toHexString(j20))) {
                                                str9 = str14;
                                            }
                                            j20++;
                                            i22++;
                                            int i26 = cVar3.f34420v;
                                            e.c cVar4 = cVar3.f34418t;
                                            DrmInitData drmInitData4 = cVar3.f34422x;
                                            eVar2 = eVar;
                                            i15 = i26;
                                            str10 = cVar3.y;
                                            cVar2 = cVar4;
                                            drmInitData3 = drmInitData4;
                                            i23 = i10;
                                            j21 = j22;
                                            str7 = str4;
                                            arrayList6 = arrayList3;
                                        }
                                        str2 = str7;
                                        fVar2 = fVar;
                                        eVar2 = eVar;
                                        arrayList = arrayList6;
                                        str3 = str11;
                                        aVar = aVar2;
                                        hashMap2 = hashMap8;
                                    } else {
                                        throw new a();
                                    }
                                } else {
                                    ArrayList arrayList10 = arrayList6;
                                    str2 = str7;
                                    if (b10.startsWith("#EXT-X-KEY")) {
                                        String l12 = l(b10, H, hashMap6);
                                        String k12 = k(b10, I, "identity", hashMap6);
                                        if ("NONE".equals(l12)) {
                                            treeMap.clear();
                                            str5 = null;
                                        } else {
                                            String k13 = k(b10, L, null, hashMap6);
                                            if ("identity".equals(k12)) {
                                                if ("AES-128".equals(l12)) {
                                                    str10 = l(b10, pattern2, hashMap6);
                                                    str9 = k13;
                                                    fVar2 = fVar;
                                                    eVar2 = eVar;
                                                    i12 = i16;
                                                    arrayList7 = arrayList2;
                                                    hashMap7 = hashMap8;
                                                    aVar = aVar2;
                                                    str7 = str2;
                                                    arrayList6 = arrayList10;
                                                }
                                            } else {
                                                String str15 = str11;
                                                if (str15 == null) {
                                                    if (!"SAMPLE-AES-CENC".equals(l12) && !"SAMPLE-AES-CTR".equals(l12)) {
                                                        str6 = com.anythink.expressad.exoplayer.b.bg;
                                                    } else {
                                                        str6 = com.anythink.expressad.exoplayer.b.f7295bd;
                                                    }
                                                    str11 = str6;
                                                } else {
                                                    str11 = str15;
                                                }
                                                DrmInitData.SchemeData d10 = d(b10, k12, hashMap6);
                                                if (d10 != null) {
                                                    treeMap.put(k12, d10);
                                                    str5 = k13;
                                                }
                                            }
                                            str9 = k13;
                                            str10 = null;
                                            fVar2 = fVar;
                                            eVar2 = eVar;
                                            i12 = i16;
                                            arrayList7 = arrayList2;
                                            hashMap7 = hashMap8;
                                            aVar = aVar2;
                                            str7 = str2;
                                            arrayList6 = arrayList10;
                                        }
                                        str9 = str5;
                                        drmInitData3 = null;
                                        str10 = null;
                                        fVar2 = fVar;
                                        eVar2 = eVar;
                                        i12 = i16;
                                        arrayList7 = arrayList2;
                                        hashMap7 = hashMap8;
                                        aVar = aVar2;
                                        str7 = str2;
                                        arrayList6 = arrayList10;
                                    } else {
                                        str3 = str11;
                                        if (b10.startsWith("#EXT-X-BYTERANGE")) {
                                            String l13 = l(b10, D, hashMap6);
                                            int i27 = g0.f27302a;
                                            String[] split2 = l13.split("@", -1);
                                            j25 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j19 = Long.parseLong(split2[1]);
                                            }
                                        } else if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i13 = Integer.parseInt(b10.substring(b10.indexOf(58) + 1));
                                            fVar2 = fVar;
                                            eVar2 = eVar;
                                            aVar = aVar2;
                                            arrayList = arrayList10;
                                            z17 = true;
                                            hashMap2 = hashMap8;
                                        } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                                            i15++;
                                        } else {
                                            if (b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j17 == 0) {
                                                    j17 = g0.J(g0.M(b10.substring(b10.indexOf(58) + 1))) - j22;
                                                } else {
                                                    arrayList = arrayList10;
                                                }
                                            } else if (b10.equals("#EXT-X-GAP")) {
                                                fVar2 = fVar;
                                                eVar2 = eVar;
                                                aVar = aVar2;
                                                arrayList = arrayList10;
                                                z19 = true;
                                                hashMap2 = hashMap8;
                                            } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                fVar2 = fVar;
                                                eVar2 = eVar;
                                                aVar = aVar2;
                                                arrayList = arrayList10;
                                                z15 = true;
                                                hashMap2 = hashMap8;
                                            } else if (b10.equals("#EXT-X-ENDLIST")) {
                                                fVar2 = fVar;
                                                eVar2 = eVar;
                                                aVar = aVar2;
                                                arrayList = arrayList10;
                                                z18 = true;
                                                hashMap2 = hashMap8;
                                            } else if (b10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long j31 = j(b10, A);
                                                Matcher matcher = B.matcher(b10);
                                                if (matcher.find()) {
                                                    String group = matcher.group(1);
                                                    group.getClass();
                                                    i11 = Integer.parseInt(group);
                                                } else {
                                                    i11 = -1;
                                                }
                                                e.b bVar2 = new e.b(Uri.parse(e0.c(str, l(b10, pattern2, hashMap6))), j31, i11);
                                                arrayList = arrayList10;
                                                arrayList.add(bVar2);
                                            } else {
                                                arrayList = arrayList10;
                                                if (b10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (aVar2 == null && "PART".equals(l(b10, N, hashMap6))) {
                                                        String l14 = l(b10, pattern2, hashMap6);
                                                        long j32 = j(b10, F);
                                                        long j33 = j(b10, G);
                                                        if (str10 == null) {
                                                            hexString3 = null;
                                                        } else if (str9 != null) {
                                                            hexString3 = str9;
                                                        } else {
                                                            hexString3 = Long.toHexString(j20);
                                                        }
                                                        if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                            DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            DrmInitData drmInitData5 = new DrmInitData(str3, true, schemeDataArr);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = c(str3, schemeDataArr);
                                                            }
                                                            drmInitData3 = drmInitData5;
                                                        }
                                                        if (j32 != -1 && j33 == -1) {
                                                            aVar = aVar2;
                                                        } else {
                                                            if (j32 != -1) {
                                                                j16 = j32;
                                                            } else {
                                                                j16 = 0;
                                                            }
                                                            aVar = new e.a(l14, cVar2, 0L, i15, j21, drmInitData3, str10, hexString3, j16, j33, false, false, true);
                                                        }
                                                        fVar2 = fVar;
                                                        eVar2 = eVar;
                                                        hashMap2 = hashMap8;
                                                    }
                                                } else if (b10.startsWith("#EXT-X-PART")) {
                                                    if (str10 == null) {
                                                        hexString2 = null;
                                                    } else if (str9 != null) {
                                                        hexString2 = str9;
                                                    } else {
                                                        hexString2 = Long.toHexString(j20);
                                                    }
                                                    String l15 = l(b10, pattern2, hashMap6);
                                                    long parseDouble2 = (long) (Double.parseDouble(l(b10, f34462n, Collections.emptyMap())) * 1000000.0d);
                                                    boolean h11 = h(b10, W);
                                                    if (z15 && arrayList8.isEmpty()) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    boolean z21 = h11 | z13;
                                                    boolean h12 = h(b10, X);
                                                    String k14 = k(b10, pattern, null, hashMap6);
                                                    if (k14 != null) {
                                                        int i28 = g0.f27302a;
                                                        String[] split3 = k14.split("@", -1);
                                                        j15 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j24 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j15 = -1;
                                                    }
                                                    if (j15 == -1) {
                                                        j24 = 0;
                                                    }
                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData6 = new DrmInitData(str3, true, schemeDataArr2);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = c(str3, schemeDataArr2);
                                                        }
                                                        drmInitData3 = drmInitData6;
                                                    }
                                                    arrayList8.add(new e.a(l15, cVar2, parseDouble2, i15, j21, drmInitData3, str10, hexString2, j24, j15, h12, z21, false));
                                                    j21 += parseDouble2;
                                                    if (j15 != -1) {
                                                        j24 += j15;
                                                    }
                                                    fVar2 = fVar;
                                                    eVar2 = eVar;
                                                    arrayList6 = arrayList;
                                                    str11 = str3;
                                                    i12 = i16;
                                                    arrayList7 = arrayList2;
                                                    hashMap7 = hashMap8;
                                                    aVar = aVar2;
                                                    str7 = str2;
                                                } else if (!b10.startsWith("#")) {
                                                    if (str10 == null) {
                                                        hexString = null;
                                                    } else if (str9 != null) {
                                                        hexString = str9;
                                                    } else {
                                                        hexString = Long.toHexString(j20);
                                                    }
                                                    long j34 = j20 + 1;
                                                    String m10 = m(b10, hashMap6);
                                                    e.c cVar5 = (e.c) hashMap8.get(m10);
                                                    if (j25 == -1) {
                                                        j13 = 0;
                                                    } else {
                                                        if (z20 && cVar2 == null && cVar5 == null) {
                                                            cVar5 = new e.c(0L, j19, m10, null, null);
                                                            hashMap8.put(m10, cVar5);
                                                        }
                                                        j13 = j19;
                                                    }
                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                        hashMap5 = hashMap6;
                                                        j14 = j34;
                                                        z12 = false;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        drmInitData = new DrmInitData(str3, true, schemeDataArr3);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = c(str3, schemeDataArr3);
                                                        }
                                                    } else {
                                                        hashMap5 = hashMap6;
                                                        j14 = j34;
                                                        z12 = false;
                                                        drmInitData = drmInitData3;
                                                    }
                                                    if (cVar2 != null) {
                                                        cVar = cVar2;
                                                    } else {
                                                        cVar = cVar5;
                                                    }
                                                    arrayList4.add(new e.c(m10, cVar, str8, j23, i15, j22, drmInitData, str10, hexString, j13, j25, z19, arrayList8));
                                                    j21 = j22 + j23;
                                                    arrayList8 = new ArrayList();
                                                    if (j25 != -1) {
                                                        j13 += j25;
                                                    }
                                                    j19 = j13;
                                                    fVar2 = fVar;
                                                    eVar2 = eVar;
                                                    z19 = z12;
                                                    str11 = str3;
                                                    drmInitData3 = drmInitData;
                                                    hashMap7 = hashMap8;
                                                    i12 = i16;
                                                    j23 = 0;
                                                    j25 = -1;
                                                    j22 = j21;
                                                    hashMap6 = hashMap5;
                                                    j20 = j14;
                                                    arrayList7 = arrayList2;
                                                    aVar = aVar2;
                                                    str7 = str2;
                                                    str8 = str7;
                                                    arrayList6 = arrayList;
                                                }
                                            }
                                            hashMap3 = hashMap6;
                                            hashMap4 = hashMap8;
                                        }
                                        fVar2 = fVar;
                                        eVar2 = eVar;
                                        aVar = aVar2;
                                        arrayList = arrayList10;
                                        hashMap2 = hashMap8;
                                    }
                                }
                                arrayList6 = arrayList;
                                str11 = str3;
                                i12 = i16;
                                arrayList7 = arrayList2;
                                hashMap7 = hashMap2;
                                str7 = str2;
                            }
                            fVar2 = fVar;
                            eVar2 = eVar;
                            arrayList6 = arrayList;
                            str11 = str3;
                            hashMap7 = hashMap4;
                            i12 = i16;
                            hashMap6 = hashMap3;
                            arrayList7 = arrayList2;
                            aVar = aVar2;
                            str7 = str2;
                        }
                        arrayList = arrayList6;
                        str2 = str7;
                        str3 = str11;
                        aVar = aVar2;
                        hashMap = hashMap8;
                        hashMap2 = hashMap;
                        arrayList6 = arrayList;
                        str11 = str3;
                        i12 = i16;
                        arrayList7 = arrayList2;
                        hashMap7 = hashMap2;
                        str7 = str2;
                    }
                }
                hashMap = hashMap7;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                str2 = str7;
                str3 = str11;
                hashMap2 = hashMap;
                arrayList6 = arrayList;
                str11 = str3;
                i12 = i16;
                arrayList7 = arrayList2;
                hashMap7 = hashMap2;
                str7 = str2;
            }
        }
        int i29 = i12;
        e.a aVar4 = aVar;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList7;
        HashMap hashMap9 = new HashMap();
        for (int i30 = 0; i30 < arrayList11.size(); i30++) {
            e.b bVar3 = (e.b) arrayList11.get(i30);
            long j35 = bVar3.f34415b;
            if (j35 == -1) {
                j35 = (j18 + arrayList4.size()) - (arrayList8.isEmpty() ? 1L : 0L);
            }
            int i31 = bVar3.f34416c;
            if (i31 == -1 && j28 != com.anythink.expressad.exoplayer.b.f7291b) {
                if (arrayList8.isEmpty()) {
                    list = ((e.c) r.B(arrayList4)).E;
                } else {
                    list = arrayList8;
                }
                i31 = list.size() - 1;
                Uri uri = bVar3.f34414a;
                hashMap9.put(uri, new e.b(uri, j35, i31));
            }
            Uri uri2 = bVar3.f34414a;
            hashMap9.put(uri2, new e.b(uri2, j35, i31));
        }
        if (aVar4 != null) {
            arrayList8.add(aVar4);
        }
        if (j17 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new e(i29, str, arrayList12, j26, z16, j17, z17, i13, j18, i14, j27, j28, z15, z18, z10, drmInitData2, arrayList4, arrayList8, c0460e2, hashMap9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    public static f g(b bVar, String str) throws IOException {
        ArrayList arrayList;
        String str2;
        int i10;
        int i11;
        Uri d10;
        char c10;
        i0 i0Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        f.b bVar2;
        String str3;
        ArrayList arrayList4;
        i0 i0Var2;
        i0 i0Var3;
        int parseInt;
        String str4;
        f.b bVar3;
        String str5;
        f.b bVar4;
        HashSet hashSet;
        HashMap hashMap;
        boolean z10;
        int i12;
        ArrayList arrayList5;
        int i13;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i14;
        int i15;
        ArrayList arrayList9;
        float f10;
        Uri d11;
        HashMap hashMap2;
        String str6;
        String str7 = str;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean a10 = bVar.a();
            Pattern pattern = K;
            String str8 = o.T;
            boolean z13 = z11;
            Pattern pattern2 = P;
            if (a10) {
                String b10 = bVar.b();
                ArrayList arrayList18 = arrayList14;
                if (b10.startsWith("#EXT")) {
                    arrayList17.add(b10);
                }
                boolean startsWith = b10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                ArrayList arrayList19 = arrayList17;
                if (b10.startsWith("#EXT-X-DEFINE")) {
                    hashMap4.put(l(b10, pattern2, hashMap4), l(b10, Z, hashMap4));
                } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z11 = true;
                    arrayList9 = arrayList15;
                    arrayList8 = arrayList11;
                    arrayList7 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList5 = arrayList16;
                    hashMap2 = hashMap3;
                    hashMap3 = hashMap2;
                    arrayList14 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList5;
                    arrayList13 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                    arrayList15 = arrayList9;
                } else if (b10.startsWith("#EXT-X-MEDIA")) {
                    arrayList15.add(b10);
                } else if (b10.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData d12 = d(b10, k(b10, I, "identity", hashMap4), hashMap4);
                    if (d12 != null) {
                        String l10 = l(b10, H, hashMap4);
                        if (!"SAMPLE-AES-CENC".equals(l10) && !"SAMPLE-AES-CTR".equals(l10)) {
                            str6 = com.anythink.expressad.exoplayer.b.bg;
                        } else {
                            str6 = com.anythink.expressad.exoplayer.b.f7295bd;
                        }
                        arrayList16.add(new DrmInitData(str6, true, d12));
                    }
                } else if (b10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = b10.contains("CLOSED-CAPTIONS=NONE") | z12;
                    if (startsWith) {
                        i12 = 16384;
                    } else {
                        i12 = 0;
                    }
                    int e10 = e(b10, f34456h);
                    Matcher matcher = f34452c.matcher(b10);
                    if (matcher.find()) {
                        arrayList5 = arrayList16;
                        String group = matcher.group(1);
                        group.getClass();
                        i13 = Integer.parseInt(group);
                    } else {
                        arrayList5 = arrayList16;
                        i13 = -1;
                    }
                    arrayList6 = arrayList13;
                    String k10 = k(b10, f34458j, null, hashMap4);
                    arrayList7 = arrayList12;
                    String k11 = k(b10, f34459k, null, hashMap4);
                    if (k11 != null) {
                        int i16 = g0.f27302a;
                        arrayList8 = arrayList11;
                        String[] split = k11.split("x", -1);
                        i14 = Integer.parseInt(split[0]);
                        i15 = Integer.parseInt(split[1]);
                        if (i14 <= 0 || i15 <= 0) {
                            i15 = -1;
                            i14 = -1;
                        }
                    } else {
                        arrayList8 = arrayList11;
                        i14 = -1;
                        i15 = -1;
                    }
                    arrayList9 = arrayList15;
                    String k12 = k(b10, f34460l, null, hashMap4);
                    if (k12 != null) {
                        f10 = Float.parseFloat(k12);
                    } else {
                        f10 = -1.0f;
                    }
                    HashMap hashMap5 = hashMap3;
                    String k13 = k(b10, f34453d, null, hashMap4);
                    String k14 = k(b10, f34454e, null, hashMap4);
                    String k15 = k(b10, f, null, hashMap4);
                    String k16 = k(b10, f34455g, null, hashMap4);
                    if (startsWith) {
                        d11 = e0.d(str7, l(b10, pattern, hashMap4));
                    } else if (bVar.a()) {
                        d11 = e0.d(str7, m(bVar.b(), hashMap4));
                    } else {
                        throw z0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    i0.a aVar = new i0.a();
                    aVar.b(arrayList10.size());
                    aVar.f30533j = o.T;
                    aVar.f30531h = k10;
                    aVar.f = i13;
                    aVar.f30530g = e10;
                    aVar.f30538p = i14;
                    aVar.f30539q = i15;
                    aVar.f30540r = f10;
                    aVar.f30529e = i12;
                    arrayList10.add(new f.b(d11, new i0(aVar), k13, k14, k15, k16));
                    hashMap2 = hashMap5;
                    ArrayList arrayList20 = (ArrayList) hashMap2.get(d11);
                    if (arrayList20 == null) {
                        arrayList20 = new ArrayList();
                        hashMap2.put(d11, arrayList20);
                    }
                    arrayList20.add(new HlsTrackMetadataEntry.VariantInfo(i13, e10, k13, k14, k15, k16));
                    z11 = z13;
                    z12 = contains;
                    hashMap3 = hashMap2;
                    arrayList14 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList5;
                    arrayList13 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                    arrayList15 = arrayList9;
                }
                z11 = z13;
                arrayList9 = arrayList15;
                arrayList8 = arrayList11;
                arrayList7 = arrayList12;
                arrayList6 = arrayList13;
                arrayList5 = arrayList16;
                hashMap2 = hashMap3;
                hashMap3 = hashMap2;
                arrayList14 = arrayList18;
                arrayList17 = arrayList19;
                arrayList16 = arrayList5;
                arrayList13 = arrayList6;
                arrayList12 = arrayList7;
                arrayList11 = arrayList8;
                arrayList15 = arrayList9;
            } else {
                ArrayList arrayList21 = arrayList15;
                ArrayList arrayList22 = arrayList11;
                ArrayList arrayList23 = arrayList12;
                ArrayList arrayList24 = arrayList13;
                ArrayList arrayList25 = arrayList14;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = arrayList16;
                HashMap hashMap6 = hashMap3;
                ArrayList arrayList28 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i17 = 0;
                while (i17 < arrayList10.size()) {
                    f.b bVar5 = (f.b) arrayList10.get(i17);
                    if (hashSet2.add(bVar5.f34442a)) {
                        i0 i0Var4 = bVar5.f34443b;
                        if (i0Var4.B == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d6.a.d(z10);
                        ArrayList arrayList29 = (ArrayList) hashMap6.get(bVar5.f34442a);
                        arrayList29.getClass();
                        Metadata metadata = new Metadata(new HlsTrackMetadataEntry(null, null, arrayList29));
                        i0.a aVar2 = new i0.a(i0Var4);
                        aVar2.f30532i = metadata;
                        hashSet = hashSet2;
                        hashMap = hashMap6;
                        arrayList28.add(new f.b(bVar5.f34442a, new i0(aVar2), bVar5.f34444c, bVar5.f34445d, bVar5.f34446e, bVar5.f));
                    } else {
                        hashSet = hashSet2;
                        hashMap = hashMap6;
                    }
                    i17++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                int i18 = 0;
                ArrayList arrayList30 = null;
                i0 i0Var5 = null;
                while (i18 < arrayList21.size()) {
                    String str9 = (String) arrayList21.get(i18);
                    String l11 = l(str9, Q, hashMap4);
                    String l12 = l(str9, pattern2, hashMap4);
                    i0.a aVar3 = new i0.a();
                    aVar3.f30525a = e0.i.f(l11, w.bE, l12);
                    aVar3.f30526b = l12;
                    aVar3.f30533j = str8;
                    boolean h10 = h(str9, U);
                    Pattern pattern3 = pattern2;
                    boolean z14 = h10;
                    if (h(str9, V)) {
                        z14 = (h10 ? 1 : 0) | 2;
                    }
                    ?? r52 = z14;
                    if (h(str9, T)) {
                        r52 = (z14 ? 1 : 0) | 4;
                    }
                    aVar3.f30528d = r52;
                    String k17 = k(str9, R, null, hashMap4);
                    if (TextUtils.isEmpty(k17)) {
                        i11 = 0;
                        str2 = str8;
                    } else {
                        int i19 = g0.f27302a;
                        str2 = str8;
                        String[] split2 = k17.split(",", -1);
                        if (g0.j(split2, "public.accessibility.describes-video")) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        if (g0.j(split2, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (g0.j(split2, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (g0.j(split2, "public.easy-to-read")) {
                            i11 = i10 | 8192;
                        } else {
                            i11 = i10;
                        }
                    }
                    aVar3.f30529e = i11;
                    aVar3.f30527c = k(str9, O, null, hashMap4);
                    String k18 = k(str9, pattern, null, hashMap4);
                    if (k18 == null) {
                        d10 = null;
                    } else {
                        d10 = e0.d(str7, k18);
                    }
                    Pattern pattern4 = pattern;
                    Metadata metadata2 = new Metadata(new HlsTrackMetadataEntry(l11, l12, Collections.emptyList()));
                    String l13 = l(str9, M, hashMap4);
                    switch (l13.hashCode()) {
                        case -959297733:
                            if (l13.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -333210994:
                            if (l13.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 62628790:
                            if (l13.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 81665115:
                            if (l13.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    c10 = 65535;
                    if (c10 != 0) {
                        if (c10 != 1) {
                            if (c10 != 2) {
                                if (c10 == 3) {
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 < arrayList10.size()) {
                                            bVar4 = (f.b) arrayList10.get(i20);
                                            if (!l11.equals(bVar4.f34444c)) {
                                                i20++;
                                            }
                                        } else {
                                            bVar4 = null;
                                        }
                                    }
                                    if (bVar4 != null) {
                                        i0 i0Var6 = bVar4.f34443b;
                                        String p10 = g0.p(2, i0Var6.A);
                                        aVar3.f30531h = p10;
                                        aVar3.f30534k = d6.r.e(p10);
                                        aVar3.f30538p = i0Var6.I;
                                        aVar3.f30539q = i0Var6.J;
                                        aVar3.f30540r = i0Var6.K;
                                    }
                                    if (d10 != null) {
                                        aVar3.f30532i = metadata2;
                                        arrayList3 = arrayList22;
                                        arrayList3.add(new f.a(d10, new i0(aVar3), l12));
                                        i0Var = i0Var5;
                                        arrayList4 = arrayList24;
                                        arrayList2 = arrayList23;
                                    }
                                }
                                arrayList3 = arrayList22;
                                i0Var = i0Var5;
                                arrayList4 = arrayList24;
                                arrayList2 = arrayList23;
                            } else {
                                arrayList3 = arrayList22;
                                int i21 = 0;
                                while (true) {
                                    if (i21 < arrayList10.size()) {
                                        bVar3 = (f.b) arrayList10.get(i21);
                                        i0Var3 = i0Var5;
                                        if (!l11.equals(bVar3.f34445d)) {
                                            i21++;
                                            i0Var5 = i0Var3;
                                        }
                                    } else {
                                        i0Var3 = i0Var5;
                                        bVar3 = null;
                                    }
                                }
                                if (bVar3 != null) {
                                    String p11 = g0.p(1, bVar3.f34443b.A);
                                    aVar3.f30531h = p11;
                                    str5 = d6.r.e(p11);
                                } else {
                                    str5 = null;
                                }
                                String k19 = k(str9, f34457i, null, hashMap4);
                                if (k19 != null) {
                                    int i22 = g0.f27302a;
                                    aVar3.f30546x = Integer.parseInt(k19.split("/", 2)[0]);
                                    if (o.A.equals(str5) && k19.endsWith("/JOC")) {
                                        aVar3.f30531h = "ec+3";
                                        str5 = o.B;
                                    }
                                }
                                aVar3.f30534k = str5;
                                if (d10 != null) {
                                    aVar3.f30532i = metadata2;
                                    arrayList2 = arrayList23;
                                    arrayList2.add(new f.a(d10, new i0(aVar3), l12));
                                } else {
                                    arrayList2 = arrayList23;
                                    if (bVar3 != null) {
                                        i0Var2 = new i0(aVar3);
                                        arrayList4 = arrayList24;
                                        i18++;
                                        arrayList24 = arrayList4;
                                        arrayList23 = arrayList2;
                                        arrayList22 = arrayList3;
                                        pattern2 = pattern3;
                                        str8 = str2;
                                        pattern = pattern4;
                                        i0Var5 = i0Var2;
                                        str7 = str;
                                    }
                                }
                            }
                        } else {
                            i0Var3 = i0Var5;
                            arrayList2 = arrayList23;
                            arrayList3 = arrayList22;
                            String l14 = l(str9, S, hashMap4);
                            if (l14.startsWith("CC")) {
                                parseInt = Integer.parseInt(l14.substring(2));
                                str4 = o.W;
                            } else {
                                parseInt = Integer.parseInt(l14.substring(7));
                                str4 = o.X;
                            }
                            if (arrayList30 == null) {
                                arrayList30 = new ArrayList();
                            }
                            aVar3.f30534k = str4;
                            aVar3.C = parseInt;
                            arrayList30.add(new i0(aVar3));
                        }
                        i0Var2 = i0Var3;
                        arrayList4 = arrayList24;
                        i18++;
                        arrayList24 = arrayList4;
                        arrayList23 = arrayList2;
                        arrayList22 = arrayList3;
                        pattern2 = pattern3;
                        str8 = str2;
                        pattern = pattern4;
                        i0Var5 = i0Var2;
                        str7 = str;
                    } else {
                        i0Var = i0Var5;
                        arrayList2 = arrayList23;
                        arrayList3 = arrayList22;
                        int i23 = 0;
                        while (true) {
                            if (i23 < arrayList10.size()) {
                                bVar2 = (f.b) arrayList10.get(i23);
                                if (!l11.equals(bVar2.f34446e)) {
                                    i23++;
                                }
                            } else {
                                bVar2 = null;
                            }
                        }
                        if (bVar2 != null) {
                            String p12 = g0.p(3, bVar2.f34443b.A);
                            aVar3.f30531h = p12;
                            str3 = d6.r.e(p12);
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = o.O;
                        }
                        aVar3.f30534k = str3;
                        aVar3.f30532i = metadata2;
                        if (d10 != null) {
                            arrayList4 = arrayList24;
                            arrayList4.add(new f.a(d10, new i0(aVar3), l12));
                        } else {
                            arrayList4 = arrayList24;
                            p.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                        }
                    }
                    i0Var2 = i0Var;
                    i18++;
                    arrayList24 = arrayList4;
                    arrayList23 = arrayList2;
                    arrayList22 = arrayList3;
                    pattern2 = pattern3;
                    str8 = str2;
                    pattern = pattern4;
                    i0Var5 = i0Var2;
                    str7 = str;
                }
                i0 i0Var7 = i0Var5;
                ArrayList arrayList31 = arrayList24;
                ArrayList arrayList32 = arrayList23;
                ArrayList arrayList33 = arrayList22;
                if (z12) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = arrayList30;
                }
                return new f(str, arrayList26, arrayList28, arrayList33, arrayList32, arrayList31, arrayList25, i0Var7, arrayList, z13, hashMap4, arrayList27);
            }
        }
    }

    public static boolean h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String k(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return m(str2, map);
        }
        return str2;
    }

    public static String l(String str, Pattern pattern, Map<String, String> map) throws z0 {
        String k10 = k(str, pattern, null, map);
        if (k10 != null) {
            return k10;
        }
        throw z0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String m(String str, Map<String, String> map) {
        Matcher matcher = f34451b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[Catch: all -> 0x003b, LOOP:0: B:13:0x006c->B:38:0x006c, LOOP_START, TryCatch #2 {all -> 0x003b, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x006c, B:15:0x0072, B:18:0x007d, B:57:0x0085, B:20:0x0096, B:22:0x009e, B:24:0x00a6, B:26:0x00ae, B:28:0x00b6, B:30:0x00be, B:32:0x00c6, B:34:0x00ce, B:36:0x00d7, B:41:0x00db, B:69:0x0101, B:70:0x0107, B:74:0x0030, B:76:0x0036, B:81:0x0042, B:83:0x004b, B:88:0x0054, B:90:0x005a, B:92:0x0060, B:94:0x0065), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0101 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x006c, B:15:0x0072, B:18:0x007d, B:57:0x0085, B:20:0x0096, B:22:0x009e, B:24:0x00a6, B:26:0x00ae, B:28:0x00b6, B:30:0x00be, B:32:0x00c6, B:34:0x00ce, B:36:0x00d7, B:41:0x00db, B:69:0x0101, B:70:0x0107, B:74:0x0030, B:76:0x0036, B:81:0x0042, B:83:0x004b, B:88:0x0054, B:90:0x005a, B:92:0x0060, B:94:0x0065), top: B:2:0x000f }] */
    @Override // c6.d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r7, c6.l r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.h.a(android.net.Uri, c6.l):java.lang.Object");
    }
}
