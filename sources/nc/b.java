package nc;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nc.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends h {

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ WebView f33493s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f33494t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String[] f33495u;

        /* renamed from: nc.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0445a implements Runnable {

            /* renamed from: nc.b$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0446a implements ValueCallback<String> {
                public C0446a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str) {
                    Properties properties = new Properties();
                    try {
                        properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
                    } catch (IOException unused) {
                    }
                    String property = properties.getProperty("unicodedString");
                    if (property.length() > 2) {
                        a.this.f33495u[0] = property.substring(1, property.length() - 1);
                    }
                    synchronized (a.this.f33494t) {
                        a.this.f33494t.notifyAll();
                    }
                }
            }

            public RunnableC0445a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f33493s.evaluateJavascript("(function() { return (document.getElementsByTagName('html')[0].innerHTML); })();", new C0446a());
            }
        }

        public a(WebView webView, ExecutorService executorService, String[] strArr) {
            this.f33493s = webView;
            this.f33494t = executorService;
            this.f33495u = strArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (this.f33493s == null) {
                    synchronized (this.f33494t) {
                        this.f33494t.notifyAll();
                    }
                }
                this.f33493s.post(new RunnableC0445a());
            } catch (Throwable unused) {
            }
        }
    }

    public static String i(WebView webView, long j10, long j11) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        String[] strArr = new String[1];
        try {
            newFixedThreadPool.submit(new a(webView, newFixedThreadPool, strArr));
        } catch (Throwable unused2) {
        }
        try {
            synchronized (newFixedThreadPool) {
                newFixedThreadPool.wait(j10 + j11);
            }
            newFixedThreadPool.shutdown();
            String str = strArr[0];
            if (str != null) {
                return str;
            }
            return "";
        } catch (Exception unused3) {
            return "";
        }
    }

    public static String j(Object obj) {
        if (obj != null) {
            try {
                ArrayList arrayList = new ArrayList();
                h.d(obj.getClass(), arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    if (field != null) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null && (obj2 instanceof String) && ((String) obj2).endsWith(".mp4")) {
                            return (String) obj2;
                        }
                    }
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x003c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x003f. Please report as an issue. */
    public static String k(String str, Object obj, JSONObject jSONObject, String str2, String str3, String str4, String str5) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            String str6 = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("action", -1);
                    String optString = optJSONObject.optString("param", "");
                    if (optInt != 1) {
                        if (optInt != 2) {
                            if (optInt != 19) {
                                if (optInt != 21) {
                                    if (optInt != 29) {
                                        if (optInt != 39) {
                                            if (optInt != 41) {
                                                switch (optInt) {
                                                    case 11:
                                                        if (!TextUtils.isEmpty(str2)) {
                                                            str6 = h.d.a(str2, optString);
                                                            break;
                                                        } else {
                                                            continue;
                                                        }
                                                    case 12:
                                                        if (!TextUtils.isEmpty(str2)) {
                                                            String f = h.f(1, str2, optString + "=\"(.*?)\"");
                                                            if (!TextUtils.isEmpty(f)) {
                                                                str6 = f.replace("\"", "");
                                                                break;
                                                            }
                                                            str6 = "";
                                                            break;
                                                        } else {
                                                            continue;
                                                        }
                                                    case 13:
                                                        if (!TextUtils.isEmpty(str2)) {
                                                            str6 = h.d.b(str2, optString);
                                                            break;
                                                        } else {
                                                            continue;
                                                        }
                                                    default:
                                                        switch (optInt) {
                                                            case 31:
                                                                if (!TextUtils.isEmpty(str4)) {
                                                                    str6 = h.f(1, str4, optString + ".*?\\>(.*?)(</span>|</div>)");
                                                                    break;
                                                                } else {
                                                                    continue;
                                                                }
                                                            case 32:
                                                                if (!TextUtils.isEmpty(str4)) {
                                                                    str6 = h.f(2, str4, optString + "=(\"|')(.*?)(\"|')");
                                                                    break;
                                                                } else {
                                                                    continue;
                                                                }
                                                            case 33:
                                                                if (TextUtils.isEmpty(str4)) {
                                                                    continue;
                                                                } else {
                                                                    str6 = h.f(2, str4, "<(img|IMG).*?" + optString + "(.*?)(/>|></img>|>)");
                                                                }
                                                            case 34:
                                                                if (!TextUtils.isEmpty(str4)) {
                                                                    str6 = h.f(2, str4, "(" + optString + ")(http.*?)(" + optString + ")");
                                                                    break;
                                                                } else {
                                                                    continue;
                                                                }
                                                        }
                                                        break;
                                                }
                                            } else if (TextUtils.isEmpty(str5)) {
                                                continue;
                                            } else {
                                                str6 = h.b.a(str5, optString);
                                            }
                                        } else if (TextUtils.isEmpty(str4)) {
                                            continue;
                                        } else {
                                            str6 = h.b.a(str4, optString);
                                        }
                                    } else if (TextUtils.isEmpty(str3)) {
                                        continue;
                                    } else {
                                        str6 = h.b.a(str3, optString);
                                    }
                                } else if (TextUtils.isEmpty(str3)) {
                                    continue;
                                } else {
                                    Matcher matcher = Pattern.compile(optString, 34).matcher(str3);
                                    if (matcher.find()) {
                                        str6 = matcher.group(1);
                                    }
                                    str6 = "";
                                }
                            } else if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                str6 = h.b.a(str2, optString);
                            }
                        } else if (obj != null) {
                            str6 = j(obj);
                        } else {
                            continue;
                        }
                    } else {
                        str6 = jSONObject.optString(optString, "");
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        return str6;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d5 A[Catch: all -> 0x0318, TRY_LEAVE, TryCatch #6 {all -> 0x0318, blocks: (B:3:0x0029, B:6:0x0038, B:8:0x003c, B:10:0x0045, B:12:0x004f, B:15:0x0065, B:17:0x006b, B:22:0x007c, B:83:0x0270, B:85:0x027b, B:87:0x0281, B:89:0x0287, B:91:0x0291, B:92:0x0299, B:94:0x02a3, B:96:0x02a9, B:98:0x02af, B:99:0x02d2, B:103:0x02bd, B:105:0x02c3, B:107:0x02d5, B:110:0x02e1, B:112:0x02e7, B:114:0x02ef, B:116:0x02f9, B:117:0x0301, B:119:0x0307, B:120:0x030c, B:127:0x011c, B:131:0x0140, B:173:0x023f, B:185:0x01ef, B:187:0x01fd, B:189:0x0226), top: B:2:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b A[Catch: all -> 0x0318, TryCatch #6 {all -> 0x0318, blocks: (B:3:0x0029, B:6:0x0038, B:8:0x003c, B:10:0x0045, B:12:0x004f, B:15:0x0065, B:17:0x006b, B:22:0x007c, B:83:0x0270, B:85:0x027b, B:87:0x0281, B:89:0x0287, B:91:0x0291, B:92:0x0299, B:94:0x02a3, B:96:0x02a9, B:98:0x02af, B:99:0x02d2, B:103:0x02bd, B:105:0x02c3, B:107:0x02d5, B:110:0x02e1, B:112:0x02e7, B:114:0x02ef, B:116:0x02f9, B:117:0x0301, B:119:0x0307, B:120:0x030c, B:127:0x011c, B:131:0x0140, B:173:0x023f, B:185:0x01ef, B:187:0x01fd, B:189:0x0226), top: B:2:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3 A[Catch: all -> 0x0318, TryCatch #6 {all -> 0x0318, blocks: (B:3:0x0029, B:6:0x0038, B:8:0x003c, B:10:0x0045, B:12:0x004f, B:15:0x0065, B:17:0x006b, B:22:0x007c, B:83:0x0270, B:85:0x027b, B:87:0x0281, B:89:0x0287, B:91:0x0291, B:92:0x0299, B:94:0x02a3, B:96:0x02a9, B:98:0x02af, B:99:0x02d2, B:103:0x02bd, B:105:0x02c3, B:107:0x02d5, B:110:0x02e1, B:112:0x02e7, B:114:0x02ef, B:116:0x02f9, B:117:0x0301, B:119:0x0307, B:120:0x030c, B:127:0x011c, B:131:0x0140, B:173:0x023f, B:185:0x01ef, B:187:0x01fd, B:189:0x0226), top: B:2:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static lc.a l(java.lang.Object r33, java.lang.String r34, java.lang.String r35, long r36, long r38, org.json.JSONObject r40, java.lang.String r41, org.json.JSONArray r42, java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.b.l(java.lang.Object, java.lang.String, java.lang.String, long, long, org.json.JSONObject, java.lang.String, org.json.JSONArray, java.lang.String):lc.a");
    }

    public static String m(Object obj) {
        if (obj != null) {
            try {
                ArrayList arrayList = new ArrayList();
                h.d(obj.getClass(), arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    if (field != null) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null && (obj2 instanceof String) && ((String) obj2).contains("<!DOCTYPE html>")) {
                            return (String) obj2;
                        }
                    }
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    public static JSONObject n(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            h.d(obj.getClass(), arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (obj2 instanceof JSONObject) && !TextUtils.isEmpty(((JSONObject) obj2).optString(str, ""))) {
                        return (JSONObject) obj2;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
