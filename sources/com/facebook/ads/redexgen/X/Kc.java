package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class Kc {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, @Nullable Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(context).setTitle(ID.A0W(context)).setMessage(ID.A0U(context)).setPositiveButton(ID.A0V(context), new DialogInterfaceOnClickListenerC1004Kb(onClickListener)).setNegativeButton(ID.A0T(context), new DialogInterfaceOnClickListenerC1003Ka(onClickListener2));
            builder.show();
        }
    }
}
