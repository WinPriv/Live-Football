package x4;

import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.huawei.openalliance.ad.constant.be;
import d6.p;
import d6.w;
import j7.j0;

/* compiled from: MetadataUtil.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f36401a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i10, w wVar) {
        int d10 = wVar.d();
        if (wVar.d() == 1684108385) {
            wVar.F(8);
            String o = wVar.o(d10 - 16);
            return new CommentFrame(com.anythink.expressad.exoplayer.b.ar, o, o);
        }
        p.f("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    public static ApicFrame b(w wVar) {
        String str;
        int d10 = wVar.d();
        if (wVar.d() == 1684108385) {
            int d11 = wVar.d() & 16777215;
            if (d11 == 13) {
                str = be.V;
            } else if (d11 == 14) {
                str = be.Z;
            } else {
                str = null;
            }
            if (str == null) {
                a3.k.s("Unrecognized cover art flags: ", d11, "MetadataUtil");
                return null;
            }
            wVar.F(4);
            int i10 = d10 - 16;
            byte[] bArr = new byte[i10];
            wVar.b(bArr, 0, i10);
            return new ApicFrame(str, null, 3, bArr);
        }
        p.f("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static TextInformationFrame c(int i10, w wVar, String str) {
        int d10 = wVar.d();
        if (wVar.d() == 1684108385 && d10 >= 22) {
            wVar.F(10);
            int y = wVar.y();
            if (y > 0) {
                String i11 = a3.l.i("", y);
                int y10 = wVar.y();
                if (y10 > 0) {
                    i11 = i11 + "/" + y10;
                }
                return new TextInformationFrame(str, null, j0.G(i11));
            }
        }
        p.f("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    public static TextInformationFrame d(int i10, w wVar, String str) {
        int d10 = wVar.d();
        if (wVar.d() == 1684108385) {
            wVar.F(8);
            return new TextInformationFrame(str, null, j0.G(wVar.o(d10 - 16)));
        }
        p.f("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    public static Id3Frame e(int i10, String str, w wVar, boolean z10, boolean z11) {
        int f = f(wVar);
        if (z11) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, j0.G(Integer.toString(f)));
            }
            return new CommentFrame(com.anythink.expressad.exoplayer.b.ar, str, Integer.toString(f));
        }
        p.f("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    public static int f(w wVar) {
        wVar.F(4);
        if (wVar.d() == 1684108385) {
            wVar.F(8);
            return wVar.t();
        }
        p.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
