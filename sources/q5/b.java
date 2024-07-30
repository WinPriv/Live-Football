package q5;

import a3.k;
import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import c6.d0;
import com.anythink.core.common.t;
import com.anythink.expressad.exoplayer.k.o;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.UUID;
import k4.i0;
import k4.z0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q5.a;
import x4.h;
import x4.l;

/* compiled from: SsManifestParser.java */
/* loaded from: classes2.dex */
public final class b implements d0.a<q5.a> {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f34677a;

    /* compiled from: SsManifestParser.java */
    /* renamed from: q5.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0463b extends z0 {
        public C0463b(String str) {
            super("Missing required field: ".concat(str), null, true, 4);
        }
    }

    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f34682e;
        public UUID f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f34683g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        @Override // q5.b.a
        public final Object b() {
            UUID uuid = this.f;
            byte[] a10 = h.a(uuid, null, this.f34683g);
            byte[] bArr = this.f34683g;
            l[] lVarArr = new l[1];
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            byte b10 = decode[0];
            decode[0] = decode[3];
            decode[3] = b10;
            byte b11 = decode[1];
            decode[1] = decode[2];
            decode[2] = b11;
            byte b12 = decode[4];
            decode[4] = decode[5];
            decode[5] = b12;
            byte b13 = decode[6];
            decode[6] = decode[7];
            decode[7] = b13;
            lVarArr[0] = new l(true, null, 8, decode, 0, 0, null);
            return new a.C0462a(uuid, a10, lVarArr);
        }

        @Override // q5.b.a
        public final boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // q5.b.a
        public final void f(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f34682e = false;
            }
        }

        @Override // q5.b.a
        public final void j(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f34682e = true;
                String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
                if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                    attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
                }
                this.f = UUID.fromString(attributeValue);
            }
        }

        @Override // q5.b.a
        public final void k(XmlPullParser xmlPullParser) {
            if (this.f34682e) {
                this.f34683g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public i0 f34684e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[LOOP:2: B:18:0x0066->B:24:0x0082, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[EDGE_INSN: B:25:0x0086->B:26:0x0086 BREAK  A[LOOP:2: B:18:0x0066->B:24:0x0082], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.util.ArrayList m(java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.b.d.m(java.lang.String):java.util.ArrayList");
        }

        @Override // q5.b.a
        public final Object b() {
            return this.f34684e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
        @Override // q5.b.a
        public final void j(XmlPullParser xmlPullParser) throws z0 {
            String str;
            i0.a aVar = new i0.a();
            String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
            if (attributeValue != null) {
                if (!attributeValue.equalsIgnoreCase("H264") && !attributeValue.equalsIgnoreCase("X264") && !attributeValue.equalsIgnoreCase("AVC1") && !attributeValue.equalsIgnoreCase("DAVC")) {
                    if (!attributeValue.equalsIgnoreCase("AAC") && !attributeValue.equalsIgnoreCase("AACL") && !attributeValue.equalsIgnoreCase("AACH") && !attributeValue.equalsIgnoreCase("AACP")) {
                        if (!attributeValue.equalsIgnoreCase("TTML") && !attributeValue.equalsIgnoreCase("DFXP")) {
                            if (!attributeValue.equalsIgnoreCase("ac-3") && !attributeValue.equalsIgnoreCase("dac3")) {
                                if (!attributeValue.equalsIgnoreCase("ec-3") && !attributeValue.equalsIgnoreCase("dec3")) {
                                    if (attributeValue.equalsIgnoreCase("dtsc")) {
                                        str = o.D;
                                    } else if (!attributeValue.equalsIgnoreCase("dtsh") && !attributeValue.equalsIgnoreCase("dtsl")) {
                                        if (attributeValue.equalsIgnoreCase("dtse")) {
                                            str = o.F;
                                        } else if (attributeValue.equalsIgnoreCase("opus")) {
                                            str = o.H;
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = o.E;
                                    }
                                } else {
                                    str = o.A;
                                }
                            } else {
                                str = o.f9090z;
                            }
                        } else {
                            str = o.Z;
                        }
                    } else {
                        str = o.f9083r;
                    }
                } else {
                    str = o.f9074h;
                }
                int intValue = ((Integer) c("Type")).intValue();
                if (intValue == 2) {
                    ArrayList m10 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                    aVar.f30533j = "video/mp4";
                    aVar.f30538p = a.i(xmlPullParser, "MaxWidth");
                    aVar.f30539q = a.i(xmlPullParser, "MaxHeight");
                    aVar.f30536m = m10;
                } else {
                    int i10 = 0;
                    if (intValue == 1) {
                        if (str == null) {
                            str = o.f9083r;
                        }
                        int i11 = a.i(xmlPullParser, "Channels");
                        int i12 = a.i(xmlPullParser, "SamplingRate");
                        ArrayList m11 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                        boolean isEmpty = m11.isEmpty();
                        ArrayList arrayList = m11;
                        if (isEmpty) {
                            arrayList = m11;
                            if (o.f9083r.equals(str)) {
                                int i13 = -1;
                                for (int i14 = 0; i14 < 13; i14++) {
                                    if (i12 == m4.a.f32666a[i14]) {
                                        i13 = i14;
                                    }
                                }
                                int i15 = -1;
                                while (i10 < 16) {
                                    if (i11 == m4.a.f32667b[i10]) {
                                        i15 = i10;
                                    }
                                    i10++;
                                }
                                if (i12 != -1 && i15 != -1) {
                                    arrayList = Collections.singletonList(m4.a.a(2, i13, i15));
                                } else {
                                    throw new IllegalArgumentException(k.j("Invalid sample rate or number of channels: ", i12, ", ", i11));
                                }
                            }
                        }
                        aVar.f30533j = o.f9082q;
                        aVar.f30546x = i11;
                        aVar.y = i12;
                        aVar.f30536m = arrayList;
                    } else if (intValue == 3) {
                        String str2 = (String) c("Subtype");
                        if (str2 != null) {
                            if (!str2.equals("CAPT")) {
                                if (str2.equals("DESC")) {
                                    i10 = 1024;
                                }
                            } else {
                                i10 = 64;
                            }
                        }
                        aVar.f30533j = o.Q;
                        aVar.f30529e = i10;
                    } else {
                        aVar.f30533j = o.Q;
                    }
                }
                aVar.f30525a = xmlPullParser.getAttributeValue(null, "Index");
                aVar.f30526b = (String) c("Name");
                aVar.f30534k = str;
                aVar.f = a.i(xmlPullParser, "Bitrate");
                aVar.f30527c = (String) c("Language");
                this.f34684e = new i0(aVar);
                return;
            }
            throw new C0463b("FourCC");
        }
    }

    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        public final LinkedList f34685e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f34686g;

        /* renamed from: h, reason: collision with root package name */
        public long f34687h;

        /* renamed from: i, reason: collision with root package name */
        public long f34688i;

        /* renamed from: j, reason: collision with root package name */
        public long f34689j;

        /* renamed from: k, reason: collision with root package name */
        public int f34690k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f34691l;

        /* renamed from: m, reason: collision with root package name */
        public a.C0462a f34692m;

        public e(String str) {
            super(null, str, "SmoothStreamingMedia");
            this.f34690k = -1;
            this.f34692m = null;
            this.f34685e = new LinkedList();
        }

        @Override // q5.b.a
        public final void a(Object obj) {
            boolean z10;
            if (obj instanceof a.b) {
                this.f34685e.add((a.b) obj);
                return;
            }
            if (obj instanceof a.C0462a) {
                if (this.f34692m == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d6.a.d(z10);
                this.f34692m = (a.C0462a) obj;
            }
        }

        @Override // q5.b.a
        public final Object b() {
            boolean z10;
            a.C0462a c0462a;
            long P;
            long P2;
            LinkedList linkedList = this.f34685e;
            int size = linkedList.size();
            a.b[] bVarArr = new a.b[size];
            linkedList.toArray(bVarArr);
            a.C0462a c0462a2 = this.f34692m;
            if (c0462a2 != null) {
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0462a2.f34660a, null, "video/mp4", c0462a2.f34661b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f34663a;
                    if (i11 == 2 || i11 == 1) {
                        int i12 = 0;
                        while (true) {
                            i0[] i0VarArr = bVar.f34671j;
                            if (i12 < i0VarArr.length) {
                                i0 i0Var = i0VarArr[i12];
                                i0Var.getClass();
                                i0.a aVar = new i0.a(i0Var);
                                aVar.f30537n = drmInitData;
                                i0VarArr[i12] = new i0(aVar);
                                i12++;
                            }
                        }
                    }
                }
            }
            int i13 = this.f;
            int i14 = this.f34686g;
            long j10 = this.f34687h;
            long j11 = this.f34688i;
            long j12 = this.f34689j;
            int i15 = this.f34690k;
            boolean z11 = this.f34691l;
            a.C0462a c0462a3 = this.f34692m;
            if (j11 == 0) {
                z10 = z11;
                c0462a = c0462a3;
                P = -9223372036854775807L;
            } else {
                z10 = z11;
                c0462a = c0462a3;
                P = g0.P(j11, 1000000L, j10);
            }
            if (j12 == 0) {
                P2 = -9223372036854775807L;
            } else {
                P2 = g0.P(j12, 1000000L, j10);
            }
            return new q5.a(i13, i14, P, P2, i15, z10, c0462a, bVarArr);
        }

        @Override // q5.b.a
        public final void j(XmlPullParser xmlPullParser) throws z0 {
            boolean z10;
            this.f = a.i(xmlPullParser, "MajorVersion");
            this.f34686g = a.i(xmlPullParser, "MinorVersion");
            this.f34687h = a.h(xmlPullParser, "TimeScale", 10000000L);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
            if (attributeValue != null) {
                try {
                    this.f34688i = Long.parseLong(attributeValue);
                    this.f34689j = a.h(xmlPullParser, "DVRWindowLength", 0L);
                    this.f34690k = a.g(xmlPullParser, "LookaheadCount");
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                    if (attributeValue2 != null) {
                        z10 = Boolean.parseBoolean(attributeValue2);
                    } else {
                        z10 = false;
                    }
                    this.f34691l = z10;
                    l(Long.valueOf(this.f34687h), "TimeScale");
                    return;
                } catch (NumberFormatException e10) {
                    throw z0.b(null, e10);
                }
            }
            throw new C0463b("Duration");
        }
    }

    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public final String f34693e;
        public final LinkedList f;

        /* renamed from: g, reason: collision with root package name */
        public int f34694g;

        /* renamed from: h, reason: collision with root package name */
        public String f34695h;

        /* renamed from: i, reason: collision with root package name */
        public long f34696i;

        /* renamed from: j, reason: collision with root package name */
        public String f34697j;

        /* renamed from: k, reason: collision with root package name */
        public String f34698k;

        /* renamed from: l, reason: collision with root package name */
        public int f34699l;

        /* renamed from: m, reason: collision with root package name */
        public int f34700m;

        /* renamed from: n, reason: collision with root package name */
        public int f34701n;
        public int o;

        /* renamed from: p, reason: collision with root package name */
        public String f34702p;

        /* renamed from: q, reason: collision with root package name */
        public ArrayList<Long> f34703q;

        /* renamed from: r, reason: collision with root package name */
        public long f34704r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f34693e = str;
            this.f = new LinkedList();
        }

        @Override // q5.b.a
        public final void a(Object obj) {
            if (obj instanceof i0) {
                this.f.add((i0) obj);
            }
        }

        @Override // q5.b.a
        public final Object b() {
            String str;
            String str2;
            String str3;
            LinkedList linkedList = this.f;
            i0[] i0VarArr = new i0[linkedList.size()];
            linkedList.toArray(i0VarArr);
            String str4 = this.f34693e;
            String str5 = this.f34698k;
            int i10 = this.f34694g;
            String str6 = this.f34695h;
            long j10 = this.f34696i;
            String str7 = this.f34697j;
            int i11 = this.f34699l;
            int i12 = this.f34700m;
            int i13 = this.f34701n;
            int i14 = this.o;
            String str8 = this.f34702p;
            ArrayList<Long> arrayList = this.f34703q;
            long j11 = this.f34704r;
            int i15 = g0.f27302a;
            int size = arrayList.size();
            long[] jArr = new long[size];
            if (j10 >= 1000000 && j10 % 1000000 == 0) {
                long j12 = j10 / 1000000;
                str = str7;
                for (int i16 = 0; i16 < size; i16++) {
                    jArr[i16] = arrayList.get(i16).longValue() / j12;
                }
            } else {
                str = str7;
                if (j10 < 1000000 && 1000000 % j10 == 0) {
                    long j13 = 1000000 / j10;
                    for (int i17 = 0; i17 < size; i17++) {
                        jArr[i17] = arrayList.get(i17).longValue() * j13;
                    }
                } else {
                    str2 = str6;
                    str3 = str8;
                    double d10 = 1000000 / j10;
                    int i18 = 0;
                    while (i18 < size) {
                        jArr[i18] = (long) (arrayList.get(i18).longValue() * d10);
                        i18++;
                        arrayList = arrayList;
                    }
                    return new a.b(str4, str5, i10, str2, j10, str, i11, i12, i13, i14, str3, i0VarArr, arrayList, jArr, g0.P(j11, 1000000L, j10));
                }
            }
            str2 = str6;
            str3 = str8;
            return new a.b(str4, str5, i10, str2, j10, str, i11, i12, i13, i14, str3, i0VarArr, arrayList, jArr, g0.P(j11, 1000000L, j10));
        }

        @Override // q5.b.a
        public final boolean d(String str) {
            return "c".equals(str);
        }

        @Override // q5.b.a
        public final void j(XmlPullParser xmlPullParser) throws z0 {
            int i10 = 1;
            if ("c".equals(xmlPullParser.getName())) {
                int size = this.f34703q.size();
                long h10 = a.h(xmlPullParser, t.f6511a, com.anythink.expressad.exoplayer.b.f7291b);
                if (h10 == com.anythink.expressad.exoplayer.b.f7291b) {
                    if (size == 0) {
                        h10 = 0;
                    } else if (this.f34704r != -1) {
                        h10 = this.f34704r + this.f34703q.get(size - 1).longValue();
                    } else {
                        throw z0.b("Unable to infer start time", null);
                    }
                }
                this.f34703q.add(Long.valueOf(h10));
                this.f34704r = a.h(xmlPullParser, "d", com.anythink.expressad.exoplayer.b.f7291b);
                long h11 = a.h(xmlPullParser, "r", 1L);
                if (h11 > 1 && this.f34704r == com.anythink.expressad.exoplayer.b.f7291b) {
                    throw z0.b("Repeated chunk with unspecified duration", null);
                }
                while (true) {
                    long j10 = i10;
                    if (j10 < h11) {
                        this.f34703q.add(Long.valueOf((this.f34704r * j10) + h10));
                        i10++;
                    } else {
                        return;
                    }
                }
            } else {
                String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
                if (attributeValue != null) {
                    if (!o.f9069b.equalsIgnoreCase(attributeValue)) {
                        if ("video".equalsIgnoreCase(attributeValue)) {
                            i10 = 2;
                        } else if (o.f9070c.equalsIgnoreCase(attributeValue)) {
                            i10 = 3;
                        } else {
                            throw z0.b("Invalid key value[" + attributeValue + "]", null);
                        }
                    }
                    this.f34694g = i10;
                    l(Integer.valueOf(i10), "Type");
                    if (this.f34694g == 3) {
                        String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                        if (attributeValue2 != null) {
                            this.f34695h = attributeValue2;
                        } else {
                            throw new C0463b("Subtype");
                        }
                    } else {
                        this.f34695h = xmlPullParser.getAttributeValue(null, "Subtype");
                    }
                    l(this.f34695h, "Subtype");
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                    this.f34697j = attributeValue3;
                    l(attributeValue3, "Name");
                    String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                    if (attributeValue4 != null) {
                        this.f34698k = attributeValue4;
                        this.f34699l = a.g(xmlPullParser, "MaxWidth");
                        this.f34700m = a.g(xmlPullParser, "MaxHeight");
                        this.f34701n = a.g(xmlPullParser, "DisplayWidth");
                        this.o = a.g(xmlPullParser, "DisplayHeight");
                        String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                        this.f34702p = attributeValue5;
                        l(attributeValue5, "Language");
                        long g6 = a.g(xmlPullParser, "TimeScale");
                        this.f34696i = g6;
                        if (g6 == -1) {
                            this.f34696i = ((Long) c("TimeScale")).longValue();
                        }
                        this.f34703q = new ArrayList<>();
                        return;
                    }
                    throw new C0463b("Url");
                }
                throw new C0463b("Type");
            }
        }
    }

    public b() {
        try {
            this.f34677a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // c6.d0.a
    public final Object a(Uri uri, c6.l lVar) throws IOException {
        try {
            XmlPullParser newPullParser = this.f34677a.newPullParser();
            newPullParser.setInput(lVar, null);
            return (q5.a) new e(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e10) {
            throw z0.b(null, e10);
        }
    }

    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f34678a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34679b;

        /* renamed from: c, reason: collision with root package name */
        public final a f34680c;

        /* renamed from: d, reason: collision with root package name */
        public final LinkedList f34681d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f34680c = aVar;
            this.f34678a = str;
            this.f34679b = str2;
        }

        public static int g(XmlPullParser xmlPullParser, String str) throws z0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw z0.b(null, e10);
                }
            }
            return -1;
        }

        public static long h(XmlPullParser xmlPullParser, String str, long j10) throws z0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw z0.b(null, e10);
                }
            }
            return j10;
        }

        public static int i(XmlPullParser xmlPullParser, String str) throws z0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw z0.b(null, e10);
                }
            }
            throw new C0463b(str);
        }

        public abstract Object b();

        public final Object c(String str) {
            int i10 = 0;
            while (true) {
                LinkedList linkedList = this.f34681d;
                if (i10 < linkedList.size()) {
                    Pair pair = (Pair) linkedList.get(i10);
                    if (((String) pair.first).equals(str)) {
                        return pair.second;
                    }
                    i10++;
                } else {
                    a aVar = this.f34680c;
                    if (aVar == null) {
                        return null;
                    }
                    return aVar.c(str);
                }
            }
        }

        public boolean d(String str) {
            return false;
        }

        public final Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                a aVar = null;
                if (eventType == 1) {
                    return null;
                }
                if (eventType != 2) {
                    if (eventType != 3) {
                        if (eventType == 4 && z10 && i10 == 0) {
                            k(xmlPullParser);
                        }
                    } else if (!z10) {
                        continue;
                    } else if (i10 > 0) {
                        i10--;
                    } else {
                        String name = xmlPullParser.getName();
                        f(xmlPullParser);
                        if (!d(name)) {
                            return b();
                        }
                    }
                } else {
                    String name2 = xmlPullParser.getName();
                    if (this.f34679b.equals(name2)) {
                        j(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name2)) {
                            j(xmlPullParser);
                        } else {
                            boolean equals = "QualityLevel".equals(name2);
                            String str = this.f34678a;
                            if (equals) {
                                aVar = new d(this, str);
                            } else if ("Protection".equals(name2)) {
                                aVar = new c(this, str);
                            } else if ("StreamIndex".equals(name2)) {
                                aVar = new f(this, str);
                            }
                            if (aVar == null) {
                                i10 = 1;
                            } else {
                                a(aVar.e(xmlPullParser));
                            }
                        }
                    }
                }
                xmlPullParser.next();
            }
        }

        public abstract void j(XmlPullParser xmlPullParser) throws z0;

        public final void l(Object obj, String str) {
            this.f34681d.add(Pair.create(str, obj));
        }

        public void a(Object obj) {
        }

        public void f(XmlPullParser xmlPullParser) {
        }

        public void k(XmlPullParser xmlPullParser) {
        }
    }
}
