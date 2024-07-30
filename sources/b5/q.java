package b5;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.b0;
import com.applovin.exoplayer2.d.w;
import d6.g0;
import j7.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import k4.i0;

/* compiled from: MediaCodecUtil.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2985a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<a, List<m>> f2986b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static int f2987c = -1;

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2988a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2989b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2990c;

        public a(String str, boolean z10, boolean z11) {
            this.f2988a = str;
            this.f2989b = z10;
            this.f2990c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.f2988a, aVar.f2988a) && this.f2989b == aVar.f2989b && this.f2990c == aVar.f2990c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int b10 = e0.i.b(this.f2988a, 31, 31);
            int i11 = 1231;
            if (this.f2989b) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            int i12 = (b10 + i10) * 31;
            if (!this.f2990c) {
                i11 = 1237;
            }
            return i12 + i11;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static class b extends Exception {
        public b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public interface c {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static final class d implements c {
        @Override // b5.q.c
        public final MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // b5.q.c
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if ("secure-playback".equals(str) && com.anythink.expressad.exoplayer.k.o.f9074h.equals(str2)) {
                return true;
            }
            return false;
        }

        @Override // b5.q.c
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // b5.q.c
        public final int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // b5.q.c
        public final boolean e() {
            return false;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2991a;

        /* renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f2992b;

        public e(boolean z10, boolean z11) {
            int i10;
            if (!z10 && !z11) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f2991a = i10;
        }

        @Override // b5.q.c
        public final MediaCodecInfo a(int i10) {
            if (this.f2992b == null) {
                this.f2992b = new MediaCodecList(this.f2991a).getCodecInfos();
            }
            return this.f2992b[i10];
        }

        @Override // b5.q.c
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // b5.q.c
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // b5.q.c
        public final int d() {
            if (this.f2992b == null) {
                this.f2992b = new MediaCodecList(this.f2991a).getCodecInfos();
            }
            return this.f2992b.length;
        }

        @Override // b5.q.c
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public interface f<T> {
        int getScore(T t10);
    }

    public static void a(String str, ArrayList arrayList) {
        if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(str)) {
            if (g0.f27302a < 26 && g0.f27303b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f2945a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.h("OMX.google.raw.decoder", com.anythink.expressad.exoplayer.k.o.f9088w, com.anythink.expressad.exoplayer.k.o.f9088w, null, false, true, false, false));
            }
            Collections.sort(arrayList, new p(new b0(18)));
        }
        int i10 = g0.f27302a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f2945a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new p(new w(14)));
            }
        }
        if (i10 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f2945a)) {
            arrayList.add((m) arrayList.remove(0));
        }
    }

    public static String b(i0 i0Var) {
        Pair<Integer, Integer> d10;
        if (com.anythink.expressad.exoplayer.k.o.B.equals(i0Var.D)) {
            return com.anythink.expressad.exoplayer.k.o.A;
        }
        if ("video/dolby-vision".equals(i0Var.D) && (d10 = d(i0Var)) != null) {
            int intValue = ((Integer) d10.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return com.anythink.expressad.exoplayer.k.o.f9074h;
                }
                return null;
            }
            return com.anythink.expressad.exoplayer.k.o.f9075i;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(com.anythink.expressad.exoplayer.k.o.L) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(com.anythink.expressad.exoplayer.k.o.K) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(com.anythink.expressad.exoplayer.k.o.f9090z) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0362 A[Catch: NumberFormatException -> 0x0371, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0371, blocks: (B:198:0x031a, B:200:0x032c, B:212:0x034a, B:215:0x0362), top: B:197:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> d(k4.i0 r15) {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.q.d(k4.i0):android.util.Pair");
    }

    public static synchronized List<m> e(String str, boolean z10, boolean z11) throws b {
        c dVar;
        synchronized (q.class) {
            a aVar = new a(str, z10, z11);
            HashMap<a, List<m>> hashMap = f2986b;
            List<m> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i10 = g0.f27302a;
            if (i10 >= 21) {
                dVar = new e(z10, z11);
            } else {
                dVar = new d();
            }
            ArrayList<m> f10 = f(aVar, dVar);
            if (z10 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                f10 = f(aVar, new d());
                if (!f10.isEmpty()) {
                    d6.p.f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + f10.get(0).f2945a);
                }
            }
            a(str, f10);
            j0 C = j0.C(f10);
            hashMap.put(aVar, C);
            return C;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[Catch: Exception -> 0x0169, TryCatch #3 {Exception -> 0x0169, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:14:0x013a, B:15:0x0034, B:18:0x003f, B:48:0x0113, B:51:0x011b, B:53:0x0121, B:56:0x0144, B:57:0x0167), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<b5.m> f(b5.q.a r21, b5.q.c r22) throws b5.q.b {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.q.f(b5.q$a, b5.q$c):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = g0.f27302a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = g0.f27303b;
            if ("a70".equals(str3) || ("Xiaomi".equals(g0.f27304c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = g0.f27303b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = g0.f27303b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(g0.f27304c))) {
            String str6 = g0.f27303b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(g0.f27304c)) {
            String str7 = g0.f27303b;
            if (str7.startsWith(com.anythink.expressad.foundation.g.a.O) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && g0.f27303b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 <= 23 && com.anythink.expressad.exoplayer.k.o.B.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (g0.f27302a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (d6.r.k(str)) {
            return true;
        }
        String c10 = i7.g.c(mediaCodecInfo.getName());
        if (c10.startsWith("arc.")) {
            return false;
        }
        if (c10.startsWith("omx.google.") || c10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((c10.startsWith("omx.sec.") && c10.contains(".sw.")) || c10.equals("omx.qcom.video.decoder.hevcswvdec") || c10.startsWith("c2.android.") || c10.startsWith("c2.google.")) {
            return true;
        }
        if (!c10.startsWith("omx.") && !c10.startsWith("c2.")) {
            return true;
        }
        return false;
    }

    public static int i() throws b {
        m mVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        int i11;
        if (f2987c == -1) {
            int i12 = 0;
            List<m> e10 = e(com.anythink.expressad.exoplayer.k.o.f9074h, false, false);
            if (e10.isEmpty()) {
                mVar = null;
            } else {
                mVar = e10.get(0);
            }
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2948d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = codecProfileLevelArr[i12].level;
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 8:
                            case 16:
                            case 32:
                                i11 = 101376;
                                break;
                            case 64:
                                i11 = 202752;
                                break;
                            case 128:
                            case 256:
                                i11 = 414720;
                                break;
                            case 512:
                                i11 = 921600;
                                break;
                            case 1024:
                                i11 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i11 = 2097152;
                                break;
                            case 8192:
                                i11 = 2228224;
                                break;
                            case 16384:
                                i11 = 5652480;
                                break;
                            case 32768:
                            case com.anythink.expressad.exoplayer.b.aX /* 65536 */:
                                i11 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i11 = 35651584;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                    } else {
                        i11 = 25344;
                    }
                    i13 = Math.max(i11, i13);
                    i12++;
                }
                if (g0.f27302a >= 21) {
                    i10 = 345600;
                } else {
                    i10 = 172800;
                }
                i12 = Math.max(i13, i10);
            }
            f2987c = i12;
        }
        return f2987c;
    }
}
