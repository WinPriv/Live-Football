package com.huawei.openalliance.ad.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.s;
import com.huawei.openalliance.ad.constant.w;
import fa.e;
import gb.b0;
import gb.k;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class PPSECProvider extends ContentProvider {

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f23618s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final a f23619t = new a();

    /* loaded from: classes2.dex */
    public class a implements eb.a {
        public a() {
        }

        @Override // eb.a
        public final Bundle Code() {
            String a10;
            String Code;
            PPSECProvider pPSECProvider = PPSECProvider.this;
            Bundle bundle = new Bundle();
            try {
                a10 = k.a(pPSECProvider.getContext());
                ex.V("PPSATProvider", "callingPackage " + a10);
            } catch (Throwable th) {
                bundle.putInt("errcode", 5);
                ex.I("PPSATProvider", "getAccessToken exception: ".concat(th.getClass().getSimpleName()));
            }
            if (TextUtils.isEmpty(a10)) {
                bundle.putInt("errcode", 2);
                return bundle;
            }
            if (!b0.e((List) b0.f28550a.get(a10), b0.a(pPSECProvider.getContext(), a10))) {
                bundle.putInt("errcode", 3);
                return bundle;
            }
            s sVar = e.a().f28223a;
            if (sVar == null) {
                ex.V("AdATManager", "accessTokenProvider is null, return");
                Code = null;
            } else {
                Code = sVar.Code();
            }
            if (TextUtils.isEmpty(Code)) {
                ex.I("PPSATProvider", "at is null.");
                bundle.putInt("errcode", 4);
                return bundle;
            }
            bundle.putString(w.cQ, Code);
            bundle.putInt("errcode", 0);
            return bundle;
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        ex.V("PPSATProvider", "call method: " + str);
        eb.a aVar = (eb.a) this.f23618s.get(str);
        if (aVar != null) {
            return aVar.Code();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("errcode", 1);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.f23618s.put("getAccessToken", this.f23619t);
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
