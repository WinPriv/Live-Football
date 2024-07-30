package da;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import gb.l0;

/* loaded from: classes2.dex */
public final class m {

    /* loaded from: classes2.dex */
    public interface a {
    }

    public static void a(Context context, AppInfo appInfo, AppDownloadButton.j jVar) {
        int i10;
        Window window;
        int i11;
        ex.V("AppPermissionsDialog", "show, context:" + context);
        AlertDialog.Builder a10 = l0.a(context);
        a10.setTitle("");
        if (jVar != null) {
            a10.setPositiveButton(R.string.hiad_dialog_accept, new l(jVar));
            i10 = R.string.hiad_dialog_cancel;
        } else {
            i10 = R.string.hiad_dialog_close;
        }
        a10.setNeutralButton(i10, (DialogInterface.OnClickListener) null);
        View inflate = LayoutInflater.from(context).inflate(R.layout.hiad_permission_dialog_cotent, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.hiad_permissions_dialog_content_title_tv)).setText(context.getResources().getString(R.string.hiad_permission_dialog_title, appInfo.L()));
        ((ListView) inflate.findViewById(R.id.hiad_permissions_dialog_content_lv)).setAdapter((ListAdapter) new k(context, appInfo.H()));
        a10.setView(inflate);
        AlertDialog create = a10.create();
        if (!(context instanceof Activity) && (window = create.getWindow()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                i11 = 2038;
            } else {
                i11 = 2003;
            }
            window.setType(i11);
        }
        ex.Code("AppPermissionsDialog", "show, time:%s", Long.valueOf(System.currentTimeMillis()));
        create.show();
    }
}
