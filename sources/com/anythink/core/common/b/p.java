package com.anythink.core.common.b;

import android.content.Context;
import android.content.Intent;
import com.anythink.core.activity.AnyThinkGdprAuthActivity;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.AdError;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.b.g;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    private static volatile p f5255d;

    /* renamed from: b, reason: collision with root package name */
    Context f5257b;

    /* renamed from: c, reason: collision with root package name */
    int f5258c;

    /* renamed from: a, reason: collision with root package name */
    final int f5256a = -100;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<Integer, Boolean> f5259e = new ConcurrentHashMap<>(5);

    private p(Context context) {
        this.f5258c = 2;
        if (context != null) {
            this.f5257b = context.getApplicationContext();
        }
        this.f5258c = com.anythink.core.common.k.p.b(this.f5257b, g.o, g.o.f5137d, 2);
    }

    public final boolean b() {
        com.anythink.core.c.a h10 = a3.l.h(com.anythink.core.c.b.a(this.f5257b));
        if (h10 == null || h10.G()) {
            return this.f5258c != 1;
        }
        if (h10.U() == 0) {
            return true;
        }
        int i10 = this.f5258c;
        if (h10.S() == 1) {
            i10 = h10.R();
        }
        return i10 == 0;
    }

    public final boolean c() {
        com.anythink.core.c.a h10 = a3.l.h(com.anythink.core.c.b.a(this.f5257b));
        return (h10 == null || h10.G()) ? this.f5258c != 1 : this.f5258c == 2 ? h10.U() == 0 : h10.S() == 1 ? h10.R() == 0 : this.f5258c == 0 || h10.U() == 0;
    }

    public final boolean d() {
        if (com.anythink.core.common.k.p.b(this.f5257b, g.o, g.o.f5142j, -100) == 1) {
            return true;
        }
        return false;
    }

    public static p a(Context context) {
        if (f5255d == null) {
            synchronized (p.class) {
                if (f5255d == null) {
                    f5255d = new p(context);
                }
            }
        }
        return f5255d;
    }

    public final void a(int i10) {
        this.f5258c = i10;
        com.anythink.core.common.k.p.a(this.f5257b, g.o, g.o.f5137d, i10);
    }

    public final int a() {
        return this.f5258c;
    }

    public final void a(final Context context, final ATGDPRAuthCallback aTGDPRAuthCallback) {
        n.a().a(new Runnable() { // from class: com.anythink.core.common.b.p.1
            @Override // java.lang.Runnable
            public final void run() {
                AnyThinkGdprAuthActivity.mCallback = aTGDPRAuthCallback;
                Intent intent = new Intent(context, (Class<?>) AnyThinkGdprAuthActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        });
    }

    public final void a(final NetTrafficeCallback netTrafficeCallback) {
        int b10 = com.anythink.core.common.k.p.b(this.f5257b, g.o, g.o.f5142j, -100);
        if (b10 == -100) {
            new com.anythink.core.common.g.h().a(0, new com.anythink.core.common.g.i() { // from class: com.anythink.core.common.b.p.2
                @Override // com.anythink.core.common.g.i
                public final void onLoadError(int i10, String str, AdError adError) {
                    NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                    if (netTrafficeCallback2 != null) {
                        netTrafficeCallback2.onErrorCallback(adError.printStackTrace());
                    }
                }

                @Override // com.anythink.core.common.g.i
                public final void onLoadFinish(int i10, Object obj) {
                    try {
                        if (obj == null) {
                            NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                            if (netTrafficeCallback2 != null) {
                                netTrafficeCallback2.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        if (!((JSONObject) obj).has("is_eu")) {
                            NetTrafficeCallback netTrafficeCallback3 = netTrafficeCallback;
                            if (netTrafficeCallback3 != null) {
                                netTrafficeCallback3.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        if (((JSONObject) obj).optInt("is_eu") == 1) {
                            NetTrafficeCallback netTrafficeCallback4 = netTrafficeCallback;
                            if (netTrafficeCallback4 != null) {
                                netTrafficeCallback4.onResultCallback(true);
                                return;
                            }
                            return;
                        }
                        NetTrafficeCallback netTrafficeCallback5 = netTrafficeCallback;
                        if (netTrafficeCallback5 != null) {
                            netTrafficeCallback5.onResultCallback(false);
                        }
                    } catch (Throwable unused) {
                        NetTrafficeCallback netTrafficeCallback6 = netTrafficeCallback;
                        if (netTrafficeCallback6 != null) {
                            netTrafficeCallback6.onErrorCallback("Internal error");
                        }
                    }
                }

                @Override // com.anythink.core.common.g.i
                public final void onLoadCanceled(int i10) {
                }

                @Override // com.anythink.core.common.g.i
                public final void onLoadStart(int i10) {
                }
            });
            return;
        }
        if (b10 == 1) {
            if (netTrafficeCallback != null) {
                netTrafficeCallback.onResultCallback(true);
            }
        } else if (netTrafficeCallback != null) {
            netTrafficeCallback.onResultCallback(false);
        }
    }

    public final void b(final int i10) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.p.3
            @Override // java.lang.Runnable
            public final void run() {
                if (!p.this.c(i10)) {
                    p a10 = p.a(n.a().g());
                    com.anythink.core.c.a h10 = a3.l.h(a3.k.e());
                    if (a10.f5258c == 2 && h10.U() == 1 && h10.I() == 0) {
                        com.anythink.core.common.j.c.a(1, a10.f5258c, h10.U(), i10);
                    }
                    if (a10.f5258c == 1 && h10.S() == 0 && h10.U() == 0) {
                        com.anythink.core.common.j.c.a(2, a10.f5258c, h10.U(), i10);
                    }
                    p.this.f5259e.put(Integer.valueOf(i10), Boolean.TRUE);
                }
            }
        });
    }

    public final boolean c(int i10) {
        return this.f5259e.get(Integer.valueOf(i10)) != null && this.f5259e.get(Integer.valueOf(i10)).booleanValue();
    }
}
