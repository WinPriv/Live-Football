package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class KM {
    public static byte[] A00;
    public static String[] A01 = {"7ohGC5g", "BESl4Xd", "iUgFvmR9fU9rB14tb7We98OmvwePZ1", "TAphUfcpA", "kzqdOSSqZA4kTMjsfdu0WHMTMSeOJpsG", "kkWiSP6EEdgokKFwFZk1KzEPUpP5pdBL", "Sq5ynKeXE6NTcDzdnBNMA", "lzNSrnHLqWOxwLQ"};

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 114);
            if (A01[3].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "rgUP3FcFDVOOAnn";
            strArr[6] = "C5ye4JewP89EotTU6TfsV";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{7, 58, 64, Ascii.FF, 89, 32, Ascii.FF, 57, 60, 58, 64, Ascii.FF, 89, 32, Ascii.FF, 57, Ascii.SI, Ascii.FF, Ascii.CAN, 10, Ascii.CR, Ascii.FF, 60, 9, 8, Ascii.RS, 3, Ascii.DC4, 37, 38, Ascii.FS, 33, Ascii.SUB, -45, 40, 37, Ascii.US, -45, -40, 38, -45, Ascii.SYN, Ascii.DC4, 40, 38, Ascii.CAN, Ascii.ETB, -45, Ascii.CAN, 43, Ascii.SYN, Ascii.CAN, 35, 39, Ascii.FS, 34, 33, -19, -45, -40, 38, -31, -24, 48, 39, 60, 39, -26, 59, 56, 47, -26, -24, -21, 57, -24, -26, 52, 53, 58, -26, 43, 55, 59, 39, 50, -26, 58, 53, -26, 39, 52, 42, 56, 53, 47, 42, -26, 59, 56, 47, -26, -24, -21, 57, -24, -12, -26, 10, 43, 40, 59, 45, -26, 47, 52, 44, 53, 0, -26, -21, 57, -12, -26, Ascii.NAK, 56, 47, 45, 47, 52, 39, 50, -26, 59, 56, 47, 0, -26, -21, 57, -9, -18, 3, -18, -30, -1, -10, -83, -18, 2, 1, -11, -4, -1, -10, 1, 6, -57, -83, -81, -78, 0, -81, -69, -83, -18, -5, -15, -1, -4, -10, -15, -30, -1, -10, -83, -18, 2, 1, -11, -4, -1, -10, 1, 6, -57, -83, -81, -78, 0, -81, -69, Ascii.SYN, Ascii.CR, 34, Ascii.CR, 1, Ascii.RS, Ascii.NAK, -52, Ascii.ESC, Ascii.FS, Ascii.CR, Ascii.GS, 33, 17, -52, Ascii.FS, Ascii.CR, Ascii.RS, 32, -26, -52, -50, -47, Ascii.US, -50, -38, -52, Ascii.CR, Ascii.SUB, Ascii.DLE, Ascii.RS, Ascii.ESC, Ascii.NAK, Ascii.DLE, 1, Ascii.RS, Ascii.NAK, -52, Ascii.ESC, Ascii.FS, Ascii.CR, Ascii.GS, 33, 17, -52, Ascii.FS, Ascii.CR, Ascii.RS, 32, -26, -52, -50, -47, Ascii.US, -50, -38, 48, 39, 60, 39, Ascii.ESC, 56, 47, -26, 54, 39, 58, 46, 0, -26, -24, -21, 57, -24, -12, -26, 39, 52, 42, 56, 53, 47, 42, Ascii.ESC, 56, 47, -26, 54, 39, 58, 46, 0, -26, -24, -21, 57, -24, -12, 1, -8, Ascii.CR, -8, -20, 9, 0, -73, 10, -6, -1, -4, 4, -4, -47, -73, -71, -68, 10, -71, -59, -73, -8, 5, -5, 9, 6, 0, -5, -20, 9, 0, -73, 10, -6, -1, -4, 4, -4, -47, -73, -71, -68, 10, -71, -59};
    }

    static {
        A09();
    }

    public static Uri A00(String str) {
        Uri parse = Uri.parse(str);
        C1315Wi A002 = C7F.A00();
        if (A002 != null) {
            boolean A26 = ID.A26(A002);
            if (A01[4].charAt(6) != 'S') {
                throw new RuntimeException();
            }
            A01[4] = "EnCbrOSPna2eJt3ahTIDz2YGURRqGvvY";
            if (!A26) {
                return parse;
            }
        }
        if (!A0D(parse)) {
            Uri androidUri = A01(str);
            return androidUri;
        }
        A0A(str, parse);
        if (A01[0].length() == 17) {
            throw new RuntimeException();
        }
        A01[0] = "gq60LFwB18XMq";
        return parse;
    }

    public static Uri A01(String str) {
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                Uri androidUri = A03(uri);
                A0B(str, uri, androidUri);
                return androidUri;
            }
            Uri androidUri2 = A02(uri);
            A0C(str, uri, androidUri2, false);
            return androidUri2;
        } catch (URISyntaxException e10) {
            throw A04(str, e10);
        }
    }

    public static Uri A02(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Uri A03(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static SecurityException A04(String str, URISyntaxException uRISyntaxException) {
        return new SecurityException(String.format(Locale.US, A05(26, 36, 65), str, uRISyntaxException.getMessage()));
    }

    @Nullable
    public static URI A06(Uri uri) {
        try {
            URI uri2 = new URI(uri.toString());
            if (A0F(uri2, uri)) {
                return uri2;
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static URI A07(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e10) {
            if (A01[3].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "2Q8u2ghBzy6EIpF";
            strArr[6] = "vCUILh5Fo1xS1klaxOFGD";
            URI A06 = A06(uri);
            if (A06 != null) {
                return A06;
            }
            throw A04(str, e10);
        }
    }

    public static URI A08(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (URISyntaxException e10) {
            throw A04(str, e10);
        }
    }

    public static void A0A(String str, Uri uri) throws SecurityException {
        if (uri.isOpaque()) {
            URI javaUri = A08(str, uri);
            A0B(str, javaUri, uri);
        } else {
            URI A07 = A07(str, uri);
            A0C(str, A07, uri, A0F(A07, uri));
        }
    }

    public static void A0B(String str, URI uri, Uri uri2) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (A0E && A0E2) {
            return;
        }
        String A05 = A05(0, 0, 114);
        if (!A0E) {
            A05 = A05 + String.format(Locale.US, A05(290, 46, 37), uri.getScheme(), uri2.getScheme());
        }
        if (!A0E2) {
            A05 = A05 + String.format(Locale.US, A05(192, 56, 58), uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        }
        throw new SecurityException(String.format(Locale.US, A05(63, 77, 84), uri.toString(), uri2.toString(), A05, str));
    }

    public static void A0C(String str, URI uri, Uri uri2, boolean z10) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getAuthority(), uri2.getAuthority());
        boolean A0E3 = A0E(uri.getPath(), uri2.getPath());
        String A05 = A05(0, 0, 114);
        if (!A0E) {
            A05 = A05 + String.format(Locale.US, A05(290, 46, 37), uri.getScheme(), uri2.getScheme());
        }
        if (!z10 && !A0E2) {
            A05 = A05 + String.format(Locale.US, A05(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 52, 27), uri.getAuthority(), uri2.getAuthority());
        }
        if (!A0E3) {
            A05 = A05 + String.format(Locale.US, A05(248, 42, 84), uri.getPath(), uri2.getPath());
        }
        if (A0E && A0E2 && A0E3) {
        } else {
            throw new SecurityException(String.format(Locale.US, A05(63, 77, 84), uri.toString(), uri2.toString(), A05, str));
        }
    }

    public static boolean A0D(Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches(A05(0, 26, 109));
    }

    public static boolean A0E(@Nullable String str, @Nullable String str2) {
        String A05 = A05(0, 0, 114);
        if (str == null || str.equals(A05)) {
            return str2 == null || str2.equals(A05);
        }
        return str.equals(str2);
    }

    public static boolean A0F(URI uri, Uri uri2) {
        String host = uri2.getHost();
        String androidHost = uri.getHost();
        if (androidHost == null && host != null) {
            String androidHost2 = A05(62, 1, 23);
            if (host.contains(androidHost2)) {
                return true;
            }
        }
        return false;
    }
}
