package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r4 {

    /* renamed from: a, reason: collision with root package name */
    public static GlobalShareData f31736a;

    /* renamed from: b, reason: collision with root package name */
    public static List<String> f31737b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f31738c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f31739d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<String, ContentRecord> f31740e = new HashMap<>();
    public static final HashMap<String, ContentRecord> f = new HashMap<>();

    public static void a(String str, ContentRecord contentRecord) {
        synchronized (f31738c) {
            if (str == null) {
                n7.b("GlobalDataShare", "set normal splash ad null");
                f31740e.clear();
            } else {
                f31740e.put(str, contentRecord);
            }
        }
    }

    public static void b(GlobalShareData globalShareData) {
        synchronized (f31739d) {
            f31736a = globalShareData;
        }
    }

    public static void c(ContentRecord contentRecord, String str) {
        synchronized (f31738c) {
            if (str == null) {
                n7.b("GlobalDataShare", "set spare splash ad null");
                f.clear();
            } else {
                f.put(str, contentRecord);
            }
        }
    }
}
