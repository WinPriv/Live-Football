package com.applovin.exoplayer2.f;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;
import com.huawei.hms.ads.nativead.NativeAdAssetNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15075a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<a, List<i>> f15076b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static int f15077c = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f15078a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15079b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15080c;

        public a(String str, boolean z10, boolean z11) {
            this.f15078a = str;
            this.f15079b = z10;
            this.f15080c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (TextUtils.equals(this.f15078a, aVar.f15078a) && this.f15079b == aVar.f15079b && this.f15080c == aVar.f15080c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int b10 = e0.i.b(this.f15078a, 31, 31);
            int i11 = 1231;
            if (this.f15079b) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            int i12 = (b10 + i10) * 31;
            if (!this.f15080c) {
                i11 = 1237;
            }
            return i12 + i11;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();

        MediaCodecInfo a(int i10);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        private d() {
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b() {
            return false;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && com.anythink.expressad.exoplayer.k.o.f9074h.equals(str2);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f15081a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f15082b;

        public e(boolean z10, boolean z11) {
            int i10;
            if (!z10 && !z11) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f15081a = i10;
        }

        private void c() {
            if (this.f15082b == null) {
                this.f15082b = new MediaCodecList(this.f15081a).getCodecInfos();
            }
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public int a() {
            c();
            return this.f15082b.length;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b() {
            return true;
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public MediaCodecInfo a(int i10) {
            c();
            return this.f15082b[i10];
        }

        @Override // com.applovin.exoplayer2.f.l.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        int getScore(T t10);
    }

    private static int a(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case com.anythink.expressad.exoplayer.b.aX /* 65536 */:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return com.anythink.expressad.exoplayer.b.aX;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return com.anythink.expressad.exoplayer.h.o.f8460d;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    public static i a() throws b {
        return a(com.anythink.expressad.exoplayer.k.o.f9088w, false, false);
    }

    private static int b(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int c(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return com.anythink.expressad.exoplayer.b.aX;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int d(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 != 2) {
                return i10 != 3 ? -1 : 8;
            }
            return 4;
        }
        return 1;
    }

    private static int e(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static boolean f(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (ai.f16274a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    public static i a(String str, boolean z10, boolean z11) throws b {
        List<i> b10 = b(str, z10, z11);
        if (b10.isEmpty()) {
            return null;
        }
        return b10.get(0);
    }

    public static synchronized List<i> b(String str, boolean z10, boolean z11) throws b {
        c dVar;
        synchronized (l.class) {
            a aVar = new a(str, z10, z11);
            HashMap<a, List<i>> hashMap = f15076b;
            List<i> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i10 = ai.f16274a;
            if (i10 >= 21) {
                dVar = new e(z10, z11);
            } else {
                dVar = new d();
            }
            ArrayList<i> a10 = a(aVar, dVar);
            if (z10 && a10.isEmpty() && 21 <= i10 && i10 <= 23) {
                a10 = a(aVar, new d());
                if (!a10.isEmpty()) {
                    com.applovin.exoplayer2.l.q.c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a10.get(0).f15032a);
                }
            }
            a(str, a10);
            List<i> unmodifiableList = Collections.unmodifiableList(a10);
            hashMap.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo) {
        if (ai.f16274a >= 29) {
            return d(mediaCodecInfo);
        }
        return !e(mediaCodecInfo);
    }

    private static boolean d(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (ai.f16274a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static Pair<Integer, Integer> d(String str, String[] strArr) {
        if (strArr.length < 3) {
            a3.l.D("Ignoring malformed VP9 codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int d10 = d(parseInt);
            if (d10 == -1) {
                a3.k.y("Unknown VP9 profile: ", parseInt, "MediaCodecUtil");
                return null;
            }
            int e10 = e(parseInt2);
            if (e10 == -1) {
                a3.k.y("Unknown VP9 level: ", parseInt2, "MediaCodecUtil");
                return null;
            }
            return new Pair<>(Integer.valueOf(d10), Integer.valueOf(e10));
        } catch (NumberFormatException unused) {
            a3.l.D("Ignoring malformed VP9 codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    public static List<i> a(List<i> list, final com.applovin.exoplayer2.v vVar) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new f() { // from class: com.applovin.exoplayer2.f.y
            @Override // com.applovin.exoplayer2.f.l.f
            public final int getScore(Object obj) {
                int a10;
                a10 = l.a(com.applovin.exoplayer2.v.this, (i) obj);
                return a10;
            }
        });
        return arrayList;
    }

    private static Pair<Integer, Integer> c(String str, String[] strArr) {
        int parseInt;
        int i10;
        if (strArr.length < 2) {
            a3.l.D("Ignoring malformed AVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i10 = parseInt2;
            } else {
                com.applovin.exoplayer2.l.q.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int b10 = b(i10);
            if (b10 == -1) {
                a3.k.y("Unknown AVC profile: ", i10, "MediaCodecUtil");
                return null;
            }
            int c10 = c(parseInt);
            if (c10 == -1) {
                a3.k.y("Unknown AVC level: ", parseInt, "MediaCodecUtil");
                return null;
            }
            return new Pair<>(Integer.valueOf(b10), Integer.valueOf(c10));
        } catch (NumberFormatException unused) {
            a3.l.D("Ignoring malformed AVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.applovin.exoplayer2.v vVar, i iVar) {
        try {
            return iVar.a(vVar) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(com.applovin.exoplayer2.v r6) {
        /*
            java.lang.String r0 = r6.f16835i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.f16838l
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f16835i
            android.util.Pair r6 = a(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f16835i
            android.util.Pair r6 = d(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f16835i
            android.util.Pair r6 = e(r6, r0)
            return r6
        L8a:
            java.lang.String r6 = r6.f16835i
            android.util.Pair r6 = b(r6, r0)
            return r6
        L91:
            java.lang.String r6 = r6.f16835i
            android.util.Pair r6 = c(r6, r0)
            return r6
        L98:
            java.lang.String r1 = r6.f16835i
            com.applovin.exoplayer2.m.b r6 = r6.f16849x
            android.util.Pair r6 = a(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.l.a(com.applovin.exoplayer2.v):android.util.Pair");
    }

    private static Pair<Integer, Integer> e(String str, String[] strArr) {
        int g6;
        if (strArr.length != 3) {
            a3.l.D("Ignoring malformed MP4A codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            if (com.anythink.expressad.exoplayer.k.o.f9083r.equals(com.applovin.exoplayer2.l.u.a(Integer.parseInt(strArr[1], 16))) && (g6 = g(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(g6), 0);
            }
        } catch (NumberFormatException unused) {
            a3.l.D("Ignoring malformed MP4A codec string: ", str, "MediaCodecUtil");
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        if (r1.f15079b == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0120, B:10:0x002d, B:13:0x0038, B:39:0x00f9, B:42:0x0101, B:44:0x0107, B:47:0x012a, B:48:0x014d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.l.a r24, com.applovin.exoplayer2.f.l.c r25) throws com.applovin.exoplayer2.f.l.b {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.l.a(com.applovin.exoplayer2.f.l$a, com.applovin.exoplayer2.f.l$c):java.util.ArrayList");
    }

    public static int b() throws b {
        if (f15077c == -1) {
            int i10 = 0;
            i a10 = a(com.anythink.expressad.exoplayer.k.o.f9074h, false, false);
            if (a10 != null) {
                MediaCodecInfo.CodecProfileLevel[] a11 = a10.a();
                int length = a11.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(a(a11[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, ai.f16274a >= 21 ? 345600 : 172800);
            }
            f15077c = i10;
        }
        return f15077c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(i iVar) {
        String str = iVar.f15032a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (ai.f16274a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static boolean b(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        if (strArr.length < 4) {
            a3.l.D("Ignoring malformed HEVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        int i10 = 1;
        Matcher matcher = f15075a.matcher(strArr[1]);
        if (!matcher.matches()) {
            a3.l.D("Ignoring malformed HEVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                a3.l.D("Unknown HEVC profile string: ", group, "MediaCodecUtil");
                return null;
            }
            i10 = 2;
        }
        String str2 = strArr[3];
        Integer a10 = a(str2);
        if (a10 == null) {
            a3.l.D("Unknown HEVC level string: ", str2, "MediaCodecUtil");
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), a10);
    }

    private static Integer c(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals(NativeAdAssetNames.CHOICES_CONTAINER)) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        return null;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = ai.f16274a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = ai.f16275b;
            if ("a70".equals(str3) || ("Xiaomi".equals(ai.f16276c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = ai.f16275b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = ai.f16275b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(ai.f16276c))) {
            String str6 = ai.f16275b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(ai.f16276c)) {
            String str7 = ai.f16275b;
            if (str7.startsWith(com.anythink.expressad.foundation.g.a.O) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && ai.f16275b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (com.anythink.expressad.exoplayer.k.o.B.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static Integer b(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    private static void a(String str, List<i> list) {
        if (com.anythink.expressad.exoplayer.k.o.f9088w.equals(str)) {
            if (ai.f16274a < 26 && ai.f16275b.equals("R9") && list.size() == 1 && list.get(0).f15032a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(i.a("OMX.google.raw.decoder", com.anythink.expressad.exoplayer.k.o.f9088w, com.anythink.expressad.exoplayer.k.o.f9088w, null, false, true, false, false, false));
            }
            a(list, new f() { // from class: com.applovin.exoplayer2.f.v
                @Override // com.applovin.exoplayer2.f.l.f
                public final int getScore(Object obj) {
                    int b10;
                    b10 = l.b((i) obj);
                    return b10;
                }
            });
        }
        int i10 = ai.f16274a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f15032a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, new f() { // from class: com.applovin.exoplayer2.f.w
                    @Override // com.applovin.exoplayer2.f.l.f
                    public final int getScore(Object obj) {
                        int a10;
                        a10 = l.a((i) obj);
                        return a10;
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f15032a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(i iVar) {
        return iVar.f15032a.startsWith("OMX.google") ? 1 : 0;
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo) {
        return ai.f16274a >= 29 && b(mediaCodecInfo);
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        if (strArr.length < 3) {
            a3.l.D("Ignoring malformed Dolby Vision codec string: ", str, "MediaCodecUtil");
            return null;
        }
        Matcher matcher = f15075a.matcher(strArr[1]);
        if (!matcher.matches()) {
            a3.l.D("Ignoring malformed Dolby Vision codec string: ", str, "MediaCodecUtil");
            return null;
        }
        String group = matcher.group(1);
        Integer b10 = b(group);
        if (b10 == null) {
            a3.l.D("Unknown Dolby Vision profile string: ", group, "MediaCodecUtil");
            return null;
        }
        String str2 = strArr[2];
        Integer c10 = c(str2);
        if (c10 == null) {
            a3.l.D("Unknown Dolby Vision level string: ", str2, "MediaCodecUtil");
            return null;
        }
        return new Pair<>(b10, c10);
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr, com.applovin.exoplayer2.m.b bVar) {
        int i10;
        if (strArr.length < 4) {
            a3.l.D("Ignoring malformed AV1 codec string: ", str, "MediaCodecUtil");
            return null;
        }
        int i11 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                a3.k.y("Unknown AV1 profile: ", parseInt, "MediaCodecUtil");
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                a3.k.y("Unknown AV1 bit depth: ", parseInt3, "MediaCodecUtil");
                return null;
            }
            if (parseInt3 != 8) {
                i11 = (bVar == null || !(bVar.f16435d != null || (i10 = bVar.f16434c) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int f10 = f(parseInt2);
            if (f10 == -1) {
                a3.k.y("Unknown AV1 level: ", parseInt2, "MediaCodecUtil");
                return null;
            }
            return new Pair<>(Integer.valueOf(i11), Integer.valueOf(f10));
        } catch (NumberFormatException unused) {
            a3.l.D("Ignoring malformed AV1 codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    private static <T> void a(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: com.applovin.exoplayer2.f.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a10;
                a10 = l.a(l.f.this, obj, obj2);
                return a10;
            }
        });
    }

    private static Integer a(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return 2048;
            case 11:
                return 8192;
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return Integer.valueOf(com.anythink.expressad.exoplayer.b.aX);
            case 22:
                return 262144;
            case 23:
                return Integer.valueOf(com.anythink.expressad.exoplayer.h.o.f8460d);
            case 24:
                return 4194304;
            case 25:
                return Integer.valueOf(com.anythink.expressad.exoplayer.b.f7294bc);
            default:
                return null;
        }
    }
}
