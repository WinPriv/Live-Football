package nc;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.w;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m extends h {
    public static lc.a i(Object obj, String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        Object obj2;
        Object obj3;
        Object obj4;
        lc.a aVar = null;
        try {
            String[] split = str2.split(w.bE);
            if (split.length != 2) {
                return null;
            }
            int i10 = 0;
            try {
                List list = (List) h.e(obj, str);
                obj2 = null;
                for (int i11 = 0; i11 < list.size() && (obj2 = list.get(i11)) == null; i11++) {
                    try {
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                obj2 = null;
            }
            Object e10 = h.e(obj2, split[0]);
            try {
                obj3 = e10.getClass().getMethod(split[1], new Class[0]).invoke(e10, new Object[0]);
            } catch (Throwable unused3) {
                obj3 = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            int i12 = 0;
            while (i12 < jSONArray.length()) {
                String optString = jSONArray.optString(i12);
                String optString2 = jSONObject.optString(optString);
                if (!TextUtils.isEmpty(optString2)) {
                    try {
                        String str3 = (String) h.e(obj, optString2);
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject2.put(optString, str3);
                        } else {
                            String str4 = (String) h.e(obj2, optString2);
                            if (!TextUtils.isEmpty(str4)) {
                                jSONObject2.put(optString, str4);
                            } else if (obj3 instanceof String) {
                                String obj5 = obj3.toString();
                                JSONArray jSONArray2 = new JSONArray(optString2);
                                int i13 = i10;
                                int i14 = i13;
                                while (i13 < jSONArray2.length()) {
                                    Matcher matcher = Pattern.compile(jSONArray2.optString(i13)).matcher(obj5);
                                    while (true) {
                                        if (matcher.find()) {
                                            String group = matcher.group();
                                            int indexOf = group.indexOf(">");
                                            int indexOf2 = group.indexOf("<");
                                            obj4 = obj3;
                                            if (indexOf != -1 && indexOf2 != -1) {
                                                try {
                                                    String substring = group.substring(indexOf + 1, indexOf2);
                                                    if (!TextUtils.isEmpty(substring)) {
                                                        jSONObject2.put(optString, substring);
                                                        i14 = 1;
                                                        break;
                                                    }
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            obj3 = obj4;
                                        } else {
                                            obj4 = obj3;
                                            break;
                                        }
                                    }
                                    if (i14 == 0) {
                                        i13++;
                                        obj3 = obj4;
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused5) {
                    }
                    obj4 = obj3;
                    i12++;
                    obj3 = obj4;
                    aVar = null;
                    i10 = 0;
                }
                obj4 = obj3;
                i12++;
                obj3 = obj4;
                aVar = null;
                i10 = 0;
            }
            try {
                if (jSONObject2.length() > 0) {
                    lc.a aVar2 = new lc.a();
                    aVar2.f32592a = jSONObject2;
                    return aVar2;
                }
            } catch (Throwable unused6) {
            }
            return null;
        } catch (Throwable unused7) {
            return aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static lc.a j(org.json.JSONObject r18, lc.b r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.m.j(org.json.JSONObject, lc.b, java.lang.String):lc.a");
    }
}
