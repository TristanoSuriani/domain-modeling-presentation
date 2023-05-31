package nl.suriani.dmexample.domain.shared;

public interface EventPublisher {
    void publish(DomainEvent event);
}
