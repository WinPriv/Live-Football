package ka;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class x8 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f32172d = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f32173e = Pattern.compile("Range: (.*)");

    /* renamed from: a, reason: collision with root package name */
    public final String f32174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32175b;

    /* renamed from: c, reason: collision with root package name */
    public String f32176c;

    static {
        Pattern.compile("bytes=(\\d+)");
    }

    public x8(String str) {
        String str2;
        int i10;
        n7.c("HttpGetRequest", "Media Player request header: %s", str);
        Matcher matcher = f32173e.matcher(str);
        if (matcher.find()) {
            n7.e("HttpGetRequest", "request Range:" + matcher.group(1));
            str2 = matcher.group(1);
        } else {
            n7.e("HttpGetRequest", "request header not have range");
            str2 = "";
        }
        this.f32175b = str2;
        Matcher matcher2 = f32172d.matcher(str);
        if (matcher2.find()) {
            String group = matcher2.group(1);
            if (com.huawei.openalliance.ad.ppskit.utils.y1.h(group)) {
                n7.i("HttpGetRequest", "parse uri failed, source is empty");
                return;
            }
            int indexOf = group.indexOf("?");
            if (indexOf == -1) {
                i10 = group.length();
            } else {
                i10 = indexOf;
            }
            try {
                this.f32174a = URLDecoder.decode(group.substring(0, i10), "UTF-8");
            } catch (Throwable th) {
                n7.j("HttpGetRequest", "decode failed error: %s", th.getClass().getSimpleName());
            }
            if (indexOf != -1) {
                String substring = group.substring(indexOf + 1);
                HashMap hashMap = new HashMap();
                for (String str3 : substring.split(ContainerUtils.FIELD_DELIMITER)) {
                    String[] split = str3.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split.length >= 2) {
                        String str4 = split[0];
                        String str5 = split[1];
                        try {
                            hashMap.put(str4, URLDecoder.decode(str5, "UTF-8"));
                        } catch (Throwable th2) {
                            n7.j("HttpGetRequest", "decode failed error: %s for key = %s ,rawValue = %s", th2.getClass().getSimpleName(), str4, str5);
                        }
                    }
                }
                this.f32176c = (String) hashMap.get("nonsense");
                n7.c("HttpGetRequest", "url: %s, nonsense: %s", this.f32174a, this.f32176c);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid request, url not found");
    }

    public static x8 a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(readLine)) {
                sb2.append(readLine);
                sb2.append('\n');
            } else {
                return new x8(sb2.toString());
            }
        }
    }
}
