package mc;

import android.content.Context;
import com.anythink.core.common.b.g;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import n0.v0;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public c f33027a;

    public static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
            inputStream = null;
        }
        if (com.anythink.expressad.foundation.g.f.g.c.f10012d.equalsIgnoreCase(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING))) {
            try {
                byte[] bArr = new byte[2];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedInputStream.mark(2);
                int read = bufferedInputStream.read(bArr);
                bufferedInputStream.reset();
                int i10 = ((bArr[1] & DefaultClassResolver.NAME) << 8) | (bArr[0] & DefaultClassResolver.NAME);
                if (read != -1 && i10 == 35615) {
                    return new GZIPInputStream(bufferedInputStream);
                }
                return bufferedInputStream;
            } catch (Exception unused2) {
                return inputStream;
            }
        }
        return inputStream;
    }

    public abstract String b(String str);

    public abstract String c();

    public abstract HashMap d();

    public abstract byte[] e();

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        Context context = jc.b.a().f30202a;
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", pc.e.c());
            jSONObject.put("os_vc", pc.e.a());
            jSONObject.put("package_name", pc.e.e(context));
            jSONObject.put("app_vn", pc.e.d(context));
            jSONObject.put("app_vc", pc.e.b(context));
            jSONObject.put("sdk_ver", "1.0.2");
            jSONObject.put(com.anythink.core.common.g.c.f5870ad, 1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String g() {
        HashMap hashMap = new HashMap();
        String c10 = pc.d.c(f().toString());
        hashMap.put("d_version", g.c.f5034a);
        hashMap.put(com.anythink.expressad.foundation.g.a.N, c10);
        hashMap.put("d_sign", v0.b("d_version=1.0&d1=".concat(c10)));
        hashMap.put("pl_c", "2");
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : keySet) {
                jSONObject.put(str, String.valueOf(hashMap.get(str)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    public abstract boolean h();

    public final void i() {
        c cVar = this.f33027a;
        if (cVar != null) {
            cVar.b();
        }
    }
}
