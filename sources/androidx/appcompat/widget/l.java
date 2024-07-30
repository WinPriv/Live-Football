package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import n0.c;

/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes.dex */
public final class l {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c.b c0443c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0443c = new c.a(clipData, 3);
            } else {
                c0443c = new c.C0443c(clipData, 3);
            }
            n0.c0.h(textView, c0443c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c.b c0443c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0443c = new c.a(clipData, 3);
        } else {
            c0443c = new c.C0443c(clipData, 3);
        }
        n0.c0.h(view, c0443c.build());
        return true;
    }
}
