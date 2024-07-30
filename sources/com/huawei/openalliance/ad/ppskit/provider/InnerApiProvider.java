package com.huawei.openalliance.ad.ppskit.provider;

import a3.k;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.provider.a;
import com.huawei.openalliance.ad.ppskit.utils.d0;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import ka.b2;
import ka.n7;
import ka.x;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class InnerApiProvider extends BaseContentProvider {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f22792v = {"code", "content"};

    /* renamed from: u, reason: collision with root package name */
    public final UriMatcher f22793u = new UriMatcher(-1);

    public static String b(Context context) {
        if (d0.m(context)) {
            return "com.huawei.hwid.pps.apiprovider";
        }
        return context.getPackageName() + ".pps.innerapiprovider";
    }

    public final MatrixCursor a(String str, String[] strArr) {
        String str2;
        StringBuilder sb2;
        String sb3;
        if (strArr != null && strArr.length > 0) {
            String str3 = strArr[0];
            if (strArr.length > 1) {
                str2 = strArr[1];
            } else {
                str2 = "";
            }
            b2 b10 = x.a().b(str3);
            int i10 = -1;
            if (b10 != null) {
                try {
                    n7.e("InnerApiProvider", "call api: " + str3);
                    JSONObject jSONObject = new JSONObject(str2);
                    sb3 = b10.a(getContext(), str, jSONObject.optString("sdk_version"), jSONObject.optString("content"));
                    i10 = 200;
                } catch (RuntimeException e10) {
                    e = e10;
                    n7.g("InnerApiProvider", "call method RuntimeException: ".concat(e.getClass().getSimpleName()));
                    sb2 = new StringBuilder("call ");
                    sb2.append(str3);
                    sb2.append(" ");
                    sb2.append(e.getClass().getSimpleName());
                    sb2.append(w.bE);
                    sb2.append(e.getMessage());
                    sb3 = sb2.toString();
                    MatrixCursor matrixCursor = new MatrixCursor(f22792v);
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i10), sb3});
                    return matrixCursor;
                } catch (Throwable th) {
                    e = th;
                    n7.g("InnerApiProvider", "call method : ".concat(e.getClass().getSimpleName()));
                    sb2 = new StringBuilder("call ");
                    sb2.append(str3);
                    sb2.append(" ");
                    sb2.append(e.getClass().getSimpleName());
                    sb2.append(w.bE);
                    sb2.append(e.getMessage());
                    sb3 = sb2.toString();
                    MatrixCursor matrixCursor2 = new MatrixCursor(f22792v);
                    matrixCursor2.addRow(new Object[]{Integer.valueOf(i10), sb3});
                    return matrixCursor2;
                }
            } else {
                sb3 = k.l("api for ", str3, " is not found");
            }
            MatrixCursor matrixCursor22 = new MatrixCursor(f22792v);
            matrixCursor22.addRow(new Object[]{Integer.valueOf(i10), sb3});
            return matrixCursor22;
        }
        n7.g("InnerApiProvider", "callApiCmd - empty args");
        return null;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f22791t = providerInfo.authority;
        p2.a(new ya.a(this), 0);
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
        String simpleName;
        String str;
        try {
            this.f22793u.addURI(b(getContext()), "/pps/api/call", 100);
            return true;
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str = "onCreate ";
            n7.g("InnerApiProvider", str.concat(simpleName));
            return true;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str = "onCreate ex: ";
            n7.g("InnerApiProvider", str.concat(simpleName));
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (this.f22790s == null) {
            this.f22790s = a.b.c(getContext(), this.f22791t);
        }
        a aVar = this.f22790s;
        if (aVar == null) {
            return null;
        }
        return ParcelFileDescriptor.open(aVar.a(uri), 268435456);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String simpleName;
        String str3;
        try {
            String J = z1.J(getContext());
            int match = this.f22793u.match(uri);
            n7.c("InnerApiProvider", "QUERY code: %s caller: ", Integer.valueOf(match), J);
            if (match == 100) {
                return a(J, strArr2);
            }
            return null;
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str3 = "query ";
            n7.g("InnerApiProvider", str3.concat(simpleName));
            return null;
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str3 = "query ex: ";
            n7.g("InnerApiProvider", str3.concat(simpleName));
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
