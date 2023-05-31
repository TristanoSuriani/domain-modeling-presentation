package nl.suriani.dmexample.domain;

import java.time.LocalDateTime;

public abstract class DomainEvent {
    private final LocalDateTime createdAt;

    public DomainEvent(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
