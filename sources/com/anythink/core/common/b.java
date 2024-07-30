package com.anythink.core.common;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4940a = "1";

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f4941c;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, List<a>> f4942b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);
    }

    private b() {
    }

    public static b a() {
        if (f4941c == null) {
            synchronized (b.class) {
                if (f4941c == null) {
                    f4941c = new b();
                }
            }
        }
        return f4941c;
    }

    public final synchronized void b(final String str, final a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (b.this) {
                        List<a> list = b.this.f4942b.get(str);
                        if (list != null) {
                            list.remove(aVar);
                        }
                    }
                }
            });
        }
    }

    public final synchronized void a(final String str, final a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (b.this) {
                        List<a> list = b.this.f4942b.get(str);
                        if (list == null) {
                            list = new ArrayList<>();
                            b.this.f4942b.put(str, list);
                        }
                        list.add(aVar);
                    }
                }
            });
        }
    }

    public final synchronized void a(final String str, final Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (b.this) {
                    List<a> list = b.this.f4942b.get(str);
                    if (list == null) {
                        return;
                    }
                    for (a aVar : list) {
                        if (aVar != null) {
                            aVar.a(obj);
                        }
                    }
                }
            }
        });
    }
}
