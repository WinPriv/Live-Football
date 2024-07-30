package com.anythink.expressad.video.bt.a;

import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.bt.module.AnythinkBTVideoView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11202c = "a";

    /* renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, AnythinkBTVideoView> f11203e = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private String f11206d = "handlerNativeResult";

    /* renamed from: a, reason: collision with root package name */
    int f11204a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f11205b = 1;

    /* renamed from: com.anythink.expressad.video.bt.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0134a {

        /* renamed from: a, reason: collision with root package name */
        private static a f11207a = new a();

        private C0134a() {
        }
    }

    public static a a() {
        return C0134a.f11207a;
    }

    public static void a(String str, AnythinkBTVideoView anythinkBTVideoView) {
        f11203e.put(str, anythinkBTVideoView);
    }

    public static void a(String str) {
        f11203e.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00db A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:85:0x000b, B:87:0x0011, B:89:0x0018, B:92:0x002a, B:4:0x002e, B:6:0x0034, B:9:0x003c, B:11:0x0044, B:13:0x004c, B:16:0x0056, B:18:0x0060, B:20:0x0064, B:22:0x006a, B:24:0x0072, B:26:0x007c, B:28:0x0080, B:30:0x0086, B:32:0x008e, B:34:0x0098, B:36:0x009c, B:38:0x00a2, B:42:0x00af, B:44:0x00b6, B:46:0x00c0, B:49:0x00d2, B:51:0x00db, B:54:0x00ed, B:56:0x00f6, B:58:0x0100, B:60:0x0104, B:64:0x010a, B:67:0x0114, B:69:0x011a, B:71:0x0120, B:74:0x0132, B:75:0x013a, B:77:0x0144, B:79:0x0148, B:82:0x014e), top: B:84:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:85:0x000b, B:87:0x0011, B:89:0x0018, B:92:0x002a, B:4:0x002e, B:6:0x0034, B:9:0x003c, B:11:0x0044, B:13:0x004c, B:16:0x0056, B:18:0x0060, B:20:0x0064, B:22:0x006a, B:24:0x0072, B:26:0x007c, B:28:0x0080, B:30:0x0086, B:32:0x008e, B:34:0x0098, B:36:0x009c, B:38:0x00a2, B:42:0x00af, B:44:0x00b6, B:46:0x00c0, B:49:0x00d2, B:51:0x00db, B:54:0x00ed, B:56:0x00f6, B:58:0x0100, B:60:0x0104, B:64:0x010a, B:67:0x0114, B:69:0x011a, B:71:0x0120, B:74:0x0132, B:75:0x013a, B:77:0x0144, B:79:0x0148, B:82:0x014e), top: B:84:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:85:0x000b, B:87:0x0011, B:89:0x0018, B:92:0x002a, B:4:0x002e, B:6:0x0034, B:9:0x003c, B:11:0x0044, B:13:0x004c, B:16:0x0056, B:18:0x0060, B:20:0x0064, B:22:0x006a, B:24:0x0072, B:26:0x007c, B:28:0x0080, B:30:0x0086, B:32:0x008e, B:34:0x0098, B:36:0x009c, B:38:0x00a2, B:42:0x00af, B:44:0x00b6, B:46:0x00c0, B:49:0x00d2, B:51:0x00db, B:54:0x00ed, B:56:0x00f6, B:58:0x0100, B:60:0x0104, B:64:0x010a, B:67:0x0114, B:69:0x011a, B:71:0x0120, B:74:0x0132, B:75:0x013a, B:77:0x0144, B:79:0x0148, B:82:0x014e), top: B:84:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r12, java.lang.String r13, org.json.JSONArray r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.bt.a.a.a(java.lang.Object, java.lang.String, org.json.JSONArray):void");
    }

    private static void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            o.a(f11202c, e10.getMessage());
        } catch (Throwable th) {
            o.a(f11202c, th.getMessage());
        }
    }
}
