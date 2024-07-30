package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6H {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C6H A05;
    public final C1315Wi A00;
    public final Map<String, C6E> A01 = Collections.synchronizedMap(new HashMap());

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, Ascii.SUB, 49, 44, 53, 57, 40, 120, 43, 49, 34, 61, 120, 61, 32, 59, 61, 61, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, 61, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, 63, 61, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, Ascii.RS, Ascii.SYN, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.DLE, Ascii.SI, 6, 95, 19, Ascii.DLE, Ascii.FS, Ascii.RS, 19, 95, Ascii.SYN, Ascii.DC2, Ascii.RS, Ascii.CAN, Ascii.SUB, 95, Ascii.SYN, 17, Ascii.VT, Ascii.DLE, 95, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, 95, 87, 10, Ascii.CR, 19, 66, 53, Ascii.SO, 1, 2, Ascii.FF, 5, 64, Ascii.DC4, Ascii.SI, 64, Ascii.ETB, Ascii.DC2, 9, Ascii.DC4, 5, 64, 2, 9, Ascii.DC4, Ascii.CR, 1, Ascii.DLE, 64, Ascii.DC4, Ascii.SI, 64, 6, 9, Ascii.FF, 5, 64, 72, Ascii.NAK, Ascii.DC2, Ascii.FF, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, 63, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, Ascii.CAN, Ascii.CR, Ascii.CR, Ascii.CR, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, Ascii.CR, Ascii.ESC, Ascii.US, 19, Ascii.NAK, Ascii.ETB, 0, 3, Ascii.CR, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C6H.class.getSimpleName();
    }

    public C6H(C1315Wi c1315Wi) {
        this.A00 = c1315Wi;
    }

    private int A00(String str, @Nullable Bitmap bitmap) {
        String A08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        try {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size();
                    if (size >= ID.A0E(this.A00)) {
                        A0B(new Throwable(A08(35, 42, 1) + size));
                        A0A(byteArrayOutputStream);
                        A0A(null);
                        return 0;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byteArrayOutputStream.writeTo(fileOutputStream);
                    fileOutputStream.flush();
                    A0A(byteArrayOutputStream);
                    A0A(fileOutputStream);
                    return size;
                } catch (FileNotFoundException fnfe) {
                    Log.e(A04, A08(6, 29, 95) + file.getPath() + A08, fnfe);
                    A0B(fnfe);
                    A0A(null);
                    A0A(null);
                    return 0;
                }
            } catch (IOException ioe) {
                A0B(ioe);
                Log.e(A04, A08(148, 36, 57) + str + A08, ioe);
                A0A(null);
                A0A(null);
                return 0;
            } catch (OutOfMemoryError e10) {
                A0B(e10);
                Log.e(A04, A08(184, 39, 92), e10);
                A0A(null);
                A0A(null);
                if (A03[2].length() == 5) {
                    throw new RuntimeException();
                }
                A03[5] = "QxsbBUkJdqjFKv7NMRisOUwCFhjpKYpW";
                return 0;
            }
        } catch (Throwable th) {
            A0A(null);
            A0A(null);
            throw th;
        }
    }

    @Nullable
    private final Bitmap A01(C7G c7g, C6E c6e, int i10, int i11, String str) {
        if (C6J.A06(c7g) && A08(266, 4, 53).equals(str)) {
            Map<String, C6E> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c6e.A07, c6e);
        }
        String str2 = c6e.A07;
        C6I c6i = new C6I(c6e.A05, c6e.A06, A08(261, 5, 43), str, str2);
        File A07 = A07(this.A00);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2.hashCode());
        String url = A08(2, 4, 85);
        sb2.append(url);
        String url2 = sb2.toString();
        File file = new File(A07, url2);
        if (!file.exists()) {
            C6J.A04(c7g, c6i, false);
            String url3 = A08(232, 7, 0);
            if (str2.startsWith(url3)) {
                String url4 = A08(239, 22, 123);
                if (!str2.startsWith(url4)) {
                    return A04(str2, i11, i10);
                }
            }
            return A02(c7g, c6e, str);
        }
        C6J.A04(c7g, c6i, true);
        try {
            if (A0C(i11, i10)) {
                return C6K.A02(file.getCanonicalPath(), i11, i10, this.A00);
            }
            String url5 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url5);
        } catch (IOException e10) {
            A0B(e10);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C7G c7g, C6E c6e, String url) {
        String path;
        Bitmap A01;
        String str = c6e.A07;
        int i10 = c6e.A03;
        int i11 = c6e.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e10 = null;
        String A08 = A08(223, 9, 70);
        boolean startsWith = str.startsWith(A08);
        String A082 = A08(239, 22, 123);
        if (startsWith || str.startsWith(A082)) {
            if (str.startsWith(A08)) {
                path = str.substring(A08.length());
            } else {
                path = str.substring(A082.length());
            }
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(path);
                    if (A0C(i10, i11)) {
                        try {
                            A01 = C6K.A01(inputStream, i10, i11);
                        } catch (IOException e11) {
                            e = e11;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e12) {
                            e = e12;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            e = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw e;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (Throwable th2) {
                    e = th2;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (OutOfMemoryError e14) {
                e = e14;
            } catch (Throwable th3) {
                e = th3;
            }
        } else {
            boolean A0C = A0C(i10, i11);
            if (A03[2].length() == 5) {
                Throwable storedThrowable = new RuntimeException();
                throw storedThrowable;
            }
            A03[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            if (A0C) {
                try {
                    A01 = A05(str, i10, i11);
                } catch (IOException e15) {
                    e10 = e15;
                    A0B(e10);
                    A01 = A03(str);
                }
            } else {
                A01 = A03(str);
            }
        }
        String th4 = e10 != null ? e10.toString() : null;
        if (A01 == null) {
            C6J.A03(c7g, c6e, url, C6J.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 <= 0) {
            C6J.A03(c7g, c6e, url, C6J.A01, th4, null, null);
            if (ID.A0s(c7g)) {
                return null;
            }
            return A01;
        }
        C6J.A03(c7g, c6e, url, C6J.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
        return A01;
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] bytes;
        InterfaceC1142Pn AD3 = Q6.A00(this.A00).AD3(str, new Q2());
        if (AD3 != null && (bytes = AD3.A5m()) != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    @Nullable
    private Bitmap A04(String str, int i10, int i11) {
        Bitmap A022;
        int A00;
        try {
            boolean A0C = A0C(i10, i11);
            String A08 = A08(232, 7, 0);
            if (!A0C) {
                A022 = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            } else {
                A022 = C6K.A02(str.substring(A08.length()), i10, i11, this.A00);
            }
            A00 = A00(str, A022);
        } catch (IOException e10) {
            Log.e(A04, A08(105, 43, 38) + str + A08(0, 2, 17), e10);
        }
        if (ID.A0s(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return A022;
        }
        return A022;
    }

    @Nullable
    private Bitmap A05(String str, int i10, int i11) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = C6K.A01(inputStream, i10, i11);
        A0A(inputStream);
        return A01;
    }

    public static C6H A06(C1315Wi c1315Wi) {
        if (A05 == null) {
            synchronized (C6H.class) {
                if (A05 == null) {
                    A05 = new C6H(c1315Wi);
                }
            }
        }
        return A05;
    }

    public static File A07(C7G c7g) {
        return c7g.getCacheDir();
    }

    public static void A0A(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(@Nullable Throwable th) {
        String A08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A06().A8u(A08, C06977l.A1e, new C06987m(th));
        } else {
            this.A00.A06().A8u(A08, C06977l.A1e, new C06987m(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i10, int i11) {
        return i10 > 0 && i11 > 0 && ID.A10(this.A00);
    }

    @Nullable
    public final Bitmap A0D(C6E c6e) {
        return A01(this.A00, c6e, c6e.A04, c6e.A03, c6e.A01);
    }

    @Nullable
    public final Bitmap A0E(C7G c7g, String str, int i10, int i11, String str2) {
        C6E c6e = this.A01.get(str);
        return (!C6J.A06(c7g) || c6e == null) ? A01(c7g, new C6E(str, i10, i11, A08(270, 7, 97), A08(270, 7, 97)), i11, i10, str2) : A01(c7g, c6e, i11, i10, str2);
    }

    @Nullable
    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
