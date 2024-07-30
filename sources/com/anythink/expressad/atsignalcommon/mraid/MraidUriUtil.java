package com.anythink.expressad.atsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.a;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidUriUtil {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f7013a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f7014b = new ArrayList<>();

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i10);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i10, indexOf2)));
            i10 = indexOf + 1;
        } while (i10 < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static void clearUnSupportMraidMethodMap() {
        if (f7013a.size() > 0) {
            f7013a.clear();
        }
    }

    public static a getMraidMethodContext(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(c.f9471m)) {
            return null;
        }
        a aVar = new a();
        aVar.f7048d = j.b("n+ztLkxpVTzBLkxgHN==");
        aVar.f7049e = parse.getHost();
        int i10 = 0;
        if (f7014b.size() == 0) {
            for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
                f7014b.add(method.getName());
            }
        }
        if (!f7014b.contains(aVar.f7049e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = aVar.f7049e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f7013a.containsKey(campaignId)) {
                    String str3 = f7013a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        f7013a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    f7013a.put(campaignId, str2);
                }
            }
            CallMraidJS.getInstance().fireNativeMethodCompleteEvent(windVaneWebView, aVar.f7049e);
            CallMraidJS.getInstance().fireErrorEvent(windVaneWebView, aVar.f7049e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i10);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i10);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i10, indexOf2)));
                i10 = indexOf + 1;
            } while (i10 < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            aVar.f = jSONObject.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return aVar;
    }

    public static String getUnSupportMraidMethodString(String str) {
        if (f7013a.containsKey(str)) {
            return f7013a.get(str);
        }
        return null;
    }

    public static void clearUnSupportMraidMethodMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f7013a.remove(str);
    }

    private static void a() {
        for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
            f7014b.add(method.getName());
        }
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f7013a.containsKey(str)) {
            String str3 = f7013a.get(str);
            if (TextUtils.isEmpty(str2) || str3.contains(str2)) {
                return;
            }
            if (str3.length() > 0) {
                str3 = str3.concat(",");
            }
            f7013a.put(str, str3.concat(str2));
            return;
        }
        f7013a.put(str, str2);
    }
}
