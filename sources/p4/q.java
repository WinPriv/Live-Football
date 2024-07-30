package p4;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import d6.g0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f34341c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f34342a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f34343b = -1;

    public final boolean a(String str) {
        Matcher matcher = f34341c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = g0.f27302a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f34342a = parseInt;
                    this.f34343b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(Metadata metadata) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f19997s;
            if (i10 < entryArr.length) {
                Metadata.Entry entry = entryArr[i10];
                if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    if ("iTunSMPB".equals(commentFrame.f20042u) && a(commentFrame.f20043v)) {
                        return;
                    }
                } else if (entry instanceof InternalFrame) {
                    InternalFrame internalFrame = (InternalFrame) entry;
                    if ("com.apple.iTunes".equals(internalFrame.f20049t) && "iTunSMPB".equals(internalFrame.f20050u) && a(internalFrame.f20051v)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
