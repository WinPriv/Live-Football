package qa;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.io.Closeable;
import java.io.InputStream;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class c implements Closeable {
    public static c d(long j10, Context context, String str) {
        if (!z1.R(context)) {
            try {
                n7.e("DownloadNetworkConnection", "create OkHttpNetworkConnection");
                return new i(str, j10);
            } catch (Throwable unused) {
                n7.e("DownloadNetworkConnection", "create HttpUrlNetworkConnection");
                return new h(str, j10);
            }
        }
        throw new IllegalStateException("cannot connect network in oobe");
    }

    public abstract InputStream b();

    public abstract String c(String str);

    public abstract int e();

    public abstract int f();
}
