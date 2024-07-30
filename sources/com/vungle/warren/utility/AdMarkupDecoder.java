package com.vungle.warren.utility;

import android.util.Base64;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.model.admarkup.AdMarkupV1;
import com.vungle.warren.model.admarkup.AdMarkupV2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import m8.l;
import m8.n;
import m8.q;
import m8.r;
import m8.u;

/* loaded from: classes2.dex */
public class AdMarkupDecoder {
    public static AdMarkup decode(String str) {
        if (str == null) {
            return null;
        }
        try {
            n b10 = r.b(str);
            if (!(b10 instanceof q)) {
                return null;
            }
            q j10 = b10.j();
            int h10 = b10.j().s("version").h();
            if (h10 != 1) {
                if (h10 != 2) {
                    return null;
                }
                return serializeAdMarkupV2(j10);
            }
            return AdMarkupV1.fromString(str);
        } catch (u unused) {
            logError();
            return null;
        }
    }

    private static String gzipDecode(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr2 = new byte[32];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read != -1) {
                sb2.append(new String(bArr2, 0, read));
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                return sb2.toString();
            }
        }
    }

    private static void logError() {
        VungleLogger.error(AdMarkupDecoder.class.getName(), "Encountered issue serializing models");
    }

    private static AdMarkupV2 serializeAdMarkupV2(q qVar) {
        String m10 = qVar.s("adunit").m();
        l i10 = qVar.s("impression").i();
        String[] strArr = new String[i10.size()];
        for (int i11 = 0; i11 < i10.size(); i11++) {
            strArr[i11] = i10.q(i11).m();
        }
        try {
            return new AdMarkupV2(r.b(gzipDecode(Base64.decode(m10, 0))).j(), strArr);
        } catch (IOException unused) {
            logError();
            return null;
        }
    }
}
