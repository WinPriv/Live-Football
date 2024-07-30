package sc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.n;
import com.huawei.openalliance.ad.constant.w;
import ic.e;
import ic.f;
import j7.r;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jc.c;
import mc.d;
import org.json.JSONException;
import org.json.JSONObject;
import pc.g;

/* loaded from: classes2.dex */
public final class b implements mc.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f35320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f35321b;

    public b(c cVar, c.a aVar) {
        this.f35321b = cVar;
        this.f35320a = aVar;
    }

    @Override // mc.c
    public final void a() {
        this.f35321b.f35325b = true;
    }

    @Override // mc.c
    public final void b() {
        this.f35321b.f35325b = false;
    }

    @Override // mc.c
    public final void a(int i10, Object obj) {
        int i11;
        String str;
        String str2;
        long j10;
        boolean z10;
        String str3 = "setting_id";
        c cVar = this.f35321b;
        int i12 = 0;
        cVar.f35325b = false;
        if (obj != null) {
            String obj2 = obj.toString();
            g.a(cVar.f35324a, "P_SY", obj2);
            Context context = cVar.f35324a;
            long currentTimeMillis = System.currentTimeMillis();
            if (context != null) {
                try {
                    SharedPreferences.Editor edit = context.getSharedPreferences("tramini", 0).edit();
                    edit.putLong("P_UD_TE", currentTimeMillis);
                    edit.apply();
                } catch (Error | Exception unused) {
                }
            }
            a b10 = a.b(pc.d.a(obj2));
            if (b10 != null) {
                String q10 = r.q(b10);
                oc.b a10 = oc.b.a();
                String str4 = b10.f35305a;
                a10.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", 14);
                    jSONObject.put("setting_id", str4);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                a10.b(0, q10, null, jSONObject);
                jc.b.a().c(b10);
                d dVar = this.f35320a;
                if (dVar != null) {
                    jc.c cVar2 = jc.c.this;
                    jc.b bVar = cVar2.f30213t;
                    bVar.getClass();
                    jc.d dVar2 = new jc.d(bVar, b10);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        dVar2.run();
                    } else {
                        bVar.f30203b.post(dVar2);
                    }
                    jc.b bVar2 = cVar2.f30213t;
                    f a11 = f.a(bVar2.f30202a);
                    a11.getClass();
                    int i13 = 1;
                    int i14 = jc.b.a().f30206e + 1;
                    jc.b.a().f30206e = i14;
                    g.a(a11.f29548a, "P_IL_O", new SimpleDateFormat("yyyyMMdd").format(new Date()) + "-" + i14);
                    HashSet hashSet = b10.f35317n;
                    f a12 = f.a(bVar2.f30202a);
                    Context context2 = a12.f29548a;
                    if (context2 == null || n.f520z0 == null) {
                        return;
                    }
                    String str5 = b10.f35313j;
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                    String[] split = str5.split(w.bE);
                    if (split.length < 2) {
                        return;
                    }
                    try {
                        i11 = context2.getSharedPreferences(split[0], 0).getInt(split[1], 2);
                    } catch (Error | Exception unused2) {
                        i11 = 2;
                    }
                    if (i11 == 1) {
                        return;
                    }
                    if (a12.f29549b == null) {
                        a12.f29549b = new HashMap();
                    }
                    if (a12.f29550c == null) {
                        a12.f29550c = new HashSet();
                    }
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    HashSet hashSet4 = new HashSet(a12.f29549b.keySet());
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            lc.c cVar3 = (lc.c) it.next();
                            cVar3.f32603u = System.currentTimeMillis();
                            kc.c a13 = kc.c.a(context2);
                            if (kc.b.f32283c == null) {
                                kc.b.f32283c = new kc.b(a13);
                            }
                            kc.b.f32283c.i(cVar3);
                            a12.f29550c.add(cVar3);
                        }
                    }
                    for (lc.c cVar4 : a12.f29550c) {
                        String a14 = pc.d.a(cVar4.f32602t);
                        if (a12.f29551d == null) {
                            a12.f29551d = context2.getPackageManager();
                        }
                        try {
                            a12.f29551d.getApplicationInfo(a14, 8192);
                            z10 = true;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            z10 = false;
                        }
                        if (z10) {
                            if (!hashSet4.contains(cVar4.f32601s)) {
                                hashSet2.add(cVar4);
                                hashSet4.add(cVar4.f32601s);
                            }
                        } else if (hashSet4.contains(cVar4.f32601s)) {
                            hashSet3.add(cVar4);
                            hashSet4.remove(cVar4.f32601s);
                        }
                    }
                    if (hashSet2.size() == 0 && hashSet3.size() == 0) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        lc.c cVar5 = (lc.c) it2.next();
                        try {
                            jSONObject2.put(cVar5.f32601s, i13);
                        } catch (JSONException unused4) {
                        }
                        try {
                            PackageInfo packageInfo = a12.f29551d.getPackageInfo(pc.d.a(cVar5.f32602t), i12);
                            str2 = packageInfo.versionName;
                            if (Build.VERSION.SDK_INT >= 28) {
                                j10 = packageInfo.getLongVersionCode();
                                str = str3;
                            } else {
                                str = str3;
                                j10 = packageInfo.versionCode;
                            }
                        } catch (Throwable unused5) {
                            str = str3;
                        }
                        try {
                            jSONObject3.put(cVar5.f32601s, str2);
                            jSONObject4.put(cVar5.f32601s, String.valueOf(j10));
                        } catch (Throwable unused6) {
                            str3 = str;
                            i12 = 0;
                            i13 = 1;
                        }
                    }
                    String str6 = str3;
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        try {
                            jSONObject2.put(((lc.c) it3.next()).f32601s, 2);
                        } catch (JSONException unused7) {
                        }
                    }
                    String q11 = r.q(b10);
                    oc.b a15 = oc.b.a();
                    e eVar = new e(a12, hashSet2, hashSet3);
                    if (a15.f33814a == null) {
                        a15.f33814a = new HashMap(3);
                    }
                    a15.f33814a.put(2, eVar);
                    oc.b a16 = oc.b.a();
                    String str7 = b10.f35305a;
                    JSONObject jSONObject5 = n.f520z0;
                    a16.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("sdk_time", System.currentTimeMillis());
                        jSONObject6.put("type", 16);
                        jSONObject6.put(str6, str7);
                        jSONObject6.put("it_lps", jSONObject2);
                        jSONObject6.put("it_lvn", jSONObject3);
                        jSONObject6.put("it_lvc", jSONObject4);
                    } catch (Throwable unused8) {
                    }
                    a16.b(2, q11, jSONObject5, jSONObject6);
                }
            }
        }
    }
}
