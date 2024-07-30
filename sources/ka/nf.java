package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.cp;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.beans.vast.LinearCreative;
import com.huawei.openalliance.ad.ppskit.beans.vast.StaticResource;
import com.huawei.openalliance.ad.ppskit.beans.vast.Tracking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class nf {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f31514a;

    static {
        HashMap hashMap = new HashMap();
        f31514a = hashMap;
        hashMap.put("mute", "soundClickOff");
        hashMap.put("complete", "vastPlayComplete");
        hashMap.put("start", "vastPlayStart");
        hashMap.put("unmute", "soundClickOn");
        hashMap.put(cp.F, "userclose");
        hashMap.put(cp.V, "vastFirstQuart");
        hashMap.put("midpoint", "vastMidPoint");
        hashMap.put(cp.Z, "vastThirdQuart");
    }

    public static ImageInfo a(StaticResource staticResource) {
        String str;
        if (staticResource != null && !TextUtils.isEmpty(staticResource.c())) {
            ImageInfo imageInfo = new ImageInfo();
            imageInfo.h(staticResource.c());
            if (com.huawei.openalliance.ad.constant.be.B.equalsIgnoreCase(staticResource.a())) {
                str = com.huawei.openalliance.ad.constant.bd.V;
            } else {
                str = com.huawei.openalliance.ad.constant.bd.Code;
            }
            imageInfo.f(str);
            imageInfo.j(1);
            return imageInfo;
        }
        return null;
    }

    public static Monitor b(String str, List list) {
        if (!androidx.transition.n.M(list)) {
            Monitor monitor = new Monitor();
            monitor.b(str);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Tracking) it.next()).a());
            }
            monitor.c(arrayList);
            return monitor;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[Catch: all -> 0x0131, TryCatch #0 {all -> 0x0131, blocks: (B:13:0x001e, B:15:0x004c, B:16:0x0051, B:18:0x0059, B:23:0x0069, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:31:0x0091, B:33:0x00a1, B:35:0x00a7, B:37:0x00ad, B:39:0x00b3, B:41:0x00bb, B:43:0x00c1, B:55:0x00de, B:63:0x00f8, B:68:0x0118, B:71:0x00ff, B:73:0x0109, B:77:0x011e, B:79:0x0124, B:81:0x012a, B:86:0x00e8, B:20:0x0064, B:89:0x0067), top: B:12:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0124 A[Catch: all -> 0x0131, TryCatch #0 {all -> 0x0131, blocks: (B:13:0x001e, B:15:0x004c, B:16:0x0051, B:18:0x0059, B:23:0x0069, B:25:0x007f, B:27:0x0085, B:29:0x008b, B:31:0x0091, B:33:0x00a1, B:35:0x00a7, B:37:0x00ad, B:39:0x00b3, B:41:0x00bb, B:43:0x00c1, B:55:0x00de, B:63:0x00f8, B:68:0x0118, B:71:0x00ff, B:73:0x0109, B:77:0x011e, B:79:0x0124, B:81:0x012a, B:86:0x00e8, B:20:0x0064, B:89:0x0067), top: B:12:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.openalliance.ad.ppskit.beans.vast.VastContent c(com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.nf.c(com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData, int, int):com.huawei.openalliance.ad.ppskit.beans.vast.VastContent");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData r10, com.huawei.openalliance.ad.ppskit.beans.vast.VastContent r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.nf.d(com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData, com.huawei.openalliance.ad.ppskit.beans.vast.VastContent, int, boolean):void");
    }

    public static void e(List list, HashMap hashMap) {
        if (!androidx.transition.n.M(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Monitor monitor = (Monitor) it.next();
                if (monitor != null) {
                    String a10 = monitor.a();
                    Monitor monitor2 = (Monitor) hashMap.get(a10);
                    if (monitor2 != null) {
                        HashSet hashSet = new HashSet(monitor2.k());
                        hashSet.addAll(monitor.k());
                        monitor2.c(new ArrayList(hashSet));
                        hashMap.put(a10, monitor2);
                    } else {
                        hashMap.put(monitor.a(), monitor);
                    }
                }
            }
        }
    }

    public static boolean f(LinearCreative linearCreative) {
        if (androidx.transition.n.M(linearCreative.f())) {
            n7.e("VastAdapter", "no media file in linear creative, skip parse vastInfo.");
            return false;
        }
        return true;
    }
}
