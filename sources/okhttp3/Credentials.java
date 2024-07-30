package okhttp3;

import com.huawei.openalliance.ad.constant.w;
import e0.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.e;
import s.f;

/* loaded from: classes2.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2, Charset charset) {
        String f = i.f(str, w.bE, str2);
        char[] cArr = e.f33833v;
        if (f == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return f.b("Basic ", new e(f.getBytes(charset)).k());
        }
        throw new IllegalArgumentException("charset == null");
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, StandardCharsets.ISO_8859_1);
    }
}
