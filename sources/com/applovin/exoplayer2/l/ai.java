package com.applovin.exoplayer2.l;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.v;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class ai {

    /* renamed from: a */
    public static final int f16274a;

    /* renamed from: b */
    public static final String f16275b;

    /* renamed from: c */
    public static final String f16276c;

    /* renamed from: d */
    public static final String f16277d;

    /* renamed from: e */
    public static final String f16278e;
    public static final byte[] f;

    /* renamed from: g */
    private static final Pattern f16279g;

    /* renamed from: h */
    private static final Pattern f16280h;

    /* renamed from: i */
    private static final Pattern f16281i;

    /* renamed from: j */
    private static final Pattern f16282j;

    /* renamed from: k */
    private static HashMap<String, String> f16283k;

    /* renamed from: l */
    private static final String[] f16284l;

    /* renamed from: m */
    private static final String[] f16285m;

    /* renamed from: n */
    private static final int[] f16286n;
    private static final int[] o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f16274a = i10;
        String str = Build.DEVICE;
        f16275b = str;
        String str2 = Build.MANUFACTURER;
        f16276c = str2;
        String str3 = Build.MODEL;
        f16277d = str3;
        f16278e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f = new byte[0];
        f16279g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f16280h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f16281i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f16282j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f16284l = new String[]{"alb", NativeAdvancedJsUtils.f6924n, "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", com.anythink.expressad.video.dynview.a.a.V, "cze", "cs", com.anythink.expressad.d.a.b.ap, "nl", "ger", com.anythink.expressad.video.dynview.a.a.X, "gre", "el", "fre", com.anythink.expressad.video.dynview.a.a.Z, "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f16285m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f16286n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, com.anythink.expressad.video.dynview.a.a.f11393p, 205, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, com.anythink.expressad.exoplayer.k.p.f9095b, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, com.anythink.expressad.video.module.a.a.T, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, com.anythink.expressad.video.module.a.a.R, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};
    }

    public static long b(int i10) {
        return i10 & 4294967295L;
    }

    public static int c(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static boolean d(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean e(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static int f(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = f16274a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int g(int i10) {
        if (i10 != 13) {
            switch (i10) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static int h(int i10) {
        if (i10 != 2 && i10 != 4) {
            if (i10 != 10) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        switch (i10) {
                            case 15:
                                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i10) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static String i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static int a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static long b(long j10) {
        return (j10 == com.anythink.expressad.exoplayer.b.f7291b || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long c(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static long d(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        return (long) (j10 * (j11 / j12));
    }

    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            q.c("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    private static HashMap<String, String> f() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f16284l.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f16284l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static <T> T a(T t10) {
        return t10;
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static Looper c() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static boolean a(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static <T> T[] a(T[] tArr) {
        return tArr;
    }

    public static Handler b(Handler.Callback callback) {
        return a(c(), callback);
    }

    public static byte[] c(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(com.anythink.expressad.exoplayer.b.ar)) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = b(lowerCase, "-")[0];
        if (f16283k == null) {
            f16283k = f();
        }
        String str3 = f16283k.get(str2);
        if (str3 != null) {
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str3);
            j10.append(lowerCase.substring(str2.length()));
            lowerCase = j10.toString();
            str2 = str3;
        }
        return ("no".equals(str2) || com.anythink.basead.d.i.f3957a.equals(str2) || com.anythink.expressad.video.dynview.a.a.V.equals(str2)) ? f(lowerCase) : lowerCase;
    }

    public static int c(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    private static String[] e() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f16274a >= 24 ? a(configuration) : new String[]{a(configuration.locale)};
    }

    public static boolean c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String[] d() {
        String[] e10 = e();
        for (int i10 = 0; i10 < e10.length; i10++) {
            e10[i10] = b(e10[i10]);
        }
        return e10;
    }

    public static long c(long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static Point d(Context context) {
        DisplayManager displayManager;
        Display display = (f16274a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.b((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return a(context, display);
    }

    private static String f(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f16285m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    private static void c(Display display, Point point) {
        display.getSize(point);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T> T[] a(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] a(T[] tArr, int i10, int i11) {
        a.a(i10 >= 0);
        a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static int d(String str) {
        String[] a10;
        int length;
        if (str == null || (length = (a10 = a(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = a10[length - 1];
        boolean z10 = length >= 3 && "neg".equals(a10[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a.b(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static <T> T[] a(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Handler a() {
        return a((Handler.Callback) null);
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Handler a(Handler.Callback callback) {
        return a((Looper) a.a(Looper.myLooper()), callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L8
            int r4 = ~r0
            goto L1a
        L8:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L14
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L14
            goto L8
        L14:
            if (r6 == 0) goto L19
            int r4 = r0 + (-1)
            goto L1a
        L19:
            r4 = r0
        L1a:
            if (r7 == 0) goto L23
            int r3 = r3.length
            int r3 = r3 + (-1)
            int r4 = java.lang.Math.min(r3, r4)
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.b(long[], long, boolean, boolean):int");
    }

    public static Handler a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean a(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static <T extends Comparable<? super T>> int b(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static long b(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static ExecutorService a(String str) {
        return Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(str, 1));
    }

    public static long b(int i10, int i11) {
        return b(i11) | (b(i10) << 32);
    }

    public static void a(com.applovin.exoplayer2.k.i iVar) {
        if (iVar != null) {
            try {
                iVar.c();
            } catch (IOException unused) {
            }
        }
    }

    public static String b(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static String a(Locale locale) {
        return f16274a >= 21 ? b(locale) : locale.toString();
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charsets.UTF_8);
    }

    public static com.applovin.exoplayer2.v b(int i10, int i11, int i12) {
        return new v.a().f(com.anythink.expressad.exoplayer.k.o.f9088w).k(i11).l(i12).m(i10).a();
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int a(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int a(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long a(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static float a(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int b(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = o[i12 ^ (bArr[i10] & com.anythink.expressad.exoplayer.k.p.f9095b)];
            i10++;
        }
        return i12;
    }

    public static int a(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.a(int[], int, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            goto La
        L15:
            if (r6 == 0) goto L1a
            int r3 = r0 + 1
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r7 == 0) goto L22
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L22:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.a(long[], long, boolean, boolean):int");
    }

    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    private static String b(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends java.lang.Comparable<? super T>> int a(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L21
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            if (r4 == 0) goto L20
            int r2 = r0 + 1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r5 == 0) goto L28
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.a(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int a(r rVar, long j10, boolean z10, boolean z11) {
        int i10;
        int a10 = rVar.a() - 1;
        int i11 = 0;
        while (i11 <= a10) {
            int i12 = (i11 + a10) >>> 1;
            if (rVar.a(i12) < j10) {
                i11 = i12 + 1;
            } else {
                a10 = i12 - 1;
            }
        }
        if (z10 && (i10 = a10 + 1) < rVar.a() && rVar.a(i10) == j10) {
            return i10;
        }
        if (z11 && a10 == -1) {
            return 0;
        }
        return a10;
    }

    public static long a(long j10) {
        return (j10 == com.anythink.expressad.exoplayer.b.f7291b || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static void a(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
            return;
        }
        double d10 = j10 / j11;
        while (i10 < jArr.length) {
            jArr[i10] = (long) (jArr[i10] * d10);
            i10++;
        }
    }

    public static long a(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static CharSequence a(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static String a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        return a3.l.p(sb2, Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");
    }

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String a(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / com.anythink.expressad.d.a.b.P;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static int a(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f16286n[((i12 >>> 24) ^ (bArr[i10] & com.anythink.expressad.exoplayer.k.p.f9095b)) & com.anythink.expressad.exoplayer.k.p.f9095b] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static boolean a(y yVar, y yVar2, Inflater inflater) {
        if (yVar.a() <= 0) {
            return false;
        }
        if (yVar2.e() < yVar.a()) {
            yVar2.b(yVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(yVar.d(), yVar.c(), yVar.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(yVar2.d(), i10, yVar2.e() - i10);
                if (inflater.finished()) {
                    yVar2.c(i10);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (i10 == yVar2.e()) {
                    yVar2.b(yVar2.e() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static Point a(Context context, Display display) {
        String e10;
        if (display.getDisplayId() == 0 && c(context)) {
            if (f16274a < 28) {
                e10 = e("sys.display-size");
            } else {
                e10 = e("vendor.display-size");
            }
            if (!TextUtils.isEmpty(e10)) {
                try {
                    String[] a10 = a(e10.trim(), "x");
                    if (a10.length == 2) {
                        int parseInt = Integer.parseInt(a10[0]);
                        int parseInt2 = Integer.parseInt(a10[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                q.d("Util", "Invalid display size: " + e10);
            }
            if ("Sony".equals(f16276c) && f16277d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f16274a;
        if (i10 >= 23) {
            a(display, point);
        } else if (i10 >= 17) {
            b(display, point);
        } else {
            c(display, point);
        }
        return point;
    }

    public static <T> void a(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    private static void a(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    private static String[] a(Configuration configuration) {
        return a(configuration.getLocales().toLanguageTags(), ",");
    }
}
