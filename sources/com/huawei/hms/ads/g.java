package com.huawei.hms.ads;

import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import com.huawei.hms.ads.dynamic.DynamicModule;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private static String B = null;
    private static d C = null;
    private static final String Code = "RemoteSdkInitializer";
    private static volatile Context I = null;
    private static final List<String> S;
    private static final String V = "adsuiengine";
    private static IRemoteCreator Z;

    static {
        ArrayList arrayList = new ArrayList();
        S = arrayList;
        arrayList.add(com.huawei.openalliance.ad.constant.w.cp);
    }

    public static synchronized IRemoteCreator Code(Context context) {
        Context V2;
        fa.h hVar;
        synchronized (g.class) {
            ex.V(Code, "newCreator: ");
            if (Z != null) {
                ex.V(Code, "newCreator: mRemoteCreator != null return");
                return Z;
            }
            try {
                V2 = V(context);
            } catch (Throwable th) {
                ex.Z(Code, "newCreator failed " + th.getLocalizedMessage());
            }
            if (V2 == null) {
                Log.i(Code, "newCreator: remoteContext= null");
                return null;
            }
            IRemoteCreator Code2 = IRemoteCreator.b.Code((IBinder) V2.getClassLoader().loadClass("com.huawei.hms.ads.uiengine.remote.RemoteCreator").newInstance());
            Z = Code2;
            B = Code2.getVersion();
            IRemoteCreator iRemoteCreator = Z;
            synchronized (fa.h.f28235c) {
                if (fa.h.f28236d == null) {
                    fa.h.f28236d = new fa.h(context);
                }
                hVar = fa.h.f28236d;
            }
            iRemoteCreator.setGlobalUtil(hVar);
            C = Z.getUiEngineUtil();
            Log.i(Code, "newRemoteContext: mRemoteCreator :" + Z);
            return Z;
        }
    }

    private static Integer I(Context context) {
        int i10;
        if (S.contains(context.getPackageName())) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return Integer.valueOf(i10);
    }

    private static Context V(Context context) {
        ex.V(Code, "newRemoteContext: ");
        if (I != null) {
            return I;
        }
        try {
            I = DynamicModule.load(context, I(context), V).getModuleContext();
        } catch (Throwable th) {
            ex.Z(Code, "newRemoteContext failed: " + th.getLocalizedMessage());
        }
        return I;
    }

    public static d V() {
        return C;
    }

    public static synchronized String Code() {
        String str;
        synchronized (g.class) {
            str = B;
        }
        return str;
    }
}
