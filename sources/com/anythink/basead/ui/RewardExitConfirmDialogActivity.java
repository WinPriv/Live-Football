package com.anythink.basead.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class RewardExitConfirmDialogActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static Runnable f4407a;

    /* renamed from: b, reason: collision with root package name */
    private static String f4408b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f4409c;

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (RewardExitConfirmDialogActivity.f4407a != null) {
                RewardExitConfirmDialogActivity.f4407a.run();
            }
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    private void b() {
        try {
            View inflate = LayoutInflater.from(this).inflate(h.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_continue", "id"));
            textView.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_msg", i.f10128g), f4408b));
            textView2.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_give_up", i.f10128g)));
            textView3.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_continue", i.f10128g)));
            textView2.setOnClickListener(new AnonymousClass1());
            textView3.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, h.a(this, "style_full_screen_translucent_dialog", "style"));
            this.f4409c = dialog;
            dialog.setContentView(inflate);
            this.f4409c.setCancelable(false);
            this.f4409c.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            View inflate = LayoutInflater.from(this).inflate(h.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) inflate.findViewById(h.a(this, "myoffer_confirm_continue", "id"));
            textView.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_msg", i.f10128g), f4408b));
            textView2.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_give_up", i.f10128g)));
            textView3.setText(getResources().getString(h.a(this, "myoffer_reward_exit_confirm_continue", i.f10128g)));
            textView2.setOnClickListener(new AnonymousClass1());
            textView3.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, h.a(this, "style_full_screen_translucent_dialog", "style"));
            this.f4409c = dialog;
            dialog.setContentView(inflate);
            this.f4409c.setCancelable(false);
            this.f4409c.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.f4409c;
        if (dialog != null) {
            dialog.dismiss();
            this.f4409c = null;
        }
        f4407a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (4 == i10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public static void a(Context context, String str, Runnable runnable) {
        f4408b = str;
        f4407a = runnable;
        Intent intent = new Intent(context, (Class<?>) RewardExitConfirmDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
