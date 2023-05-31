package nl.suriani.dmexample.domain;

public interface EventPublisher {
    void publish(DomainEvent event);
}
