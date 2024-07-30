package b9;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.material.textfield.TextInputLayout;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import d0.a;
import m.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3153s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f3154t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3155u;

    public /* synthetic */ m(AppCompatActivity appCompatActivity, Object obj, int i10) {
        this.f3153s = i10;
        this.f3154t = appCompatActivity;
        this.f3155u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f3153s;
        Object obj = this.f3155u;
        AppCompatActivity appCompatActivity = this.f3154t;
        switch (i10) {
            case 0:
                EventDetailActivity eventDetailActivity = (EventDetailActivity) appCompatActivity;
                String str = (String) obj;
                int i11 = EventDetailActivity.B;
                eventDetailActivity.getClass();
                str.getClass();
                if (!str.equals("player")) {
                    if (str.equals("app")) {
                        androidx.appcompat.widget.g f = androidx.appcompat.widget.g.f(eventDetailActivity.getLayoutInflater());
                        Dialog dialog = new Dialog(eventDetailActivity);
                        dialog.setContentView((CardView) f.f1174b);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        dialog.getWindow().setLayout(-2, -2);
                        dialog.getWindow().setGravity(17);
                        dialog.show();
                        ((Button) f.f1175c).setOnClickListener(new v8.a(eventDetailActivity, dialog, 3));
                        return;
                    }
                    return;
                }
                int i12 = 1;
                try {
                    eventDetailActivity.getPackageManager().getPackageInfo(t8.l.f35592c.b(), 0);
                    z10 = true;
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    Intent launchIntentForPackage = eventDetailActivity.getPackageManager().getLaunchIntentForPackage(t8.l.f35592c.b());
                    launchIntentForPackage.putExtra("StreamLink", eventDetailActivity.f21483u);
                    launchIntentForPackage.addFlags(268435456);
                    eventDetailActivity.startActivity(launchIntentForPackage);
                    return;
                }
                q2.j a10 = q2.j.a(eventDetailActivity.getLayoutInflater());
                Dialog dialog2 = new Dialog(eventDetailActivity);
                dialog2.setContentView((CardView) a10.f34586s);
                dialog2.setCancelable(false);
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                dialog2.getWindow().setLayout(-1, -2);
                ((ImageView) a10.f34587t).setOnClickListener(new com.anythink.basead.ui.d(dialog2, 5));
                ((ImageView) a10.f34588u).setOnClickListener(new a(eventDetailActivity, dialog2, i12));
                dialog2.show();
                return;
            default:
                WatchActivity watchActivity = (WatchActivity) appCompatActivity;
                int i13 = WatchActivity.I;
                watchActivity.getClass();
                m.i a11 = ((i.b) obj).a();
                Uri parse = Uri.parse(watchActivity.y);
                Intent intent = a11.f32621a;
                intent.setPackage("com.android.chrome");
                intent.setData(parse);
                Object obj2 = d0.a.f27248a;
                a.C0353a.b(watchActivity, intent, null);
                ((TextView) watchActivity.B.f32987g).setVisibility(8);
                watchActivity.B.f32982a.setText("Please Enter Stream Code");
                ((TextInputLayout) watchActivity.B.f32986e).setVisibility(0);
                ((Button) watchActivity.B.f).setVisibility(0);
                return;
        }
    }
}
