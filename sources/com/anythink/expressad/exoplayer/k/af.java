package com.anythink.expressad.exoplayer.k;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8993a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8994b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f8995c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f8996d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f8997e;
    private static final String f = "Util";

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f8998g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f8999h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f9000i;

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f9001j;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        }
        f8993a = i10;
        String str = Build.DEVICE;
        f8994b = str;
        String str2 = Build.MANUFACTURER;
        f8995c = str2;
        String str3 = Build.MODEL;
        f8996d = str3;
        f8997e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f8998g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f8999h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f9000i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f9001j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    private af() {
    }

    @TargetApi(23)
    private static boolean a() {
        return false;
    }

    public static int b(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static boolean c(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == 1073741824;
    }

    public static int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                return i10 != 8 ? 1 : 3;
            }
        }
        return i11;
    }

    public static int e(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int f(int i10) {
        if (i10 == 13) {
            return 1;
        }
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

    public static byte[] g(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (Character.digit(str.charAt(i11 + 1), 16) + (Character.digit(str.charAt(i11), 16) << 4));
        }
        return bArr;
    }

    private static int h(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    private static long i(String str) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        Matcher matcher = f8999h.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d15 = 0.0d;
            if (group != null) {
                d10 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d10 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d11 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d10 + d11;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d12 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d13 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d14 = Double.parseDouble(group5) * 60.0d;
            } else {
                d14 = 0.0d;
            }
            double d19 = d18 + d14;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d15 = Double.parseDouble(group6);
            }
            long j10 = (long) ((d19 + d15) * 1000.0d);
            if (isEmpty) {
                return -j10;
            }
            return j10;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    private static long j(String str) {
        Matcher matcher = f8998g.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i10 != 0) {
                return timeInMillis - (i10 * com.huawei.openalliance.ad.constant.w.f22171t);
            }
            return timeInMillis;
        }
        throw new com.anythink.expressad.exoplayer.t("Invalid date/time format: ".concat(String.valueOf(str)));
    }

    private static UUID k(String str) {
        String d10 = d(str);
        d10.getClass();
        char c10 = 65535;
        switch (d10.hashCode()) {
            case -1860423953:
                if (d10.equals("playready")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1400551171:
                if (d10.equals("widevine")) {
                    c10 = 1;
                    break;
                }
                break;
            case 790309106:
                if (d10.equals("clearkey")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.anythink.expressad.exoplayer.b.bl;
            case 1:
                return com.anythink.expressad.exoplayer.b.bk;
            case 2:
                return com.anythink.expressad.exoplayer.b.bj;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    private static int l(String str) {
        String d10 = d(str);
        if (d10.endsWith(".mpd")) {
            return 0;
        }
        if (d10.endsWith(".m3u8")) {
            return 2;
        }
        if (d10.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
            return 1;
        }
        return 3;
    }

    private static String m(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (a(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char charAt = str.charAt(i10);
            if (a(charAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(charAt));
                i11--;
            } else {
                sb2.append(charAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        return sb2.toString();
    }

    private static boolean a(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    public static boolean b(int i10) {
        return i10 == 3 || i10 == 2 || i10 == Integer.MIN_VALUE || i10 == 1073741824 || i10 == 4;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    private static long d(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j12) & (j11 ^ j12)) < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    private static long e(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j10 ^ j12) & (j11 ^ j10)) < 0) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    public static int f(String str) {
        int length = str.length();
        a.a(length <= 4);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 << 8) | str.charAt(i11);
        }
        return i10;
    }

    public static String h(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '%') {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        int i13 = length - (i11 * 2);
        StringBuilder sb2 = new StringBuilder(i13);
        Matcher matcher = f9000i.matcher(str);
        while (i11 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt(matcher.group(1), 16);
            sb2.append((CharSequence) str, i10, matcher.start());
            sb2.append(parseInt);
            i10 = matcher.end();
            i11--;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        if (sb2.length() != i13) {
            return null;
        }
        return sb2.toString();
    }

    public static boolean a(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return d(str);
        }
    }

    private static long c(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    private static byte[] a(InputStream inputStream) {
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

    private static File c(Context context, String str) {
        return File.createTempFile(str, null, context.getCacheDir());
    }

    private static void d(Display display, Point point) {
        point.x = display.getWidth();
        point.y = display.getHeight();
    }

    public static int g(int i10) {
        if (i10 == 0) {
            return com.anythink.expressad.exoplayer.b.f7294bc;
        }
        if (i10 == 1) {
            return com.anythink.expressad.exoplayer.b.aZ;
        }
        if (i10 == 2) {
            return com.anythink.expressad.exoplayer.b.aY;
        }
        if (i10 == 3 || i10 == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    private static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    @TargetApi(16)
    private static void c(Display display, Point point) {
        display.getSize(point);
    }

    private static <T> int b(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
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

    public static ComponentName a(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (f8993a >= 26) {
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
        return context.startService(intent);
    }

    public static long b(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static int b(int i10, int i11) {
        if (i10 == Integer.MIN_VALUE) {
            return i11 * 3;
        }
        if (i10 != 1073741824) {
            if (i10 == 2) {
                return i11 * 2;
            }
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i11 * 4;
    }

    private static int b(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return l(path);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static boolean a(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    private static <T extends Throwable> void b(Throwable th) {
        throw th;
    }

    @TargetApi(17)
    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    public static <T> void a(List<T> list, int i10, int i11) {
        list.subList(i10, i11).clear();
    }

    private static File b(Context context, String str) {
        File createTempFile = File.createTempFile(str, null, context.getCacheDir());
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    public static <T> T[] a(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static ExecutorService a(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.anythink.expressad.exoplayer.k.af.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static void a(com.anythink.expressad.exoplayer.j.h hVar) {
        if (hVar != null) {
            try {
                hVar.b();
            } catch (IOException unused) {
            }
        }
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

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charset.forName("UTF-8"));
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

    public static long a(long j10, long j11) {
        return Math.max(0L, Math.min(j10, j11));
    }

    public static float a(float f10) {
        return Math.max(0.1f, Math.min(f10, 8.0f));
    }

    public static int a(int[] iArr, int i10) {
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i10);
        return binarySearch;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(long[] r3, long r4, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L16
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L14
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto La
        L14:
            int r3 = r0 + 1
        L16:
            if (r6 == 0) goto L1d
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L1d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.af.a(long[], long, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> int a(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L20
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 == 0) goto La
        L1a:
            if (r4 == 0) goto L1f
            int r2 = r0 + 1
            goto L20
        L1f:
            r2 = r0
        L20:
            if (r5 == 0) goto L27
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.af.a(java.util.List, java.lang.Object, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L8
            int r4 = ~r0
            goto L19
        L8:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L13
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L8
        L13:
            if (r6 == 0) goto L18
            int r4 = r0 + (-1)
            goto L19
        L18:
            r4 = r0
        L19:
            if (r7 == 0) goto L23
            int r3 = r3.length
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.min(r3, r4)
            return r3
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.af.a(long[], long, boolean, boolean):int");
    }

    public static long a(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        return (long) (j10 * (j11 / j12));
    }

    private static long[] a(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (list.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    public static void a(long[] jArr, long j10) {
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long j11 = j10 / 1000000;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j11;
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long j12 = 1000000 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j12;
                i10++;
            }
            return;
        }
        double d10 = 1000000.0d / j10;
        while (i10 < jArr.length) {
            jArr[i10] = (long) (jArr[i10] * d10);
            i10++;
        }
    }

    public static long a(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long a(long j10, com.anythink.expressad.exoplayer.ac acVar, long j11, long j12) {
        if (com.anythink.expressad.exoplayer.ac.f7261a.equals(acVar)) {
            return j10;
        }
        long j13 = acVar.f;
        long j14 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = acVar.f7266g;
        long j16 = j10 + j15;
        if (((j15 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = j14 <= j11 && j11 <= j16;
        boolean z11 = j14 <= j12 && j12 <= j16;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : j14;
    }

    public static int[] a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return iArr;
    }

    public static String a(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    private static String a(Context context, String str) {
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
        return a3.l.p(sb2, Build.VERSION.RELEASE, ") ExoPlayerLib/2.8.4");
    }

    private static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.trim().split("(\\s*,\\s*)", -1);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : split) {
            if (i10 == o.f(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static int a(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            String path = uri.getPath();
            if (path == null) {
                return 3;
            }
            return l(path);
        }
        return l(".".concat(String.valueOf(str)));
    }

    private static String a(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = 0;
        }
        long j11 = (j10 + 500) / 1000;
        long j12 = j11 % 60;
        long j13 = (j11 / 60) % 60;
        long j14 = j11 / com.anythink.expressad.d.a.b.P;
        sb2.setLength(0);
        return j14 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%02d:%02d", Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    private static void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        file.delete();
    }

    private static int a(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f9001j[((i12 >>> 24) ^ (bArr[i10] & p.f9095b)) & p.f9095b] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Point a(Context context) {
        return a(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        if (r6.equals("TPM171E") == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point a(android.content.Context r6, android.view.Display r7) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.af.a(android.content.Context, android.view.Display):android.graphics.Point");
    }

    @TargetApi(23)
    private static void a(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void a(Throwable th) {
        throw th;
    }
}
