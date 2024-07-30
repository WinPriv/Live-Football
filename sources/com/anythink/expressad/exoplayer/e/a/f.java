package com.anythink.expressad.exoplayer.e.a;

import android.util.Log;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.s;
import com.huawei.openalliance.ad.constant.be;
import com.ironsource.mediationsdk.IronSourceSegment;

/* loaded from: classes.dex */
final class f {
    private static final String F = "und";

    /* renamed from: a, reason: collision with root package name */
    private static final String f7836a = "MetadataUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f7837b = af.f("nam");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7838c = af.f("trk");

    /* renamed from: d, reason: collision with root package name */
    private static final int f7839d = af.f("cmt");

    /* renamed from: e, reason: collision with root package name */
    private static final int f7840e = af.f("day");
    private static final int f = af.f("ART");

    /* renamed from: g, reason: collision with root package name */
    private static final int f7841g = af.f("too");

    /* renamed from: h, reason: collision with root package name */
    private static final int f7842h = af.f("alb");

    /* renamed from: i, reason: collision with root package name */
    private static final int f7843i = af.f("com");

    /* renamed from: j, reason: collision with root package name */
    private static final int f7844j = af.f("wrt");

    /* renamed from: k, reason: collision with root package name */
    private static final int f7845k = af.f("lyr");

    /* renamed from: l, reason: collision with root package name */
    private static final int f7846l = af.f(IronSourceSegment.GENDER);

    /* renamed from: m, reason: collision with root package name */
    private static final int f7847m = af.f("covr");

    /* renamed from: n, reason: collision with root package name */
    private static final int f7848n = af.f("gnre");
    private static final int o = af.f("grp");

    /* renamed from: p, reason: collision with root package name */
    private static final int f7849p = af.f("disk");

    /* renamed from: q, reason: collision with root package name */
    private static final int f7850q = af.f("trkn");

    /* renamed from: r, reason: collision with root package name */
    private static final int f7851r = af.f("tmpo");

    /* renamed from: s, reason: collision with root package name */
    private static final int f7852s = af.f("cpil");

    /* renamed from: t, reason: collision with root package name */
    private static final int f7853t = af.f("aART");

    /* renamed from: u, reason: collision with root package name */
    private static final int f7854u = af.f("sonm");

    /* renamed from: v, reason: collision with root package name */
    private static final int f7855v = af.f("soal");

    /* renamed from: w, reason: collision with root package name */
    private static final int f7856w = af.f("soar");

    /* renamed from: x, reason: collision with root package name */
    private static final int f7857x = af.f("soaa");
    private static final int y = af.f("soco");

    /* renamed from: z, reason: collision with root package name */
    private static final int f7858z = af.f("rtng");
    private static final int A = af.f("pgap");
    private static final int B = af.f("sosn");
    private static final int C = af.f("tvsh");
    private static final int D = af.f(com.anythink.expressad.exoplayer.g.b.i.f8075a);
    private static final String[] E = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: all -> 0x024d, TryCatch #0 {all -> 0x024d, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x0038, B:18:0x003f, B:20:0x0048, B:22:0x004c, B:25:0x0056, B:27:0x005a, B:30:0x0064, B:32:0x0069, B:35:0x0073, B:37:0x0077, B:40:0x0081, B:42:0x0085, B:44:0x0091, B:48:0x00aa, B:51:0x00b8, B:56:0x00cb, B:57:0x00d4, B:59:0x00d8, B:62:0x00e2, B:64:0x00e6, B:67:0x00f0, B:69:0x00f4, B:72:0x00fe, B:74:0x0102, B:77:0x010c, B:79:0x0110, B:82:0x011a, B:84:0x011e, B:87:0x0128, B:89:0x012c, B:92:0x0136, B:94:0x013a, B:97:0x0144, B:99:0x0148, B:102:0x0152, B:104:0x0156, B:107:0x0160, B:109:0x0164, B:112:0x0220, B:116:0x0170, B:118:0x0174, B:120:0x0180, B:123:0x0193, B:124:0x01ac, B:126:0x01b0, B:129:0x01b6, B:131:0x01ba, B:134:0x01c0, B:136:0x01c4, B:139:0x01ce, B:141:0x01d2, B:144:0x01dc, B:146:0x01e0, B:149:0x01ea, B:151:0x01ee, B:154:0x01f8, B:156:0x01fc, B:159:0x0206, B:161:0x020a, B:164:0x0212, B:166:0x0216, B:169:0x0239, B:172:0x0243), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x024d, TRY_LEAVE, TryCatch #0 {all -> 0x024d, blocks: (B:6:0x0021, B:8:0x0026, B:10:0x002c, B:12:0x0031, B:14:0x0038, B:18:0x003f, B:20:0x0048, B:22:0x004c, B:25:0x0056, B:27:0x005a, B:30:0x0064, B:32:0x0069, B:35:0x0073, B:37:0x0077, B:40:0x0081, B:42:0x0085, B:44:0x0091, B:48:0x00aa, B:51:0x00b8, B:56:0x00cb, B:57:0x00d4, B:59:0x00d8, B:62:0x00e2, B:64:0x00e6, B:67:0x00f0, B:69:0x00f4, B:72:0x00fe, B:74:0x0102, B:77:0x010c, B:79:0x0110, B:82:0x011a, B:84:0x011e, B:87:0x0128, B:89:0x012c, B:92:0x0136, B:94:0x013a, B:97:0x0144, B:99:0x0148, B:102:0x0152, B:104:0x0156, B:107:0x0160, B:109:0x0164, B:112:0x0220, B:116:0x0170, B:118:0x0174, B:120:0x0180, B:123:0x0193, B:124:0x01ac, B:126:0x01b0, B:129:0x01b6, B:131:0x01ba, B:134:0x01c0, B:136:0x01c4, B:139:0x01ce, B:141:0x01d2, B:144:0x01dc, B:146:0x01e0, B:149:0x01ea, B:151:0x01ee, B:154:0x01f8, B:156:0x01fc, B:159:0x0206, B:161:0x020a, B:164:0x0212, B:166:0x0216, B:169:0x0239, B:172:0x0243), top: B:2:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.expressad.exoplayer.g.a.InterfaceC0105a a(com.anythink.expressad.exoplayer.k.s r8) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.f.a(com.anythink.expressad.exoplayer.k.s):com.anythink.expressad.exoplayer.g.a$a");
    }

    private static com.anythink.expressad.exoplayer.g.b.k b(int i10, String str, s sVar) {
        int i11 = sVar.i();
        if (sVar.i() == a.aK && i11 >= 22) {
            sVar.d(10);
            int e10 = sVar.e();
            if (e10 > 0) {
                String valueOf = String.valueOf(e10);
                int e11 = sVar.e();
                if (e11 > 0) {
                    valueOf = valueOf + "/" + e11;
                }
                return new com.anythink.expressad.exoplayer.g.b.k(str, null, valueOf);
            }
        }
        Log.w(f7836a, "Failed to parse index/count attribute: " + a.c(i10));
        return null;
    }

    private static com.anythink.expressad.exoplayer.g.b.a c(s sVar) {
        String str;
        int i10 = sVar.i();
        if (sVar.i() == a.aK) {
            int b10 = a.b(sVar.i());
            if (b10 == 13) {
                str = be.V;
            } else if (b10 == 14) {
                str = be.Z;
            } else {
                str = null;
            }
            if (str == null) {
                Log.w(f7836a, "Unrecognized cover art flags: ".concat(String.valueOf(b10)));
                return null;
            }
            sVar.d(4);
            int i11 = i10 - 16;
            byte[] bArr = new byte[i11];
            sVar.a(bArr, 0, i11);
            return new com.anythink.expressad.exoplayer.g.b.a(str, null, 3, bArr);
        }
        Log.w(f7836a, "Failed to parse cover art attribute");
        return null;
    }

    private static int d(s sVar) {
        sVar.d(4);
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return sVar.d();
        }
        Log.w(f7836a, "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.anythink.expressad.exoplayer.g.b.k b(com.anythink.expressad.exoplayer.k.s r3) {
        /*
            int r3 = d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.anythink.expressad.exoplayer.e.a.f.E
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.anythink.expressad.exoplayer.g.b.k r1 = new com.anythink.expressad.exoplayer.g.b.k
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.f.b(com.anythink.expressad.exoplayer.k.s):com.anythink.expressad.exoplayer.g.b.k");
    }

    private static com.anythink.expressad.exoplayer.g.b.k a(int i10, String str, s sVar) {
        int i11 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            return new com.anythink.expressad.exoplayer.g.b.k(str, null, sVar.e(i11 - 16));
        }
        Log.w(f7836a, "Failed to parse text attribute: " + a.c(i10));
        return null;
    }

    private static com.anythink.expressad.exoplayer.g.b.e a(int i10, s sVar) {
        int i11 = sVar.i();
        if (sVar.i() == a.aK) {
            sVar.d(8);
            String e10 = sVar.e(i11 - 16);
            return new com.anythink.expressad.exoplayer.g.b.e("und", e10, e10);
        }
        Log.w(f7836a, "Failed to parse comment attribute: " + a.c(i10));
        return null;
    }

    private static com.anythink.expressad.exoplayer.g.b.h a(int i10, String str, s sVar, boolean z10, boolean z11) {
        int d10 = d(sVar);
        if (z11) {
            d10 = Math.min(1, d10);
        }
        if (d10 >= 0) {
            if (z10) {
                return new com.anythink.expressad.exoplayer.g.b.k(str, null, Integer.toString(d10));
            }
            return new com.anythink.expressad.exoplayer.g.b.e("und", str, Integer.toString(d10));
        }
        Log.w(f7836a, "Failed to parse uint8 attribute: " + a.c(i10));
        return null;
    }

    private static com.anythink.expressad.exoplayer.g.b.h a(s sVar, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (sVar.c() < i10) {
            int c10 = sVar.c();
            int i13 = sVar.i();
            int i14 = sVar.i();
            sVar.d(4);
            if (i14 == a.aI) {
                str = sVar.e(i13 - 12);
            } else if (i14 == a.aJ) {
                str2 = sVar.e(i13 - 12);
            } else {
                if (i14 == a.aK) {
                    i11 = c10;
                    i12 = i13;
                }
                sVar.d(i13 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        sVar.c(i11);
        sVar.d(16);
        return new com.anythink.expressad.exoplayer.g.b.i(str, str2, sVar.e(i12 - 16));
    }
}
