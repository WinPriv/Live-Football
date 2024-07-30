package ra;

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
import androidx.transition.n;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.v;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import ka.cf;
import ka.n7;

/* loaded from: classes2.dex */
public final class k {

    /* loaded from: classes2.dex */
    public static class a implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ b f34980s;

        public a(b bVar) {
            this.f34980s = bVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppDownloadButton appDownloadButton = AppDownloadButton.this;
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.r();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public static void a(Context context, AppInfo appInfo, AppDownloadButton.f fVar) {
        Window window;
        int i10;
        n7.e("AppPermissionsDialog", "show, context:" + context);
        if (n.M(appInfo.getPermissions())) {
            n7.e("AppPermissionsDialog", "permissions is empty");
            AlertDialog.Builder a10 = v.a(context);
            a10.setView(LayoutInflater.from(context).inflate(R.layout.hiad_loading_dialog_content, (ViewGroup) null));
            AlertDialog create = a10.create();
            if (!(context instanceof Activity) && (window = create.getWindow()) != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    i10 = 2038;
                } else {
                    i10 = 2003;
                }
                window.setType(i10);
            }
            create.show();
            new cf(context, new j(create, context, appInfo, fVar)).a(appInfo);
            return;
        }
        b(context, appInfo, fVar);
    }

    public static void b(Context context, AppInfo appInfo, b bVar) {
        int i10;
        Window window;
        int i11;
        AlertDialog.Builder a10 = v.a(context);
        a10.setTitle("");
        if (bVar != null) {
            a10.setPositiveButton(R.string.hiad_dialog_accept, new a(bVar));
            i10 = R.string.hiad_dialog_cancel;
        } else {
            i10 = R.string.hiad_dialog_close;
        }
        a10.setNeutralButton(i10, (DialogInterface.OnClickListener) null);
        View inflate = LayoutInflater.from(context).inflate(R.layout.hiad_adscore_permission_dialog_cotent, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.hiad_permissions_dialog_content_title_tv)).setText(context.getResources().getString(R.string.hiad_permission_dialog_title, appInfo.getAppName()));
        ((ListView) inflate.findViewById(R.id.hiad_permissions_dialog_content_lv)).setAdapter((ListAdapter) new h(context, appInfo.getPermissions()));
        a10.setView(inflate);
        AlertDialog create = a10.create();
        n7.c("AppPermissionsDialog", "show, time:%s", Long.valueOf(System.currentTimeMillis()));
        if (!(context instanceof Activity) && (window = create.getWindow()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                i11 = 2038;
            } else {
                i11 = 2003;
            }
            window.setType(i11);
        }
        create.show();
    }
}
