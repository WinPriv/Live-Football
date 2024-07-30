package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* loaded from: assets/audience_network.dex */
public class DX extends AbstractC1312Wf<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C7P A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public DX(C7P c7p, String str, String str2, int i10, double d10, double d11, String str3, Map map) {
        this.A03 = c7p;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i10;
        this.A01 = d10;
        this.A00 = d11;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C7S
    @Nullable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        C1315Wi c1315Wi;
        Lock lock;
        C1315Wi c1315Wi2;
        Lock lock2;
        C1315Wi c1315Wi3;
        Lock lock3;
        C1315Wi c1315Wi4;
        C1314Wh c1314Wh;
        C1313Wg c1313Wg;
        C1315Wi c1315Wi5;
        Lock lock4;
        String A01 = A01(0, 8, 12);
        c1315Wi = this.A03.A01;
        c1315Wi.A06().A8D(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C7P.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c1314Wh = this.A03.A02;
                c1313Wg = this.A03.A03;
                String A0E = c1314Wh.A0E(c1313Wg.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e10) {
                        c1315Wi5 = this.A03.A01;
                        c1315Wi5.A06().A8u(A01, C06977l.A0z, new C06987m(e10));
                    }
                }
                lock4 = C7P.A08;
                String[] strArr3 = A09;
                if (strArr3[0].length() == strArr3[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A09;
                strArr4[6] = "euwrYX6ZBvkkPfbLG6LTpx3NDj";
                strArr4[2] = "qLYaMtYi2WKu9oTuT6ElhKmpF4";
                lock4.unlock();
                return A0E;
            } catch (Exception e11) {
                A01(C7R.A06);
                c1315Wi2 = this.A03.A01;
                c1315Wi2.A06().A8u(A01, C06977l.A0y, new C06987m(e11));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e12) {
                        c1315Wi3 = this.A03.A01;
                        c1315Wi3.A06().A8u(A01, C06977l.A0z, new C06987m(e12));
                    }
                }
                lock2 = C7P.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e13) {
                    c1315Wi4 = this.A03.A01;
                    c1315Wi4.A06().A8u(A01, C06977l.A0z, new C06987m(e13));
                }
            }
            lock3 = C7P.A08;
            lock3.unlock();
            throw th;
        }
    }
}
