package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class uf implements tf {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31960a;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31961s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f31962t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31963u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f31964v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f31965w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Content f31966x;

        public a(String str, String str2, String str3, int i10, int i11, Content content) {
            this.f31961s = str;
            this.f31962t = str2;
            this.f31963u = str3;
            this.f31964v = i10;
            this.f31965w = i11;
            this.f31966x = content;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            int i10;
            String str2 = this.f31961s;
            String str3 = this.f31962t;
            String str4 = this.f31963u;
            int i11 = this.f31964v;
            uf ufVar = uf.this;
            ufVar.getClass();
            Content content = this.f31966x;
            MetaData n02 = content.n0();
            if (n02 != null) {
                ContentRecord c10 = bf.c(str2, str3, str4, content, i11, null);
                if (c10 == null) {
                    n7.e("PreCheckFilter", "contentRecord is null");
                    return;
                }
                c10.Z2(this.f31965w);
                Context context = ufVar.f31960a;
                String str5 = null;
                ke keVar = new ke(context, zh.a(i11, context), null);
                keVar.f31382b = c10;
                String g02 = n02.g0();
                ApkInfo k02 = n02.k0();
                if (k02 != null) {
                    str = com.huawei.openalliance.ad.ppskit.utils.i2.e(context, k02.x());
                } else {
                    str = "";
                }
                int i12 = 2;
                int i13 = 1;
                if (!TextUtils.isEmpty(g02)) {
                    int b10 = ufVar.b(n02);
                    ApkInfo k03 = n02.k0();
                    if (k03 != null) {
                        str5 = k03.x();
                    }
                    if (com.huawei.openalliance.ad.ppskit.utils.o2.a(context, g02, str5) == null) {
                        if (b10 != 1) {
                            if (b10 != 2) {
                                i12 = 7;
                            }
                        } else {
                            i12 = 3;
                        }
                        keVar.d(i12, str);
                        return;
                    }
                    if (b10 != 1) {
                        if (b10 != 2) {
                            i10 = 8;
                        } else {
                            i10 = 5;
                        }
                    } else {
                        i10 = 4;
                    }
                    keVar.d(i10, str);
                    return;
                }
                int b11 = ufVar.b(n02);
                if (b11 != 1) {
                    if (b11 != 2) {
                        i13 = 9;
                    } else {
                        i13 = 6;
                    }
                }
                keVar.d(i13, str);
            }
        }
    }

    public uf(Context context) {
        this.f31960a = context.getApplicationContext();
    }

    @Override // ka.tf
    public final boolean a(String str, String str2, String str3, int i10, int i11, Content content) {
        if (n7.d()) {
            n7.c("PreCheckFilter", "filterContents adType: %d contentid: %s", Integer.valueOf(i10), content.p0());
        }
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(str, str2, str3, i10, i11, content), 2);
        return false;
    }

    public final int b(MetaData metaData) {
        ApkInfo k02 = metaData.k0();
        if (k02 == null || TextUtils.isEmpty(k02.x())) {
            return 3;
        }
        String x10 = k02.x();
        Context context = this.f31960a;
        boolean c10 = com.huawei.openalliance.ad.ppskit.utils.o2.c(context, x10);
        if (!TextUtils.isEmpty(k02.i())) {
            String i10 = k02.i();
            ArrayList B = com.huawei.openalliance.ad.ppskit.utils.i2.B(context);
            boolean contains = B.contains(i10);
            if (c10) {
                if (!contains) {
                    B.add(i10);
                    com.huawei.openalliance.ad.ppskit.utils.i2.f(context, B);
                    n7.c("PreCheckFilter", "add app to insApp file ,PkgNameEncoded: %s", i10);
                }
            } else if (contains) {
                B.remove(i10);
                com.huawei.openalliance.ad.ppskit.utils.i2.f(context, B);
                n7.c("PreCheckFilter", "remove app to insApp file ,PkgNameEncoded: %s", i10);
            }
        }
        return c10 ? 1 : 2;
    }

    @Override // ka.tf
    public final int b() {
        return 3;
    }
}
