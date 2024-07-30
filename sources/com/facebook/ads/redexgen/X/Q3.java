package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* loaded from: assets/audience_network.dex */
public interface Q3 {
    boolean AAf(Q1 q1);

    HttpURLConnection ACt(String str, @Nullable Proxy proxy) throws IOException;

    InputStream ACu(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ACv(HttpURLConnection httpURLConnection) throws IOException;

    void ADB(HttpURLConnection httpURLConnection, EnumC1154Pz enumC1154Pz, String str) throws IOException;

    byte[] ADX(InputStream inputStream) throws IOException;

    void AFY(OutputStream outputStream, byte[] bArr) throws IOException;
}
