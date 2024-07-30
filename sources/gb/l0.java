package gb;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.huawei.hms.ads.cl;

/* loaded from: classes2.dex */
public abstract class l0 {

    /* loaded from: classes2.dex */
    public interface a {
        void Code();

        void V();
    }

    public static AlertDialog.Builder a(Context context) {
        if (!cl.V(context)) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = false;
            if (context != null && i10 >= 29) {
                Object systemService = context.getSystemService("uimode");
                if ((systemService instanceof UiModeManager) && ((UiModeManager) systemService).getNightMode() == 2) {
                    z10 = true;
                }
            }
            if (z10) {
                return new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Dialog.Alert);
            }
            return new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Light.Dialog.Alert);
        }
        return new AlertDialog.Builder(context);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, a aVar) {
        Window window;
        int i10;
        AlertDialog.Builder a10 = a(context);
        if (str2 != null) {
            a10.setMessage(str2);
        }
        if (str != null) {
            a10.setTitle(str);
        }
        a10.setPositiveButton(str3, new i0(aVar));
        a10.setNegativeButton(str4, new j0(aVar));
        AlertDialog create = a10.create();
        create.setOnCancelListener(new k0(aVar));
        if (!(context instanceof Activity) && (window = create.getWindow()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                i10 = 2038;
            } else {
                i10 = 2003;
            }
            window.setType(i10);
        }
        create.show();
    }
}
