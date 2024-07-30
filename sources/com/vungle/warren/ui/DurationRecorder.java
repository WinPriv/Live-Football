package com.vungle.warren.ui;

import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class DurationRecorder {
    private AtomicBoolean paused = new AtomicBoolean(true);
    private final Repository.SaveCallback repoCallback;
    private final Report report;
    private final Repository repository;
    private long startMillis;

    public DurationRecorder(Report report, Repository repository, Repository.SaveCallback saveCallback) {
        this.report = report;
        this.repository = repository;
        this.repoCallback = saveCallback;
    }

    private void save() {
        this.report.setAdDuration(System.currentTimeMillis() - this.startMillis);
        this.repository.save(this.report, this.repoCallback);
    }

    public void start() {
        if (this.paused.getAndSet(false)) {
            this.startMillis = System.currentTimeMillis() - this.report.getAdDuration();
        }
    }

    public void stop() {
        if (!this.paused.getAndSet(true)) {
            save();
        }
    }

    public void update() {
        if (!this.paused.get()) {
            save();
        }
    }
}
