package com.anythink.basead.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.y;

/* loaded from: classes.dex */
public final class g extends y {

    /* renamed from: a, reason: collision with root package name */
    String f3768a;

    /* renamed from: b, reason: collision with root package name */
    String f3769b;

    public g(com.anythink.core.common.e.i iVar, String str, String str2) {
        this.f3768a = str;
        this.f3769b = str2;
        this.f5760c = iVar;
    }

    @Override // com.anythink.core.common.e.y
    public final void a(Activity activity) {
        try {
            com.anythink.core.common.e.i iVar = this.f5760c;
            String aa2 = iVar instanceof aa ? ((aa) iVar).aa() : "";
            if (TextUtils.isEmpty(aa2)) {
                aa2 = this.f5760c.r();
            }
            final Context g6 = n.a().g();
            View inflate = LayoutInflater.from(activity).inflate(com.anythink.core.common.k.h.a(g6, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(com.anythink.core.common.k.h.a(g6, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) inflate.findViewById(com.anythink.core.common.k.h.a(g6, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) inflate.findViewById(com.anythink.core.common.k.h.a(g6, "myoffer_confirm_continue", "id"));
            textView.setText("立即打开\"" + aa2 + "\"?");
            textView2.setText("取 消");
            textView3.setText("确 定");
            final Dialog dialog = new Dialog(activity, com.anythink.core.common.k.h.a(g6, "style_full_screen_translucent_dialog", "style"));
            dialog.setContentView(inflate);
            dialog.setCancelable(false);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.c.g.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g gVar = g.this;
                    com.anythink.core.common.j.c.a(gVar.f3769b, ((y) gVar).f5760c.p(), g.this.f3768a, 7, (String) null, 0L, 0L);
                    try {
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.c.g.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        g gVar = g.this;
                        com.anythink.core.common.j.c.a(gVar.f3769b, ((y) gVar).f5760c.p(), g.this.f3768a, 8, (String) null, 0L, 0L);
                        if (com.anythink.basead.a.b.a(g6, ((y) g.this).f5760c)) {
                            g gVar2 = g.this;
                            com.anythink.core.common.j.c.a(gVar2.f3769b, ((y) gVar2).f5760c.p(), g.this.f3768a, 9, (String) null, 0L, 0L);
                        }
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            dialog.show();
        } catch (Throwable unused) {
        }
    }
}
