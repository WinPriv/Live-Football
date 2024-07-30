package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.basead.d.i;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.redexgen.X.7P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7P {
    public static byte[] A04;
    public static String[] A05 = {"qJOvsPrm5BQkhL6wLJahauzjA45r7dQz", "hfx8x2hkXgxq19RSFkkqiaOe1zMy03Qo", "bV5o7GaQth4ZZOPd4LFtWwXjKNVB8lua", "1EyYFmGpmEhL9EWyl0I1ptwRPtnJxpez", "F", i.f3957a, "plO80lk7YnGQvaXazMopbLIwOg8MB0TR", "EzLFA06L6a2SQhX4934tm7serJXXg4XA"};
    public static final String A06;
    public static final Lock A07;
    public static final Lock A08;
    public static final ReentrantReadWriteLock A09;
    public SQLiteOpenHelper A00;
    public final C1315Wi A01;
    public final C1313Wg A03 = new C1313Wg(this);
    public final C1314Wh A02 = new C1314Wh(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[3].charAt(0) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "6YOEgEHO6bjbd5au9bSAefu6W5tI3Dak";
            strArr[6] = "kgOgsYcmlOEy6T8oxoaixHiO6WRSp1D2";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static void A07() {
        A04 = new byte[]{-31, -2, -31, -81, -51, -81, -50, -11, Ascii.SYN, 40, Ascii.CAN, -67, -29, -17, -20, -22, -67, -44, -2, 3, -3, 2, -44, -108, -64, -67, -63, -67, -56, -108, -106, -59, -60, -106, -35, Ascii.FF, Ascii.SI, 1, 2, Ascii.SI, -35, -1, Ascii.SYN, -35, -42, 9, -5, 10, -42, -98, -43, -58, -61, -48, -61, -98, -49, -43, -46, -58, Ascii.VT, 3, -54, -52, Ascii.SYN, 52, 65, 65, 66, 71, -13, 54, 52, 63, 63, -13, 58, 56, 71, Ascii.ETB, 52, 71, 52, 53, 52, 70, 56, -13, 57, 69, 66, 64, -13, 71, 59, 56, -13, 40, Ascii.FS, -13, 71, 59, 69, 56, 52, 55, -12, 33, 19, Ascii.SUB, 19, 17, 34, -18, 66, 61, 57, 51, 60, 65, -4, 39, 34, Ascii.SYN, 19, 38, Ascii.ETB, -14, 43, 40, 59, 40, 41, 40, 58, 44, 71, 88, 71, 80, 86, 85, -9, -14, -18, -24, -15, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i10 = 0; i10 < A0M().length; i10++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A05(107, 14, 91));
        sb2.append(C1313Wg.A02.A01);
        String A052 = A05(58, 2, 51);
        sb2.append(A052);
        String A053 = A05(142, 6, 16);
        sb2.append(A053);
        String A054 = A05(60, 1, 106);
        sb2.append(A054);
        sb2.append(C1313Wg.A01.A01);
        sb2.append(A052);
        String A055 = A05(136, 6, 111);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A04.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A05.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A0A.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A08.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A07.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A06.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A03.A01);
        sb2.append(A052);
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A02.A01);
        sb2.append(A05(11, 6, 42));
        sb2.append(A055);
        sb2.append(A05(17, 6, 65));
        sb2.append(A053);
        sb2.append(A05(30, 4, 3));
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A09.A01);
        sb2.append(A05(0, 3, 78));
        sb2.append(A053);
        sb2.append(A054);
        sb2.append(C1313Wg.A02.A01);
        sb2.append(A05(34, 10, 74));
        sb2.append(A055);
        sb2.append(A054);
        sb2.append(C1314Wh.A08.A01);
        sb2.append(A05(7, 4, 98));
        A06 = sb2.toString();
        A09 = new ReentrantReadWriteLock();
        A07 = A09.readLock();
        A08 = A09.writeLock();
    }

    public C7P(C1315Wi c1315Wi) {
        this.A01 = c1315Wi;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            final C1315Wi c1315Wi = this.A01;
            this.A00 = new SQLiteOpenHelper(c1315Wi, this) { // from class: com.facebook.ads.redexgen.X.7Q
                public static byte[] A01;
                public static String[] A02 = {"JShIJu3JRfHt43ypO9GqFaXtQU", "Uet3LTw8rLJmru1DFWkYPrIPq9yjzQ4", "LBYTyoU1fD8w8O4ue", "ZxNu1nQjo2XkCjw5ERk40jWGoeLjYM9V", "VhJY3C97J7J84q76u4hEYHgB0g", "Ro8Wdk2EPx5GRn22XYsr1QjtSyjSX", "SdOPztDY16h0BPmxgfN82QFEWJhjV", "9YM807W9r6X84VXv6l9L7RtBJQk8UQ"};
                public static final String A03;
                public final C7P A00;

                public static String A00(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{17, 1, 101, 100, 103, 96, 116, 109, 117, 1, 17, 48, 61, 37, 52, 35, 81, 37, 48, 51, 61, 52, 81, Ascii.DC4, 7, Ascii.DC4, Ascii.US, 5, 2, 81, 48, 53, 53, 81, 50, 62, 61, 36, 60, 63, 81, 90, Ascii.DEL, 95, 122, 111, 122, 121, 122, 104, 126, 83, 126, 119, 107, 126, 105, 59, 120, 122, 117, 59, 117, 116, 111, 59, 121, 126, 59, 117, 110, 119, 119, 33, 55, 42, 53, 69, 49, 36, 39, 41, 32, 69, 44, 35, 69, 32, 61, 44, 54, 49, 54, 69, 6, Ascii.ETB, 4, Ascii.SYN, Ascii.CR, 0, Ascii.SYN, 88, 90, 73, 79, 69, 73, 40, 110, 103, 122, 109, 97, 111, 102, 87, 99, 109, 113, 123, 40, 53, 40, 71, 70, 51, 124, 121, 110, 56, 110, 51, 121, Ascii.DEL};
                }

                static {
                    A02();
                    A03 = C7Q.class.getSimpleName();
                }

                {
                    super(c1315Wi, A01(c1315Wi), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(41, 32, 87));
                }

                public static String A01(C1315Wi c1315Wi2) {
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(0, 0, 95)};
                    String processName = A00(126, 8, 81);
                    String format = String.format(locale, processName, objArr);
                    if (!ID.A1u(c1315Wi2)) {
                        return format;
                    }
                    String defaultDbName = c1315Wi2.getPackageName();
                    String processName2 = ProcessUtils.getProcessName(c1315Wi2);
                    if (!defaultDbName.equals(processName2) && !TextUtils.isEmpty(processName2)) {
                        String defaultDbName2 = '_' + processName2;
                        return String.format(Locale.US, processName, defaultDbName2);
                    }
                    return format;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                    for (C7T c7t : this.A00.A0M()) {
                        c7t.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    for (C7T c7t : this.A00.A0M()) {
                        c7t.A08(sQLiteDatabase);
                        c7t.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 68));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    if (i10 == 2 && i11 >= 3) {
                        String A00 = A00(73, 28, 41);
                        if (A02[7].length() != 30) {
                            throw new RuntimeException();
                        }
                        A02[3] = "Uy0CZyDaBZXeJSQ63Y80hAJR5wsAelR7";
                        sQLiteDatabase.execSQL(A00);
                    }
                    if (i10 <= 3 && i11 >= 4) {
                        C7N c7n = C1314Wh.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 61) + c7n.A01 + A00(0, 1, 125) + c7n.A02 + A00(1, 10, 109));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 10; i10++) {
            try {
            } catch (SQLiteException e11) {
                e10 = e11;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A06().A8u(A05(128, 8, 84), C06977l.A0v, new C06987m(e10));
        throw e10;
        return A00();
    }

    public final int A08(int i10) {
        A08.lock();
        try {
            return A0E().delete(A05(136, 6, 111), C1314Wh.A02.A01 + A05(3, 4, 28), new String[]{String.valueOf(i10 - 1)});
        } finally {
            A08.unlock();
        }
    }

    public final Cursor A09() {
        A07.lock();
        try {
            return this.A02.A0B();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0A() {
        A07.lock();
        try {
            return this.A02.A0C();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0B() {
        A07.lock();
        try {
            return this.A03.A0B();
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0C(int i10) {
        A07.lock();
        try {
            return A0E().rawQuery(A06 + A05(23, 7, 1) + String.valueOf(i10), null);
        } finally {
            A07.unlock();
        }
    }

    public final Cursor A0D(String str) {
        A07.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A07.unlock();
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 96));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7S != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8P != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(final C7S<T> c7s, final C8P<T> c8p) {
        Executor executor = LJ.A07;
        final C1315Wi c1315Wi = this.A01;
        return LG.A00(executor, new AsyncTask<Void, Void, T>(c1315Wi, c7s, c8p) { // from class: com.facebook.ads.redexgen.X.7O
            public static byte[] A04;
            public static String[] A05 = {"65r9CRdv0GoLRVNVjbjXzJK5P2ycj7FG", "0CWnyuhck9HOQgwCfxzQ09GVkx", "IEC2mc7xTTQi8lqWDODmms9jEFByhoZx", "6exEWFSZK9oTcnxcvUurXohDGqhdlb0H", "22QzghXqrFZ4DBGtDF", "dbvBYMdgslkBJuEWD9uCPJqFmtTt8cU5", "jZC4Ivj", "4jv2LQemXeCXPfpssPDUuPD2TleIiZzb"};
            public C7R A00;
            public final C1315Wi A01;
            public final C7S<T> A02;
            public final C8P<T> A03;

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    int i14 = (copyOfRange[i13] - i12) - 116;
                    if (A05[7].charAt(12) != 'P') {
                        throw new RuntimeException();
                    }
                    A05[6] = "VTML";
                    copyOfRange[i13] = (byte) i14;
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{Ascii.US, Ascii.FS, 47, Ascii.FS, Ascii.GS, Ascii.FS, 46, 32};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7O != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7S != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8P != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = c7s;
                this.A03 = c8p;
                this.A01 = c1315Wi;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7O != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) {
                if (C0990Jm.A02(this)) {
                    return null;
                }
                if (A05[6].length() == 11) {
                    throw new RuntimeException();
                }
                A05[2] = "4eGiZ19xQ4OxGjIavdFldPBRBlbWR0DL";
                T t10 = null;
                try {
                    try {
                        t10 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return t10;
                    } catch (Exception e10) {
                        this.A01.A06().A8u(A01(0, 8, 71), C06977l.A0w, new C06987m(e10));
                        this.A00 = C7R.A09;
                        return t10;
                    }
                } catch (Throwable th) {
                    C0990Jm.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7O != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
                if (C0990Jm.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (Throwable th) {
                    C0990Jm.A00(th, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7O != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) {
                if (C0990Jm.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(this.A00.A02(), this.A00.A03());
                    }
                } catch (Throwable th) {
                    C0990Jm.A00(th, this);
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8P != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i10, String str2, double d10, double d11, String str3, Map<String, String> data, C8P<String> c8p) {
        return A0F(new DX(this, str2, str, i10, d10, d11, str3, data), c8p);
    }

    public final void A0H() {
        A08.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A08.unlock();
        }
    }

    public final void A0I() {
        A08.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A08.unlock();
        }
    }

    public final boolean A0K(String str) {
        A08.lock();
        try {
            boolean A0F = this.A02.A0F(str);
            Lock lock = A08;
            String[] strArr = A05;
            if (strArr[7].charAt(23) != strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "8";
            strArr2[5] = "N";
            lock.unlock();
            return A0F;
        } catch (Throwable th) {
            A08.unlock();
            throw th;
        }
    }

    public final boolean A0L(String str) {
        boolean z10;
        A08.lock();
        try {
            A0E().execSQL(A05(121, 7, 95) + A05(136, 6, 111) + A05(44, 5, 67) + C1314Wh.A02.A01 + A05(61, 1, 83) + C1314Wh.A02.A01 + A05(56, 2, 49) + A05(49, 7, 11) + C1314Wh.A04.A01 + A05(62, 2, 26), new String[]{str});
            z10 = true;
        } catch (SQLiteException unused) {
            z10 = false;
        }
        A08.unlock();
        String[] strArr = A05;
        if (strArr[0].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A05[2] = "LEhHmvsdsEQXOsQ0B1AVwqczGhJrofDk";
        return z10;
    }

    public final C7T[] A0M() {
        return new C7T[]{this.A03, this.A02};
    }
}
