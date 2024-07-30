package j7;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.RemoteAppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.ppskit.activity.PPSBaseActivity;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.net.http.HttpsConfig;
import com.huawei.openalliance.ad.views.PPSSplashView;
import com.huawei.openalliance.ad.views.SplashLinkedVideoView;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import ka.bb;
import ka.cb;
import ka.l7;
import ka.n7;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CompactHashing.java */
/* loaded from: classes2.dex */
public class r {
    public static final Class A(bd.a aVar) {
        zc.d.d(aVar, "<this>");
        Class<?> a10 = ((zc.b) aVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a10;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a10;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a10;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a10;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a10;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a10;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a10;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a10;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a10;
            default:
                return a10;
        }
    }

    public static Object B(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object C(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static SimpleDateFormat D(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(a3.l.i("Unknown DateFormat style: ", i10));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sb2.append(str);
        sb2.append(" ");
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(a3.l.i("Unknown DateFormat style: ", i11));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    public static boolean E(Comparator comparator, Iterable iterable) {
        Object comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = t1.f30103s;
            }
        } else if (iterable instanceof i2) {
            comparator2 = ((i2) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    public static final int F(int i10) {
        if (i10 >= 0) {
            if (i10 < 3) {
                return i10 + 1;
            }
            if (i10 < 1073741824) {
                return (int) ((i10 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        J(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int G(@javax.annotation.CheckForNull java.lang.Object r9, @javax.annotation.CheckForNull java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, @javax.annotation.CheckForNull java.lang.Object[] r15) {
        /*
            int r0 = j7.f0.c(r9)
            r1 = r0 & r11
            int r2 = I(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3a
            r7 = r14[r2]
            boolean r7 = i7.g.a(r9, r7)
            if (r7 == 0) goto L3a
            if (r15 == 0) goto L2a
            r7 = r15[r2]
            boolean r7 = i7.g.a(r10, r7)
            if (r7 == 0) goto L3a
        L2a:
            r9 = r6 & r11
            if (r5 != r3) goto L32
            J(r1, r9, r12)
            goto L39
        L32:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L39:
            return r2
        L3a:
            r5 = r6 & r11
            if (r5 != 0) goto L3f
            return r3
        L3f:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.r.G(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void H(List list, i7.h hVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (hVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }

    public static int I(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & DefaultClassResolver.NAME;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    public static void J(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static final Map K(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        zc.d.c(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static MaterialClickInfo a(View view, MotionEvent motionEvent) {
        boolean z10;
        if (view == null || motionEvent == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int width = view.getWidth();
        int height = view.getHeight();
        ViewParent parent = view.getParent();
        for (int i10 = 0; i10 < 5 && parent != null; i10++) {
            if (!(parent instanceof SplashLinkedVideoView) && !(parent instanceof PPSSplashView)) {
                parent = parent.getParent();
            } else {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (z10) {
            float x10 = motionEvent.getX() + view.getLeft();
            float y = motionEvent.getY() + view.getTop();
            StringBuilder sb3 = new StringBuilder();
            ViewParent parent2 = view.getParent();
            for (int i11 = 0; i11 < 5 && parent2 != null; i11++) {
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    x10 += viewGroup.getLeft();
                    y += viewGroup.getTop();
                }
                if (!(parent2 instanceof SplashLinkedVideoView) && !(parent2 instanceof PPSSplashView)) {
                    parent2 = parent2.getParent();
                } else {
                    ViewGroup viewGroup2 = (ViewGroup) parent2;
                    int width2 = viewGroup2.getWidth();
                    int height2 = viewGroup2.getHeight();
                    sb3.append(width2);
                    sb3.append("*");
                    sb3.append(height2);
                    return new MaterialClickInfo(Integer.valueOf((int) x10), Integer.valueOf((int) y), sb3.toString());
                }
            }
            return null;
        }
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        sb2.append(width);
        sb2.append("*");
        sb2.append(height);
        return new MaterialClickInfo(Integer.valueOf((int) x11), Integer.valueOf((int) y10), sb2.toString());
    }

    public static fb.m b(Context context, AdContentData adContentData, HashMap hashMap, List list) {
        ArrayList<fb.m> arrayList;
        fb.m hVar;
        if (context != null && adContentData != null) {
            fb.m mVar = null;
            if (list != null && list.size() > 0) {
                arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 14) {
                            ex.I("BtnUriActionFactory", "unsupport action:" + num);
                            hVar = null;
                        } else {
                            hVar = new fb.d(context, adContentData, hashMap);
                        }
                    } else {
                        hVar = new fb.h();
                    }
                    if (hVar != null) {
                        arrayList.add(hVar);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                for (fb.m mVar2 : arrayList) {
                    if (mVar != null) {
                        mVar.f28349d = mVar2;
                    }
                    mVar = mVar2;
                }
                return (fb.m) arrayList.get(0);
            }
            return new fb.h();
        }
        return new fb.h();
    }

    public static Object c(Context context, AppInfo appInfo) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", gb.b.p(appInfo));
            ha.c c10 = ha.c.c(context);
            String jSONObject2 = jSONObject.toString();
            if (appInfo != null && appInfo.j0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return c10.b(RemoteAppDownloadTask.class, "getDownloadStatus", jSONObject2, z10).getData();
        } catch (JSONException unused) {
            ex.I("ApDnApi", "queryTask JSONException");
            return null;
        }
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(com.anythink.expressad.foundation.g.a.bN));
            return androidx.transition.n.f(messageDigest.digest());
        } catch (IOException | NoSuchAlgorithmException unused) {
            ex.I("Sha256Util", "fail to get file sha256");
            return null;
        }
    }

    public static void e(Context context, int i10, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.f, i10);
            jSONObject.put(ba.f22059h, str);
            jSONObject.put(ba.M, str2);
            ha.c.c(context).b(null, "syncAgProtocolStatus", jSONObject.toString(), true);
        } catch (JSONException unused) {
            ex.I("ApDnApi", "syncAgProcolAgreeStatus JSONException");
        }
    }

    public static void f(Context context, String str, AdContentData adContentData, RemoteCallResultCallback remoteCallResultCallback, Class cls) {
        JSONObject jSONObject = new JSONObject();
        if (adContentData != null) {
            try {
                jSONObject.put("content_id", adContentData.L());
                jSONObject.put("templateId", adContentData.e0());
                jSONObject.put("slotid", adContentData.D());
                jSONObject.put("apiVer", adContentData.f0());
            } catch (JSONException unused) {
                i(remoteCallResultCallback, "reportAnalysisEvent JSONException", "trafficReminderExceptionEvent");
                return;
            }
        }
        jSONObject.put(ba.f22049a, str);
        ha.i.e(context).d("trafficReminderExceptionEvent", jSONObject.toString(), remoteCallResultCallback, cls);
    }

    public static void g(Context context, boolean z10, int i10, String str, RemoteCallResultCallback remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ba.T, z10);
            jSONObject.put(ba.U, i10);
            jSONObject.put(ba.W, str);
            a0.a.h(context, true).d("reportFullScreenNotify", jSONObject.toString(), remoteCallResultCallback, String.class);
            if (gb.r0.f()) {
                ha.i.e(context).d("reportFullScreenNotify", jSONObject.toString(), remoteCallResultCallback, String.class);
            }
        } catch (JSONException unused) {
            ex.I("ApDnApi", "reportFullScreenNotify JSONException");
        }
    }

    public static void h(AppDownloadTask appDownloadTask, JSONObject jSONObject) {
        String str;
        String p10 = gb.b.p(appDownloadTask);
        ex.Code("ApDnApi", "appdownload=%s", p10);
        jSONObject.put("content", p10);
        if (appDownloadTask != null && appDownloadTask.D() != null && appDownloadTask.D().U() != null) {
            str = appDownloadTask.D().U();
        } else {
            str = "";
        }
        jSONObject.put("unique_id", str);
    }

    public static void i(RemoteCallResultCallback remoteCallResultCallback, String str, String str2) {
        ex.I("ApDnApi", str);
        if (remoteCallResultCallback != null) {
            CallResult callResult = new CallResult();
            callResult.setCode(-1);
            callResult.setMsg(str);
            remoteCallResultCallback.onRemoteCallResult(str2, callResult);
        }
    }

    public static AppInfo j(AppDownloadTask appDownloadTask) {
        if (appDownloadTask.D() == null) {
            return null;
        }
        AppInfo appInfo = new AppInfo();
        appInfo.x(appDownloadTask.D().q());
        appInfo.w(appDownloadTask.D().i());
        appInfo.I(appDownloadTask.L());
        appInfo.Y(appDownloadTask.D().Q());
        return appInfo;
    }

    public static int k(int i10) {
        if (i10 == 404) {
            return 8;
        }
        return 0;
    }

    public static ContentRecord l(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            return new com.huawei.openalliance.ad.ppskit.handlers.e0(context).n(str, str2, str3);
        }
        ArrayList h10 = new com.huawei.openalliance.ad.ppskit.handlers.e0(context).h(ContentRecord.class, null, 6, new String[]{str, str2}, "updateTime desc", String.valueOf(4));
        if (!h10.isEmpty()) {
            return (ContentRecord) h10.get(0);
        }
        return null;
    }

    public static ContentRecord m(Context context, String str, String str2, String str3, String str4, int i10) {
        if (3 == i10) {
            return com.huawei.openalliance.ad.ppskit.handlers.f0.E(context).o(str, str2, str3, str4);
        }
        return l(context, str, str2, str4);
    }

    public static ContentRecord n(Context context, String str, String str2, JSONObject jSONObject) {
        return m(context, str, str2, jSONObject.optString("templateId"), jSONObject.optString("slotid"), jSONObject.optInt("apiVer", -1));
    }

    public static ContentRecord o(PPSBaseActivity pPSBaseActivity, String str, String str2, Intent intent) {
        return m(pPSBaseActivity, str, str2, intent.getStringExtra("templateId"), intent.getStringExtra("slotid"), intent.getIntExtra("apiVer", -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String p(android.content.Context r10) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = "\\+86"
            java.lang.String r2 = ""
            java.lang.String r3 = "PNUM"
            if (r10 != 0) goto L10
            java.lang.String r10 = "context is null"
            ka.n7.g(r3, r10)
            return r2
        L10:
            android.content.Context r10 = r10.getApplicationContext()
            r4 = 0
            r5 = 1
            java.lang.String r6 = "get msim num, start time:%s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L59
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L59
            r7[r4] = r8     // Catch: java.lang.Throwable -> L59
            ka.n7.c(r3, r6, r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = com.huawei.openalliance.ad.ppskit.utils.z1.B(r4, r10)     // Catch: java.lang.Throwable -> L59
            boolean r7 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r6)     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L35
            java.lang.String r6 = com.huawei.openalliance.ad.ppskit.utils.z1.B(r5, r10)     // Catch: java.lang.Throwable -> L59
        L35:
            java.lang.String r10 = "get msim num, end time:%s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L59
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L59
            r7[r4] = r8     // Catch: java.lang.Throwable -> L59
            ka.n7.c(r3, r10, r7)     // Catch: java.lang.Throwable -> L59
            boolean r10 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r6)     // Catch: java.lang.Throwable -> L59
            if (r10 != 0) goto L6b
            java.lang.String r10 = r6.trim()     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = r10.replaceAll(r1, r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r10 = r10.replaceAll(r0, r2)     // Catch: java.lang.Throwable -> L59
            goto L6c
        L59:
            r10 = move-exception
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r6 = "get msim num err: "
            java.lang.String r10 = r6.concat(r10)
            ka.n7.i(r3, r10)
        L6b:
            r10 = r2
        L6c:
            boolean r6 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r10)
            if (r6 == 0) goto Lc9
            java.lang.String r10 = "get num, start time:%s"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb6
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lb6
            r6[r4] = r7     // Catch: java.lang.Throwable -> Lb6
            ka.n7.c(r3, r10, r6)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r10 = com.huawei.openalliance.ad.ppskit.utils.z1.y(r4)     // Catch: java.lang.Throwable -> Lb6
            boolean r6 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r10)     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto L91
            java.lang.String r10 = com.huawei.openalliance.ad.ppskit.utils.z1.y(r5)     // Catch: java.lang.Throwable -> Lb6
        L91:
            java.lang.String r6 = "get num, end time:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb6
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lb6
            r5[r4] = r7     // Catch: java.lang.Throwable -> Lb6
            ka.n7.c(r3, r6, r5)     // Catch: java.lang.Throwable -> Lb6
            boolean r4 = com.huawei.openalliance.ad.ppskit.utils.y1.h(r10)     // Catch: java.lang.Throwable -> Lb6
            if (r4 != 0) goto Lc8
            java.lang.String r10 = r10.trim()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r10 = r10.replaceAll(r1, r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r10 = r10.replaceAll(r0, r2)     // Catch: java.lang.Throwable -> Lb6
            r2 = r10
            goto Lc8
        Lb6:
            r10 = move-exception
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r0 = "get hw num err: "
            java.lang.String r10 = r0.concat(r10)
            ka.n7.i(r3, r10)
        Lc8:
            r10 = r2
        Lc9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.r.p(android.content.Context):java.lang.String");
    }

    public static String q(sc.a aVar) {
        lc.b bVar;
        ConcurrentHashMap<String, lc.b> concurrentHashMap = aVar.f35308d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                if (!TextUtils.isEmpty(str) && (bVar = concurrentHashMap.get(str)) != null && !TextUtils.isEmpty(bVar.f32596a) && bVar.f32596a.startsWith("http")) {
                    return str;
                }
            }
            return "";
        }
        return "";
    }

    public static HashMap r(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a3.l.t("callAppName", str);
    }

    public static void s(Context context) {
        q9.a.a(context).d(null);
        q9.a a10 = q9.a.a(context);
        a10.getClass();
        try {
            SharedPreferences.Editor edit = a10.f34718c.edit();
            edit.clear();
            edit.commit();
        } catch (Exception unused) {
            Log.e("HomeCountrySharedPreference", "clear error");
        }
    }

    public static void t(Intent intent, l7 l7Var) {
        n7.b("ActivityStarter", "parseLinkedAdConfig");
        if (l7Var != null) {
            intent.putExtra(ba.f22065n, l7Var.f31406a);
            intent.putExtra(ba.f22064m, l7Var.f31407b);
            intent.putExtra(ba.o, l7Var.f31408c);
            n7.c("LinkedAdConfiguration", "get enableDirectReturnVideoAd is %s", Boolean.valueOf(l7Var.f31410e));
            intent.putExtra(ba.f22067q, l7Var.f31410e);
            intent.putExtra(ba.f22066p, l7Var.f31409d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(d0.b r14, android.content.Context r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.r.u(d0.b, android.content.Context, java.lang.String):void");
    }

    public static boolean v(IOException iOException) {
        boolean z10;
        int i10 = 0;
        for (IOException iOException2 = iOException; iOException2 != null && i10 < 10; iOException2 = iOException2.getCause()) {
            if (!(iOException2 instanceof PortUnreachableException) && !(iOException2 instanceof ConnectException) && !(iOException2 instanceof HttpRetryException) && !(iOException2 instanceof SocketTimeoutException) && !(iOException2 instanceof UnknownHostException) && !(iOException2 instanceof NoRouteToHostException) && !(iOException2 instanceof UnknownServiceException) && !(iOException2 instanceof ProtocolException) && !(iOException2 instanceof SSLKeyException) && !(iOException2 instanceof SSLPeerUnverifiedException) && !(iOException2 instanceof SSLProtocolException) && !(iOException2 instanceof SSLHandshakeException) && !(iOException2 instanceof SSLException)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public static void w(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (bb.f30980c == null) {
                synchronized (bb.class) {
                    if (bb.f30980c == null) {
                        bb.f30980c = new bb(applicationContext);
                    }
                }
            }
            HttpsConfig.f22712a = bb.f30980c;
            HttpsConfig.f22713b = new cb(applicationContext);
        } catch (IOException e10) {
            e = e10;
            Log.w("SecurityHttpsConfig", "SecureSSLSocketFactory create fail ", e);
        } catch (Exception e11) {
            e = e11;
            Log.w("SecurityHttpsConfig", "SecureSSLSocketFactory create fail ", e);
        }
    }

    public static void x(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
        sb3.append("null key in entry: null=");
        sb3.append(valueOf2);
        throw new NullPointerException(sb3.toString());
    }

    public static void y(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object z(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
