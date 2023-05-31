package nl.suriani.dmexample.domain.shared;

import java.time.LocalDateTime;

public abstract class DomainEvent {
    private final LocalDateTime createdAt;

    public DomainEvent(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
