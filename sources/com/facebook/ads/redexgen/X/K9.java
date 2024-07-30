package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class K9 {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1316Wj> A06;
    public static final AtomicReference<KI> A07;
    public static final AtomicReference<KK> A08;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-68, -49, -46, -36, -27, -19, -49, -46, -19, -35, -48, -40, -19, -41, -46, -19, -39, -45, -25, 102, 121, 124, -122, -113, -105, -121, -118, -127, Ascii.DEL, -127, -122, 121, -124, -105, 125, -112, -116, -118, 121, -117, -94, -75, -72, -62, -53, -45, -57, -75, -54, -71, -72, -45, -57, -56, -75, -56, -71, -45, -72, -75, -56, -75, -33, -19, 2, -15, -16, -84, -1, 0, -19, 0, -15, -84, -18, 1, -6, -16, -8, -15, -84, -11, -1, -84, -15, -7, -4, 0, 5, -83, -77, -75, -58, -79, -57, -58, -69, -66, -82, -69, -84, -80, -71, -74, -78, -69, -63, -84, -63, -68, -72, -78, -69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String uri = data.toString();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (uri.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A07();
        A02 = K9.class.getPackage();
        A04 = A02 + A06(40, 22, 98);
        A03 = A02 + A06(0, 19, 124);
        A05 = A02 + A06(19, 21, 38);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent intent) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(intent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent intent, ClassLoader classLoader) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            audienceNetworkActivityBundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(audienceNetworkActivityBundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            obtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 122));
    }

    @Nullable
    public static C1316Wj A03(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C1316Wj c1316Wj : A06) {
                String adId = c1316Wj.A0D().getId();
                if (stringExtra.equals(adId)) {
                    return c1316Wj;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1316Wj c1316Wj) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1316Wj.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1316Wj.A0D().getId());
        A06.add(c1316Wj);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A09(C1316Wj c1316Wj, AdActivityIntent adActivityIntent) throws K7 {
        try {
            c1316Wj.getApplicationContext().startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e10) {
            throw new K7(e10);
        }
    }

    public static boolean A0B(C1316Wj c1316Wj, Intent intent) throws K7 {
        KI externalActivityLauncher = A07.get();
        return A0D(c1316Wj, intent, externalActivityLauncher);
    }

    public static boolean A0C(C1316Wj c1316Wj, Intent intent) throws K7 {
        KI ki = A07.get();
        if (ki == null || c1316Wj.A0C() == null) {
            return false;
        }
        String A0A = c1316Wj.A0A();
        try {
            Activity A0C = c1316Wj.A0C();
            if (A0A == null) {
                A0A = A06(0, 0, 81);
            }
            return ki.startActivityForResult(intent, 0, A0C, A0A);
        } catch (ActivityNotFoundException e10) {
            throw new K7(e10);
        } catch (Exception e11) {
            c1316Wj.A06().A8u(A06(90, 8, 64), C06977l.A07, new C06987m(e11));
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0D(C1316Wj c1316Wj, Intent intent, @Nullable KI ki) throws K7 {
        if (A0A(intent, ID.A0X(c1316Wj))) {
            return false;
        }
        Context context = c1316Wj;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Context startContext = c1316Wj.A0C();
        if (startContext != null) {
            context = startContext;
        } else {
            intent.addFlags(268435456);
        }
        if (ki != null && !A0A(intent, ID.A0Z(c1316Wj))) {
            String A0A = c1316Wj.A0A();
            if (A0A == null) {
                try {
                    A0A = A06(0, 0, 81);
                } catch (ActivityNotFoundException e10) {
                    throw new K7(e10);
                } catch (Exception e11) {
                    c1316Wj.A06().A8u(A06(90, 8, 64), C06977l.A08, new C06987m(e11));
                    return false;
                }
            }
            return ki.startActivity(context, intent, A0A);
        }
        try {
            context.startActivity(intent);
            String[] strArr2 = A01;
            if (strArr2[6].length() != strArr2[7].length()) {
                return true;
            }
            String[] strArr3 = A01;
            strArr3[2] = "WDCv4eIjUMWn9vBjM5X6LVautGW56wKG";
            strArr3[0] = "ucZAZ4xNymzGZ0fLzzKXI63vhQI9uDah";
            return true;
        } catch (ActivityNotFoundException e12) {
            throw new K7(e12);
        }
    }

    public static boolean A0E(C1316Wj c1316Wj, Uri uri, String str) throws ActivityNotFoundException {
        KK onsiteUriHandler = A08.get();
        return A0F(c1316Wj, uri, str, onsiteUriHandler);
    }

    @VisibleForTesting
    public static boolean A0F(C1316Wj c1316Wj, Uri uri, String str, @Nullable KK kk) throws ActivityNotFoundException {
        if (kk == null || c1316Wj.A0C() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(98, 15, 59), str);
        return kk.handleUriForResult(c1316Wj, uri.toString(), bundle, null, 0, c1316Wj.A0C());
    }
}
