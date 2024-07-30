package com.anythink.basead.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            String stringExtra = intent.getStringExtra("receiver_extra_offer_id");
            String stringExtra2 = intent.getStringExtra("receiver_extra_click_id");
            char c10 = 65535;
            switch (action.hashCode()) {
                case -1301069232:
                    if (action.equals("action_offer_download_end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -478940009:
                    if (action.equals("action_offer_download_start")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 468136042:
                    if (action.equals("action_offer_install_successful")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1256250514:
                    if (action.equals("action_offer_install_start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    h.a(context.getApplicationContext()).b(stringExtra, stringExtra2);
                    return;
                case 1:
                    h.a(context.getApplicationContext()).a(stringExtra, stringExtra2);
                    return;
                case 2:
                    h.a(context.getApplicationContext()).d(stringExtra, stringExtra2);
                    return;
                case 3:
                    h.a(context.getApplicationContext()).c(stringExtra, stringExtra2);
                    return;
                default:
                    return;
            }
        }
    }
}
