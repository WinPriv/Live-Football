package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.hamkho.livefoot.R;
import java.util.Arrays;

/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
/* loaded from: classes2.dex */
public final class d {

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    /* loaded from: classes2.dex */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f26717s;

        public b(a aVar) {
            this.f26717s = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            this.f26717s.a();
        }
    }

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    /* loaded from: classes2.dex */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f26718s;

        public c(a aVar) {
            this.f26718s = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            this.f26718s.b();
        }
    }

    public static void a(Activity activity, String str, String str2, a aVar) {
        String string = activity.getString(R.string.permission_not_available_title);
        zc.d.c(string, "activity.getString(R.str…sion_not_available_title)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        zc.d.c(format, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(R.string.permission_not_available_message);
        zc.d.c(string2, "activity.getString(R.str…on_not_available_message)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        zc.d.c(format2, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(R.string.permission_not_available_open_settings_option, new b(aVar)).setNegativeButton(android.R.string.no, new c(aVar)).show();
    }
}
