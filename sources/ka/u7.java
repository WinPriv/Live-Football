package ka;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31927a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31929c;

    /* renamed from: d, reason: collision with root package name */
    public long f31930d;

    /* renamed from: e, reason: collision with root package name */
    public String f31931e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f31932g = new StringBuilder();

    public u7(String str, int i10, String str2) {
        this.f31927a = null;
        this.f31928b = "HA";
        this.f31929c = 0;
        this.f31930d = 0L;
        this.f31927a = str;
        this.f31929c = i10;
        if (str2 != null) {
            this.f31928b = str2;
        }
        this.f31930d = System.currentTimeMillis();
        this.f31931e = Thread.currentThread().getName();
        this.f = Process.myPid();
    }

    public final void a(StringBuilder sb2) {
        String str;
        String str2;
        SimpleDateFormat e10 = com.huawei.openalliance.ad.ppskit.utils.d0.e("yyyy-MM-dd HH:mm:ss.SSS");
        if (TextUtils.isEmpty(com.huawei.openalliance.ad.ppskit.utils.z1.f23073a)) {
            if (Build.VERSION.SDK_INT >= 28) {
                str2 = Application.getProcessName();
            } else {
                try {
                    str2 = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable th) {
                    e0.i.p(th, "get pro name ", "SystemUtil");
                    str2 = "";
                }
            }
            com.huawei.openalliance.ad.ppskit.utils.z1.f23073a = str2;
        }
        String str3 = com.huawei.openalliance.ad.ppskit.utils.z1.f23073a;
        sb2.append('[');
        sb2.append(e10.format(Long.valueOf(this.f31930d)));
        int i10 = this.f31929c;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        str = String.valueOf(i10);
                    } else {
                        str = "E";
                    }
                } else {
                    str = "W";
                }
            } else {
                str = "I";
            }
        } else {
            str = "D";
        }
        sb2.append(' ');
        sb2.append(str);
        sb2.append('/');
        sb2.append(this.f31927a);
        sb2.append('/');
        sb2.append(this.f31928b);
        sb2.append(' ');
        sb2.append(this.f);
        sb2.append('-');
        sb2.append(str3);
        sb2.append(':');
        sb2.append(this.f31931e);
        sb2.append(']');
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        a(sb2);
        sb2.append(' ');
        sb2.append((CharSequence) this.f31932g);
        return sb2.toString();
    }
}
