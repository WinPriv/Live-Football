package b7;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.f;
import com.google.android.material.textfield.t;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3129s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3130t;

    public /* synthetic */ a(Object obj, int i10) {
        this.f3129s = i10;
        this.f3130t = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f3129s;
        Object obj = this.f3130t;
        switch (i10) {
            case 1:
                f fVar = (f) obj;
                EditText editText = fVar.f21159i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    fVar.q();
                    return;
                }
                return;
            case 2:
                t tVar = (t) obj;
                EditText editText2 = tVar.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = tVar.f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        tVar.f.setTransformationMethod(null);
                    } else {
                        tVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tVar.f.setSelection(selectionEnd);
                    }
                    tVar.q();
                    return;
                }
                return;
            case 3:
                int i11 = MatchDetails.I;
                ((MatchDetails) obj).onBackPressed();
                return;
            default:
                int i12 = EventDetailActivity.B;
                ((EventDetailActivity) obj).onBackPressed();
                return;
        }
    }
}
