package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0913Gk implements Q3 {
    public static byte[] A01;
    public static String[] A02 = {"rzjVC70O4bd9DzHjbWZgWXgUSmVLYSU4", "d5zo8W4K", "Hv98ROwnq0amXTKQof8zpMynpU6nXYzw", "m02wtPmJvn7xvEVIhgILVdsvYaekd1y1", "NwXA6aDXoJPzKJxJycW", "lujFiBBwg3lGF", "5iNla1hEs57TMoL8Mlh58N0Q757SBHKY", "iek06qmxI9TIJY"};
    public final Q4 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 123, 123, 125, -120, -116, 69, 91, Byte.MIN_VALUE, 121, -118, -117, 125, -116, -98, -67, -49, -59, -65, -82, -63, -51, -47, -63, -49, -48, -92, -67, -54, -64, -56, -63, -50, -118, -53, -54, -95, -50, -50, -53, -50, -102, -58, -59, -53, -68, -59, -53, -124, -85, -48, -57, -68, -71, -72, -86, -111, -100};
    }

    static {
        A01();
    }

    public AbstractC0913Gk(Q4 q42) {
        this.A00 = q42;
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final boolean AAf(Q1 q1) {
        InterfaceC1142Pn A00 = q1.A00();
        if (this.A00.A8W()) {
            Log.e(AbstractC0913Gk.class.getSimpleName(), A00(14, 27, 78), q1);
        }
        if (A00 != null && A00.A7Y() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final HttpURLConnection ACt(String str, @Nullable Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final InputStream ACu(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final OutputStream ACv(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final void ADB(HttpURLConnection httpURLConnection, EnumC1154Pz enumC1154Pz, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC1154Pz.A02());
        httpURLConnection.setDoOutput(enumC1154Pz.A04());
        httpURLConnection.setDoInput(enumC1154Pz.A03());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 73), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 10), A00(53, 5, 86));
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final byte[] ADX(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
            if (A02[4].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "eO7qbggyddGiOQuVn8N8jDULGwym82oB";
            strArr[6] = "iN6CFd4LV6hdOWp44ZZbGtT2nODAuDvC";
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q3
    public final void AFY(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
