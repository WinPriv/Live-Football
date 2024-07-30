package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Hl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0940Hl {
    public static byte[] A00;
    public static String[] A01 = {"OUVH8uooqfZhRjAIdfTByGEz8oRZsv97", "zwLe5czFvrzgWLxx1jU82T7WkmJFGmFa", "eY5LtUfPqkDg74OjVCyNlMlM5clj8vGG", "7e2Wg6fQOHKlG3pOdXEcbT27Kf8nm98Y", "00xy", "XMUm", "8d2GFVLCqYdUjn", "V0KiqMMFF26dnG06XaQkCu6KzWv5VLPl"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A0U() {
        A00 = new byte[]{-40, -32, 4, 33, 38, 45, 48, -13, -7, 38, Ascii.FS, 42, 39, 33, Ascii.FS, -40, -51, -48, 3, -23, -43, -18, 9, -43, Ascii.SO, -40, -43, -31, 5, 35, -38, 37, -47, -6, 46, 54, 46, 54, 46, 54, 46, 54, -5, 46, -1, -6, 46, 54, 46, 54, -5, 46, -1, -6, 46, 54, 46, 54, -5, 45, 38, 70, 47, -6, 46, 54, 46, 54, -5, Ascii.FF, -6, 46, 54, 46, 54, -5, Ascii.FF, -6, 46, 54, 46, 54, -5, -6, 45, 46, 0, -2, 47, -6, 46, 54, -3, -5, -5, 17, -6, 45, 44, 76, 47, 78, -6, -6, 46, -3, 78, 46, -1, -5, -6, 46, 54, 17, 46, 54, -5, Ascii.FF, 17, -6, 46, 54, 46, 54, -5, -5, -5, 17, -16, -25, -8, -20, -55, 2, -54, -3, -12, -43, -15, -26, -2, -22, -9, -47, -18, -25, -76, -73, -77, -67, -77, -71, 1, 0, -14, -39, -28, -1, -55, -50, -54, -32, -15, -55, -55, -4, -47, -50, -38, -2, -53, -54, -6, -54, -32, -55, -55, -4, -47, -50, -38, -2, -53, -54, -18, -54, -32, -55, -55, -4, -47, -50, -38, -2, -53, -54, -27, -54, -32, -55, -11, -55, -55, -4, -47, -50, -38, -2, -53, -54, -23, -54, -32, -55, -55, -4, -47, -50, -38, -2, -53, -54, -18, -54, -32, -55, -55, -4, -47, -50, -38, -49, -2, -53, -54, -12, -54, -32, -54, -32, -59, 3, 6, 9, 2};
    }

    static {
        int i10;
        A0U();
        if (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        } else {
            i10 = Build.VERSION.SDK_INT;
        }
        A02 = i10;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A03);
        String A0J = A0J(130, 2, 95);
        sb2.append(A0J);
        sb2.append(A06);
        sb2.append(A0J);
        sb2.append(A05);
        sb2.append(A0J);
        sb2.append(A02);
        A04 = sb2.toString();
        A08 = Pattern.compile(A0J(33, 95, 101));
        A09 = Pattern.compile(A0J(157, 84, 52));
        A07 = Pattern.compile(A0J(16, 17, 59));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f, float f10, float f11) {
        return Math.max(f10, Math.min(f, f11));
    }

    public static int A01(int i10) {
        if (i10 == 0) {
            return b.f7294bc;
        }
        if (i10 == 1) {
            return b.aZ;
        }
        if (i10 == 2) {
            return b.aY;
        }
        if (i10 == 3 || i10 == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int A02(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 == 24) {
            return Integer.MIN_VALUE;
        }
        if (A01[7].charAt(9) == 'R') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "o2RW8OxNxplgokuXxXMfYyyzs2crag93";
        strArr[2] = "CC3jMXKkKFYgIdmJh2HVAiafoYaw56yD";
        if (i10 != 32) {
            return 0;
        }
        return 1073741824;
    }

    public static int A03(int i10) {
        switch (i10) {
            case 1:
            case 12:
            case 14:
                return 3;
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
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A04(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int A05(int i10, int i11) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 1073741824) {
                if (i10 == 2) {
                    return i11 * 2;
                }
                if (i10 == 3) {
                    return i11;
                }
                if (A01[0].charAt(22) != 'E') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "xmFnlLfDlkmgoCJzWXOPDTkVceE7vC5Q";
                strArr[2] = "vdv9qgJMAF7gDXTK0FDhsaXIVyCj2cDL";
                if (i10 != 4) {
                    throw new IllegalArgumentException();
                }
            }
            return i11 * 4;
        }
        return i11 * 3;
    }

    public static int A06(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int A07(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static int A08(String str) {
        int length = str.length();
        H6.A03(length <= 4);
        int result = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int length2 = str.charAt(i10);
            result = (result << 8) | length2;
        }
        return result;
    }

    public static int A09(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int[] iArr = A0A;
            int i13 = bArr[i10];
            i12 = (i12 << 8) ^ iArr[((i12 >>> 24) ^ (i13 & p.f9095b)) & p.f9095b];
            i10++;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0A(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r3 = java.util.Arrays.binarySearch(r4, r5)
            if (r3 >= 0) goto L12
            r3 = r3 ^ (-1)
        L8:
            if (r8 == 0) goto L11
            int r0 = r4.length
            int r0 = r0 + (-1)
            int r3 = java.lang.Math.min(r0, r3)
        L11:
            return r3
        L12:
            int r3 = r3 + 1
            int r0 = r4.length
            if (r3 >= r0) goto L1e
            r1 = r4[r3]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L1e
            goto L12
        L1e:
            if (r7 == 0) goto L8
            int r3 = r3 + (-1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0940Hl.A0A(long[], long, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0B(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r3 = java.util.Arrays.binarySearch(r4, r5)
            if (r3 >= 0) goto L11
            int r0 = r3 + 2
            int r3 = -r0
        L9:
            if (r8 == 0) goto L10
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
        L10:
            return r3
        L11:
            int r3 = r3 + (-1)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0940Hl.A01
            r0 = 7
            r1 = r1[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            r0 = 82
            if (r1 == r0) goto L3c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0940Hl.A01
            java.lang.String r1 = "bjYgwsFaniVg3KmdX152FYnlIJpDqbBS"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "rh3pSGiNWBYg5ggjhnEOewx4qEYSrmXe"
            r0 = 2
            r2[r0] = r1
            if (r3 < 0) goto L37
            r1 = r4[r3]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L37
            goto L11
        L37:
            if (r7 == 0) goto L9
            int r3 = r3 + 1
            goto L9
        L3c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0940Hl.A0B(long[], long, boolean, boolean):int");
    }

    public static long A0C(long j10, float f) {
        if (f == 1.0f) {
            return j10;
        }
        double d10 = j10 * f;
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        A01[6] = "Ir2i9910xeYGEf";
        return Math.round(d10);
    }

    public static long A0D(long j10, float f) {
        if (f == 1.0f) {
            return j10;
        }
        return Math.round(j10 / f);
    }

    public static long A0E(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static long A0F(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        double d10 = j11;
        String[] strArr = A01;
        if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "AZlDHNUOPlHgc7R7na69mBD3Abcl9cBo";
        strArr2[2] = "277QpyU1yDygazm68FxNRmoTloUVz7mm";
        return (long) (j10 * (d10 / j12));
    }

    public static long A0G(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static long A0H(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j11) & (j10 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static long A0I(long minPositionUs, C07479j c07479j, long j10, long j11) {
        if (C07479j.A04.equals(c07479j)) {
            return minPositionUs;
        }
        long A0H = A0H(minPositionUs, c07479j.A01, Long.MIN_VALUE);
        long A0G = A0G(minPositionUs, c07479j.A00, Long.MAX_VALUE);
        boolean secondSyncPositionValid = true;
        boolean z10 = A0H <= j10 && j10 <= A0G;
        if (A0H > j11 || j11 > A0G) {
            secondSyncPositionValid = false;
        }
        if (z10 && secondSyncPositionValid) {
            long maxPositionUs = j10 - minPositionUs;
            long abs = Math.abs(maxPositionUs);
            long maxPositionUs2 = j11 - minPositionUs;
            if (abs <= Math.abs(maxPositionUs2)) {
                return j10;
            }
            return j11;
        }
        if (z10) {
            return j10;
        }
        if (secondSyncPositionValid) {
            return j11;
        }
        return A0H;
    }

    public static String A0K(Context context, String str) {
        String A0J;
        try {
            A0J = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            A0J = A0J(133, 1, 86);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String versionName = A0J(132, 1, 45);
        sb2.append(versionName);
        sb2.append(A0J);
        String versionName2 = A0J(0, 16, 75);
        sb2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        sb2.append(versionName3);
        String versionName4 = A0J(128, 2, 90);
        sb2.append(versionName4);
        String versionName5 = A0J(134, 18, 24);
        sb2.append(versionName5);
        String versionName6 = sb2.toString();
        return versionName6;
    }

    @Nullable
    public static String A0L(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0M(str);
        }
    }

    public static String A0M(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String A0N(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String A0O(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int percentCharacterCount = str.charAt(i11);
            if (percentCharacterCount == 37) {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int length2 = i10 * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb2 = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A07.matcher(str);
        int expectedLength = 0;
        while (i10 > 0 && matcher.find()) {
            int length3 = Integer.parseInt(matcher.group(1), 16);
            char c10 = (char) length3;
            int length4 = matcher.start();
            sb2.append((CharSequence) str, expectedLength, length4);
            sb2.append(c10);
            expectedLength = matcher.end();
            i10--;
        }
        if (expectedLength < length) {
            sb2.append((CharSequence) str, expectedLength, length);
        }
        int length5 = sb2.length();
        String[] strArr = A01;
        String str2 = strArr[1];
        String str3 = strArr[2];
        int percentCharacterCount2 = str2.charAt(11);
        int length6 = str3.charAt(11);
        if (percentCharacterCount2 != length6) {
            throw new RuntimeException();
        }
        A01[0] = "60ez1RHojKn5oOlO8qVtxWEnppO7SBlh";
        if (length5 != startOfNotEscaped) {
            return null;
        }
        return sb2.toString();
    }

    public static String A0P(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0Q(byte[] bArr) {
        return new String(bArr, Charset.forName(A0J(152, 5, 63)));
    }

    public static String A0R(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charset.forName(A0J(152, 5, 63)));
    }

    public static String A0S(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(A0J(130, 2, 95));
            }
        }
        return sb2.toString();
    }

    public static ExecutorService A0T(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0939Hk(str));
    }

    public static void A0V(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void A0W(GQ gq) {
        if (gq != null) {
            try {
                gq.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0X(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0Y(Throwable th) {
        A0Z(th);
    }

    public static <T extends Throwable> void A0Z(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0a(long[] jArr, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            for (int i10 = 0; i10 < jArr.length; i10++) {
                long divisionFactor = jArr[i10];
                jArr[i10] = divisionFactor / j12;
                String[] strArr = A01;
                if (strArr[1].charAt(11) != strArr[2].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[1] = "s0FY2QjhDMSgaIZxb47pyGCkoKsYBuuX";
                strArr2[2] = "OmWU9dpRSkGgYNmEJrV8zsr2Naib8MwM";
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long j13 = j10 / j11;
            for (int i11 = 0; i11 < jArr.length; i11++) {
                long multiplicationFactor = jArr[i11];
                jArr[i11] = multiplicationFactor * j13;
            }
            return;
        }
        double d10 = j10 / j11;
        for (int i12 = 0; i12 < jArr.length; i12++) {
            double multiplicationFactor2 = (long) (jArr[i12] * d10);
            jArr[i12] = multiplicationFactor2;
        }
    }

    public static boolean A0b(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == 1073741824;
    }

    public static boolean A0c(int i10) {
        return i10 == 3 || i10 == 2 || i10 == Integer.MIN_VALUE || i10 == 1073741824 || i10 == 4;
    }

    public static boolean A0d(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean A0e(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String A0J = A0J(241, 4, 48);
            if (A01[0].charAt(22) != 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "8R32";
            strArr[5] = "dLkW";
            if (!A0J.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0f(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A0g(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] A0h(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            int i12 = Character.digit(str.charAt(i11), 16) << 4;
            bArr[i10] = (byte) (i12 + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static byte[] A0i(String str) {
        return str.getBytes(Charset.forName(A0J(152, 5, 63)));
    }

    public static int[] A0j(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            int length = list.get(i10).intValue();
            iArr[i10] = length;
        }
        return iArr;
    }

    public static <T> T[] A0k(T[] tArr, int i10) {
        H6.A03(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static String[] A0l(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0m(String str, String str2) {
        return str.split(str2, 2);
    }
}
