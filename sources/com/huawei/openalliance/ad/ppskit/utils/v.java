package com.huawei.openalliance.ad.ppskit.utils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.Window;
import ka.Cif;

/* loaded from: classes2.dex */
public abstract class v {

    /* loaded from: classes2.dex */
    public static class a implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final d f23043s;

        public a(d dVar) {
            this.f23043s = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            d dVar = this.f23043s;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements DialogInterface.OnCancelListener {

        /* renamed from: s, reason: collision with root package name */
        public final d f23044s;

        public b(d dVar) {
            this.f23044s = dVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            d dVar = this.f23044s;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final d f23045s;

        public c(d dVar) {
            this.f23045s = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            d dVar = this.f23045s;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void b();
    }

    public static AlertDialog.Builder a(Context context) {
        if (!Cif.d(context)) {
            if (d0.r(context)) {
                return new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Dialog.Alert);
            }
            return new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Light.Dialog.Alert);
        }
        return new AlertDialog.Builder(context);
    }

    public static AlertDialog b(Context context, String str, String str2, String str3, String str4, d dVar) {
        Window window;
        int i10;
        AlertDialog.Builder a10 = a(context);
        if (str2 != null) {
            a10.setMessage(str2);
        }
        if (str != null) {
            a10.setTitle(str);
        }
        a10.setPositiveButton(str3, new a(dVar));
        a10.setNegativeButton(str4, new c(dVar));
        AlertDialog create = a10.create();
        create.setOnCancelListener(new b(dVar));
        if (!(context instanceof Activity) && (window = create.getWindow()) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                i10 = 2038;
            } else {
                i10 = 2003;
            }
            window.setType(i10);
        }
        create.show();
        return create;
    }
}
