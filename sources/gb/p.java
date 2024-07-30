package gb;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.bw;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class p {
    public static boolean a(String str) {
        if (str != null && (str.startsWith(bw.HTTP.toString()) || str.startsWith(bw.HTTPS.toString()))) {
            return true;
        }
        return false;
    }

    public static long b(long j10, String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            ex.I("StrUtil", "parseLongOrDefault exception: ".concat(e10.getClass().getSimpleName()));
            return j10;
        }
    }

    public static Float c(String str, Float f) {
        if (f(str)) {
            return f;
        }
        try {
            return Float.valueOf(str);
        } catch (NumberFormatException e10) {
            ex.Z("StrUtil", "parseFloatOrDefault NumberFormatException:".concat(e10.getClass().getSimpleName()));
            return f;
        }
    }

    public static String d(Context context) {
        BufferedReader bufferedReader;
        Object th;
        InputStream inputStream;
        AssetManager assets = context.getAssets();
        StringBuilder sb2 = new StringBuilder();
        try {
            inputStream = assets.open("openmeasure/omsdk-v1.js");
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                        sb2.append("\n");
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            ex.I("StrUtil", "getStringFromAsset " + th.getClass().getSimpleName());
                            androidx.transition.n.g(bufferedReader);
                            androidx.transition.n.g(inputStream);
                            return sb2.toString();
                        } catch (Throwable th3) {
                            androidx.transition.n.g(bufferedReader);
                            androidx.transition.n.g(inputStream);
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            bufferedReader = null;
            th = th5;
            inputStream = null;
        }
        androidx.transition.n.g(bufferedReader);
        androidx.transition.n.g(inputStream);
        return sb2.toString();
    }

    public static String e(Context context, long j10) {
        if (context == null) {
            return "";
        }
        float f = (((float) j10) * 1.0f) / 1048576.0f;
        if (f < 0.1f) {
            f = 0.1f;
        }
        return context.getString(R.string.hiad_data_size_prompt, String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
    }

    public static boolean f(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static Integer g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e10) {
            ex.Z("StrUtil", "toInteger NumberFormatException:".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static Long h(String str) {
        if (f(str)) {
            return null;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e10) {
            ex.Z("StrUtil", "toLong NumberFormatException:".concat(e10.getClass().getSimpleName()));
            return null;
        }
    }

    public static String i(String str) {
        if (f(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            ex.Z("StrUtil", "unsupport encoding");
            return null;
        }
    }

    public static String j(String str) {
        String str2;
        if (f(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str2 = "unsupport encoding";
            ex.Z("StrUtil", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "decode error";
            ex.Z("StrUtil", str2);
            return null;
        }
    }

    public static JSONObject k(Bundle bundle) {
        Object k10;
        if (bundle == null) {
            return new JSONObject();
        }
        Set<String> keySet = bundle.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            try {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    k10 = k((Bundle) obj);
                } else {
                    try {
                        k10 = JSONObject.wrap(obj);
                    } catch (Throwable th) {
                        ex.I("StrUtil", "wrap Exception:".concat(th.getClass().getSimpleName()));
                        k10 = JSONObject.NULL;
                    }
                }
                jSONObject.put(str, k10);
            } catch (Throwable th2) {
                e0.i.q(th2, "converBundleToJson Exception:", "StrUtil");
            }
        }
        return jSONObject;
    }
}
