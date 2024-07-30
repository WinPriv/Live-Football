package com.applovin.exoplayer2.f;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f15032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15033b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15034c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f15035d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15036e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15037g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15038h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15039i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f15040j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f15041k;

    public i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f15032a = (String) com.applovin.exoplayer2.l.a.b(str);
        this.f15033b = str2;
        this.f15034c = str3;
        this.f15035d = codecCapabilities;
        this.f15038h = z10;
        this.f15039i = z11;
        this.f15040j = z12;
        this.f15036e = z13;
        this.f = z14;
        this.f15037g = z15;
        this.f15041k = com.applovin.exoplayer2.l.u.b(str2);
    }

    private void a(String str) {
        StringBuilder s10 = a3.l.s("NoSupport [", str, "] [");
        s10.append(this.f15032a);
        s10.append(", ");
        s10.append(this.f15033b);
        s10.append("] [");
        s10.append(ai.f16278e);
        s10.append("]");
        com.applovin.exoplayer2.l.q.a(com.anythink.expressad.exoplayer.f.a.f7971a, s10.toString());
    }

    private void b(String str) {
        StringBuilder s10 = a3.l.s("AssumedSupport [", str, "] [");
        s10.append(this.f15032a);
        s10.append(", ");
        s10.append(this.f15033b);
        s10.append("] [");
        s10.append(ai.f16278e);
        s10.append("]");
        com.applovin.exoplayer2.l.q.a(com.anythink.expressad.exoplayer.f.a.f7971a, s10.toString());
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f16274a >= 21 && f(codecCapabilities);
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        int i11;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
        } else {
            i10 = 0;
        }
        if (i10 >= 180000000) {
            i11 = 1024;
        } else if (i10 >= 120000000) {
            i11 = 512;
        } else if (i10 >= 60000000) {
            i11 = 256;
        } else if (i10 >= 30000000) {
            i11 = 128;
        } else if (i10 >= 18000000) {
            i11 = 64;
        } else if (i10 >= 12000000) {
            i11 = 32;
        } else if (i10 >= 7200000) {
            i11 = 16;
        } else if (i10 >= 3600000) {
            i11 = 8;
        } else if (i10 >= 1800000) {
            i11 = 4;
        } else if (i10 >= 800000) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i11;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public boolean c(com.applovin.exoplayer2.v vVar) {
        if (this.f15041k) {
            return this.f15036e;
        }
        Pair<Integer, Integer> a10 = l.a(vVar);
        return a10 != null && ((Integer) a10.first).intValue() == 42;
    }

    public String toString() {
        return this.f15032a;
    }

    private static boolean d(String str) {
        return ai.f16277d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean e(String str) {
        return com.anythink.expressad.exoplayer.k.o.H.equals(str);
    }

    private static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(ai.f16275b)) ? false : true;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f16274a >= 21 && d(codecCapabilities);
    }

    private static boolean c(String str) {
        if (ai.f16274a <= 22) {
            String str2 = ai.f16277d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static i a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new i(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !a(codecCapabilities) || c(str)) ? false : true, codecCapabilities != null && c(codecCapabilities), z14 || (codecCapabilities != null && e(codecCapabilities)));
    }

    public boolean b(com.applovin.exoplayer2.v vVar) {
        String d10;
        String str = vVar.f16835i;
        if (str == null || this.f15033b == null || (d10 = com.applovin.exoplayer2.l.u.d(str)) == null) {
            return true;
        }
        if (!this.f15033b.equals(d10)) {
            a(a3.k.m(new StringBuilder("codec.mime "), vVar.f16835i, ", ", d10));
            return false;
        }
        Pair<Integer, Integer> a10 = l.a(vVar);
        if (a10 == null) {
            return true;
        }
        int intValue = ((Integer) a10.first).intValue();
        int intValue2 = ((Integer) a10.second).intValue();
        if (!this.f15041k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] a11 = a();
        if (ai.f16274a <= 23 && com.anythink.expressad.exoplayer.k.o.f9077k.equals(this.f15033b) && a11.length == 0) {
            a11 = g(this.f15035d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a11) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        a(a3.k.m(new StringBuilder("codec.profileLevel, "), vVar.f16835i, ", ", d10));
        return false;
    }

    public MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15035d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean a(com.applovin.exoplayer2.v vVar) throws l.b {
        int i10;
        if (!b(vVar)) {
            return false;
        }
        if (this.f15041k) {
            int i11 = vVar.f16842q;
            if (i11 <= 0 || (i10 = vVar.f16843r) <= 0) {
                return true;
            }
            if (ai.f16274a >= 21) {
                return a(i11, i10, vVar.f16844s);
            }
            boolean z10 = i11 * i10 <= l.b();
            if (!z10) {
                a("legacyFrameSize, " + vVar.f16842q + "x" + vVar.f16843r);
            }
            return z10;
        }
        if (ai.f16274a >= 21) {
            int i12 = vVar.f16850z;
            if (i12 != -1 && !a(i12)) {
                return false;
            }
            int i13 = vVar.y;
            if (i13 != -1 && !b(i13)) {
                return false;
            }
        }
        return true;
    }

    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v vVar2) {
        int i10 = !ai.a((Object) vVar.f16838l, (Object) vVar2.f16838l) ? 8 : 0;
        if (this.f15041k) {
            if (vVar.f16845t != vVar2.f16845t) {
                i10 |= 1024;
            }
            if (!this.f15036e && (vVar.f16842q != vVar2.f16842q || vVar.f16843r != vVar2.f16843r)) {
                i10 |= 512;
            }
            if (!ai.a(vVar.f16849x, vVar2.f16849x)) {
                i10 |= 2048;
            }
            if (d(this.f15032a) && !vVar.a(vVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new com.applovin.exoplayer2.c.h(this.f15032a, vVar, vVar2, vVar.a(vVar2) ? 3 : 2, 0);
            }
        } else {
            if (vVar.y != vVar2.y) {
                i10 |= 4096;
            }
            if (vVar.f16850z != vVar2.f16850z) {
                i10 |= 8192;
            }
            if (vVar.A != vVar2.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && com.anythink.expressad.exoplayer.k.o.f9083r.equals(this.f15033b)) {
                Pair<Integer, Integer> a10 = l.a(vVar);
                Pair<Integer, Integer> a11 = l.a(vVar2);
                if (a10 != null && a11 != null) {
                    int intValue = ((Integer) a10.first).intValue();
                    int intValue2 = ((Integer) a11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new com.applovin.exoplayer2.c.h(this.f15032a, vVar, vVar2, 3, 0);
                    }
                }
            }
            if (!vVar.a(vVar2)) {
                i10 |= 32;
            }
            if (e(this.f15033b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new com.applovin.exoplayer2.c.h(this.f15032a, vVar, vVar2, 1, 0);
            }
        }
        return new com.applovin.exoplayer2.c.h(this.f15032a, vVar, vVar2, 0, i10);
    }

    public boolean b() {
        if (ai.f16274a >= 29 && com.anythink.expressad.exoplayer.k.o.f9077k.equals(this.f15033b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15035d;
        if (codecCapabilities == null) {
            a("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("channelCount.aCaps");
            return false;
        }
        if (a(this.f15032a, this.f15033b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        a(a3.l.i("channelCount.support, ", i10));
        return false;
    }

    public boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15035d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && f(this.f15032a) && a(videoCapabilities, i11, i10, d10)) {
            StringBuilder r10 = a3.l.r("sizeAndRate.rotated, ", i10, "x", i11, "x");
            r10.append(d10);
            b(r10.toString());
            return true;
        }
        StringBuilder r11 = a3.l.r("sizeAndRate.support, ", i10, "x", i11, "x");
        r11.append(d10);
        a(r11.toString());
        return false;
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15035d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i10, i11);
    }

    public boolean a(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15035d;
        if (codecCapabilities == null) {
            a("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        a(a3.l.i("sampleRate.support, ", i10));
        return false;
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((ai.f16274a >= 26 && i10 > 0) || com.anythink.expressad.exoplayer.k.o.f9085t.equals(str2) || com.anythink.expressad.exoplayer.k.o.I.equals(str2) || com.anythink.expressad.exoplayer.k.o.J.equals(str2) || com.anythink.expressad.exoplayer.k.o.f9083r.equals(str2) || com.anythink.expressad.exoplayer.k.o.G.equals(str2) || com.anythink.expressad.exoplayer.k.o.H.equals(str2) || com.anythink.expressad.exoplayer.k.o.f9088w.equals(str2) || com.anythink.expressad.exoplayer.k.o.K.equals(str2) || com.anythink.expressad.exoplayer.k.o.f9089x.equals(str2) || com.anythink.expressad.exoplayer.k.o.y.equals(str2) || com.anythink.expressad.exoplayer.k.o.M.equals(str2))) {
            return i10;
        }
        if (com.anythink.expressad.exoplayer.k.o.f9090z.equals(str2)) {
            i11 = 6;
        } else {
            i11 = com.anythink.expressad.exoplayer.k.o.A.equals(str2) ? 16 : 30;
        }
        com.applovin.exoplayer2.l.q.c(com.anythink.expressad.exoplayer.f.a.f7971a, "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return ai.f16274a >= 19 && b(codecCapabilities);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point a10 = a(videoCapabilities, i10, i11);
        int i12 = a10.x;
        int i13 = a10.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ai.a(i10, widthAlignment) * widthAlignment, ai.a(i11, heightAlignment) * heightAlignment);
    }
}
