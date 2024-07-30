package ka;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.hamkho.livefoot.R;

/* loaded from: classes2.dex */
public class ui extends AlertDialog {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f31985s;

    public ui(Context context) {
        super(context);
        this.f31985s = true;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(R.color.hiad_0_percent_black);
        setCancelable(false);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!isShowing() && this.f31985s) {
            super.show();
        }
    }
}
