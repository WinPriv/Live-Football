package com.anythink.core.common;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.bj;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6385a = "r";

    /* renamed from: b, reason: collision with root package name */
    private static volatile r f6386b;

    /* renamed from: c, reason: collision with root package name */
    private Context f6387c;

    private r(Context context) {
        this.f6387c = context.getApplicationContext();
    }

    public static r a(Context context) {
        if (f6386b == null) {
            synchronized (r.class) {
                if (f6386b == null) {
                    f6386b = new r(context);
                }
            }
        }
        return f6386b;
    }

    public final void a(final int i10, final com.anythink.core.common.e.f fVar, final com.anythink.core.c.a aVar) {
        try {
            com.anythink.core.common.b.n.a();
            com.anythink.core.common.b.n.b(new Runnable() { // from class: com.anythink.core.common.r.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        if (com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(fVar.f5605b.W()) == null) {
                            return;
                        }
                        String x10 = ((com.anythink.core.common.e.e) fVar.f5605b).x();
                        if (TextUtils.isEmpty(x10)) {
                            return;
                        }
                        int i11 = i10;
                        boolean z10 = false;
                        if (i11 != 4) {
                            if (i11 != 6) {
                                switch (i11) {
                                    case 18:
                                    case 19:
                                    case 20:
                                        if (((com.anythink.core.common.e.e) fVar.f5605b).b() == 1) {
                                            z10 = true;
                                        }
                                        str = aVar.M().get("dl");
                                        break;
                                    default:
                                        str = null;
                                        break;
                                }
                            } else {
                                if (((com.anythink.core.common.e.e) fVar.f5605b).u() == 1) {
                                    z10 = true;
                                }
                                str = aVar.M().get("click");
                            }
                        } else {
                            if (((com.anythink.core.common.e.e) fVar.f5605b).t() == 1) {
                                z10 = true;
                            }
                            str = aVar.M().get(bj.b.V);
                        }
                        String str2 = str;
                        if (z10 && !TextUtils.isEmpty(str2)) {
                            JSONObject a10 = com.anythink.core.common.k.m.a();
                            a10.toString();
                            fVar.a().toString();
                            r.a(r.this, i10, str2, a10.toString(), fVar.a().toString(), x10, (com.anythink.core.common.e.e) fVar.f5605b);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void a(final com.anythink.core.c.a aVar) {
        com.anythink.core.common.b.n.a();
        com.anythink.core.common.b.n.d(new Runnable() { // from class: com.anythink.core.common.r.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (r.this.f6387c == null) {
                        return;
                    }
                    String packageName = r.this.f6387c.getPackageName();
                    String str = "";
                    for (int i10 = 0; i10 < 2; i10++) {
                        str = str + packageName;
                    }
                    String c10 = com.anythink.core.common.k.f.c(str);
                    Intent intent = new Intent(c10);
                    intent.putExtra(c10, aVar.H());
                    intent.putExtra("data", com.anythink.core.common.k.m.a().toString());
                    intent.putExtra("denied", com.anythink.core.common.b.n.a().f());
                    intent.setPackage(packageName);
                    com.anythink.core.common.b.k.a(r.this.f6387c).a(intent);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void a(int i10, String str, String str2, String str3, String str4, com.anythink.core.common.e.e eVar) {
        if (this.f6387c == null) {
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.putExtra(com.anythink.core.common.g.c.Z, str2);
            intent.putExtra("data", str3);
            intent.putExtra("adsourceId", str4);
            intent.putExtra("networkType", String.valueOf(eVar.H()));
            intent.putExtra("format", eVar.Y());
            intent.putExtra("showid", eVar.l());
            intent.putExtra("tktype", i10);
            intent.setPackage(this.f6387c.getPackageName());
            com.anythink.core.common.b.k.a(this.f6387c).a(intent);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void a(r rVar, int i10, String str, String str2, String str3, String str4, com.anythink.core.common.e.e eVar) {
        if (rVar.f6387c != null) {
            try {
                Intent intent = new Intent(str);
                intent.putExtra(com.anythink.core.common.g.c.Z, str2);
                intent.putExtra("data", str3);
                intent.putExtra("adsourceId", str4);
                intent.putExtra("networkType", String.valueOf(eVar.H()));
                intent.putExtra("format", eVar.Y());
                intent.putExtra("showid", eVar.l());
                intent.putExtra("tktype", i10);
                intent.setPackage(rVar.f6387c.getPackageName());
                com.anythink.core.common.b.k.a(rVar.f6387c).a(intent);
            } catch (Throwable unused) {
            }
        }
    }
}
