package com.anythink.core.c;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.s;
import com.anythink.core.common.g.j;
import com.anythink.core.common.k.p;
import e0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4869a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static volatile e f4870b;

    /* renamed from: c, reason: collision with root package name */
    private Context f4871c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, d> f4872d = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(AdError adError);

        void a(d dVar);

        void b(d dVar);
    }

    private e(Context context) {
        this.f4871c = context;
    }

    private void b() {
        this.f4872d.clear();
    }

    private List<s> c(String str) {
        List<s> E;
        if (this.f4872d == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f4872d.values());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (TextUtils.equals(String.valueOf(dVar.X()), str) && (E = dVar.E()) != null) {
                arrayList2.addAll(E);
            }
        }
        return arrayList2;
    }

    public static e a(Context context) {
        if (f4870b == null) {
            synchronized (e.class) {
                if (f4870b == null) {
                    f4870b = new e(context);
                }
            }
        }
        return f4870b;
    }

    private static void b(Context context, d dVar) {
        int d10 = dVar.d();
        n.a().c(d10);
        p.a(context, g.o, "r", d10);
    }

    public final d b(String str) {
        String p10 = n.a().p();
        return this.f4872d.get(p10 + str);
    }

    public final void a() {
        Context context = this.f4871c;
        if (context != null) {
            try {
                context.getSharedPreferences(g.A, 0).edit().clear().apply();
            } catch (Error | Exception unused) {
            }
        }
    }

    public final void a(Context context, String str, d dVar, String str2) {
        String p10 = n.a().p();
        if (p10 == null) {
            p10 = "";
        }
        synchronized (this) {
            this.f4872d.put(p10 + str, dVar);
        }
        if (dVar.h() == 1) {
            if (n.a().I()) {
                Log.e("anythink", "PreInitNetwork may affect DebuggerMode.It is recommended to disable PreInitNetwork first and then setDebuggerMode.");
            }
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            p.a(context, g.o, i.f(p10, str, "_PL_SY"), str2);
        }
    }

    public final d a(String str) {
        String p10 = n.a().p();
        if (p10 == null) {
            p10 = "";
        }
        if (this.f4872d.containsKey(p10 + str)) {
            return this.f4872d.get(p10 + str);
        }
        String b10 = p.b(this.f4871c, g.o, i.f(p10, str, "_PL_SY"), "");
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        d b11 = d.b(b10);
        if (b11 != null) {
            this.f4872d.put(p10 + str, b11);
        }
        return b11;
    }

    public final void a(final d dVar, final String str, final String str2, final String str3, final Map<String, Object> map, final a aVar) {
        n.a().a(new Runnable() { // from class: com.anythink.core.c.e.1
            @Override // java.lang.Runnable
            public final void run() {
                String str4;
                d dVar2 = dVar;
                if (dVar2 != null) {
                    str4 = dVar2.P();
                } else {
                    str4 = null;
                }
                String str5 = str4;
                Map<String, Object> d10 = n.a().d(str3);
                if (dVar != null) {
                    if (!(!d10.equals(r0.M())) && !dVar.ax() && !com.anythink.core.common.s.a().c(e.this.f4871c, str3)) {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(dVar);
                            return;
                        }
                        return;
                    }
                    final boolean[] zArr = new boolean[1];
                    long Y = dVar.Y();
                    final CountDownTimer countDownTimer = new CountDownTimer(Y, Y) { // from class: com.anythink.core.c.e.1.1
                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            String str6 = e.f4869a;
                            zArr[0] = true;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.a(dVar);
                            }
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j10) {
                        }
                    };
                    if (Y == 0) {
                        zArr[0] = true;
                        a aVar3 = aVar;
                        if (aVar3 != null) {
                            aVar3.a(dVar);
                        }
                    } else {
                        countDownTimer.start();
                    }
                    new j(e.this.f4871c, str, str2, str3, str5, d10, map).a(0, new com.anythink.core.common.g.i() { // from class: com.anythink.core.c.e.1.2
                        @Override // com.anythink.core.common.g.i
                        public final void onLoadCanceled(int i10) {
                            AnonymousClass1 anonymousClass1;
                            a aVar4;
                            if (!zArr[0] && (aVar4 = aVar) != null) {
                                aVar4.a(dVar);
                            }
                        }

                        @Override // com.anythink.core.common.g.i
                        public final void onLoadError(int i10, String str6, AdError adError) {
                            AnonymousClass1 anonymousClass1;
                            a aVar4;
                            if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                                String str7 = str + str3 + str2;
                                adError.getPlatformCode();
                                adError.getPlatformMSG();
                                p.a(e.this.f4871c, g.A, str7, System.currentTimeMillis());
                            }
                            n.a().a(new Runnable() { // from class: com.anythink.core.c.e.1.2.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str8 = e.f4869a;
                                    CountDownTimer countDownTimer2 = countDownTimer;
                                    if (countDownTimer2 != null) {
                                        countDownTimer2.cancel();
                                    }
                                }
                            });
                            if (!zArr[0] && (aVar4 = aVar) != null) {
                                aVar4.a(dVar);
                            }
                        }

                        @Override // com.anythink.core.common.g.i
                        public final void onLoadFinish(int i10, Object obj) {
                            String str6 = (String) obj;
                            try {
                                JSONObject jSONObject = new JSONObject(str6);
                                jSONObject.put("updateTime", System.currentTimeMillis());
                                str6 = jSONObject.toString();
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                            }
                            d b10 = d.b(str6);
                            if (b10 != null) {
                                e eVar = e.this;
                                Context context = eVar.f4871c;
                                String str7 = str3;
                                if (b10.Z() != 1) {
                                    str6 = "";
                                }
                                eVar.a(context, str7, b10, str6);
                                e.a(e.this.f4871c, b10);
                                if (b10.N() == 1) {
                                    com.anythink.core.common.s.a().a(e.this.f4871c, str3);
                                }
                            }
                            n.a().a(new Runnable() { // from class: com.anythink.core.c.e.1.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str8 = e.f4869a;
                                    CountDownTimer countDownTimer2 = countDownTimer;
                                    if (countDownTimer2 != null) {
                                        countDownTimer2.cancel();
                                    }
                                }
                            });
                            if (zArr[0]) {
                                a aVar4 = aVar;
                                if (aVar4 != null && b10 != null) {
                                    aVar4.b(b10);
                                    return;
                                }
                                return;
                            }
                            if (b10 != null) {
                                a aVar5 = aVar;
                                if (aVar5 != null) {
                                    aVar5.a(b10);
                                    return;
                                }
                                return;
                            }
                            a aVar6 = aVar;
                            if (aVar6 != null) {
                                aVar6.a(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", "Placement Service error."));
                            }
                        }

                        @Override // com.anythink.core.common.g.i
                        public final void onLoadStart(int i10) {
                        }
                    });
                    return;
                }
                new j(e.this.f4871c, str, str2, str3, str5, d10, map).a(0, new com.anythink.core.common.g.i() { // from class: com.anythink.core.c.e.1.3
                    @Override // com.anythink.core.common.g.i
                    public final void onLoadCanceled(int i10) {
                        a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.a(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
                        }
                    }

                    @Override // com.anythink.core.common.g.i
                    public final void onLoadError(int i10, String str6, AdError adError) {
                        if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                            String str7 = str + str3 + str2;
                            adError.getPlatformCode();
                            adError.getPlatformMSG();
                            p.a(e.this.f4871c, g.A, str7, System.currentTimeMillis());
                            if (n.a().A()) {
                                Log.e("anythink", "Please check these params in your code (AppId: " + str + ", AppKey: " + str2 + ", PlacementId: " + str3 + ")");
                            }
                        }
                        a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.a(adError);
                        }
                    }

                    @Override // com.anythink.core.common.g.i
                    public final void onLoadFinish(int i10, Object obj) {
                        String str6 = (String) obj;
                        try {
                            JSONObject jSONObject = new JSONObject(str6);
                            jSONObject.put("updateTime", System.currentTimeMillis());
                            str6 = jSONObject.toString();
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                        d b10 = d.b(str6);
                        if (b10 != null) {
                            e eVar = e.this;
                            Context context = eVar.f4871c;
                            String str7 = str3;
                            if (b10.Z() != 1) {
                                str6 = "";
                            }
                            eVar.a(context, str7, b10, str6);
                            e.a(e.this.f4871c, b10);
                            if (b10.N() == 1) {
                                com.anythink.core.common.s.a().a(e.this.f4871c, str3);
                            }
                            a aVar4 = aVar;
                            if (aVar4 != null) {
                                aVar4.a(b10);
                                return;
                            }
                            return;
                        }
                        a aVar5 = aVar;
                        if (aVar5 != null) {
                            aVar5.a(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", "Placement Service error."));
                        }
                    }

                    @Override // com.anythink.core.common.g.i
                    public final void onLoadStart(int i10) {
                    }
                });
            }
        });
    }

    public static /* synthetic */ void a(Context context, d dVar) {
        int d10 = dVar.d();
        n.a().c(d10);
        p.a(context, g.o, "r", d10);
    }
}
