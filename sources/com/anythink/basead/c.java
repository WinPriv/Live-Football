package com.anythink.basead;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public i f3701a;

    /* renamed from: b, reason: collision with root package name */
    public j f3702b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3703c;

    /* renamed from: d, reason: collision with root package name */
    private Dialog f3704d;

    /* renamed from: e, reason: collision with root package name */
    private View f3705e;
    private EditText f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f3706g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f3707h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f3708i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f3709j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f3710k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f3711l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f3712m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f3713n;
    private TextView o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f3714p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f3715q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3716r;

    /* renamed from: s, reason: collision with root package name */
    private a f3717s;

    /* renamed from: t, reason: collision with root package name */
    private View.OnClickListener f3718t = new View.OnClickListener() { // from class: com.anythink.basead.c.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof TextView) {
                c cVar = c.this;
                com.anythink.core.common.j.c.a(cVar.f3701a, cVar.f3702b, ((TextView) view).getTag().toString(), "");
                c.b(c.this);
                if (c.this.f3717s != null) {
                    c.this.f3717s.a();
                }
            }
        }
    };

    /* renamed from: com.anythink.basead.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements DialogInterface.OnCancelListener {
        public AnonymousClass1() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (c.this.f3717s != null) {
                c.this.f3717s.b();
            }
        }
    }

    /* renamed from: com.anythink.basead.c$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.b(c.this);
        }
    }

    /* renamed from: com.anythink.basead.c$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (c.this.f != null) {
                String obj = c.this.f.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    if (!c.this.f3716r) {
                        c.this.f3716r = true;
                        c.this.f.setCursorVisible(false);
                        c.this.f.setHint(h.a(c.this.f3703c, "myoffer_feedback_hint", com.anythink.expressad.foundation.h.i.f10128g));
                        c.this.f.setHintTextColor(Color.parseColor("#999999"));
                        c.this.f.postDelayed(new Runnable() { // from class: com.anythink.basead.c.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.this.f3716r = false;
                                c.this.f.setCursorVisible(true);
                                c.this.f.setHint("");
                            }
                        }, 1500L);
                        return;
                    }
                    return;
                }
                c cVar = c.this;
                com.anythink.core.common.j.c.a(cVar.f3701a, cVar.f3702b, "0", obj);
                c.b(c.this);
                if (c.this.f3717s != null) {
                    c.this.f3717s.a();
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.c$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f3704d != null) {
                c.this.f3704d.dismiss();
            }
            if (c.this.f3717s != null) {
                c.this.f3717s.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public final void b() {
        this.f3703c = null;
        this.f3701a = null;
        this.f3702b = null;
        this.f3717s = null;
    }

    private void c() {
        this.f3706g = (ImageView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_iv_close", "id"));
        this.f = (EditText) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_et", "id"));
        this.f3707h = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_commit", "id"));
        this.f3708i = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_1", "id"));
        this.f3709j = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_2", "id"));
        this.f3710k = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_3", "id"));
        this.f3711l = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_4", "id"));
        this.f3712m = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_5", "id"));
        this.f3713n = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_6", "id"));
        this.o = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_7", "id"));
        this.f3714p = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_8", "id"));
        this.f3715q = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_9", "id"));
        this.f3706g.setOnClickListener(new AnonymousClass2());
        this.f3708i.setOnClickListener(this.f3718t);
        this.f3709j.setOnClickListener(this.f3718t);
        this.f3710k.setOnClickListener(this.f3718t);
        this.f3711l.setOnClickListener(this.f3718t);
        this.f3712m.setOnClickListener(this.f3718t);
        this.f3713n.setOnClickListener(this.f3718t);
        this.o.setOnClickListener(this.f3718t);
        this.f3714p.setOnClickListener(this.f3718t);
        this.f3715q.setOnClickListener(this.f3718t);
        this.f3707h.setOnClickListener(new AnonymousClass3());
    }

    private void d() {
        this.f3706g.setOnClickListener(new AnonymousClass2());
        this.f3708i.setOnClickListener(this.f3718t);
        this.f3709j.setOnClickListener(this.f3718t);
        this.f3710k.setOnClickListener(this.f3718t);
        this.f3711l.setOnClickListener(this.f3718t);
        this.f3712m.setOnClickListener(this.f3718t);
        this.f3713n.setOnClickListener(this.f3718t);
        this.o.setOnClickListener(this.f3718t);
        this.f3714p.setOnClickListener(this.f3718t);
        this.f3715q.setOnClickListener(this.f3718t);
        this.f3707h.setOnClickListener(new AnonymousClass3());
    }

    private void e() {
        new Handler().postDelayed(new AnonymousClass4(), 30L);
    }

    public final void a(Context context, i iVar, j jVar, a aVar) {
        try {
            this.f3703c = context;
            this.f3701a = iVar;
            this.f3702b = jVar;
            this.f3717s = aVar;
            int i10 = context.getResources().getDisplayMetrics().widthPixels;
            int i11 = context.getResources().getDisplayMetrics().heightPixels;
            if (i10 > i11) {
                this.f3705e = LayoutInflater.from(context).inflate(h.a(context, "myoffer_feedback_land", "layout"), (ViewGroup) null, false);
            } else {
                this.f3705e = LayoutInflater.from(context).inflate(h.a(context, "myoffer_feedback", "layout"), (ViewGroup) null, false);
            }
            this.f3706g = (ImageView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_iv_close", "id"));
            this.f = (EditText) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_et", "id"));
            this.f3707h = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_commit", "id"));
            this.f3708i = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_1", "id"));
            this.f3709j = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_2", "id"));
            this.f3710k = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_3", "id"));
            this.f3711l = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_4", "id"));
            this.f3712m = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_5", "id"));
            this.f3713n = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_6", "id"));
            this.o = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_7", "id"));
            this.f3714p = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_8", "id"));
            this.f3715q = (TextView) this.f3705e.findViewById(h.a(this.f3703c, "myoffer_feedback_tv_9", "id"));
            this.f3706g.setOnClickListener(new AnonymousClass2());
            this.f3708i.setOnClickListener(this.f3718t);
            this.f3709j.setOnClickListener(this.f3718t);
            this.f3710k.setOnClickListener(this.f3718t);
            this.f3711l.setOnClickListener(this.f3718t);
            this.f3712m.setOnClickListener(this.f3718t);
            this.f3713n.setOnClickListener(this.f3718t);
            this.o.setOnClickListener(this.f3718t);
            this.f3714p.setOnClickListener(this.f3718t);
            this.f3715q.setOnClickListener(this.f3718t);
            this.f3707h.setOnClickListener(new AnonymousClass3());
            Context context2 = this.f3703c;
            Dialog dialog = new Dialog(context2, h.a(context2, "myoffer_feedback_dialog", "style"));
            this.f3704d = dialog;
            dialog.setContentView(this.f3705e);
            this.f3704d.setCancelable(true);
            this.f3704d.setOnCancelListener(new AnonymousClass1());
            Window window = this.f3704d.getWindow();
            if (window != null) {
                if (i10 > i11) {
                    window.setLayout(h.a(this.f3703c, 280.0f), h.a(this.f3703c, 320.0f));
                } else {
                    window.setLayout(h.a(this.f3703c, 300.0f), h.a(this.f3703c, 426.0f));
                }
            }
            this.f3704d.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void b(c cVar) {
        new Handler().postDelayed(new AnonymousClass4(), 30L);
    }

    private void a(int i10, int i11) {
        Context context = this.f3703c;
        Dialog dialog = new Dialog(context, h.a(context, "myoffer_feedback_dialog", "style"));
        this.f3704d = dialog;
        dialog.setContentView(this.f3705e);
        this.f3704d.setCancelable(true);
        this.f3704d.setOnCancelListener(new AnonymousClass1());
        Window window = this.f3704d.getWindow();
        if (window != null) {
            if (i10 > i11) {
                window.setLayout(h.a(this.f3703c, 280.0f), h.a(this.f3703c, 320.0f));
            } else {
                window.setLayout(h.a(this.f3703c, 300.0f), h.a(this.f3703c, 426.0f));
            }
        }
        this.f3704d.show();
    }

    public final boolean a() {
        Dialog dialog = this.f3704d;
        return dialog != null && dialog.isShowing();
    }
}
