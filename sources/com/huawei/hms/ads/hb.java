package com.huawei.hms.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class hb {
    public static final String B = "com.iab.omid.library.huawei.adsession.media.InteractionType";
    public static final String C = "com.iab.omid.library.huawei.adsession.media.MediaEvents";
    public static final String Code = "1";
    public static final String D = "com.iab.omid.library.huawei.adsession.media.VastProperties";
    public static final String F = "com.iab.omid.library.huawei.adsession.media.Position";
    public static final String I = "com.iab.omid.library.huawei.adsession.media";
    public static final String L = "com.iab.omid.library.huawei.adsession.media.InteractionType";
    public static final String S = "com.iab.omid.library.huawei.adsession.media.PlayerState";
    public static final String V = "com.iab.omid.library.huawei.adsession";
    public static final String Z = "com.iab.omid.library.huawei.adsession.video";

    /* renamed from: a, reason: collision with root package name */
    public static final String f21696a = "com.iab.omid.library.huawei.adsession.media.MediaEvents";

    /* renamed from: b, reason: collision with root package name */
    public static final String f21697b = "com.iab.omid.library.huawei.adsession.media.PlayerState";

    /* renamed from: c, reason: collision with root package name */
    public static final String f21698c = "com.iab.omid.library.huawei.adsession.media.Position";

    /* renamed from: d, reason: collision with root package name */
    public static final String f21699d = "com.iab.omid.library.huawei.adsession.media.VastProperties";

    /* renamed from: e, reason: collision with root package name */
    public static final String f21700e = "com.iab.omid.library.huawei.adsession.AdEvents";
    public static final String f = "com.iab.omid.library.huawei.adsession.AdSession";

    /* renamed from: g, reason: collision with root package name */
    public static final String f21701g = "com.iab.omid.library.huawei.adsession.AdSessionConfiguration";

    /* renamed from: h, reason: collision with root package name */
    public static final String f21702h = "com.iab.omid.library.huawei.publisher.AdSessionStatePublisher";

    /* renamed from: i, reason: collision with root package name */
    public static final String f21703i = "com.iab.omid.library.huawei.adsession.AdSessionContext";

    /* renamed from: j, reason: collision with root package name */
    public static final String f21704j = "com.iab.omid.library.huawei.adsession.AdSessionContextType";

    /* renamed from: k, reason: collision with root package name */
    public static final String f21705k = "com.iab.omid.library.huawei.adsession.CreativeType";

    /* renamed from: l, reason: collision with root package name */
    public static final String f21706l = "com.iab.omid.library.huawei.adsession.ErrorType";

    /* renamed from: m, reason: collision with root package name */
    public static final String f21707m = "com.iab.omid.library.huawei.adsession.FriendlyObstructionPurpose";

    /* renamed from: n, reason: collision with root package name */
    public static final String f21708n = "com.iab.omid.library.huawei.adsession.ImpressionType";
    public static final String o = "com.iab.omid.library.huawei.adsession.Owner";

    /* renamed from: p, reason: collision with root package name */
    public static final String f21709p = "com.iab.omid.library.huawei.adsession.Partner";

    /* renamed from: q, reason: collision with root package name */
    public static final String f21710q = "com.iab.omid.library.huawei.adsession.VerificationScriptResource";

    /* renamed from: r, reason: collision with root package name */
    private static final String f21711r = "OMSDKCheckUtil";

    public static boolean Code(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean Code(Context context, List<String> list) {
        PackageManager packageManager = context.getPackageManager();
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                packageManager.getPackageInfo(it.next(), 1);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean Code(String str) {
        try {
            Class.forName(str);
            ex.V(f21711r, str);
            return true;
        } catch (ClassNotFoundException unused) {
            ex.V(f21711r, str + " is not avaliable");
            return false;
        }
    }

    public static boolean Code(List<String> list) {
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Class.forName(it.next());
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
