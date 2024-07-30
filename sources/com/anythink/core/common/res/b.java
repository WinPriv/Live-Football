package com.anythink.core.common.res;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.f;
import com.anythink.core.common.res.image.a;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6446b = "ImageLoader";

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f6447c;

    /* renamed from: a, reason: collision with root package name */
    Context f6448a;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Integer> f6449d;
    private final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private LinkedHashMap<String, List<a>> f6451g = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private c<String, SoftReference<Bitmap>> f6450e = new c<String, SoftReference<Bitmap>>(((int) Runtime.getRuntime().maxMemory()) / 5) { // from class: com.anythink.core.common.res.b.3
        @Override // com.anythink.core.common.res.c
        public final /* synthetic */ int a(String str, SoftReference<Bitmap> softReference) {
            String str2 = str;
            SoftReference<Bitmap> softReference2 = softReference;
            Bitmap bitmap = softReference2 != null ? softReference2.get() : null;
            if (b.this.f6449d == null) {
                b.this.f6449d = new HashMap(8);
            }
            if (bitmap == null) {
                Integer num = (Integer) b.this.f6449d.get(str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
            int height = bitmap.getHeight() * bitmap.getRowBytes();
            b.this.f6449d.put(str2, Integer.valueOf(height));
            return height;
        }

        @Override // com.anythink.core.common.res.c
        public final /* synthetic */ void a(boolean z10, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            String str2 = str;
            SoftReference<Bitmap> softReference3 = softReference;
            SoftReference<Bitmap> softReference4 = softReference2;
            super.a(z10, (boolean) str2, softReference3, softReference4);
            if (softReference3 != null) {
                try {
                    bitmap = softReference3.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.f6449d != null) {
                b.this.f6449d.remove(str2);
            }
            if (softReference3 == null || softReference3.equals(softReference4) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private int a2(String str, SoftReference<Bitmap> softReference) {
            Bitmap bitmap = softReference != null ? softReference.get() : null;
            if (b.this.f6449d == null) {
                b.this.f6449d = new HashMap(8);
            }
            if (bitmap == null) {
                Integer num = (Integer) b.this.f6449d.get(str);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
            int height = bitmap.getHeight() * bitmap.getRowBytes();
            b.this.f6449d.put(str, Integer.valueOf(height));
            return height;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(boolean z10, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
            Bitmap bitmap;
            super.a(z10, (boolean) str, softReference, softReference2);
            if (softReference != null) {
                try {
                    bitmap = softReference.get();
                } catch (Exception unused) {
                    return;
                }
            } else {
                bitmap = null;
            }
            if (b.this.f6449d != null) {
                b.this.f6449d.remove(str);
            }
            if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    };

    /* renamed from: com.anythink.core.common.res.b$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f6452a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f6453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6454c;

        public AnonymousClass1(Bitmap bitmap, a aVar, String str) {
            this.f6452a = bitmap;
            this.f6453b = aVar;
            this.f6454c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap = this.f6452a;
            if (bitmap != null) {
                this.f6453b.onSuccess(this.f6454c, bitmap);
            } else {
                this.f6453b.onFail(this.f6454c, "Bitmap load fail");
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f6456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6458c;

        public AnonymousClass2(a aVar, String str, String str2) {
            this.f6456a = aVar;
            this.f6457b = str;
            this.f6458c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6456a.onFail(this.f6457b, this.f6458c);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void onFail(String str, String str2);

        void onSuccess(String str, Bitmap bitmap);
    }

    private b(Context context) {
        this.f6448a = context.getApplicationContext();
    }

    private void b(String str, Bitmap bitmap) {
        synchronized (this.f6451g) {
            LinkedList linkedList = (LinkedList) this.f6451g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        n.a().a(new AnonymousClass1(bitmap, aVar, str));
                    }
                }
            }
        }
    }

    private void a(String str, String str2) {
        synchronized (this.f6451g) {
            LinkedList linkedList = (LinkedList) this.f6451g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        n.a().a(new AnonymousClass2(aVar, str, str2));
                    }
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements a.InterfaceC0085a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f6468c;

        public AnonymousClass5(int i10, int i11, e eVar) {
            this.f6466a = i10;
            this.f6467b = i11;
            this.f6468c = eVar;
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0085a
        public final void a(e eVar) {
            String str = eVar.f;
            Bitmap a10 = b.this.a(eVar, this.f6466a, this.f6467b);
            if (a10 != null) {
                b.this.a(eVar.f, a10);
            }
            b.a(b.this, this.f6468c.f, a10);
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0085a
        public final void a(e eVar, String str) {
            b.a(b.this, eVar.f, str);
        }
    }

    private void b(e eVar, int i10, int i11, a aVar) {
        synchronized (this.f6451g) {
            if (!this.f6451g.containsKey(eVar.f)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(aVar);
                this.f6451g.put(eVar.f, linkedList);
                com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                aVar2.a(new AnonymousClass5(i10, i11, eVar));
                aVar2.d();
            } else {
                LinkedList linkedList2 = (LinkedList) this.f6451g.get(eVar.f);
                if (linkedList2 != null && !linkedList2.contains(aVar)) {
                    linkedList2.add(aVar);
                }
            }
        }
    }

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.f6450e.b(str, new SoftReference<>(bitmap));
    }

    private Bitmap a(String str) {
        SoftReference<Bitmap> a10 = this.f6450e.a((c<String, SoftReference<Bitmap>>) str);
        if (a10 != null) {
            return a10.get();
        }
        return null;
    }

    public final Bitmap a(e eVar, int i10, int i11) {
        Bitmap bitmap = null;
        if (eVar == null || TextUtils.isEmpty(eVar.f)) {
            return null;
        }
        String a10 = f.a(eVar.f);
        if (i10 <= 0) {
            try {
                i10 = this.f6448a.getResources().getDisplayMetrics().widthPixels;
            } catch (Throwable unused) {
            }
        }
        if (i11 <= 0) {
            i11 = this.f6448a.getResources().getDisplayMetrics().heightPixels;
        }
        synchronized (this.f) {
            FileInputStream a11 = d.a(this.f6448a).a(eVar.f6491e, a10);
            if (a11 == null) {
                return null;
            }
            try {
                bitmap = com.anythink.core.common.k.b.a(a11.getFD(), i10, i11);
            } catch (Throwable unused2) {
            }
            try {
                a11.close();
            } catch (Exception unused3) {
            }
            return bitmap;
        }
    }

    public static b a(Context context) {
        if (f6447c == null) {
            synchronized (b.class) {
                if (f6447c == null) {
                    f6447c = new b(context);
                }
            }
        }
        return f6447c;
    }

    public final void a(e eVar, a aVar) {
        a(eVar, -1, -1, aVar);
    }

    public final void a(final e eVar, final int i10, final int i11, final a aVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.f)) {
            if (aVar != null) {
                aVar.onFail("", "No url info.");
            }
        } else {
            Bitmap a10 = a(eVar.f);
            if (a10 != null && !a10.isRecycled()) {
                aVar.onSuccess(eVar.f, a10);
            } else {
                com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.res.b.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap a11 = b.this.a(eVar, i10, i11);
                        if (a11 != null && !a11.isRecycled()) {
                            b.this.a(eVar.f, a11);
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(aVar);
                            b.this.f6451g.put(eVar.f, linkedList);
                            b.a(b.this, eVar.f, a11);
                            return;
                        }
                        b.a(b.this, eVar, i10, i11, aVar);
                    }
                });
            }
        }
    }

    private void a() {
        try {
            c<String, SoftReference<Bitmap>> cVar = this.f6450e;
            if (cVar != null) {
                cVar.a();
            }
            LinkedHashMap<String, List<a>> linkedHashMap = this.f6451g;
            if (linkedHashMap != null) {
                linkedHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(b bVar, String str, Bitmap bitmap) {
        synchronized (bVar.f6451g) {
            LinkedList linkedList = (LinkedList) bVar.f6451g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        n.a().a(new AnonymousClass1(bitmap, aVar, str));
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, e eVar, int i10, int i11, a aVar) {
        synchronized (bVar.f6451g) {
            if (!bVar.f6451g.containsKey(eVar.f)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(aVar);
                bVar.f6451g.put(eVar.f, linkedList);
                com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                aVar2.a(new AnonymousClass5(i10, i11, eVar));
                aVar2.d();
            } else {
                LinkedList linkedList2 = (LinkedList) bVar.f6451g.get(eVar.f);
                if (linkedList2 != null && !linkedList2.contains(aVar)) {
                    linkedList2.add(aVar);
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        synchronized (bVar.f6451g) {
            LinkedList linkedList = (LinkedList) bVar.f6451g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        n.a().a(new AnonymousClass2(aVar, str, str2));
                    }
                }
            }
        }
    }
}
