package com.anythink.expressad.exoplayer.f;

import a3.l;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.o;

@TargetApi(16)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7971a = "MediaCodecInfo";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7972b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final String f7973c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7974d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f7975e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7976g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7977h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7978i;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r3 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3, boolean r4, boolean r5, boolean r6) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.anythink.expressad.exoplayer.k.a.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.f7973c = r1
            r0.f7974d = r2
            r0.f7975e = r3
            r0.f7978i = r4
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L2c
            if (r3 == 0) goto L2c
            int r4 = com.anythink.expressad.exoplayer.k.af.f8993a
            r5 = 19
            if (r4 < r5) goto L27
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r3.isFeatureSupported(r4)
            if (r4 == 0) goto L27
            r4 = r1
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L2c
            r4 = r1
            goto L2d
        L2c:
            r4 = r2
        L2d:
            r0.f = r4
            r4 = 21
            if (r3 == 0) goto L46
            int r5 = com.anythink.expressad.exoplayer.k.af.f8993a
            if (r5 < r4) goto L41
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r3.isFeatureSupported(r5)
            if (r5 == 0) goto L41
            r5 = r1
            goto L42
        L41:
            r5 = r2
        L42:
            if (r5 == 0) goto L46
            r5 = r1
            goto L47
        L46:
            r5 = r2
        L47:
            r0.f7976g = r5
            if (r6 != 0) goto L60
            if (r3 == 0) goto L5f
            int r5 = com.anythink.expressad.exoplayer.k.af.f8993a
            if (r5 < r4) goto L5b
            java.lang.String r4 = "secure-playback"
            boolean r3 = r3.isFeatureSupported(r4)
            if (r3 == 0) goto L5b
            r3 = r1
            goto L5c
        L5b:
            r3 = r2
        L5c:
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            r0.f7977h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.a.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    public static a a(String str) {
        return new a(str, null, null, true, false, false);
    }

    private int b() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (af.f8993a < 23 || (codecCapabilities = this.f7975e) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    private void c(String str) {
        StringBuilder s10 = l.s("NoSupport [", str, "] [");
        s10.append(this.f7973c);
        s10.append(", ");
        s10.append(this.f7974d);
        s10.append("] [");
        s10.append(af.f8997e);
        s10.append("]");
        Log.d(f7971a, s10.toString());
    }

    private void d(String str) {
        StringBuilder s10 = l.s("AssumedSupport [", str, "] [");
        s10.append(this.f7973c);
        s10.append(", ");
        s10.append(this.f7974d);
        s10.append("] [");
        s10.append(af.f8997e);
        s10.append("]");
        Log.d(f7971a, s10.toString());
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (af.f8993a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")) {
            return true;
        }
        return false;
    }

    @TargetApi(21)
    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @TargetApi(23)
    private static int g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new a(str, str2, codecCapabilities, false, false, false);
    }

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        return new a(str, str2, codecCapabilities, false, z10, z11);
    }

    public final boolean b(String str) {
        String c10;
        if (str == null || this.f7974d == null || (c10 = o.c(str)) == null) {
            return true;
        }
        if (!this.f7974d.equals(c10)) {
            c("codec.mime " + str + ", " + c10);
            return false;
        }
        Pair<Integer, Integer> a10 = d.a(str);
        if (a10 == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : a()) {
            if (codecProfileLevel.profile == ((Integer) a10.first).intValue() && codecProfileLevel.level >= ((Integer) a10.second).intValue()) {
                return true;
            }
        }
        c("codec.profileLevel, " + str + ", " + c10);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7975e;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public final boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7975e;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && a(videoCapabilities, i11, i10, d10)) {
            StringBuilder r10 = l.r("sizeAndRate.rotated, ", i10, "x", i11, "x");
            r10.append(d10);
            StringBuilder s10 = l.s("AssumedSupport [", r10.toString(), "] [");
            s10.append(this.f7973c);
            s10.append(", ");
            s10.append(this.f7974d);
            s10.append("] [");
            s10.append(af.f8997e);
            s10.append("]");
            Log.d(f7971a, s10.toString());
            return true;
        }
        StringBuilder r11 = l.r("sizeAndRate.support, ", i10, "x", i11, "x");
        r11.append(d10);
        c(r11.toString());
        return false;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8993a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    @TargetApi(21)
    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    @TargetApi(21)
    public final boolean b(int i10) {
        int i11;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7975e;
        if (codecCapabilities == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        String str = this.f7973c;
        String str2 = this.f7974d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((af.f8993a < 26 || maxInputChannelCount <= 0) && !o.f9085t.equals(str2) && !o.I.equals(str2) && !o.J.equals(str2) && !o.f9083r.equals(str2) && !o.G.equals(str2) && !o.H.equals(str2) && !o.f9088w.equals(str2) && !o.K.equals(str2) && !o.f9089x.equals(str2) && !o.y.equals(str2) && !o.M.equals(str2))) {
            if (o.f9090z.equals(str2)) {
                i11 = 6;
            } else {
                i11 = o.A.equals(str2) ? 16 : 30;
            }
            Log.w(f7971a, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i11 + "]");
            maxInputChannelCount = i11;
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        c("channelCount.support, ".concat(String.valueOf(i10)));
        return false;
    }

    @TargetApi(21)
    public final Point a(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7975e;
        if (codecCapabilities == null) {
            c("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(af.a(i10, widthAlignment) * widthAlignment, af.a(i11, heightAlignment) * heightAlignment);
    }

    @TargetApi(19)
    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    public final boolean a(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7975e;
        if (codecCapabilities == null) {
            c("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        c("sampleRate.support, ".concat(String.valueOf(i10)));
        return false;
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((af.f8993a >= 26 && i10 > 0) || o.f9085t.equals(str2) || o.I.equals(str2) || o.J.equals(str2) || o.f9083r.equals(str2) || o.G.equals(str2) || o.H.equals(str2) || o.f9088w.equals(str2) || o.K.equals(str2) || o.f9089x.equals(str2) || o.y.equals(str2) || o.M.equals(str2))) {
            return i10;
        }
        if (o.f9090z.equals(str2)) {
            i11 = 6;
        } else {
            i11 = o.A.equals(str2) ? 16 : 30;
        }
        Log.w(f7971a, "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return af.f8993a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (d10 != -1.0d && d10 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        }
        return videoCapabilities.isSizeSupported(i10, i11);
    }
}
