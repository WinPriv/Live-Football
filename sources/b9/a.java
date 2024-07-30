package b9;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3131s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f3132t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3133u;

    public /* synthetic */ a(AppCompatActivity appCompatActivity, Object obj, int i10) {
        this.f3131s = i10;
        this.f3132t = appCompatActivity;
        this.f3133u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f3131s;
        Object obj = this.f3133u;
        AppCompatActivity appCompatActivity = this.f3132t;
        switch (i10) {
            case 0:
                final ChannelDetailActivity channelDetailActivity = (ChannelDetailActivity) appCompatActivity;
                String str = (String) obj;
                int i11 = ChannelDetailActivity.B;
                channelDetailActivity.getClass();
                str.getClass();
                if (!str.equals("player")) {
                    if (str.equals("app")) {
                        androidx.appcompat.widget.g f = androidx.appcompat.widget.g.f(channelDetailActivity.getLayoutInflater());
                        Dialog dialog = new Dialog(channelDetailActivity);
                        dialog.setContentView((CardView) f.f1174b);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        dialog.getWindow().setLayout(-2, -2);
                        dialog.getWindow().setGravity(17);
                        dialog.show();
                        ((Button) f.f1175c).setOnClickListener(new v8.a(channelDetailActivity, dialog, 2));
                        return;
                    }
                    return;
                }
                try {
                    channelDetailActivity.getPackageManager().getPackageInfo(t8.l.f35592c.b(), 0);
                    z10 = true;
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    try {
                        Intent launchIntentForPackage = channelDetailActivity.getPackageManager().getLaunchIntentForPackage(t8.l.f35592c.b());
                        launchIntentForPackage.putExtra("StreamLink", channelDetailActivity.f21472u);
                        launchIntentForPackage.addFlags(268435456);
                        channelDetailActivity.startActivity(launchIntentForPackage);
                        return;
                    } catch (Exception e10) {
                        Log.e("Error", e10.getMessage());
                        return;
                    }
                }
                q2.j a10 = q2.j.a(channelDetailActivity.getLayoutInflater());
                final Dialog dialog2 = new Dialog(channelDetailActivity);
                dialog2.setContentView((CardView) a10.f34586s);
                dialog2.setCancelable(false);
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                dialog2.getWindow().setLayout(-1, -2);
                ((ImageView) a10.f34587t).setOnClickListener(new x8.b(dialog2, 3));
                ((ImageView) a10.f34588u).setOnClickListener(new View.OnClickListener() { // from class: b9.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i12 = ChannelDetailActivity.B;
                        ChannelDetailActivity channelDetailActivity2 = ChannelDetailActivity.this;
                        channelDetailActivity2.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + t8.l.f35592c.b()));
                        channelDetailActivity2.startActivity(intent);
                        dialog2.dismiss();
                    }
                });
                dialog2.show();
                return;
            default:
                EventDetailActivity eventDetailActivity = (EventDetailActivity) appCompatActivity;
                int i12 = EventDetailActivity.B;
                eventDetailActivity.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + t8.l.f35592c.b()));
                eventDetailActivity.startActivity(intent);
                ((Dialog) obj).dismiss();
                return;
        }
    }
}
