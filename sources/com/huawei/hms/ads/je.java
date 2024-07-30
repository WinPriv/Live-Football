package com.huawei.hms.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.views.PPSNativeView;
import gb.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class je {
    private static final int C = 0;
    private static final String Code = "ClctCtxProcessor";
    private static je Z;

    /* renamed from: d, reason: collision with root package name */
    private Context f21729d;

    /* renamed from: e, reason: collision with root package name */
    private Class<?> f21730e;
    private static final byte[] V = new byte[0];
    private static final byte[] I = new byte[0];
    private static Map<String, String[]> B = new ConcurrentHashMap();
    private int S = 0;
    private int F = 0;
    private int D = 0;
    private int L = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f21726a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f21727b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f21728c = 100;

    private je(Context context) {
        this.f21729d = context.getApplicationContext();
        try {
            int i10 = PPSNativeView.A;
            this.f21730e = PPSNativeView.class;
        } catch (Throwable unused) {
            ex.I(Code, "init unClctViewClass error");
        }
    }

    public static je Code(Context context) {
        return I(context);
    }

    private static je I(Context context) {
        je jeVar;
        synchronized (V) {
            if (Z == null) {
                Z = new je(context);
            }
            jeVar = Z;
        }
        return jeVar;
    }

    public String Code() {
        if (ec.Code(this.f21729d).ae()) {
            ex.Code(Code, "get AutoContentBundle");
            return gb.b.p(B);
        }
        ex.Code(Code, "get AutoContentBundle off");
        B.clear();
        return null;
    }

    public void V(final Context context) {
        c0.b(new Runnable() { // from class: com.huawei.hms.ads.je.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    ec Code2 = ec.Code(context);
                    if (Code2.ae()) {
                        int N = Code2.N() * 1000;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - Code2.af() <= N && N != 0) {
                            ex.Code(je.Code, "collect AutoContentBundle is limited in %s ", Integer.valueOf(N));
                            return;
                        }
                        ex.Code(je.Code, "collectAutoContentBundle");
                        Code2.I(currentTimeMillis);
                        Context context2 = context;
                        if (context2 instanceof Activity) {
                            Activity activity = (Activity) context2;
                            String simpleName = activity.getClass().getSimpleName();
                            ex.Code(je.Code, "getActivityInfo-name: %s", activity.getClass().getSimpleName());
                            if (!gb.p.f(simpleName)) {
                                je.B.clear();
                                je.B.put("activityName", new String[]{simpleName});
                            }
                            Map Code3 = je.this.Code(activity, Code2.P());
                            int O = Code2.O();
                            if (!a0.a.r(Code3)) {
                                je.this.Code(activity, (Map<Integer, String>) Code3, O);
                                return;
                            }
                            ex.Code(je.Code, "no id list, getAutoContent");
                            String[] Code4 = je.this.Code(activity, O);
                            if (Code4 != null && Code4.length > 0) {
                                je.B.put(com.huawei.openalliance.ad.constant.w.ch, Code4);
                                return;
                            }
                            return;
                        }
                        str = "getActivityInfo-name: not Activity";
                    } else {
                        je.B.clear();
                        str = "collectAutoContentBundle off";
                    }
                    ex.Code(je.Code, str);
                } catch (Throwable th) {
                    ex.Code(je.Code, "collect AutoContentBundle error: %s", th.getClass().getSimpleName());
                }
            }
        }, c0.a.COLLECT_SEQUENCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> Code(android.view.View r10, int r11, int r12) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            r10 = 0
            return r10
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r10 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lbb
            r1 = 1
            int r12 = r12 + r1
            int r2 = r9.f21728c
            r3 = 0
            if (r12 < r2) goto L24
            java.lang.String r10 = "ClctCtxProcessor"
            java.lang.String r11 = "autoContentRur outer round %s "
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1[r3] = r12
            com.huawei.hms.ads.ex.Code(r10, r11, r1)
            return r0
        L24:
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r2 = r3
        L27:
            int r4 = r10.getChildCount()
            if (r2 >= r4) goto Lbb
            android.view.View r4 = r10.getChildAt(r2)
            boolean r5 = r9.Code(r4)
            if (r5 == 0) goto L39
            goto Lb7
        L39:
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L9c
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L9c
            byte[] r5 = com.huawei.hms.ads.je.I
            monitor-enter(r5)
            r6 = r4
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> L99
            java.lang.CharSequence r6 = r6.getText()     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L99
            int r7 = r9.S     // Catch: java.lang.Throwable -> L99
            if (r7 >= r11) goto L85
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L99
            int r7 = r7 + r8
            if (r7 <= r11) goto L85
            int r7 = r9.S     // Catch: java.lang.Throwable -> L99
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L99
            int r7 = r7 + r8
            r9.S = r7     // Catch: java.lang.Throwable -> L99
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L99
            int r8 = r9.S     // Catch: java.lang.Throwable -> L99
            int r7 = r7 - r8
            int r7 = r7 + r11
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L99
            if (r7 <= r8) goto L77
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L99
        L77:
            java.lang.String r6 = r6.substring(r3, r7)     // Catch: java.lang.Throwable -> L99
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L99
            if (r7 != 0) goto L97
        L81:
            r0.add(r6)     // Catch: java.lang.Throwable -> L99
            goto L97
        L85:
            int r7 = r9.S     // Catch: java.lang.Throwable -> L99
            if (r7 >= r11) goto L97
            int r8 = r6.length()     // Catch: java.lang.Throwable -> L99
            int r7 = r7 + r8
            r9.S = r7     // Catch: java.lang.Throwable -> L99
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L99
            if (r7 != 0) goto L97
            goto L81
        L97:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L99
            goto L9c
        L99:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L99
            throw r10
        L9c:
            int r5 = r9.S
            if (r5 < r11) goto Lb0
            java.lang.String r10 = "ClctCtxProcessor"
            java.lang.String r12 = "autoContentSize maxSize %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1[r3] = r11
            com.huawei.hms.ads.ex.Code(r10, r12, r1)
            return r0
        Lb0:
            java.util.List r4 = r9.Code(r4, r11, r12)
            r0.addAll(r4)
        Lb7:
            int r2 = r2 + 1
            goto L27
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.je.Code(android.view.View, int, int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> Code(Context context, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (!a0.a.r(map)) {
            Code(context, "title", map, hashMap);
            Code(context, "content", map, hashMap);
            Code(context, com.huawei.openalliance.ad.constant.w.cl, map, hashMap);
            Code(context, com.huawei.openalliance.ad.constant.w.cm, map, hashMap);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Code(Activity activity, Map<Integer, String> map, int i10) {
        HashMap hashMap = new HashMap();
        this.F = 0;
        this.L = 0;
        this.f21726a = 0;
        this.D = 0;
        Code(activity.getWindow().getDecorView(), map, hashMap, i10, this.f21727b);
        if (a0.a.r(hashMap)) {
            ex.Code(Code, "no get cfg, getAutoContent");
            String[] Code2 = Code(activity, i10);
            if (Code2 == null || Code2.length <= 0) {
                return;
            }
            B.put(com.huawei.openalliance.ad.constant.w.ch, Code2);
            return;
        }
        Code(hashMap, "title", B);
        if (!Code(hashMap, "content", B)) {
            ex.Code(Code, "no get cfg content, getAutoContent");
            String[] Code3 = Code(activity, i10);
            if (Code3 != null && Code3.length > 0) {
                B.put(com.huawei.openalliance.ad.constant.w.ch, Code3);
            }
        }
        Code(hashMap, com.huawei.openalliance.ad.constant.w.cl, B);
        Code(hashMap, com.huawei.openalliance.ad.constant.w.cm, B);
    }

    private void Code(Context context, String str, Map<String, String> map, Map<Integer, String> map2) {
        List list = (List) gb.b.o(List.class, map.get(str), new Class[0]);
        if (androidx.transition.n.h(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int identifier = context.getResources().getIdentifier((String) it.next(), "id", context.getPackageName());
            if (identifier != 0) {
                map2.put(Integer.valueOf(identifier), str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0073. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Code(android.view.View r11, java.util.Map<java.lang.Integer, java.lang.String> r12, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.ads.je.Code(android.view.View, java.util.Map, java.util.Map, int, int):void");
    }

    private boolean Code(View view) {
        Class<?> cls = this.f21730e;
        return cls != null && cls.isInstance(view);
    }

    private boolean Code(Map<String, List<String>> map, String str, Map<String, String[]> map2) {
        if (!map.containsKey(str)) {
            return false;
        }
        List<String> list = map.get(str);
        if (!androidx.transition.n.h(list)) {
            map2.put(str, (String[]) list.toArray(new String[list.size()]));
            return true;
        }
        ex.Code(Code, "get %s is null " + str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] Code(Activity activity, int i10) {
        this.S = 0;
        String[] strArr = new String[0];
        List<String> Code2 = Code(activity.getWindow().getDecorView(), i10, this.f21727b);
        if (!androidx.transition.n.h(Code2)) {
            return (String[]) Code2.toArray(new String[Code2.size()]);
        }
        ex.Code(Code, "get contentAuto is null");
        return strArr;
    }
}
