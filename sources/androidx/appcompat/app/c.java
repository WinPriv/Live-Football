package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AlertController f644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f645t;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f645t = bVar;
        this.f644s = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.b bVar = this.f645t;
        DialogInterface.OnClickListener onClickListener = bVar.f582m;
        AlertController alertController = this.f644s;
        onClickListener.onClick(alertController.f546b, i10);
        if (!bVar.o) {
            alertController.f546b.dismiss();
        }
    }
}
