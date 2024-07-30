package com.vungle.warren.model;

import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.HashUtility;
import java.io.IOException;
import java.io.StringWriter;
import m8.i;
import m8.n;
import m8.o;
import m8.q;

/* loaded from: classes2.dex */
public class SessionData {
    private static final i GSON = new i();
    private int sendAttempts;
    public SessionEvent sessionEvent;
    private q sessionEventJsonObject;

    /* loaded from: classes2.dex */
    public static class Builder {
        SessionEvent event;
        q jsonObject = new q();

        public Builder addData(SessionAttribute sessionAttribute, String str) {
            this.jsonObject.q(sessionAttribute.toString(), str);
            return this;
        }

        public SessionData build() {
            if (this.event != null) {
                return new SessionData(this.event, this.jsonObject);
            }
            throw new IllegalArgumentException("SessionData must have event");
        }

        public Builder setEvent(SessionEvent sessionEvent) {
            this.event = sessionEvent;
            this.jsonObject.q("event", sessionEvent.toString());
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, int i10) {
            this.jsonObject.p(sessionAttribute.toString(), Integer.valueOf(i10));
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, double d10) {
            this.jsonObject.p(sessionAttribute.toString(), Double.valueOf(d10));
            return this;
        }

        public Builder addData(SessionAttribute sessionAttribute, boolean z10) {
            this.jsonObject.o(sessionAttribute.toString(), Boolean.valueOf(z10));
            return this;
        }
    }

    public void addAttribute(SessionAttribute sessionAttribute, String str) {
        this.sessionEventJsonObject.q(sessionAttribute.toString(), str);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        if (!this.sessionEvent.equals(sessionData.sessionEvent) || !this.sessionEventJsonObject.equals(sessionData.sessionEventJsonObject)) {
            return false;
        }
        return true;
    }

    public String getAsJsonString() {
        i iVar = GSON;
        q qVar = this.sessionEventJsonObject;
        iVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            iVar.m(qVar, iVar.i(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new o(e10);
        }
    }

    public String getId() {
        String sha256 = HashUtility.sha256(getAsJsonString());
        if (sha256 == null) {
            return String.valueOf(getAsJsonString().hashCode());
        }
        return sha256;
    }

    public int getSendAttempts() {
        return this.sendAttempts;
    }

    public String getStringAttribute(SessionAttribute sessionAttribute) {
        n s10 = this.sessionEventJsonObject.s(sessionAttribute.toString());
        if (s10 != null) {
            return s10.m();
        }
        return null;
    }

    public int incrementSendAttempt() {
        int i10 = this.sendAttempts;
        this.sendAttempts = i10 + 1;
        return i10;
    }

    public void removeEvent(SessionAttribute sessionAttribute) {
        q qVar = this.sessionEventJsonObject;
        qVar.f32942s.remove(sessionAttribute.toString());
    }

    public SessionData(String str, int i10) {
        this.sessionEventJsonObject = (q) GSON.b(q.class, str);
        this.sendAttempts = i10;
    }

    private SessionData(SessionEvent sessionEvent, q qVar) {
        this.sessionEvent = sessionEvent;
        this.sessionEventJsonObject = qVar;
        qVar.p(SessionAttribute.TIMESTAMP.toString(), Long.valueOf(System.currentTimeMillis()));
    }
}
