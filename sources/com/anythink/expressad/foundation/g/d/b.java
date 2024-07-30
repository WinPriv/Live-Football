package com.anythink.expressad.foundation.g.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.expressad.foundation.g.d.d;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.t;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9876a = "ImageLoader";

    /* renamed from: b, reason: collision with root package name */
    private static final int f9877b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9878c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f9879d = "message_key";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9880e = "message_bitmap";
    private static final String f = "message_message";

    /* renamed from: g, reason: collision with root package name */
    private static b f9881g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.g.c f9882h;

    /* renamed from: j, reason: collision with root package name */
    private LinkedHashMap<String, List<c>> f9884j = new LinkedHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private Handler f9885k = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.foundation.g.d.b.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    String string = message.getData().getString(b.f9879d);
                    Bitmap a10 = a.a(message.getData().getString(b.f9880e));
                    b.this.a(string, a10);
                    LinkedList linkedList = (LinkedList) b.this.f9884j.get(string);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            if (cVar != null) {
                                cVar.a(a10, string);
                            }
                        }
                    }
                    b.this.f9884j.remove(string);
                    return;
                }
                if (i10 == 2) {
                    String string2 = message.getData().getString(b.f9879d);
                    String string3 = message.getData().getString(b.f);
                    LinkedList linkedList2 = (LinkedList) b.this.f9884j.get(string2);
                    if (linkedList2 != null) {
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            c cVar2 = (c) it2.next();
                            if (cVar2 != null) {
                                cVar2.a(string3, string2);
                            }
                        }
                    }
                    b.this.f9884j.remove(string2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.a.e<String, Bitmap> f9883i = new com.anythink.expressad.foundation.g.a.c(((int) Runtime.getRuntime().maxMemory()) / 5);

    private b(Context context) {
        this.f9882h = new com.anythink.expressad.foundation.g.g.c(context);
    }

    private Bitmap d(String str) {
        Bitmap a10;
        if (t.a(str)) {
            return null;
        }
        String a11 = s.a(str);
        File file = new File(a11);
        if (a(str) != null) {
            return a(str);
        }
        if (!file.exists() || (a10 = a.a(a11)) == null) {
            return null;
        }
        a(str, a10);
        return a10;
    }

    public final void c(String str) {
        try {
            com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = this.f9883i;
            if (eVar == null || !eVar.a().contains(str)) {
                return;
            }
            this.f9883i.a(str);
        } catch (Throwable th) {
            o.d(f9876a, th.getMessage());
        }
    }

    private void b() {
        this.f9883i.b();
        LinkedHashMap<String, List<c>> linkedHashMap = this.f9884j;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.f9883i.a(str, bitmap);
    }

    public final Bitmap a(String str) {
        return this.f9883i.b(str);
    }

    public static b a(Context context) {
        if (f9881g == null) {
            f9881g = new b(context);
        }
        return f9881g;
    }

    private void c() {
        com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = this.f9883i;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final boolean b(String str) {
        if (t.a(str)) {
            return false;
        }
        return a(str) != null || new File(s.a(str)).exists();
    }

    public static void a() {
        com.anythink.expressad.foundation.g.a.e<String, Bitmap> eVar = f9881g.f9883i;
        if (eVar != null) {
            eVar.b();
        }
    }

    private void b(String str, String str2, String str3, c cVar) {
        if (t.a(str) || t.a(str2) || t.a(str3)) {
            return;
        }
        File file = new File(str3);
        Bitmap a10 = a(str2);
        if (a10 != null && !a10.isRecycled()) {
            cVar.a(a10, str);
            return;
        }
        if (file.exists()) {
            Bitmap a11 = a.a(str3);
            if (a11 != null && !a11.isRecycled()) {
                a(str2, a11);
                cVar.a(a11, str);
                return;
            } else {
                a(str, str2, str3, true, cVar);
                return;
            }
        }
        a(str, str2, str3, false, cVar);
    }

    public final void a(String str, c cVar) {
        b(str, str, s.a(str), cVar);
    }

    private void a(String str, String str2, String str3, c cVar) {
        b(str, str2, str3, cVar);
    }

    private void a(String str, String str2, String str3, boolean z10, c cVar) {
        if (!this.f9884j.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            this.f9884j.put(str2, linkedList);
            this.f9882h.a(a(str, str2, str3, z10));
            return;
        }
        LinkedList linkedList2 = (LinkedList) this.f9884j.get(str2);
        if (linkedList2 == null || linkedList2.contains(cVar)) {
            return;
        }
        linkedList2.add(cVar);
    }

    private d a(String str, String str2, String str3, boolean z10) {
        d.a aVar = new d.a() { // from class: com.anythink.expressad.foundation.g.d.b.2
            @Override // com.anythink.expressad.foundation.g.d.d.a
            public final void a(String str4, String str5) {
                Message obtainMessage = b.this.f9885k.obtainMessage();
                obtainMessage.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString(b.f9879d, str4);
                bundle.putString(b.f9880e, str5);
                obtainMessage.setData(bundle);
                b.this.f9885k.sendMessage(obtainMessage);
            }

            @Override // com.anythink.expressad.foundation.g.d.d.a
            public final void b(String str4, String str5) {
                Message obtainMessage = b.this.f9885k.obtainMessage();
                obtainMessage.what = 2;
                Bundle bundle = new Bundle();
                bundle.putString(b.f9879d, str4);
                bundle.putString(b.f, str5);
                obtainMessage.setData(bundle);
                b.this.f9885k.sendMessage(obtainMessage);
            }
        };
        d dVar = new d(str, str2, str3);
        dVar.a(z10);
        dVar.a(aVar);
        return dVar;
    }
}
