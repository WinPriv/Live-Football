package com.anythink.expressad.exoplayer.f;

import a3.k;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.k.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8001a = "MediaCodecUtil";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8003c = "OMX.MTK.AUDIO.DECODER.RAW";

    /* renamed from: g, reason: collision with root package name */
    private static final SparseIntArray f8006g;

    /* renamed from: h, reason: collision with root package name */
    private static final SparseIntArray f8007h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f8008i = "avc1";

    /* renamed from: j, reason: collision with root package name */
    private static final String f8009j = "avc2";

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Integer> f8010k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f8011l = "hev1";

    /* renamed from: m, reason: collision with root package name */
    private static final String f8012m = "hvc1";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8002b = "OMX.google.raw.decoder";

    /* renamed from: d, reason: collision with root package name */
    private static final com.anythink.expressad.exoplayer.f.a f8004d = com.anythink.expressad.exoplayer.f.a.a(f8002b);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f8005e = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<a, List<com.anythink.expressad.exoplayer.f.a>> f = new HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private static int f8013n = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8014a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8015b;

        public a(String str, boolean z10) {
            this.f8014a = str;
            this.f8015b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f8014a, aVar.f8014a) && this.f8015b == aVar.f8015b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i10;
            String str = this.f8014a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode + 31) * 31;
            if (this.f8015b) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return i11 + i10;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        public /* synthetic */ b(Throwable th, byte b10) {
            this(th);
        }

        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();

        MediaCodecInfo a(int i10);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    /* renamed from: com.anythink.expressad.exoplayer.f.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0104d implements c {
        private C0104d() {
        }

        public /* synthetic */ C0104d(byte b10) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final boolean b() {
            return false;
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return o.f9074h.equals(str);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8006g = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f8007h = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, com.anythink.expressad.exoplayer.b.aX);
        HashMap hashMap = new HashMap();
        f8010k = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        k.p(256, hashMap, "L93", 1024, "L120", 4096, "L123", 16384, "L150");
        k.p(com.anythink.expressad.exoplayer.b.aX, hashMap, "L153", 262144, "L156", com.anythink.expressad.exoplayer.h.o.f8460d, "L180", 4194304, "L183");
        k.p(com.anythink.expressad.exoplayer.b.f7294bc, hashMap, "L186", 2, "H30", 8, "H60", 32, "H63");
        k.p(128, hashMap, "H90", 512, "H93", 2048, "H120", 8192, "H123");
        k.p(32768, hashMap, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    private d() {
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
            default:
                return -1;
        }
    }

    private static void b(String str, boolean z10) {
        try {
            c(str, z10);
        } catch (b e10) {
            Log.e(f8001a, "Codec warming failed", e10);
        }
    }

    private static synchronized List<com.anythink.expressad.exoplayer.f.a> c(String str, boolean z10) {
        c c0104d;
        synchronized (d.class) {
            a aVar = new a(str, z10);
            HashMap<a, List<com.anythink.expressad.exoplayer.f.a>> hashMap = f;
            List<com.anythink.expressad.exoplayer.f.a> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            int i10 = af.f8993a;
            byte b10 = 0;
            if (i10 >= 21) {
                c0104d = new e(z10);
            } else {
                c0104d = new C0104d(b10);
            }
            ArrayList<com.anythink.expressad.exoplayer.f.a> a10 = a(aVar, c0104d, str);
            if (z10 && a10.isEmpty() && 21 <= i10 && i10 <= 23) {
                c0104d = new C0104d(b10);
                a10 = a(aVar, c0104d, str);
                if (!a10.isEmpty()) {
                    Log.w(f8001a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a10.get(0).f7973c);
                }
            }
            if (o.B.equals(str)) {
                a10.addAll(a(new a(o.A, aVar.f8015b), c0104d, str));
            }
            a(a10);
            List<com.anythink.expressad.exoplayer.f.a> unmodifiableList = Collections.unmodifiableList(a10);
            hashMap.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    @TargetApi(21)
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f8016a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f8017b;

        public e(boolean z10) {
            this.f8016a = z10 ? 1 : 0;
        }

        private void c() {
            if (this.f8017b == null) {
                this.f8017b = new MediaCodecList(this.f8016a).getCodecInfos();
            }
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final int a() {
            c();
            return this.f8017b.length;
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final boolean b() {
            return true;
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final MediaCodecInfo a(int i10) {
            c();
            return this.f8017b[i10];
        }

        @Override // com.anythink.expressad.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }
    }

    public static com.anythink.expressad.exoplayer.f.a a() {
        return f8004d;
    }

    public static com.anythink.expressad.exoplayer.f.a a(String str, boolean z10) {
        List<com.anythink.expressad.exoplayer.f.a> c10 = c(str, z10);
        if (c10.isEmpty()) {
            return null;
        }
        return c10.get(0);
    }

    public static int b() {
        if (f8013n == -1) {
            int i10 = 0;
            com.anythink.expressad.exoplayer.f.a a10 = a(o.f9074h, false);
            if (a10 != null) {
                MediaCodecInfo.CodecProfileLevel[] a11 = a10.a();
                int length = a11.length;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = a11[i10].level;
                    int i13 = 25344;
                    if (i12 != 1 && i12 != 2) {
                        i13 = 9437184;
                        switch (i12) {
                            case 8:
                            case 16:
                            case 32:
                                i13 = 101376;
                                break;
                            case 64:
                                i13 = 202752;
                                break;
                            case 128:
                            case 256:
                                i13 = 414720;
                                break;
                            case 512:
                                i13 = 921600;
                                break;
                            case 1024:
                                i13 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i13 = 2097152;
                                break;
                            case 8192:
                                i13 = 2228224;
                                break;
                            case 16384:
                                i13 = 5652480;
                                break;
                            case 32768:
                            case com.anythink.expressad.exoplayer.b.aX /* 65536 */:
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                    }
                    i11 = Math.max(i13, i11);
                    i10++;
                }
                i10 = Math.max(i11, af.f8993a >= 21 ? 345600 : 172800);
            }
            f8013n = i10;
        }
        return f8013n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0044, code lost:
    
        if (r3.equals(com.anythink.expressad.exoplayer.f.d.f8008i) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = -1
            switch(r4) {
                case 3006243: goto L3e;
                case 3006244: goto L33;
                case 3199032: goto L28;
                case 3214780: goto L1d;
                default: goto L1b;
            }
        L1b:
            r2 = r8
            goto L47
        L1d:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L26
            goto L1b
        L26:
            r2 = r5
            goto L47
        L28:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L31
            goto L1b
        L31:
            r2 = r6
            goto L47
        L33:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3c
            goto L1b
        L3c:
            r2 = r7
            goto L47
        L3e:
            java.lang.String r4 = "avc1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L47
            goto L1b
        L47:
            switch(r2) {
                case 0: goto Lc1;
                case 1: goto Lc1;
                case 2: goto L4b;
                case 3: goto L4b;
                default: goto L4a;
            }
        L4a:
            return r0
        L4b:
            int r2 = r1.length
            r3 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r8 = "MediaCodecUtil"
            if (r2 >= r3) goto L5b
            java.lang.String r9 = r4.concat(r9)
            android.util.Log.w(r8, r9)
            return r0
        L5b:
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.f.d.f8005e
            r3 = r1[r7]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L71
            java.lang.String r9 = r4.concat(r9)
            android.util.Log.w(r8, r9)
            return r0
        L71:
            java.lang.String r9 = r2.group(r7)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L7f
            r6 = r7
            goto L87
        L7f:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto Lb3
        L87:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = com.anythink.expressad.exoplayer.f.d.f8010k
            r1 = r1[r5]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto La9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown HEVC level string: "
            r9.<init>(r1)
            java.lang.String r1 = r2.group(r7)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
            return r0
        La9:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.<init>(r1, r9)
            return r0
        Lb3:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r9 = r1.concat(r9)
            android.util.Log.w(r8, r9)
            return r0
        Lc1:
            android.util.Pair r9 = b(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.d.a(java.lang.String):android.util.Pair");
    }

    private static boolean b(String str) {
        if (af.f8993a > 22) {
            return false;
        }
        String str2 = af.f8996d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w(f8001a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            } else {
                Log.w(f8001a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
                return null;
            }
            int i10 = f8006g.get(num.intValue(), -1);
            if (i10 == -1) {
                Log.w(f8001a, "Unknown AVC profile: ".concat(String.valueOf(num)));
                return null;
            }
            int i11 = f8007h.get(valueOf.intValue(), -1);
            if (i11 == -1) {
                Log.w(f8001a, "Unknown AVC level: ".concat(String.valueOf(valueOf)));
                return null;
            }
            return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        } catch (NumberFormatException unused) {
            Log.w(f8001a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0199, code lost:
    
        if ("SCV31".equals(r13) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
    
        if ("C1605".equals(r14) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0209 A[Catch: Exception -> 0x02f0, TryCatch #0 {Exception -> 0x02f0, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x002f, B:14:0x0035, B:16:0x003d, B:18:0x0045, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:28:0x006d, B:32:0x0078, B:34:0x0080, B:36:0x008a, B:38:0x0094, B:43:0x00a1, B:45:0x00a9, B:47:0x00b3, B:49:0x00bb, B:51:0x00c3, B:53:0x00cb, B:55:0x00d3, B:57:0x00db, B:59:0x00e3, B:61:0x00eb, B:63:0x00f3, B:65:0x00fb, B:67:0x0103, B:71:0x010f, B:73:0x0117, B:75:0x0121, B:77:0x0129, B:79:0x0131, B:83:0x0141, B:85:0x0149, B:87:0x0151, B:89:0x0159, B:91:0x0163, B:93:0x016b, B:95:0x0173, B:97:0x017b, B:99:0x0183, B:101:0x018b, B:103:0x0193, B:107:0x01a3, B:109:0x01ab, B:111:0x01b3, B:113:0x01bd, B:115:0x01c5, B:117:0x01cb, B:119:0x01d3, B:123:0x01df, B:125:0x01e7, B:128:0x01f1, B:130:0x01fb, B:135:0x0209, B:137:0x0211, B:172:0x0293, B:175:0x029b, B:177:0x02a1, B:180:0x02b8, B:181:0x02d6), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0254 A[Catch: Exception -> 0x024f, TryCatch #1 {Exception -> 0x024f, blocks: (B:191:0x022b, B:193:0x0235, B:195:0x023d, B:197:0x0245, B:151:0x0254, B:155:0x0262, B:158:0x025d, B:163:0x026f), top: B:190:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029b A[Catch: Exception -> 0x02f0, TRY_ENTER, TryCatch #0 {Exception -> 0x02f0, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x002f, B:14:0x0035, B:16:0x003d, B:18:0x0045, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:28:0x006d, B:32:0x0078, B:34:0x0080, B:36:0x008a, B:38:0x0094, B:43:0x00a1, B:45:0x00a9, B:47:0x00b3, B:49:0x00bb, B:51:0x00c3, B:53:0x00cb, B:55:0x00d3, B:57:0x00db, B:59:0x00e3, B:61:0x00eb, B:63:0x00f3, B:65:0x00fb, B:67:0x0103, B:71:0x010f, B:73:0x0117, B:75:0x0121, B:77:0x0129, B:79:0x0131, B:83:0x0141, B:85:0x0149, B:87:0x0151, B:89:0x0159, B:91:0x0163, B:93:0x016b, B:95:0x0173, B:97:0x017b, B:99:0x0183, B:101:0x018b, B:103:0x0193, B:107:0x01a3, B:109:0x01ab, B:111:0x01b3, B:113:0x01bd, B:115:0x01c5, B:117:0x01cb, B:119:0x01d3, B:123:0x01df, B:125:0x01e7, B:128:0x01f1, B:130:0x01fb, B:135:0x0209, B:137:0x0211, B:172:0x0293, B:175:0x029b, B:177:0x02a1, B:180:0x02b8, B:181:0x02d6), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.anythink.expressad.exoplayer.f.a> a(com.anythink.expressad.exoplayer.f.d.a r18, com.anythink.expressad.exoplayer.f.d.c r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.f.d.a(com.anythink.expressad.exoplayer.f.d$a, com.anythink.expressad.exoplayer.f.d$c, java.lang.String):java.util.ArrayList");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = af.f8993a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = af.f8994b;
            if ("a70".equals(str3) || ("Xiaomi".equals(af.f8995c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = af.f8994b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = af.f8994b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(af.f8995c))) {
            String str6 = af.f8994b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(af.f8995c)) {
            String str7 = af.f8994b;
            if (str7.startsWith(com.anythink.expressad.foundation.g.a.O) || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && af.f8994b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (o.B.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void a(List<com.anythink.expressad.exoplayer.f.a> list) {
        if (af.f8993a < 26) {
            if (list.size() <= 1 || !f8003c.equals(list.get(0).f7973c)) {
                return;
            }
            for (int i10 = 1; i10 < list.size(); i10++) {
                com.anythink.expressad.exoplayer.f.a aVar = list.get(i10);
                if (f8002b.equals(aVar.f7973c)) {
                    list.remove(i10);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        int i10;
        if (strArr.length < 4) {
            Log.w(f8001a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = f8005e.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(f8001a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i10 = 1;
        } else {
            if (!"2".equals(group)) {
                Log.w(f8001a, "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            i10 = 2;
        }
        Integer num = f8010k.get(strArr[3]);
        if (num == null) {
            Log.w(f8001a, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), num);
    }
}
